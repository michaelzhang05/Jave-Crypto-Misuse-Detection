package kotlin.reflect.x.internal.l0.e;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
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
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.t;
import kotlin.reflect.x.internal.l0.e.w;
import okhttp3.internal.http2.Http2;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class c extends h.d<c> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final c f20441h;

    /* renamed from: i, reason: collision with root package name */
    public static q<c> f20442i = new a();
    private List<r> A;
    private List<g> B;
    private List<Integer> C;
    private int D;
    private int E;
    private q F;
    private int G;
    private List<Integer> H;
    private int I;
    private List<q> J;
    private List<Integer> K;
    private int L;
    private t M;
    private List<Integer> N;
    private w O;
    private byte P;
    private int Q;

    /* renamed from: j, reason: collision with root package name */
    private final d f20443j;

    /* renamed from: k, reason: collision with root package name */
    private int f20444k;
    private int l;
    private int m;
    private int n;
    private List<s> o;
    private List<q> p;
    private List<Integer> q;
    private int r;
    private List<Integer> s;
    private int t;
    private List<q> u;
    private List<Integer> v;
    private int w;
    private List<d> x;
    private List<i> y;
    private List<n> z;

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
    public static final class b extends h.c<c, b> implements p {
        private int A;

        /* renamed from: i, reason: collision with root package name */
        private int f20445i;

        /* renamed from: k, reason: collision with root package name */
        private int f20447k;
        private int l;
        private int y;

        /* renamed from: j, reason: collision with root package name */
        private int f20446j = 6;
        private List<s> m = Collections.emptyList();
        private List<q> n = Collections.emptyList();
        private List<Integer> o = Collections.emptyList();
        private List<Integer> p = Collections.emptyList();
        private List<q> q = Collections.emptyList();
        private List<Integer> r = Collections.emptyList();
        private List<d> s = Collections.emptyList();
        private List<i> t = Collections.emptyList();
        private List<n> u = Collections.emptyList();
        private List<r> v = Collections.emptyList();
        private List<g> w = Collections.emptyList();
        private List<Integer> x = Collections.emptyList();
        private q z = q.Z();
        private List<Integer> B = Collections.emptyList();
        private List<q> C = Collections.emptyList();
        private List<Integer> D = Collections.emptyList();
        private t E = t.y();
        private List<Integer> F = Collections.emptyList();
        private w G = w.u();

        private b() {
            T();
        }

        private void A() {
            if ((this.f20445i & 256) != 256) {
                this.r = new ArrayList(this.r);
                this.f20445i |= 256;
            }
        }

        private void B() {
            if ((this.f20445i & 128) != 128) {
                this.q = new ArrayList(this.q);
                this.f20445i |= 128;
            }
        }

        private void C() {
            if ((this.f20445i & 8192) != 8192) {
                this.w = new ArrayList(this.w);
                this.f20445i |= 8192;
            }
        }

        private void E() {
            if ((this.f20445i & 1024) != 1024) {
                this.t = new ArrayList(this.t);
                this.f20445i |= 1024;
            }
        }

        private void F() {
            if ((this.f20445i & 262144) != 262144) {
                this.B = new ArrayList(this.B);
                this.f20445i |= 262144;
            }
        }

        private void G() {
            if ((this.f20445i & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576) {
                this.D = new ArrayList(this.D);
                this.f20445i |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
            }
        }

        private void H() {
            if ((this.f20445i & 524288) != 524288) {
                this.C = new ArrayList(this.C);
                this.f20445i |= 524288;
            }
        }

        private void I() {
            if ((this.f20445i & 64) != 64) {
                this.p = new ArrayList(this.p);
                this.f20445i |= 64;
            }
        }

        private void K() {
            if ((this.f20445i & RecyclerView.l.FLAG_MOVED) != 2048) {
                this.u = new ArrayList(this.u);
                this.f20445i |= RecyclerView.l.FLAG_MOVED;
            }
        }

        private void M() {
            if ((this.f20445i & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                this.x = new ArrayList(this.x);
                this.f20445i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }

        private void N() {
            if ((this.f20445i & 32) != 32) {
                this.o = new ArrayList(this.o);
                this.f20445i |= 32;
            }
        }

        private void O() {
            if ((this.f20445i & 16) != 16) {
                this.n = new ArrayList(this.n);
                this.f20445i |= 16;
            }
        }

        private void Q() {
            if ((this.f20445i & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.v = new ArrayList(this.v);
                this.f20445i |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        private void R() {
            if ((this.f20445i & 8) != 8) {
                this.m = new ArrayList(this.m);
                this.f20445i |= 8;
            }
        }

        private void S() {
            if ((this.f20445i & 4194304) != 4194304) {
                this.F = new ArrayList(this.F);
                this.f20445i |= 4194304;
            }
        }

        private void T() {
        }

        static /* synthetic */ b s() {
            return x();
        }

        private static b x() {
            return new b();
        }

        private void y() {
            if ((this.f20445i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.s = new ArrayList(this.s);
                this.f20445i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public b m(c cVar) {
            if (cVar == c.A0()) {
                return this;
            }
            if (cVar.n1()) {
                b0(cVar.F0());
            }
            if (cVar.o1()) {
                c0(cVar.G0());
            }
            if (cVar.m1()) {
                a0(cVar.s0());
            }
            if (!cVar.o.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = cVar.o;
                    this.f20445i &= -9;
                } else {
                    R();
                    this.m.addAll(cVar.o);
                }
            }
            if (!cVar.p.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = cVar.p;
                    this.f20445i &= -17;
                } else {
                    O();
                    this.n.addAll(cVar.p);
                }
            }
            if (!cVar.q.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = cVar.q;
                    this.f20445i &= -33;
                } else {
                    N();
                    this.o.addAll(cVar.q);
                }
            }
            if (!cVar.s.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = cVar.s;
                    this.f20445i &= -65;
                } else {
                    I();
                    this.p.addAll(cVar.s);
                }
            }
            if (!cVar.u.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = cVar.u;
                    this.f20445i &= -129;
                } else {
                    B();
                    this.q.addAll(cVar.u);
                }
            }
            if (!cVar.v.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = cVar.v;
                    this.f20445i &= -257;
                } else {
                    A();
                    this.r.addAll(cVar.v);
                }
            }
            if (!cVar.x.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = cVar.x;
                    this.f20445i &= -513;
                } else {
                    y();
                    this.s.addAll(cVar.x);
                }
            }
            if (!cVar.y.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = cVar.y;
                    this.f20445i &= -1025;
                } else {
                    E();
                    this.t.addAll(cVar.y);
                }
            }
            if (!cVar.z.isEmpty()) {
                if (this.u.isEmpty()) {
                    this.u = cVar.z;
                    this.f20445i &= -2049;
                } else {
                    K();
                    this.u.addAll(cVar.z);
                }
            }
            if (!cVar.A.isEmpty()) {
                if (this.v.isEmpty()) {
                    this.v = cVar.A;
                    this.f20445i &= -4097;
                } else {
                    Q();
                    this.v.addAll(cVar.A);
                }
            }
            if (!cVar.B.isEmpty()) {
                if (this.w.isEmpty()) {
                    this.w = cVar.B;
                    this.f20445i &= -8193;
                } else {
                    C();
                    this.w.addAll(cVar.B);
                }
            }
            if (!cVar.C.isEmpty()) {
                if (this.x.isEmpty()) {
                    this.x = cVar.C;
                    this.f20445i &= -16385;
                } else {
                    M();
                    this.x.addAll(cVar.C);
                }
            }
            if (cVar.p1()) {
                d0(cVar.K0());
            }
            if (cVar.q1()) {
                W(cVar.L0());
            }
            if (cVar.r1()) {
                e0(cVar.M0());
            }
            if (!cVar.H.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = cVar.H;
                    this.f20445i &= -262145;
                } else {
                    F();
                    this.B.addAll(cVar.H);
                }
            }
            if (!cVar.J.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = cVar.J;
                    this.f20445i &= -524289;
                } else {
                    H();
                    this.C.addAll(cVar.J);
                }
            }
            if (!cVar.K.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = cVar.K;
                    this.f20445i &= -1048577;
                } else {
                    G();
                    this.D.addAll(cVar.K);
                }
            }
            if (cVar.s1()) {
                X(cVar.j1());
            }
            if (!cVar.N.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = cVar.N;
                    this.f20445i &= -4194305;
                } else {
                    S();
                    this.F.addAll(cVar.N);
                }
            }
            if (cVar.t1()) {
                Z(cVar.l1());
            }
            r(cVar);
            n(l().b(cVar.f20443j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.c.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.c> r1 = kotlin.reflect.x.internal.l0.e.c.f20442i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.c r3 = (kotlin.reflect.x.internal.l0.e.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.c r4 = (kotlin.reflect.x.internal.l0.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.c.b.i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.c$b");
        }

        public b W(q qVar) {
            if ((this.f20445i & 65536) == 65536 && this.z != q.Z()) {
                this.z = q.A0(this.z).m(qVar).u();
            } else {
                this.z = qVar;
            }
            this.f20445i |= 65536;
            return this;
        }

        public b X(t tVar) {
            if ((this.f20445i & 2097152) == 2097152 && this.E != t.y()) {
                this.E = t.G(this.E).m(tVar).q();
            } else {
                this.E = tVar;
            }
            this.f20445i |= 2097152;
            return this;
        }

        public b Z(w wVar) {
            if ((this.f20445i & 8388608) == 8388608 && this.G != w.u()) {
                this.G = w.B(this.G).m(wVar).q();
            } else {
                this.G = wVar;
            }
            this.f20445i |= 8388608;
            return this;
        }

        public b a0(int i2) {
            this.f20445i |= 4;
            this.l = i2;
            return this;
        }

        public b b0(int i2) {
            this.f20445i |= 1;
            this.f20446j = i2;
            return this;
        }

        public b c0(int i2) {
            this.f20445i |= 2;
            this.f20447k = i2;
            return this;
        }

        public b d0(int i2) {
            this.f20445i |= 32768;
            this.y = i2;
            return this;
        }

        public b e0(int i2) {
            this.f20445i |= 131072;
            this.A = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public c a() {
            c u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public c u() {
            c cVar = new c(this);
            int i2 = this.f20445i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            cVar.l = this.f20446j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            cVar.m = this.f20447k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            cVar.n = this.l;
            if ((this.f20445i & 8) == 8) {
                this.m = Collections.unmodifiableList(this.m);
                this.f20445i &= -9;
            }
            cVar.o = this.m;
            if ((this.f20445i & 16) == 16) {
                this.n = Collections.unmodifiableList(this.n);
                this.f20445i &= -17;
            }
            cVar.p = this.n;
            if ((this.f20445i & 32) == 32) {
                this.o = Collections.unmodifiableList(this.o);
                this.f20445i &= -33;
            }
            cVar.q = this.o;
            if ((this.f20445i & 64) == 64) {
                this.p = Collections.unmodifiableList(this.p);
                this.f20445i &= -65;
            }
            cVar.s = this.p;
            if ((this.f20445i & 128) == 128) {
                this.q = Collections.unmodifiableList(this.q);
                this.f20445i &= -129;
            }
            cVar.u = this.q;
            if ((this.f20445i & 256) == 256) {
                this.r = Collections.unmodifiableList(this.r);
                this.f20445i &= -257;
            }
            cVar.v = this.r;
            if ((this.f20445i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.s = Collections.unmodifiableList(this.s);
                this.f20445i &= -513;
            }
            cVar.x = this.s;
            if ((this.f20445i & 1024) == 1024) {
                this.t = Collections.unmodifiableList(this.t);
                this.f20445i &= -1025;
            }
            cVar.y = this.t;
            if ((this.f20445i & RecyclerView.l.FLAG_MOVED) == 2048) {
                this.u = Collections.unmodifiableList(this.u);
                this.f20445i &= -2049;
            }
            cVar.z = this.u;
            if ((this.f20445i & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.v = Collections.unmodifiableList(this.v);
                this.f20445i &= -4097;
            }
            cVar.A = this.v;
            if ((this.f20445i & 8192) == 8192) {
                this.w = Collections.unmodifiableList(this.w);
                this.f20445i &= -8193;
            }
            cVar.B = this.w;
            if ((this.f20445i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.x = Collections.unmodifiableList(this.x);
                this.f20445i &= -16385;
            }
            cVar.C = this.x;
            if ((i2 & 32768) == 32768) {
                i3 |= 8;
            }
            cVar.E = this.y;
            if ((i2 & 65536) == 65536) {
                i3 |= 16;
            }
            cVar.F = this.z;
            if ((i2 & 131072) == 131072) {
                i3 |= 32;
            }
            cVar.G = this.A;
            if ((this.f20445i & 262144) == 262144) {
                this.B = Collections.unmodifiableList(this.B);
                this.f20445i &= -262145;
            }
            cVar.H = this.B;
            if ((this.f20445i & 524288) == 524288) {
                this.C = Collections.unmodifiableList(this.C);
                this.f20445i &= -524289;
            }
            cVar.J = this.C;
            if ((this.f20445i & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                this.D = Collections.unmodifiableList(this.D);
                this.f20445i &= -1048577;
            }
            cVar.K = this.D;
            if ((i2 & 2097152) == 2097152) {
                i3 |= 64;
            }
            cVar.M = this.E;
            if ((this.f20445i & 4194304) == 4194304) {
                this.F = Collections.unmodifiableList(this.F);
                this.f20445i &= -4194305;
            }
            cVar.N = this.F;
            if ((i2 & 8388608) == 8388608) {
                i3 |= 128;
            }
            cVar.O = this.G;
            cVar.f20444k = i3;
            return cVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.x.e.l0.e.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0324c implements i.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);

        private static i.b<EnumC0324c> m = new a();
        private final int o;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.c$c$a */
        /* loaded from: classes2.dex */
        static class a implements i.b<EnumC0324c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public EnumC0324c a(int i2) {
                return EnumC0324c.d(i2);
            }
        }

        EnumC0324c(int i2, int i3) {
            this.o = i3;
        }

        public static EnumC0324c d(int i2) {
            switch (i2) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int a() {
            return this.o;
        }
    }

    static {
        c cVar = new c(true);
        f20441h = cVar;
        cVar.u1();
    }

    public static c A0() {
        return f20441h;
    }

    private void u1() {
        this.l = 6;
        this.m = 0;
        this.n = 0;
        this.o = Collections.emptyList();
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
        this.s = Collections.emptyList();
        this.u = Collections.emptyList();
        this.v = Collections.emptyList();
        this.x = Collections.emptyList();
        this.y = Collections.emptyList();
        this.z = Collections.emptyList();
        this.A = Collections.emptyList();
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        this.E = 0;
        this.F = q.Z();
        this.G = 0;
        this.H = Collections.emptyList();
        this.J = Collections.emptyList();
        this.K = Collections.emptyList();
        this.M = t.y();
        this.N = Collections.emptyList();
        this.O = w.u();
    }

    public static b v1() {
        return b.s();
    }

    public static b w1(c cVar) {
        return v1().m(cVar);
    }

    public static c y1(InputStream inputStream, f fVar) throws IOException {
        return f20442i.a(inputStream, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public c b() {
        return f20441h;
    }

    public g C0(int i2) {
        return this.B.get(i2);
    }

    public int D0() {
        return this.B.size();
    }

    public List<g> E0() {
        return this.B;
    }

    public int F0() {
        return this.l;
    }

    public int G0() {
        return this.m;
    }

    public i H0(int i2) {
        return this.y.get(i2);
    }

    public int I0() {
        return this.y.size();
    }

    public List<i> J0() {
        return this.y;
    }

    public int K0() {
        return this.E;
    }

    public q L0() {
        return this.F;
    }

    public int M0() {
        return this.G;
    }

    public int N0() {
        return this.H.size();
    }

    public List<Integer> O0() {
        return this.H;
    }

    public q P0(int i2) {
        return this.J.get(i2);
    }

    public int Q0() {
        return this.J.size();
    }

    public int R0() {
        return this.K.size();
    }

    public List<Integer> S0() {
        return this.K;
    }

    public List<q> T0() {
        return this.J;
    }

    public List<Integer> U0() {
        return this.s;
    }

    public n V0(int i2) {
        return this.z.get(i2);
    }

    public int W0() {
        return this.z.size();
    }

    public List<n> X0() {
        return this.z;
    }

    public List<Integer> Y0() {
        return this.C;
    }

    public q Z0(int i2) {
        return this.p.get(i2);
    }

    public int a1() {
        return this.p.size();
    }

    public List<Integer> b1() {
        return this.q;
    }

    public List<q> c1() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        if ((this.f20444k & 1) == 1) {
            codedOutputStream.a0(1, this.l);
        }
        if (b1().size() > 0) {
            codedOutputStream.o0(18);
            codedOutputStream.o0(this.r);
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            codedOutputStream.b0(this.q.get(i2).intValue());
        }
        if ((this.f20444k & 2) == 2) {
            codedOutputStream.a0(3, this.m);
        }
        if ((this.f20444k & 4) == 4) {
            codedOutputStream.a0(4, this.n);
        }
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            codedOutputStream.d0(5, this.o.get(i3));
        }
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            codedOutputStream.d0(6, this.p.get(i4));
        }
        if (U0().size() > 0) {
            codedOutputStream.o0(58);
            codedOutputStream.o0(this.t);
        }
        for (int i5 = 0; i5 < this.s.size(); i5++) {
            codedOutputStream.b0(this.s.get(i5).intValue());
        }
        for (int i6 = 0; i6 < this.x.size(); i6++) {
            codedOutputStream.d0(8, this.x.get(i6));
        }
        for (int i7 = 0; i7 < this.y.size(); i7++) {
            codedOutputStream.d0(9, this.y.get(i7));
        }
        for (int i8 = 0; i8 < this.z.size(); i8++) {
            codedOutputStream.d0(10, this.z.get(i8));
        }
        for (int i9 = 0; i9 < this.A.size(); i9++) {
            codedOutputStream.d0(11, this.A.get(i9));
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            codedOutputStream.d0(13, this.B.get(i10));
        }
        if (Y0().size() > 0) {
            codedOutputStream.o0(130);
            codedOutputStream.o0(this.D);
        }
        for (int i11 = 0; i11 < this.C.size(); i11++) {
            codedOutputStream.b0(this.C.get(i11).intValue());
        }
        if ((this.f20444k & 8) == 8) {
            codedOutputStream.a0(17, this.E);
        }
        if ((this.f20444k & 16) == 16) {
            codedOutputStream.d0(18, this.F);
        }
        if ((this.f20444k & 32) == 32) {
            codedOutputStream.a0(19, this.G);
        }
        for (int i12 = 0; i12 < this.u.size(); i12++) {
            codedOutputStream.d0(20, this.u.get(i12));
        }
        if (y0().size() > 0) {
            codedOutputStream.o0(170);
            codedOutputStream.o0(this.w);
        }
        for (int i13 = 0; i13 < this.v.size(); i13++) {
            codedOutputStream.b0(this.v.get(i13).intValue());
        }
        if (O0().size() > 0) {
            codedOutputStream.o0(178);
            codedOutputStream.o0(this.I);
        }
        for (int i14 = 0; i14 < this.H.size(); i14++) {
            codedOutputStream.b0(this.H.get(i14).intValue());
        }
        for (int i15 = 0; i15 < this.J.size(); i15++) {
            codedOutputStream.d0(23, this.J.get(i15));
        }
        if (S0().size() > 0) {
            codedOutputStream.o0(194);
            codedOutputStream.o0(this.L);
        }
        for (int i16 = 0; i16 < this.K.size(); i16++) {
            codedOutputStream.b0(this.K.get(i16).intValue());
        }
        if ((this.f20444k & 64) == 64) {
            codedOutputStream.d0(30, this.M);
        }
        for (int i17 = 0; i17 < this.N.size(); i17++) {
            codedOutputStream.a0(31, this.N.get(i17).intValue());
        }
        if ((this.f20444k & 128) == 128) {
            codedOutputStream.d0(32, this.O);
        }
        A.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f20443j);
    }

    public r d1(int i2) {
        return this.A.get(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.Q;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20444k & 1) == 1 ? CodedOutputStream.o(1, this.l) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.q.size(); i4++) {
            i3 += CodedOutputStream.p(this.q.get(i4).intValue());
        }
        int i5 = o + i3;
        if (!b1().isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.p(i3);
        }
        this.r = i3;
        if ((this.f20444k & 2) == 2) {
            i5 += CodedOutputStream.o(3, this.m);
        }
        if ((this.f20444k & 4) == 4) {
            i5 += CodedOutputStream.o(4, this.n);
        }
        for (int i6 = 0; i6 < this.o.size(); i6++) {
            i5 += CodedOutputStream.s(5, this.o.get(i6));
        }
        for (int i7 = 0; i7 < this.p.size(); i7++) {
            i5 += CodedOutputStream.s(6, this.p.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.s.size(); i9++) {
            i8 += CodedOutputStream.p(this.s.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!U0().isEmpty()) {
            i10 = i10 + 1 + CodedOutputStream.p(i8);
        }
        this.t = i8;
        for (int i11 = 0; i11 < this.x.size(); i11++) {
            i10 += CodedOutputStream.s(8, this.x.get(i11));
        }
        for (int i12 = 0; i12 < this.y.size(); i12++) {
            i10 += CodedOutputStream.s(9, this.y.get(i12));
        }
        for (int i13 = 0; i13 < this.z.size(); i13++) {
            i10 += CodedOutputStream.s(10, this.z.get(i13));
        }
        for (int i14 = 0; i14 < this.A.size(); i14++) {
            i10 += CodedOutputStream.s(11, this.A.get(i14));
        }
        for (int i15 = 0; i15 < this.B.size(); i15++) {
            i10 += CodedOutputStream.s(13, this.B.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.C.size(); i17++) {
            i16 += CodedOutputStream.p(this.C.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!Y0().isEmpty()) {
            i18 = i18 + 2 + CodedOutputStream.p(i16);
        }
        this.D = i16;
        if ((this.f20444k & 8) == 8) {
            i18 += CodedOutputStream.o(17, this.E);
        }
        if ((this.f20444k & 16) == 16) {
            i18 += CodedOutputStream.s(18, this.F);
        }
        if ((this.f20444k & 32) == 32) {
            i18 += CodedOutputStream.o(19, this.G);
        }
        for (int i19 = 0; i19 < this.u.size(); i19++) {
            i18 += CodedOutputStream.s(20, this.u.get(i19));
        }
        int i20 = 0;
        for (int i21 = 0; i21 < this.v.size(); i21++) {
            i20 += CodedOutputStream.p(this.v.get(i21).intValue());
        }
        int i22 = i18 + i20;
        if (!y0().isEmpty()) {
            i22 = i22 + 2 + CodedOutputStream.p(i20);
        }
        this.w = i20;
        int i23 = 0;
        for (int i24 = 0; i24 < this.H.size(); i24++) {
            i23 += CodedOutputStream.p(this.H.get(i24).intValue());
        }
        int i25 = i22 + i23;
        if (!O0().isEmpty()) {
            i25 = i25 + 2 + CodedOutputStream.p(i23);
        }
        this.I = i23;
        for (int i26 = 0; i26 < this.J.size(); i26++) {
            i25 += CodedOutputStream.s(23, this.J.get(i26));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.K.size(); i28++) {
            i27 += CodedOutputStream.p(this.K.get(i28).intValue());
        }
        int i29 = i25 + i27;
        if (!S0().isEmpty()) {
            i29 = i29 + 2 + CodedOutputStream.p(i27);
        }
        this.L = i27;
        if ((this.f20444k & 64) == 64) {
            i29 += CodedOutputStream.s(30, this.M);
        }
        int i30 = 0;
        for (int i31 = 0; i31 < this.N.size(); i31++) {
            i30 += CodedOutputStream.p(this.N.get(i31).intValue());
        }
        int size = i29 + i30 + (k1().size() * 2);
        if ((this.f20444k & 128) == 128) {
            size += CodedOutputStream.s(32, this.O);
        }
        int t = size + t() + this.f20443j.size();
        this.Q = t;
        return t;
    }

    public int e1() {
        return this.A.size();
    }

    public List<r> f1() {
        return this.A;
    }

    public s g1(int i2) {
        return this.o.get(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<c> h() {
        return f20442i;
    }

    public int h1() {
        return this.o.size();
    }

    public List<s> i1() {
        return this.o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.P;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!o1()) {
            this.P = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < h1(); i2++) {
            if (!g1(i2).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < a1(); i3++) {
            if (!Z0(i3).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < x0(); i4++) {
            if (!w0(i4).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < u0(); i5++) {
            if (!t0(i5).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < I0(); i6++) {
            if (!H0(i6).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < W0(); i7++) {
            if (!V0(i7).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < e1(); i8++) {
            if (!d1(i8).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < D0(); i9++) {
            if (!C0(i9).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        if (q1() && !L0().isInitialized()) {
            this.P = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < Q0(); i10++) {
            if (!P0(i10).isInitialized()) {
                this.P = (byte) 0;
                return false;
            }
        }
        if (s1() && !j1().isInitialized()) {
            this.P = (byte) 0;
            return false;
        }
        if (!s()) {
            this.P = (byte) 0;
            return false;
        }
        this.P = (byte) 1;
        return true;
    }

    public t j1() {
        return this.M;
    }

    public List<Integer> k1() {
        return this.N;
    }

    public w l1() {
        return this.O;
    }

    public boolean m1() {
        return (this.f20444k & 4) == 4;
    }

    public boolean n1() {
        return (this.f20444k & 1) == 1;
    }

    public boolean o1() {
        return (this.f20444k & 2) == 2;
    }

    public boolean p1() {
        return (this.f20444k & 8) == 8;
    }

    public boolean q1() {
        return (this.f20444k & 16) == 16;
    }

    public boolean r1() {
        return (this.f20444k & 32) == 32;
    }

    public int s0() {
        return this.n;
    }

    public boolean s1() {
        return (this.f20444k & 64) == 64;
    }

    public d t0(int i2) {
        return this.x.get(i2);
    }

    public boolean t1() {
        return (this.f20444k & 128) == 128;
    }

    public int u0() {
        return this.x.size();
    }

    public List<d> v0() {
        return this.x;
    }

    public q w0(int i2) {
        return this.u.get(i2);
    }

    public int x0() {
        return this.u.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public b g() {
        return v1();
    }

    public List<Integer> y0() {
        return this.v;
    }

    public List<q> z0() {
        return this.u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public b c() {
        return w1(this);
    }

    private c(h.c<c, ?> cVar) {
        super(cVar);
        this.r = -1;
        this.t = -1;
        this.w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = (byte) -1;
        this.Q = -1;
        this.f20443j = cVar.l();
    }

    private c(boolean z) {
        this.r = -1;
        this.t = -1;
        this.w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = (byte) -1;
        this.Q = -1;
        this.f20443j = d.f21894f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    private c(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.r = -1;
        this.t = -1;
        this.w = -1;
        this.D = -1;
        this.I = -1;
        this.L = -1;
        this.P = (byte) -1;
        this.Q = -1;
        u1();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ?? r5 = 4194304;
            if (!z) {
                try {
                    try {
                        int K = eVar.K();
                        switch (K) {
                            case 0:
                                z = true;
                            case 8:
                                this.f20444k |= 1;
                                this.l = eVar.s();
                            case 16:
                                if ((i2 & 32) != 32) {
                                    this.q = new ArrayList();
                                    i2 |= 32;
                                }
                                this.q.add(Integer.valueOf(eVar.s()));
                            case 18:
                                int j2 = eVar.j(eVar.A());
                                if ((i2 & 32) != 32 && eVar.e() > 0) {
                                    this.q = new ArrayList();
                                    i2 |= 32;
                                }
                                while (eVar.e() > 0) {
                                    this.q.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j2);
                                break;
                            case 24:
                                this.f20444k |= 2;
                                this.m = eVar.s();
                            case 32:
                                this.f20444k |= 4;
                                this.n = eVar.s();
                            case 42:
                                if ((i2 & 8) != 8) {
                                    this.o = new ArrayList();
                                    i2 |= 8;
                                }
                                this.o.add(eVar.u(s.f20611i, fVar));
                            case 50:
                                if ((i2 & 16) != 16) {
                                    this.p = new ArrayList();
                                    i2 |= 16;
                                }
                                this.p.add(eVar.u(q.f20582i, fVar));
                            case 56:
                                if ((i2 & 64) != 64) {
                                    this.s = new ArrayList();
                                    i2 |= 64;
                                }
                                this.s.add(Integer.valueOf(eVar.s()));
                            case 58:
                                int j3 = eVar.j(eVar.A());
                                if ((i2 & 64) != 64 && eVar.e() > 0) {
                                    this.s = new ArrayList();
                                    i2 |= 64;
                                }
                                while (eVar.e() > 0) {
                                    this.s.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j3);
                                break;
                            case 66:
                                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                                    this.x = new ArrayList();
                                    i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                }
                                this.x.add(eVar.u(d.f20455i, fVar));
                            case 74:
                                if ((i2 & 1024) != 1024) {
                                    this.y = new ArrayList();
                                    i2 |= 1024;
                                }
                                this.y.add(eVar.u(i.f20513i, fVar));
                            case 82:
                                if ((i2 & RecyclerView.l.FLAG_MOVED) != 2048) {
                                    this.z = new ArrayList();
                                    i2 |= RecyclerView.l.FLAG_MOVED;
                                }
                                this.z.add(eVar.u(n.f20546i, fVar));
                            case 90:
                                if ((i2 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                                    this.A = new ArrayList();
                                    i2 |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
                                }
                                this.A.add(eVar.u(r.f20604i, fVar));
                            case 106:
                                if ((i2 & 8192) != 8192) {
                                    this.B = new ArrayList();
                                    i2 |= 8192;
                                }
                                this.B.add(eVar.u(g.f20491i, fVar));
                            case 128:
                                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                                    this.C = new ArrayList();
                                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                                }
                                this.C.add(Integer.valueOf(eVar.s()));
                            case 130:
                                int j4 = eVar.j(eVar.A());
                                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 16384 && eVar.e() > 0) {
                                    this.C = new ArrayList();
                                    i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                                }
                                while (eVar.e() > 0) {
                                    this.C.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j4);
                                break;
                            case 136:
                                this.f20444k |= 8;
                                this.E = eVar.s();
                            case 146:
                                q.c c2 = (this.f20444k & 16) == 16 ? this.F.c() : null;
                                q qVar = (q) eVar.u(q.f20582i, fVar);
                                this.F = qVar;
                                if (c2 != null) {
                                    c2.m(qVar);
                                    this.F = c2.u();
                                }
                                this.f20444k |= 16;
                            case 152:
                                this.f20444k |= 32;
                                this.G = eVar.s();
                            case 162:
                                if ((i2 & 128) != 128) {
                                    this.u = new ArrayList();
                                    i2 |= 128;
                                }
                                this.u.add(eVar.u(q.f20582i, fVar));
                            case 168:
                                if ((i2 & 256) != 256) {
                                    this.v = new ArrayList();
                                    i2 |= 256;
                                }
                                this.v.add(Integer.valueOf(eVar.s()));
                            case 170:
                                int j5 = eVar.j(eVar.A());
                                if ((i2 & 256) != 256 && eVar.e() > 0) {
                                    this.v = new ArrayList();
                                    i2 |= 256;
                                }
                                while (eVar.e() > 0) {
                                    this.v.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j5);
                                break;
                            case 176:
                                if ((i2 & 262144) != 262144) {
                                    this.H = new ArrayList();
                                    i2 |= 262144;
                                }
                                this.H.add(Integer.valueOf(eVar.s()));
                            case 178:
                                int j6 = eVar.j(eVar.A());
                                if ((i2 & 262144) != 262144 && eVar.e() > 0) {
                                    this.H = new ArrayList();
                                    i2 |= 262144;
                                }
                                while (eVar.e() > 0) {
                                    this.H.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j6);
                                break;
                            case 186:
                                if ((i2 & 524288) != 524288) {
                                    this.J = new ArrayList();
                                    i2 |= 524288;
                                }
                                this.J.add(eVar.u(q.f20582i, fVar));
                            case 192:
                                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576) {
                                    this.K = new ArrayList();
                                    i2 |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
                                }
                                this.K.add(Integer.valueOf(eVar.s()));
                            case 194:
                                int j7 = eVar.j(eVar.A());
                                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 1048576 && eVar.e() > 0) {
                                    this.K = new ArrayList();
                                    i2 |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
                                }
                                while (eVar.e() > 0) {
                                    this.K.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j7);
                                break;
                            case 242:
                                t.b c3 = (this.f20444k & 64) == 64 ? this.M.c() : null;
                                t tVar = (t) eVar.u(t.f20624h, fVar);
                                this.M = tVar;
                                if (c3 != null) {
                                    c3.m(tVar);
                                    this.M = c3.q();
                                }
                                this.f20444k |= 64;
                            case 248:
                                if ((i2 & 4194304) != 4194304) {
                                    this.N = new ArrayList();
                                    i2 |= 4194304;
                                }
                                this.N.add(Integer.valueOf(eVar.s()));
                            case 250:
                                int j8 = eVar.j(eVar.A());
                                if ((i2 & 4194304) != 4194304 && eVar.e() > 0) {
                                    this.N = new ArrayList();
                                    i2 |= 4194304;
                                }
                                while (eVar.e() > 0) {
                                    this.N.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j8);
                                break;
                            case 258:
                                w.b c4 = (this.f20444k & 128) == 128 ? this.O.c() : null;
                                w wVar = (w) eVar.u(w.f20661h, fVar);
                                this.O = wVar;
                                if (c4 != null) {
                                    c4.m(wVar);
                                    this.O = c4.q();
                                }
                                this.f20444k |= 128;
                            default:
                                r5 = p(eVar, J, fVar, K);
                                if (r5 != 0) {
                                }
                                z = true;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.i(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 32) == 32) {
                        this.q = Collections.unmodifiableList(this.q);
                    }
                    if ((i2 & 8) == 8) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    if ((i2 & 16) == 16) {
                        this.p = Collections.unmodifiableList(this.p);
                    }
                    if ((i2 & 64) == 64) {
                        this.s = Collections.unmodifiableList(this.s);
                    }
                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        this.x = Collections.unmodifiableList(this.x);
                    }
                    if ((i2 & 1024) == 1024) {
                        this.y = Collections.unmodifiableList(this.y);
                    }
                    if ((i2 & RecyclerView.l.FLAG_MOVED) == 2048) {
                        this.z = Collections.unmodifiableList(this.z);
                    }
                    if ((i2 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                        this.A = Collections.unmodifiableList(this.A);
                    }
                    if ((i2 & 8192) == 8192) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                        this.C = Collections.unmodifiableList(this.C);
                    }
                    if ((i2 & 128) == 128) {
                        this.u = Collections.unmodifiableList(this.u);
                    }
                    if ((i2 & 256) == 256) {
                        this.v = Collections.unmodifiableList(this.v);
                    }
                    if ((i2 & 262144) == 262144) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    if ((i2 & 524288) == 524288) {
                        this.J = Collections.unmodifiableList(this.J);
                    }
                    if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                        this.K = Collections.unmodifiableList(this.K);
                    }
                    if ((i2 & r5) == r5) {
                        this.N = Collections.unmodifiableList(this.N);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f20443j = O.w();
                        throw th2;
                    }
                    this.f20443j = O.w();
                    m();
                    throw th;
                }
            } else {
                if ((i2 & 32) == 32) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if ((i2 & 8) == 8) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                if ((i2 & 16) == 16) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if ((i2 & 64) == 64) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    this.x = Collections.unmodifiableList(this.x);
                }
                if ((i2 & 1024) == 1024) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                if ((i2 & RecyclerView.l.FLAG_MOVED) == 2048) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                if ((i2 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.A = Collections.unmodifiableList(this.A);
                }
                if ((i2 & 8192) == 8192) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if ((i2 & 128) == 128) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if ((i2 & 256) == 256) {
                    this.v = Collections.unmodifiableList(this.v);
                }
                if ((i2 & 262144) == 262144) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                if ((i2 & 524288) == 524288) {
                    this.J = Collections.unmodifiableList(this.J);
                }
                if ((i2 & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) == 1048576) {
                    this.K = Collections.unmodifiableList(this.K);
                }
                if ((i2 & 4194304) == 4194304) {
                    this.N = Collections.unmodifiableList(this.N);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f20443j = O.w();
                    throw th3;
                }
                this.f20443j = O.w();
                m();
                return;
            }
        }
    }
}
