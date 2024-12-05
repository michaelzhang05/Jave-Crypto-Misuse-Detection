package w3;

import L5.I;
import M5.AbstractC1246t;
import com.stripe.android.paymentsheet.u;
import e4.AbstractC2608f0;
import e4.C2597a;
import e4.G0;
import e4.N;
import e4.P0;
import e4.Y;
import e4.u0;
import e4.w0;
import e4.y0;
import e4.z0;
import g6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m4.C3410b;
import m4.C3430u;
import m4.C3434y;
import m4.G;
import m4.Q;
import m4.S;
import m4.h0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f39047a = new f();

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39048a;

        static {
            int[] iArr = new int[z0.d.values().length];
            try {
                iArr[z0.d.f30904f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z0.d.f30900b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z0.d.f30901c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z0.d.f30902d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[z0.d.f30903e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[z0.d.f30905g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f39048a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    static final class b implements InterfaceC3359g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f39049a;

        b(S s8) {
            this.f39049a = s8;
        }

        @Override // l6.InterfaceC3359g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, P5.d dVar) {
            String str2;
            S s8;
            Q i8;
            C3434y y8;
            Q i9;
            S s9 = this.f39049a;
            if (s9 != null && (i9 = s9.i()) != null) {
                str2 = i9.B();
            } else {
                str2 = null;
            }
            if ((str2 == null || n.u(str2)) && (s8 = this.f39049a) != null && (i8 = s8.i()) != null && (y8 = i8.y()) != null) {
                y8.r(str);
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f39050a = new c();

        c() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(AbstractC2608f0 abstractC2608f0, AbstractC2608f0 abstractC2608f02) {
            int i8;
            if (!(abstractC2608f0 instanceof u0) && !(abstractC2608f0 instanceof N)) {
                if (!(abstractC2608f02 instanceof u0) && !(abstractC2608f02 instanceof N)) {
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
    public static final int e(X5.n tmp0, Object obj, Object obj2) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final Object b(List list, P5.d dVar) {
        C3434y i8;
        InterfaceC3349K y8;
        InterfaceC3358f t8;
        C3430u c3430u;
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
            AbstractC1246t.D(arrayList2, ((h0) it.next()).g());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof S) {
                arrayList3.add(obj2);
            }
        }
        S s8 = (S) AbstractC1246t.o0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof h0) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            AbstractC1246t.D(arrayList5, ((h0) it2.next()).g());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            if (obj4 instanceof C3430u) {
                arrayList6.add(obj4);
            }
        }
        C3430u c3430u2 = (C3430u) AbstractC1246t.o0(arrayList6);
        if (c3430u2 == null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj5 : list2) {
                if (obj5 instanceof h0) {
                    arrayList7.add(obj5);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                AbstractC1246t.D(arrayList8, ((h0) it3.next()).g());
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : arrayList8) {
                if (obj6 instanceof C3410b) {
                    arrayList9.add(obj6);
                }
            }
            C3410b c3410b = (C3410b) AbstractC1246t.o0(arrayList9);
            if (c3410b != null) {
                c3430u = c3410b.t();
            } else {
                c3430u = null;
            }
            c3430u2 = c3430u;
        }
        if (c3430u2 != null && (i8 = c3430u2.i()) != null && (y8 = i8.y()) != null && (t8 = AbstractC3360h.t(y8)) != null) {
            Object collect = t8.collect(new b(s8), dVar);
            if (collect == Q5.b.e()) {
                return collect;
            }
            return I.f6487a;
        }
        return I.f6487a;
    }

    public final void c(List placeholderFields, AbstractC2608f0 spec) {
        AbstractC3159y.i(placeholderFields, "placeholderFields");
        AbstractC3159y.i(spec, "spec");
        if (spec instanceof w0) {
            placeholderFields.remove(z0.d.f30900b);
            return;
        }
        if (spec instanceof Y) {
            placeholderFields.remove(z0.d.f30901c);
            return;
        }
        if (spec instanceof y0) {
            placeholderFields.remove(z0.d.f30902d);
            return;
        }
        if (spec instanceof C2597a) {
            placeholderFields.remove(z0.d.f30903e);
            return;
        }
        if (spec instanceof G0) {
            placeholderFields.remove(z0.d.f30905g);
            return;
        }
        if (spec instanceof z0) {
            z0 z0Var = (z0) spec;
            if (a.f39048a[z0Var.j().ordinal()] == 1) {
                placeholderFields.remove(z0.d.f30903e);
            } else {
                placeholderFields.remove(z0Var.j());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC2608f0 d(z0.d field, List placeholderOverrideList, boolean z8, u.d configuration) {
        C2597a c2597a;
        AbstractC3159y.i(field, "field");
        AbstractC3159y.i(placeholderOverrideList, "placeholderOverrideList");
        AbstractC3159y.i(configuration, "configuration");
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
        switch (a.f39048a[field.ordinal()]) {
            case 1:
                C2597a c2597a2 = new C2597a(null, null, null, false, null, true, 31, null);
                c2597a = c2597a2;
                if (configuration.b() != u.d.a.f26393c) {
                    if (!placeholderOverrideList.contains(c2597a2.k())) {
                        return null;
                    }
                    c2597a = c2597a2;
                    if (configuration.b() == u.d.a.f26392b) {
                        return null;
                    }
                }
                break;
            case 2:
                w0 w0Var = new w0((G) (z11 ? 1 : 0), (P0) (z10 ? 1 : 0), i9, (AbstractC3151p) (z9 ? 1 : 0));
                c2597a = w0Var;
                if (configuration.n() != u.d.b.f26398c) {
                    if (!placeholderOverrideList.contains(w0Var.i())) {
                        return null;
                    }
                    c2597a = w0Var;
                    if (configuration.n() == u.d.b.f26397b) {
                        return null;
                    }
                }
                break;
            case 3:
                Y y8 = new Y((G) (z13 ? 1 : 0), i8, (AbstractC3151p) (z12 ? 1 : 0));
                c2597a = y8;
                if (configuration.k() != u.d.b.f26398c) {
                    if (!placeholderOverrideList.contains(y8.f())) {
                        return null;
                    }
                    c2597a = y8;
                    if (configuration.k() == u.d.b.f26397b) {
                        return null;
                    }
                }
                break;
            case 4:
                y0 y0Var = new y0((G) (z15 ? 1 : 0), i8, (AbstractC3151p) (z14 ? 1 : 0));
                c2597a = y0Var;
                if (configuration.o() != u.d.b.f26398c) {
                    if (!placeholderOverrideList.contains(y0Var.f())) {
                        return null;
                    }
                    c2597a = y0Var;
                    if (configuration.o() == u.d.b.f26397b) {
                        return null;
                    }
                }
                break;
            case 5:
                C2597a c2597a3 = new C2597a(null, null, null, false, null, false, 63, null);
                c2597a = c2597a3;
                if (configuration.b() != u.d.a.f26393c) {
                    if (!placeholderOverrideList.contains(c2597a3.k())) {
                        return null;
                    }
                    c2597a = c2597a3;
                    if (configuration.b() == u.d.a.f26392b) {
                        return null;
                    }
                }
                break;
            case 6:
                G0 g02 = new G0(g8, 0, i9, (AbstractC3151p) (z16 ? 1 : 0));
                if (!z8) {
                    return null;
                }
                return g02;
            default:
                return null;
        }
        return c2597a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r10.k() == com.stripe.android.paymentsheet.u.d.b.f26397b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r10.o() == com.stripe.android.paymentsheet.u.d.b.f26397b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r10.b() == com.stripe.android.paymentsheet.u.d.a.f26392b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        if (r10.n() == com.stripe.android.paymentsheet.u.d.b.f26397b) goto L9;
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
            kotlin.jvm.internal.AbstractC3159y.i(r7, r0)
            java.lang.String r0 = "placeholderOverrideList"
            kotlin.jvm.internal.AbstractC3159y.i(r8, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.AbstractC3159y.i(r10, r0)
            r0 = 4
            e4.z0$d[] r0 = new e4.z0.d[r0]
            e4.z0$d r1 = e4.z0.d.f30900b
            r2 = 0
            r0[r2] = r1
            e4.z0$d r1 = e4.z0.d.f30901c
            r2 = 1
            r0[r2] = r1
            e4.z0$d r1 = e4.z0.d.f30902d
            r2 = 2
            r0[r2] = r1
            e4.z0$d r1 = e4.z0.d.f30903e
            r2 = 3
            r0[r2] = r1
            java.util.List r0 = M5.AbstractC1246t.s(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L35:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r7.next()
            e4.f0 r2 = (e4.AbstractC2608f0) r2
            w3.f r3 = w3.f.f39047a
            r3.c(r0, r2)
            boolean r4 = r2 instanceof e4.w0
            r5 = 0
            if (r4 == 0) goto L55
            com.stripe.android.paymentsheet.u$d$b r3 = r10.n()
            com.stripe.android.paymentsheet.u$d$b r4 = com.stripe.android.paymentsheet.u.d.b.f26397b
            if (r3 != r4) goto L8a
        L53:
            r2 = r5
            goto L8a
        L55:
            boolean r4 = r2 instanceof e4.Y
            if (r4 == 0) goto L62
            com.stripe.android.paymentsheet.u$d$b r3 = r10.k()
            com.stripe.android.paymentsheet.u$d$b r4 = com.stripe.android.paymentsheet.u.d.b.f26397b
            if (r3 != r4) goto L8a
            goto L53
        L62:
            boolean r4 = r2 instanceof e4.y0
            if (r4 == 0) goto L6f
            com.stripe.android.paymentsheet.u$d$b r3 = r10.o()
            com.stripe.android.paymentsheet.u$d$b r4 = com.stripe.android.paymentsheet.u.d.b.f26397b
            if (r3 != r4) goto L8a
            goto L53
        L6f:
            boolean r4 = r2 instanceof e4.C2597a
            if (r4 == 0) goto L7c
            com.stripe.android.paymentsheet.u$d$a r3 = r10.b()
            com.stripe.android.paymentsheet.u$d$a r4 = com.stripe.android.paymentsheet.u.d.a.f26392b
            if (r3 != r4) goto L8a
            goto L53
        L7c:
            boolean r4 = r2 instanceof e4.z0
            if (r4 == 0) goto L8a
            e4.z0 r2 = (e4.z0) r2
            e4.z0$d r2 = r2.j()
            e4.f0 r2 = r3.d(r2, r8, r9, r10)
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
            e4.z0$d r2 = (e4.z0.d) r2
            w3.f r3 = w3.f.f39047a
            e4.f0 r2 = r3.d(r2, r8, r9, r10)
            if (r2 == 0) goto L9b
            r7.add(r2)
            goto L9b
        Lb3:
            java.util.List r7 = M5.AbstractC1246t.G0(r1, r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            w3.f$c r8 = w3.f.c.f39050a
            w3.e r9 = new w3.e
            r9.<init>()
            java.util.List r7 = M5.AbstractC1246t.P0(r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.f.f(java.util.List, java.util.List, boolean, com.stripe.android.paymentsheet.u$d):java.util.List");
    }
}
