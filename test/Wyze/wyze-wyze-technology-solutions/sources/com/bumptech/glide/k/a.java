package com.bumptech.glide.k;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final File f8367f;

    /* renamed from: g, reason: collision with root package name */
    private final File f8368g;

    /* renamed from: h, reason: collision with root package name */
    private final File f8369h;

    /* renamed from: i, reason: collision with root package name */
    private final File f8370i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8371j;

    /* renamed from: k, reason: collision with root package name */
    private long f8372k;
    private final int l;
    private Writer n;
    private int p;
    private long m = 0;
    private final LinkedHashMap<String, d> o = new LinkedHashMap<>(0, 0.75f, true);
    private long q = 0;
    final ThreadPoolExecutor r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> s = new CallableC0104a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.k.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0104a implements Callable<Void> {
        CallableC0104a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.n == null) {
                    return null;
                }
                a.this.y0();
                if (a.this.k0()) {
                    a.this.v0();
                    a.this.p = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0104a callableC0104a) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class c {
        private final d a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f8374b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8375c;

        /* synthetic */ c(a aVar, d dVar, CallableC0104a callableC0104a) {
            this(dVar);
        }

        public void a() throws IOException {
            a.this.P(this, false);
        }

        public void b() {
            if (this.f8375c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            a.this.P(this, true);
            this.f8375c = true;
        }

        public File f(int i2) throws IOException {
            File k2;
            synchronized (a.this) {
                if (this.a.f8381f == this) {
                    if (!this.a.f8380e) {
                        this.f8374b[i2] = true;
                    }
                    k2 = this.a.k(i2);
                    if (!a.this.f8367f.exists()) {
                        a.this.f8367f.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k2;
        }

        private c(d dVar) {
            this.a = dVar;
            this.f8374b = dVar.f8380e ? null : new boolean[a.this.l];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class d {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f8377b;

        /* renamed from: c, reason: collision with root package name */
        File[] f8378c;

        /* renamed from: d, reason: collision with root package name */
        File[] f8379d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8380e;

        /* renamed from: f, reason: collision with root package name */
        private c f8381f;

        /* renamed from: g, reason: collision with root package name */
        private long f8382g;

        /* synthetic */ d(a aVar, String str, CallableC0104a callableC0104a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length == a.this.l) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    try {
                        this.f8377b[i2] = Long.parseLong(strArr[i2]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i2) {
            return this.f8378c[i2];
        }

        public File k(int i2) {
            return this.f8379d[i2];
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f8377b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        private d(String str) {
            this.a = str;
            this.f8377b = new long[a.this.l];
            this.f8378c = new File[a.this.l];
            this.f8379d = new File[a.this.l];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < a.this.l; i2++) {
                sb.append(i2);
                this.f8378c[i2] = new File(a.this.f8367f, sb.toString());
                sb.append(".tmp");
                this.f8379d[i2] = new File(a.this.f8367f, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class e {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final long f8384b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f8385c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f8386d;

        /* synthetic */ e(a aVar, String str, long j2, File[] fileArr, long[] jArr, CallableC0104a callableC0104a) {
            this(str, j2, fileArr, jArr);
        }

        public File a(int i2) {
            return this.f8386d[i2];
        }

        private e(String str, long j2, File[] fileArr, long[] jArr) {
            this.a = str;
            this.f8384b = j2;
            this.f8386d = fileArr;
            this.f8385c = jArr;
        }
    }

    private a(File file, int i2, int i3, long j2) {
        this.f8367f = file;
        this.f8371j = i2;
        this.f8368g = new File(file, "journal");
        this.f8369h = new File(file, "journal.tmp");
        this.f8370i = new File(file, "journal.bkp");
        this.l = i3;
        this.f8372k = j2;
    }

    private void L() {
        if (this.n == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void P(c cVar, boolean z) throws IOException {
        d dVar = cVar.a;
        if (dVar.f8381f == cVar) {
            if (z && !dVar.f8380e) {
                for (int i2 = 0; i2 < this.l; i2++) {
                    if (cVar.f8374b[i2]) {
                        if (!dVar.k(i2).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            for (int i3 = 0; i3 < this.l; i3++) {
                File k2 = dVar.k(i3);
                if (z) {
                    if (k2.exists()) {
                        File j2 = dVar.j(i3);
                        k2.renameTo(j2);
                        long j3 = dVar.f8377b[i3];
                        long length = j2.length();
                        dVar.f8377b[i3] = length;
                        this.m = (this.m - j3) + length;
                    }
                } else {
                    Y(k2);
                }
            }
            this.p++;
            dVar.f8381f = null;
            if (dVar.f8380e | z) {
                dVar.f8380e = true;
                this.n.append((CharSequence) "CLEAN");
                this.n.append(' ');
                this.n.append((CharSequence) dVar.a);
                this.n.append((CharSequence) dVar.l());
                this.n.append('\n');
                if (z) {
                    long j4 = this.q;
                    this.q = 1 + j4;
                    dVar.f8382g = j4;
                }
            } else {
                this.o.remove(dVar.a);
                this.n.append((CharSequence) "REMOVE");
                this.n.append(' ');
                this.n.append((CharSequence) dVar.a);
                this.n.append('\n');
            }
            this.n.flush();
            if (this.m > this.f8372k || k0()) {
                this.r.submit(this.s);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static void Y(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c g0(String str, long j2) throws IOException {
        L();
        d dVar = this.o.get(str);
        CallableC0104a callableC0104a = null;
        if (j2 != -1 && (dVar == null || dVar.f8382g != j2)) {
            return null;
        }
        if (dVar != null) {
            if (dVar.f8381f != null) {
                return null;
            }
        } else {
            dVar = new d(this, str, callableC0104a);
            this.o.put(str, dVar);
        }
        c cVar = new c(this, dVar, callableC0104a);
        dVar.f8381f = cVar;
        this.n.append((CharSequence) "DIRTY");
        this.n.append(' ');
        this.n.append((CharSequence) str);
        this.n.append('\n');
        this.n.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k0() {
        int i2 = this.p;
        return i2 >= 2000 && i2 >= this.o.size();
    }

    public static a q0(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    x0(file2, file3, false);
                }
            }
            a aVar = new a(file, i2, i3, j2);
            if (aVar.f8368g.exists()) {
                try {
                    aVar.t0();
                    aVar.s0();
                    return aVar;
                } catch (IOException e2) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    aVar.T();
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, i2, i3, j2);
            aVar2.v0();
            return aVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    private void s0() throws IOException {
        Y(this.f8369h);
        Iterator<d> it = this.o.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f8381f != null) {
                next.f8381f = null;
                while (i2 < this.l) {
                    Y(next.j(i2));
                    Y(next.k(i2));
                    i2++;
                }
                it.remove();
            } else {
                while (i2 < this.l) {
                    this.m += next.f8377b[i2];
                    i2++;
                }
            }
        }
    }

    private void t0() throws IOException {
        com.bumptech.glide.k.b bVar = new com.bumptech.glide.k.b(new FileInputStream(this.f8368g), com.bumptech.glide.k.c.a);
        try {
            String o = bVar.o();
            String o2 = bVar.o();
            String o3 = bVar.o();
            String o4 = bVar.o();
            String o5 = bVar.o();
            if (!"libcore.io.DiskLruCache".equals(o) || !"1".equals(o2) || !Integer.toString(this.f8371j).equals(o3) || !Integer.toString(this.l).equals(o4) || !HttpUrl.FRAGMENT_ENCODE_SET.equals(o5)) {
                throw new IOException("unexpected journal header: [" + o + ", " + o2 + ", " + o4 + ", " + o5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    u0(bVar.o());
                    i2++;
                } catch (EOFException unused) {
                    this.p = i2 - this.o.size();
                    if (bVar.f()) {
                        v0();
                    } else {
                        this.n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8368g, true), com.bumptech.glide.k.c.a));
                    }
                    com.bumptech.glide.k.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bumptech.glide.k.c.a(bVar);
            throw th;
        }
    }

    private void u0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                substring = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.o.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i2, indexOf2);
            }
            d dVar = this.o.get(substring);
            CallableC0104a callableC0104a = null;
            if (dVar == null) {
                dVar = new d(this, substring, callableC0104a);
                this.o.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f8380e = true;
                dVar.f8381f = null;
                dVar.n(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f8381f = new c(this, dVar, callableC0104a);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void v0() throws IOException {
        Writer writer = this.n;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8369h), com.bumptech.glide.k.c.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f8371j));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.l));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.o.values()) {
                if (dVar.f8381f != null) {
                    bufferedWriter.write("DIRTY " + dVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f8368g.exists()) {
                x0(this.f8368g, this.f8370i, true);
            }
            x0(this.f8369h, this.f8368g, false);
            this.f8370i.delete();
            this.n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8368g, true), com.bumptech.glide.k.c.a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private static void x0(File file, File file2, boolean z) throws IOException {
        if (z) {
            Y(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() throws IOException {
        while (this.m > this.f8372k) {
            w0(this.o.entrySet().iterator().next().getKey());
        }
    }

    public void T() throws IOException {
        close();
        com.bumptech.glide.k.c.b(this.f8367f);
    }

    public c c0(String str) throws IOException {
        return g0(str, -1L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.n == null) {
            return;
        }
        Iterator it = new ArrayList(this.o.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f8381f != null) {
                dVar.f8381f.a();
            }
        }
        y0();
        this.n.close();
        this.n = null;
    }

    public synchronized e i0(String str) throws IOException {
        L();
        d dVar = this.o.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f8380e) {
            return null;
        }
        for (File file : dVar.f8378c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.p++;
        this.n.append((CharSequence) "READ");
        this.n.append(' ');
        this.n.append((CharSequence) str);
        this.n.append('\n');
        if (k0()) {
            this.r.submit(this.s);
        }
        return new e(this, str, dVar.f8382g, dVar.f8378c, dVar.f8377b, null);
    }

    public synchronized boolean w0(String str) throws IOException {
        L();
        d dVar = this.o.get(str);
        if (dVar != null && dVar.f8381f == null) {
            for (int i2 = 0; i2 < this.l; i2++) {
                File j2 = dVar.j(i2);
                if (j2.exists() && !j2.delete()) {
                    throw new IOException("failed to delete " + j2);
                }
                this.m -= dVar.f8377b[i2];
                dVar.f8377b[i2] = 0;
            }
            this.p++;
            this.n.append((CharSequence) "REMOVE");
            this.n.append(' ');
            this.n.append((CharSequence) str);
            this.n.append('\n');
            this.o.remove(str);
            if (k0()) {
                this.r.submit(this.s);
            }
            return true;
        }
        return false;
    }
}
