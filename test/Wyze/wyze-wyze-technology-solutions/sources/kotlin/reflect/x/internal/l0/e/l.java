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
import kotlin.reflect.x.internal.l0.e.t;
import kotlin.reflect.x.internal.l0.e.w;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class l extends h.d<l> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final l f20531h;

    /* renamed from: i, reason: collision with root package name */
    public static q<l> f20532i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final d f20533j;

    /* renamed from: k, reason: collision with root package name */
    private int f20534k;
    private List<i> l;
    private List<n> m;
    private List<r> n;
    private t o;
    private w p;
    private byte q;
    private int r;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<l> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public l b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new l(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.c<l, b> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20535i;

        /* renamed from: j, reason: collision with root package name */
        private List<i> f20536j = Collections.emptyList();

        /* renamed from: k, reason: collision with root package name */
        private List<n> f20537k = Collections.emptyList();
        private List<r> l = Collections.emptyList();
        private t m = t.y();
        private w n = w.u();

        private b() {
            C();
        }

        private void A() {
            if ((this.f20535i & 2) != 2) {
                this.f20537k = new ArrayList(this.f20537k);
                this.f20535i |= 2;
            }
        }

        private void B() {
            if ((this.f20535i & 4) != 4) {
                this.l = new ArrayList(this.l);
                this.f20535i |= 4;
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
            if ((this.f20535i & 1) != 1) {
                this.f20536j = new ArrayList(this.f20536j);
                this.f20535i |= 1;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b m(l lVar) {
            if (lVar == l.M()) {
                return this;
            }
            if (!lVar.l.isEmpty()) {
                if (this.f20536j.isEmpty()) {
                    this.f20536j = lVar.l;
                    this.f20535i &= -2;
                } else {
                    y();
                    this.f20536j.addAll(lVar.l);
                }
            }
            if (!lVar.m.isEmpty()) {
                if (this.f20537k.isEmpty()) {
                    this.f20537k = lVar.m;
                    this.f20535i &= -3;
                } else {
                    A();
                    this.f20537k.addAll(lVar.m);
                }
            }
            if (!lVar.n.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = lVar.n;
                    this.f20535i &= -5;
                } else {
                    B();
                    this.l.addAll(lVar.n);
                }
            }
            if (lVar.Z()) {
                G(lVar.X());
            }
            if (lVar.a0()) {
                H(lVar.Y());
            }
            r(lVar);
            n(l().b(lVar.f20533j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.l.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.l> r1 = kotlin.reflect.x.internal.l0.e.l.f20532i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.l r3 = (kotlin.reflect.x.internal.l0.e.l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.l r4 = (kotlin.reflect.x.internal.l0.e.l) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.l.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.l$b");
        }

        public b G(t tVar) {
            if ((this.f20535i & 8) == 8 && this.m != t.y()) {
                this.m = t.G(this.m).m(tVar).q();
            } else {
                this.m = tVar;
            }
            this.f20535i |= 8;
            return this;
        }

        public b H(w wVar) {
            if ((this.f20535i & 16) == 16 && this.n != w.u()) {
                this.n = w.B(this.n).m(wVar).q();
            } else {
                this.n = wVar;
            }
            this.f20535i |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public l a() {
            l u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public l u() {
            l lVar = new l(this);
            int i2 = this.f20535i;
            if ((i2 & 1) == 1) {
                this.f20536j = Collections.unmodifiableList(this.f20536j);
                this.f20535i &= -2;
            }
            lVar.l = this.f20536j;
            if ((this.f20535i & 2) == 2) {
                this.f20537k = Collections.unmodifiableList(this.f20537k);
                this.f20535i &= -3;
            }
            lVar.m = this.f20537k;
            if ((this.f20535i & 4) == 4) {
                this.l = Collections.unmodifiableList(this.l);
                this.f20535i &= -5;
            }
            lVar.n = this.l;
            int i3 = (i2 & 8) != 8 ? 0 : 1;
            lVar.o = this.m;
            if ((i2 & 16) == 16) {
                i3 |= 2;
            }
            lVar.p = this.n;
            lVar.f20534k = i3;
            return lVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    static {
        l lVar = new l(true);
        f20531h = lVar;
        lVar.b0();
    }

    public static l M() {
        return f20531h;
    }

    private void b0() {
        this.l = Collections.emptyList();
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
        this.o = t.y();
        this.p = w.u();
    }

    public static b c0() {
        return b.s();
    }

    public static b d0(l lVar) {
        return c0().m(lVar);
    }

    public static l f0(InputStream inputStream, f fVar) throws IOException {
        return f20532i.a(inputStream, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public l b() {
        return f20531h;
    }

    public i O(int i2) {
        return this.l.get(i2);
    }

    public int P() {
        return this.l.size();
    }

    public List<i> Q() {
        return this.l;
    }

    public n R(int i2) {
        return this.m.get(i2);
    }

    public int S() {
        return this.m.size();
    }

    public List<n> T() {
        return this.m;
    }

    public r U(int i2) {
        return this.n.get(i2);
    }

    public int V() {
        return this.n.size();
    }

    public List<r> W() {
        return this.n;
    }

    public t X() {
        return this.o;
    }

    public w Y() {
        return this.p;
    }

    public boolean Z() {
        return (this.f20534k & 1) == 1;
    }

    public boolean a0() {
        return (this.f20534k & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            codedOutputStream.d0(3, this.l.get(i2));
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            codedOutputStream.d0(4, this.m.get(i3));
        }
        for (int i4 = 0; i4 < this.n.size(); i4++) {
            codedOutputStream.d0(5, this.n.get(i4));
        }
        if ((this.f20534k & 1) == 1) {
            codedOutputStream.d0(30, this.o);
        }
        if ((this.f20534k & 2) == 2) {
            codedOutputStream.d0(32, this.p);
        }
        A.a(200, codedOutputStream);
        codedOutputStream.i0(this.f20533j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.r;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.l.size(); i4++) {
            i3 += CodedOutputStream.s(3, this.l.get(i4));
        }
        for (int i5 = 0; i5 < this.m.size(); i5++) {
            i3 += CodedOutputStream.s(4, this.m.get(i5));
        }
        for (int i6 = 0; i6 < this.n.size(); i6++) {
            i3 += CodedOutputStream.s(5, this.n.get(i6));
        }
        if ((this.f20534k & 1) == 1) {
            i3 += CodedOutputStream.s(30, this.o);
        }
        if ((this.f20534k & 2) == 2) {
            i3 += CodedOutputStream.s(32, this.p);
        }
        int t = i3 + t() + this.f20533j.size();
        this.r = t;
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return c0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return d0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<l> h() {
        return f20532i;
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
        for (int i2 = 0; i2 < P(); i2++) {
            if (!O(i2).isInitialized()) {
                this.q = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < S(); i3++) {
            if (!R(i3).isInitialized()) {
                this.q = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < V(); i4++) {
            if (!U(i4).isInitialized()) {
                this.q = (byte) 0;
                return false;
            }
        }
        if (Z() && !X().isInitialized()) {
            this.q = (byte) 0;
            return false;
        }
        if (!s()) {
            this.q = (byte) 0;
            return false;
        }
        this.q = (byte) 1;
        return true;
    }

    private l(h.c<l, ?> cVar) {
        super(cVar);
        this.q = (byte) -1;
        this.r = -1;
        this.f20533j = cVar.l();
    }

    private l(boolean z) {
        this.q = (byte) -1;
        this.r = -1;
        this.f20533j = d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.q = (byte) -1;
        this.r = -1;
        b0();
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
                            if (K == 26) {
                                if ((i2 & 1) != 1) {
                                    this.l = new ArrayList();
                                    i2 |= 1;
                                }
                                this.l.add(eVar.u(i.f20513i, fVar));
                            } else if (K == 34) {
                                if ((i2 & 2) != 2) {
                                    this.m = new ArrayList();
                                    i2 |= 2;
                                }
                                this.m.add(eVar.u(n.f20546i, fVar));
                            } else if (K != 42) {
                                if (K == 242) {
                                    t.b c2 = (this.f20534k & 1) == 1 ? this.o.c() : null;
                                    t tVar = (t) eVar.u(t.f20624h, fVar);
                                    this.o = tVar;
                                    if (c2 != null) {
                                        c2.m(tVar);
                                        this.o = c2.q();
                                    }
                                    this.f20534k |= 1;
                                } else if (K != 258) {
                                    if (!p(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    w.b c3 = (this.f20534k & 2) == 2 ? this.p.c() : null;
                                    w wVar = (w) eVar.u(w.f20661h, fVar);
                                    this.p = wVar;
                                    if (c3 != null) {
                                        c3.m(wVar);
                                        this.p = c3.q();
                                    }
                                    this.f20534k |= 2;
                                }
                            } else {
                                if ((i2 & 4) != 4) {
                                    this.n = new ArrayList();
                                    i2 |= 4;
                                }
                                this.n.add(eVar.u(r.f20604i, fVar));
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
                if ((i2 & 1) == 1) {
                    this.l = Collections.unmodifiableList(this.l);
                }
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
                    this.f20533j = O.w();
                    throw th2;
                }
                this.f20533j = O.w();
                m();
                throw th;
            }
        }
        if ((i2 & 1) == 1) {
            this.l = Collections.unmodifiableList(this.l);
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
            this.f20533j = O.w();
            throw th3;
        }
        this.f20533j = O.w();
        m();
    }
}
