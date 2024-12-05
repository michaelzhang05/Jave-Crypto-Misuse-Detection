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
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class d extends h.d<d> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final d f20454h;

    /* renamed from: i, reason: collision with root package name */
    public static q<d> f20455i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f20456j;

    /* renamed from: k, reason: collision with root package name */
    private int f20457k;
    private int l;
    private List<u> m;
    private List<Integer> n;
    private byte o;
    private int p;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public d b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new d(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.c<d, b> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20458i;

        /* renamed from: j, reason: collision with root package name */
        private int f20459j = 6;

        /* renamed from: k, reason: collision with root package name */
        private List<u> f20460k = Collections.emptyList();
        private List<Integer> l = Collections.emptyList();

        private b() {
            B();
        }

        private void A() {
            if ((this.f20458i & 4) != 4) {
                this.l = new ArrayList(this.l);
                this.f20458i |= 4;
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
            if ((this.f20458i & 2) != 2) {
                this.f20460k = new ArrayList(this.f20460k);
                this.f20458i |= 2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public b m(d dVar) {
            if (dVar == d.J()) {
                return this;
            }
            if (dVar.Q()) {
                F(dVar.L());
            }
            if (!dVar.m.isEmpty()) {
                if (this.f20460k.isEmpty()) {
                    this.f20460k = dVar.m;
                    this.f20458i &= -3;
                } else {
                    y();
                    this.f20460k.addAll(dVar.m);
                }
            }
            if (!dVar.n.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = dVar.n;
                    this.f20458i &= -5;
                } else {
                    A();
                    this.l.addAll(dVar.n);
                }
            }
            r(dVar);
            n(l().b(dVar.f20456j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.d.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.d> r1 = kotlin.reflect.x.internal.l0.e.d.f20455i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.d r3 = (kotlin.reflect.x.internal.l0.e.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.d r4 = (kotlin.reflect.x.internal.l0.e.d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.d.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.d$b");
        }

        public b F(int i2) {
            this.f20458i |= 1;
            this.f20459j = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public d a() {
            d u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public d u() {
            d dVar = new d(this);
            int i2 = (this.f20458i & 1) != 1 ? 0 : 1;
            dVar.l = this.f20459j;
            if ((this.f20458i & 2) == 2) {
                this.f20460k = Collections.unmodifiableList(this.f20460k);
                this.f20458i &= -3;
            }
            dVar.m = this.f20460k;
            if ((this.f20458i & 4) == 4) {
                this.l = Collections.unmodifiableList(this.l);
                this.f20458i &= -5;
            }
            dVar.n = this.l;
            dVar.f20457k = i2;
            return dVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    static {
        d dVar = new d(true);
        f20454h = dVar;
        dVar.R();
    }

    public static d J() {
        return f20454h;
    }

    private void R() {
        this.l = 6;
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
    }

    public static b S() {
        return b.s();
    }

    public static b T(d dVar) {
        return S().m(dVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public d b() {
        return f20454h;
    }

    public int L() {
        return this.l;
    }

    public u M(int i2) {
        return this.m.get(i2);
    }

    public int N() {
        return this.m.size();
    }

    public List<u> O() {
        return this.m;
    }

    public List<Integer> P() {
        return this.n;
    }

    public boolean Q() {
        return (this.f20457k & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public b g() {
        return S();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public b c() {
        return T(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        if ((this.f20457k & 1) == 1) {
            codedOutputStream.a0(1, this.l);
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            codedOutputStream.d0(2, this.m.get(i2));
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            codedOutputStream.a0(31, this.n.get(i3).intValue());
        }
        A.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f20456j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.p;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20457k & 1) == 1 ? CodedOutputStream.o(1, this.l) + 0 : 0;
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            o += CodedOutputStream.s(2, this.m.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.n.size(); i5++) {
            i4 += CodedOutputStream.p(this.n.get(i5).intValue());
        }
        int size = o + i4 + (P().size() * 2) + t() + this.f20456j.size();
        this.p = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<d> h() {
        return f20455i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.o;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < N(); i2++) {
            if (!M(i2).isInitialized()) {
                this.o = (byte) 0;
                return false;
            }
        }
        if (!s()) {
            this.o = (byte) 0;
            return false;
        }
        this.o = (byte) 1;
        return true;
    }

    private d(h.c<d, ?> cVar) {
        super(cVar);
        this.o = (byte) -1;
        this.p = -1;
        this.f20456j = cVar.l();
    }

    private d(boolean z) {
        this.o = (byte) -1;
        this.p = -1;
        this.f20456j = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.o = (byte) -1;
        this.p = -1;
        R();
        d.b O = kotlin.reflect.jvm.internal.impl.protobuf.d.O();
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
                                this.f20457k |= 1;
                                this.l = eVar.s();
                            } else if (K == 18) {
                                if ((i2 & 2) != 2) {
                                    this.m = new ArrayList();
                                    i2 |= 2;
                                }
                                this.m.add(eVar.u(u.f20632i, fVar));
                            } else if (K == 248) {
                                if ((i2 & 4) != 4) {
                                    this.n = new ArrayList();
                                    i2 |= 4;
                                }
                                this.n.add(Integer.valueOf(eVar.s()));
                            } else if (K != 250) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j2 = eVar.j(eVar.A());
                                if ((i2 & 4) != 4 && eVar.e() > 0) {
                                    this.n = new ArrayList();
                                    i2 |= 4;
                                }
                                while (eVar.e() > 0) {
                                    this.n.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j2);
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
                if ((i2 & 2) == 2) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if ((i2 & 4) == 4) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20456j = O.w();
                    throw th2;
                }
                this.f20456j = O.w();
                m();
                throw th;
            }
        }
        if ((i2 & 2) == 2) {
            this.m = Collections.unmodifiableList(this.m);
        }
        if ((i2 & 4) == 4) {
            this.n = Collections.unmodifiableList(this.n);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20456j = O.w();
            throw th3;
        }
        this.f20456j = O.w();
        m();
    }
}
