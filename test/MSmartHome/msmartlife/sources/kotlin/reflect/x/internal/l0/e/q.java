package kotlin.reflect.x.internal.l0.e;

import androidx.recyclerview.widget.RecyclerView;
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

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class q extends h.d<q> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final q f20581h;

    /* renamed from: i, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<q> f20582i = new a();
    private int A;

    /* renamed from: j, reason: collision with root package name */
    private final d f20583j;

    /* renamed from: k, reason: collision with root package name */
    private int f20584k;
    private List<b> l;
    private boolean m;
    private int n;
    private q o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private q u;
    private int v;
    private q w;
    private int x;
    private int y;
    private byte z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<q> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public q b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new q(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class c extends h.c<q, c> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20600i;

        /* renamed from: k, reason: collision with root package name */
        private boolean f20602k;
        private int l;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int t;
        private int v;
        private int w;

        /* renamed from: j, reason: collision with root package name */
        private List<b> f20601j = Collections.emptyList();
        private q m = q.Z();
        private q s = q.Z();
        private q u = q.Z();

        private c() {
            A();
        }

        private void A() {
        }

        static /* synthetic */ c s() {
            return x();
        }

        private static c x() {
            return new c();
        }

        private void y() {
            if ((this.f20600i & 1) != 1) {
                this.f20601j = new ArrayList(this.f20601j);
                this.f20600i |= 1;
            }
        }

        public c B(q qVar) {
            if ((this.f20600i & RecyclerView.l.FLAG_MOVED) == 2048 && this.u != q.Z()) {
                this.u = q.A0(this.u).m(qVar).u();
            } else {
                this.u = qVar;
            }
            this.f20600i |= RecyclerView.l.FLAG_MOVED;
            return this;
        }

        public c C(q qVar) {
            if ((this.f20600i & 8) == 8 && this.m != q.Z()) {
                this.m = q.A0(this.m).m(qVar).u();
            } else {
                this.m = qVar;
            }
            this.f20600i |= 8;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c m(q qVar) {
            if (qVar == q.Z()) {
                return this;
            }
            if (!qVar.l.isEmpty()) {
                if (this.f20601j.isEmpty()) {
                    this.f20601j = qVar.l;
                    this.f20600i &= -2;
                } else {
                    y();
                    this.f20601j.addAll(qVar.l);
                }
            }
            if (qVar.s0()) {
                O(qVar.f0());
            }
            if (qVar.p0()) {
                M(qVar.c0());
            }
            if (qVar.q0()) {
                C(qVar.d0());
            }
            if (qVar.r0()) {
                N(qVar.e0());
            }
            if (qVar.n0()) {
                I(qVar.Y());
            }
            if (qVar.w0()) {
                S(qVar.j0());
            }
            if (qVar.x0()) {
                T(qVar.k0());
            }
            if (qVar.v0()) {
                R(qVar.i0());
            }
            if (qVar.t0()) {
                G(qVar.g0());
            }
            if (qVar.u0()) {
                Q(qVar.h0());
            }
            if (qVar.l0()) {
                B(qVar.T());
            }
            if (qVar.m0()) {
                H(qVar.U());
            }
            if (qVar.o0()) {
                K(qVar.b0());
            }
            r(qVar);
            n(l().b(qVar.f20583j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.q.c w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.q> r1 = kotlin.reflect.x.internal.l0.e.q.f20582i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.q r3 = (kotlin.reflect.x.internal.l0.e.q) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.q r4 = (kotlin.reflect.x.internal.l0.e.q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.q.c.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.q$c");
        }

        public c G(q qVar) {
            if ((this.f20600i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512 && this.s != q.Z()) {
                this.s = q.A0(this.s).m(qVar).u();
            } else {
                this.s = qVar;
            }
            this.f20600i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            return this;
        }

        public c H(int i2) {
            this.f20600i |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.v = i2;
            return this;
        }

        public c I(int i2) {
            this.f20600i |= 32;
            this.o = i2;
            return this;
        }

        public c K(int i2) {
            this.f20600i |= 8192;
            this.w = i2;
            return this;
        }

        public c M(int i2) {
            this.f20600i |= 4;
            this.l = i2;
            return this;
        }

        public c N(int i2) {
            this.f20600i |= 16;
            this.n = i2;
            return this;
        }

        public c O(boolean z) {
            this.f20600i |= 2;
            this.f20602k = z;
            return this;
        }

        public c Q(int i2) {
            this.f20600i |= 1024;
            this.t = i2;
            return this;
        }

        public c R(int i2) {
            this.f20600i |= 256;
            this.r = i2;
            return this;
        }

        public c S(int i2) {
            this.f20600i |= 64;
            this.p = i2;
            return this;
        }

        public c T(int i2) {
            this.f20600i |= 128;
            this.q = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public q a() {
            q u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public q u() {
            q qVar = new q(this);
            int i2 = this.f20600i;
            if ((i2 & 1) == 1) {
                this.f20601j = Collections.unmodifiableList(this.f20601j);
                this.f20600i &= -2;
            }
            qVar.l = this.f20601j;
            int i3 = (i2 & 2) != 2 ? 0 : 1;
            qVar.m = this.f20602k;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            qVar.n = this.l;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            qVar.o = this.m;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            qVar.p = this.n;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            qVar.q = this.o;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            qVar.r = this.p;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            qVar.s = this.q;
            if ((i2 & 256) == 256) {
                i3 |= 128;
            }
            qVar.t = this.r;
            if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                i3 |= 256;
            }
            qVar.u = this.s;
            if ((i2 & 1024) == 1024) {
                i3 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            qVar.v = this.t;
            if ((i2 & RecyclerView.l.FLAG_MOVED) == 2048) {
                i3 |= 1024;
            }
            qVar.w = this.u;
            if ((i2 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i3 |= RecyclerView.l.FLAG_MOVED;
            }
            qVar.x = this.v;
            if ((i2 & 8192) == 8192) {
                i3 |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            qVar.y = this.w;
            qVar.f20584k = i3;
            return qVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public c k() {
            return x().m(u());
        }
    }

    static {
        q qVar = new q(true);
        f20581h = qVar;
        qVar.y0();
    }

    public static c A0(q qVar) {
        return z0().m(qVar);
    }

    public static q Z() {
        return f20581h;
    }

    private void y0() {
        this.l = Collections.emptyList();
        this.m = false;
        this.n = 0;
        this.o = Z();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = Z();
        this.v = 0;
        this.w = Z();
        this.x = 0;
        this.y = 0;
    }

    public static c z0() {
        return c.s();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public c g() {
        return z0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public c c() {
        return A0(this);
    }

    public q T() {
        return this.w;
    }

    public int U() {
        return this.x;
    }

    public b V(int i2) {
        return this.l.get(i2);
    }

    public int W() {
        return this.l.size();
    }

    public List<b> X() {
        return this.l;
    }

    public int Y() {
        return this.q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public q b() {
        return f20581h;
    }

    public int b0() {
        return this.y;
    }

    public int c0() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        if ((this.f20584k & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            codedOutputStream.a0(1, this.y);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            codedOutputStream.d0(2, this.l.get(i2));
        }
        if ((this.f20584k & 1) == 1) {
            codedOutputStream.L(3, this.m);
        }
        if ((this.f20584k & 2) == 2) {
            codedOutputStream.a0(4, this.n);
        }
        if ((this.f20584k & 4) == 4) {
            codedOutputStream.d0(5, this.o);
        }
        if ((this.f20584k & 16) == 16) {
            codedOutputStream.a0(6, this.q);
        }
        if ((this.f20584k & 32) == 32) {
            codedOutputStream.a0(7, this.r);
        }
        if ((this.f20584k & 8) == 8) {
            codedOutputStream.a0(8, this.p);
        }
        if ((this.f20584k & 64) == 64) {
            codedOutputStream.a0(9, this.s);
        }
        if ((this.f20584k & 256) == 256) {
            codedOutputStream.d0(10, this.u);
        }
        if ((this.f20584k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            codedOutputStream.a0(11, this.v);
        }
        if ((this.f20584k & 128) == 128) {
            codedOutputStream.a0(12, this.t);
        }
        if ((this.f20584k & 1024) == 1024) {
            codedOutputStream.d0(13, this.w);
        }
        if ((this.f20584k & RecyclerView.l.FLAG_MOVED) == 2048) {
            codedOutputStream.a0(14, this.x);
        }
        A.a(200, codedOutputStream);
        codedOutputStream.i0(this.f20583j);
    }

    public q d0() {
        return this.o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.A;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20584k & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096 ? CodedOutputStream.o(1, this.y) + 0 : 0;
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            o += CodedOutputStream.s(2, this.l.get(i3));
        }
        if ((this.f20584k & 1) == 1) {
            o += CodedOutputStream.a(3, this.m);
        }
        if ((this.f20584k & 2) == 2) {
            o += CodedOutputStream.o(4, this.n);
        }
        if ((this.f20584k & 4) == 4) {
            o += CodedOutputStream.s(5, this.o);
        }
        if ((this.f20584k & 16) == 16) {
            o += CodedOutputStream.o(6, this.q);
        }
        if ((this.f20584k & 32) == 32) {
            o += CodedOutputStream.o(7, this.r);
        }
        if ((this.f20584k & 8) == 8) {
            o += CodedOutputStream.o(8, this.p);
        }
        if ((this.f20584k & 64) == 64) {
            o += CodedOutputStream.o(9, this.s);
        }
        if ((this.f20584k & 256) == 256) {
            o += CodedOutputStream.s(10, this.u);
        }
        if ((this.f20584k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            o += CodedOutputStream.o(11, this.v);
        }
        if ((this.f20584k & 128) == 128) {
            o += CodedOutputStream.o(12, this.t);
        }
        if ((this.f20584k & 1024) == 1024) {
            o += CodedOutputStream.s(13, this.w);
        }
        if ((this.f20584k & RecyclerView.l.FLAG_MOVED) == 2048) {
            o += CodedOutputStream.o(14, this.x);
        }
        int t = o + t() + this.f20583j.size();
        this.A = t;
        return t;
    }

    public int e0() {
        return this.p;
    }

    public boolean f0() {
        return this.m;
    }

    public q g0() {
        return this.u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<q> h() {
        return f20582i;
    }

    public int h0() {
        return this.v;
    }

    public int i0() {
        return this.t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.z;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < W(); i2++) {
            if (!V(i2).isInitialized()) {
                this.z = (byte) 0;
                return false;
            }
        }
        if (q0() && !d0().isInitialized()) {
            this.z = (byte) 0;
            return false;
        }
        if (t0() && !g0().isInitialized()) {
            this.z = (byte) 0;
            return false;
        }
        if (l0() && !T().isInitialized()) {
            this.z = (byte) 0;
            return false;
        }
        if (!s()) {
            this.z = (byte) 0;
            return false;
        }
        this.z = (byte) 1;
        return true;
    }

    public int j0() {
        return this.r;
    }

    public int k0() {
        return this.s;
    }

    public boolean l0() {
        return (this.f20584k & 1024) == 1024;
    }

    public boolean m0() {
        return (this.f20584k & RecyclerView.l.FLAG_MOVED) == 2048;
    }

    public boolean n0() {
        return (this.f20584k & 16) == 16;
    }

    public boolean o0() {
        return (this.f20584k & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096;
    }

    public boolean p0() {
        return (this.f20584k & 2) == 2;
    }

    public boolean q0() {
        return (this.f20584k & 4) == 4;
    }

    public boolean r0() {
        return (this.f20584k & 8) == 8;
    }

    public boolean s0() {
        return (this.f20584k & 1) == 1;
    }

    public boolean t0() {
        return (this.f20584k & 256) == 256;
    }

    public boolean u0() {
        return (this.f20584k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
    }

    public boolean v0() {
        return (this.f20584k & 128) == 128;
    }

    public boolean w0() {
        return (this.f20584k & 32) == 32;
    }

    public boolean x0() {
        return (this.f20584k & 64) == 64;
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h implements p {

        /* renamed from: g, reason: collision with root package name */
        private static final b f20585g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f20586h = new a();

        /* renamed from: i, reason: collision with root package name */
        private final d f20587i;

        /* renamed from: j, reason: collision with root package name */
        private int f20588j;

        /* renamed from: k, reason: collision with root package name */
        private c f20589k;
        private q l;
        private int m;
        private byte n;
        private int o;

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
        /* renamed from: kotlin.f0.x.e.l0.e.q$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0326b extends h.b<b, C0326b> implements p {

            /* renamed from: g, reason: collision with root package name */
            private int f20590g;

            /* renamed from: h, reason: collision with root package name */
            private c f20591h = c.INV;

            /* renamed from: i, reason: collision with root package name */
            private q f20592i = q.Z();

            /* renamed from: j, reason: collision with root package name */
            private int f20593j;

            private C0326b() {
                t();
            }

            static /* synthetic */ C0326b o() {
                return s();
            }

            private static C0326b s() {
                return new C0326b();
            }

            private void t() {
            }

            public C0326b A(int i2) {
                this.f20590g |= 4;
                this.f20593j = i2;
                return this;
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
                int i2 = this.f20590g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                bVar.f20589k = this.f20591h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                bVar.l = this.f20592i;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                bVar.m = this.f20593j;
                bVar.f20588j = i3;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0326b k() {
                return s().m(q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0326b m(b bVar) {
                if (bVar == b.y()) {
                    return this;
                }
                if (bVar.C()) {
                    y(bVar.z());
                }
                if (bVar.D()) {
                    x(bVar.A());
                }
                if (bVar.E()) {
                    A(bVar.B());
                }
                n(l().b(bVar.f20587i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.f0.x.e.l0.e.q.b.C0326b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.q$b> r1 = kotlin.f0.x.e.l0.e.q.b.f20586h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.x.e.l0.e.q$b r3 = (kotlin.f0.x.e.l0.e.q.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.x.e.l0.e.q$b r4 = (kotlin.f0.x.e.l0.e.q.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.q.b.C0326b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.q$b$b");
            }

            public C0326b x(q qVar) {
                if ((this.f20590g & 2) == 2 && this.f20592i != q.Z()) {
                    this.f20592i = q.A0(this.f20592i).m(qVar).u();
                } else {
                    this.f20592i = qVar;
                }
                this.f20590g |= 2;
                return this;
            }

            public C0326b y(c cVar) {
                cVar.getClass();
                this.f20590g |= 1;
                this.f20591h = cVar;
                return this;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes2.dex */
        public enum c implements i.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* renamed from: j, reason: collision with root package name */
            private static i.b<c> f20598j = new a();
            private final int l;

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
                this.l = i3;
            }

            public static c d(int i2) {
                if (i2 == 0) {
                    return IN;
                }
                if (i2 == 1) {
                    return OUT;
                }
                if (i2 == 2) {
                    return INV;
                }
                if (i2 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
            public final int a() {
                return this.l;
            }
        }

        static {
            b bVar = new b(true);
            f20585g = bVar;
            bVar.F();
        }

        private void F() {
            this.f20589k = c.INV;
            this.l = q.Z();
            this.m = 0;
        }

        public static C0326b G() {
            return C0326b.o();
        }

        public static C0326b H(b bVar) {
            return G().m(bVar);
        }

        public static b y() {
            return f20585g;
        }

        public q A() {
            return this.l;
        }

        public int B() {
            return this.m;
        }

        public boolean C() {
            return (this.f20588j & 1) == 1;
        }

        public boolean D() {
            return (this.f20588j & 2) == 2;
        }

        public boolean E() {
            return (this.f20588j & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public C0326b g() {
            return G();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public C0326b c() {
            return H(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.f20588j & 1) == 1) {
                codedOutputStream.S(1, this.f20589k.a());
            }
            if ((this.f20588j & 2) == 2) {
                codedOutputStream.d0(2, this.l);
            }
            if ((this.f20588j & 4) == 4) {
                codedOutputStream.a0(3, this.m);
            }
            codedOutputStream.i0(this.f20587i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int e() {
            int i2 = this.o;
            if (i2 != -1) {
                return i2;
            }
            int h2 = (this.f20588j & 1) == 1 ? 0 + CodedOutputStream.h(1, this.f20589k.a()) : 0;
            if ((this.f20588j & 2) == 2) {
                h2 += CodedOutputStream.s(2, this.l);
            }
            if ((this.f20588j & 4) == 4) {
                h2 += CodedOutputStream.o(3, this.m);
            }
            int size = h2 + this.f20587i.size();
            this.o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<b> h() {
            return f20586h;
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
            if (D() && !A().isInitialized()) {
                this.n = (byte) 0;
                return false;
            }
            this.n = (byte) 1;
            return true;
        }

        public c z() {
            return this.f20589k;
        }

        private b(h.b bVar) {
            super(bVar);
            this.n = (byte) -1;
            this.o = -1;
            this.f20587i = bVar.l();
        }

        private b(boolean z) {
            this.n = (byte) -1;
            this.o = -1;
            this.f20587i = d.f21894f;
        }

        private b(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.n = (byte) -1;
            this.o = -1;
            F();
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
                                    int n = eVar.n();
                                    c d2 = c.d(n);
                                    if (d2 == null) {
                                        J.o0(K);
                                        J.o0(n);
                                    } else {
                                        this.f20588j |= 1;
                                        this.f20589k = d2;
                                    }
                                } else if (K == 18) {
                                    c c2 = (this.f20588j & 2) == 2 ? this.l.c() : null;
                                    q qVar = (q) eVar.u(q.f20582i, fVar);
                                    this.l = qVar;
                                    if (c2 != null) {
                                        c2.m(qVar);
                                        this.l = c2.u();
                                    }
                                    this.f20588j |= 2;
                                } else if (K != 24) {
                                    if (!p(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    this.f20588j |= 4;
                                    this.m = eVar.s();
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
                        this.f20587i = O.w();
                        throw th2;
                    }
                    this.f20587i = O.w();
                    m();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f20587i = O.w();
                throw th3;
            }
            this.f20587i = O.w();
            m();
        }
    }

    private q(h.c<q, ?> cVar) {
        super(cVar);
        this.z = (byte) -1;
        this.A = -1;
        this.f20583j = cVar.l();
    }

    private q(boolean z) {
        this.z = (byte) -1;
        this.A = -1;
        this.f20583j = d.f21894f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    private q(e eVar, f fVar) throws InvalidProtocolBufferException {
        c c2;
        this.z = (byte) -1;
        this.A = -1;
        y0();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int K = eVar.K();
                    switch (K) {
                        case 0:
                            z = true;
                        case 8:
                            this.f20584k |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
                            this.y = eVar.s();
                        case 18:
                            if (!(z2 & true)) {
                                this.l = new ArrayList();
                                z2 |= true;
                            }
                            this.l.add(eVar.u(b.f20586h, fVar));
                        case 24:
                            this.f20584k |= 1;
                            this.m = eVar.k();
                        case 32:
                            this.f20584k |= 2;
                            this.n = eVar.s();
                        case 42:
                            c2 = (this.f20584k & 4) == 4 ? this.o.c() : null;
                            q qVar = (q) eVar.u(f20582i, fVar);
                            this.o = qVar;
                            if (c2 != null) {
                                c2.m(qVar);
                                this.o = c2.u();
                            }
                            this.f20584k |= 4;
                        case 48:
                            this.f20584k |= 16;
                            this.q = eVar.s();
                        case 56:
                            this.f20584k |= 32;
                            this.r = eVar.s();
                        case 64:
                            this.f20584k |= 8;
                            this.p = eVar.s();
                        case 72:
                            this.f20584k |= 64;
                            this.s = eVar.s();
                        case 82:
                            c2 = (this.f20584k & 256) == 256 ? this.u.c() : null;
                            q qVar2 = (q) eVar.u(f20582i, fVar);
                            this.u = qVar2;
                            if (c2 != null) {
                                c2.m(qVar2);
                                this.u = c2.u();
                            }
                            this.f20584k |= 256;
                        case 88:
                            this.f20584k |= AdRequest.MAX_CONTENT_URL_LENGTH;
                            this.v = eVar.s();
                        case 96:
                            this.f20584k |= 128;
                            this.t = eVar.s();
                        case 106:
                            c2 = (this.f20584k & 1024) == 1024 ? this.w.c() : null;
                            q qVar3 = (q) eVar.u(f20582i, fVar);
                            this.w = qVar3;
                            if (c2 != null) {
                                c2.m(qVar3);
                                this.w = c2.u();
                            }
                            this.f20584k |= 1024;
                        case 112:
                            this.f20584k |= RecyclerView.l.FLAG_MOVED;
                            this.x = eVar.s();
                        default:
                            if (!p(eVar, J, fVar, K)) {
                                z = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z2 & true) {
                    this.l = Collections.unmodifiableList(this.l);
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20583j = O.w();
                    throw th2;
                }
                this.f20583j = O.w();
                m();
                throw th;
            }
        }
        if (z2 & true) {
            this.l = Collections.unmodifiableList(this.l);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20583j = O.w();
            throw th3;
        }
        this.f20583j = O.w();
        m();
    }
}
