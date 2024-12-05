package K6;

import F6.A;
import F6.q;
import F6.r;
import F6.u;
import F6.x;
import F6.z;
import J6.h;
import J6.i;
import J6.k;
import P6.C1279e;
import P6.C1288n;
import P6.InterfaceC1280f;
import P6.InterfaceC1281g;
import P6.L;
import P6.X;
import P6.Z;
import P6.a0;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements J6.c {

    /* renamed from: a, reason: collision with root package name */
    final u f5981a;

    /* renamed from: b, reason: collision with root package name */
    final I6.g f5982b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC1281g f5983c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1280f f5984d;

    /* renamed from: e, reason: collision with root package name */
    int f5985e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f5986f = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public abstract class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        protected final C1288n f5987a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f5988b;

        /* renamed from: c, reason: collision with root package name */
        protected long f5989c;

        private b() {
            this.f5987a = new C1288n(a.this.f5983c.timeout());
            this.f5989c = 0L;
        }

        protected final void a(boolean z8, IOException iOException) {
            a aVar = a.this;
            int i8 = aVar.f5985e;
            if (i8 == 6) {
                return;
            }
            if (i8 == 5) {
                aVar.d(this.f5987a);
                a aVar2 = a.this;
                aVar2.f5985e = 6;
                I6.g gVar = aVar2.f5982b;
                if (gVar != null) {
                    gVar.q(!z8, aVar2, this.f5989c, iOException);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + a.this.f5985e);
        }

        @Override // P6.Z
        public a0 timeout() {
            return this.f5987a;
        }

        @Override // P6.Z
        public long y(C1279e c1279e, long j8) {
            try {
                long y8 = a.this.f5983c.y(c1279e, j8);
                if (y8 > 0) {
                    this.f5989c += y8;
                }
                return y8;
            } catch (IOException e8) {
                a(false, e8);
                throw e8;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1288n f5991a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5992b;

        c() {
            this.f5991a = new C1288n(a.this.f5984d.timeout());
        }

        @Override // P6.X
        public void C(C1279e c1279e, long j8) {
            if (!this.f5992b) {
                if (j8 == 0) {
                    return;
                }
                a.this.f5984d.writeHexadecimalUnsignedLong(j8);
                a.this.f5984d.writeUtf8("\r\n");
                a.this.f5984d.C(c1279e, j8);
                a.this.f5984d.writeUtf8("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f5992b) {
                return;
            }
            this.f5992b = true;
            a.this.f5984d.writeUtf8("0\r\n\r\n");
            a.this.d(this.f5991a);
            a.this.f5985e = 3;
        }

        @Override // P6.X, java.io.Flushable
        public synchronized void flush() {
            if (this.f5992b) {
                return;
            }
            a.this.f5984d.flush();
        }

        @Override // P6.X
        public a0 timeout() {
            return this.f5991a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class d extends b {

        /* renamed from: e, reason: collision with root package name */
        private final r f5994e;

        /* renamed from: f, reason: collision with root package name */
        private long f5995f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5996g;

        d(r rVar) {
            super();
            this.f5995f = -1L;
            this.f5996g = true;
            this.f5994e = rVar;
        }

        private void b() {
            if (this.f5995f != -1) {
                a.this.f5983c.readUtf8LineStrict();
            }
            try {
                this.f5995f = a.this.f5983c.readHexadecimalUnsignedLong();
                String trim = a.this.f5983c.readUtf8LineStrict().trim();
                if (this.f5995f >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                    if (this.f5995f == 0) {
                        this.f5996g = false;
                        J6.e.g(a.this.f5981a.h(), this.f5994e, a.this.k());
                        a(true, null);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f5995f + trim + "\"");
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5988b) {
                return;
            }
            if (this.f5996g && !G6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f5988b = true;
        }

        @Override // K6.a.b, P6.Z
        public long y(C1279e c1279e, long j8) {
            if (j8 >= 0) {
                if (!this.f5988b) {
                    if (!this.f5996g) {
                        return -1L;
                    }
                    long j9 = this.f5995f;
                    if (j9 == 0 || j9 == -1) {
                        b();
                        if (!this.f5996g) {
                            return -1L;
                        }
                    }
                    long y8 = super.y(c1279e, Math.min(j8, this.f5995f));
                    if (y8 != -1) {
                        this.f5995f -= y8;
                        return y8;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class e implements X {

        /* renamed from: a, reason: collision with root package name */
        private final C1288n f5998a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f5999b;

        /* renamed from: c, reason: collision with root package name */
        private long f6000c;

        e(long j8) {
            this.f5998a = new C1288n(a.this.f5984d.timeout());
            this.f6000c = j8;
        }

        @Override // P6.X
        public void C(C1279e c1279e, long j8) {
            if (!this.f5999b) {
                G6.c.c(c1279e.x(), 0L, j8);
                if (j8 <= this.f6000c) {
                    a.this.f5984d.C(c1279e, j8);
                    this.f6000c -= j8;
                    return;
                }
                throw new ProtocolException("expected " + this.f6000c + " bytes but received " + j8);
            }
            throw new IllegalStateException("closed");
        }

        @Override // P6.X, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5999b) {
                return;
            }
            this.f5999b = true;
            if (this.f6000c <= 0) {
                a.this.d(this.f5998a);
                a.this.f5985e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // P6.X, java.io.Flushable
        public void flush() {
            if (this.f5999b) {
                return;
            }
            a.this.f5984d.flush();
        }

        @Override // P6.X
        public a0 timeout() {
            return this.f5998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class f extends b {

        /* renamed from: e, reason: collision with root package name */
        private long f6002e;

        f(long j8) {
            super();
            this.f6002e = j8;
            if (j8 == 0) {
                a(true, null);
            }
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5988b) {
                return;
            }
            if (this.f6002e != 0 && !G6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                a(false, null);
            }
            this.f5988b = true;
        }

        @Override // K6.a.b, P6.Z
        public long y(C1279e c1279e, long j8) {
            if (j8 >= 0) {
                if (!this.f5988b) {
                    long j9 = this.f6002e;
                    if (j9 == 0) {
                        return -1L;
                    }
                    long y8 = super.y(c1279e, Math.min(j9, j8));
                    if (y8 != -1) {
                        long j10 = this.f6002e - y8;
                        this.f6002e = j10;
                        if (j10 == 0) {
                            a(true, null);
                        }
                        return y8;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class g extends b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f6004e;

        g() {
            super();
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f5988b) {
                return;
            }
            if (!this.f6004e) {
                a(false, null);
            }
            this.f5988b = true;
        }

        @Override // K6.a.b, P6.Z
        public long y(C1279e c1279e, long j8) {
            if (j8 >= 0) {
                if (!this.f5988b) {
                    if (this.f6004e) {
                        return -1L;
                    }
                    long y8 = super.y(c1279e, j8);
                    if (y8 == -1) {
                        this.f6004e = true;
                        a(true, null);
                        return -1L;
                    }
                    return y8;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }

    public a(u uVar, I6.g gVar, InterfaceC1281g interfaceC1281g, InterfaceC1280f interfaceC1280f) {
        this.f5981a = uVar;
        this.f5982b = gVar;
        this.f5983c = interfaceC1281g;
        this.f5984d = interfaceC1280f;
    }

    private String j() {
        String readUtf8LineStrict = this.f5983c.readUtf8LineStrict(this.f5986f);
        this.f5986f -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    @Override // J6.c
    public A a(z zVar) {
        I6.g gVar = this.f5982b;
        gVar.f4320f.q(gVar.f4319e);
        String h8 = zVar.h("Content-Type");
        if (!J6.e.c(zVar)) {
            return new h(h8, 0L, L.d(h(0L)));
        }
        if ("chunked".equalsIgnoreCase(zVar.h("Transfer-Encoding"))) {
            return new h(h8, -1L, L.d(f(zVar.E().i())));
        }
        long b8 = J6.e.b(zVar);
        if (b8 != -1) {
            return new h(h8, b8, L.d(h(b8)));
        }
        return new h(h8, -1L, L.d(i()));
    }

    @Override // J6.c
    public X b(x xVar, long j8) {
        if ("chunked".equalsIgnoreCase(xVar.c("Transfer-Encoding"))) {
            return e();
        }
        if (j8 != -1) {
            return g(j8);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // J6.c
    public void c(x xVar) {
        l(xVar.d(), i.a(xVar, this.f5982b.c().p().b().type()));
    }

    void d(C1288n c1288n) {
        a0 i8 = c1288n.i();
        c1288n.j(a0.f8031e);
        i8.a();
        i8.b();
    }

    public X e() {
        if (this.f5985e == 1) {
            this.f5985e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f5985e);
    }

    public Z f(r rVar) {
        if (this.f5985e == 4) {
            this.f5985e = 5;
            return new d(rVar);
        }
        throw new IllegalStateException("state: " + this.f5985e);
    }

    @Override // J6.c
    public void finishRequest() {
        this.f5984d.flush();
    }

    @Override // J6.c
    public void flushRequest() {
        this.f5984d.flush();
    }

    public X g(long j8) {
        if (this.f5985e == 1) {
            this.f5985e = 2;
            return new e(j8);
        }
        throw new IllegalStateException("state: " + this.f5985e);
    }

    public Z h(long j8) {
        if (this.f5985e == 4) {
            this.f5985e = 5;
            return new f(j8);
        }
        throw new IllegalStateException("state: " + this.f5985e);
    }

    public Z i() {
        if (this.f5985e == 4) {
            I6.g gVar = this.f5982b;
            if (gVar != null) {
                this.f5985e = 5;
                gVar.i();
                return new g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f5985e);
    }

    public q k() {
        q.a aVar = new q.a();
        while (true) {
            String j8 = j();
            if (j8.length() != 0) {
                G6.a.f3218a.a(aVar, j8);
            } else {
                return aVar.d();
            }
        }
    }

    public void l(q qVar, String str) {
        if (this.f5985e == 0) {
            this.f5984d.writeUtf8(str).writeUtf8("\r\n");
            int e8 = qVar.e();
            for (int i8 = 0; i8 < e8; i8++) {
                this.f5984d.writeUtf8(qVar.c(i8)).writeUtf8(": ").writeUtf8(qVar.f(i8)).writeUtf8("\r\n");
            }
            this.f5984d.writeUtf8("\r\n");
            this.f5985e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f5985e);
    }

    @Override // J6.c
    public z.a readResponseHeaders(boolean z8) {
        int i8 = this.f5985e;
        if (i8 != 1 && i8 != 3) {
            throw new IllegalStateException("state: " + this.f5985e);
        }
        try {
            k a8 = k.a(j());
            z.a i9 = new z.a().m(a8.f5532a).g(a8.f5533b).j(a8.f5534c).i(k());
            if (z8 && a8.f5533b == 100) {
                return null;
            }
            if (a8.f5533b == 100) {
                this.f5985e = 3;
                return i9;
            }
            this.f5985e = 4;
            return i9;
        } catch (EOFException e8) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f5982b);
            iOException.initCause(e8);
            throw iOException;
        }
    }
}
