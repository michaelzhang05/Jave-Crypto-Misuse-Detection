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
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.x.internal.l0.e.h;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class f extends h implements p {

    /* renamed from: g, reason: collision with root package name */
    private static final f f20468g;

    /* renamed from: h, reason: collision with root package name */
    public static q<f> f20469h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f20470i;

    /* renamed from: j, reason: collision with root package name */
    private int f20471j;

    /* renamed from: k, reason: collision with root package name */
    private c f20472k;
    private List<h> l;
    private h m;
    private d n;
    private byte o;
    private int p;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<f> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public f b(e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
            return new f(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.b<f, b> implements p {

        /* renamed from: g, reason: collision with root package name */
        private int f20473g;

        /* renamed from: h, reason: collision with root package name */
        private c f20474h = c.RETURNS_CONSTANT;

        /* renamed from: i, reason: collision with root package name */
        private List<h> f20475i = Collections.emptyList();

        /* renamed from: j, reason: collision with root package name */
        private h f20476j = h.H();

        /* renamed from: k, reason: collision with root package name */
        private d f20477k = d.AT_MOST_ONCE;

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
            if ((this.f20473g & 2) != 2) {
                this.f20475i = new ArrayList(this.f20475i);
                this.f20473g |= 2;
            }
        }

        private void u() {
        }

        public b A(c cVar) {
            cVar.getClass();
            this.f20473g |= 1;
            this.f20474h = cVar;
            return this;
        }

        public b B(d dVar) {
            dVar.getClass();
            this.f20473g |= 8;
            this.f20477k = dVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public f a() {
            f q = q();
            if (q.isInitialized()) {
                return q;
            }
            throw a.AbstractC0372a.j(q);
        }

        public f q() {
            f fVar = new f(this);
            int i2 = this.f20473g;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            fVar.f20472k = this.f20474h;
            if ((this.f20473g & 2) == 2) {
                this.f20475i = Collections.unmodifiableList(this.f20475i);
                this.f20473g &= -3;
            }
            fVar.l = this.f20475i;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            fVar.m = this.f20476j;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            fVar.n = this.f20477k;
            fVar.f20471j = i3;
            return fVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b k() {
            return s().m(q());
        }

        public b v(h hVar) {
            if ((this.f20473g & 4) == 4 && this.f20476j != h.H()) {
                this.f20476j = h.V(this.f20476j).m(hVar).q();
            } else {
                this.f20476j = hVar;
            }
            this.f20473g |= 4;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public b m(f fVar) {
            if (fVar == f.B()) {
                return this;
            }
            if (fVar.H()) {
                A(fVar.E());
            }
            if (!fVar.l.isEmpty()) {
                if (this.f20475i.isEmpty()) {
                    this.f20475i = fVar.l;
                    this.f20473g &= -3;
                } else {
                    t();
                    this.f20475i.addAll(fVar.l);
                }
            }
            if (fVar.G()) {
                v(fVar.A());
            }
            if (fVar.I()) {
                B(fVar.F());
            }
            n(l().b(fVar.f20470i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.f.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.f> r1 = kotlin.reflect.x.internal.l0.e.f.f20469h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.f r3 = (kotlin.reflect.x.internal.l0.e.f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.f r4 = (kotlin.reflect.x.internal.l0.e.f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.f.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.f$b");
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements i.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* renamed from: i, reason: collision with root package name */
        private static i.b<c> f20481i = new a();

        /* renamed from: k, reason: collision with root package name */
        private final int f20483k;

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
            this.f20483k = i3;
        }

        public static c d(int i2) {
            if (i2 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i2 == 1) {
                return CALLS;
            }
            if (i2 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int a() {
            return this.f20483k;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum d implements i.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* renamed from: i, reason: collision with root package name */
        private static i.b<d> f20487i = new a();

        /* renamed from: k, reason: collision with root package name */
        private final int f20489k;

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
            this.f20489k = i3;
        }

        public static d d(int i2) {
            if (i2 == 0) {
                return AT_MOST_ONCE;
            }
            if (i2 == 1) {
                return EXACTLY_ONCE;
            }
            if (i2 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int a() {
            return this.f20489k;
        }
    }

    static {
        f fVar = new f(true);
        f20468g = fVar;
        fVar.J();
    }

    public static f B() {
        return f20468g;
    }

    private void J() {
        this.f20472k = c.RETURNS_CONSTANT;
        this.l = Collections.emptyList();
        this.m = h.H();
        this.n = d.AT_MOST_ONCE;
    }

    public static b K() {
        return b.o();
    }

    public static b L(f fVar) {
        return K().m(fVar);
    }

    public h A() {
        return this.m;
    }

    public h C(int i2) {
        return this.l.get(i2);
    }

    public int D() {
        return this.l.size();
    }

    public c E() {
        return this.f20472k;
    }

    public d F() {
        return this.n;
    }

    public boolean G() {
        return (this.f20471j & 2) == 2;
    }

    public boolean H() {
        return (this.f20471j & 1) == 1;
    }

    public boolean I() {
        return (this.f20471j & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b g() {
        return K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b c() {
        return L(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        if ((this.f20471j & 1) == 1) {
            codedOutputStream.S(1, this.f20472k.a());
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            codedOutputStream.d0(2, this.l.get(i2));
        }
        if ((this.f20471j & 2) == 2) {
            codedOutputStream.d0(3, this.m);
        }
        if ((this.f20471j & 4) == 4) {
            codedOutputStream.S(4, this.n.a());
        }
        codedOutputStream.i0(this.f20470i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.p;
        if (i2 != -1) {
            return i2;
        }
        int h2 = (this.f20471j & 1) == 1 ? CodedOutputStream.h(1, this.f20472k.a()) + 0 : 0;
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            h2 += CodedOutputStream.s(2, this.l.get(i3));
        }
        if ((this.f20471j & 2) == 2) {
            h2 += CodedOutputStream.s(3, this.m);
        }
        if ((this.f20471j & 4) == 4) {
            h2 += CodedOutputStream.h(4, this.n.a());
        }
        int size = h2 + this.f20470i.size();
        this.p = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<f> h() {
        return f20469h;
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
        for (int i2 = 0; i2 < D(); i2++) {
            if (!C(i2).isInitialized()) {
                this.o = (byte) 0;
                return false;
            }
        }
        if (G() && !A().isInitialized()) {
            this.o = (byte) 0;
            return false;
        }
        this.o = (byte) 1;
        return true;
    }

    private f(h.b bVar) {
        super(bVar);
        this.o = (byte) -1;
        this.p = -1;
        this.f20470i = bVar.l();
    }

    private f(boolean z) {
        this.o = (byte) -1;
        this.p = -1;
        this.f20470i = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f(e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) throws InvalidProtocolBufferException {
        this.o = (byte) -1;
        this.p = -1;
        J();
        d.b O = kotlin.reflect.jvm.internal.impl.protobuf.d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        int i2 = 0;
        while (!z) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K == 8) {
                            int n = eVar.n();
                            c d2 = c.d(n);
                            if (d2 == null) {
                                J.o0(K);
                                J.o0(n);
                            } else {
                                this.f20471j |= 1;
                                this.f20472k = d2;
                            }
                        } else if (K == 18) {
                            if ((i2 & 2) != 2) {
                                this.l = new ArrayList();
                                i2 |= 2;
                            }
                            this.l.add(eVar.u(h.f20497h, fVar));
                        } else if (K == 26) {
                            h.b c2 = (this.f20471j & 2) == 2 ? this.m.c() : null;
                            h hVar = (h) eVar.u(h.f20497h, fVar);
                            this.m = hVar;
                            if (c2 != null) {
                                c2.m(hVar);
                                this.m = c2.q();
                            }
                            this.f20471j |= 2;
                        } else if (K != 32) {
                            if (!p(eVar, J, fVar, K)) {
                            }
                        } else {
                            int n2 = eVar.n();
                            d d3 = d.d(n2);
                            if (d3 == null) {
                                J.o0(K);
                                J.o0(n2);
                            } else {
                                this.f20471j |= 4;
                                this.n = d3;
                            }
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
                        this.f20470i = O.w();
                        throw th2;
                    }
                    this.f20470i = O.w();
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
            this.f20470i = O.w();
            throw th3;
        }
        this.f20470i = O.w();
        m();
    }
}
