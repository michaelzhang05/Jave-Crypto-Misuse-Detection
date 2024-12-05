package K6;

import S6.InterfaceC1418f;
import S6.InterfaceC1419g;
import S6.L;
import S6.X;
import S6.Z;
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
    static final Pattern f5151u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    final P6.a f5152a;

    /* renamed from: b, reason: collision with root package name */
    final File f5153b;

    /* renamed from: c, reason: collision with root package name */
    private final File f5154c;

    /* renamed from: d, reason: collision with root package name */
    private final File f5155d;

    /* renamed from: e, reason: collision with root package name */
    private final File f5156e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5157f;

    /* renamed from: g, reason: collision with root package name */
    private long f5158g;

    /* renamed from: h, reason: collision with root package name */
    final int f5159h;

    /* renamed from: j, reason: collision with root package name */
    InterfaceC1418f f5161j;

    /* renamed from: l, reason: collision with root package name */
    int f5163l;

    /* renamed from: m, reason: collision with root package name */
    boolean f5164m;

    /* renamed from: n, reason: collision with root package name */
    boolean f5165n;

    /* renamed from: o, reason: collision with root package name */
    boolean f5166o;

    /* renamed from: p, reason: collision with root package name */
    boolean f5167p;

    /* renamed from: q, reason: collision with root package name */
    boolean f5168q;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f5170s;

    /* renamed from: i, reason: collision with root package name */
    private long f5160i = 0;

    /* renamed from: k, reason: collision with root package name */
    final LinkedHashMap f5162k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: r, reason: collision with root package name */
    private long f5169r = 0;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f5171t = new a();

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this) {
                d dVar = d.this;
                if ((!dVar.f5165n) | dVar.f5166o) {
                    return;
                }
                try {
                    dVar.F();
                } catch (IOException unused) {
                    d.this.f5167p = true;
                }
                try {
                    if (d.this.s()) {
                        d.this.A();
                        d.this.f5163l = 0;
                    }
                } catch (IOException unused2) {
                    d dVar2 = d.this;
                    dVar2.f5168q = true;
                    dVar2.f5161j = L.c(L.b());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b extends K6.e {
        b(X x8) {
            super(x8);
        }

        @Override // K6.e
        protected void a(IOException iOException) {
            d.this.f5164m = true;
        }
    }

    /* loaded from: classes5.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        final C0080d f5174a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f5175b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5176c;

        /* loaded from: classes5.dex */
        class a extends K6.e {
            a(X x8) {
                super(x8);
            }

            @Override // K6.e
            protected void a(IOException iOException) {
                synchronized (d.this) {
                    c.this.c();
                }
            }
        }

        c(C0080d c0080d) {
            boolean[] zArr;
            this.f5174a = c0080d;
            if (c0080d.f5183e) {
                zArr = null;
            } else {
                zArr = new boolean[d.this.f5159h];
            }
            this.f5175b = zArr;
        }

        public void a() {
            synchronized (d.this) {
                try {
                    if (!this.f5176c) {
                        if (this.f5174a.f5184f == this) {
                            d.this.b(this, false);
                        }
                        this.f5176c = true;
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
                    if (!this.f5176c) {
                        if (this.f5174a.f5184f == this) {
                            d.this.b(this, true);
                        }
                        this.f5176c = true;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void c() {
            if (this.f5174a.f5184f == this) {
                int i8 = 0;
                while (true) {
                    d dVar = d.this;
                    if (i8 < dVar.f5159h) {
                        try {
                            dVar.f5152a.delete(this.f5174a.f5182d[i8]);
                        } catch (IOException unused) {
                        }
                        i8++;
                    } else {
                        this.f5174a.f5184f = null;
                        return;
                    }
                }
            }
        }

        public X d(int i8) {
            synchronized (d.this) {
                try {
                    if (!this.f5176c) {
                        C0080d c0080d = this.f5174a;
                        if (c0080d.f5184f != this) {
                            return L.b();
                        }
                        if (!c0080d.f5183e) {
                            this.f5175b[i8] = true;
                        }
                        try {
                            return new a(d.this.f5152a.sink(c0080d.f5182d[i8]));
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
    /* renamed from: K6.d$d, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class C0080d {

        /* renamed from: a, reason: collision with root package name */
        final String f5179a;

        /* renamed from: b, reason: collision with root package name */
        final long[] f5180b;

        /* renamed from: c, reason: collision with root package name */
        final File[] f5181c;

        /* renamed from: d, reason: collision with root package name */
        final File[] f5182d;

        /* renamed from: e, reason: collision with root package name */
        boolean f5183e;

        /* renamed from: f, reason: collision with root package name */
        c f5184f;

        /* renamed from: g, reason: collision with root package name */
        long f5185g;

        C0080d(String str) {
            this.f5179a = str;
            int i8 = d.this.f5159h;
            this.f5180b = new long[i8];
            this.f5181c = new File[i8];
            this.f5182d = new File[i8];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i9 = 0; i9 < d.this.f5159h; i9++) {
                sb.append(i9);
                this.f5181c[i9] = new File(d.this.f5153b, sb.toString());
                sb.append(".tmp");
                this.f5182d[i9] = new File(d.this.f5153b, sb.toString());
                sb.setLength(length);
            }
        }

        private IOException a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        void b(String[] strArr) {
            if (strArr.length == d.this.f5159h) {
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    try {
                        this.f5180b[i8] = Long.parseLong(strArr[i8]);
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
                Z[] zArr = new Z[d.this.f5159h];
                long[] jArr = (long[]) this.f5180b.clone();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    try {
                        d dVar = d.this;
                        if (i9 < dVar.f5159h) {
                            zArr[i9] = dVar.f5152a.source(this.f5181c[i9]);
                            i9++;
                        } else {
                            return new e(this.f5179a, this.f5185g, zArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            d dVar2 = d.this;
                            if (i8 < dVar2.f5159h && (z8 = zArr[i8]) != null) {
                                J6.c.d(z8);
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

        void d(InterfaceC1418f interfaceC1418f) {
            for (long j8 : this.f5180b) {
                interfaceC1418f.writeByte(32).writeDecimalLong(j8);
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f5187a;

        /* renamed from: b, reason: collision with root package name */
        private final long f5188b;

        /* renamed from: c, reason: collision with root package name */
        private final Z[] f5189c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f5190d;

        e(String str, long j8, Z[] zArr, long[] jArr) {
            this.f5187a = str;
            this.f5188b = j8;
            this.f5189c = zArr;
            this.f5190d = jArr;
        }

        public c a() {
            return d.this.m(this.f5187a, this.f5188b);
        }

        public Z b(int i8) {
            return this.f5189c[i8];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (Z z8 : this.f5189c) {
                J6.c.d(z8);
            }
        }
    }

    d(P6.a aVar, File file, int i8, int i9, long j8, Executor executor) {
        this.f5152a = aVar;
        this.f5153b = file;
        this.f5157f = i8;
        this.f5154c = new File(file, "journal");
        this.f5155d = new File(file, "journal.tmp");
        this.f5156e = new File(file, "journal.bkp");
        this.f5159h = i9;
        this.f5158g = j8;
        this.f5170s = executor;
    }

    private void G(String str) {
        if (f5151u.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    private synchronized void a() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static d f(P6.a aVar, File file, int i8, int i9, long j8) {
        if (j8 > 0) {
            if (i9 > 0) {
                return new d(aVar, file, i8, i9, j8, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), J6.c.B("OkHttp DiskLruCache", true)));
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private InterfaceC1418f u() {
        return L.c(new b(this.f5152a.appendingSink(this.f5154c)));
    }

    private void v() {
        this.f5152a.delete(this.f5155d);
        Iterator it = this.f5162k.values().iterator();
        while (it.hasNext()) {
            C0080d c0080d = (C0080d) it.next();
            int i8 = 0;
            if (c0080d.f5184f == null) {
                while (i8 < this.f5159h) {
                    this.f5160i += c0080d.f5180b[i8];
                    i8++;
                }
            } else {
                c0080d.f5184f = null;
                while (i8 < this.f5159h) {
                    this.f5152a.delete(c0080d.f5181c[i8]);
                    this.f5152a.delete(c0080d.f5182d[i8]);
                    i8++;
                }
                it.remove();
            }
        }
    }

    private void x() {
        InterfaceC1419g d8 = L.d(this.f5152a.source(this.f5154c));
        try {
            String readUtf8LineStrict = d8.readUtf8LineStrict();
            String readUtf8LineStrict2 = d8.readUtf8LineStrict();
            String readUtf8LineStrict3 = d8.readUtf8LineStrict();
            String readUtf8LineStrict4 = d8.readUtf8LineStrict();
            String readUtf8LineStrict5 = d8.readUtf8LineStrict();
            if ("libcore.io.DiskLruCache".equals(readUtf8LineStrict) && "1".equals(readUtf8LineStrict2) && Integer.toString(this.f5157f).equals(readUtf8LineStrict3) && Integer.toString(this.f5159h).equals(readUtf8LineStrict4) && "".equals(readUtf8LineStrict5)) {
                int i8 = 0;
                while (true) {
                    try {
                        y(d8.readUtf8LineStrict());
                        i8++;
                    } catch (EOFException unused) {
                        this.f5163l = i8 - this.f5162k.size();
                        if (!d8.exhausted()) {
                            A();
                        } else {
                            this.f5161j = u();
                        }
                        J6.c.d(d8);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + "]");
            }
        } catch (Throwable th) {
            J6.c.d(d8);
            throw th;
        }
    }

    private void y(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i8);
            if (indexOf2 == -1) {
                substring = str.substring(i8);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f5162k.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i8, indexOf2);
            }
            C0080d c0080d = (C0080d) this.f5162k.get(substring);
            if (c0080d == null) {
                c0080d = new C0080d(substring);
                this.f5162k.put(substring, c0080d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c0080d.f5183e = true;
                c0080d.f5184f = null;
                c0080d.b(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c0080d.f5184f = new c(c0080d);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    synchronized void A() {
        try {
            InterfaceC1418f interfaceC1418f = this.f5161j;
            if (interfaceC1418f != null) {
                interfaceC1418f.close();
            }
            InterfaceC1418f c8 = L.c(this.f5152a.sink(this.f5155d));
            try {
                c8.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                c8.writeUtf8("1").writeByte(10);
                c8.writeDecimalLong(this.f5157f).writeByte(10);
                c8.writeDecimalLong(this.f5159h).writeByte(10);
                c8.writeByte(10);
                for (C0080d c0080d : this.f5162k.values()) {
                    if (c0080d.f5184f != null) {
                        c8.writeUtf8("DIRTY").writeByte(32);
                        c8.writeUtf8(c0080d.f5179a);
                        c8.writeByte(10);
                    } else {
                        c8.writeUtf8("CLEAN").writeByte(32);
                        c8.writeUtf8(c0080d.f5179a);
                        c0080d.d(c8);
                        c8.writeByte(10);
                    }
                }
                c8.close();
                if (this.f5152a.exists(this.f5154c)) {
                    this.f5152a.rename(this.f5154c, this.f5156e);
                }
                this.f5152a.rename(this.f5155d, this.f5154c);
                this.f5152a.delete(this.f5156e);
                this.f5161j = u();
                this.f5164m = false;
                this.f5168q = false;
            } catch (Throwable th) {
                c8.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean D(String str) {
        o();
        a();
        G(str);
        C0080d c0080d = (C0080d) this.f5162k.get(str);
        if (c0080d == null) {
            return false;
        }
        boolean E8 = E(c0080d);
        if (E8 && this.f5160i <= this.f5158g) {
            this.f5167p = false;
        }
        return E8;
    }

    boolean E(C0080d c0080d) {
        c cVar = c0080d.f5184f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i8 = 0; i8 < this.f5159h; i8++) {
            this.f5152a.delete(c0080d.f5181c[i8]);
            long j8 = this.f5160i;
            long[] jArr = c0080d.f5180b;
            this.f5160i = j8 - jArr[i8];
            jArr[i8] = 0;
        }
        this.f5163l++;
        this.f5161j.writeUtf8("REMOVE").writeByte(32).writeUtf8(c0080d.f5179a).writeByte(10);
        this.f5162k.remove(c0080d.f5179a);
        if (s()) {
            this.f5170s.execute(this.f5171t);
        }
        return true;
    }

    void F() {
        while (this.f5160i > this.f5158g) {
            E((C0080d) this.f5162k.values().iterator().next());
        }
        this.f5167p = false;
    }

    synchronized void b(c cVar, boolean z8) {
        C0080d c0080d = cVar.f5174a;
        if (c0080d.f5184f == cVar) {
            if (z8 && !c0080d.f5183e) {
                for (int i8 = 0; i8 < this.f5159h; i8++) {
                    if (cVar.f5175b[i8]) {
                        if (!this.f5152a.exists(c0080d.f5182d[i8])) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                    }
                }
            }
            for (int i9 = 0; i9 < this.f5159h; i9++) {
                File file = c0080d.f5182d[i9];
                if (z8) {
                    if (this.f5152a.exists(file)) {
                        File file2 = c0080d.f5181c[i9];
                        this.f5152a.rename(file, file2);
                        long j8 = c0080d.f5180b[i9];
                        long size = this.f5152a.size(file2);
                        c0080d.f5180b[i9] = size;
                        this.f5160i = (this.f5160i - j8) + size;
                    }
                } else {
                    this.f5152a.delete(file);
                }
            }
            this.f5163l++;
            c0080d.f5184f = null;
            if (c0080d.f5183e | z8) {
                c0080d.f5183e = true;
                this.f5161j.writeUtf8("CLEAN").writeByte(32);
                this.f5161j.writeUtf8(c0080d.f5179a);
                c0080d.d(this.f5161j);
                this.f5161j.writeByte(10);
                if (z8) {
                    long j9 = this.f5169r;
                    this.f5169r = 1 + j9;
                    c0080d.f5185g = j9;
                }
            } else {
                this.f5162k.remove(c0080d.f5179a);
                this.f5161j.writeUtf8("REMOVE").writeByte(32);
                this.f5161j.writeUtf8(c0080d.f5179a);
                this.f5161j.writeByte(10);
            }
            this.f5161j.flush();
            if (this.f5160i > this.f5158g || s()) {
                this.f5170s.execute(this.f5171t);
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f5165n && !this.f5166o) {
                for (C0080d c0080d : (C0080d[]) this.f5162k.values().toArray(new C0080d[this.f5162k.size()])) {
                    c cVar = c0080d.f5184f;
                    if (cVar != null) {
                        cVar.a();
                    }
                }
                F();
                this.f5161j.close();
                this.f5161j = null;
                this.f5166o = true;
                return;
            }
            this.f5166o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.f5165n) {
            return;
        }
        a();
        F();
        this.f5161j.flush();
    }

    public void g() {
        close();
        this.f5152a.deleteContents(this.f5153b);
    }

    public synchronized boolean isClosed() {
        return this.f5166o;
    }

    public c l(String str) {
        return m(str, -1L);
    }

    synchronized c m(String str, long j8) {
        o();
        a();
        G(str);
        C0080d c0080d = (C0080d) this.f5162k.get(str);
        if (j8 != -1 && (c0080d == null || c0080d.f5185g != j8)) {
            return null;
        }
        if (c0080d != null && c0080d.f5184f != null) {
            return null;
        }
        if (!this.f5167p && !this.f5168q) {
            this.f5161j.writeUtf8("DIRTY").writeByte(32).writeUtf8(str).writeByte(10);
            this.f5161j.flush();
            if (this.f5164m) {
                return null;
            }
            if (c0080d == null) {
                c0080d = new C0080d(str);
                this.f5162k.put(str, c0080d);
            }
            c cVar = new c(c0080d);
            c0080d.f5184f = cVar;
            return cVar;
        }
        this.f5170s.execute(this.f5171t);
        return null;
    }

    public synchronized e n(String str) {
        o();
        a();
        G(str);
        C0080d c0080d = (C0080d) this.f5162k.get(str);
        if (c0080d != null && c0080d.f5183e) {
            e c8 = c0080d.c();
            if (c8 == null) {
                return null;
            }
            this.f5163l++;
            this.f5161j.writeUtf8("READ").writeByte(32).writeUtf8(str).writeByte(10);
            if (s()) {
                this.f5170s.execute(this.f5171t);
            }
            return c8;
        }
        return null;
    }

    public synchronized void o() {
        try {
            if (this.f5165n) {
                return;
            }
            if (this.f5152a.exists(this.f5156e)) {
                if (this.f5152a.exists(this.f5154c)) {
                    this.f5152a.delete(this.f5156e);
                } else {
                    this.f5152a.rename(this.f5156e, this.f5154c);
                }
            }
            if (this.f5152a.exists(this.f5154c)) {
                try {
                    x();
                    v();
                    this.f5165n = true;
                    return;
                } catch (IOException e8) {
                    Q6.f.i().p(5, "DiskLruCache " + this.f5153b + " is corrupt: " + e8.getMessage() + ", removing", e8);
                    try {
                        g();
                        this.f5166o = false;
                    } catch (Throwable th) {
                        this.f5166o = false;
                        throw th;
                    }
                }
            }
            A();
            this.f5165n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    boolean s() {
        int i8 = this.f5163l;
        if (i8 >= 2000 && i8 >= this.f5162k.size()) {
            return true;
        }
        return false;
    }
}
