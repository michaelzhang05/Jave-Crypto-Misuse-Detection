package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(19)
/* loaded from: classes3.dex */
public class ProfileTranscoder {
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    static final byte[] MAGIC_PROF = {112, 114, 111, 0};
    static final byte[] MAGIC_PROFM = {112, 114, 109, 0};
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    private ProfileTranscoder() {
    }

    private static int computeMethodFlags(@NonNull DexProfileData dexProfileData) {
        Iterator<Map.Entry<Integer, Integer>> it = dexProfileData.methods.entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 |= it.next().getValue().intValue();
        }
        return i8;
    }

    @NonNull
    private static byte[] createCompressibleBody(@NonNull DexProfileData[] dexProfileDataArr, @NonNull byte[] bArr) throws IOException {
        int i8 = 0;
        int i9 = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            i9 += Encoding.utf8Length(generateDexKey(dexProfileData.apkName, dexProfileData.dexName, bArr)) + 16 + (dexProfileData.classSetSize * 2) + dexProfileData.hotMethodRegionSize + getMethodBitmapStorageSize(dexProfileData.numMethodIds);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, ProfileVersion.V009_O_MR1)) {
            int length = dexProfileDataArr.length;
            while (i8 < length) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i8];
                writeLineHeader(byteArrayOutputStream, dexProfileData2, generateDexKey(dexProfileData2.apkName, dexProfileData2.dexName, bArr));
                writeLineData(byteArrayOutputStream, dexProfileData2);
                i8++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                writeLineHeader(byteArrayOutputStream, dexProfileData3, generateDexKey(dexProfileData3.apkName, dexProfileData3.dexName, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i8 < length2) {
                writeLineData(byteArrayOutputStream, dexProfileDataArr[i8]);
                i8++;
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw Encoding.error("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
    }

    private static WritableFileSection createCompressibleClassSection(@NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < dexProfileDataArr.length; i9++) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i9];
                Encoding.writeUInt16(byteArrayOutputStream, i9);
                Encoding.writeUInt16(byteArrayOutputStream, dexProfileData.classSetSize);
                i8 = i8 + 4 + (dexProfileData.classSetSize * 2);
                writeClasses(byteArrayOutputStream, dexProfileData);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.CLASSES, i8, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.error("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    private static WritableFileSection createCompressibleMethodsSection(@NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < dexProfileDataArr.length; i9++) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i9];
                int computeMethodFlags = computeMethodFlags(dexProfileData);
                byte[] createMethodBitmapRegion = createMethodBitmapRegion(dexProfileData);
                byte[] createMethodsWithInlineCaches = createMethodsWithInlineCaches(dexProfileData);
                Encoding.writeUInt16(byteArrayOutputStream, i9);
                int length = createMethodBitmapRegion.length + 2 + createMethodsWithInlineCaches.length;
                Encoding.writeUInt32(byteArrayOutputStream, length);
                Encoding.writeUInt16(byteArrayOutputStream, computeMethodFlags);
                byteArrayOutputStream.write(createMethodBitmapRegion);
                byteArrayOutputStream.write(createMethodsWithInlineCaches);
                i8 = i8 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.METHODS, i8, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.error("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] createMethodBitmapRegion(@NonNull DexProfileData dexProfileData) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeMethodBitmap(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] createMethodsWithInlineCaches(@NonNull DexProfileData dexProfileData) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeMethodsWithInlineCaches(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    private static String enforceSeparator(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    @NonNull
    private static String extractKey(@NonNull String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    @Nullable
    private static DexProfileData findByDexName(@NonNull DexProfileData[] dexProfileDataArr, @NonNull String str) {
        if (dexProfileDataArr.length <= 0) {
            return null;
        }
        String extractKey = extractKey(str);
        for (int i8 = 0; i8 < dexProfileDataArr.length; i8++) {
            if (dexProfileDataArr[i8].dexName.equals(extractKey)) {
                return dexProfileDataArr[i8];
            }
        }
        return null;
    }

    @NonNull
    private static String generateDexKey(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String dexKeySeparator = ProfileVersion.dexKeySeparator(bArr);
        if (str.length() <= 0) {
            return enforceSeparator(str2, dexKeySeparator);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + ProfileVersion.dexKeySeparator(bArr) + str2;
        }
        return enforceSeparator(str2, dexKeySeparator);
    }

    private static int getMethodBitmapStorageSize(int i8) {
        return roundUpToByte(i8 * 2) / 8;
    }

    private static int methodFlagBitmapIndex(int i8, int i9, int i10) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 4) {
                    return i9 + i10;
                }
                throw Encoding.error("Unexpected flag: " + i8);
            }
            return i9;
        }
        throw Encoding.error("HOT methods are not stored in the bitmap");
    }

    private static int[] readClasses(@NonNull InputStream inputStream, int i8) throws IOException {
        int[] iArr = new int[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += Encoding.readUInt16(inputStream);
            iArr[i10] = i9;
        }
        return iArr;
    }

    private static int readFlagsFromBitmap(@NonNull BitSet bitSet, int i8, int i9) {
        int i10 = 2;
        if (!bitSet.get(methodFlagBitmapIndex(2, i8, i9))) {
            i10 = 0;
        }
        if (bitSet.get(methodFlagBitmapIndex(4, i8, i9))) {
            return i10 | 4;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] readHeader(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, Encoding.read(inputStream, bArr.length))) {
            return Encoding.read(inputStream, ProfileVersion.V010_P.length);
        }
        throw Encoding.error("Invalid magic");
    }

    private static void readHotMethodRegion(@NonNull InputStream inputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        int available = inputStream.available() - dexProfileData.hotMethodRegionSize;
        int i8 = 0;
        while (inputStream.available() > available) {
            i8 += Encoding.readUInt16(inputStream);
            dexProfileData.methods.put(Integer.valueOf(i8), 1);
            for (int readUInt16 = Encoding.readUInt16(inputStream); readUInt16 > 0; readUInt16--) {
                skipInlineCache(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw Encoding.error("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static DexProfileData[] readMeta(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, DexProfileData[] dexProfileDataArr) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.METADATA_V001_N)) {
            if (!Arrays.equals(ProfileVersion.V015_S, bArr2)) {
                return readMetadata001(inputStream, bArr, dexProfileDataArr);
            }
            throw Encoding.error("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, ProfileVersion.METADATA_V002)) {
            return readMetadataV002(inputStream, bArr2, dexProfileDataArr);
        }
        throw Encoding.error("Unsupported meta version");
    }

    @NonNull
    static DexProfileData[] readMetadata001(@NonNull InputStream inputStream, @NonNull byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.METADATA_V001_N)) {
            int readUInt8 = Encoding.readUInt8(inputStream);
            byte[] readCompressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
                try {
                    DexProfileData[] readMetadataForNBody = readMetadataForNBody(byteArrayInputStream, readUInt8, dexProfileDataArr);
                    byteArrayInputStream.close();
                    return readMetadataForNBody;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw Encoding.error("Content found after the end of file");
        }
        throw Encoding.error("Unsupported meta version");
    }

    @NonNull
    private static DexProfileData[] readMetadataForNBody(@NonNull InputStream inputStream, int i8, DexProfileData[] dexProfileDataArr) throws IOException {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i8 == dexProfileDataArr.length) {
            String[] strArr = new String[i8];
            int[] iArr = new int[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                int readUInt16 = Encoding.readUInt16(inputStream);
                iArr[i9] = Encoding.readUInt16(inputStream);
                strArr[i9] = Encoding.readString(inputStream, readUInt16);
            }
            for (int i10 = 0; i10 < i8; i10++) {
                DexProfileData dexProfileData = dexProfileDataArr[i10];
                if (dexProfileData.dexName.equals(strArr[i10])) {
                    int i11 = iArr[i10];
                    dexProfileData.classSetSize = i11;
                    dexProfileData.classes = readClasses(inputStream, i11);
                } else {
                    throw Encoding.error("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dexProfileDataArr;
        }
        throw Encoding.error("Mismatched number of dex files found in metadata");
    }

    @NonNull
    static DexProfileData[] readMetadataV002(@NonNull InputStream inputStream, @NonNull byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        int readUInt16 = Encoding.readUInt16(inputStream);
        byte[] readCompressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
            try {
                DexProfileData[] readMetadataV002Body = readMetadataV002Body(byteArrayInputStream, bArr, readUInt16, dexProfileDataArr);
                byteArrayInputStream.close();
                return readMetadataV002Body;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw Encoding.error("Content found after the end of file");
    }

    @NonNull
    private static DexProfileData[] readMetadataV002Body(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i8, DexProfileData[] dexProfileDataArr) throws IOException {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i8 == dexProfileDataArr.length) {
            for (int i9 = 0; i9 < i8; i9++) {
                Encoding.readUInt16(inputStream);
                String readString = Encoding.readString(inputStream, Encoding.readUInt16(inputStream));
                long readUInt32 = Encoding.readUInt32(inputStream);
                int readUInt16 = Encoding.readUInt16(inputStream);
                DexProfileData findByDexName = findByDexName(dexProfileDataArr, readString);
                if (findByDexName != null) {
                    findByDexName.mTypeIdCount = readUInt32;
                    int[] readClasses = readClasses(inputStream, readUInt16);
                    if (Arrays.equals(bArr, ProfileVersion.V001_N)) {
                        findByDexName.classSetSize = readUInt16;
                        findByDexName.classes = readClasses;
                    }
                } else {
                    throw Encoding.error("Missing profile key: " + readString);
                }
            }
            return dexProfileDataArr;
        }
        throw Encoding.error("Mismatched number of dex files found in metadata");
    }

    private static void readMethodBitmap(@NonNull InputStream inputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        BitSet valueOf = BitSet.valueOf(Encoding.read(inputStream, Encoding.bitsToBytes(dexProfileData.numMethodIds * 2)));
        int i8 = 0;
        while (true) {
            int i9 = dexProfileData.numMethodIds;
            if (i8 < i9) {
                int readFlagsFromBitmap = readFlagsFromBitmap(valueOf, i8, i9);
                if (readFlagsFromBitmap != 0) {
                    Integer num = dexProfileData.methods.get(Integer.valueOf(i8));
                    if (num == null) {
                        num = 0;
                    }
                    dexProfileData.methods.put(Integer.valueOf(i8), Integer.valueOf(readFlagsFromBitmap | num.intValue()));
                }
                i8++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static DexProfileData[] readProfile(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.V010_P)) {
            int readUInt8 = Encoding.readUInt8(inputStream);
            byte[] readCompressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
                try {
                    DexProfileData[] readUncompressedBody = readUncompressedBody(byteArrayInputStream, str, readUInt8);
                    byteArrayInputStream.close();
                    return readUncompressedBody;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw Encoding.error("Content found after the end of file");
        }
        throw Encoding.error("Unsupported version");
    }

    @NonNull
    private static DexProfileData[] readUncompressedBody(@NonNull InputStream inputStream, @NonNull String str, int i8) throws IOException {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int readUInt16 = Encoding.readUInt16(inputStream);
            int readUInt162 = Encoding.readUInt16(inputStream);
            long readUInt32 = Encoding.readUInt32(inputStream);
            dexProfileDataArr[i9] = new DexProfileData(str, Encoding.readString(inputStream, readUInt16), Encoding.readUInt32(inputStream), 0L, readUInt162, (int) readUInt32, (int) Encoding.readUInt32(inputStream), new int[readUInt162], new TreeMap());
        }
        for (int i10 = 0; i10 < i8; i10++) {
            DexProfileData dexProfileData = dexProfileDataArr[i10];
            readHotMethodRegion(inputStream, dexProfileData);
            dexProfileData.classes = readClasses(inputStream, dexProfileData.classSetSize);
            readMethodBitmap(inputStream, dexProfileData);
        }
        return dexProfileDataArr;
    }

    private static int roundUpToByte(int i8) {
        return (i8 + 7) & (-8);
    }

    private static void setMethodBitmapBit(@NonNull byte[] bArr, int i8, int i9, @NonNull DexProfileData dexProfileData) {
        int methodFlagBitmapIndex = methodFlagBitmapIndex(i8, i9, dexProfileData.numMethodIds);
        int i10 = methodFlagBitmapIndex / 8;
        bArr[i10] = (byte) ((1 << (methodFlagBitmapIndex % 8)) | bArr[i10]);
    }

    private static void skipInlineCache(@NonNull InputStream inputStream) throws IOException {
        Encoding.readUInt16(inputStream);
        int readUInt8 = Encoding.readUInt8(inputStream);
        if (readUInt8 == 6 || readUInt8 == 7) {
            return;
        }
        while (readUInt8 > 0) {
            Encoding.readUInt8(inputStream);
            for (int readUInt82 = Encoding.readUInt8(inputStream); readUInt82 > 0; readUInt82--) {
                Encoding.readUInt16(inputStream);
            }
            readUInt8--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean transcodeAndWriteBody(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.V015_S)) {
            writeProfileForS(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.V010_P)) {
            writeProfileForP(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.V005_O)) {
            writeProfileForO(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.V009_O_MR1)) {
            writeProfileForO_MR1(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.V001_N)) {
            writeProfileForN(outputStream, dexProfileDataArr);
            return true;
        }
        return false;
    }

    private static void writeClasses(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        int[] iArr = dexProfileData.classes;
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            Encoding.writeUInt16(outputStream, i10 - i9);
            i8++;
            i9 = i10;
        }
    }

    private static WritableFileSection writeDexFileSection(@NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Encoding.writeUInt16(byteArrayOutputStream, dexProfileDataArr.length);
            int i8 = 2;
            for (DexProfileData dexProfileData : dexProfileDataArr) {
                Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.dexChecksum);
                Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.mTypeIdCount);
                Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.numMethodIds);
                String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V015_S);
                int utf8Length = Encoding.utf8Length(generateDexKey);
                Encoding.writeUInt16(byteArrayOutputStream, utf8Length);
                i8 = i8 + 14 + utf8Length;
                Encoding.writeString(byteArrayOutputStream, generateDexKey);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i8 == byteArray.length) {
                WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, i8, byteArray, false);
                byteArrayOutputStream.close();
                return writableFileSection;
            }
            throw Encoding.error("Expected size " + i8 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeHeader(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(MAGIC_PROF);
        outputStream.write(bArr);
    }

    private static void writeLineData(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        writeMethodsWithInlineCaches(outputStream, dexProfileData);
        writeClasses(outputStream, dexProfileData);
        writeMethodBitmap(outputStream, dexProfileData);
    }

    private static void writeLineHeader(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData, @NonNull String str) throws IOException {
        Encoding.writeUInt16(outputStream, Encoding.utf8Length(str));
        Encoding.writeUInt16(outputStream, dexProfileData.classSetSize);
        Encoding.writeUInt32(outputStream, dexProfileData.hotMethodRegionSize);
        Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
        Encoding.writeUInt32(outputStream, dexProfileData.numMethodIds);
        Encoding.writeString(outputStream, str);
    }

    private static void writeMethodBitmap(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        byte[] bArr = new byte[getMethodBitmapStorageSize(dexProfileData.numMethodIds)];
        for (Map.Entry<Integer, Integer> entry : dexProfileData.methods.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                setMethodBitmapBit(bArr, 2, intValue, dexProfileData);
            }
            if ((intValue2 & 4) != 0) {
                setMethodBitmapBit(bArr, 4, intValue, dexProfileData);
            }
        }
        outputStream.write(bArr);
    }

    private static void writeMethodsWithInlineCaches(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) throws IOException {
        int i8 = 0;
        for (Map.Entry<Integer, Integer> entry : dexProfileData.methods.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                Encoding.writeUInt16(outputStream, intValue - i8);
                Encoding.writeUInt16(outputStream, 0);
                i8 = intValue;
            }
        }
    }

    private static void writeProfileForN(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        Encoding.writeUInt16(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V001_N);
            Encoding.writeUInt16(outputStream, Encoding.utf8Length(generateDexKey));
            Encoding.writeUInt16(outputStream, dexProfileData.methods.size());
            Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            Encoding.writeString(outputStream, generateDexKey);
            Iterator<Integer> it = dexProfileData.methods.keySet().iterator();
            while (it.hasNext()) {
                Encoding.writeUInt16(outputStream, it.next().intValue());
            }
            for (int i8 : dexProfileData.classes) {
                Encoding.writeUInt16(outputStream, i8);
            }
        }
    }

    private static void writeProfileForO(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            int size = dexProfileData.methods.size() * 4;
            String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V005_O);
            Encoding.writeUInt16(outputStream, Encoding.utf8Length(generateDexKey));
            Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            Encoding.writeUInt32(outputStream, size);
            Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            Encoding.writeString(outputStream, generateDexKey);
            Iterator<Integer> it = dexProfileData.methods.keySet().iterator();
            while (it.hasNext()) {
                Encoding.writeUInt16(outputStream, it.next().intValue());
                Encoding.writeUInt16(outputStream, 0);
            }
            for (int i8 : dexProfileData.classes) {
                Encoding.writeUInt16(outputStream, i8);
            }
        }
    }

    private static void writeProfileForO_MR1(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, ProfileVersion.V009_O_MR1);
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        Encoding.writeCompressed(outputStream, createCompressibleBody);
    }

    private static void writeProfileForP(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, ProfileVersion.V010_P);
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        Encoding.writeCompressed(outputStream, createCompressibleBody);
    }

    private static void writeProfileForS(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        writeProfileSections(outputStream, dexProfileDataArr);
    }

    private static void writeProfileSections(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(writeDexFileSection(dexProfileDataArr));
        arrayList.add(createCompressibleClassSection(dexProfileDataArr));
        arrayList.add(createCompressibleMethodsSection(dexProfileDataArr));
        long length2 = ProfileVersion.V015_S.length + MAGIC_PROF.length + 4 + (arrayList.size() * 16);
        Encoding.writeUInt32(outputStream, arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            WritableFileSection writableFileSection = (WritableFileSection) arrayList.get(i8);
            Encoding.writeUInt32(outputStream, writableFileSection.mType.getValue());
            Encoding.writeUInt32(outputStream, length2);
            if (writableFileSection.mNeedsCompression) {
                byte[] bArr = writableFileSection.mContents;
                long length3 = bArr.length;
                byte[] compress = Encoding.compress(bArr);
                arrayList2.add(compress);
                Encoding.writeUInt32(outputStream, compress.length);
                Encoding.writeUInt32(outputStream, length3);
                length = compress.length;
            } else {
                arrayList2.add(writableFileSection.mContents);
                Encoding.writeUInt32(outputStream, writableFileSection.mContents.length);
                Encoding.writeUInt32(outputStream, 0L);
                length = writableFileSection.mContents.length;
            }
            length2 += length;
        }
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            outputStream.write((byte[]) arrayList2.get(i9));
        }
    }
}
