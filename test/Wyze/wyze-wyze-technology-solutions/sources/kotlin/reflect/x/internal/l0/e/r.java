package kotlin.reflect.x.internal.l0.e;

import java.io.IOException;
import java.io.InputStream;
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
import kotlin.reflect.x.internal.l0.e.q;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class r extends h.d<r> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final r f20603h;

    /* renamed from: i, reason: collision with root package name */
    public static q<r> f20604i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final d f20605j;

    /* renamed from: k, reason: collision with root package name */
    private int f20606k;
    private int l;
    private int m;
    private List<s> n;
    private q o;
    private int p;
    private q q;
    private int r;
    private List<kotlin.reflect.x.internal.l0.e.b> s;
    private List<Integer> t;
    private byte u;
    private int v;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<r> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public r b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new r(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.c<r, b> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20607i;

        /* renamed from: k, reason: collision with root package name */
        private int f20609k;
        private int n;
        private int p;

        /* renamed from: j, reason: collision with root package name */
        private int f20608j = 6;
        private List<s> l = Collections.emptyList();
        private q m = q.Z();
        private q o = q.Z();
        private List<kotlin.reflect.x.internal.l0.e.b> q = Collections.emptyList();
        private List<Integer> r = Collections.emptyList();

        private b() {
            C();
        }

        private void A() {
            if ((this.f20607i & 4) != 4) {
                this.l = new ArrayList(this.l);
                this.f20607i |= 4;
            }
        }

        private void B() {
            if ((this.f20607i & 256) != 256) {
                this.r = new ArrayList(this.r);
                this.f20607i |= 256;
            }
        }

        private void C() {
        }

        static /* synthetic */ b s() {
            return x();
        }

        private static b x() {
            return new b();
        }

        private void y() {
            if ((this.f20607i & 128) != 128) {
                this.q = new ArrayList(this.q);
                this.f20607i |= 128;
            }
        }

        public b E(q qVar) {
            if ((this.f20607i & 32) == 32 && this.o != q.Z()) {
                this.o = q.A0(this.o).m(qVar).u();
            } else {
                this.o = qVar;
            }
            this.f20607i |= 32;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b m(r rVar) {
            if (rVar == r.T()) {
                return this;
            }
            if (rVar.h0()) {
                K(rVar.X());
            }
            if (rVar.i0()) {
                M(rVar.Y());
            }
            if (!rVar.n.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = rVar.n;
                    this.f20607i &= -5;
                } else {
                    A();
                    this.l.addAll(rVar.n);
                }
            }
            if (rVar.j0()) {
                H(rVar.c0());
            }
            if (rVar.k0()) {
                N(rVar.d0());
            }
            if (rVar.f0()) {
                E(rVar.V());
            }
            if (rVar.g0()) {
                I(rVar.W());
            }
            if (!rVar.s.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = rVar.s;
                    this.f20607i &= -129;
                } else {
                    y();
                    this.q.addAll(rVar.s);
                }
            }
            if (!rVar.t.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = rVar.t;
                    this.f20607i &= -257;
                } else {
                    B();
                    this.r.addAll(rVar.t);
                }
            }
            r(rVar);
            n(l().b(rVar.f20605j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.r.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.r> r1 = kotlin.reflect.x.internal.l0.e.r.f20604i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.r r3 = (kotlin.reflect.x.internal.l0.e.r) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.r r4 = (kotlin.reflect.x.internal.l0.e.r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.r.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.r$b");
        }

        public b H(q qVar) {
            if ((this.f20607i & 8) == 8 && this.m != q.Z()) {
                this.m = q.A0(this.m).m(qVar).u();
            } else {
                this.m = qVar;
            }
            this.f20607i |= 8;
            return this;
        }

        public b I(int i2) {
            this.f20607i |= 64;
            this.p = i2;
            return this;
        }

        public b K(int i2) {
            this.f20607i |= 1;
            this.f20608j = i2;
            return this;
        }

        public b M(int i2) {
            this.f20607i |= 2;
            this.f20609k = i2;
            return this;
        }

        public b N(int i2) {
            this.f20607i |= 16;
            this.n = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public r a() {
            r u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public r u() {
            r rVar = new r(this);
            int i2 = this.f20607i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            rVar.l = this.f20608j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            rVar.m = this.f20609k;
            if ((this.f20607i & 4) == 4) {
                this.l = Collections.unmodifiableList(this.l);
                this.f20607i &= -5;
            }
            rVar.n = this.l;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            rVar.o = this.m;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            rVar.p = this.n;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            rVar.q = this.o;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            rVar.r = this.p;
            if ((this.f20607i & 128) == 128) {
                this.q = Collections.unmodifiableList(this.q);
                this.f20607i &= -129;
            }
            rVar.s = this.q;
            if ((this.f20607i & 256) == 256) {
                this.r = Collections.unmodifiableList(this.r);
                this.f20607i &= -257;
            }
            rVar.t = this.r;
            rVar.f20606k = i3;
            return rVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    static {
        r rVar = new r(true);
        f20603h = rVar;
        rVar.l0();
    }

    public static r T() {
        return f20603h;
    }

    private void l0() {
        this.l = 6;
        this.m = 0;
        this.n = Collections.emptyList();
        this.o = q.Z();
        this.p = 0;
        this.q = q.Z();
        this.r = 0;
        this.s = Collections.emptyList();
        this.t = Collections.emptyList();
    }

    public static b m0() {
        return b.s();
    }

    public static b n0(r rVar) {
        return m0().m(rVar);
    }

    public static r p0(InputStream inputStream, f fVar) throws IOException {
        return f20604i.c(inputStream, fVar);
    }

    public kotlin.reflect.x.internal.l0.e.b Q(int i2) {
        return this.s.get(i2);
    }

    public int R() {
        return this.s.size();
    }

    public List<kotlin.reflect.x.internal.l0.e.b> S() {
        return this.s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public r b() {
        return f20603h;
    }

    public q V() {
        return this.q;
    }

    public int W() {
        return this.r;
    }

    public int X() {
        return this.l;
    }

    public int Y() {
        return this.m;
    }

    public s Z(int i2) {
        return this.n.get(i2);
    }

    public int a0() {
        return this.n.size();
    }

    public List<s> b0() {
        return this.n;
    }

    public q c0() {
        return this.o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        if ((this.f20606k & 1) == 1) {
            codedOutputStream.a0(1, this.l);
        }
        if ((this.f20606k & 2) == 2) {
            codedOutputStream.a0(2, this.m);
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            codedOutputStream.d0(3, this.n.get(i2));
        }
        if ((this.f20606k & 4) == 4) {
            codedOutputStream.d0(4, this.o);
        }
        if ((this.f20606k & 8) == 8) {
            codedOutputStream.a0(5, this.p);
        }
        if ((this.f20606k & 16) == 16) {
            codedOutputStream.d0(6, this.q);
        }
        if ((this.f20606k & 32) == 32) {
            codedOutputStream.a0(7, this.r);
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            codedOutputStream.d0(8, this.s.get(i3));
        }
        for (int i4 = 0; i4 < this.t.size(); i4++) {
            codedOutputStream.a0(31, this.t.get(i4).intValue());
        }
        A.a(200, codedOutputStream);
        codedOutputStream.i0(this.f20605j);
    }

    public int d0() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.v;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20606k & 1) == 1 ? CodedOutputStream.o(1, this.l) + 0 : 0;
        if ((this.f20606k & 2) == 2) {
            o += CodedOutputStream.o(2, this.m);
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            o += CodedOutputStream.s(3, this.n.get(i3));
        }
        if ((this.f20606k & 4) == 4) {
            o += CodedOutputStream.s(4, this.o);
        }
        if ((this.f20606k & 8) == 8) {
            o += CodedOutputStream.o(5, this.p);
        }
        if ((this.f20606k & 16) == 16) {
            o += CodedOutputStream.s(6, this.q);
        }
        if ((this.f20606k & 32) == 32) {
            o += CodedOutputStream.o(7, this.r);
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            o += CodedOutputStream.s(8, this.s.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.t.size(); i6++) {
            i5 += CodedOutputStream.p(this.t.get(i6).intValue());
        }
        int size = o + i5 + (e0().size() * 2) + t() + this.f20605j.size();
        this.v = size;
        return size;
    }

    public List<Integer> e0() {
        return this.t;
    }

    public boolean f0() {
        return (this.f20606k & 16) == 16;
    }

    public boolean g0() {
        return (this.f20606k & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<r> h() {
        return f20604i;
    }

    public boolean h0() {
        return (this.f20606k & 1) == 1;
    }

    public boolean i0() {
        return (this.f20606k & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.u;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!i0()) {
            this.u = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < a0(); i2++) {
            if (!Z(i2).isInitialized()) {
                this.u = (byte) 0;
                return false;
            }
        }
        if (j0() && !c0().isInitialized()) {
            this.u = (byte) 0;
            return false;
        }
        if (f0() && !V().isInitialized()) {
            this.u = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < R(); i3++) {
            if (!Q(i3).isInitialized()) {
                this.u = (byte) 0;
                return false;
            }
        }
        if (!s()) {
            this.u = (byte) 0;
            return false;
        }
        this.u = (byte) 1;
        return true;
    }

    public boolean j0() {
        return (this.f20606k & 4) == 4;
    }

    public boolean k0() {
        return (this.f20606k & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return n0(this);
    }

    private r(h.c<r, ?> cVar) {
        super(cVar);
        this.u = (byte) -1;
        this.v = -1;
        this.f20605j = cVar.l();
    }

    private r(boolean z) {
        this.u = (byte) -1;
        this.v = -1;
        this.f20605j = d.f21894f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0022. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private r(e eVar, f fVar) throws InvalidProtocolBufferException {
        q.c c2;
        this.u = (byte) -1;
        this.v = -1;
        l0();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ?? r5 = 128;
            if (!z) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.f20606k |= 1;
                                    this.l = eVar.s();
                                case 16:
                                    this.f20606k |= 2;
                                    this.m = eVar.s();
                                case 26:
                                    if ((i2 & 4) != 4) {
                                        this.n = new ArrayList();
                                        i2 |= 4;
                                    }
                                    this.n.add(eVar.u(s.f20611i, fVar));
                                case 34:
                                    c2 = (this.f20606k & 4) == 4 ? this.o.c() : null;
                                    q qVar = (q) eVar.u(q.f20582i, fVar);
                                    this.o = qVar;
                                    if (c2 != null) {
                                        c2.m(qVar);
                                        this.o = c2.u();
                                    }
                                    this.f20606k |= 4;
                                case 40:
                                    this.f20606k |= 8;
                                    this.p = eVar.s();
                                case 50:
                                    c2 = (this.f20606k & 16) == 16 ? this.q.c() : null;
                                    q qVar2 = (q) eVar.u(q.f20582i, fVar);
                                    this.q = qVar2;
                                    if (c2 != null) {
                                        c2.m(qVar2);
                                        this.q = c2.u();
                                    }
                                    this.f20606k |= 16;
                                case 56:
                                    this.f20606k |= 32;
                                    this.r = eVar.s();
                                case 66:
                                    if ((i2 & 128) != 128) {
                                        this.s = new ArrayList();
                                        i2 |= 128;
                                    }
                                    this.s.add(eVar.u(kotlin.reflect.x.internal.l0.e.b.f20410h, fVar));
                                case 248:
                                    if ((i2 & 256) != 256) {
                                        this.t = new ArrayList();
                                        i2 |= 256;
                                    }
                                    this.t.add(Integer.valueOf(eVar.s()));
                                case 250:
                                    int j2 = eVar.j(eVar.A());
                                    if ((i2 & 256) != 256 && eVar.e() > 0) {
                                        this.t = new ArrayList();
                                        i2 |= 256;
                                    }
                                    while (eVar.e() > 0) {
                                        this.t.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j2);
                                    break;
                                default:
                                    r5 = p(eVar, J, fVar, K);
                                    if (r5 == 0) {
                                        z = true;
                                    }
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).i(this);
                        }
                    } catch (InvalidProtocolBufferException e3) {
                        throw e3.i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 4) == 4) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    if ((i2 & 128) == r5) {
                        this.s = Collections.unmodifiableList(this.s);
                    }
                    if ((i2 & 256) == 256) {
                        this.t = Collections.unmodifiableList(this.t);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f20605j = O.w();
                        throw th2;
                    }
                    this.f20605j = O.w();
                    m();
                    throw th;
                }
            } else {
                if ((i2 & 4) == 4) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                if ((i2 & 128) == 128) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if ((i2 & 256) == 256) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f20605j = O.w();
                    throw th3;
                }
                this.f20605j = O.w();
                m();
                return;
            }
        }
    }
}
