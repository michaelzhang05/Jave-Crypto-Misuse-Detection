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
public final class s extends h.d<s> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final s f20610h;

    /* renamed from: i, reason: collision with root package name */
    public static q<s> f20611i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final d f20612j;

    /* renamed from: k, reason: collision with root package name */
    private int f20613k;
    private int l;
    private int m;
    private boolean n;
    private c o;
    private List<q> p;
    private List<Integer> q;
    private int r;
    private byte s;
    private int t;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<s> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public s b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new s(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.c<s, b> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20614i;

        /* renamed from: j, reason: collision with root package name */
        private int f20615j;

        /* renamed from: k, reason: collision with root package name */
        private int f20616k;
        private boolean l;
        private c m = c.INV;
        private List<q> n = Collections.emptyList();
        private List<Integer> o = Collections.emptyList();

        private b() {
            B();
        }

        private void A() {
            if ((this.f20614i & 16) != 16) {
                this.n = new ArrayList(this.n);
                this.f20614i |= 16;
            }
        }

        private void B() {
        }

        static /* synthetic */ b s() {
            return x();
        }

        private static b x() {
            return new b();
        }

        private void y() {
            if ((this.f20614i & 32) != 32) {
                this.o = new ArrayList(this.o);
                this.f20614i |= 32;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public b m(s sVar) {
            if (sVar == s.M()) {
                return this;
            }
            if (sVar.W()) {
                F(sVar.O());
            }
            if (sVar.X()) {
                G(sVar.P());
            }
            if (sVar.Y()) {
                H(sVar.Q());
            }
            if (sVar.Z()) {
                I(sVar.V());
            }
            if (!sVar.p.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = sVar.p;
                    this.f20614i &= -17;
                } else {
                    A();
                    this.n.addAll(sVar.p);
                }
            }
            if (!sVar.q.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = sVar.q;
                    this.f20614i &= -33;
                } else {
                    y();
                    this.o.addAll(sVar.q);
                }
            }
            r(sVar);
            n(l().b(sVar.f20612j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.s.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.s> r1 = kotlin.reflect.x.internal.l0.e.s.f20611i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.s r3 = (kotlin.reflect.x.internal.l0.e.s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.s r4 = (kotlin.reflect.x.internal.l0.e.s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.s.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.s$b");
        }

        public b F(int i2) {
            this.f20614i |= 1;
            this.f20615j = i2;
            return this;
        }

        public b G(int i2) {
            this.f20614i |= 2;
            this.f20616k = i2;
            return this;
        }

        public b H(boolean z) {
            this.f20614i |= 4;
            this.l = z;
            return this;
        }

        public b I(c cVar) {
            cVar.getClass();
            this.f20614i |= 8;
            this.m = cVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public s a() {
            s u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public s u() {
            s sVar = new s(this);
            int i2 = this.f20614i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            sVar.l = this.f20615j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            sVar.m = this.f20616k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            sVar.n = this.l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            sVar.o = this.m;
            if ((this.f20614i & 16) == 16) {
                this.n = Collections.unmodifiableList(this.n);
                this.f20614i &= -17;
            }
            sVar.p = this.n;
            if ((this.f20614i & 32) == 32) {
                this.o = Collections.unmodifiableList(this.o);
                this.f20614i &= -33;
            }
            sVar.q = this.o;
            sVar.f20613k = i3;
            return sVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements i.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* renamed from: i, reason: collision with root package name */
        private static i.b<c> f20620i = new a();

        /* renamed from: k, reason: collision with root package name */
        private final int f20622k;

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
            this.f20622k = i3;
        }

        public static c d(int i2) {
            if (i2 == 0) {
                return IN;
            }
            if (i2 == 1) {
                return OUT;
            }
            if (i2 != 2) {
                return null;
            }
            return INV;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int a() {
            return this.f20622k;
        }
    }

    static {
        s sVar = new s(true);
        f20610h = sVar;
        sVar.a0();
    }

    public static s M() {
        return f20610h;
    }

    private void a0() {
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = c.INV;
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
    }

    public static b b0() {
        return b.s();
    }

    public static b c0(s sVar) {
        return b0().m(sVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public s b() {
        return f20610h;
    }

    public int O() {
        return this.l;
    }

    public int P() {
        return this.m;
    }

    public boolean Q() {
        return this.n;
    }

    public q R(int i2) {
        return this.p.get(i2);
    }

    public int S() {
        return this.p.size();
    }

    public List<Integer> T() {
        return this.q;
    }

    public List<q> U() {
        return this.p;
    }

    public c V() {
        return this.o;
    }

    public boolean W() {
        return (this.f20613k & 1) == 1;
    }

    public boolean X() {
        return (this.f20613k & 2) == 2;
    }

    public boolean Y() {
        return (this.f20613k & 4) == 4;
    }

    public boolean Z() {
        return (this.f20613k & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        if ((this.f20613k & 1) == 1) {
            codedOutputStream.a0(1, this.l);
        }
        if ((this.f20613k & 2) == 2) {
            codedOutputStream.a0(2, this.m);
        }
        if ((this.f20613k & 4) == 4) {
            codedOutputStream.L(3, this.n);
        }
        if ((this.f20613k & 8) == 8) {
            codedOutputStream.S(4, this.o.a());
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            codedOutputStream.d0(5, this.p.get(i2));
        }
        if (T().size() > 0) {
            codedOutputStream.o0(50);
            codedOutputStream.o0(this.r);
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            codedOutputStream.b0(this.q.get(i3).intValue());
        }
        A.a(1000, codedOutputStream);
        codedOutputStream.i0(this.f20612j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.t;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20613k & 1) == 1 ? CodedOutputStream.o(1, this.l) + 0 : 0;
        if ((this.f20613k & 2) == 2) {
            o += CodedOutputStream.o(2, this.m);
        }
        if ((this.f20613k & 4) == 4) {
            o += CodedOutputStream.a(3, this.n);
        }
        if ((this.f20613k & 8) == 8) {
            o += CodedOutputStream.h(4, this.o.a());
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            o += CodedOutputStream.s(5, this.p.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            i4 += CodedOutputStream.p(this.q.get(i5).intValue());
        }
        int i6 = o + i4;
        if (!T().isEmpty()) {
            i6 = i6 + 1 + CodedOutputStream.p(i4);
        }
        this.r = i4;
        int t = i6 + t() + this.f20612j.size();
        this.t = t;
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return c0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<s> h() {
        return f20611i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.s;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!W()) {
            this.s = (byte) 0;
            return false;
        }
        if (!X()) {
            this.s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < S(); i2++) {
            if (!R(i2).isInitialized()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if (!s()) {
            this.s = (byte) 0;
            return false;
        }
        this.s = (byte) 1;
        return true;
    }

    private s(h.c<s, ?> cVar) {
        super(cVar);
        this.r = -1;
        this.s = (byte) -1;
        this.t = -1;
        this.f20612j = cVar.l();
    }

    private s(boolean z) {
        this.r = -1;
        this.s = (byte) -1;
        this.t = -1;
        this.f20612j = d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.r = -1;
        this.s = (byte) -1;
        this.t = -1;
        a0();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f20613k |= 1;
                                this.l = eVar.s();
                            } else if (K == 16) {
                                this.f20613k |= 2;
                                this.m = eVar.s();
                            } else if (K == 24) {
                                this.f20613k |= 4;
                                this.n = eVar.k();
                            } else if (K == 32) {
                                int n = eVar.n();
                                c d2 = c.d(n);
                                if (d2 == null) {
                                    J.o0(K);
                                    J.o0(n);
                                } else {
                                    this.f20613k |= 8;
                                    this.o = d2;
                                }
                            } else if (K == 42) {
                                if ((i2 & 16) != 16) {
                                    this.p = new ArrayList();
                                    i2 |= 16;
                                }
                                this.p.add(eVar.u(q.f20582i, fVar));
                            } else if (K == 48) {
                                if ((i2 & 32) != 32) {
                                    this.q = new ArrayList();
                                    i2 |= 32;
                                }
                                this.q.add(Integer.valueOf(eVar.s()));
                            } else if (K != 50) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j2 = eVar.j(eVar.A());
                                if ((i2 & 32) != 32 && eVar.e() > 0) {
                                    this.q = new ArrayList();
                                    i2 |= 32;
                                }
                                while (eVar.e() > 0) {
                                    this.q.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j2);
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
                if ((i2 & 16) == 16) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if ((i2 & 32) == 32) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20612j = O.w();
                    throw th2;
                }
                this.f20612j = O.w();
                m();
                throw th;
            }
        }
        if ((i2 & 16) == 16) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if ((i2 & 32) == 32) {
            this.q = Collections.unmodifiableList(this.q);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20612j = O.w();
            throw th3;
        }
        this.f20612j = O.w();
        m();
    }
}
