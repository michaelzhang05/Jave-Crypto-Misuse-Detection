package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes3.dex */
final class MultiDexExtractor implements Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_CRC = "dex.crc.";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_DEX_TIME = "dex.time.";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MultiDexExtractor(File file, File file2) throws IOException {
        Log.i(TAG, "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, LOCK_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                Log.i(TAG, "Blocking on lock " + file3.getPath());
                this.cacheLock = channel.lock();
                Log.i(TAG, file3.getPath() + " locked");
            } catch (IOException e8) {
                e = e8;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (Error e9) {
                e = e9;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (RuntimeException e10) {
                e = e10;
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
            closeQuietly(this.lockRaf);
            throw e;
        } catch (Error e12) {
            e = e12;
            closeQuietly(this.lockRaf);
            throw e;
        } catch (RuntimeException e13) {
            e = e13;
            closeQuietly(this.lockRaf);
            throw e;
        }
    }

    private void clearDexDir() {
        File[] listFiles = this.dexDir.listFiles(new FileFilter() { // from class: androidx.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals(MultiDexExtractor.LOCK_FILENAME);
            }
        });
        if (listFiles == null) {
            Log.w(TAG, "Failed to list secondary dex dir content (" + this.dexDir.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i(TAG, "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w(TAG, "Failed to delete old file " + file.getPath());
            } else {
                Log.i(TAG, "Deleted old file " + file.getPath());
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e8) {
            Log.w(TAG, "Failed to close resource", e8);
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, EXTRACTED_SUFFIX, file.getParentFile());
        Log.i(TAG, "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Log.i(TAG, "Renaming to " + file.getPath());
                    if (createTempFile.renameTo(file)) {
                        closeQuietly(inputStream);
                        createTempFile.delete();
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            closeQuietly(inputStream);
            createTempFile.delete();
            throw th2;
        }
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, 4);
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static long getZipCrc(File file) throws IOException {
        long zipCrc = ZipUtil.getZipCrc(file);
        if (zipCrc == -1) {
            return zipCrc - 1;
        }
        return zipCrc;
    }

    private static boolean isModified(Context context, File file, long j8, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        if (multiDexPreferences.getLong(str + "timestamp", -1L) == getTimeStamp(file)) {
            if (multiDexPreferences.getLong(str + KEY_CRC, -1L) == j8) {
                return false;
            }
        }
        return true;
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) throws IOException {
        Log.i(TAG, "loading existing secondary dex files");
        String str2 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i8 = multiDexPreferences.getInt(str + KEY_DEX_NUMBER, 1);
        ArrayList arrayList = new ArrayList(i8 + (-1));
        int i9 = 2;
        while (i9 <= i8) {
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i9 + EXTRACTED_SUFFIX);
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                long j8 = multiDexPreferences.getLong(str + KEY_DEX_CRC + i9, -1L);
                long j9 = multiDexPreferences.getLong(str + KEY_DEX_TIME + i9, -1L);
                long lastModified = extractedDex.lastModified();
                if (j9 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = multiDexPreferences;
                    if (j8 == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i9++;
                        multiDexPreferences = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j9 + ", modification time: " + lastModified + ", expected crc: " + j8 + ", file crc: " + extractedDex.crc);
            }
            throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
        }
        return arrayList;
    }

    private List<ExtractedDex> performExtractions() throws IOException {
        boolean z8;
        String str;
        String str2 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.sourceApk);
        try {
            ZipEntry entry = zipFile.getEntry(DEX_PREFIX + 2 + DEX_SUFFIX);
            int i8 = 2;
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str2 + i8 + EXTRACTED_SUFFIX);
                arrayList.add(extractedDex);
                Log.i(TAG, "Extraction is needed for file " + extractedDex);
                int i9 = 0;
                boolean z9 = false;
                while (i9 < 3 && !z9) {
                    int i10 = i9 + 1;
                    extract(zipFile, entry, extractedDex, str2);
                    try {
                        extractedDex.crc = getZipCrc(extractedDex);
                        z8 = true;
                    } catch (IOException e8) {
                        Log.w(TAG, "Failed to read crc from " + extractedDex.getAbsolutePath(), e8);
                        z8 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    if (z8) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" '");
                    sb.append(extractedDex.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(extractedDex.length());
                    sb.append(" - crc: ");
                    sb.append(extractedDex.crc);
                    Log.i(TAG, sb.toString());
                    if (!z8) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w(TAG, "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                    z9 = z8;
                    i9 = i10;
                }
                if (z9) {
                    i8++;
                    entry = zipFile.getEntry(DEX_PREFIX + i8 + DEX_SUFFIX);
                } else {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i8 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e9) {
                Log.w(TAG, "Failed to close resource", e9);
            }
            return arrayList;
        } finally {
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j8, long j9, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong(str + "timestamp", j8);
        edit.putLong(str + KEY_CRC, j9);
        edit.putInt(str + KEY_DEX_NUMBER, list.size() + 1);
        int i8 = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + KEY_DEX_CRC + i8, extractedDex.crc);
            edit.putLong(str + KEY_DEX_TIME + i8, extractedDex.lastModified());
            i8++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends File> load(Context context, String str, boolean z8) throws IOException {
        List<ExtractedDex> performExtractions;
        List<ExtractedDex> list;
        Log.i(TAG, "MultiDexExtractor.load(" + this.sourceApk.getPath() + ", " + z8 + ", " + str + ")");
        if (this.cacheLock.isValid()) {
            if (!z8 && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
                try {
                    list = loadExistingExtractions(context, str);
                } catch (IOException e8) {
                    Log.w(TAG, "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e8);
                    performExtractions = performExtractions();
                    putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
                }
                Log.i(TAG, "load found " + list.size() + " secondary dex files");
                return list;
            }
            if (z8) {
                Log.i(TAG, "Forced extraction must be performed.");
            } else {
                Log.i(TAG, "Detected that extraction must be performed.");
            }
            performExtractions = performExtractions();
            putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
            list = performExtractions;
            Log.i(TAG, "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}