package H6;

import P6.InterfaceC1280f;
import P6.InterfaceC1281g;
import P6.L;
import P6.X;
import P6.Z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: u, reason: collision with root package name */
    static final Pattern f3548u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    final M6.a f3549a;

    /* renamed from: b, reason: collision with root package name */
    final File f3550b;

    /* renamed from: c, reason: collision with root package name */
    private final File f3551c;

    /* renamed from: d, reason: collision with root package name */
    private final File f3552d;

    /* renamed from: e, reason: collision with root package name */
    private final File f3553e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3554f;

    /* renamed from: g, reason: collision with root package name */
    private long f3555g;

    /* renamed from: h, reason: collision with root package name */
    final int f3556h;

    /* renamed from: j, reason: collision with root package name */
    InterfaceC1280f f3558j;

    /* renamed from: l, reason: collision with root package name */
    int f3560l;

    /* renamed from: m, reason: collision with root package name */
    boolean f3561m;

    /* renamed from: n, reason: collision with root package name */
    boolean f3562n;

    /* renamed from: o, reason: collision with root package name */
    boolean f3563o;

    /* renamed from: p, reason: collision with root package name */
    boolean f3564p;

    /* renamed from: q, reason: collision with root package name */
    boolean f3565q;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f3567s;

    /* renamed from: i, reason: collision with root package name */
    private long f3557i = 0;

    /* renamed from: k, reason: collision with root package name */
    final LinkedHashMap f3559k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: r, reason: collision with root package name */
    private long f3566r = 0;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f3568t = new a();

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this) {
                d dVar = d.this;
                if ((!dVar.f3562n) | dVar.f3563o) {
                    return;
                }
                try {
                    dVar.F();
                } catch (IOException unused) {
                    d.this.f3564p = true;
                }
                try {
                    if (d.this.o()) {
                        d.this.x();
                        d.this.f3560l = 0;
                    }
                } catch (IOException unused2) {
                    d dVar2 = d.this;
                    dVar2.f3565q = true;
                    dVar2.f3558j = L.c(L.b());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends H6.e {
        b(X x8) {
            super(x8);
        }

        @Override // H6.e
        protected void a(IOException iOException) {
            d.this.f3561m = true;
        }
    }

    /* loaded from: classes5.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        final C0057d f3571a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f3572b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3573c;

        /* loaded from: classes5.dex */
        class a extends H6.e {
            a(X x8) {
                super(x8);
            }

            @Override // H6.e
            protected void a(IOException iOException) {
                synchronized (d.this) {
                    c.this.c();
                }
            }
        }

        c(C0057d c0057d) {
            boolean[] zArr;
            this.f3571a = c0057d;
            if (c0057d.f3580e) {
                zArr = null;
            } else {
                zArr = new boolean[d.this.f3556h];
            }
            this.f3572b = zArr;
        }

        public void a() {
            synchronized (d.this) {
                try {
                    if (!this.f3573c) {
                        if (this.f3571a.f3581f == this) {
                            d.this.b(this, false);
                        }
                        this.f3573c = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            synchronized (d.this) {
                try {
                    if (!this.f3573c) {
                        if (this.f3571a.f3581f == this) {
                            d.this.b(this, true);
                        }
                        this.f3573c = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void c() {
            if (this.f3571a.f3581f == this) {
                int i8 = 0;
                while (true) {
                    d dVar = d.this;
                    if (i8 < dVar.f3556h) {
                        try {
                            dVar.f3549a.delete(this.f3571a.f3579d[i8]);
                        } catch (IOException unused) {
                        }
                        i8++;
                    } else {
                        this.f3571a.f3581f = null;
                        return;
                    }
                }
            }
        }

        public X d(int i8) {
            synchronized (d.this) {
                try {
                    if (!this.f3573c) {
                        C0057d c0057d = this.f3571a;
                        if (c0057d.f3581f != this) {
                            return L.b();
                        }
                        if (!c0057d.f3580e) {
                            this.f3572b[i8] = true;
                        }
                        try {
                            return new a(d.this.f3549a.sink(c0057d.f3579d[i8]));
                        } catch (FileNotFoundException unused) {
                            return L.b();
                        }
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H6.d$d, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class C0057d {

        /* renamed from: a, reason: collision with root package name */
        final String f3576a;

        /* renamed from: b, reason: collision with root package name */
        final long[] f3577b;

        /* renamed from: c, reason: collision with root package name */
        final File[] f3578c;

        /* renamed from: d, reason: collision with root package name */
        final File[] f3579d;

        /* renamed from: e, reason: collision with root package name */
        boolean f3580e;

        /* renamed from: f, reason: collision with root package name */
        c f3581f;

        /* renamed from: g, reason: collision with root package name */
        long f3582g;

        C0057d(String str) {
            this.f3576a = str;
            int i8 = d.this.f3556h;
            this.f3577b = new long[i8];
            this.f3578c = new File[i8];
            this.f3579d = new File[i8];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i9 = 0; i9 < d.this.f3556h; i9++) {
                sb.append(i9);
                this.f3578c[i9] = new File(d.this.f3550b, sb.toString());
                sb.append(".tmp");
                this.f3579d[i9] = new File(d.this.f3550b, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        void b(String[] strArr) {
            if (strArr.length == d.this.f3556h) {
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    try {
                        this.f3577b[i8] = Long.parseLong(strArr[i8]);
                    } catch (NumberFormatException unused) {
                        throw a(strArr);
                    }
                }
                return;
            }
            throw a(strArr);
        }

        e c() {
            Z z8;
            if (Thread.holdsLock(d.this)) {
                Z[] zArr = new Z[d.this.f3556h];
                long[] jArr = (long[]) this.f3577b.clone();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    try {
                        d dVar = d.this;
                        if (i9 < dVar.f3556h) {
                            zArr[i9] = dVar.f3549a.source(this.f3578c[i9]);
                            i9++;
                        } else {
                            return new e(this.f3576a, this.f3582g, zArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            d dVar2 = d.this;
                            if (i8 < dVar2.f3556h && (z8 = zArr[i8]) != null) {
                                G6.c.d(z8);
                                i8++;
                            } else {
                                try {
                                    dVar2.E(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        void d(InterfaceC1280f interfaceC1280f) {
            for (long j8 : this.f3577b) {
                interfaceC1280f.writeByte(32).writeDecimalLong(j8);
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f3584a;

        /* renamed from: b, reason: collision with root package name */
        private final long f3585b;

        /* renamed from: c, reason: collision with root package name */
        private final Z[] f3586c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f3587d;

        e(String str, long j8, Z[] zArr, long[] jArr) {
            this.f3584a = str;
            this.f3585b = j8;
            this.f3586c = zArr;
            this.f3587d = jArr;
        }

        public c a() {
            return d.this.h(this.f3584a, this.f3585b);
        }

        public Z b(int i8) {
            return this.f3586c[i8];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Z z8 : this.f3586c) {
                G6.c.d(z8);
            }
        }
    }

    d(M6.a aVar, File file, int i8, int i9, long j8, Executor executor) {
        this.f3549a = aVar;
        this.f3550b = file;
        this.f3554f = i8;
        this.f3551c = new File(file, "journal");
        this.f3552d = new File(file, "journal.tmp");
        this.f3553e = new File(file, "journal.bkp");
        this.f3556h = i9;
        this.f3555g = j8;
        this.f3567s = executor;
    }

    private void G(String str) {
        if (f3548u.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    private synchronized void a() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static d e(M6.a aVar, File file, int i8, int i9, long j8) {
        if (j8 > 0) {
            if (i9 > 0) {
                return new d(aVar, file, i8, i9, j8, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), G6.c.B("OkHttp DiskLruCache", true)));
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private InterfaceC1280f r() {
        return L.c(new b(this.f3549a.appendingSink(this.f3551c)));
    }

    private void t() {
        this.f3549a.delete(this.f3552d);
        Iterator it = this.f3559k.values().iterator();
        while (it.hasNext()) {
            C0057d c0057d = (C0057d) it.next();
            int i8 = 0;
            if (c0057d.f3581f == null) {
                while (i8 < this.f3556h) {
                    this.f3557i += c0057d.f3577b[i8];
                    i8++;
                }
            } else {
                c0057d.f3581f = null;
                while (i8 < this.f3556h) {
                    this.f3549a.delete(c0057d.f3578c[i8]);
                    this.f3549a.delete(c0057d.f3579d[i8]);
                    i8++;
                }
                it.remove();
            }
        }
    }

    private void u() {
        InterfaceC1281g d8 = L.d(this.f3549a.source(this.f3551c));
        try {
            String readUtf8LineStrict = d8.readUtf8LineStrict();
            String readUtf8LineStrict2 = d8.readUtf8LineStrict();
            String readUtf8LineStrict3 = d8.readUtf8LineStrict();
            String readUtf8LineStrict4 = d8.readUtf8LineStrict();
            String readUtf8LineStrict5 = d8.readUtf8LineStrict();
            if ("libcore.io.DiskLruCache".equals(readUtf8LineStrict) && "1".equals(readUtf8LineStrict2) && Integer.toString(this.f3554f).equals(readUtf8LineStrict3) && Integer.toString(this.f3556h).equals(readUtf8LineStrict4) && "".equals(readUtf8LineStrict5)) {
                int i8 = 0;
                while (true) {
                    try {
                        w(d8.readUtf8LineStrict());
                        i8++;
                    } catch (EOFException unused) {
                        this.f3560l = i8 - this.f3559k.size();
                        if (!d8.exhausted()) {
                            x();
                        } else {
                            this.f3558j = r();
                        }
                        G6.c.d(d8);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + "]");
            }
        } catch (Throwable th) {
            G6.c.d(d8);
            throw th;
        }
    }

    private void w(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i8);
            if (indexOf2 == -1) {
                substring = str.substring(i8);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f3559k.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i8, indexOf2);
            }
            C0057d c0057d = (C0057d) this.f3559k.get(substring);
            if (c0057d == null) {
                c0057d = new C0057d(substring);
                this.f3559k.put(substring, c0057d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c0057d.f3580e = true;
                c0057d.f3581f = null;
                c0057d.b(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c0057d.f3581f = new c(c0057d);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public synchronized boolean A(String str) {
        m();
        a();
        G(str);
        C0057d c0057d = (C0057d) this.f3559k.get(str);
        if (c0057d == null) {
            return false;
        }
        boolean E8 = E(c0057d);
        if (E8 && this.f3557i <= this.f3555g) {
            this.f3564p = false;
        }
        return E8;
    }

    boolean E(C0057d c0057d) {
        c cVar = c0057d.f3581f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i8 = 0; i8 < this.f3556h; i8++) {
            this.f3549a.delete(c0057d.f3578c[i8]);
            long j8 = this.f3557i;
            long[] jArr = c0057d.f3577b;
            this.f3557i = j8 - jArr[i8];
            jArr[i8] = 0;
        }
        this.f3560l++;
        this.f3558j.writeUtf8("REMOVE").writeByte(32).writeUtf8(c0057d.f3576a).writeByte(10);
        this.f3559k.remove(c0057d.f3576a);
        if (o()) {
            this.f3567s.execute(this.f3568t);
        }
        return true;
    }

    void F() {
        while (this.f3557i > this.f3555g) {
            E((C0057d) this.f3559k.values().iterator().next());
        }
        this.f3564p = false;
    }

    synchronized void b(c cVar, boolean z8) {
        C0057d c0057d = cVar.f3571a;
        if (c0057d.f3581f == cVar) {
            if (z8 && !c0057d.f3580e) {
                for (int i8 = 0; i8 < this.f3556h; i8++) {
                    if (cVar.f3572b[i8]) {
                        if (!this.f3549a.exists(c0057d.f3579d[i8])) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                    }
                }
            }
            for (int i9 = 0; i9 < this.f3556h; i9++) {
                File file = c0057d.f3579d[i9];
                if (z8) {
                    if (this.f3549a.exists(file)) {
                        File file2 = c0057d.f3578c[i9];
                        this.f3549a.rename(file, file2);
                        long j8 = c0057d.f3577b[i9];
                        long size = this.f3549a.size(file2);
                        c0057d.f3577b[i9] = size;
                        this.f3557i = (this.f3557i - j8) + size;
                    }
                } else {
                    this.f3549a.delete(file);
                }
            }
            this.f3560l++;
            c0057d.f3581f = null;
            if (c0057d.f3580e | z8) {
                c0057d.f3580e = true;
                this.f3558j.writeUtf8("CLEAN").writeByte(32);
                this.f3558j.writeUtf8(c0057d.f3576a);
                c0057d.d(this.f3558j);
                this.f3558j.writeByte(10);
                if (z8) {
                    long j9 = this.f3566r;
                    this.f3566r = 1 + j9;
                    c0057d.f3582g = j9;
                }
            } else {
                this.f3559k.remove(c0057d.f3576a);
                this.f3558j.writeUtf8("REMOVE").writeByte(32);
                this.f3558j.writeUtf8(c0057d.f3576a);
                this.f3558j.writeByte(10);
            }
            this.f3558j.flush();
            if (this.f3557i > this.f3555g || o()) {
                this.f3567s.execute(this.f3568t);
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f3562n && !this.f3563o) {
                for (C0057d c0057d : (C0057d[]) this.f3559k.values().toArray(new C0057d[this.f3559k.size()])) {
                    c cVar = c0057d.f3581f;
                    if (cVar != null) {
                        cVar.a();
                    }
                }
                F();
                this.f3558j.close();
                this.f3558j = null;
                this.f3563o = true;
                return;
            }
            this.f3563o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void f() {
        close();
        this.f3549a.deleteContents(this.f3550b);
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.f3562n) {
            return;
        }
        a();
        F();
        this.f3558j.flush();
    }

    public c g(String str) {
        return h(str, -1L);
    }

    synchronized c h(String str, long j8) {
        m();
        a();
        G(str);
        C0057d c0057d = (C0057d) this.f3559k.get(str);
        if (j8 != -1 && (c0057d == null || c0057d.f3582g != j8)) {
            return null;
        }
        if (c0057d != null && c0057d.f3581f != null) {
            return null;
        }
        if (!this.f3564p && !this.f3565q) {
            this.f3558j.writeUtf8("DIRTY").writeByte(32).writeUtf8(str).writeByte(10);
            this.f3558j.flush();
            if (this.f3561m) {
                return null;
            }
            if (c0057d == null) {
                c0057d = new C0057d(str);
                this.f3559k.put(str, c0057d);
            }
            c cVar = new c(c0057d);
            c0057d.f3581f = cVar;
            return cVar;
        }
        this.f3567s.execute(this.f3568t);
        return null;
    }

    public synchronized boolean isClosed() {
        return this.f3563o;
    }

    public synchronized e l(String str) {
        m();
        a();
        G(str);
        C0057d c0057d = (C0057d) this.f3559k.get(str);
        if (c0057d != null && c0057d.f3580e) {
            e c8 = c0057d.c();
            if (c8 == null) {
                return null;
            }
            this.f3560l++;
            this.f3558j.writeUtf8("READ").writeByte(32).writeUtf8(str).writeByte(10);
            if (o()) {
                this.f3567s.execute(this.f3568t);
            }
            return c8;
        }
        return null;
    }

    public synchronized void m() {
        try {
            if (this.f3562n) {
                return;
            }
            if (this.f3549a.exists(this.f3553e)) {
                if (this.f3549a.exists(this.f3551c)) {
                    this.f3549a.delete(this.f3553e);
                } else {
                    this.f3549a.rename(this.f3553e, this.f3551c);
                }
            }
            if (this.f3549a.exists(this.f3551c)) {
                try {
                    u();
                    t();
                    this.f3562n = true;
                    return;
                } catch (IOException e8) {
                    N6.f.i().p(5, "DiskLruCache " + this.f3550b + " is corrupt: " + e8.getMessage() + ", removing", e8);
                    try {
                        f();
                        this.f3563o = false;
                    } catch (Throwable th) {
                        this.f3563o = false;
                        throw th;
                    }
                }
            }
            x();
            this.f3562n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    boolean o() {
        int i8 = this.f3560l;
        if (i8 >= 2000 && i8 >= this.f3559k.size()) {
            return true;
        }
        return false;
    }

    synchronized void x() {
        try {
            InterfaceC1280f interfaceC1280f = this.f3558j;
            if (interfaceC1280f != null) {
                interfaceC1280f.close();
            }
            InterfaceC1280f c8 = L.c(this.f3549a.sink(this.f3552d));
            try {
                c8.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                c8.writeUtf8("1").writeByte(10);
                c8.writeDecimalLong(this.f3554f).writeByte(10);
                c8.writeDecimalLong(this.f3556h).writeByte(10);
                c8.writeByte(10);
                for (C0057d c0057d : this.f3559k.values()) {
                    if (c0057d.f3581f != null) {
                        c8.writeUtf8("DIRTY").writeByte(32);
                        c8.writeUtf8(c0057d.f3576a);
                        c8.writeByte(10);
                    } else {
                        c8.writeUtf8("CLEAN").writeByte(32);
                        c8.writeUtf8(c0057d.f3576a);
                        c0057d.d(c8);
                        c8.writeByte(10);
                    }
                }
                c8.close();
                if (this.f3549a.exists(this.f3551c)) {
                    this.f3549a.rename(this.f3551c, this.f3553e);
                }
                this.f3549a.rename(this.f3552d, this.f3551c);
                this.f3549a.delete(this.f3553e);
                this.f3558j = r();
                this.f3561m = false;
                this.f3565q = false;
            } catch (Throwable th) {
                c8.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
