package kotlin.reflect.x.internal.l0.e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class v extends h implements p {

    /* renamed from: g, reason: collision with root package name */
    private static final v f20638g;

    /* renamed from: h, reason: collision with root package name */
    public static q<v> f20639h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f20640i;

    /* renamed from: j, reason: collision with root package name */
    private int f20641j;

    /* renamed from: k, reason: collision with root package name */
    private int f20642k;
    private int l;
    private c m;
    private int n;
    private int o;
    private d p;
    private byte q;
    private int r;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<v> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public v b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new v(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.b<v, b> implements p {

        /* renamed from: g, reason: collision with root package name */
        private int f20643g;

        /* renamed from: h, reason: collision with root package name */
        private int f20644h;

        /* renamed from: i, reason: collision with root package name */
        private int f20645i;

        /* renamed from: k, reason: collision with root package name */
        private int f20647k;
        private int l;

        /* renamed from: j, reason: collision with root package name */
        private c f20646j = c.ERROR;
        private d m = d.LANGUAGE_VERSION;

        private b() {
            t();
        }

        static /* synthetic */ b o() {
            return s();
        }

        private static b s() {
            return new b();
        }

        private void t() {
        }

        public b A(int i2) {
            this.f20643g |= 16;
            this.l = i2;
            return this;
        }

        public b B(int i2) {
            this.f20643g |= 1;
            this.f20644h = i2;
            return this;
        }

        public b C(int i2) {
            this.f20643g |= 2;
            this.f20645i = i2;
            return this;
        }

        public b E(d dVar) {
            dVar.getClass();
            this.f20643g |= 32;
            this.m = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public v a() {
            v q = q();
            if (q.isInitialized()) {
                return q;
            }
            throw a.AbstractC0372a.j(q);
        }

        public v q() {
            v vVar = new v(this);
            int i2 = this.f20643g;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            vVar.f20642k = this.f20644h;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            vVar.l = this.f20645i;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            vVar.m = this.f20646j;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            vVar.n = this.f20647k;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            vVar.o = this.l;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            vVar.p = this.m;
            vVar.f20641j = i3;
            return vVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b k() {
            return s().m(q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public b m(v vVar) {
            if (vVar == v.B()) {
                return this;
            }
            if (vVar.L()) {
                B(vVar.F());
            }
            if (vVar.M()) {
                C(vVar.G());
            }
            if (vVar.J()) {
                y(vVar.D());
            }
            if (vVar.I()) {
                x(vVar.C());
            }
            if (vVar.K()) {
                A(vVar.E());
            }
            if (vVar.N()) {
                E(vVar.H());
            }
            n(l().b(vVar.f20640i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.v.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.v> r1 = kotlin.reflect.x.internal.l0.e.v.f20639h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.v r3 = (kotlin.reflect.x.internal.l0.e.v) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.v r4 = (kotlin.reflect.x.internal.l0.e.v) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.v.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.v$b");
        }

        public b x(int i2) {
            this.f20643g |= 8;
            this.f20647k = i2;
            return this;
        }

        public b y(c cVar) {
            cVar.getClass();
            this.f20643g |= 4;
            this.f20646j = cVar;
            return this;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements i.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* renamed from: i, reason: collision with root package name */
        private static i.b<c> f20651i = new a();

        /* renamed from: k, reason: collision with root package name */
        private final int f20653k;

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes2.dex */
        static class a implements i.b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i2) {
                return c.d(i2);
            }
        }

        c(int i2, int i3) {
            this.f20653k = i3;
        }

        public static c d(int i2) {
            if (i2 == 0) {
                return WARNING;
            }
            if (i2 == 1) {
                return ERROR;
            }
            if (i2 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int a() {
            return this.f20653k;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum d implements i.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* renamed from: i, reason: collision with root package name */
        private static i.b<d> f20657i = new a();

        /* renamed from: k, reason: collision with root package name */
        private final int f20659k;

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes2.dex */
        static class a implements i.b<d> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i2) {
                return d.d(i2);
            }
        }

        d(int i2, int i3) {
            this.f20659k = i3;
        }

        public static d d(int i2) {
            if (i2 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i2 == 1) {
                return COMPILER_VERSION;
            }
            if (i2 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int a() {
            return this.f20659k;
        }
    }

    static {
        v vVar = new v(true);
        f20638g = vVar;
        vVar.O();
    }

    public static v B() {
        return f20638g;
    }

    private void O() {
        this.f20642k = 0;
        this.l = 0;
        this.m = c.ERROR;
        this.n = 0;
        this.o = 0;
        this.p = d.LANGUAGE_VERSION;
    }

    public static b P() {
        return b.o();
    }

    public static b Q(v vVar) {
        return P().m(vVar);
    }

    public int C() {
        return this.n;
    }

    public c D() {
        return this.m;
    }

    public int E() {
        return this.o;
    }

    public int F() {
        return this.f20642k;
    }

    public int G() {
        return this.l;
    }

    public d H() {
        return this.p;
    }

    public boolean I() {
        return (this.f20641j & 8) == 8;
    }

    public boolean J() {
        return (this.f20641j & 4) == 4;
    }

    public boolean K() {
        return (this.f20641j & 16) == 16;
    }

    public boolean L() {
        return (this.f20641j & 1) == 1;
    }

    public boolean M() {
        return (this.f20641j & 2) == 2;
    }

    public boolean N() {
        return (this.f20641j & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b g() {
        return P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b c() {
        return Q(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        if ((this.f20641j & 1) == 1) {
            codedOutputStream.a0(1, this.f20642k);
        }
        if ((this.f20641j & 2) == 2) {
            codedOutputStream.a0(2, this.l);
        }
        if ((this.f20641j & 4) == 4) {
            codedOutputStream.S(3, this.m.a());
        }
        if ((this.f20641j & 8) == 8) {
            codedOutputStream.a0(4, this.n);
        }
        if ((this.f20641j & 16) == 16) {
            codedOutputStream.a0(5, this.o);
        }
        if ((this.f20641j & 32) == 32) {
            codedOutputStream.S(6, this.p.a());
        }
        codedOutputStream.i0(this.f20640i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.r;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20641j & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f20642k) : 0;
        if ((this.f20641j & 2) == 2) {
            o += CodedOutputStream.o(2, this.l);
        }
        if ((this.f20641j & 4) == 4) {
            o += CodedOutputStream.h(3, this.m.a());
        }
        if ((this.f20641j & 8) == 8) {
            o += CodedOutputStream.o(4, this.n);
        }
        if ((this.f20641j & 16) == 16) {
            o += CodedOutputStream.o(5, this.o);
        }
        if ((this.f20641j & 32) == 32) {
            o += CodedOutputStream.h(6, this.p.a());
        }
        int size = o + this.f20640i.size();
        this.r = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<v> h() {
        return f20639h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.q;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.q = (byte) 1;
        return true;
    }

    private v(h.b bVar) {
        super(bVar);
        this.q = (byte) -1;
        this.r = -1;
        this.f20640i = bVar.l();
    }

    private v(boolean z) {
        this.q = (byte) -1;
        this.r = -1;
        this.f20640i = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;
    }

    private v(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.q = (byte) -1;
        this.r = -1;
        O();
        d.b O = kotlin.reflect.jvm.internal.impl.protobuf.d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K == 8) {
                            this.f20641j |= 1;
                            this.f20642k = eVar.s();
                        } else if (K == 16) {
                            this.f20641j |= 2;
                            this.l = eVar.s();
                        } else if (K == 24) {
                            int n = eVar.n();
                            c d2 = c.d(n);
                            if (d2 == null) {
                                J.o0(K);
                                J.o0(n);
                            } else {
                                this.f20641j |= 4;
                                this.m = d2;
                            }
                        } else if (K == 32) {
                            this.f20641j |= 8;
                            this.n = eVar.s();
                        } else if (K == 40) {
                            this.f20641j |= 16;
                            this.o = eVar.s();
                        } else if (K != 48) {
                            if (!p(eVar, J, fVar, K)) {
                            }
                        } else {
                            int n2 = eVar.n();
                            d d3 = d.d(n2);
                            if (d3 == null) {
                                J.o0(K);
                                J.o0(n2);
                            } else {
                                this.f20641j |= 32;
                                this.p = d3;
                            }
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                }
            } catch (Throwable th) {
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20640i = O.w();
                    throw th2;
                }
                this.f20640i = O.w();
                m();
                throw th;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20640i = O.w();
            throw th3;
        }
        this.f20640i = O.w();
        m();
    }
}
