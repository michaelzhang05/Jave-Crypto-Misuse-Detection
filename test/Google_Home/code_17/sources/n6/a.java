package N6;

import I6.A;
import I6.q;
import I6.r;
import I6.u;
import I6.x;
import I6.z;
import M6.h;
import M6.i;
import M6.k;
import S6.C1417e;
import S6.C1426n;
import S6.InterfaceC1418f;
import S6.InterfaceC1419g;
import S6.L;
import S6.X;
import S6.Z;
import S6.a0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements M6.c {

    /* renamed from: a, reason: collision with root package name */
    final u f7760a;

    /* renamed from: b, reason: collision with root package name */
    final L6.g f7761b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC1419g f7762c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1418f f7763d;

    /* renamed from: e, reason: collision with root package name */
    int f7764e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f7765f = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public abstract class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        protected final C1426n f7766a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f7767b;

        /* renamed from: c, reason: collision with root package name */
        protected long f7768c;

        private b() {
            this.f7766a = new C1426n(a.this.f7762c.timeout());
            this.f7768c = 0L;
        }

        @Override // S6.Z
        public long C(C1417e c1417e, long j8) {
            try {
                long C8 = a.this.f7762c.C(c1417e, j8);
                if (C8 > 0) {
                    this.f7768c += C8;
                }
                return C8;
            } catch (IOException e8) {
                a(false, e8);
                throw e8;
            }
        }

        protected final void a(boolean z8, IOException iOException) {
            a aVar = a.this;
            int i8 = aVar.f7764e;
            if (i8 == 6) {
                return;
            }
            if (i8 == 5) {
                aVar.d(this.f7766a);
                a aVar2 = a.this;
                aVar2.f7764e = 6;
                L6.g gVar = aVar2.f7761b;
                if (gVar != null) {
                    gVar.q(!z8, aVar2, this.f7768c, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + a.this.f7764e);
        }

        @Override // S6.Z
        public a0 timeout() {
            return this.f7766a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1426n f7770a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7771b;

        c() {
            this.f7770a = new C1426n(a.this.f7763d.timeout());
        }

        @Override // S6.X, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f7771b) {
                return;
            }
            this.f7771b = true;
            a.this.f7763d.writeUtf8("0\r\n\r\n");
            a.this.d(this.f7770a);
            a.this.f7764e = 3;
        }

        @Override // S6.X, java.io.Flushable
        public synchronized void flush() {
            if (this.f7771b) {
                return;
            }
            a.this.f7763d.flush();
        }

        @Override // S6.X
        public void h(C1417e c1417e, long j8) {
            if (!this.f7771b) {
                if (j8 == 0) {
                    return;
                }
                a.this.f7763d.writeHexadecimalUnsignedLong(j8);
                a.this.f7763d.writeUtf8("\r\n");
                a.this.f7763d.h(c1417e, j8);
                a.this.f7763d.writeUtf8("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }

        @Override // S6.X
        public a0 timeout() {
            return this.f7770a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class d extends b {

        /* renamed from: e, reason: collision with root package name */
        private final r f7773e;

        /* renamed from: f, reason: collision with root package name */
        private long f7774f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7775g;

        d(r rVar) {
            super();
            this.f7774f = -1L;
            this.f7775g = true;
            this.f7773e = rVar;
        }

        private void b() {
            if (this.f7774f != -1) {
                a.this.f7762c.readUtf8LineStrict();
            }
            try {
                this.f7774f = a.this.f7762c.readHexadecimalUnsignedLong();
                String trim = a.this.f7762c.readUtf8LineStrict().trim();
                if (this.f7774f >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                    if (this.f7774f == 0) {
                        this.f7775g = false;
                        M6.e.g(a.this.f7760a.h(), this.f7773e, a.this.k());
                        a(true, null);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f7774f + trim + "\"");
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }

        @Override // N6.a.b, S6.Z
        public long C(C1417e c1417e, long j8) {
            if (j8 >= 0) {
                if (!this.f7767b) {
                    if (!this.f7775g) {
                        return -1L;
                    }
                    long j9 = this.f7774f;
                    if (j9 == 0 || j9 == -1) {
                        b();
                        if (!this.f7775g) {
                            return -1L;
                        }
                    }
                    long C8 = super.C(c1417e, Math.min(j8, this.f7774f));
                    if (C8 != -1) {
                        this.f7774f -= C8;
                        return C8;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }

        @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f7767b) {
                return;
            }
            if (this.f7775g && !J6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f7767b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class e implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1426n f7777a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7778b;

        /* renamed from: c, reason: collision with root package name */
        private long f7779c;

        e(long j8) {
            this.f7777a = new C1426n(a.this.f7763d.timeout());
            this.f7779c = j8;
        }

        @Override // S6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f7778b) {
                return;
            }
            this.f7778b = true;
            if (this.f7779c <= 0) {
                a.this.d(this.f7777a);
                a.this.f7764e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // S6.X, java.io.Flushable
        public void flush() {
            if (this.f7778b) {
                return;
            }
            a.this.f7763d.flush();
        }

        @Override // S6.X
        public void h(C1417e c1417e, long j8) {
            if (!this.f7778b) {
                J6.c.c(c1417e.E(), 0L, j8);
                if (j8 <= this.f7779c) {
                    a.this.f7763d.h(c1417e, j8);
                    this.f7779c -= j8;
                    return;
                }
                throw new ProtocolException("expected " + this.f7779c + " bytes but received " + j8);
            }
            throw new IllegalStateException("closed");
        }

        @Override // S6.X
        public a0 timeout() {
            return this.f7777a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class f extends b {

        /* renamed from: e, reason: collision with root package name */
        private long f7781e;

        f(long j8) {
            super();
            this.f7781e = j8;
            if (j8 == 0) {
                a(true, null);
            }
        }

        @Override // N6.a.b, S6.Z
        public long C(C1417e c1417e, long j8) {
            if (j8 >= 0) {
                if (!this.f7767b) {
                    long j9 = this.f7781e;
                    if (j9 == 0) {
                        return -1L;
                    }
                    long C8 = super.C(c1417e, Math.min(j9, j8));
                    if (C8 != -1) {
                        long j10 = this.f7781e - C8;
                        this.f7781e = j10;
                        if (j10 == 0) {
                            a(true, null);
                        }
                        return C8;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }

        @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f7767b) {
                return;
            }
            if (this.f7781e != 0 && !J6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f7767b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class g extends b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f7783e;

        g() {
            super();
        }

        @Override // N6.a.b, S6.Z
        public long C(C1417e c1417e, long j8) {
            if (j8 >= 0) {
                if (!this.f7767b) {
                    if (this.f7783e) {
                        return -1L;
                    }
                    long C8 = super.C(c1417e, j8);
                    if (C8 == -1) {
                        this.f7783e = true;
                        a(true, null);
                        return -1L;
                    }
                    return C8;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }

        @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f7767b) {
                return;
            }
            if (!this.f7783e) {
                a(false, null);
            }
            this.f7767b = true;
        }
    }

    public a(u uVar, L6.g gVar, InterfaceC1419g interfaceC1419g, InterfaceC1418f interfaceC1418f) {
        this.f7760a = uVar;
        this.f7761b = gVar;
        this.f7762c = interfaceC1419g;
        this.f7763d = interfaceC1418f;
    }

    private String j() {
        String readUtf8LineStrict = this.f7762c.readUtf8LineStrict(this.f7765f);
        this.f7765f -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    @Override // M6.c
    public void a(x xVar) {
        l(xVar.d(), i.a(xVar, this.f7761b.c().p().b().type()));
    }

    @Override // M6.c
    public X b(x xVar, long j8) {
        if ("chunked".equalsIgnoreCase(xVar.c("Transfer-Encoding"))) {
            return e();
        }
        if (j8 != -1) {
            return g(j8);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // M6.c
    public A c(z zVar) {
        L6.g gVar = this.f7761b;
        gVar.f6315f.q(gVar.f6314e);
        String m8 = zVar.m("Content-Type");
        if (!M6.e.c(zVar)) {
            return new h(m8, 0L, L.d(h(0L)));
        }
        if ("chunked".equalsIgnoreCase(zVar.m("Transfer-Encoding"))) {
            return new h(m8, -1L, L.d(f(zVar.E().i())));
        }
        long b8 = M6.e.b(zVar);
        if (b8 != -1) {
            return new h(m8, b8, L.d(h(b8)));
        }
        return new h(m8, -1L, L.d(i()));
    }

    void d(C1426n c1426n) {
        a0 i8 = c1426n.i();
        c1426n.j(a0.f9862e);
        i8.a();
        i8.b();
    }

    public X e() {
        if (this.f7764e == 1) {
            this.f7764e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f7764e);
    }

    public Z f(r rVar) {
        if (this.f7764e == 4) {
            this.f7764e = 5;
            return new d(rVar);
        }
        throw new IllegalStateException("state: " + this.f7764e);
    }

    @Override // M6.c
    public void finishRequest() {
        this.f7763d.flush();
    }

    @Override // M6.c
    public void flushRequest() {
        this.f7763d.flush();
    }

    public X g(long j8) {
        if (this.f7764e == 1) {
            this.f7764e = 2;
            return new e(j8);
        }
        throw new IllegalStateException("state: " + this.f7764e);
    }

    public Z h(long j8) {
        if (this.f7764e == 4) {
            this.f7764e = 5;
            return new f(j8);
        }
        throw new IllegalStateException("state: " + this.f7764e);
    }

    public Z i() {
        if (this.f7764e == 4) {
            L6.g gVar = this.f7761b;
            if (gVar != null) {
                this.f7764e = 5;
                gVar.i();
                return new g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f7764e);
    }

    public q k() {
        q.a aVar = new q.a();
        while (true) {
            String j8 = j();
            if (j8.length() != 0) {
                J6.a.f4937a.a(aVar, j8);
            } else {
                return aVar.d();
            }
        }
    }

    public void l(q qVar, String str) {
        if (this.f7764e == 0) {
            this.f7763d.writeUtf8(str).writeUtf8("\r\n");
            int e8 = qVar.e();
            for (int i8 = 0; i8 < e8; i8++) {
                this.f7763d.writeUtf8(qVar.c(i8)).writeUtf8(": ").writeUtf8(qVar.f(i8)).writeUtf8("\r\n");
            }
            this.f7763d.writeUtf8("\r\n");
            this.f7764e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f7764e);
    }

    @Override // M6.c
    public z.a readResponseHeaders(boolean z8) {
        int i8 = this.f7764e;
        if (i8 != 1 && i8 != 3) {
            throw new IllegalStateException("state: " + this.f7764e);
        }
        try {
            k a8 = k.a(j());
            z.a i9 = new z.a().m(a8.f7238a).g(a8.f7239b).j(a8.f7240c).i(k());
            if (z8 && a8.f7239b == 100) {
                return null;
            }
            if (a8.f7239b == 100) {
                this.f7764e = 3;
                return i9;
            }
            this.f7764e = 4;
            return i9;
        } catch (EOFException e8) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f7761b);
            iOException.initCause(e8);
            throw iOException;
        }
    }
}
