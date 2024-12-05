package z3;

import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import com.stripe.android.paymentsheet.u;
import h4.AbstractC2928f0;
import h4.C2917a;
import h4.G0;
import h4.N;
import h4.P0;
import h4.Y;
import h4.u0;
import h4.w0;
import h4.y0;
import h4.z0;
import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import p4.C3753b;
import p4.C3773u;
import p4.C3777y;
import p4.G;
import p4.Q;
import p4.S;
import p4.h0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f41170a = new f();

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41171a;

        static {
            int[] iArr = new int[z0.d.values().length];
            try {
                iArr[z0.d.f32825f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z0.d.f32821b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z0.d.f32822c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z0.d.f32823d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[z0.d.f32824e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[z0.d.f32826g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f41171a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class b implements InterfaceC3707g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f41172a;

        b(S s8) {
            this.f41172a = s8;
        }

        @Override // o6.InterfaceC3707g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, S5.d dVar) {
            String str2;
            S s8;
            Q i8;
            C3777y y8;
            Q i9;
            S s9 = this.f41172a;
            if (s9 != null && (i9 = s9.i()) != null) {
                str2 = i9.B();
            } else {
                str2 = null;
            }
            if ((str2 == null || n.u(str2)) && (s8 = this.f41172a) != null && (i8 = s8.i()) != null && (y8 = i8.y()) != null) {
                y8.r(str);
            }
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f41173a = new c();

        c() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(AbstractC2928f0 abstractC2928f0, AbstractC2928f0 abstractC2928f02) {
            int i8;
            if (!(abstractC2928f0 instanceof u0) && !(abstractC2928f0 instanceof N)) {
                if (!(abstractC2928f02 instanceof u0) && !(abstractC2928f02 instanceof N)) {
                    i8 = 0;
                } else {
                    i8 = -1;
                }
            } else {
                i8 = 1;
            }
            return Integer.valueOf(i8);
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(InterfaceC1668n tmp0, Object obj, Object obj2) {
        AbstractC3255y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final Object b(List list, S5.d dVar) {
        C3777y i8;
        InterfaceC3698L y8;
        InterfaceC3706f v8;
        C3773u c3773u;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof h0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1378t.D(arrayList2, ((h0) it.next()).g());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof S) {
                arrayList3.add(obj2);
            }
        }
        S s8 = (S) AbstractC1378t.o0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof h0) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            AbstractC1378t.D(arrayList5, ((h0) it2.next()).g());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            if (obj4 instanceof C3773u) {
                arrayList6.add(obj4);
            }
        }
        C3773u c3773u2 = (C3773u) AbstractC1378t.o0(arrayList6);
        if (c3773u2 == null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : list2) {
                if (obj5 instanceof h0) {
                    arrayList7.add(obj5);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                AbstractC1378t.D(arrayList8, ((h0) it3.next()).g());
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : arrayList8) {
                if (obj6 instanceof C3753b) {
                    arrayList9.add(obj6);
                }
            }
            C3753b c3753b = (C3753b) AbstractC1378t.o0(arrayList9);
            if (c3753b != null) {
                c3773u = c3753b.t();
            } else {
                c3773u = null;
            }
            c3773u2 = c3773u;
        }
        if (c3773u2 != null && (i8 = c3773u2.i()) != null && (y8 = i8.y()) != null && (v8 = AbstractC3708h.v(y8)) != null) {
            Object collect = v8.collect(new b(s8), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return I.f8278a;
        }
        return I.f8278a;
    }

    public final void c(List placeholderFields, AbstractC2928f0 spec) {
        AbstractC3255y.i(placeholderFields, "placeholderFields");
        AbstractC3255y.i(spec, "spec");
        if (spec instanceof w0) {
            placeholderFields.remove(z0.d.f32821b);
            return;
        }
        if (spec instanceof Y) {
            placeholderFields.remove(z0.d.f32822c);
            return;
        }
        if (spec instanceof y0) {
            placeholderFields.remove(z0.d.f32823d);
            return;
        }
        if (spec instanceof C2917a) {
            placeholderFields.remove(z0.d.f32824e);
            return;
        }
        if (spec instanceof G0) {
            placeholderFields.remove(z0.d.f32826g);
            return;
        }
        if (spec instanceof z0) {
            z0 z0Var = (z0) spec;
            if (a.f41171a[z0Var.l().ordinal()] == 1) {
                placeholderFields.remove(z0.d.f32824e);
            } else {
                placeholderFields.remove(z0Var.l());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC2928f0 d(z0.d field, List placeholderOverrideList, boolean z8, u.d configuration) {
        C2917a c2917a;
        AbstractC3255y.i(field, "field");
        AbstractC3255y.i(placeholderOverrideList, "placeholderOverrideList");
        AbstractC3255y.i(configuration, "configuration");
        int i8 = 1;
        int i9 = 3;
        G g8 = null;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        switch (a.f41171a[field.ordinal()]) {
            case 1:
                C2917a c2917a2 = new C2917a(null, null, null, false, null, true, 31, null);
                c2917a = c2917a2;
                if (configuration.a() != u.d.a.f27448c) {
                    if (!placeholderOverrideList.contains(c2917a2.p())) {
                        return null;
                    }
                    c2917a = c2917a2;
                    if (configuration.a() == u.d.a.f27447b) {
                        return null;
                    }
                }
                break;
            case 2:
                w0 w0Var = new w0((G) (z11 ? 1 : 0), (P0) (z10 ? 1 : 0), i9, (AbstractC3247p) (z9 ? 1 : 0));
                c2917a = w0Var;
                if (configuration.s() != u.d.b.f27453c) {
                    if (!placeholderOverrideList.contains(w0Var.i())) {
                        return null;
                    }
                    c2917a = w0Var;
                    if (configuration.s() == u.d.b.f27452b) {
                        return null;
                    }
                }
                break;
            case 3:
                Y y8 = new Y((G) (z13 ? 1 : 0), i8, (AbstractC3247p) (z12 ? 1 : 0));
                c2917a = y8;
                if (configuration.p() != u.d.b.f27453c) {
                    if (!placeholderOverrideList.contains(y8.h())) {
                        return null;
                    }
                    c2917a = y8;
                    if (configuration.p() == u.d.b.f27452b) {
                        return null;
                    }
                }
                break;
            case 4:
                y0 y0Var = new y0((G) (z15 ? 1 : 0), i8, (AbstractC3247p) (z14 ? 1 : 0));
                c2917a = y0Var;
                if (configuration.u() != u.d.b.f27453c) {
                    if (!placeholderOverrideList.contains(y0Var.h())) {
                        return null;
                    }
                    c2917a = y0Var;
                    if (configuration.u() == u.d.b.f27452b) {
                        return null;
                    }
                }
                break;
            case 5:
                C2917a c2917a3 = new C2917a(null, null, null, false, null, false, 63, null);
                c2917a = c2917a3;
                if (configuration.a() != u.d.a.f27448c) {
                    if (!placeholderOverrideList.contains(c2917a3.p())) {
                        return null;
                    }
                    c2917a = c2917a3;
                    if (configuration.a() == u.d.a.f27447b) {
                        return null;
                    }
                }
                break;
            case 6:
                G0 g02 = new G0(g8, 0, i9, (AbstractC3247p) (z16 ? 1 : 0));
                if (!z8) {
                    return null;
                }
                return g02;
            default:
                return null;
        }
        return c2917a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r10.p() == com.stripe.android.paymentsheet.u.d.b.f27452b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r10.u() == com.stripe.android.paymentsheet.u.d.b.f27452b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r10.a() == com.stripe.android.paymentsheet.u.d.a.f27447b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        if (r10.s() == com.stripe.android.paymentsheet.u.d.b.f27452b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(java.util.List r7, java.util.List r8, boolean r9, com.stripe.android.paymentsheet.u.d r10) {
        /*
            r6 = this;
            java.lang.String r0 = "specs"
            kotlin.jvm.internal.AbstractC3255y.i(r7, r0)
            java.lang.String r0 = "placeholderOverrideList"
            kotlin.jvm.internal.AbstractC3255y.i(r8, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.AbstractC3255y.i(r10, r0)
            r0 = 4
            h4.z0$d[] r0 = new h4.z0.d[r0]
            h4.z0$d r1 = h4.z0.d.f32821b
            r2 = 0
            r0[r2] = r1
            h4.z0$d r1 = h4.z0.d.f32822c
            r2 = 1
            r0[r2] = r1
            h4.z0$d r1 = h4.z0.d.f32823d
            r2 = 2
            r0[r2] = r1
            h4.z0$d r1 = h4.z0.d.f32824e
            r2 = 3
            r0[r2] = r1
            java.util.List r0 = P5.AbstractC1378t.s(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L35:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r7.next()
            h4.f0 r2 = (h4.AbstractC2928f0) r2
            z3.f r3 = z3.f.f41170a
            r3.c(r0, r2)
            boolean r4 = r2 instanceof h4.w0
            r5 = 0
            if (r4 == 0) goto L55
            com.stripe.android.paymentsheet.u$d$b r3 = r10.s()
            com.stripe.android.paymentsheet.u$d$b r4 = com.stripe.android.paymentsheet.u.d.b.f27452b
            if (r3 != r4) goto L8a
        L53:
            r2 = r5
            goto L8a
        L55:
            boolean r4 = r2 instanceof h4.Y
            if (r4 == 0) goto L62
            com.stripe.android.paymentsheet.u$d$b r3 = r10.p()
            com.stripe.android.paymentsheet.u$d$b r4 = com.stripe.android.paymentsheet.u.d.b.f27452b
            if (r3 != r4) goto L8a
            goto L53
        L62:
            boolean r4 = r2 instanceof h4.y0
            if (r4 == 0) goto L6f
            com.stripe.android.paymentsheet.u$d$b r3 = r10.u()
            com.stripe.android.paymentsheet.u$d$b r4 = com.stripe.android.paymentsheet.u.d.b.f27452b
            if (r3 != r4) goto L8a
            goto L53
        L6f:
            boolean r4 = r2 instanceof h4.C2917a
            if (r4 == 0) goto L7c
            com.stripe.android.paymentsheet.u$d$a r3 = r10.a()
            com.stripe.android.paymentsheet.u$d$a r4 = com.stripe.android.paymentsheet.u.d.a.f27447b
            if (r3 != r4) goto L8a
            goto L53
        L7c:
            boolean r4 = r2 instanceof h4.z0
            if (r4 == 0) goto L8a
            h4.z0 r2 = (h4.z0) r2
            h4.z0$d r2 = r2.l()
            h4.f0 r2 = r3.d(r2, r8, r9, r10)
        L8a:
            if (r2 == 0) goto L35
            r1.add(r2)
            goto L35
        L90:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L9b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r0.next()
            h4.z0$d r2 = (h4.z0.d) r2
            z3.f r3 = z3.f.f41170a
            h4.f0 r2 = r3.d(r2, r8, r9, r10)
            if (r2 == 0) goto L9b
            r7.add(r2)
            goto L9b
        Lb3:
            java.util.List r7 = P5.AbstractC1378t.G0(r1, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            z3.f$c r8 = z3.f.c.f41173a
            z3.e r9 = new z3.e
            r9.<init>()
            java.util.List r7 = P5.AbstractC1378t.P0(r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.f.f(java.util.List, java.util.List, boolean, com.stripe.android.paymentsheet.u$d):java.util.List");
    }
}
