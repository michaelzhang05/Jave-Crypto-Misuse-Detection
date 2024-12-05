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
import kotlin.reflect.x.internal.l0.e.q;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class h extends kotlin.reflect.jvm.internal.impl.protobuf.h implements p {

    /* renamed from: g, reason: collision with root package name */
    private static final h f20496g;

    /* renamed from: h, reason: collision with root package name */
    public static q<h> f20497h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final d f20498i;

    /* renamed from: j, reason: collision with root package name */
    private int f20499j;

    /* renamed from: k, reason: collision with root package name */
    private int f20500k;
    private int l;
    private c m;
    private q n;
    private int o;
    private List<h> p;
    private List<h> q;
    private byte r;
    private int s;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<h> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public h b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new h(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.b<h, b> implements p {

        /* renamed from: g, reason: collision with root package name */
        private int f20501g;

        /* renamed from: h, reason: collision with root package name */
        private int f20502h;

        /* renamed from: i, reason: collision with root package name */
        private int f20503i;
        private int l;

        /* renamed from: j, reason: collision with root package name */
        private c f20504j = c.TRUE;

        /* renamed from: k, reason: collision with root package name */
        private q f20505k = q.Z();
        private List<h> m = Collections.emptyList();
        private List<h> n = Collections.emptyList();

        private b() {
            v();
        }

        static /* synthetic */ b o() {
            return s();
        }

        private static b s() {
            return new b();
        }

        private void t() {
            if ((this.f20501g & 32) != 32) {
                this.m = new ArrayList(this.m);
                this.f20501g |= 32;
            }
        }

        private void u() {
            if ((this.f20501g & 64) != 64) {
                this.n = new ArrayList(this.n);
                this.f20501g |= 64;
            }
        }

        private void v() {
        }

        public b A(q qVar) {
            if ((this.f20501g & 8) == 8 && this.f20505k != q.Z()) {
                this.f20505k = q.A0(this.f20505k).m(qVar).u();
            } else {
                this.f20505k = qVar;
            }
            this.f20501g |= 8;
            return this;
        }

        public b B(c cVar) {
            cVar.getClass();
            this.f20501g |= 4;
            this.f20504j = cVar;
            return this;
        }

        public b C(int i2) {
            this.f20501g |= 1;
            this.f20502h = i2;
            return this;
        }

        public b E(int i2) {
            this.f20501g |= 16;
            this.l = i2;
            return this;
        }

        public b F(int i2) {
            this.f20501g |= 2;
            this.f20503i = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public h a() {
            h q = q();
            if (q.isInitialized()) {
                return q;
            }
            throw a.AbstractC0372a.j(q);
        }

        public h q() {
            h hVar = new h(this);
            int i2 = this.f20501g;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            hVar.f20500k = this.f20502h;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            hVar.l = this.f20503i;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            hVar.m = this.f20504j;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            hVar.n = this.f20505k;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            hVar.o = this.l;
            if ((this.f20501g & 32) == 32) {
                this.m = Collections.unmodifiableList(this.m);
                this.f20501g &= -33;
            }
            hVar.p = this.m;
            if ((this.f20501g & 64) == 64) {
                this.n = Collections.unmodifiableList(this.n);
                this.f20501g &= -65;
            }
            hVar.q = this.n;
            hVar.f20499j = i3;
            return hVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b k() {
            return s().m(q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public b m(h hVar) {
            if (hVar == h.H()) {
                return this;
            }
            if (hVar.P()) {
                C(hVar.I());
            }
            if (hVar.S()) {
                F(hVar.N());
            }
            if (hVar.O()) {
                B(hVar.G());
            }
            if (hVar.Q()) {
                A(hVar.J());
            }
            if (hVar.R()) {
                E(hVar.K());
            }
            if (!hVar.p.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = hVar.p;
                    this.f20501g &= -33;
                } else {
                    t();
                    this.m.addAll(hVar.p);
                }
            }
            if (!hVar.q.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = hVar.q;
                    this.f20501g &= -65;
                } else {
                    u();
                    this.n.addAll(hVar.q);
                }
            }
            n(l().b(hVar.f20498i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.h.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.h> r1 = kotlin.reflect.x.internal.l0.e.h.f20497h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.h r3 = (kotlin.reflect.x.internal.l0.e.h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.h r4 = (kotlin.reflect.x.internal.l0.e.h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.h.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.h$b");
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements i.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* renamed from: i, reason: collision with root package name */
        private static i.b<c> f20509i = new a();

        /* renamed from: k, reason: collision with root package name */
        private final int f20511k;

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
            this.f20511k = i3;
        }

        public static c d(int i2) {
            if (i2 == 0) {
                return TRUE;
            }
            if (i2 == 1) {
                return FALSE;
            }
            if (i2 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int a() {
            return this.f20511k;
        }
    }

    static {
        h hVar = new h(true);
        f20496g = hVar;
        hVar.T();
    }

    public static h H() {
        return f20496g;
    }

    private void T() {
        this.f20500k = 0;
        this.l = 0;
        this.m = c.TRUE;
        this.n = q.Z();
        this.o = 0;
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
    }

    public static b U() {
        return b.o();
    }

    public static b V(h hVar) {
        return U().m(hVar);
    }

    public h E(int i2) {
        return this.p.get(i2);
    }

    public int F() {
        return this.p.size();
    }

    public c G() {
        return this.m;
    }

    public int I() {
        return this.f20500k;
    }

    public q J() {
        return this.n;
    }

    public int K() {
        return this.o;
    }

    public h L(int i2) {
        return this.q.get(i2);
    }

    public int M() {
        return this.q.size();
    }

    public int N() {
        return this.l;
    }

    public boolean O() {
        return (this.f20499j & 4) == 4;
    }

    public boolean P() {
        return (this.f20499j & 1) == 1;
    }

    public boolean Q() {
        return (this.f20499j & 8) == 8;
    }

    public boolean R() {
        return (this.f20499j & 16) == 16;
    }

    public boolean S() {
        return (this.f20499j & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public b g() {
        return U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public b c() {
        return V(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        if ((this.f20499j & 1) == 1) {
            codedOutputStream.a0(1, this.f20500k);
        }
        if ((this.f20499j & 2) == 2) {
            codedOutputStream.a0(2, this.l);
        }
        if ((this.f20499j & 4) == 4) {
            codedOutputStream.S(3, this.m.a());
        }
        if ((this.f20499j & 8) == 8) {
            codedOutputStream.d0(4, this.n);
        }
        if ((this.f20499j & 16) == 16) {
            codedOutputStream.a0(5, this.o);
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            codedOutputStream.d0(6, this.p.get(i2));
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            codedOutputStream.d0(7, this.q.get(i3));
        }
        codedOutputStream.i0(this.f20498i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20499j & 1) == 1 ? CodedOutputStream.o(1, this.f20500k) + 0 : 0;
        if ((this.f20499j & 2) == 2) {
            o += CodedOutputStream.o(2, this.l);
        }
        if ((this.f20499j & 4) == 4) {
            o += CodedOutputStream.h(3, this.m.a());
        }
        if ((this.f20499j & 8) == 8) {
            o += CodedOutputStream.s(4, this.n);
        }
        if ((this.f20499j & 16) == 16) {
            o += CodedOutputStream.o(5, this.o);
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            o += CodedOutputStream.s(6, this.p.get(i3));
        }
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            o += CodedOutputStream.s(7, this.q.get(i4));
        }
        int size = o + this.f20498i.size();
        this.s = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<h> h() {
        return f20497h;
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
        if (Q() && !J().isInitialized()) {
            this.r = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < F(); i2++) {
            if (!E(i2).isInitialized()) {
                this.r = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < M(); i3++) {
            if (!L(i3).isInitialized()) {
                this.r = (byte) 0;
                return false;
            }
        }
        this.r = (byte) 1;
        return true;
    }

    private h(h.b bVar) {
        super(bVar);
        this.r = (byte) -1;
        this.s = -1;
        this.f20498i = bVar.l();
    }

    private h(boolean z) {
        this.r = (byte) -1;
        this.s = -1;
        this.f20498i = d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.r = (byte) -1;
        this.s = -1;
        T();
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
                            this.f20499j |= 1;
                            this.f20500k = eVar.s();
                        } else if (K == 16) {
                            this.f20499j |= 2;
                            this.l = eVar.s();
                        } else if (K == 24) {
                            int n = eVar.n();
                            c d2 = c.d(n);
                            if (d2 == null) {
                                J.o0(K);
                                J.o0(n);
                            } else {
                                this.f20499j |= 4;
                                this.m = d2;
                            }
                        } else if (K == 34) {
                            q.c c2 = (this.f20499j & 8) == 8 ? this.n.c() : null;
                            q qVar = (q) eVar.u(q.f20582i, fVar);
                            this.n = qVar;
                            if (c2 != null) {
                                c2.m(qVar);
                                this.n = c2.u();
                            }
                            this.f20499j |= 8;
                        } else if (K == 40) {
                            this.f20499j |= 16;
                            this.o = eVar.s();
                        } else if (K == 50) {
                            if ((i2 & 32) != 32) {
                                this.p = new ArrayList();
                                i2 |= 32;
                            }
                            this.p.add(eVar.u(f20497h, fVar));
                        } else if (K != 58) {
                            if (!p(eVar, J, fVar, K)) {
                            }
                        } else {
                            if ((i2 & 64) != 64) {
                                this.q = new ArrayList();
                                i2 |= 64;
                            }
                            this.q.add(eVar.u(f20497h, fVar));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i2 & 32) == 32) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if ((i2 & 64) == 64) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20498i = O.w();
                    throw th2;
                }
                this.f20498i = O.w();
                m();
                throw th;
            }
        }
        if ((i2 & 32) == 32) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if ((i2 & 64) == 64) {
            this.q = Collections.unmodifiableList(this.q);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20498i = O.w();
            throw th3;
        }
        this.f20498i = O.w();
        m();
    }
}
