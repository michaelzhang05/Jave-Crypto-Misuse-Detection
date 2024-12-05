package kotlin.reflect.x.internal.l0.e;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public final class b extends h implements p {

    /* renamed from: g, reason: collision with root package name */
    private static final b f20409g;

    /* renamed from: h, reason: collision with root package name */
    public static q<b> f20410h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final d f20411i;

    /* renamed from: j, reason: collision with root package name */
    private int f20412j;

    /* renamed from: k, reason: collision with root package name */
    private int f20413k;
    private List<C0320b> l;
    private byte m;
    private int n;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new b(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.x.e.l0.e.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0320b extends h implements p {

        /* renamed from: g, reason: collision with root package name */
        private static final C0320b f20414g;

        /* renamed from: h, reason: collision with root package name */
        public static q<C0320b> f20415h = new a();

        /* renamed from: i, reason: collision with root package name */
        private final d f20416i;

        /* renamed from: j, reason: collision with root package name */
        private int f20417j;

        /* renamed from: k, reason: collision with root package name */
        private int f20418k;
        private c l;
        private byte m;
        private int n;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.b$b$a */
        /* loaded from: classes2.dex */
        static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C0320b> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C0320b b(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new C0320b(eVar, fVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0321b extends h.b<C0320b, C0321b> implements p {

            /* renamed from: g, reason: collision with root package name */
            private int f20419g;

            /* renamed from: h, reason: collision with root package name */
            private int f20420h;

            /* renamed from: i, reason: collision with root package name */
            private c f20421i = c.N();

            private C0321b() {
                t();
            }

            static /* synthetic */ C0321b o() {
                return s();
            }

            private static C0321b s() {
                return new C0321b();
            }

            private void t() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0320b a() {
                C0320b q = q();
                if (q.isInitialized()) {
                    return q;
                }
                throw a.AbstractC0372a.j(q);
            }

            public C0320b q() {
                C0320b c0320b = new C0320b(this);
                int i2 = this.f20419g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                c0320b.f20418k = this.f20420h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                c0320b.l = this.f20421i;
                c0320b.f20417j = i3;
                return c0320b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0321b k() {
                return s().m(q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0321b m(C0320b c0320b) {
                if (c0320b == C0320b.v()) {
                    return this;
                }
                if (c0320b.A()) {
                    y(c0320b.y());
                }
                if (c0320b.B()) {
                    x(c0320b.z());
                }
                n(l().b(c0320b.f20416i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.x.internal.l0.e.b.C0320b.C0321b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.b$b> r1 = kotlin.reflect.x.internal.l0.e.b.C0320b.f20415h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.x.e.l0.e.b$b r3 = (kotlin.reflect.x.internal.l0.e.b.C0320b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.x.e.l0.e.b$b r4 = (kotlin.reflect.x.internal.l0.e.b.C0320b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.e.b.C0320b.C0321b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.b$b$b");
            }

            public C0321b x(c cVar) {
                if ((this.f20419g & 2) == 2 && this.f20421i != c.N()) {
                    this.f20421i = c.h0(this.f20421i).m(cVar).q();
                } else {
                    this.f20421i = cVar;
                }
                this.f20419g |= 2;
                return this;
            }

            public C0321b y(int i2) {
                this.f20419g |= 1;
                this.f20420h = i2;
                return this;
            }
        }

        static {
            C0320b c0320b = new C0320b(true);
            f20414g = c0320b;
            c0320b.C();
        }

        private void C() {
            this.f20418k = 0;
            this.l = c.N();
        }

        public static C0321b D() {
            return C0321b.o();
        }

        public static C0321b E(C0320b c0320b) {
            return D().m(c0320b);
        }

        public static C0320b v() {
            return f20414g;
        }

        public boolean A() {
            return (this.f20417j & 1) == 1;
        }

        public boolean B() {
            return (this.f20417j & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public C0321b g() {
            return D();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public C0321b c() {
            return E(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.f20417j & 1) == 1) {
                codedOutputStream.a0(1, this.f20418k);
            }
            if ((this.f20417j & 2) == 2) {
                codedOutputStream.d0(2, this.l);
            }
            codedOutputStream.i0(this.f20416i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int e() {
            int i2 = this.n;
            if (i2 != -1) {
                return i2;
            }
            int o = (this.f20417j & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f20418k) : 0;
            if ((this.f20417j & 2) == 2) {
                o += CodedOutputStream.s(2, this.l);
            }
            int size = o + this.f20416i.size();
            this.n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<C0320b> h() {
            return f20415h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b2 = this.m;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!A()) {
                this.m = (byte) 0;
                return false;
            }
            if (!B()) {
                this.m = (byte) 0;
                return false;
            }
            if (!z().isInitialized()) {
                this.m = (byte) 0;
                return false;
            }
            this.m = (byte) 1;
            return true;
        }

        public int y() {
            return this.f20418k;
        }

        public c z() {
            return this.l;
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.b$b$c */
        /* loaded from: classes2.dex */
        public static final class c extends h implements p {

            /* renamed from: g, reason: collision with root package name */
            private static final c f20422g;

            /* renamed from: h, reason: collision with root package name */
            public static q<c> f20423h = new a();

            /* renamed from: i, reason: collision with root package name */
            private final d f20424i;

            /* renamed from: j, reason: collision with root package name */
            private int f20425j;

            /* renamed from: k, reason: collision with root package name */
            private EnumC0323c f20426k;
            private long l;
            private float m;
            private double n;
            private int o;
            private int p;
            private int q;
            private b r;
            private List<c> s;
            private int t;
            private int u;
            private byte v;
            private int w;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.x.e.l0.e.b$b$c$a */
            /* loaded from: classes2.dex */
            static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c b(e eVar, f fVar) throws InvalidProtocolBufferException {
                    return new c(eVar, fVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.x.e.l0.e.b$b$c$b, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0322b extends h.b<c, C0322b> implements p {

                /* renamed from: g, reason: collision with root package name */
                private int f20427g;

                /* renamed from: i, reason: collision with root package name */
                private long f20429i;

                /* renamed from: j, reason: collision with root package name */
                private float f20430j;

                /* renamed from: k, reason: collision with root package name */
                private double f20431k;
                private int l;
                private int m;
                private int n;
                private int q;
                private int r;

                /* renamed from: h, reason: collision with root package name */
                private EnumC0323c f20428h = EnumC0323c.BYTE;
                private b o = b.B();
                private List<c> p = Collections.emptyList();

                private C0322b() {
                    u();
                }

                static /* synthetic */ C0322b o() {
                    return s();
                }

                private static C0322b s() {
                    return new C0322b();
                }

                private void t() {
                    if ((this.f20427g & 256) != 256) {
                        this.p = new ArrayList(this.p);
                        this.f20427g |= 256;
                    }
                }

                private void u() {
                }

                public C0322b A(int i2) {
                    this.f20427g |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    this.q = i2;
                    return this;
                }

                public C0322b B(int i2) {
                    this.f20427g |= 32;
                    this.m = i2;
                    return this;
                }

                public C0322b C(double d2) {
                    this.f20427g |= 8;
                    this.f20431k = d2;
                    return this;
                }

                public C0322b E(int i2) {
                    this.f20427g |= 64;
                    this.n = i2;
                    return this;
                }

                public C0322b F(int i2) {
                    this.f20427g |= 1024;
                    this.r = i2;
                    return this;
                }

                public C0322b G(float f2) {
                    this.f20427g |= 4;
                    this.f20430j = f2;
                    return this;
                }

                public C0322b H(long j2) {
                    this.f20427g |= 2;
                    this.f20429i = j2;
                    return this;
                }

                public C0322b I(int i2) {
                    this.f20427g |= 16;
                    this.l = i2;
                    return this;
                }

                public C0322b K(EnumC0323c enumC0323c) {
                    enumC0323c.getClass();
                    this.f20427g |= 1;
                    this.f20428h = enumC0323c;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public c a() {
                    c q = q();
                    if (q.isInitialized()) {
                        return q;
                    }
                    throw a.AbstractC0372a.j(q);
                }

                public c q() {
                    c cVar = new c(this);
                    int i2 = this.f20427g;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    cVar.f20426k = this.f20428h;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    cVar.l = this.f20429i;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    cVar.m = this.f20430j;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    cVar.n = this.f20431k;
                    if ((i2 & 16) == 16) {
                        i3 |= 16;
                    }
                    cVar.o = this.l;
                    if ((i2 & 32) == 32) {
                        i3 |= 32;
                    }
                    cVar.p = this.m;
                    if ((i2 & 64) == 64) {
                        i3 |= 64;
                    }
                    cVar.q = this.n;
                    if ((i2 & 128) == 128) {
                        i3 |= 128;
                    }
                    cVar.r = this.o;
                    if ((this.f20427g & 256) == 256) {
                        this.p = Collections.unmodifiableList(this.p);
                        this.f20427g &= -257;
                    }
                    cVar.s = this.p;
                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        i3 |= 256;
                    }
                    cVar.t = this.q;
                    if ((i2 & 1024) == 1024) {
                        i3 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    }
                    cVar.u = this.r;
                    cVar.f20425j = i3;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C0322b k() {
                    return s().m(q());
                }

                public C0322b v(b bVar) {
                    if ((this.f20427g & 128) == 128 && this.o != b.B()) {
                        this.o = b.G(this.o).m(bVar).q();
                    } else {
                        this.o = bVar;
                    }
                    this.f20427g |= 128;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C0322b m(c cVar) {
                    if (cVar == c.N()) {
                        return this;
                    }
                    if (cVar.e0()) {
                        K(cVar.U());
                    }
                    if (cVar.c0()) {
                        H(cVar.S());
                    }
                    if (cVar.b0()) {
                        G(cVar.R());
                    }
                    if (cVar.Y()) {
                        C(cVar.O());
                    }
                    if (cVar.d0()) {
                        I(cVar.T());
                    }
                    if (cVar.X()) {
                        B(cVar.M());
                    }
                    if (cVar.Z()) {
                        E(cVar.P());
                    }
                    if (cVar.V()) {
                        v(cVar.H());
                    }
                    if (!cVar.s.isEmpty()) {
                        if (this.p.isEmpty()) {
                            this.p = cVar.s;
                            this.f20427g &= -257;
                        } else {
                            t();
                            this.p.addAll(cVar.s);
                        }
                    }
                    if (cVar.W()) {
                        A(cVar.I());
                    }
                    if (cVar.a0()) {
                        F(cVar.Q());
                    }
                    n(l().b(cVar.f20424i));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.x.internal.l0.e.b.C0320b.c.C0322b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.b$b$c> r1 = kotlin.reflect.x.internal.l0.e.b.C0320b.c.f20423h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.f0.x.e.l0.e.b$b$c r3 = (kotlin.reflect.x.internal.l0.e.b.C0320b.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.f0.x.e.l0.e.b$b$c r4 = (kotlin.reflect.x.internal.l0.e.b.C0320b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.e.b.C0320b.c.C0322b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.b$b$c$b");
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.x.e.l0.e.b$b$c$c, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public enum EnumC0323c implements i.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);

                private static i.b<EnumC0323c> s = new a();
                private final int u;

                /* compiled from: ProtoBuf.java */
                /* renamed from: kotlin.f0.x.e.l0.e.b$b$c$c$a */
                /* loaded from: classes2.dex */
                static class a implements i.b<EnumC0323c> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0323c a(int i2) {
                        return EnumC0323c.d(i2);
                    }
                }

                EnumC0323c(int i2, int i3) {
                    this.u = i3;
                }

                public static EnumC0323c d(int i2) {
                    switch (i2) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int a() {
                    return this.u;
                }
            }

            static {
                c cVar = new c(true);
                f20422g = cVar;
                cVar.f0();
            }

            public static c N() {
                return f20422g;
            }

            private void f0() {
                this.f20426k = EnumC0323c.BYTE;
                this.l = 0L;
                this.m = 0.0f;
                this.n = 0.0d;
                this.o = 0;
                this.p = 0;
                this.q = 0;
                this.r = b.B();
                this.s = Collections.emptyList();
                this.t = 0;
                this.u = 0;
            }

            public static C0322b g0() {
                return C0322b.o();
            }

            public static C0322b h0(c cVar) {
                return g0().m(cVar);
            }

            public b H() {
                return this.r;
            }

            public int I() {
                return this.t;
            }

            public c J(int i2) {
                return this.s.get(i2);
            }

            public int K() {
                return this.s.size();
            }

            public List<c> L() {
                return this.s;
            }

            public int M() {
                return this.p;
            }

            public double O() {
                return this.n;
            }

            public int P() {
                return this.q;
            }

            public int Q() {
                return this.u;
            }

            public float R() {
                return this.m;
            }

            public long S() {
                return this.l;
            }

            public int T() {
                return this.o;
            }

            public EnumC0323c U() {
                return this.f20426k;
            }

            public boolean V() {
                return (this.f20425j & 128) == 128;
            }

            public boolean W() {
                return (this.f20425j & 256) == 256;
            }

            public boolean X() {
                return (this.f20425j & 32) == 32;
            }

            public boolean Y() {
                return (this.f20425j & 8) == 8;
            }

            public boolean Z() {
                return (this.f20425j & 64) == 64;
            }

            public boolean a0() {
                return (this.f20425j & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
            }

            public boolean b0() {
                return (this.f20425j & 4) == 4;
            }

            public boolean c0() {
                return (this.f20425j & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void d(CodedOutputStream codedOutputStream) throws IOException {
                e();
                if ((this.f20425j & 1) == 1) {
                    codedOutputStream.S(1, this.f20426k.a());
                }
                if ((this.f20425j & 2) == 2) {
                    codedOutputStream.t0(2, this.l);
                }
                if ((this.f20425j & 4) == 4) {
                    codedOutputStream.W(3, this.m);
                }
                if ((this.f20425j & 8) == 8) {
                    codedOutputStream.Q(4, this.n);
                }
                if ((this.f20425j & 16) == 16) {
                    codedOutputStream.a0(5, this.o);
                }
                if ((this.f20425j & 32) == 32) {
                    codedOutputStream.a0(6, this.p);
                }
                if ((this.f20425j & 64) == 64) {
                    codedOutputStream.a0(7, this.q);
                }
                if ((this.f20425j & 128) == 128) {
                    codedOutputStream.d0(8, this.r);
                }
                for (int i2 = 0; i2 < this.s.size(); i2++) {
                    codedOutputStream.d0(9, this.s.get(i2));
                }
                if ((this.f20425j & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    codedOutputStream.a0(10, this.u);
                }
                if ((this.f20425j & 256) == 256) {
                    codedOutputStream.a0(11, this.t);
                }
                codedOutputStream.i0(this.f20424i);
            }

            public boolean d0() {
                return (this.f20425j & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int e() {
                int i2 = this.w;
                if (i2 != -1) {
                    return i2;
                }
                int h2 = (this.f20425j & 1) == 1 ? CodedOutputStream.h(1, this.f20426k.a()) + 0 : 0;
                if ((this.f20425j & 2) == 2) {
                    h2 += CodedOutputStream.A(2, this.l);
                }
                if ((this.f20425j & 4) == 4) {
                    h2 += CodedOutputStream.l(3, this.m);
                }
                if ((this.f20425j & 8) == 8) {
                    h2 += CodedOutputStream.f(4, this.n);
                }
                if ((this.f20425j & 16) == 16) {
                    h2 += CodedOutputStream.o(5, this.o);
                }
                if ((this.f20425j & 32) == 32) {
                    h2 += CodedOutputStream.o(6, this.p);
                }
                if ((this.f20425j & 64) == 64) {
                    h2 += CodedOutputStream.o(7, this.q);
                }
                if ((this.f20425j & 128) == 128) {
                    h2 += CodedOutputStream.s(8, this.r);
                }
                for (int i3 = 0; i3 < this.s.size(); i3++) {
                    h2 += CodedOutputStream.s(9, this.s.get(i3));
                }
                if ((this.f20425j & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    h2 += CodedOutputStream.o(10, this.u);
                }
                if ((this.f20425j & 256) == 256) {
                    h2 += CodedOutputStream.o(11, this.t);
                }
                int size = h2 + this.f20424i.size();
                this.w = size;
                return size;
            }

            public boolean e0() {
                return (this.f20425j & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public q<c> h() {
                return f20423h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: i0, reason: merged with bridge method [inline-methods] */
            public C0322b g() {
                return g0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean isInitialized() {
                byte b2 = this.v;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if (V() && !H().isInitialized()) {
                    this.v = (byte) 0;
                    return false;
                }
                for (int i2 = 0; i2 < K(); i2++) {
                    if (!J(i2).isInitialized()) {
                        this.v = (byte) 0;
                        return false;
                    }
                }
                this.v = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: j0, reason: merged with bridge method [inline-methods] */
            public C0322b c() {
                return h0(this);
            }

            private c(h.b bVar) {
                super(bVar);
                this.v = (byte) -1;
                this.w = -1;
                this.f20424i = bVar.l();
            }

            private c(boolean z) {
                this.v = (byte) -1;
                this.w = -1;
                this.f20424i = d.f21894f;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001e. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(e eVar, f fVar) throws InvalidProtocolBufferException {
                this.v = (byte) -1;
                this.w = -1;
                f0();
                d.b O = d.O();
                CodedOutputStream J = CodedOutputStream.J(O, 1);
                boolean z = false;
                int i2 = 0;
                while (true) {
                    ?? r5 = 256;
                    if (!z) {
                        try {
                            try {
                                int K = eVar.K();
                                switch (K) {
                                    case 0:
                                        z = true;
                                    case 8:
                                        int n = eVar.n();
                                        EnumC0323c d2 = EnumC0323c.d(n);
                                        if (d2 == null) {
                                            J.o0(K);
                                            J.o0(n);
                                        } else {
                                            this.f20425j |= 1;
                                            this.f20426k = d2;
                                        }
                                    case 16:
                                        this.f20425j |= 2;
                                        this.l = eVar.H();
                                    case 29:
                                        this.f20425j |= 4;
                                        this.m = eVar.q();
                                    case 33:
                                        this.f20425j |= 8;
                                        this.n = eVar.m();
                                    case 40:
                                        this.f20425j |= 16;
                                        this.o = eVar.s();
                                    case 48:
                                        this.f20425j |= 32;
                                        this.p = eVar.s();
                                    case 56:
                                        this.f20425j |= 64;
                                        this.q = eVar.s();
                                    case 66:
                                        c c2 = (this.f20425j & 128) == 128 ? this.r.c() : null;
                                        b bVar = (b) eVar.u(b.f20410h, fVar);
                                        this.r = bVar;
                                        if (c2 != null) {
                                            c2.m(bVar);
                                            this.r = c2.q();
                                        }
                                        this.f20425j |= 128;
                                    case 74:
                                        if ((i2 & 256) != 256) {
                                            this.s = new ArrayList();
                                            i2 |= 256;
                                        }
                                        this.s.add(eVar.u(f20423h, fVar));
                                    case 80:
                                        this.f20425j |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                        this.u = eVar.s();
                                    case 88:
                                        this.f20425j |= 256;
                                        this.t = eVar.s();
                                    default:
                                        r5 = p(eVar, J, fVar, K);
                                        if (r5 == 0) {
                                            z = true;
                                        }
                                }
                            } catch (InvalidProtocolBufferException e2) {
                                throw e2.i(this);
                            } catch (IOException e3) {
                                throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                            }
                        } catch (Throwable th) {
                            if ((i2 & 256) == r5) {
                                this.s = Collections.unmodifiableList(this.s);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f20424i = O.w();
                                throw th2;
                            }
                            this.f20424i = O.w();
                            m();
                            throw th;
                        }
                    } else {
                        if ((i2 & 256) == 256) {
                            this.s = Collections.unmodifiableList(this.s);
                        }
                        try {
                            J.I();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.f20424i = O.w();
                            throw th3;
                        }
                        this.f20424i = O.w();
                        m();
                        return;
                    }
                }
            }
        }

        private C0320b(h.b bVar) {
            super(bVar);
            this.m = (byte) -1;
            this.n = -1;
            this.f20416i = bVar.l();
        }

        private C0320b(boolean z) {
            this.m = (byte) -1;
            this.n = -1;
            this.f20416i = d.f21894f;
        }

        private C0320b(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.m = (byte) -1;
            this.n = -1;
            C();
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
                                    this.f20417j |= 1;
                                    this.f20418k = eVar.s();
                                } else if (K != 18) {
                                    if (!p(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    c.C0322b c2 = (this.f20417j & 2) == 2 ? this.l.c() : null;
                                    c cVar = (c) eVar.u(c.f20423h, fVar);
                                    this.l = cVar;
                                    if (c2 != null) {
                                        c2.m(cVar);
                                        this.l = c2.q();
                                    }
                                    this.f20417j |= 2;
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.i(this);
                        }
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f20416i = O.w();
                        throw th2;
                    }
                    this.f20416i = O.w();
                    m();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f20416i = O.w();
                throw th3;
            }
            this.f20416i = O.w();
            m();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class c extends h.b<b, c> implements p {

        /* renamed from: g, reason: collision with root package name */
        private int f20438g;

        /* renamed from: h, reason: collision with root package name */
        private int f20439h;

        /* renamed from: i, reason: collision with root package name */
        private List<C0320b> f20440i = Collections.emptyList();

        private c() {
            u();
        }

        static /* synthetic */ c o() {
            return s();
        }

        private static c s() {
            return new c();
        }

        private void t() {
            if ((this.f20438g & 2) != 2) {
                this.f20440i = new ArrayList(this.f20440i);
                this.f20438g |= 2;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b a() {
            b q = q();
            if (q.isInitialized()) {
                return q;
            }
            throw a.AbstractC0372a.j(q);
        }

        public b q() {
            b bVar = new b(this);
            int i2 = (this.f20438g & 1) != 1 ? 0 : 1;
            bVar.f20413k = this.f20439h;
            if ((this.f20438g & 2) == 2) {
                this.f20440i = Collections.unmodifiableList(this.f20440i);
                this.f20438g &= -3;
            }
            bVar.l = this.f20440i;
            bVar.f20412j = i2;
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public c k() {
            return s().m(q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public c m(b bVar) {
            if (bVar == b.B()) {
                return this;
            }
            if (bVar.D()) {
                y(bVar.C());
            }
            if (!bVar.l.isEmpty()) {
                if (this.f20440i.isEmpty()) {
                    this.f20440i = bVar.l;
                    this.f20438g &= -3;
                } else {
                    t();
                    this.f20440i.addAll(bVar.l);
                }
            }
            n(l().b(bVar.f20411i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.b.c w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.b> r1 = kotlin.reflect.x.internal.l0.e.b.f20410h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.b r3 = (kotlin.reflect.x.internal.l0.e.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.b r4 = (kotlin.reflect.x.internal.l0.e.b) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.b.c.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.b$c");
        }

        public c y(int i2) {
            this.f20438g |= 1;
            this.f20439h = i2;
            return this;
        }
    }

    static {
        b bVar = new b(true);
        f20409g = bVar;
        bVar.E();
    }

    public static b B() {
        return f20409g;
    }

    private void E() {
        this.f20413k = 0;
        this.l = Collections.emptyList();
    }

    public static c F() {
        return c.o();
    }

    public static c G(b bVar) {
        return F().m(bVar);
    }

    public List<C0320b> A() {
        return this.l;
    }

    public int C() {
        return this.f20413k;
    }

    public boolean D() {
        return (this.f20412j & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public c g() {
        return F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public c c() {
        return G(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        if ((this.f20412j & 1) == 1) {
            codedOutputStream.a0(1, this.f20413k);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            codedOutputStream.d0(2, this.l.get(i2));
        }
        codedOutputStream.i0(this.f20411i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20412j & 1) == 1 ? CodedOutputStream.o(1, this.f20413k) + 0 : 0;
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            o += CodedOutputStream.s(2, this.l.get(i3));
        }
        int size = o + this.f20411i.size();
        this.n = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<b> h() {
        return f20410h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!D()) {
            this.m = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < z(); i2++) {
            if (!y(i2).isInitialized()) {
                this.m = (byte) 0;
                return false;
            }
        }
        this.m = (byte) 1;
        return true;
    }

    public C0320b y(int i2) {
        return this.l.get(i2);
    }

    public int z() {
        return this.l.size();
    }

    private b(h.b bVar) {
        super(bVar);
        this.m = (byte) -1;
        this.n = -1;
        this.f20411i = bVar.l();
    }

    private b(boolean z) {
        this.m = (byte) -1;
        this.n = -1;
        this.f20411i = d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.m = (byte) -1;
        this.n = -1;
        E();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K == 8) {
                            this.f20412j |= 1;
                            this.f20413k = eVar.s();
                        } else if (K != 18) {
                            if (!p(eVar, J, fVar, K)) {
                            }
                        } else {
                            if ((i2 & 2) != 2) {
                                this.l = new ArrayList();
                                i2 |= 2;
                            }
                            this.l.add(eVar.u(C0320b.f20415h, fVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i2 & 2) == 2) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f20411i = O.w();
                        throw th2;
                    }
                    this.f20411i = O.w();
                    m();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e2) {
                throw e2.i(this);
            } catch (IOException e3) {
                throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
            }
        }
        if ((i2 & 2) == 2) {
            this.l = Collections.unmodifiableList(this.l);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20411i = O.w();
            throw th3;
        }
        this.f20411i = O.w();
        m();
    }
}
