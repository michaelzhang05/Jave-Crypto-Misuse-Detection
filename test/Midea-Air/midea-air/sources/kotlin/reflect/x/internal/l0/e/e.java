package kotlin.reflect.x.internal.l0.e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class e extends h implements p {

    /* renamed from: g, reason: collision with root package name */
    private static final e f20461g;

    /* renamed from: h, reason: collision with root package name */
    public static q<e> f20462h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final d f20463i;

    /* renamed from: j, reason: collision with root package name */
    private List<f> f20464j;

    /* renamed from: k, reason: collision with root package name */
    private byte f20465k;
    private int l;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            return new e(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h.b<e, b> implements p {

        /* renamed from: g, reason: collision with root package name */
        private int f20466g;

        /* renamed from: h, reason: collision with root package name */
        private List<f> f20467h = Collections.emptyList();

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
            if ((this.f20466g & 1) != 1) {
                this.f20467h = new ArrayList(this.f20467h);
                this.f20466g |= 1;
            }
        }

        private void u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public e a() {
            e q = q();
            if (q.isInitialized()) {
                return q;
            }
            throw a.AbstractC0372a.j(q);
        }

        public e q() {
            e eVar = new e(this);
            if ((this.f20466g & 1) == 1) {
                this.f20467h = Collections.unmodifiableList(this.f20467h);
                this.f20466g &= -2;
            }
            eVar.f20464j = this.f20467h;
            return eVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b k() {
            return s().m(q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b m(e eVar) {
            if (eVar == e.u()) {
                return this;
            }
            if (!eVar.f20464j.isEmpty()) {
                if (this.f20467h.isEmpty()) {
                    this.f20467h = eVar.f20464j;
                    this.f20466g &= -2;
                } else {
                    t();
                    this.f20467h.addAll(eVar.f20464j);
                }
            }
            n(l().b(eVar.f20463i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.f0.x.e.l0.e.e.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.e> r1 = kotlin.reflect.x.internal.l0.e.e.f20462h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.x.e.l0.e.e r3 = (kotlin.reflect.x.internal.l0.e.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.x.e.l0.e.e r4 = (kotlin.reflect.x.internal.l0.e.e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.e.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.e$b");
        }
    }

    static {
        e eVar = new e(true);
        f20461g = eVar;
        eVar.z();
    }

    public static b A() {
        return b.o();
    }

    public static b B(e eVar) {
        return A().m(eVar);
    }

    public static e u() {
        return f20461g;
    }

    private void z() {
        this.f20464j = Collections.emptyList();
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
        for (int i2 = 0; i2 < this.f20464j.size(); i2++) {
            codedOutputStream.d0(1, this.f20464j.get(i2));
        }
        codedOutputStream.i0(this.f20463i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int e() {
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f20464j.size(); i4++) {
            i3 += CodedOutputStream.s(1, this.f20464j.get(i4));
        }
        int size = i3 + this.f20463i.size();
        this.l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<e> h() {
        return f20462h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean isInitialized() {
        byte b2 = this.f20465k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < y(); i2++) {
            if (!v(i2).isInitialized()) {
                this.f20465k = (byte) 0;
                return false;
            }
        }
        this.f20465k = (byte) 1;
        return true;
    }

    public f v(int i2) {
        return this.f20464j.get(i2);
    }

    public int y() {
        return this.f20464j.size();
    }

    private e(h.b bVar) {
        super(bVar);
        this.f20465k = (byte) -1;
        this.l = -1;
        this.f20463i = bVar.l();
    }

    private e(boolean z) {
        this.f20465k = (byte) -1;
        this.l = -1;
        this.f20463i = d.f21894f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
        this.f20465k = (byte) -1;
        this.l = -1;
        z();
        d.b O = d.O();
        CodedOutputStream J = CodedOutputStream.J(O, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int K = eVar.K();
                    if (K != 0) {
                        if (K != 10) {
                            if (!p(eVar, J, fVar, K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f20464j = new ArrayList();
                                z2 |= true;
                            }
                            this.f20464j.add(eVar.u(f.f20469h, fVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f20464j = Collections.unmodifiableList(this.f20464j);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f20463i = O.w();
                        throw th2;
                    }
                    this.f20463i = O.w();
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
            this.f20464j = Collections.unmodifiableList(this.f20464j);
        }
        try {
            J.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f20463i = O.w();
            throw th3;
        }
        this.f20463i = O.w();
        m();
    }
}
