package kotlin.reflect.x.internal.l0.e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.x.internal.l0.e.q;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class u extends h.d<u> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final u f20631h;

    /* renamed from: i, reason: collision with root package name */
    public static q<u> f20632i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final d f20633j;

    /* renamed from: k, reason: collision with root package name */
    private int f20634k;
    private int l;
    private int m;
    private q n;
    private int o;
    private q p;
    private int q;
    private byte r;
    private int s;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<u> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public u b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new u(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.c<u, b> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20635i;

        /* renamed from: j, reason: collision with root package name */
        private int f20636j;

        /* renamed from: k, reason: collision with root package name */
        private int f20637k;
        private int m;
        private int o;
        private q l = q.Z();
        private q n = q.Z();

        private b() {
            y();
        }

        static /* synthetic */ b s() {
            return x();
        }

        private static b x() {
            return new b();
        }

        private void y() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m(u uVar) {
            if (uVar == u.K()) {
                return this;
            }
            if (uVar.S()) {
                F(uVar.M());
            }
            if (uVar.T()) {
                G(uVar.N());
            }
            if (uVar.U()) {
                C(uVar.O());
            }
            if (uVar.V()) {
                H(uVar.P());
            }
            if (uVar.W()) {
                E(uVar.Q());
            }
            if (uVar.X()) {
                I(uVar.R());
            }
            r(uVar);
            n(l().b(uVar.f20633j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.u.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.u> r1 = kotlin.reflect.x.internal.l0.e.u.f20632i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.u r3 = (kotlin.reflect.x.internal.l0.e.u) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                kotlin.f0.x.e.l0.e.u r4 = (kotlin.reflect.x.internal.l0.e.u) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.u.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.u$b");
        }

        public b C(q qVar) {
            if ((this.f20635i & 4) == 4 && this.l != q.Z()) {
                this.l = q.A0(this.l).m(qVar).u();
            } else {
                this.l = qVar;
            }
            this.f20635i |= 4;
            return this;
        }

        public b E(q qVar) {
            if ((this.f20635i & 16) == 16 && this.n != q.Z()) {
                this.n = q.A0(this.n).m(qVar).u();
            } else {
                this.n = qVar;
            }
            this.f20635i |= 16;
            return this;
        }

        public b F(int i2) {
            this.f20635i |= 1;
            this.f20636j = i2;
            return this;
        }

        public b G(int i2) {
            this.f20635i |= 2;
            this.f20637k = i2;
            return this;
        }

        public b H(int i2) {
            this.f20635i |= 8;
            this.m = i2;
            return this;
        }

        public b I(int i2) {
            this.f20635i |= 32;
            this.o = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public u a() {
            u u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public u u() {
            u uVar = new u(this);
            int i2 = this.f20635i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            uVar.l = this.f20636j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            uVar.m = this.f20637k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            uVar.n = this.l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            uVar.o = this.m;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            uVar.p = this.n;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            uVar.q = this.o;
            uVar.f20634k = i3;
            return uVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    static {
        u uVar = new u(true);
        f20631h = uVar;
        uVar.Y();
    }

    public static u K() {
        return f20631h;
    }

    private void Y() {
        this.l = 0;
        this.m = 0;
        this.n = q.Z();
        this.o = 0;
        this.p = q.Z();
        this.q = 0;
    }

    public static b Z() {
        return b.s();
    }

    public static b a0(u uVar) {
        return Z().m(uVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public u b() {
        return f20631h;
    }

    public int M() {
        return this.l;
    }

    public int N() {
        return this.m;
    }

    public q O() {
        return this.n;
    }

    public int P() {
        return this.o;
    }

    public q Q() {
        return this.p;
    }

    public int R() {
        return this.q;
    }

    public boolean S() {
        return (this.f20634k & 1) == 1;
    }

    public boolean T() {
        return (this.f20634k & 2) == 2;
    }

    public boolean U() {
        return (this.f20634k & 4) == 4;
    }

    public boolean V() {
        return (this.f20634k & 8) == 8;
    }

    public boolean W() {
        return (this.f20634k & 16) == 16;
    }

    public boolean X() {
        return (this.f20634k & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return Z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return a0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        if ((this.f20634k & 1) == 1) {
            codedOutputStream.a0(1, this.l);
        }
        if ((this.f20634k & 2) == 2) {
            codedOutputStream.a0(2, this.m);
        }
        if ((this.f20634k & 4) == 4) {
            codedOutputStream.d0(3, this.n);
        }
        if ((this.f20634k & 16) == 16) {
            codedOutputStream.d0(4, this.p);
        }
        if ((this.f20634k & 8) == 8) {
            codedOutputStream.a0(5, this.o);
        }
        if ((this.f20634k & 32) == 32) {
            codedOutputStream.a0(6, this.q);
        }
        A.a(200, codedOutputStream);
        codedOutputStream.i0(this.f20633j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20634k & 1) == 1 ? 0 + CodedOutputStream.o(1, this.l) : 0;
        if ((this.f20634k & 2) == 2) {
            o += CodedOutputStream.o(2, this.m);
        }
        if ((this.f20634k & 4) == 4) {
            o += CodedOutputStream.s(3, this.n);
        }
        if ((this.f20634k & 16) == 16) {
            o += CodedOutputStream.s(4, this.p);
        }
        if ((this.f20634k & 8) == 8) {
            o += CodedOutputStream.o(5, this.o);
        }
        if ((this.f20634k & 32) == 32) {
            o += CodedOutputStream.o(6, this.q);
        }
        int t = o + t() + this.f20633j.size();
        this.s = t;
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<u> h() {
        return f20632i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.r;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!T()) {
            this.r = (byte) 0;
            return false;
        }
        if (U() && !O().isInitialized()) {
            this.r = (byte) 0;
            return false;
        }
        if (W() && !Q().isInitialized()) {
            this.r = (byte) 0;
            return false;
        }
        if (!s()) {
            this.r = (byte) 0;
            return false;
        }
        this.r = (byte) 1;
        return true;
    }

    private u(h.c<u, ?> cVar) {
        super(cVar);
        this.r = (byte) -1;
        this.s = -1;
        this.f20633j = cVar.l();
    }

    private u(boolean z) {
        this.r = (byte) -1;
        this.s = -1;
        this.f20633j = d.f21894f;
    }

    private u(e eVar, f fVar) throws InvalidProtocolBufferException {
        q.c c2;
        this.r = (byte) -1;
        this.s = -1;
        Y();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f20634k |= 1;
                                this.l = eVar.s();
                            } else if (K != 16) {
                                if (K == 26) {
                                    c2 = (this.f20634k & 4) == 4 ? this.n.c() : null;
                                    q qVar = (q) eVar.u(q.f20582i, fVar);
                                    this.n = qVar;
                                    if (c2 != null) {
                                        c2.m(qVar);
                                        this.n = c2.u();
                                    }
                                    this.f20634k |= 4;
                                } else if (K == 34) {
                                    c2 = (this.f20634k & 16) == 16 ? this.p.c() : null;
                                    q qVar2 = (q) eVar.u(q.f20582i, fVar);
                                    this.p = qVar2;
                                    if (c2 != null) {
                                        c2.m(qVar2);
                                        this.p = c2.u();
                                    }
                                    this.f20634k |= 16;
                                } else if (K == 40) {
                                    this.f20634k |= 8;
                                    this.o = eVar.s();
                                } else if (K != 48) {
                                    if (!p(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    this.f20634k |= 32;
                                    this.q = eVar.s();
                                }
                            } else {
                                this.f20634k |= 2;
                                this.m = eVar.s();
                            }
                        }
                        z = true;
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).i(this);
                    }
                } catch (InvalidProtocolBufferException e3) {
                    throw e3.i(this);
                }
            } catch (Throwable th) {
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20633j = O.w();
                    throw th2;
                }
                this.f20633j = O.w();
                m();
                throw th;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20633j = O.w();
            throw th3;
        }
        this.f20633j = O.w();
        m();
    }
}
