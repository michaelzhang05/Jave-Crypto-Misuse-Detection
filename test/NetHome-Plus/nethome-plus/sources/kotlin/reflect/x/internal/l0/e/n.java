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
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.u;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class n extends h.d<n> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final n f20545h;

    /* renamed from: i, reason: collision with root package name */
    public static q<n> f20546i = new a();
    private byte A;
    private int B;

    /* renamed from: j, reason: collision with root package name */
    private final d f20547j;

    /* renamed from: k, reason: collision with root package name */
    private int f20548k;
    private int l;
    private int m;
    private int n;
    private q o;
    private int p;
    private List<s> q;
    private q r;
    private int s;
    private List<q> t;
    private List<Integer> u;
    private int v;
    private u w;
    private int x;
    private int y;
    private List<Integer> z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<n> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public n b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new n(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.c<n, b> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20549i;
        private int l;
        private int n;
        private int q;
        private int u;
        private int v;

        /* renamed from: j, reason: collision with root package name */
        private int f20550j = 518;

        /* renamed from: k, reason: collision with root package name */
        private int f20551k = 2054;
        private q m = q.Z();
        private List<s> o = Collections.emptyList();
        private q p = q.Z();
        private List<q> r = Collections.emptyList();
        private List<Integer> s = Collections.emptyList();
        private u t = u.K();
        private List<Integer> w = Collections.emptyList();

        private b() {
            E();
        }

        private void A() {
            if ((this.f20549i & 256) != 256) {
                this.r = new ArrayList(this.r);
                this.f20549i |= 256;
            }
        }

        private void B() {
            if ((this.f20549i & 32) != 32) {
                this.o = new ArrayList(this.o);
                this.f20549i |= 32;
            }
        }

        private void C() {
            if ((this.f20549i & 8192) != 8192) {
                this.w = new ArrayList(this.w);
                this.f20549i |= 8192;
            }
        }

        private void E() {
        }

        static /* synthetic */ b s() {
            return x();
        }

        private static b x() {
            return new b();
        }

        private void y() {
            if ((this.f20549i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.s = new ArrayList(this.s);
                this.f20549i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b m(n nVar) {
            if (nVar == n.a0()) {
                return this;
            }
            if (nVar.q0()) {
                M(nVar.c0());
            }
            if (nVar.t0()) {
                Q(nVar.f0());
            }
            if (nVar.s0()) {
                O(nVar.e0());
            }
            if (nVar.w0()) {
                I(nVar.i0());
            }
            if (nVar.x0()) {
                S(nVar.j0());
            }
            if (!nVar.q.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = nVar.q;
                    this.f20549i &= -33;
                } else {
                    B();
                    this.o.addAll(nVar.q);
                }
            }
            if (nVar.u0()) {
                H(nVar.g0());
            }
            if (nVar.v0()) {
                R(nVar.h0());
            }
            if (!nVar.t.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = nVar.t;
                    this.f20549i &= -257;
                } else {
                    A();
                    this.r.addAll(nVar.t);
                }
            }
            if (!nVar.u.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = nVar.u;
                    this.f20549i &= -513;
                } else {
                    y();
                    this.s.addAll(nVar.u);
                }
            }
            if (nVar.z0()) {
                K(nVar.l0());
            }
            if (nVar.r0()) {
                N(nVar.d0());
            }
            if (nVar.y0()) {
                T(nVar.k0());
            }
            if (!nVar.z.isEmpty()) {
                if (this.w.isEmpty()) {
                    this.w = nVar.z;
                    this.f20549i &= -8193;
                } else {
                    C();
                    this.w.addAll(nVar.z);
                }
            }
            r(nVar);
            n(l().b(nVar.f20547j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.n.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.n> r1 = kotlin.reflect.x.internal.l0.e.n.f20546i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.n r3 = (kotlin.reflect.x.internal.l0.e.n) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.n r4 = (kotlin.reflect.x.internal.l0.e.n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.n.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.n$b");
        }

        public b H(q qVar) {
            if ((this.f20549i & 64) == 64 && this.p != q.Z()) {
                this.p = q.A0(this.p).m(qVar).u();
            } else {
                this.p = qVar;
            }
            this.f20549i |= 64;
            return this;
        }

        public b I(q qVar) {
            if ((this.f20549i & 8) == 8 && this.m != q.Z()) {
                this.m = q.A0(this.m).m(qVar).u();
            } else {
                this.m = qVar;
            }
            this.f20549i |= 8;
            return this;
        }

        public b K(u uVar) {
            if ((this.f20549i & 1024) == 1024 && this.t != u.K()) {
                this.t = u.a0(this.t).m(uVar).u();
            } else {
                this.t = uVar;
            }
            this.f20549i |= 1024;
            return this;
        }

        public b M(int i2) {
            this.f20549i |= 1;
            this.f20550j = i2;
            return this;
        }

        public b N(int i2) {
            this.f20549i |= RecyclerView.l.FLAG_MOVED;
            this.u = i2;
            return this;
        }

        public b O(int i2) {
            this.f20549i |= 4;
            this.l = i2;
            return this;
        }

        public b Q(int i2) {
            this.f20549i |= 2;
            this.f20551k = i2;
            return this;
        }

        public b R(int i2) {
            this.f20549i |= 128;
            this.q = i2;
            return this;
        }

        public b S(int i2) {
            this.f20549i |= 16;
            this.n = i2;
            return this;
        }

        public b T(int i2) {
            this.f20549i |= RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.v = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public n a() {
            n u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public n u() {
            n nVar = new n(this);
            int i2 = this.f20549i;
            int i3 = (i2 & 1) != 1 ? 0 : 1;
            nVar.l = this.f20550j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            nVar.m = this.f20551k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            nVar.n = this.l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            nVar.o = this.m;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            nVar.p = this.n;
            if ((this.f20549i & 32) == 32) {
                this.o = Collections.unmodifiableList(this.o);
                this.f20549i &= -33;
            }
            nVar.q = this.o;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            nVar.r = this.p;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            nVar.s = this.q;
            if ((this.f20549i & 256) == 256) {
                this.r = Collections.unmodifiableList(this.r);
                this.f20549i &= -257;
            }
            nVar.t = this.r;
            if ((this.f20549i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.s = Collections.unmodifiableList(this.s);
                this.f20549i &= -513;
            }
            nVar.u = this.s;
            if ((i2 & 1024) == 1024) {
                i3 |= 128;
            }
            nVar.w = this.t;
            if ((i2 & RecyclerView.l.FLAG_MOVED) == 2048) {
                i3 |= 256;
            }
            nVar.x = this.u;
            if ((i2 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i3 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            nVar.y = this.v;
            if ((this.f20549i & 8192) == 8192) {
                this.w = Collections.unmodifiableList(this.w);
                this.f20549i &= -8193;
            }
            nVar.z = this.w;
            nVar.f20548k = i3;
            return nVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    static {
        n nVar = new n(true);
        f20545h = nVar;
        nVar.A0();
    }

    private void A0() {
        this.l = 518;
        this.m = 2054;
        this.n = 0;
        this.o = q.Z();
        this.p = 0;
        this.q = Collections.emptyList();
        this.r = q.Z();
        this.s = 0;
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
        this.w = u.K();
        this.x = 0;
        this.y = 0;
        this.z = Collections.emptyList();
    }

    public static b B0() {
        return b.s();
    }

    public static b C0(n nVar) {
        return B0().m(nVar);
    }

    public static n a0() {
        return f20545h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return B0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return C0(this);
    }

    public q W(int i2) {
        return this.t.get(i2);
    }

    public int X() {
        return this.t.size();
    }

    public List<Integer> Y() {
        return this.u;
    }

    public List<q> Z() {
        return this.t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public n b() {
        return f20545h;
    }

    public int c0() {
        return this.l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        h.d<MessageType>.a A = A();
        if ((this.f20548k & 2) == 2) {
            codedOutputStream.a0(1, this.m);
        }
        if ((this.f20548k & 4) == 4) {
            codedOutputStream.a0(2, this.n);
        }
        if ((this.f20548k & 8) == 8) {
            codedOutputStream.d0(3, this.o);
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            codedOutputStream.d0(4, this.q.get(i2));
        }
        if ((this.f20548k & 32) == 32) {
            codedOutputStream.d0(5, this.r);
        }
        if ((this.f20548k & 128) == 128) {
            codedOutputStream.d0(6, this.w);
        }
        if ((this.f20548k & 256) == 256) {
            codedOutputStream.a0(7, this.x);
        }
        if ((this.f20548k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            codedOutputStream.a0(8, this.y);
        }
        if ((this.f20548k & 16) == 16) {
            codedOutputStream.a0(9, this.p);
        }
        if ((this.f20548k & 64) == 64) {
            codedOutputStream.a0(10, this.s);
        }
        if ((this.f20548k & 1) == 1) {
            codedOutputStream.a0(11, this.l);
        }
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            codedOutputStream.d0(12, this.t.get(i3));
        }
        if (Y().size() > 0) {
            codedOutputStream.o0(106);
            codedOutputStream.o0(this.v);
        }
        for (int i4 = 0; i4 < this.u.size(); i4++) {
            codedOutputStream.b0(this.u.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.z.size(); i5++) {
            codedOutputStream.a0(31, this.z.get(i5).intValue());
        }
        A.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f20547j);
    }

    public int d0() {
        return this.x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.B;
        if (i2 != -1) {
            return i2;
        }
        int o = (this.f20548k & 2) == 2 ? CodedOutputStream.o(1, this.m) + 0 : 0;
        if ((this.f20548k & 4) == 4) {
            o += CodedOutputStream.o(2, this.n);
        }
        if ((this.f20548k & 8) == 8) {
            o += CodedOutputStream.s(3, this.o);
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            o += CodedOutputStream.s(4, this.q.get(i3));
        }
        if ((this.f20548k & 32) == 32) {
            o += CodedOutputStream.s(5, this.r);
        }
        if ((this.f20548k & 128) == 128) {
            o += CodedOutputStream.s(6, this.w);
        }
        if ((this.f20548k & 256) == 256) {
            o += CodedOutputStream.o(7, this.x);
        }
        if ((this.f20548k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            o += CodedOutputStream.o(8, this.y);
        }
        if ((this.f20548k & 16) == 16) {
            o += CodedOutputStream.o(9, this.p);
        }
        if ((this.f20548k & 64) == 64) {
            o += CodedOutputStream.o(10, this.s);
        }
        if ((this.f20548k & 1) == 1) {
            o += CodedOutputStream.o(11, this.l);
        }
        for (int i4 = 0; i4 < this.t.size(); i4++) {
            o += CodedOutputStream.s(12, this.t.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.u.size(); i6++) {
            i5 += CodedOutputStream.p(this.u.get(i6).intValue());
        }
        int i7 = o + i5;
        if (!Y().isEmpty()) {
            i7 = i7 + 1 + CodedOutputStream.p(i5);
        }
        this.v = i5;
        int i8 = 0;
        for (int i9 = 0; i9 < this.z.size(); i9++) {
            i8 += CodedOutputStream.p(this.z.get(i9).intValue());
        }
        int size = i7 + i8 + (p0().size() * 2) + t() + this.f20547j.size();
        this.B = size;
        return size;
    }

    public int e0() {
        return this.n;
    }

    public int f0() {
        return this.m;
    }

    public q g0() {
        return this.r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<n> h() {
        return f20546i;
    }

    public int h0() {
        return this.s;
    }

    public q i0() {
        return this.o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.A;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!s0()) {
            this.A = (byte) 0;
            return false;
        }
        if (w0() && !i0().isInitialized()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < n0(); i2++) {
            if (!m0(i2).isInitialized()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if (u0() && !g0().isInitialized()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < X(); i3++) {
            if (!W(i3).isInitialized()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if (z0() && !l0().isInitialized()) {
            this.A = (byte) 0;
            return false;
        }
        if (!s()) {
            this.A = (byte) 0;
            return false;
        }
        this.A = (byte) 1;
        return true;
    }

    public int j0() {
        return this.p;
    }

    public int k0() {
        return this.y;
    }

    public u l0() {
        return this.w;
    }

    public s m0(int i2) {
        return this.q.get(i2);
    }

    public int n0() {
        return this.q.size();
    }

    public List<s> o0() {
        return this.q;
    }

    public List<Integer> p0() {
        return this.z;
    }

    public boolean q0() {
        return (this.f20548k & 1) == 1;
    }

    public boolean r0() {
        return (this.f20548k & 256) == 256;
    }

    public boolean s0() {
        return (this.f20548k & 4) == 4;
    }

    public boolean t0() {
        return (this.f20548k & 2) == 2;
    }

    public boolean u0() {
        return (this.f20548k & 32) == 32;
    }

    public boolean v0() {
        return (this.f20548k & 64) == 64;
    }

    public boolean w0() {
        return (this.f20548k & 8) == 8;
    }

    public boolean x0() {
        return (this.f20548k & 16) == 16;
    }

    public boolean y0() {
        return (this.f20548k & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
    }

    public boolean z0() {
        return (this.f20548k & 128) == 128;
    }

    private n(h.c<n, ?> cVar) {
        super(cVar);
        this.v = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f20547j = cVar.l();
    }

    private n(boolean z) {
        this.v = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f20547j = d.f21894f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private n(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.v = -1;
        this.A = (byte) -1;
        this.B = -1;
        A0();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ?? r5 = 256;
            if (!z) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    z = true;
                                case 8:
                                    this.f20548k |= 2;
                                    this.m = eVar.s();
                                case 16:
                                    this.f20548k |= 4;
                                    this.n = eVar.s();
                                case 26:
                                    q.c c2 = (this.f20548k & 8) == 8 ? this.o.c() : null;
                                    q qVar = (q) eVar.u(q.f20582i, fVar);
                                    this.o = qVar;
                                    if (c2 != null) {
                                        c2.m(qVar);
                                        this.o = c2.u();
                                    }
                                    this.f20548k |= 8;
                                case 34:
                                    if ((i2 & 32) != 32) {
                                        this.q = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.q.add(eVar.u(s.f20611i, fVar));
                                case 42:
                                    q.c c3 = (this.f20548k & 32) == 32 ? this.r.c() : null;
                                    q qVar2 = (q) eVar.u(q.f20582i, fVar);
                                    this.r = qVar2;
                                    if (c3 != null) {
                                        c3.m(qVar2);
                                        this.r = c3.u();
                                    }
                                    this.f20548k |= 32;
                                case 50:
                                    u.b c4 = (this.f20548k & 128) == 128 ? this.w.c() : null;
                                    u uVar = (u) eVar.u(u.f20632i, fVar);
                                    this.w = uVar;
                                    if (c4 != null) {
                                        c4.m(uVar);
                                        this.w = c4.u();
                                    }
                                    this.f20548k |= 128;
                                case 56:
                                    this.f20548k |= 256;
                                    this.x = eVar.s();
                                case 64:
                                    this.f20548k |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    this.y = eVar.s();
                                case 72:
                                    this.f20548k |= 16;
                                    this.p = eVar.s();
                                case 80:
                                    this.f20548k |= 64;
                                    this.s = eVar.s();
                                case 88:
                                    this.f20548k |= 1;
                                    this.l = eVar.s();
                                case 98:
                                    if ((i2 & 256) != 256) {
                                        this.t = new ArrayList();
                                        i2 |= 256;
                                    }
                                    this.t.add(eVar.u(q.f20582i, fVar));
                                case 104:
                                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                                        this.u = new ArrayList();
                                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    this.u.add(Integer.valueOf(eVar.s()));
                                case 106:
                                    int j2 = eVar.j(eVar.A());
                                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 512 && eVar.e() > 0) {
                                        this.u = new ArrayList();
                                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    while (eVar.e() > 0) {
                                        this.u.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j2);
                                    break;
                                case 248:
                                    if ((i2 & 8192) != 8192) {
                                        this.z = new ArrayList();
                                        i2 |= 8192;
                                    }
                                    this.z.add(Integer.valueOf(eVar.s()));
                                case 250:
                                    int j3 = eVar.j(eVar.A());
                                    if ((i2 & 8192) != 8192 && eVar.e() > 0) {
                                        this.z = new ArrayList();
                                        i2 |= 8192;
                                    }
                                    while (eVar.e() > 0) {
                                        this.z.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j3);
                                    break;
                                default:
                                    r5 = p(eVar, J, fVar, K);
                                    if (r5 == 0) {
                                        z = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.i(this);
                        }
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 32) == 32) {
                        this.q = Collections.unmodifiableList(this.q);
                    }
                    if ((i2 & 256) == r5) {
                        this.t = Collections.unmodifiableList(this.t);
                    }
                    if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        this.u = Collections.unmodifiableList(this.u);
                    }
                    if ((i2 & 8192) == 8192) {
                        this.z = Collections.unmodifiableList(this.z);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f20547j = O.w();
                        throw th2;
                    }
                    this.f20547j = O.w();
                    m();
                    throw th;
                }
            } else {
                if ((i2 & 32) == 32) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if ((i2 & 256) == 256) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    this.u = Collections.unmodifiableList(this.u);
                }
                if ((i2 & 8192) == 8192) {
                    this.z = Collections.unmodifiableList(this.z);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f20547j = O.w();
                    throw th3;
                }
                this.f20547j = O.w();
                m();
                return;
            }
        }
    }
}
