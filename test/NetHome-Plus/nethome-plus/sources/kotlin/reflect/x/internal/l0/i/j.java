package kotlin.reflect.x.internal.l0.i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.p;
import kotlin.reflect.jvm.internal.impl.descriptors.q;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.i.e;
import kotlin.reflect.x.internal.l0.l.d1;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.g0;
import kotlin.reflect.x.internal.l0.l.t1.e;
import kotlin.reflect.x.internal.l0.l.t1.f;
import kotlin.reflect.x.internal.l0.l.t1.g;
import kotlin.u;

/* compiled from: OverridingUtil.java */
/* loaded from: classes2.dex */
public class j {
    private static final List<kotlin.reflect.x.internal.l0.i.e> a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f20836b;

    /* renamed from: c, reason: collision with root package name */
    private static final e.a f20837c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.l.t1.g f20838d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.l.t1.f f20839e;

    /* renamed from: f, reason: collision with root package name */
    private final e.a f20840f;

    /* renamed from: g, reason: collision with root package name */
    private final Function2<e0, e0, Boolean> f20841g;

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.f0.x.e.l0.l.t1.e.a
        public boolean a(e1 e1Var, e1 e1Var2) {
            if (e1Var == null) {
                b(0);
            }
            if (e1Var2 == null) {
                b(1);
            }
            return e1Var.equals(e1Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class b<D> implements Function2<D, D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/m<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair invoke(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            return new Pair(aVar, aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class c implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m f20842f;

        c(m mVar) {
            this.f20842f = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return Boolean.valueOf(bVar.b() == this.f20842f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class d implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.b invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class e implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e f20843f;

        e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            this.f20843f = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            boolean z = false;
            if (!t.g(bVar.getVisibility()) && t.h(bVar, this.f20843f, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class f implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class g implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, u> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.x.internal.l0.i.i f20844f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b f20845g;

        g(kotlin.reflect.x.internal.l0.i.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f20844f = iVar;
            this.f20845g = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f20844f.b(this.f20845g, bVar);
            return u.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class h {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20846b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f20847c;

        static {
            int[] iArr = new int[d0.values().length];
            f20847c = iArr;
            try {
                iArr[d0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20847c[d0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20847c[d0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20847c[d0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f20846b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20846b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20846b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[e.b.values().length];
            a = iArr3;
            try {
                iArr3[e.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[e.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class i {
        private static final i a = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: b, reason: collision with root package name */
        private final a f20848b;

        /* renamed from: c, reason: collision with root package name */
        private final String f20849c;

        /* compiled from: OverridingUtil.java */
        /* loaded from: classes2.dex */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f20848b = aVar;
            this.f20849c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = 2
                goto L1c
            L1b:
                r5 = 3
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.x.e.l0.i.j.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = a;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f20848b;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }
    }

    static {
        List<kotlin.reflect.x.internal.l0.i.e> y0;
        y0 = b0.y0(ServiceLoader.load(kotlin.reflect.x.internal.l0.i.e.class, kotlin.reflect.x.internal.l0.i.e.class.getClassLoader()));
        a = y0;
        a aVar = new a();
        f20837c = aVar;
        f20836b = new j(aVar, g.a.a, f.a.a, null);
    }

    private j(e.a aVar, kotlin.reflect.x.internal.l0.l.t1.g gVar, kotlin.reflect.x.internal.l0.l.t1.f fVar, Function2<e0, e0, Boolean> function2) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f20840f = aVar;
        this.f20838d = gVar;
        this.f20839e = fVar;
        this.f20841g = function2;
    }

    private static boolean A(s0 s0Var, s0 s0Var2) {
        if (s0Var == null || s0Var2 == null) {
            return true;
        }
        return H(s0Var, s0Var2);
    }

    public static boolean B(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar == null) {
            a(67);
        }
        if (aVar2 == null) {
            a(68);
        }
        e0 returnType = aVar.getReturnType();
        e0 returnType2 = aVar2.getReturnType();
        if (!H(aVar, aVar2)) {
            return false;
        }
        d1 l = f20836b.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof y) {
            return G(aVar, returnType, aVar2, returnType2, l);
        }
        if (aVar instanceof t0) {
            t0 t0Var = (t0) aVar;
            t0 t0Var2 = (t0) aVar2;
            if (!A(t0Var.getSetter(), t0Var2.getSetter())) {
                return false;
            }
            if (t0Var.j0() && t0Var2.j0()) {
                return kotlin.reflect.x.internal.l0.l.f.a.k(l, returnType.R0(), returnType2.R0());
            }
            return (t0Var.j0() || !t0Var2.j0()) && G(aVar, returnType, aVar2, returnType2, l);
        }
        throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
    }

    private static boolean C(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> collection) {
        if (aVar == null) {
            a(71);
        }
        if (collection == null) {
            a(72);
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a> it = collection.iterator();
        while (it.hasNext()) {
            if (!B(aVar, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, e0 e0Var, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, e0 e0Var2, d1 d1Var) {
        if (aVar == null) {
            a(73);
        }
        if (e0Var == null) {
            a(74);
        }
        if (aVar2 == null) {
            a(75);
        }
        if (e0Var2 == null) {
            a(76);
        }
        if (d1Var == null) {
            a(77);
        }
        return kotlin.reflect.x.internal.l0.l.f.a.r(d1Var, e0Var.R0(), e0Var2.R0());
    }

    private static boolean H(q qVar, q qVar2) {
        if (qVar == null) {
            a(69);
        }
        if (qVar2 == null) {
            a(70);
        }
        Integer d2 = t.d(qVar.getVisibility(), qVar2.getVisibility());
        return d2 == null || d2.intValue() >= 0;
    }

    public static boolean I(c0 c0Var, c0 c0Var2, boolean z) {
        if (c0Var == null) {
            a(57);
        }
        if (c0Var2 == null) {
            a(58);
        }
        return !t.g(c0Var2.getVisibility()) && t.h(c0Var2, c0Var, z);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean J(D d2, D d3, boolean z, boolean z2) {
        if (d2 == null) {
            a(13);
        }
        if (d3 == null) {
            a(14);
        }
        if (!d2.equals(d3) && kotlin.reflect.x.internal.l0.i.b.a.d(d2.a(), d3.a(), z, z2)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a2 = d3.a();
        Iterator it = kotlin.reflect.x.internal.l0.i.d.d(d2).iterator();
        while (it.hasNext()) {
            if (kotlin.reflect.x.internal.l0.i.b.a.d(a2, (kotlin.reflect.jvm.internal.impl.descriptors.a) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    public static void K(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, u> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar;
        if (bVar == null) {
            a(107);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : bVar.e()) {
            if (bVar2.getVisibility() == t.f21865g) {
                K(bVar2, function1);
            }
        }
        if (bVar.getVisibility() != t.f21865g) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.u h2 = h(bVar);
        if (h2 == null) {
            if (function1 != null) {
                function1.invoke(bVar);
            }
            uVar = t.f21863e;
        } else {
            uVar = h2;
        }
        if (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.p1.c0) {
            ((kotlin.reflect.jvm.internal.impl.descriptors.p1.c0) bVar).d1(uVar);
            Iterator<s0> it = ((t0) bVar).x().iterator();
            while (it.hasNext()) {
                K(it.next(), h2 == null ? null : function1);
            }
            return;
        }
        if (bVar instanceof p) {
            ((p) bVar).k1(uVar);
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.p1.b0 b0Var = (kotlin.reflect.jvm.internal.impl.descriptors.p1.b0) bVar;
        b0Var.P0(uVar);
        if (uVar != b0Var.B0().getVisibility()) {
            b0Var.N0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H L(Collection<H> collection, Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.a> function1) {
        List g0;
        if (collection == null) {
            a(78);
        }
        if (function1 == 0) {
            a(79);
        }
        if (collection.size() == 1) {
            H h2 = (H) r.Q(collection);
            if (h2 == null) {
                a(80);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        g0 = b0.g0(collection, function1);
        H h3 = (H) r.Q(collection);
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) function1.invoke(h3);
        for (H h4 : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) function1.invoke(h4);
            if (C(aVar2, g0)) {
                arrayList.add(h4);
            }
            if (B(aVar2, aVar) && !B(aVar, aVar2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                a(81);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) r.Q(arrayList);
            if (h5 == null) {
                a(82);
            }
            return h5;
        }
        H h6 = null;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!kotlin.reflect.x.internal.l0.l.b0.b(((kotlin.reflect.jvm.internal.impl.descriptors.a) function1.invoke(next)).getReturnType())) {
                h6 = next;
                break;
            }
        }
        if (h6 != null) {
            return h6;
        }
        H h7 = (H) r.Q(arrayList);
        if (h7 == null) {
            a(84);
        }
        return h7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x0265. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x0268. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x026b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0277 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.i.j.a(int):void");
    }

    private static boolean b(Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        boolean H;
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        H = b0.H(collection, new c(collection.iterator().next().b()));
        return H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e1 r4, kotlin.reflect.jvm.internal.impl.descriptors.e1 r5, kotlin.reflect.x.internal.l0.l.d1 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 49
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 50
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 51
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            kotlin.f0.x.e.l0.l.e0 r5 = (kotlin.reflect.x.internal.l0.l.e0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            kotlin.f0.x.e.l0.l.e0 r3 = (kotlin.reflect.x.internal.l0.l.e0) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.i.j.c(kotlin.reflect.jvm.internal.impl.descriptors.e1, kotlin.reflect.jvm.internal.impl.descriptors.e1, kotlin.f0.x.e.l0.l.d1):boolean");
    }

    private static boolean d(e0 e0Var, e0 e0Var2, d1 d1Var) {
        if (e0Var == null) {
            a(46);
        }
        if (e0Var2 == null) {
            a(47);
        }
        if (d1Var == null) {
            a(48);
        }
        if (g0.a(e0Var) && g0.a(e0Var2)) {
            return true;
        }
        return kotlin.reflect.x.internal.l0.l.f.a.k(d1Var, e0Var.R0(), e0Var2.R0());
    }

    private static i e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if ((aVar.m0() == null) != (aVar2.m0() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (aVar.h().size() != aVar2.h().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, Set<kotlin.reflect.jvm.internal.impl.descriptors.b> set) {
        if (bVar == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (bVar.i().d()) {
            set.add(bVar);
            return;
        }
        if (!bVar.e().isEmpty()) {
            Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = bVar.e().iterator();
            while (it.hasNext()) {
                f(it.next(), set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    private static List<e0> g(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        w0 m0 = aVar.m0();
        ArrayList arrayList = new ArrayList();
        if (m0 != null) {
            arrayList.add(m0.getType());
        }
        Iterator<i1> it = aVar.h().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.u h(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (bVar == null) {
            a(108);
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e2 = bVar.e();
        kotlin.reflect.jvm.internal.impl.descriptors.u u = u(e2);
        if (u == null) {
            return null;
        }
        if (bVar.i() == b.a.FAKE_OVERRIDE) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : e2) {
                if (bVar2.j() != d0.ABSTRACT && !bVar2.getVisibility().equals(u)) {
                    return null;
                }
            }
            return u;
        }
        return u.f();
    }

    public static j i(kotlin.reflect.x.internal.l0.l.t1.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new j(aVar, gVar, f.a.a, null);
    }

    private static void j(Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.x.internal.l0.i.i iVar) {
        if (collection == null) {
            a(85);
        }
        if (eVar == null) {
            a(86);
        }
        if (iVar == null) {
            a(87);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> t = t(eVar, collection);
        boolean isEmpty = t.isEmpty();
        if (!isEmpty) {
            collection = t;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.b k0 = ((kotlin.reflect.jvm.internal.impl.descriptors.b) L(collection, new d())).k0(eVar, n(collection, eVar), isEmpty ? t.f21866h : t.f21865g, b.a.FAKE_OVERRIDE, false);
        iVar.d(k0, collection);
        iVar.a(k0);
    }

    private static void k(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, kotlin.reflect.x.internal.l0.i.i iVar) {
        if (eVar == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (iVar == null) {
            a(66);
        }
        if (b(collection)) {
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton(it.next()), eVar, iVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(q(p.a(linkedList), linkedList, iVar), eVar, iVar);
            }
        }
    }

    private d1 l(List<kotlin.reflect.jvm.internal.impl.descriptors.e1> list, List<kotlin.reflect.jvm.internal.impl.descriptors.e1> list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            d1 H0 = new k(null, this.f20840f, this.f20838d, this.f20839e, this.f20841g).H0(true, true);
            if (H0 == null) {
                a(44);
            }
            return H0;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hashMap.put(list.get(i2).g(), list2.get(i2).g());
        }
        d1 H02 = new k(hashMap, this.f20840f, this.f20838d, this.f20839e, this.f20841g).H0(true, true);
        if (H02 == null) {
            a(45);
        }
        return H02;
    }

    public static j m(kotlin.reflect.x.internal.l0.l.t1.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new j(f20837c, gVar, f.a.a, null);
    }

    private static d0 n(Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (collection == null) {
            a(88);
        }
        if (eVar == null) {
            a(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
            int i2 = h.f20847c[bVar.j().ordinal()];
            if (i2 == 1) {
                d0 d0Var = d0.FINAL;
                if (d0Var == null) {
                    a(90);
                }
                return d0Var;
            }
            if (i2 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + bVar);
            }
            if (i2 == 3) {
                z2 = true;
            } else if (i2 == 4) {
                z3 = true;
            }
        }
        if (eVar.M() && eVar.j() != d0.ABSTRACT && eVar.j() != d0.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            d0 d0Var2 = d0.OPEN;
            if (d0Var2 == null) {
                a(91);
            }
            return d0Var2;
        }
        if (!z2 && z3) {
            d0 j2 = z ? eVar.j() : d0.ABSTRACT;
            if (j2 == null) {
                a(92);
            }
            return j2;
        }
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(z(it.next()));
        }
        return y(r(hashSet), z, eVar.j());
    }

    private Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> o(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.x.internal.l0.i.i iVar) {
        if (bVar == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (eVar == null) {
            a(61);
        }
        if (iVar == null) {
            a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        kotlin.reflect.jvm.internal.impl.utils.f a2 = kotlin.reflect.jvm.internal.impl.utils.f.a();
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
            i.a c2 = D(bVar2, bVar, eVar).c();
            boolean I = I(bVar, bVar2, false);
            int i2 = h.f20846b[c2.ordinal()];
            if (i2 == 1) {
                if (I) {
                    a2.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i2 == 2) {
                if (I) {
                    iVar.c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        iVar.d(bVar, a2);
        return arrayList;
    }

    public static <H> Collection<H> p(H h2, Collection<H> collection, Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.a> function1, Function1<H, u> function12) {
        if (h2 == null) {
            a(99);
        }
        if (collection == null) {
            a(100);
        }
        if (function1 == null) {
            a(101);
        }
        if (function12 == null) {
            a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h2);
        kotlin.reflect.jvm.internal.impl.descriptors.a invoke = function1.invoke(h2);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.a invoke2 = function1.invoke(next);
            if (h2 == next) {
                it.remove();
            } else {
                i.a x = x(invoke, invoke2);
                if (x == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x == i.a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    private static Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> q(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, Queue<kotlin.reflect.jvm.internal.impl.descriptors.b> queue, kotlin.reflect.x.internal.l0.i.i iVar) {
        if (bVar == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (iVar == null) {
            a(106);
        }
        return p(bVar, queue, new f(), new g(iVar, bVar));
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> r(Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && kotlin.reflect.x.internal.l0.i.t.a.q(kotlin.reflect.x.internal.l0.i.t.a.l(set.iterator().next())), null, new b());
    }

    public static <D> Set<D> s(Set<D> set, boolean z, Function0<?> function0, Function2<? super D, ? super D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> function2) {
        if (set == null) {
            a(9);
        }
        if (function2 == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> invoke = function2.invoke(obj, (Object) it.next());
                    kotlin.reflect.jvm.internal.impl.descriptors.a a2 = invoke.a();
                    kotlin.reflect.jvm.internal.impl.descriptors.a b2 = invoke.b();
                    if (J(a2, b2, z, true)) {
                        it.remove();
                    } else if (J(b2, a2, z, true)) {
                        break;
                    }
                } else {
                    linkedHashSet.add(obj);
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    private static Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> t(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        List N;
        if (eVar == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        N = b0.N(collection, new e(eVar));
        if (N == null) {
            a(98);
        }
        return N;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.u u(Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.u uVar;
        if (collection == null) {
            a(109);
        }
        if (collection.isEmpty()) {
            return t.l;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection.iterator();
        loop0: while (true) {
            uVar = null;
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.u visibility = it.next().getVisibility();
                if (uVar != null) {
                    Integer d2 = t.d(visibility, uVar);
                    if (d2 == null) {
                        break;
                    }
                    if (d2.intValue() > 0) {
                    }
                }
                uVar = visibility;
            }
        }
        if (uVar == null) {
            return null;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer d3 = t.d(uVar, it2.next().getVisibility());
            if (d3 == null || d3.intValue() < 0) {
                return null;
            }
        }
        return uVar;
    }

    public static i w(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        boolean z;
        if (aVar == null) {
            a(40);
        }
        if (aVar2 == null) {
            a(41);
        }
        boolean z2 = aVar instanceof y;
        if ((z2 && !(aVar2 instanceof y)) || (((z = aVar instanceof t0)) && !(aVar2 instanceof t0))) {
            return i.d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        }
        if (!aVar.getName().equals(aVar2.getName())) {
            return i.d("Name mismatch");
        }
        i e2 = e(aVar, aVar2);
        if (e2 != null) {
            return e2;
        }
        return null;
    }

    public static i.a x(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        j jVar = f20836b;
        i.a c2 = jVar.D(aVar2, aVar, null).c();
        i.a c3 = jVar.D(aVar, aVar2, null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (c2 == aVar3 && c3 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        return (c2 == aVar4 || c3 == aVar4) ? aVar4 : i.a.INCOMPATIBLE;
    }

    private static d0 y(Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection, boolean z, d0 d0Var) {
        if (collection == null) {
            a(93);
        }
        if (d0Var == null) {
            a(94);
        }
        d0 d0Var2 = d0.ABSTRACT;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : collection) {
            d0 j2 = (z && bVar.j() == d0.ABSTRACT) ? d0Var : bVar.j();
            if (j2.compareTo(d0Var2) < 0) {
                d0Var2 = j2;
            }
        }
        if (d0Var2 == null) {
            a(95);
        }
        return d0Var2;
    }

    public static Set<kotlin.reflect.jvm.internal.impl.descriptors.b> z(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (bVar == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    public i D(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        i E = E(aVar, aVar2, eVar, false);
        if (E == null) {
            a(21);
        }
        return E;
    }

    public i E(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        i F = F(aVar, aVar2, z);
        boolean z2 = F.c() == i.a.OVERRIDABLE;
        for (kotlin.reflect.x.internal.l0.i.e eVar2 : a) {
            if (eVar2.a() != e.a.CONFLICTS_ONLY && (!z2 || eVar2.a() != e.a.SUCCESS_ONLY)) {
                int i2 = h.a[eVar2.b(aVar, aVar2, eVar).ordinal()];
                if (i2 == 1) {
                    z2 = true;
                } else {
                    if (i2 == 2) {
                        i b2 = i.b("External condition failed");
                        if (b2 == null) {
                            a(24);
                        }
                        return b2;
                    }
                    if (i2 == 3) {
                        i d2 = i.d("External condition");
                        if (d2 == null) {
                            a(25);
                        }
                        return d2;
                    }
                }
            }
        }
        if (!z2) {
            return F;
        }
        for (kotlin.reflect.x.internal.l0.i.e eVar3 : a) {
            if (eVar3.a() == e.a.CONFLICTS_ONLY) {
                int i3 = h.a[eVar3.b(aVar, aVar2, eVar).ordinal()];
                if (i3 == 1) {
                    throw new IllegalStateException("Contract violation in " + eVar3.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i3 == 2) {
                    i b3 = i.b("External condition failed");
                    if (b3 == null) {
                        a(27);
                    }
                    return b3;
                }
                if (i3 == 3) {
                    i d3 = i.d("External condition");
                    if (d3 == null) {
                        a(28);
                    }
                    return d3;
                }
            }
        }
        i e2 = i.e();
        if (e2 == null) {
            a(29);
        }
        return e2;
    }

    public i F(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z) {
        if (aVar == null) {
            a(30);
        }
        if (aVar2 == null) {
            a(31);
        }
        i w = w(aVar, aVar2);
        if (w != null) {
            return w;
        }
        List<e0> g2 = g(aVar);
        List<e0> g3 = g(aVar2);
        List<kotlin.reflect.jvm.internal.impl.descriptors.e1> typeParameters = aVar.getTypeParameters();
        List<kotlin.reflect.jvm.internal.impl.descriptors.e1> typeParameters2 = aVar2.getTypeParameters();
        int i2 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i2 < g2.size()) {
                if (!kotlin.reflect.x.internal.l0.l.t1.e.a.b(g2.get(i2), g3.get(i2))) {
                    i d2 = i.d("Type parameter number mismatch");
                    if (d2 == null) {
                        a(33);
                    }
                    return d2;
                }
                i2++;
            }
            i b2 = i.b("Type parameter number mismatch");
            if (b2 == null) {
                a(34);
            }
            return b2;
        }
        d1 l = l(typeParameters, typeParameters2);
        for (int i3 = 0; i3 < typeParameters.size(); i3++) {
            if (!c(typeParameters.get(i3), typeParameters2.get(i3), l)) {
                i d3 = i.d("Type parameter bounds mismatch");
                if (d3 == null) {
                    a(35);
                }
                return d3;
            }
        }
        for (int i4 = 0; i4 < g2.size(); i4++) {
            if (!d(g2.get(i4), g3.get(i4), l)) {
                i d4 = i.d("Value parameter type mismatch");
                if (d4 == null) {
                    a(36);
                }
                return d4;
            }
        }
        if ((aVar instanceof y) && (aVar2 instanceof y) && ((y) aVar).isSuspend() != ((y) aVar2).isSuspend()) {
            i b3 = i.b("Incompatible suspendability");
            if (b3 == null) {
                a(37);
            }
            return b3;
        }
        if (z) {
            e0 returnType = aVar.getReturnType();
            e0 returnType2 = aVar2.getReturnType();
            if (returnType != null && returnType2 != null) {
                if (g0.a(returnType2) && g0.a(returnType)) {
                    i2 = 1;
                }
                if (i2 == 0 && !kotlin.reflect.x.internal.l0.l.f.a.r(l, returnType2.R0(), returnType.R0())) {
                    i b4 = i.b("Return type mismatch");
                    if (b4 == null) {
                        a(38);
                    }
                    return b4;
                }
            }
        }
        i e2 = i.e();
        if (e2 == null) {
            a(39);
        }
        return e2;
    }

    public void v(kotlin.reflect.x.internal.l0.f.f fVar, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection2, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.x.internal.l0.i.i iVar) {
        if (fVar == null) {
            a(52);
        }
        if (collection == null) {
            a(53);
        }
        if (collection2 == null) {
            a(54);
        }
        if (eVar == null) {
            a(55);
        }
        if (iVar == null) {
            a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o(it.next(), collection, eVar, iVar));
        }
        k(eVar, linkedHashSet, iVar);
    }
}
