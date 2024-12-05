package c.n;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import cm.aptoide.pt.utils.MultiDexHelper;
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
import okhttp3.internal.http2.Http2;

/* compiled from: MultiDexExtractor.java */
/* loaded from: classes.dex */
final class b implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final File f2826f;

    /* renamed from: g, reason: collision with root package name */
    private final long f2827g;

    /* renamed from: h, reason: collision with root package name */
    private final File f2828h;

    /* renamed from: i, reason: collision with root package name */
    private final RandomAccessFile f2829i;

    /* renamed from: j, reason: collision with root package name */
    private final FileChannel f2830j;

    /* renamed from: k, reason: collision with root package name */
    private final FileLock f2831k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultiDexExtractor.java */
    /* loaded from: classes.dex */
    public class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MultiDexExtractor.java */
    /* renamed from: c.n.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0074b extends File {

        /* renamed from: f, reason: collision with root package name */
        public long f2832f;

        public C0074b(File file, String str) {
            super(file, str);
            this.f2832f = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f2826f = file;
        this.f2828h = file2;
        this.f2827g = z(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f2829i = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f2830j = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f2831k = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                b(this.f2830j);
                throw e;
            } catch (Error e3) {
                e = e3;
                b(this.f2830j);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                b(this.f2830j);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            b(this.f2829i);
            throw e5;
        }
    }

    private static boolean D(Context context, File file, long j2, String str) {
        SharedPreferences o = o(context);
        if (o.getLong(str + "timestamp", -1L) == w(file)) {
            if (o.getLong(str + "crc", -1L) == j2) {
                return false;
            }
        }
        return true;
    }

    private List<C0074b> L(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f2826f.getName() + ".classes";
        SharedPreferences o = o(context);
        int i2 = o.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 + (-1));
        int i3 = 2;
        while (i3 <= i2) {
            C0074b c0074b = new C0074b(this.f2828h, str2 + i3 + MultiDexHelper.EXTRACTED_SUFFIX);
            if (c0074b.isFile()) {
                c0074b.f2832f = z(c0074b);
                long j2 = o.getLong(str + "dex.crc." + i3, -1L);
                long j3 = o.getLong(str + "dex.time." + i3, -1L);
                long lastModified = c0074b.lastModified();
                if (j3 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = o;
                    if (j2 == c0074b.f2832f) {
                        arrayList.add(c0074b);
                        i3++;
                        o = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException("Invalid extracted dex: " + c0074b + " (key \"" + str + "\"), expected modification time: " + j3 + ", modification time: " + lastModified + ", expected crc: " + j2 + ", file crc: " + c0074b.f2832f);
            }
            throw new IOException("Missing extracted secondary dex file '" + c0074b.getPath() + "'");
        }
        return arrayList;
    }

    private List<C0074b> P() throws IOException {
        boolean z;
        String str = this.f2826f.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f2826f);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i2 = 2;
            while (entry != null) {
                C0074b c0074b = new C0074b(this.f2828h, str + i2 + MultiDexHelper.EXTRACTED_SUFFIX);
                arrayList.add(c0074b);
                Log.i("MultiDex", "Extraction is needed for file " + c0074b);
                int i3 = 0;
                boolean z2 = false;
                while (i3 < 3 && !z2) {
                    int i4 = i3 + 1;
                    f(zipFile, entry, c0074b, str);
                    try {
                        c0074b.f2832f = z(c0074b);
                        z = true;
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to read crc from " + c0074b.getAbsolutePath(), e2);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(c0074b.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(c0074b.length());
                    sb.append(" - crc: ");
                    sb.append(c0074b.f2832f);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        c0074b.delete();
                        if (c0074b.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + c0074b.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i3 = i4;
                }
                if (z2) {
                    i2++;
                    entry = zipFile.getEntry("classes" + i2 + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + c0074b.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            return arrayList;
        } finally {
        }
    }

    private static void T(Context context, String str, long j2, long j3, List<C0074b> list) {
        SharedPreferences.Editor edit = o(context).edit();
        edit.putLong(str + "timestamp", j2);
        edit.putLong(str + "crc", j3);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (C0074b c0074b : list) {
            edit.putLong(str + "dex.crc." + i2, c0074b.f2832f);
            edit.putLong(str + "dex.time." + i2, c0074b.lastModified());
            i2++;
        }
        edit.commit();
    }

    private void a() {
        File[] listFiles = this.f2828h.listFiles(new a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f2828h.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    private static void f(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, MultiDexHelper.EXTRACTED_SUFFIX, file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Log.i("MultiDex", "Renaming to " + file.getPath());
                    if (createTempFile.renameTo(file)) {
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            b(inputStream);
            createTempFile.delete();
        }
    }

    private static SharedPreferences o(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static long w(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long z(File file) throws IOException {
        long c2 = c.c(file);
        return c2 == -1 ? c2 - 1 : c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends File> J(Context context, String str, boolean z) throws IOException {
        List<C0074b> P;
        List<C0074b> list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f2826f.getPath() + ", " + z + ", " + str + ")");
        if (this.f2831k.isValid()) {
            if (!z && !D(context, this.f2826f, this.f2827g, str)) {
                try {
                    list = L(context, str);
                } catch (IOException e2) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                    P = P();
                    T(context, str, w(this.f2826f), this.f2827g, P);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            if (z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            P = P();
            T(context, str, w(this.f2826f), this.f2827g, P);
            list = P;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2831k.release();
        this.f2830j.close();
        this.f2829i.close();
    }
}
