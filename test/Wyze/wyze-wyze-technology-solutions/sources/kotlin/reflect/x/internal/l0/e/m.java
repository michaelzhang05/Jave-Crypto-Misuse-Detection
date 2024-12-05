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
import kotlin.reflect.x.internal.l0.e.l;
import kotlin.reflect.x.internal.l0.e.o;
import kotlin.reflect.x.internal.l0.e.p;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class m extends h.d<m> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final m f20538h;

    /* renamed from: i, reason: collision with root package name */
    public static q<m> f20539i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final d f20540j;

    /* renamed from: k, reason: collision with root package name */
    private int f20541k;
    private p l;
    private o m;
    private l n;
    private List<c> o;
    private byte p;
    private int q;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<m> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public m b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new m(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.c<m, b> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20542i;

        /* renamed from: j, reason: collision with root package name */
        private p f20543j = p.u();

        /* renamed from: k, reason: collision with root package name */
        private o f20544k = o.u();
        private l l = l.M();
        private List<c> m = Collections.emptyList();

        private b() {
            A();
        }

        private void A() {
        }

        static /* synthetic */ b s() {
            return x();
        }

        private static b x() {
            return new b();
        }

        private void y() {
            if ((this.f20542i & 8) != 8) {
                this.m = new ArrayList(this.m);
                this.f20542i |= 8;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b m(m mVar) {
            if (mVar == m.M()) {
                return this;
            }
            if (mVar.T()) {
                G(mVar.Q());
            }
            if (mVar.S()) {
                F(mVar.P());
            }
            if (mVar.R()) {
                E(mVar.O());
            }
            if (!mVar.o.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = mVar.o;
                    this.f20542i &= -9;
                } else {
                    y();
                    this.m.addAll(mVar.o);
                }
            }
            r(mVar);
            n(l().b(mVar.f20540j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.m.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.m> r1 = kotlin.reflect.x.internal.l0.e.m.f20539i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.m r3 = (kotlin.reflect.x.internal.l0.e.m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.m r4 = (kotlin.reflect.x.internal.l0.e.m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.m.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.m$b");
        }

        public b E(l lVar) {
            if ((this.f20542i & 4) == 4 && this.l != l.M()) {
                this.l = l.d0(this.l).m(lVar).u();
            } else {
                this.l = lVar;
            }
            this.f20542i |= 4;
            return this;
        }

        public b F(o oVar) {
            if ((this.f20542i & 2) == 2 && this.f20544k != o.u()) {
                this.f20544k = o.B(this.f20544k).m(oVar).q();
            } else {
                this.f20544k = oVar;
            }
            this.f20542i |= 2;
            return this;
        }

        public b G(p pVar) {
            if ((this.f20542i & 1) == 1 && this.f20543j != p.u()) {
                this.f20543j = p.B(this.f20543j).m(pVar).q();
            } else {
                this.f20543j = pVar;
            }
            this.f20542i |= 1;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public m a() {
            m u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public m u() {
            m mVar = new m(this);
            int i2 = this.f20542i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            mVar.l = this.f20543j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            mVar.m = this.f20544k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            mVar.n = this.l;
            if ((this.f20542i & 8) == 8) {
                this.m = Collections.unmodifiableList(this.m);
                this.f20542i &= -9;
            }
            mVar.o = this.m;
            mVar.f20541k = i3;
            return mVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    static {
        m mVar = new m(true);
        f20538h = mVar;
        mVar.U();
    }

    public static m M() {
        return f20538h;
    }

    private void U() {
        this.l = p.u();
        this.m = o.u();
        this.n = l.M();
        this.o = Collections.emptyList();
    }

    public static b V() {
        return b.s();
    }

    public static b W(m mVar) {
        return V().m(mVar);
    }

    public static m Y(InputStream inputStream, f fVar) throws IOException {
        return f20539i.a(inputStream, fVar);
    }

    public c J(int i2) {
        return this.o.get(i2);
    }

    public int K() {
        return this.o.size();
    }

    public List<c> L() {
        return this.o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public m b() {
        return f20538h;
    }

    public l O() {
        return this.n;
    }

    public o P() {
        return this.m;
    }

    public p Q() {
        return this.l;
    }

    public boolean R() {
        return (this.f20541k & 4) == 4;
    }

    public boolean S() {
        return (this.f20541k & 2) == 2;
    }

    public boolean T() {
        return (this.f20541k & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public b g() {
        return V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b c() {
        return W(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        if ((this.f20541k & 1) == 1) {
            codedOutputStream.d0(1, this.l);
        }
        if ((this.f20541k & 2) == 2) {
            codedOutputStream.d0(2, this.m);
        }
        if ((this.f20541k & 4) == 4) {
            codedOutputStream.d0(3, this.n);
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            codedOutputStream.d0(4, this.o.get(i2));
        }
        A.a(200, codedOutputStream);
        codedOutputStream.i0(this.f20540j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.q;
        if (i2 != -1) {
            return i2;
        }
        int s = (this.f20541k & 1) == 1 ? CodedOutputStream.s(1, this.l) + 0 : 0;
        if ((this.f20541k & 2) == 2) {
            s += CodedOutputStream.s(2, this.m);
        }
        if ((this.f20541k & 4) == 4) {
            s += CodedOutputStream.s(3, this.n);
        }
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            s += CodedOutputStream.s(4, this.o.get(i3));
        }
        int t = s + t() + this.f20540j.size();
        this.q = t;
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<m> h() {
        return f20539i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.p;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (S() && !P().isInitialized()) {
            this.p = (byte) 0;
            return false;
        }
        if (R() && !O().isInitialized()) {
            this.p = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < K(); i2++) {
            if (!J(i2).isInitialized()) {
                this.p = (byte) 0;
                return false;
            }
        }
        if (!s()) {
            this.p = (byte) 0;
            return false;
        }
        this.p = (byte) 1;
        return true;
    }

    private m(h.c<m, ?> cVar) {
        super(cVar);
        this.p = (byte) -1;
        this.q = -1;
        this.f20540j = cVar.l();
    }

    private m(boolean z) {
        this.p = (byte) -1;
        this.q = -1;
        this.f20540j = d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.p = (byte) -1;
        this.q = -1;
        U();
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
                            if (K == 10) {
                                p.b c2 = (this.f20541k & 1) == 1 ? this.l.c() : null;
                                p pVar = (p) eVar.u(p.f20575h, fVar);
                                this.l = pVar;
                                if (c2 != null) {
                                    c2.m(pVar);
                                    this.l = c2.q();
                                }
                                this.f20541k |= 1;
                            } else if (K == 18) {
                                o.b c3 = (this.f20541k & 2) == 2 ? this.m.c() : null;
                                o oVar = (o) eVar.u(o.f20553h, fVar);
                                this.m = oVar;
                                if (c3 != null) {
                                    c3.m(oVar);
                                    this.m = c3.q();
                                }
                                this.f20541k |= 2;
                            } else if (K == 26) {
                                l.b c4 = (this.f20541k & 4) == 4 ? this.n.c() : null;
                                l lVar = (l) eVar.u(l.f20532i, fVar);
                                this.n = lVar;
                                if (c4 != null) {
                                    c4.m(lVar);
                                    this.n = c4.u();
                                }
                                this.f20541k |= 4;
                            } else if (K != 34) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                if ((i2 & 8) != 8) {
                                    this.o = new ArrayList();
                                    i2 |= 8;
                                }
                                this.o.add(eVar.u(c.f20442i, fVar));
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
                if ((i2 & 8) == 8) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20540j = O.w();
                    throw th2;
                }
                this.f20540j = O.w();
                m();
                throw th;
            }
        }
        if ((i2 & 8) == 8) {
            this.o = Collections.unmodifiableList(this.o);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20540j = O.w();
            throw th3;
        }
        this.f20540j = O.w();
        m();
    }
}
