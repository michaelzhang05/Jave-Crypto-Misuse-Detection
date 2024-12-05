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
public final class t extends h implements p {

    /* renamed from: g, reason: collision with root package name */
    private static final t f20623g;

    /* renamed from: h, reason: collision with root package name */
    public static q<t> f20624h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final d f20625i;

    /* renamed from: j, reason: collision with root package name */
    private int f20626j;

    /* renamed from: k, reason: collision with root package name */
    private List<q> f20627k;
    private int l;
    private byte m;
    private int n;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<t> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public t b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new t(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.b<t, b> implements p {

        /* renamed from: g, reason: collision with root package name */
        private int f20628g;

        /* renamed from: h, reason: collision with root package name */
        private List<q> f20629h = Collections.emptyList();

        /* renamed from: i, reason: collision with root package name */
        private int f20630i = -1;

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
            if ((this.f20628g & 1) != 1) {
                this.f20629h = new ArrayList(this.f20629h);
                this.f20628g |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public t a() {
            t q = q();
            if (q.isInitialized()) {
                return q;
            }
            throw a.AbstractC0372a.j(q);
        }

        public t q() {
            t tVar = new t(this);
            int i2 = this.f20628g;
            if ((i2 & 1) == 1) {
                this.f20629h = Collections.unmodifiableList(this.f20629h);
                this.f20628g &= -2;
            }
            tVar.f20627k = this.f20629h;
            int i3 = (i2 & 2) != 2 ? 0 : 1;
            tVar.l = this.f20630i;
            tVar.f20626j = i3;
            return tVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b k() {
            return s().m(q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(t tVar) {
            if (tVar == t.y()) {
                return this;
            }
            if (!tVar.f20627k.isEmpty()) {
                if (this.f20629h.isEmpty()) {
                    this.f20629h = tVar.f20627k;
                    this.f20628g &= -2;
                } else {
                    t();
                    this.f20629h.addAll(tVar.f20627k);
                }
            }
            if (tVar.D()) {
                y(tVar.z());
            }
            n(l().b(tVar.f20625i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.t.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.t> r1 = kotlin.reflect.x.internal.l0.e.t.f20624h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.t r3 = (kotlin.reflect.x.internal.l0.e.t) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.t r4 = (kotlin.reflect.x.internal.l0.e.t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.t.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.t$b");
        }

        public b y(int i2) {
            this.f20628g |= 2;
            this.f20630i = i2;
            return this;
        }
    }

    static {
        t tVar = new t(true);
        f20623g = tVar;
        tVar.E();
    }

    private void E() {
        this.f20627k = Collections.emptyList();
        this.l = -1;
    }

    public static b F() {
        return b.o();
    }

    public static b G(t tVar) {
        return F().m(tVar);
    }

    public static t y() {
        return f20623g;
    }

    public q A(int i2) {
        return this.f20627k.get(i2);
    }

    public int B() {
        return this.f20627k.size();
    }

    public List<q> C() {
        return this.f20627k;
    }

    public boolean D() {
        return (this.f20626j & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b g() {
        return F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b c() {
        return G(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        for (int i2 = 0; i2 < this.f20627k.size(); i2++) {
            codedOutputStream.d0(1, this.f20627k.get(i2));
        }
        if ((this.f20626j & 1) == 1) {
            codedOutputStream.a0(2, this.l);
        }
        codedOutputStream.i0(this.f20625i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f20627k.size(); i4++) {
            i3 += CodedOutputStream.s(1, this.f20627k.get(i4));
        }
        if ((this.f20626j & 1) == 1) {
            i3 += CodedOutputStream.o(2, this.l);
        }
        int size = i3 + this.f20625i.size();
        this.n = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<t> h() {
        return f20624h;
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
        for (int i2 = 0; i2 < B(); i2++) {
            if (!A(i2).isInitialized()) {
                this.m = (byte) 0;
                return false;
            }
        }
        this.m = (byte) 1;
        return true;
    }

    public int z() {
        return this.l;
    }

    private t(h.b bVar) {
        super(bVar);
        this.m = (byte) -1;
        this.n = -1;
        this.f20625i = bVar.l();
    }

    private t(boolean z) {
        this.m = (byte) -1;
        this.n = -1;
        this.f20625i = d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.m = (byte) -1;
        this.n = -1;
        E();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K == 10) {
                            if (!(z2 & true)) {
                                this.f20627k = new ArrayList();
                                z2 |= true;
                            }
                            this.f20627k.add(eVar.u(q.f20582i, fVar));
                        } else if (K != 16) {
                            if (!p(eVar, J, fVar, K)) {
                            }
                        } else {
                            this.f20626j |= 1;
                            this.l = eVar.s();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f20627k = Collections.unmodifiableList(this.f20627k);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f20625i = O.w();
                        throw th2;
                    }
                    this.f20625i = O.w();
                    m();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e2) {
                throw e2.i(this);
            } catch (IOException e3) {
                throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
            }
        }
        if (z2 & true) {
            this.f20627k = Collections.unmodifiableList(this.f20627k);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20625i = O.w();
            throw th3;
        }
        this.f20625i = O.w();
        m();
    }
}
