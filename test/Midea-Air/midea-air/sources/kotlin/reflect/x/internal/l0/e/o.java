package kotlin.reflect.x.internal.l0.e;

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
public final class o extends h implements p {

    /* renamed from: g, reason: collision with root package name */
    private static final o f20552g;

    /* renamed from: h, reason: collision with root package name */
    public static q<o> f20553h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final d f20554i;

    /* renamed from: j, reason: collision with root package name */
    private List<c> f20555j;

    /* renamed from: k, reason: collision with root package name */
    private byte f20556k;
    private int l;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<o> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public o b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new o(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.b<o, b> implements p {

        /* renamed from: g, reason: collision with root package name */
        private int f20557g;

        /* renamed from: h, reason: collision with root package name */
        private List<c> f20558h = Collections.emptyList();

        private b() {
            u();
        }

        static /* synthetic */ b o() {
            return s();
        }

        private static b s() {
            return new b();
        }

        private void t() {
            if ((this.f20557g & 1) != 1) {
                this.f20558h = new ArrayList(this.f20558h);
                this.f20557g |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public o a() {
            o q = q();
            if (q.isInitialized()) {
                return q;
            }
            throw a.AbstractC0372a.j(q);
        }

        public o q() {
            o oVar = new o(this);
            if ((this.f20557g & 1) == 1) {
                this.f20558h = Collections.unmodifiableList(this.f20558h);
                this.f20557g &= -2;
            }
            oVar.f20555j = this.f20558h;
            return oVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b k() {
            return s().m(q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(o oVar) {
            if (oVar == o.u()) {
                return this;
            }
            if (!oVar.f20555j.isEmpty()) {
                if (this.f20558h.isEmpty()) {
                    this.f20558h = oVar.f20555j;
                    this.f20557g &= -2;
                } else {
                    t();
                    this.f20558h.addAll(oVar.f20555j);
                }
            }
            n(l().b(oVar.f20554i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.o.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.o> r1 = kotlin.reflect.x.internal.l0.e.o.f20553h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.o r3 = (kotlin.reflect.x.internal.l0.e.o) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.o r4 = (kotlin.reflect.x.internal.l0.e.o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.o.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.o$b");
        }
    }

    static {
        o oVar = new o(true);
        f20552g = oVar;
        oVar.z();
    }

    public static b A() {
        return b.o();
    }

    public static b B(o oVar) {
        return A().m(oVar);
    }

    public static o u() {
        return f20552g;
    }

    private void z() {
        this.f20555j = Collections.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b g() {
        return A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b c() {
        return B(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        for (int i2 = 0; i2 < this.f20555j.size(); i2++) {
            codedOutputStream.d0(1, this.f20555j.get(i2));
        }
        codedOutputStream.i0(this.f20554i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f20555j.size(); i4++) {
            i3 += CodedOutputStream.s(1, this.f20555j.get(i4));
        }
        int size = i3 + this.f20554i.size();
        this.l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<o> h() {
        return f20553h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.f20556k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < y(); i2++) {
            if (!v(i2).isInitialized()) {
                this.f20556k = (byte) 0;
                return false;
            }
        }
        this.f20556k = (byte) 1;
        return true;
    }

    public c v(int i2) {
        return this.f20555j.get(i2);
    }

    public int y() {
        return this.f20555j.size();
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class c extends h implements p {

        /* renamed from: g, reason: collision with root package name */
        private static final c f20559g;

        /* renamed from: h, reason: collision with root package name */
        public static q<c> f20560h = new a();

        /* renamed from: i, reason: collision with root package name */
        private final d f20561i;

        /* renamed from: j, reason: collision with root package name */
        private int f20562j;

        /* renamed from: k, reason: collision with root package name */
        private int f20563k;
        private int l;
        private EnumC0325c m;
        private byte n;
        private int o;

        /* compiled from: ProtoBuf.java */
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
        /* loaded from: classes2.dex */
        public static final class b extends h.b<c, b> implements p {

            /* renamed from: g, reason: collision with root package name */
            private int f20564g;

            /* renamed from: i, reason: collision with root package name */
            private int f20566i;

            /* renamed from: h, reason: collision with root package name */
            private int f20565h = -1;

            /* renamed from: j, reason: collision with root package name */
            private EnumC0325c f20567j = EnumC0325c.PACKAGE;

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
                this.f20564g |= 2;
                this.f20566i = i2;
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
                int i2 = this.f20564g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                cVar.f20563k = this.f20565h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                cVar.l = this.f20566i;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                cVar.m = this.f20567j;
                cVar.f20562j = i3;
                return cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b k() {
                return s().m(q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b m(c cVar) {
                if (cVar == c.y()) {
                    return this;
                }
                if (cVar.D()) {
                    y(cVar.A());
                }
                if (cVar.E()) {
                    A(cVar.B());
                }
                if (cVar.C()) {
                    x(cVar.z());
                }
                n(l().b(cVar.f20561i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.f0.x.e.l0.e.o.c.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.o$c> r1 = kotlin.f0.x.e.l0.e.o.c.f20560h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.x.e.l0.e.o$c r3 = (kotlin.f0.x.e.l0.e.o.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.x.e.l0.e.o$c r4 = (kotlin.f0.x.e.l0.e.o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.o.c.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.o$c$b");
            }

            public b x(EnumC0325c enumC0325c) {
                enumC0325c.getClass();
                this.f20564g |= 4;
                this.f20567j = enumC0325c;
                return this;
            }

            public b y(int i2) {
                this.f20564g |= 1;
                this.f20565h = i2;
                return this;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.o$c$c, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0325c implements i.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* renamed from: i, reason: collision with root package name */
            private static i.b<EnumC0325c> f20571i = new a();

            /* renamed from: k, reason: collision with root package name */
            private final int f20573k;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.x.e.l0.e.o$c$c$a */
            /* loaded from: classes2.dex */
            static class a implements i.b<EnumC0325c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC0325c a(int i2) {
                    return EnumC0325c.d(i2);
                }
            }

            EnumC0325c(int i2, int i3) {
                this.f20573k = i3;
            }

            public static EnumC0325c d(int i2) {
                if (i2 == 0) {
                    return CLASS;
                }
                if (i2 == 1) {
                    return PACKAGE;
                }
                if (i2 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int a() {
                return this.f20573k;
            }
        }

        static {
            c cVar = new c(true);
            f20559g = cVar;
            cVar.F();
        }

        private void F() {
            this.f20563k = -1;
            this.l = 0;
            this.m = EnumC0325c.PACKAGE;
        }

        public static b G() {
            return b.o();
        }

        public static b H(c cVar) {
            return G().m(cVar);
        }

        public static c y() {
            return f20559g;
        }

        public int A() {
            return this.f20563k;
        }

        public int B() {
            return this.l;
        }

        public boolean C() {
            return (this.f20562j & 4) == 4;
        }

        public boolean D() {
            return (this.f20562j & 1) == 1;
        }

        public boolean E() {
            return (this.f20562j & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public b g() {
            return G();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public b c() {
            return H(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.f20562j & 1) == 1) {
                codedOutputStream.a0(1, this.f20563k);
            }
            if ((this.f20562j & 2) == 2) {
                codedOutputStream.a0(2, this.l);
            }
            if ((this.f20562j & 4) == 4) {
                codedOutputStream.S(3, this.m.a());
            }
            codedOutputStream.i0(this.f20561i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int e() {
            int i2 = this.o;
            if (i2 != -1) {
                return i2;
            }
            int o = (this.f20562j & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f20563k) : 0;
            if ((this.f20562j & 2) == 2) {
                o += CodedOutputStream.o(2, this.l);
            }
            if ((this.f20562j & 4) == 4) {
                o += CodedOutputStream.h(3, this.m.a());
            }
            int size = o + this.f20561i.size();
            this.o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public q<c> h() {
            return f20560h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        public final boolean isInitialized() {
            byte b2 = this.n;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!E()) {
                this.n = (byte) 0;
                return false;
            }
            this.n = (byte) 1;
            return true;
        }

        public EnumC0325c z() {
            return this.m;
        }

        private c(h.b bVar) {
            super(bVar);
            this.n = (byte) -1;
            this.o = -1;
            this.f20561i = bVar.l();
        }

        private c(boolean z) {
            this.n = (byte) -1;
            this.o = -1;
            this.f20561i = d.f21894f;
        }

        private c(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.n = (byte) -1;
            this.o = -1;
            F();
            d.b O = d.O();
            CodedOutputStream J = CodedOutputStream.J(O, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f20562j |= 1;
                                this.f20563k = eVar.s();
                            } else if (K == 16) {
                                this.f20562j |= 2;
                                this.l = eVar.s();
                            } else if (K != 24) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                int n = eVar.n();
                                EnumC0325c d2 = EnumC0325c.d(n);
                                if (d2 == null) {
                                    J.o0(K);
                                    J.o0(n);
                                } else {
                                    this.f20562j |= 4;
                                    this.m = d2;
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
                        this.f20561i = O.w();
                        throw th2;
                    }
                    this.f20561i = O.w();
                    m();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f20561i = O.w();
                throw th3;
            }
            this.f20561i = O.w();
            m();
        }
    }

    private o(h.b bVar) {
        super(bVar);
        this.f20556k = (byte) -1;
        this.l = -1;
        this.f20554i = bVar.l();
    }

    private o(boolean z) {
        this.f20556k = (byte) -1;
        this.l = -1;
        this.f20554i = d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private o(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.f20556k = (byte) -1;
        this.l = -1;
        z();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K != 10) {
                            if (!p(eVar, J, fVar, K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f20555j = new ArrayList();
                                z2 |= true;
                            }
                            this.f20555j.add(eVar.u(c.f20560h, fVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f20555j = Collections.unmodifiableList(this.f20555j);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f20554i = O.w();
                        throw th2;
                    }
                    this.f20554i = O.w();
                    m();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e2) {
                throw e2.i(this);
            } catch (IOException e3) {
                throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
            }
        }
        if (z2 & true) {
            this.f20555j = Collections.unmodifiableList(this.f20555j);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20554i = O.w();
            throw th3;
        }
        this.f20554i = O.w();
        m();
    }
}
