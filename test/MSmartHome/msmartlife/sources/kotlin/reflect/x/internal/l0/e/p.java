package kotlin.reflect.x.internal.l0.e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.l;
import kotlin.reflect.jvm.internal.impl.protobuf.m;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.protobuf.r;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class p extends h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: g, reason: collision with root package name */
    private static final p f20574g;

    /* renamed from: h, reason: collision with root package name */
    public static q<p> f20575h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final d f20576i;

    /* renamed from: j, reason: collision with root package name */
    private m f20577j;

    /* renamed from: k, reason: collision with root package name */
    private byte f20578k;
    private int l;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<p> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public p b(e eVar, f fVar) throws InvalidProtocolBufferException {
            return new p(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.b<p, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: g, reason: collision with root package name */
        private int f20579g;

        /* renamed from: h, reason: collision with root package name */
        private m f20580h = l.f21941f;

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
            if ((this.f20579g & 1) != 1) {
                this.f20580h = new l(this.f20580h);
                this.f20579g |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public p a() {
            p q = q();
            if (q.isInitialized()) {
                return q;
            }
            throw a.AbstractC0372a.j(q);
        }

        public p q() {
            p pVar = new p(this);
            if ((this.f20579g & 1) == 1) {
                this.f20580h = this.f20580h.E();
                this.f20579g &= -2;
            }
            pVar.f20577j = this.f20580h;
            return pVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b k() {
            return s().m(q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(p pVar) {
            if (pVar == p.u()) {
                return this;
            }
            if (!pVar.f20577j.isEmpty()) {
                if (this.f20580h.isEmpty()) {
                    this.f20580h = pVar.f20577j;
                    this.f20579g &= -2;
                } else {
                    t();
                    this.f20580h.addAll(pVar.f20577j);
                }
            }
            n(l().b(pVar.f20576i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.p.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.p> r1 = kotlin.reflect.x.internal.l0.e.p.f20575h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.p r3 = (kotlin.reflect.x.internal.l0.e.p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.p r4 = (kotlin.reflect.x.internal.l0.e.p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.p.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.p$b");
        }
    }

    static {
        p pVar = new p(true);
        f20574g = pVar;
        pVar.z();
    }

    public static b A() {
        return b.o();
    }

    public static b B(p pVar) {
        return A().m(pVar);
    }

    public static p u() {
        return f20574g;
    }

    private void z() {
        this.f20577j = l.f21941f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b g() {
        return A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b c() {
        return B(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        for (int i2 = 0; i2 < this.f20577j.size(); i2++) {
            codedOutputStream.O(1, this.f20577j.y(i2));
        }
        codedOutputStream.i0(this.f20576i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f20577j.size(); i4++) {
            i3 += CodedOutputStream.e(this.f20577j.y(i4));
        }
        int size = 0 + i3 + (y().size() * 1) + this.f20576i.size();
        this.l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<p> h() {
        return f20575h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.f20578k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f20578k = (byte) 1;
        return true;
    }

    public String v(int i2) {
        return this.f20577j.get(i2);
    }

    public r y() {
        return this.f20577j;
    }

    private p(h.b bVar) {
        super(bVar);
        this.f20578k = (byte) -1;
        this.l = -1;
        this.f20576i = bVar.l();
    }

    private p(boolean z) {
        this.f20578k = (byte) -1;
        this.l = -1;
        this.f20576i = d.f21894f;
    }

    private p(e eVar, f fVar) throws InvalidProtocolBufferException {
        this.f20578k = (byte) -1;
        this.l = -1;
        z();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K != 10) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                d l = eVar.l();
                                if (!(z2 & true)) {
                                    this.f20577j = new l();
                                    z2 |= true;
                                }
                                this.f20577j.G(l);
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
                if (z2 & true) {
                    this.f20577j = this.f20577j.E();
                }
                try {
                    J.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f20576i = O.w();
                    throw th2;
                }
                this.f20576i = O.w();
                m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f20577j = this.f20577j.E();
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20576i = O.w();
            throw th3;
        }
        this.f20576i = O.w();
        m();
    }
}
