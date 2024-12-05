package M1;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class a implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    static final Pattern f6393o = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: p, reason: collision with root package name */
    private static final OutputStream f6394p = new b();

    /* renamed from: a, reason: collision with root package name */
    private final File f6395a;

    /* renamed from: b, reason: collision with root package name */
    private final File f6396b;

    /* renamed from: c, reason: collision with root package name */
    private final File f6397c;

    /* renamed from: d, reason: collision with root package name */
    private final File f6398d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6399e;

    /* renamed from: f, reason: collision with root package name */
    private long f6400f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6401g;

    /* renamed from: i, reason: collision with root package name */
    private Writer f6403i;

    /* renamed from: k, reason: collision with root package name */
    private int f6405k;

    /* renamed from: h, reason: collision with root package name */
    private long f6402h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f6404j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f6406l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f6407m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n, reason: collision with root package name */
    private final Callable f6408n = new CallableC0115a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class CallableC0115a implements Callable {
        CallableC0115a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f6403i != null) {
                        a.this.N();
                        if (a.this.F()) {
                            a.this.K();
                            a.this.f6405k = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f6410a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f6411b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6412c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6413d;

        /* renamed from: M1.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private class C0116a extends FilterOutputStream {
            /* synthetic */ C0116a(c cVar, OutputStream outputStream, CallableC0115a callableC0115a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f6412c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f6412c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i8) {
                try {
                    ((FilterOutputStream) this).out.write(i8);
                } catch (IOException unused) {
                    c.this.f6412c = true;
                }
            }

            private C0116a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i8, int i9) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i8, i9);
                } catch (IOException unused) {
                    c.this.f6412c = true;
                }
            }
        }

        /* synthetic */ c(a aVar, d dVar, CallableC0115a callableC0115a) {
            this(dVar);
        }

        public void a() {
            a.this.v(this, false);
        }

        public void e() {
            if (this.f6412c) {
                a.this.v(this, false);
                a.this.L(this.f6410a.f6416a);
            } else {
                a.this.v(this, true);
            }
            this.f6413d = true;
        }

        public OutputStream f(int i8) {
            FileOutputStream fileOutputStream;
            C0116a c0116a;
            synchronized (a.this) {
                try {
                    if (this.f6410a.f6419d == this) {
                        if (!this.f6410a.f6418c) {
                            this.f6411b[i8] = true;
                        }
                        File k8 = this.f6410a.k(i8);
                        try {
                            fileOutputStream = new FileOutputStream(k8);
                        } catch (FileNotFoundException unused) {
                            a.this.f6395a.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(k8);
                            } catch (FileNotFoundException unused2) {
                                return a.f6394p;
                            }
                        }
                        c0116a = new C0116a(this, fileOutputStream, null);
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0116a;
        }

        private c(d dVar) {
            this.f6410a = dVar;
            this.f6411b = dVar.f6418c ? null : new boolean[a.this.f6401g];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f6416a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f6417b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6418c;

        /* renamed from: d, reason: collision with root package name */
        private c f6419d;

        /* renamed from: e, reason: collision with root package name */
        private long f6420e;

        /* synthetic */ d(a aVar, String str, CallableC0115a callableC0115a) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == a.this.f6401g) {
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    try {
                        this.f6417b[i8] = Long.parseLong(strArr[i8]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i8) {
            return new File(a.this.f6395a, this.f6416a + "." + i8);
        }

        public File k(int i8) {
            return new File(a.this.f6395a, this.f6416a + "." + i8 + ".tmp");
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j8 : this.f6417b) {
                sb.append(' ');
                sb.append(j8);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f6416a = str;
            this.f6417b = new long[a.this.f6401g];
        }
    }

    /* loaded from: classes4.dex */
    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f6422a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6423b;

        /* renamed from: c, reason: collision with root package name */
        private final InputStream[] f6424c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f6425d;

        /* synthetic */ e(a aVar, String str, long j8, InputStream[] inputStreamArr, long[] jArr, CallableC0115a callableC0115a) {
            this(str, j8, inputStreamArr, jArr);
        }

        public InputStream a(int i8) {
            return this.f6424c[i8];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f6424c) {
                M1.c.a(inputStream);
            }
        }

        private e(String str, long j8, InputStream[] inputStreamArr, long[] jArr) {
            this.f6422a = str;
            this.f6423b = j8;
            this.f6424c = inputStreamArr;
            this.f6425d = jArr;
        }
    }

    private a(File file, int i8, int i9, long j8) {
        this.f6395a = file;
        this.f6399e = i8;
        this.f6396b = new File(file, "journal");
        this.f6397c = new File(file, "journal.tmp");
        this.f6398d = new File(file, "journal.bkp");
        this.f6401g = i9;
        this.f6400f = j8;
    }

    private synchronized c D(String str, long j8) {
        u();
        O(str);
        d dVar = (d) this.f6404j.get(str);
        CallableC0115a callableC0115a = null;
        if (j8 != -1 && (dVar == null || dVar.f6420e != j8)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0115a);
            this.f6404j.put(str, dVar);
        } else if (dVar.f6419d != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0115a);
        dVar.f6419d = cVar;
        this.f6403i.write("DIRTY " + str + '\n');
        this.f6403i.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F() {
        int i8 = this.f6405k;
        if (i8 >= 2000 && i8 >= this.f6404j.size()) {
            return true;
        }
        return false;
    }

    public static a G(File file, int i8, int i9, long j8) {
        if (j8 > 0) {
            if (i9 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        M(file2, file3, false);
                    }
                }
                a aVar = new a(file, i8, i9, j8);
                if (aVar.f6396b.exists()) {
                    try {
                        aVar.I();
                        aVar.H();
                        aVar.f6403i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f6396b, true), M1.c.f6433a));
                        return aVar;
                    } catch (IOException e8) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e8.getMessage() + ", removing");
                        aVar.x();
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i8, i9, j8);
                aVar2.K();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void H() {
        y(this.f6397c);
        Iterator it = this.f6404j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i8 = 0;
            if (dVar.f6419d != null) {
                dVar.f6419d = null;
                while (i8 < this.f6401g) {
                    y(dVar.j(i8));
                    y(dVar.k(i8));
                    i8++;
                }
                it.remove();
            } else {
                while (i8 < this.f6401g) {
                    this.f6402h += dVar.f6417b[i8];
                    i8++;
                }
            }
        }
    }

    private void I() {
        M1.b bVar = new M1.b(new FileInputStream(this.f6396b), M1.c.f6433a);
        try {
            String f8 = bVar.f();
            String f9 = bVar.f();
            String f10 = bVar.f();
            String f11 = bVar.f();
            String f12 = bVar.f();
            if ("libcore.io.DiskLruCache".equals(f8) && "1".equals(f9) && Integer.toString(this.f6399e).equals(f10) && Integer.toString(this.f6401g).equals(f11) && "".equals(f12)) {
                int i8 = 0;
                while (true) {
                    try {
                        J(bVar.f());
                        i8++;
                    } catch (EOFException unused) {
                        this.f6405k = i8 - this.f6404j.size();
                        M1.c.a(bVar);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + f8 + ", " + f9 + ", " + f11 + ", " + f12 + "]");
            }
        } catch (Throwable th) {
            M1.c.a(bVar);
            throw th;
        }
    }

    private void J(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i8);
            if (indexOf2 == -1) {
                substring = str.substring(i8);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f6404j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i8, indexOf2);
            }
            d dVar = (d) this.f6404j.get(substring);
            CallableC0115a callableC0115a = null;
            if (dVar == null) {
                dVar = new d(this, substring, callableC0115a);
                this.f6404j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f6418c = true;
                dVar.f6419d = null;
                dVar.n(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f6419d = new c(this, dVar, callableC0115a);
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
    public synchronized void K() {
        try {
            Writer writer = this.f6403i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6397c), M1.c.f6433a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f6399e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f6401g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f6404j.values()) {
                    if (dVar.f6419d != null) {
                        bufferedWriter.write("DIRTY " + dVar.f6416a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f6416a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f6396b.exists()) {
                    M(this.f6396b, this.f6398d, true);
                }
                M(this.f6397c, this.f6396b, false);
                this.f6398d.delete();
                this.f6403i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6396b, true), M1.c.f6433a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void M(File file, File file2, boolean z8) {
        if (z8) {
            y(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        while (this.f6402h > this.f6400f) {
            L((String) ((Map.Entry) this.f6404j.entrySet().iterator().next()).getKey());
        }
    }

    private void O(String str) {
        if (f6393o.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    private void u() {
        if (this.f6403i != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void v(c cVar, boolean z8) {
        d dVar = cVar.f6410a;
        if (dVar.f6419d == cVar) {
            if (z8 && !dVar.f6418c) {
                for (int i8 = 0; i8 < this.f6401g; i8++) {
                    if (cVar.f6411b[i8]) {
                        if (!dVar.k(i8).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                    }
                }
            }
            for (int i9 = 0; i9 < this.f6401g; i9++) {
                File k8 = dVar.k(i9);
                if (z8) {
                    if (k8.exists()) {
                        File j8 = dVar.j(i9);
                        k8.renameTo(j8);
                        long j9 = dVar.f6417b[i9];
                        long length = j8.length();
                        dVar.f6417b[i9] = length;
                        this.f6402h = (this.f6402h - j9) + length;
                    }
                } else {
                    y(k8);
                }
            }
            this.f6405k++;
            dVar.f6419d = null;
            if (dVar.f6418c | z8) {
                dVar.f6418c = true;
                this.f6403i.write("CLEAN " + dVar.f6416a + dVar.l() + '\n');
                if (z8) {
                    long j10 = this.f6406l;
                    this.f6406l = 1 + j10;
                    dVar.f6420e = j10;
                }
            } else {
                this.f6404j.remove(dVar.f6416a);
                this.f6403i.write("REMOVE " + dVar.f6416a + '\n');
            }
            this.f6403i.flush();
            if (this.f6402h > this.f6400f || F()) {
                this.f6407m.submit(this.f6408n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static void y(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public c A(String str) {
        return D(str, -1L);
    }

    public synchronized e E(String str) {
        InputStream inputStream;
        u();
        O(str);
        d dVar = (d) this.f6404j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f6418c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f6401g];
        for (int i8 = 0; i8 < this.f6401g; i8++) {
            try {
                inputStreamArr[i8] = new FileInputStream(dVar.j(i8));
            } catch (FileNotFoundException unused) {
                for (int i9 = 0; i9 < this.f6401g && (inputStream = inputStreamArr[i9]) != null; i9++) {
                    M1.c.a(inputStream);
                }
                return null;
            }
        }
        this.f6405k++;
        this.f6403i.append((CharSequence) ("READ " + str + '\n'));
        if (F()) {
            this.f6407m.submit(this.f6408n);
        }
        return new e(this, str, dVar.f6420e, inputStreamArr, dVar.f6417b, null);
    }

    public synchronized boolean L(String str) {
        try {
            u();
            O(str);
            d dVar = (d) this.f6404j.get(str);
            if (dVar != null && dVar.f6419d == null) {
                for (int i8 = 0; i8 < this.f6401g; i8++) {
                    File j8 = dVar.j(i8);
                    if (j8.exists() && !j8.delete()) {
                        throw new IOException("failed to delete " + j8);
                    }
                    this.f6402h -= dVar.f6417b[i8];
                    dVar.f6417b[i8] = 0;
                }
                this.f6405k++;
                this.f6403i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f6404j.remove(str);
                if (F()) {
                    this.f6407m.submit(this.f6408n);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f6403i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f6404j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f6419d != null) {
                    dVar.f6419d.a();
                }
            }
            N();
            this.f6403i.close();
            this.f6403i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() {
        u();
        N();
        this.f6403i.flush();
    }

    public void x() {
        close();
        M1.c.b(this.f6395a);
    }

    /* loaded from: classes4.dex */
    static class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
        }
    }
}
