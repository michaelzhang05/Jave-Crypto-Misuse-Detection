package kotlin.reflect.x.internal.l0.e.a0;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.w;
import kotlin.reflect.x.internal.l0.e.i;
import kotlin.reflect.x.internal.l0.e.l;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.q;
import kotlin.reflect.x.internal.l0.e.s;
import okhttp3.HttpUrl;

/* compiled from: JvmProtoBuf.java */
/* loaded from: classes2.dex */
public final class a {
    public static final h.f<kotlin.reflect.x.internal.l0.e.d, c> a;

    /* renamed from: b, reason: collision with root package name */
    public static final h.f<i, c> f20330b;

    /* renamed from: c, reason: collision with root package name */
    public static final h.f<i, Integer> f20331c;

    /* renamed from: d, reason: collision with root package name */
    public static final h.f<n, d> f20332d;

    /* renamed from: e, reason: collision with root package name */
    public static final h.f<n, Integer> f20333e;

    /* renamed from: f, reason: collision with root package name */
    public static final h.f<q, List<kotlin.reflect.x.internal.l0.e.b>> f20334f;

    /* renamed from: g, reason: collision with root package name */
    public static final h.f<q, Boolean> f20335g;

    /* renamed from: h, reason: collision with root package name */
    public static final h.f<s, List<kotlin.reflect.x.internal.l0.e.b>> f20336h;

    /* renamed from: i, reason: collision with root package name */
    public static final h.f<kotlin.reflect.x.internal.l0.e.c, Integer> f20337i;

    /* renamed from: j, reason: collision with root package name */
    public static final h.f<kotlin.reflect.x.internal.l0.e.c, List<n>> f20338j;

    /* renamed from: k, reason: collision with root package name */
    public static final h.f<kotlin.reflect.x.internal.l0.e.c, Integer> f20339k;
    public static final h.f<kotlin.reflect.x.internal.l0.e.c, Integer> l;
    public static final h.f<l, Integer> m;
    public static final h.f<l, List<n>> n;

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class e extends h implements p {

        /* renamed from: g, reason: collision with root package name */
        private static final e f20366g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<e> f20367h = new C0316a();

        /* renamed from: i, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f20368i;

        /* renamed from: j, reason: collision with root package name */
        private List<c> f20369j;

        /* renamed from: k, reason: collision with root package name */
        private List<Integer> f20370k;
        private int l;
        private byte m;
        private int n;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.a0.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0316a extends kotlin.reflect.jvm.internal.impl.protobuf.b<e> {
            C0316a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                return new e(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class b extends h.b<e, b> implements p {

            /* renamed from: g, reason: collision with root package name */
            private int f20371g;

            /* renamed from: h, reason: collision with root package name */
            private List<c> f20372h = Collections.emptyList();

            /* renamed from: i, reason: collision with root package name */
            private List<Integer> f20373i = Collections.emptyList();

            private b() {
                v();
            }

            static /* synthetic */ b o() {
                return s();
            }

            private static b s() {
                return new b();
            }

            private void t() {
                if ((this.f20371g & 2) != 2) {
                    this.f20373i = new ArrayList(this.f20373i);
                    this.f20371g |= 2;
                }
            }

            private void u() {
                if ((this.f20371g & 1) != 1) {
                    this.f20372h = new ArrayList(this.f20372h);
                    this.f20371g |= 1;
                }
            }

            private void v() {
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
                if ((this.f20371g & 1) == 1) {
                    this.f20372h = Collections.unmodifiableList(this.f20372h);
                    this.f20371g &= -2;
                }
                eVar.f20369j = this.f20372h;
                if ((this.f20371g & 2) == 2) {
                    this.f20373i = Collections.unmodifiableList(this.f20373i);
                    this.f20371g &= -3;
                }
                eVar.f20370k = this.f20373i;
                return eVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b k() {
                return s().m(q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m(e eVar) {
                if (eVar == e.y()) {
                    return this;
                }
                if (!eVar.f20369j.isEmpty()) {
                    if (this.f20372h.isEmpty()) {
                        this.f20372h = eVar.f20369j;
                        this.f20371g &= -2;
                    } else {
                        u();
                        this.f20372h.addAll(eVar.f20369j);
                    }
                }
                if (!eVar.f20370k.isEmpty()) {
                    if (this.f20373i.isEmpty()) {
                        this.f20373i = eVar.f20370k;
                        this.f20371g &= -3;
                    } else {
                        t();
                        this.f20373i.addAll(eVar.f20370k);
                    }
                }
                n(l().b(eVar.f20368i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.f0.x.e.l0.e.a0.a.e.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.a0.a$e> r1 = kotlin.f0.x.e.l0.e.a0.a.e.f20367h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.x.e.l0.e.a0.a$e r3 = (kotlin.f0.x.e.l0.e.a0.a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.x.e.l0.e.a0.a$e r4 = (kotlin.f0.x.e.l0.e.a0.a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.a0.a.e.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.a0.a$e$b");
            }
        }

        static {
            e eVar = new e(true);
            f20366g = eVar;
            eVar.B();
        }

        private void B() {
            this.f20369j = Collections.emptyList();
            this.f20370k = Collections.emptyList();
        }

        public static b C() {
            return b.o();
        }

        public static b D(e eVar) {
            return C().m(eVar);
        }

        public static e F(InputStream inputStream, f fVar) throws IOException {
            return f20367h.c(inputStream, fVar);
        }

        public static e y() {
            return f20366g;
        }

        public List<c> A() {
            return this.f20369j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b g() {
            return C();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public b c() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            for (int i2 = 0; i2 < this.f20369j.size(); i2++) {
                codedOutputStream.d0(1, this.f20369j.get(i2));
            }
            if (z().size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.l);
            }
            for (int i3 = 0; i3 < this.f20370k.size(); i3++) {
                codedOutputStream.b0(this.f20370k.get(i3).intValue());
            }
            codedOutputStream.i0(this.f20368i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int e() {
            int i2 = this.n;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f20369j.size(); i4++) {
                i3 += CodedOutputStream.s(1, this.f20369j.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f20370k.size(); i6++) {
                i5 += CodedOutputStream.p(this.f20370k.get(i6).intValue());
            }
            int i7 = i3 + i5;
            if (!z().isEmpty()) {
                i7 = i7 + 1 + CodedOutputStream.p(i5);
            }
            this.l = i5;
            int size = i7 + this.f20368i.size();
            this.n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<e> h() {
            return f20367h;
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
            this.m = (byte) 1;
            return true;
        }

        public List<Integer> z() {
            return this.f20370k;
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class c extends h implements p {

            /* renamed from: g, reason: collision with root package name */
            private static final c f20374g;

            /* renamed from: h, reason: collision with root package name */
            public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f20375h = new C0317a();

            /* renamed from: i, reason: collision with root package name */
            private final kotlin.reflect.jvm.internal.impl.protobuf.d f20376i;

            /* renamed from: j, reason: collision with root package name */
            private int f20377j;

            /* renamed from: k, reason: collision with root package name */
            private int f20378k;
            private int l;
            private Object m;
            private EnumC0318c n;
            private List<Integer> o;
            private int p;
            private List<Integer> q;
            private int r;
            private byte s;
            private int t;

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.f0.x.e.l0.e.a0.a$e$c$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            static class C0317a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
                C0317a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                    return new c(eVar, fVar);
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* loaded from: classes2.dex */
            public static final class b extends h.b<c, b> implements p {

                /* renamed from: g, reason: collision with root package name */
                private int f20379g;

                /* renamed from: i, reason: collision with root package name */
                private int f20381i;

                /* renamed from: h, reason: collision with root package name */
                private int f20380h = 1;

                /* renamed from: j, reason: collision with root package name */
                private Object f20382j = HttpUrl.FRAGMENT_ENCODE_SET;

                /* renamed from: k, reason: collision with root package name */
                private EnumC0318c f20383k = EnumC0318c.NONE;
                private List<Integer> l = Collections.emptyList();
                private List<Integer> m = Collections.emptyList();

                private b() {
                    v();
                }

                static /* synthetic */ b o() {
                    return s();
                }

                private static b s() {
                    return new b();
                }

                private void t() {
                    if ((this.f20379g & 32) != 32) {
                        this.m = new ArrayList(this.m);
                        this.f20379g |= 32;
                    }
                }

                private void u() {
                    if ((this.f20379g & 16) != 16) {
                        this.l = new ArrayList(this.l);
                        this.f20379g |= 16;
                    }
                }

                private void v() {
                }

                public b A(EnumC0318c enumC0318c) {
                    enumC0318c.getClass();
                    this.f20379g |= 8;
                    this.f20383k = enumC0318c;
                    return this;
                }

                public b B(int i2) {
                    this.f20379g |= 2;
                    this.f20381i = i2;
                    return this;
                }

                public b C(int i2) {
                    this.f20379g |= 1;
                    this.f20380h = i2;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public c a() {
                    c q = q();
                    if (q.isInitialized()) {
                        return q;
                    }
                    throw a.AbstractC0372a.j(q);
                }

                public c q() {
                    c cVar = new c(this);
                    int i2 = this.f20379g;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    cVar.f20378k = this.f20380h;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    cVar.l = this.f20381i;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    cVar.m = this.f20382j;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    cVar.n = this.f20383k;
                    if ((this.f20379g & 16) == 16) {
                        this.l = Collections.unmodifiableList(this.l);
                        this.f20379g &= -17;
                    }
                    cVar.o = this.l;
                    if ((this.f20379g & 32) == 32) {
                        this.m = Collections.unmodifiableList(this.m);
                        this.f20379g &= -33;
                    }
                    cVar.q = this.m;
                    cVar.f20377j = i3;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public b k() {
                    return s().m(q());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public b m(c cVar) {
                    if (cVar == c.E()) {
                        return this;
                    }
                    if (cVar.Q()) {
                        C(cVar.H());
                    }
                    if (cVar.P()) {
                        B(cVar.G());
                    }
                    if (cVar.R()) {
                        this.f20379g |= 4;
                        this.f20382j = cVar.m;
                    }
                    if (cVar.O()) {
                        A(cVar.F());
                    }
                    if (!cVar.o.isEmpty()) {
                        if (this.l.isEmpty()) {
                            this.l = cVar.o;
                            this.f20379g &= -17;
                        } else {
                            u();
                            this.l.addAll(cVar.o);
                        }
                    }
                    if (!cVar.q.isEmpty()) {
                        if (this.m.isEmpty()) {
                            this.m = cVar.q;
                            this.f20379g &= -33;
                        } else {
                            t();
                            this.m.addAll(cVar.q);
                        }
                    }
                    n(l().b(cVar.f20376i));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.f0.x.e.l0.e.a0.a.e.c.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.a0.a$e$c> r1 = kotlin.f0.x.e.l0.e.a0.a.e.c.f20375h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.f0.x.e.l0.e.a0.a$e$c r3 = (kotlin.f0.x.e.l0.e.a0.a.e.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.f0.x.e.l0.e.a0.a$e$c r4 = (kotlin.f0.x.e.l0.e.a0.a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.a0.a.e.c.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.a0.a$e$c$b");
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.f0.x.e.l0.e.a0.a$e$c$c, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public enum EnumC0318c implements i.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* renamed from: i, reason: collision with root package name */
                private static i.b<EnumC0318c> f20387i = new C0319a();

                /* renamed from: k, reason: collision with root package name */
                private final int f20389k;

                /* compiled from: JvmProtoBuf.java */
                /* renamed from: kotlin.f0.x.e.l0.e.a0.a$e$c$c$a, reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                static class C0319a implements i.b<EnumC0318c> {
                    C0319a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0318c a(int i2) {
                        return EnumC0318c.d(i2);
                    }
                }

                EnumC0318c(int i2, int i3) {
                    this.f20389k = i3;
                }

                public static EnumC0318c d(int i2) {
                    if (i2 == 0) {
                        return NONE;
                    }
                    if (i2 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i2 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
                public final int a() {
                    return this.f20389k;
                }
            }

            static {
                c cVar = new c(true);
                f20374g = cVar;
                cVar.S();
            }

            public static c E() {
                return f20374g;
            }

            private void S() {
                this.f20378k = 1;
                this.l = 0;
                this.m = HttpUrl.FRAGMENT_ENCODE_SET;
                this.n = EnumC0318c.NONE;
                this.o = Collections.emptyList();
                this.q = Collections.emptyList();
            }

            public static b T() {
                return b.o();
            }

            public static b U(c cVar) {
                return T().m(cVar);
            }

            public EnumC0318c F() {
                return this.n;
            }

            public int G() {
                return this.l;
            }

            public int H() {
                return this.f20378k;
            }

            public int I() {
                return this.q.size();
            }

            public List<Integer> J() {
                return this.q;
            }

            public String K() {
                Object obj = this.m;
                if (obj instanceof String) {
                    return (String) obj;
                }
                kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
                String U = dVar.U();
                if (dVar.L()) {
                    this.m = U;
                }
                return U;
            }

            public kotlin.reflect.jvm.internal.impl.protobuf.d L() {
                Object obj = this.m;
                if (obj instanceof String) {
                    kotlin.reflect.jvm.internal.impl.protobuf.d x = kotlin.reflect.jvm.internal.impl.protobuf.d.x((String) obj);
                    this.m = x;
                    return x;
                }
                return (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
            }

            public int M() {
                return this.o.size();
            }

            public List<Integer> N() {
                return this.o;
            }

            public boolean O() {
                return (this.f20377j & 8) == 8;
            }

            public boolean P() {
                return (this.f20377j & 2) == 2;
            }

            public boolean Q() {
                return (this.f20377j & 1) == 1;
            }

            public boolean R() {
                return (this.f20377j & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: V, reason: merged with bridge method [inline-methods] */
            public b g() {
                return T();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: W, reason: merged with bridge method [inline-methods] */
            public b c() {
                return U(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public void d(CodedOutputStream codedOutputStream) throws IOException {
                e();
                if ((this.f20377j & 1) == 1) {
                    codedOutputStream.a0(1, this.f20378k);
                }
                if ((this.f20377j & 2) == 2) {
                    codedOutputStream.a0(2, this.l);
                }
                if ((this.f20377j & 8) == 8) {
                    codedOutputStream.S(3, this.n.a());
                }
                if (N().size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.p);
                }
                for (int i2 = 0; i2 < this.o.size(); i2++) {
                    codedOutputStream.b0(this.o.get(i2).intValue());
                }
                if (J().size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.r);
                }
                for (int i3 = 0; i3 < this.q.size(); i3++) {
                    codedOutputStream.b0(this.q.get(i3).intValue());
                }
                if ((this.f20377j & 4) == 4) {
                    codedOutputStream.O(6, L());
                }
                codedOutputStream.i0(this.f20376i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public int e() {
                int i2 = this.t;
                if (i2 != -1) {
                    return i2;
                }
                int o = (this.f20377j & 1) == 1 ? CodedOutputStream.o(1, this.f20378k) + 0 : 0;
                if ((this.f20377j & 2) == 2) {
                    o += CodedOutputStream.o(2, this.l);
                }
                if ((this.f20377j & 8) == 8) {
                    o += CodedOutputStream.h(3, this.n.a());
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.o.size(); i4++) {
                    i3 += CodedOutputStream.p(this.o.get(i4).intValue());
                }
                int i5 = o + i3;
                if (!N().isEmpty()) {
                    i5 = i5 + 1 + CodedOutputStream.p(i3);
                }
                this.p = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < this.q.size(); i7++) {
                    i6 += CodedOutputStream.p(this.q.get(i7).intValue());
                }
                int i8 = i5 + i6;
                if (!J().isEmpty()) {
                    i8 = i8 + 1 + CodedOutputStream.p(i6);
                }
                this.r = i6;
                if ((this.f20377j & 4) == 4) {
                    i8 += CodedOutputStream.d(6, L());
                }
                int size = i8 + this.f20376i.size();
                this.t = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
            public kotlin.reflect.jvm.internal.impl.protobuf.q<c> h() {
                return f20375h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            public final boolean isInitialized() {
                byte b2 = this.s;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.s = (byte) 1;
                return true;
            }

            private c(h.b bVar) {
                super(bVar);
                this.p = -1;
                this.r = -1;
                this.s = (byte) -1;
                this.t = -1;
                this.f20376i = bVar.l();
            }

            private c(boolean z) {
                this.p = -1;
                this.r = -1;
                this.s = (byte) -1;
                this.t = -1;
                this.f20376i = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;
            }

            private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                this.p = -1;
                this.r = -1;
                this.s = (byte) -1;
                this.t = -1;
                S();
                d.b O = kotlin.reflect.jvm.internal.impl.protobuf.d.O();
                CodedOutputStream J = CodedOutputStream.J(O, 1);
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.f20377j |= 1;
                                    this.f20378k = eVar.s();
                                } else if (K == 16) {
                                    this.f20377j |= 2;
                                    this.l = eVar.s();
                                } else if (K == 24) {
                                    int n = eVar.n();
                                    EnumC0318c d2 = EnumC0318c.d(n);
                                    if (d2 == null) {
                                        J.o0(K);
                                        J.o0(n);
                                    } else {
                                        this.f20377j |= 8;
                                        this.n = d2;
                                    }
                                } else if (K == 32) {
                                    if ((i2 & 16) != 16) {
                                        this.o = new ArrayList();
                                        i2 |= 16;
                                    }
                                    this.o.add(Integer.valueOf(eVar.s()));
                                } else if (K == 34) {
                                    int j2 = eVar.j(eVar.A());
                                    if ((i2 & 16) != 16 && eVar.e() > 0) {
                                        this.o = new ArrayList();
                                        i2 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.o.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j2);
                                } else if (K == 40) {
                                    if ((i2 & 32) != 32) {
                                        this.q = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.q.add(Integer.valueOf(eVar.s()));
                                } else if (K == 42) {
                                    int j3 = eVar.j(eVar.A());
                                    if ((i2 & 32) != 32 && eVar.e() > 0) {
                                        this.q = new ArrayList();
                                        i2 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.q.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j3);
                                } else if (K != 50) {
                                    if (!p(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    kotlin.reflect.jvm.internal.impl.protobuf.d l = eVar.l();
                                    this.f20377j |= 4;
                                    this.m = l;
                                }
                            }
                            z = true;
                        } catch (Throwable th) {
                            if ((i2 & 16) == 16) {
                                this.o = Collections.unmodifiableList(this.o);
                            }
                            if ((i2 & 32) == 32) {
                                this.q = Collections.unmodifiableList(this.q);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f20376i = O.w();
                                throw th2;
                            }
                            this.f20376i = O.w();
                            m();
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.i(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                    }
                }
                if ((i2 & 16) == 16) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                if ((i2 & 32) == 32) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f20376i = O.w();
                    throw th3;
                }
                this.f20376i = O.w();
                m();
            }
        }

        private e(h.b bVar) {
            super(bVar);
            this.l = -1;
            this.m = (byte) -1;
            this.n = -1;
            this.f20368i = bVar.l();
        }

        private e(boolean z) {
            this.l = -1;
            this.m = (byte) -1;
            this.n = -1;
            this.f20368i = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            this.l = -1;
            this.m = (byte) -1;
            this.n = -1;
            B();
            d.b O = kotlin.reflect.jvm.internal.impl.protobuf.d.O();
            CodedOutputStream J = CodedOutputStream.J(O, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if ((i2 & 1) != 1) {
                                    this.f20369j = new ArrayList();
                                    i2 |= 1;
                                }
                                this.f20369j.add(eVar.u(c.f20375h, fVar));
                            } else if (K == 40) {
                                if ((i2 & 2) != 2) {
                                    this.f20370k = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f20370k.add(Integer.valueOf(eVar.s()));
                            } else if (K != 42) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j2 = eVar.j(eVar.A());
                                if ((i2 & 2) != 2 && eVar.e() > 0) {
                                    this.f20370k = new ArrayList();
                                    i2 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f20370k.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j2);
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i2 & 1) == 1) {
                            this.f20369j = Collections.unmodifiableList(this.f20369j);
                        }
                        if ((i2 & 2) == 2) {
                            this.f20370k = Collections.unmodifiableList(this.f20370k);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f20368i = O.w();
                            throw th2;
                        }
                        this.f20368i = O.w();
                        m();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).i(this);
                }
            }
            if ((i2 & 1) == 1) {
                this.f20369j = Collections.unmodifiableList(this.f20369j);
            }
            if ((i2 & 2) == 2) {
                this.f20370k = Collections.unmodifiableList(this.f20370k);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f20368i = O.w();
                throw th3;
            }
            this.f20368i = O.w();
            m();
        }
    }

    static {
        kotlin.reflect.x.internal.l0.e.d J = kotlin.reflect.x.internal.l0.e.d.J();
        c v = c.v();
        c v2 = c.v();
        w.b bVar = w.b.p;
        a = h.o(J, v, v2, null, 100, bVar, c.class);
        f20330b = h.o(kotlin.reflect.x.internal.l0.e.i.c0(), c.v(), c.v(), null, 100, bVar, c.class);
        kotlin.reflect.x.internal.l0.e.i c0 = kotlin.reflect.x.internal.l0.e.i.c0();
        w.b bVar2 = w.b.f21992j;
        f20331c = h.o(c0, 0, null, null, 101, bVar2, Integer.class);
        f20332d = h.o(n.a0(), d.A(), d.A(), null, 100, bVar, d.class);
        f20333e = h.o(n.a0(), 0, null, null, 101, bVar2, Integer.class);
        f20334f = h.n(q.Z(), kotlin.reflect.x.internal.l0.e.b.B(), null, 100, bVar, false, kotlin.reflect.x.internal.l0.e.b.class);
        f20335g = h.o(q.Z(), Boolean.FALSE, null, null, 101, w.b.m, Boolean.class);
        f20336h = h.n(s.M(), kotlin.reflect.x.internal.l0.e.b.B(), null, 100, bVar, false, kotlin.reflect.x.internal.l0.e.b.class);
        f20337i = h.o(kotlin.reflect.x.internal.l0.e.c.A0(), 0, null, null, 101, bVar2, Integer.class);
        f20338j = h.n(kotlin.reflect.x.internal.l0.e.c.A0(), n.a0(), null, 102, bVar, false, n.class);
        f20339k = h.o(kotlin.reflect.x.internal.l0.e.c.A0(), 0, null, null, 103, bVar2, Integer.class);
        l = h.o(kotlin.reflect.x.internal.l0.e.c.A0(), 0, null, null, 104, bVar2, Integer.class);
        m = h.o(l.M(), 0, null, null, 101, bVar2, Integer.class);
        n = h.n(l.M(), n.a0(), null, 102, bVar, false, n.class);
    }

    public static void a(f fVar) {
        fVar.a(a);
        fVar.a(f20330b);
        fVar.a(f20331c);
        fVar.a(f20332d);
        fVar.a(f20333e);
        fVar.a(f20334f);
        fVar.a(f20335g);
        fVar.a(f20336h);
        fVar.a(f20337i);
        fVar.a(f20338j);
        fVar.a(f20339k);
        fVar.a(l);
        fVar.a(m);
        fVar.a(n);
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends h implements p {

        /* renamed from: g, reason: collision with root package name */
        private static final b f20340g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<b> f20341h = new C0312a();

        /* renamed from: i, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f20342i;

        /* renamed from: j, reason: collision with root package name */
        private int f20343j;

        /* renamed from: k, reason: collision with root package name */
        private int f20344k;
        private int l;
        private byte m;
        private int n;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.a0.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0312a extends kotlin.reflect.jvm.internal.impl.protobuf.b<b> {
            C0312a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                return new b(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.a0.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0313b extends h.b<b, C0313b> implements p {

            /* renamed from: g, reason: collision with root package name */
            private int f20345g;

            /* renamed from: h, reason: collision with root package name */
            private int f20346h;

            /* renamed from: i, reason: collision with root package name */
            private int f20347i;

            private C0313b() {
                t();
            }

            static /* synthetic */ C0313b o() {
                return s();
            }

            private static C0313b s() {
                return new C0313b();
            }

            private void t() {
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
                int i2 = this.f20345g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                bVar.f20344k = this.f20346h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                bVar.l = this.f20347i;
                bVar.f20343j = i3;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0313b k() {
                return s().m(q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0313b m(b bVar) {
                if (bVar == b.v()) {
                    return this;
                }
                if (bVar.B()) {
                    y(bVar.z());
                }
                if (bVar.A()) {
                    x(bVar.y());
                }
                n(l().b(bVar.f20342i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.f0.x.e.l0.e.a0.a.b.C0313b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.a0.a$b> r1 = kotlin.f0.x.e.l0.e.a0.a.b.f20341h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.x.e.l0.e.a0.a$b r3 = (kotlin.f0.x.e.l0.e.a0.a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.x.e.l0.e.a0.a$b r4 = (kotlin.f0.x.e.l0.e.a0.a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.a0.a.b.C0313b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.a0.a$b$b");
            }

            public C0313b x(int i2) {
                this.f20345g |= 2;
                this.f20347i = i2;
                return this;
            }

            public C0313b y(int i2) {
                this.f20345g |= 1;
                this.f20346h = i2;
                return this;
            }
        }

        static {
            b bVar = new b(true);
            f20340g = bVar;
            bVar.C();
        }

        private void C() {
            this.f20344k = 0;
            this.l = 0;
        }

        public static C0313b D() {
            return C0313b.o();
        }

        public static C0313b E(b bVar) {
            return D().m(bVar);
        }

        public static b v() {
            return f20340g;
        }

        public boolean A() {
            return (this.f20343j & 2) == 2;
        }

        public boolean B() {
            return (this.f20343j & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public C0313b g() {
            return D();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public C0313b c() {
            return E(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.f20343j & 1) == 1) {
                codedOutputStream.a0(1, this.f20344k);
            }
            if ((this.f20343j & 2) == 2) {
                codedOutputStream.a0(2, this.l);
            }
            codedOutputStream.i0(this.f20342i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int e() {
            int i2 = this.n;
            if (i2 != -1) {
                return i2;
            }
            int o = (this.f20343j & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f20344k) : 0;
            if ((this.f20343j & 2) == 2) {
                o += CodedOutputStream.o(2, this.l);
            }
            int size = o + this.f20342i.size();
            this.n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<b> h() {
            return f20341h;
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
            this.m = (byte) 1;
            return true;
        }

        public int y() {
            return this.l;
        }

        public int z() {
            return this.f20344k;
        }

        private b(h.b bVar) {
            super(bVar);
            this.m = (byte) -1;
            this.n = -1;
            this.f20342i = bVar.l();
        }

        private b(boolean z) {
            this.m = (byte) -1;
            this.n = -1;
            this.f20342i = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;
        }

        private b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            this.m = (byte) -1;
            this.n = -1;
            C();
            d.b O = kotlin.reflect.jvm.internal.impl.protobuf.d.O();
            CodedOutputStream J = CodedOutputStream.J(O, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f20343j |= 1;
                                this.f20344k = eVar.s();
                            } else if (K != 16) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.f20343j |= 2;
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
                        this.f20342i = O.w();
                        throw th2;
                    }
                    this.f20342i = O.w();
                    m();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f20342i = O.w();
                throw th3;
            }
            this.f20342i = O.w();
            m();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class c extends h implements p {

        /* renamed from: g, reason: collision with root package name */
        private static final c f20348g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<c> f20349h = new C0314a();

        /* renamed from: i, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f20350i;

        /* renamed from: j, reason: collision with root package name */
        private int f20351j;

        /* renamed from: k, reason: collision with root package name */
        private int f20352k;
        private int l;
        private byte m;
        private int n;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.a0.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0314a extends kotlin.reflect.jvm.internal.impl.protobuf.b<c> {
            C0314a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                return new c(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class b extends h.b<c, b> implements p {

            /* renamed from: g, reason: collision with root package name */
            private int f20353g;

            /* renamed from: h, reason: collision with root package name */
            private int f20354h;

            /* renamed from: i, reason: collision with root package name */
            private int f20355i;

            private b() {
                t();
            }

            static /* synthetic */ b o() {
                return s();
            }

            private static b s() {
                return new b();
            }

            private void t() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public c a() {
                c q = q();
                if (q.isInitialized()) {
                    return q;
                }
                throw a.AbstractC0372a.j(q);
            }

            public c q() {
                c cVar = new c(this);
                int i2 = this.f20353g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                cVar.f20352k = this.f20354h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                cVar.l = this.f20355i;
                cVar.f20351j = i3;
                return cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b k() {
                return s().m(q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b m(c cVar) {
                if (cVar == c.v()) {
                    return this;
                }
                if (cVar.B()) {
                    y(cVar.z());
                }
                if (cVar.A()) {
                    x(cVar.y());
                }
                n(l().b(cVar.f20350i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.f0.x.e.l0.e.a0.a.c.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.a0.a$c> r1 = kotlin.f0.x.e.l0.e.a0.a.c.f20349h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.x.e.l0.e.a0.a$c r3 = (kotlin.f0.x.e.l0.e.a0.a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.x.e.l0.e.a0.a$c r4 = (kotlin.f0.x.e.l0.e.a0.a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.a0.a.c.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.a0.a$c$b");
            }

            public b x(int i2) {
                this.f20353g |= 2;
                this.f20355i = i2;
                return this;
            }

            public b y(int i2) {
                this.f20353g |= 1;
                this.f20354h = i2;
                return this;
            }
        }

        static {
            c cVar = new c(true);
            f20348g = cVar;
            cVar.C();
        }

        private void C() {
            this.f20352k = 0;
            this.l = 0;
        }

        public static b D() {
            return b.o();
        }

        public static b E(c cVar) {
            return D().m(cVar);
        }

        public static c v() {
            return f20348g;
        }

        public boolean A() {
            return (this.f20351j & 2) == 2;
        }

        public boolean B() {
            return (this.f20351j & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public b g() {
            return D();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public b c() {
            return E(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.f20351j & 1) == 1) {
                codedOutputStream.a0(1, this.f20352k);
            }
            if ((this.f20351j & 2) == 2) {
                codedOutputStream.a0(2, this.l);
            }
            codedOutputStream.i0(this.f20350i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int e() {
            int i2 = this.n;
            if (i2 != -1) {
                return i2;
            }
            int o = (this.f20351j & 1) == 1 ? 0 + CodedOutputStream.o(1, this.f20352k) : 0;
            if ((this.f20351j & 2) == 2) {
                o += CodedOutputStream.o(2, this.l);
            }
            int size = o + this.f20350i.size();
            this.n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<c> h() {
            return f20349h;
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
            this.m = (byte) 1;
            return true;
        }

        public int y() {
            return this.l;
        }

        public int z() {
            return this.f20352k;
        }

        private c(h.b bVar) {
            super(bVar);
            this.m = (byte) -1;
            this.n = -1;
            this.f20350i = bVar.l();
        }

        private c(boolean z) {
            this.m = (byte) -1;
            this.n = -1;
            this.f20350i = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            this.m = (byte) -1;
            this.n = -1;
            C();
            d.b O = kotlin.reflect.jvm.internal.impl.protobuf.d.O();
            CodedOutputStream J = CodedOutputStream.J(O, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.f20351j |= 1;
                                this.f20352k = eVar.s();
                            } else if (K != 16) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.f20351j |= 2;
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
                        this.f20350i = O.w();
                        throw th2;
                    }
                    this.f20350i = O.w();
                    m();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f20350i = O.w();
                throw th3;
            }
            this.f20350i = O.w();
            m();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class d extends h implements p {

        /* renamed from: g, reason: collision with root package name */
        private static final d f20356g;

        /* renamed from: h, reason: collision with root package name */
        public static kotlin.reflect.jvm.internal.impl.protobuf.q<d> f20357h = new C0315a();

        /* renamed from: i, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.d f20358i;

        /* renamed from: j, reason: collision with root package name */
        private int f20359j;

        /* renamed from: k, reason: collision with root package name */
        private b f20360k;
        private c l;
        private c m;
        private c n;
        private c o;
        private byte p;
        private int q;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.x.e.l0.e.a0.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0315a extends kotlin.reflect.jvm.internal.impl.protobuf.b<d> {
            C0315a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public d b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
                return new d(eVar, fVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class b extends h.b<d, b> implements p {

            /* renamed from: g, reason: collision with root package name */
            private int f20361g;

            /* renamed from: h, reason: collision with root package name */
            private b f20362h = b.v();

            /* renamed from: i, reason: collision with root package name */
            private c f20363i = c.v();

            /* renamed from: j, reason: collision with root package name */
            private c f20364j = c.v();

            /* renamed from: k, reason: collision with root package name */
            private c f20365k = c.v();
            private c l = c.v();

            private b() {
                t();
            }

            static /* synthetic */ b o() {
                return s();
            }

            private static b s() {
                return new b();
            }

            private void t() {
            }

            public b A(c cVar) {
                if ((this.f20361g & 4) == 4 && this.f20364j != c.v()) {
                    this.f20364j = c.E(this.f20364j).m(cVar).q();
                } else {
                    this.f20364j = cVar;
                }
                this.f20361g |= 4;
                return this;
            }

            public b B(c cVar) {
                if ((this.f20361g & 8) == 8 && this.f20365k != c.v()) {
                    this.f20365k = c.E(this.f20365k).m(cVar).q();
                } else {
                    this.f20365k = cVar;
                }
                this.f20361g |= 8;
                return this;
            }

            public b C(c cVar) {
                if ((this.f20361g & 2) == 2 && this.f20363i != c.v()) {
                    this.f20363i = c.E(this.f20363i).m(cVar).q();
                } else {
                    this.f20363i = cVar;
                }
                this.f20361g |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public d a() {
                d q = q();
                if (q.isInitialized()) {
                    return q;
                }
                throw a.AbstractC0372a.j(q);
            }

            public d q() {
                d dVar = new d(this);
                int i2 = this.f20361g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                dVar.f20360k = this.f20362h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                dVar.l = this.f20363i;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                dVar.m = this.f20364j;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                dVar.n = this.f20365k;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                dVar.o = this.l;
                dVar.f20359j = i3;
                return dVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b k() {
                return s().m(q());
            }

            public b u(c cVar) {
                if ((this.f20361g & 16) == 16 && this.l != c.v()) {
                    this.l = c.E(this.l).m(cVar).q();
                } else {
                    this.l = cVar;
                }
                this.f20361g |= 16;
                return this;
            }

            public b v(b bVar) {
                if ((this.f20361g & 1) == 1 && this.f20362h != b.v()) {
                    this.f20362h = b.E(this.f20362h).m(bVar).q();
                } else {
                    this.f20362h = bVar;
                }
                this.f20361g |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m(d dVar) {
                if (dVar == d.A()) {
                    return this;
                }
                if (dVar.H()) {
                    v(dVar.C());
                }
                if (dVar.K()) {
                    C(dVar.F());
                }
                if (dVar.I()) {
                    A(dVar.D());
                }
                if (dVar.J()) {
                    B(dVar.E());
                }
                if (dVar.G()) {
                    u(dVar.B());
                }
                n(l().b(dVar.f20358i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0372a, kotlin.reflect.jvm.internal.impl.protobuf.o.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.f0.x.e.l0.e.a0.a.d.b w(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.x.e.l0.e.a0.a$d> r1 = kotlin.f0.x.e.l0.e.a0.a.d.f20357h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.x.e.l0.e.a0.a$d r3 = (kotlin.f0.x.e.l0.e.a0.a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.x.e.l0.e.a0.a$d r4 = (kotlin.f0.x.e.l0.e.a0.a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.e.a0.a.d.b.w(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.x.e.l0.e.a0.a$d$b");
            }
        }

        static {
            d dVar = new d(true);
            f20356g = dVar;
            dVar.L();
        }

        public static d A() {
            return f20356g;
        }

        private void L() {
            this.f20360k = b.v();
            this.l = c.v();
            this.m = c.v();
            this.n = c.v();
            this.o = c.v();
        }

        public static b M() {
            return b.o();
        }

        public static b N(d dVar) {
            return M().m(dVar);
        }

        public c B() {
            return this.o;
        }

        public b C() {
            return this.f20360k;
        }

        public c D() {
            return this.m;
        }

        public c E() {
            return this.n;
        }

        public c F() {
            return this.l;
        }

        public boolean G() {
            return (this.f20359j & 16) == 16;
        }

        public boolean H() {
            return (this.f20359j & 1) == 1;
        }

        public boolean I() {
            return (this.f20359j & 4) == 4;
        }

        public boolean J() {
            return (this.f20359j & 8) == 8;
        }

        public boolean K() {
            return (this.f20359j & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public b g() {
            return M();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public b c() {
            return N(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.f20359j & 1) == 1) {
                codedOutputStream.d0(1, this.f20360k);
            }
            if ((this.f20359j & 2) == 2) {
                codedOutputStream.d0(2, this.l);
            }
            if ((this.f20359j & 4) == 4) {
                codedOutputStream.d0(3, this.m);
            }
            if ((this.f20359j & 8) == 8) {
                codedOutputStream.d0(4, this.n);
            }
            if ((this.f20359j & 16) == 16) {
                codedOutputStream.d0(5, this.o);
            }
            codedOutputStream.i0(this.f20358i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public int e() {
            int i2 = this.q;
            if (i2 != -1) {
                return i2;
            }
            int s = (this.f20359j & 1) == 1 ? 0 + CodedOutputStream.s(1, this.f20360k) : 0;
            if ((this.f20359j & 2) == 2) {
                s += CodedOutputStream.s(2, this.l);
            }
            if ((this.f20359j & 4) == 4) {
                s += CodedOutputStream.s(3, this.m);
            }
            if ((this.f20359j & 8) == 8) {
                s += CodedOutputStream.s(4, this.n);
            }
            if ((this.f20359j & 16) == 16) {
                s += CodedOutputStream.s(5, this.o);
            }
            int size = s + this.f20358i.size();
            this.q = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
        public kotlin.reflect.jvm.internal.impl.protobuf.q<d> h() {
            return f20357h;
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
            this.p = (byte) 1;
            return true;
        }

        private d(h.b bVar) {
            super(bVar);
            this.p = (byte) -1;
            this.q = -1;
            this.f20358i = bVar.l();
        }

        private d(boolean z) {
            this.p = (byte) -1;
            this.q = -1;
            this.f20358i = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;
        }

        private d(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, f fVar) throws InvalidProtocolBufferException {
            this.p = (byte) -1;
            this.q = -1;
            L();
            d.b O = kotlin.reflect.jvm.internal.impl.protobuf.d.O();
            CodedOutputStream J = CodedOutputStream.J(O, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                b.C0313b c2 = (this.f20359j & 1) == 1 ? this.f20360k.c() : null;
                                b bVar = (b) eVar.u(b.f20341h, fVar);
                                this.f20360k = bVar;
                                if (c2 != null) {
                                    c2.m(bVar);
                                    this.f20360k = c2.q();
                                }
                                this.f20359j |= 1;
                            } else if (K == 18) {
                                c.b c3 = (this.f20359j & 2) == 2 ? this.l.c() : null;
                                c cVar = (c) eVar.u(c.f20349h, fVar);
                                this.l = cVar;
                                if (c3 != null) {
                                    c3.m(cVar);
                                    this.l = c3.q();
                                }
                                this.f20359j |= 2;
                            } else if (K == 26) {
                                c.b c4 = (this.f20359j & 4) == 4 ? this.m.c() : null;
                                c cVar2 = (c) eVar.u(c.f20349h, fVar);
                                this.m = cVar2;
                                if (c4 != null) {
                                    c4.m(cVar2);
                                    this.m = c4.q();
                                }
                                this.f20359j |= 4;
                            } else if (K == 34) {
                                c.b c5 = (this.f20359j & 8) == 8 ? this.n.c() : null;
                                c cVar3 = (c) eVar.u(c.f20349h, fVar);
                                this.n = cVar3;
                                if (c5 != null) {
                                    c5.m(cVar3);
                                    this.n = c5.q();
                                }
                                this.f20359j |= 8;
                            } else if (K != 42) {
                                if (!p(eVar, J, fVar, K)) {
                                }
                            } else {
                                c.b c6 = (this.f20359j & 16) == 16 ? this.o.c() : null;
                                c cVar4 = (c) eVar.u(c.f20349h, fVar);
                                this.o = cVar4;
                                if (c6 != null) {
                                    c6.m(cVar4);
                                    this.o = c6.q();
                                }
                                this.f20359j |= 16;
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
                        this.f20358i = O.w();
                        throw th2;
                    }
                    this.f20358i = O.w();
                    m();
                    throw th;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f20358i = O.w();
                throw th3;
            }
            this.f20358i = O.w();
            m();
        }
    }
}
