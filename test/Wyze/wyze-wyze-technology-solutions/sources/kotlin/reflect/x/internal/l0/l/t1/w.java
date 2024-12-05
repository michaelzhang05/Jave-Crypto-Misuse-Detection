package kotlin.reflect.x.internal.l0.l.t1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.x.internal.l0.i.r.n;
import kotlin.reflect.x.internal.l0.l.a1;
import kotlin.reflect.x.internal.l0.l.d0;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import kotlin.reflect.x.internal.l0.l.p;
import kotlin.reflect.x.internal.l0.l.q0;
import kotlin.reflect.x.internal.l0.l.q1;
import kotlin.reflect.x.internal.l0.l.u0;

/* compiled from: IntersectionType.kt */
/* loaded from: classes2.dex */
public final class w {
    public static final w a = new w();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final a f21317f = new c("START", 0);

        /* renamed from: g, reason: collision with root package name */
        public static final a f21318g = new C0357a("ACCEPT_NULL", 1);

        /* renamed from: h, reason: collision with root package name */
        public static final a f21319h = new d("UNKNOWN", 2);

        /* renamed from: i, reason: collision with root package name */
        public static final a f21320i = new b("NOT_NULL", 3);

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ a[] f21321j = d();

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.f0.x.e.l0.l.t1.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0357a extends a {
            C0357a(String str, int i2) {
                super(str, i2, null);
            }

            @Override // kotlin.f0.x.e.l0.l.t1.w.a
            public a f(q1 q1Var) {
                l.f(q1Var, "nextType");
                return i(q1Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes2.dex */
        static final class b extends a {
            b(String str, int i2) {
                super(str, i2, null);
            }

            @Override // kotlin.f0.x.e.l0.l.t1.w.a
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public b f(q1 q1Var) {
                l.f(q1Var, "nextType");
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes2.dex */
        static final class c extends a {
            c(String str, int i2) {
                super(str, i2, null);
            }

            @Override // kotlin.f0.x.e.l0.l.t1.w.a
            public a f(q1 q1Var) {
                l.f(q1Var, "nextType");
                return i(q1Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* loaded from: classes2.dex */
        static final class d extends a {
            d(String str, int i2) {
                super(str, i2, null);
            }

            @Override // kotlin.f0.x.e.l0.l.t1.w.a
            public a f(q1 q1Var) {
                l.f(q1Var, "nextType");
                a i2 = i(q1Var);
                return i2 == a.f21318g ? this : i2;
            }
        }

        private a(String str, int i2) {
        }

        public /* synthetic */ a(String str, int i2, g gVar) {
            this(str, i2);
        }

        private static final /* synthetic */ a[] d() {
            return new a[]{f21317f, f21318g, f21319h, f21320i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f21321j.clone();
        }

        public abstract a f(q1 q1Var);

        protected final a i(q1 q1Var) {
            l.f(q1Var, "<this>");
            return q1Var.P0() ? f21318g : ((q1Var instanceof p) && (((p) q1Var).a1() instanceof u0)) ? f21320i : q1Var instanceof u0 ? f21319h : o.a.a(q1Var) ? f21320i : f21319h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionType.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function0<String> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Set<m0> f21322f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Set<? extends m0> set) {
            super(0);
            this.f21322f = set;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String b0;
            StringBuilder sb = new StringBuilder();
            sb.append("This collections cannot be empty! input types: ");
            b0 = b0.b0(this.f21322f, null, null, null, 0, null, null, 63, null);
            sb.append(b0);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionType.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends i implements Function2<e0, e0, Boolean> {
        c(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "isStrictSupertype";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.b0.b(w.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e0 e0Var, e0 e0Var2) {
            l.f(e0Var, "p0");
            l.f(e0Var2, "p1");
            return Boolean.valueOf(((w) this.receiver).e(e0Var, e0Var2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntersectionType.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends i implements Function2<e0, e0, Boolean> {
        d(Object obj) {
            super(2, obj);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "equalTypes";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.b0.b(m.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e0 e0Var, e0 e0Var2) {
            l.f(e0Var, "p0");
            l.f(e0Var2, "p1");
            return Boolean.valueOf(((m) this.receiver).b(e0Var, e0Var2));
        }
    }

    private w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[EDGE_INSN: B:23:0x0051->B:7:0x0051 BREAK  A[LOOP:1: B:14:0x0028->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:1: B:14:0x0028->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Collection<kotlin.reflect.x.internal.l0.l.m0> b(java.util.Collection<? extends kotlin.reflect.x.internal.l0.l.m0> r8, kotlin.jvm.functions.Function2<? super kotlin.reflect.x.internal.l0.l.m0, ? super kotlin.reflect.x.internal.l0.l.m0, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.l.e(r8, r1)
        Le:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r8.next()
            kotlin.f0.x.e.l0.l.m0 r1 = (kotlin.reflect.x.internal.l0.l.m0) r1
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L24
        L22:
            r3 = 0
            goto L51
        L24:
            java.util.Iterator r2 = r0.iterator()
        L28:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r2.next()
            kotlin.f0.x.e.l0.l.m0 r5 = (kotlin.reflect.x.internal.l0.l.m0) r5
            if (r5 == r1) goto L4e
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.l.e(r5, r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.l.e(r1, r6)
            java.lang.Object r5 = r9.invoke(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            r5 = 1
            goto L4f
        L4e:
            r5 = 0
        L4f:
            if (r5 == 0) goto L28
        L51:
            if (r3 == 0) goto Le
            r8.remove()
            goto Le
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.t1.w.b(java.util.Collection, kotlin.a0.c.p):java.util.Collection");
    }

    private final m0 d(Set<? extends m0> set) {
        if (set.size() == 1) {
            return (m0) r.m0(set);
        }
        new b(set);
        Collection<m0> b2 = b(set, new c(this));
        b2.isEmpty();
        m0 b3 = n.a.b(b2);
        if (b3 != null) {
            return b3;
        }
        Collection<m0> b4 = b(b2, new d(l.f21311b.a()));
        b4.isEmpty();
        return b4.size() < 2 ? (m0) r.m0(b4) : new d0(set).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(e0 e0Var, e0 e0Var2) {
        m a2 = l.f21311b.a();
        return a2.d(e0Var, e0Var2) && !a2.d(e0Var2, e0Var);
    }

    public final m0 c(List<? extends m0> list) {
        int t;
        int t2;
        l.f(list, "types");
        list.size();
        ArrayList<m0> arrayList = new ArrayList();
        for (m0 m0Var : list) {
            if (m0Var.O0() instanceof d0) {
                Collection<e0> a2 = m0Var.O0().a();
                l.e(a2, "type.constructor.supertypes");
                t2 = u.t(a2, 10);
                ArrayList arrayList2 = new ArrayList(t2);
                for (e0 e0Var : a2) {
                    l.e(e0Var, "it");
                    m0 d2 = kotlin.reflect.x.internal.l0.l.b0.d(e0Var);
                    if (m0Var.P0()) {
                        d2 = d2.S0(true);
                    }
                    arrayList2.add(d2);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(m0Var);
            }
        }
        a aVar = a.f21317f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar = aVar.f((q1) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (m0 m0Var2 : arrayList) {
            if (aVar == a.f21320i) {
                if (m0Var2 instanceof i) {
                    m0Var2 = q0.k((i) m0Var2);
                }
                m0Var2 = q0.i(m0Var2, false, 1, null);
            }
            linkedHashSet.add(m0Var2);
        }
        t = u.t(list, 10);
        ArrayList arrayList3 = new ArrayList(t);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((m0) it2.next()).N0());
        }
        Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            while (it3.hasNext()) {
                next = ((a1) next).D((a1) it3.next());
            }
            return d(linkedHashSet).U0((a1) next);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
