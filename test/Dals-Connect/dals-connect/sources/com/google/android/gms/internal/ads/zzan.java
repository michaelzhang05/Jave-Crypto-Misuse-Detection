package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class zzan implements zzb {
    private final Map<String, v2> a;

    /* renamed from: b, reason: collision with root package name */
    private long f12814b;

    /* renamed from: c, reason: collision with root package name */
    private final File f12815c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12816d;

    public zzan(File file, int i2) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.f12814b = 0L;
        this.f12815c = file;
        this.f12816d = i2;
    }

    private final synchronized void a(String str) {
        boolean delete = o(str).delete();
        b(str);
        if (!delete) {
            zzag.a("Could not delete cache entry for key=%s, filename=%s", str, n(str));
        }
    }

    private final void b(String str) {
        v2 remove = this.a.remove(str);
        if (remove != null) {
            this.f12814b -= remove.a;
        }
    }

    private static int c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static InputStream d(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(y2 y2Var) throws IOException {
        return new String(j(y2Var, m(y2Var)), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(OutputStream outputStream, int i2) throws IOException {
        outputStream.write(i2 & 255);
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((i2 >> 16) & 255);
        outputStream.write(i2 >>> 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) j2);
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        g(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void i(String str, v2 v2Var) {
        if (!this.a.containsKey(str)) {
            this.f12814b += v2Var.a;
        } else {
            this.f12814b += v2Var.a - this.a.get(str).a;
        }
        this.a.put(str, v2Var);
    }

    private static byte[] j(y2 y2Var, long j2) throws IOException {
        long a = y2Var.a();
        if (j2 >= 0 && j2 <= a) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(y2Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j2);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(InputStream inputStream) throws IOException {
        return (c(inputStream) << 24) | c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<zzl> l(y2 y2Var) throws IOException {
        int k2 = k(y2Var);
        if (k2 >= 0) {
            List<zzl> emptyList = k2 == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i2 = 0; i2 < k2; i2++) {
                emptyList.add(new zzl(e(y2Var).intern(), e(y2Var).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(k2);
        throw new IOException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long m(InputStream inputStream) throws IOException {
        return (c(inputStream) & 255) | 0 | ((c(inputStream) & 255) << 8) | ((c(inputStream) & 255) << 16) | ((c(inputStream) & 255) << 24) | ((c(inputStream) & 255) << 32) | ((c(inputStream) & 255) << 40) | ((c(inputStream) & 255) << 48) | ((255 & c(inputStream)) << 56);
    }

    private static String n(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File o(String str) {
        return new File(this.f12815c, n(str));
    }

    @Override // com.google.android.gms.internal.ads.zzb
    public final synchronized void f0() {
        long length;
        y2 y2Var;
        if (!this.f12815c.exists()) {
            if (!this.f12815c.mkdirs()) {
                zzag.b("Unable to create cache dir %s", this.f12815c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f12815c.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                y2Var = new y2(new BufferedInputStream(d(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                v2 b2 = v2.b(y2Var);
                b2.a = length;
                i(b2.f12254b, b2);
                y2Var.close();
            } catch (Throwable th) {
                y2Var.close();
                throw th;
                break;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzb
    public final synchronized zzc g0(String str) {
        v2 v2Var = this.a.get(str);
        if (v2Var == null) {
            return null;
        }
        File o = o(str);
        try {
            y2 y2Var = new y2(new BufferedInputStream(d(o)), o.length());
            try {
                v2 b2 = v2.b(y2Var);
                if (!TextUtils.equals(str, b2.f12254b)) {
                    zzag.a("%s: key=%s, found=%s", o.getAbsolutePath(), str, b2.f12254b);
                    b(str);
                    return null;
                }
                byte[] j2 = j(y2Var, y2Var.a());
                zzc zzcVar = new zzc();
                zzcVar.a = j2;
                zzcVar.f13770b = v2Var.f12255c;
                zzcVar.f13771c = v2Var.f12256d;
                zzcVar.f13772d = v2Var.f12257e;
                zzcVar.f13773e = v2Var.f12258f;
                zzcVar.f13774f = v2Var.f12259g;
                List<zzl> list = v2Var.f12260h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzl zzlVar : list) {
                    treeMap.put(zzlVar.a(), zzlVar.b());
                }
                zzcVar.f13775g = treeMap;
                zzcVar.f13776h = Collections.unmodifiableList(v2Var.f12260h);
                return zzcVar;
            } finally {
                y2Var.close();
            }
        } catch (IOException e2) {
            zzag.a("%s: %s", o.getAbsolutePath(), e2.toString());
            a(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzb
    public final synchronized void h0(String str, zzc zzcVar) {
        long j2;
        long j3 = this.f12814b;
        byte[] bArr = zzcVar.a;
        long length = j3 + bArr.length;
        int i2 = this.f12816d;
        if (length <= i2 || bArr.length <= i2 * 0.9f) {
            File o = o(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(o));
                v2 v2Var = new v2(str, zzcVar);
                if (v2Var.a(bufferedOutputStream)) {
                    bufferedOutputStream.write(zzcVar.a);
                    bufferedOutputStream.close();
                    v2Var.a = o.length();
                    i(str, v2Var);
                    if (this.f12814b >= this.f12816d) {
                        if (zzag.f12695b) {
                            zzag.c("Pruning old cache entries.", new Object[0]);
                        }
                        long j4 = this.f12814b;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator<Map.Entry<String, v2>> it = this.a.entrySet().iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                j2 = elapsedRealtime;
                                break;
                            }
                            v2 value = it.next().getValue();
                            if (o(value.f12254b).delete()) {
                                j2 = elapsedRealtime;
                                this.f12814b -= value.a;
                            } else {
                                j2 = elapsedRealtime;
                                String str2 = value.f12254b;
                                zzag.a("Could not delete cache entry for key=%s, filename=%s", str2, n(str2));
                            }
                            it.remove();
                            i3++;
                            if (((float) this.f12814b) < this.f12816d * 0.9f) {
                                break;
                            } else {
                                elapsedRealtime = j2;
                            }
                        }
                        if (zzag.f12695b) {
                            zzag.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.f12814b - j4), Long.valueOf(SystemClock.elapsedRealtime() - j2));
                        }
                    }
                    return;
                }
                bufferedOutputStream.close();
                zzag.a("Failed to write header for %s", o.getAbsolutePath());
                throw new IOException();
            } catch (IOException unused) {
                if (o.delete()) {
                    return;
                }
                zzag.a("Could not clean up file %s", o.getAbsolutePath());
            }
        }
    }

    public zzan(File file) {
        this(file, 5242880);
    }
}
