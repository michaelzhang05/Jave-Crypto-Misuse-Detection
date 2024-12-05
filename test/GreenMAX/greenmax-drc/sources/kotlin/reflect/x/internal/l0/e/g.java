package kotlin.reflect.x.internal.l0.e;

import java.io.IOException;
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
public final class g extends h.d<g> implements p {

    /* renamed from: h, reason: collision with root package name */
    private static final g f20490h;

    /* renamed from: i, reason: collision with root package name */
    public static q<g> f20491i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final d f20492j;

    /* renamed from: k, reason: collision with root package name */
    private int f20493k;
    private int l;
    private byte m;
    private int n;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<g> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public g b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new g(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.c<g, b> implements p {

        /* renamed from: i, reason: collision with root package name */
        private int f20494i;

        /* renamed from: j, reason: collision with root package name */
        private int f20495j;

        private b() {
            y();
        }

        static /* synthetic */ b s() {
            return x();
        }

        private static b x() {
            return new b();
        }

        private void y() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m(g gVar) {
            if (gVar == g.F()) {
                return this;
            }
            if (gVar.I()) {
                C(gVar.H());
            }
            r(gVar);
            n(l().b(gVar.f20492j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.g.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.g> r1 = kotlin.reflect.x.internal.l0.e.g.f20491i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.g r3 = (kotlin.reflect.x.internal.l0.e.g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.g r4 = (kotlin.reflect.x.internal.l0.e.g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.g.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.g$b");
        }

        public b C(int i2) {
            this.f20494i |= 1;
            this.f20495j = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public g a() {
            g u = u();
            if (u.isInitialized()) {
                return u;
            }
            throw a.AbstractC0372a.j(u);
        }

        public g u() {
            g gVar = new g(this);
            int i2 = (this.f20494i & 1) != 1 ? 0 : 1;
            gVar.l = this.f20495j;
            gVar.f20493k = i2;
            return gVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b k() {
            return x().m(u());
        }
    }

    static {
        g gVar = new g(true);
        f20490h = gVar;
        gVar.J();
    }

    public static g F() {
        return f20490h;
    }

    private void J() {
        this.l = 0;
    }

    public static b K() {
        return b.s();
    }

    public static b L(g gVar) {
        return K().m(gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public g b() {
        return f20490h;
    }

    public int H() {
        return this.l;
    }

    public boolean I() {
        return (this.f20493k & 1) == 1;
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
        h.d<MessageType>.a A = A();
        if ((this.f20493k & 1) == 1) {
            codedOutputStream.a0(1, this.l);
        }
        A.a(200, codedOutputStream);
        codedOutputStream.i0(this.f20492j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        int o = ((this.f20493k & 1) == 1 ? 0 + CodedOutputStream.o(1, this.l) : 0) + t() + this.f20492j.size();
        this.n = o;
        return o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<g> h() {
        return f20491i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!s()) {
            this.m = (byte) 0;
            return false;
        }
        this.m = (byte) 1;
        return true;
    }

    private g(h.c<g, ?> cVar) {
        super(cVar);
        this.m = (byte) -1;
        this.n = -1;
        this.f20492j = cVar.l();
    }

    private g(boolean z) {
        this.m = (byte) -1;
        this.n = -1;
        this.f20492j = d.f21894f;
    }

    private g(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.m = (byte) -1;
        this.n = -1;
        J();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K != 8) {
                            if (!p(eVar, J, fVar, K)) {
                            }
                        } else {
                            this.f20493k |= 1;
                            this.l = eVar.s();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                }
            } catch (Throwable th) {
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20492j = O.w();
                    throw th2;
                }
                this.f20492j = O.w();
                m();
                throw th;
            }
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20492j = O.w();
            throw th3;
        }
        this.f20492j = O.w();
        m();
    }
}
