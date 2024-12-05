package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class n {
    private static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final p f1179b;

    /* renamed from: c, reason: collision with root package name */
    private static final p f1180c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1181f;

        a(ArrayList arrayList) {
            this.f1181f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.A(this.f1181f, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f1182f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f1183g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ View f1184h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Fragment f1185i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f1186j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ArrayList f1187k;
        final /* synthetic */ ArrayList l;
        final /* synthetic */ Object m;

        b(Object obj, p pVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1182f = obj;
            this.f1183g = pVar;
            this.f1184h = view;
            this.f1185i = fragment;
            this.f1186j = arrayList;
            this.f1187k = arrayList2;
            this.l = arrayList3;
            this.m = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f1182f;
            if (obj != null) {
                this.f1183g.p(obj, this.f1184h);
                this.f1187k.addAll(n.k(this.f1183g, this.f1182f, this.f1185i, this.f1186j, this.f1184h));
            }
            if (this.l != null) {
                if (this.m != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f1184h);
                    this.f1183g.q(this.m, this.l, arrayList);
                }
                this.l.clear();
                this.l.add(this.f1184h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f1188f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f1189g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f1190h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ c.e.a f1191i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f1192j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ p f1193k;
        final /* synthetic */ Rect l;

        c(Fragment fragment, Fragment fragment2, boolean z, c.e.a aVar, View view, p pVar, Rect rect) {
            this.f1188f = fragment;
            this.f1189g = fragment2;
            this.f1190h = z;
            this.f1191i = aVar;
            this.f1192j = view;
            this.f1193k = pVar;
            this.l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.f(this.f1188f, this.f1189g, this.f1190h, this.f1191i, false);
            View view = this.f1192j;
            if (view != null) {
                this.f1193k.k(view, this.l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f1194f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.e.a f1195g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f1196h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e f1197i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f1198j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ View f1199k;
        final /* synthetic */ Fragment l;
        final /* synthetic */ Fragment m;
        final /* synthetic */ boolean n;
        final /* synthetic */ ArrayList o;
        final /* synthetic */ Object p;
        final /* synthetic */ Rect q;

        d(p pVar, c.e.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1194f = pVar;
            this.f1195g = aVar;
            this.f1196h = obj;
            this.f1197i = eVar;
            this.f1198j = arrayList;
            this.f1199k = view;
            this.l = fragment;
            this.m = fragment2;
            this.n = z;
            this.o = arrayList2;
            this.p = obj2;
            this.q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.e.a<String, View> h2 = n.h(this.f1194f, this.f1195g, this.f1196h, this.f1197i);
            if (h2 != null) {
                this.f1198j.addAll(h2.values());
                this.f1198j.add(this.f1199k);
            }
            n.f(this.l, this.m, this.n, h2, false);
            Object obj = this.f1196h;
            if (obj != null) {
                this.f1194f.z(obj, this.o, this.f1198j);
                View s = n.s(h2, this.f1197i, this.p, this.n);
                if (s != null) {
                    this.f1194f.k(s, this.q);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class e {
        public Fragment a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1200b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f1201c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f1202d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f1203e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f1204f;

        e() {
        }
    }

    static {
        f1179b = Build.VERSION.SDK_INT >= 21 ? new o() : null;
        f1180c = w();
    }

    static void A(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(i iVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z) {
        if (iVar.x < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            androidx.fragment.app.a aVar = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(iVar.y.e());
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = sparseArray.keyAt(i5);
                c.e.a<String, String> d2 = d(keyAt, arrayList, arrayList2, i2, i3);
                e eVar = (e) sparseArray.valueAt(i5);
                if (z) {
                    o(iVar, keyAt, eVar, view, d2);
                } else {
                    n(iVar, keyAt, eVar, view, d2);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, c.e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.m(size);
            if (collection.contains(u.G(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0092, code lost:
    
        if (r10.mHidden == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:
    
        if (r10.mAdded != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0094, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.m.a r17, android.util.SparseArray<androidx.fragment.app.n.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.b(androidx.fragment.app.a, androidx.fragment.app.m$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) {
        int size = aVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(aVar, aVar.a.get(i2), sparseArray, false, z);
        }
    }

    private static c.e.a<String, String> d(int i2, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        c.e.a<String, String> aVar = new c.e.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i5);
            if (aVar2.A(i2)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = aVar2.o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.o;
                        arrayList4 = aVar2.p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.o;
                        arrayList3 = aVar2.p;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z) {
        if (aVar.s.z.c()) {
            for (int size = aVar.a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.a.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, c.e.a<String, View> aVar, boolean z2) {
        androidx.core.app.o enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(aVar.i(i2));
                arrayList.add(aVar.m(i2));
            }
            if (z2) {
                throw null;
            }
            throw null;
        }
    }

    private static boolean g(p pVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!pVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    static c.e.a<String, View> h(p pVar, c.e.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.o enterTransitionCallback;
        ArrayList<String> arrayList;
        Fragment fragment = eVar.a;
        View view = fragment.getView();
        if (!aVar.isEmpty() && obj != null && view != null) {
            c.e.a<String, View> aVar2 = new c.e.a<>();
            pVar.j(aVar2, view);
            androidx.fragment.app.a aVar3 = eVar.f1201c;
            if (eVar.f1200b) {
                enterTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = aVar3.o;
            } else {
                enterTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = aVar3.p;
            }
            if (arrayList != null) {
                aVar2.p(arrayList);
                aVar2.p(aVar.values());
            }
            if (enterTransitionCallback == null) {
                x(aVar, aVar2);
                return aVar2;
            }
            throw null;
        }
        aVar.clear();
        return null;
    }

    private static c.e.a<String, View> i(p pVar, c.e.a<String, String> aVar, Object obj, e eVar) {
        androidx.core.app.o exitTransitionCallback;
        ArrayList<String> arrayList;
        if (!aVar.isEmpty() && obj != null) {
            Fragment fragment = eVar.f1202d;
            c.e.a<String, View> aVar2 = new c.e.a<>();
            pVar.j(aVar2, fragment.requireView());
            androidx.fragment.app.a aVar3 = eVar.f1204f;
            if (eVar.f1203e) {
                exitTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = aVar3.p;
            } else {
                exitTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = aVar3.o;
            }
            aVar2.p(arrayList);
            if (exitTransitionCallback == null) {
                aVar.p(aVar2.keySet());
                return aVar2;
            }
            throw null;
        }
        aVar.clear();
        return null;
    }

    private static p j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        p pVar = f1179b;
        if (pVar != null && g(pVar, arrayList)) {
            return pVar;
        }
        p pVar2 = f1180c;
        if (pVar2 != null && g(pVar2, arrayList)) {
            return pVar2;
        }
        if (pVar == null && pVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(p pVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            pVar.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        pVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(p pVar, ViewGroup viewGroup, View view, c.e.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t;
        c.e.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.a;
        Fragment fragment2 = eVar.f1202d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f1200b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t = null;
        } else {
            t = t(pVar, fragment, fragment2, z);
            aVar2 = aVar;
        }
        c.e.a<String, View> i2 = i(pVar, aVar2, t, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i2.values());
            obj3 = t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i2, true);
        if (obj3 != null) {
            rect = new Rect();
            pVar.y(obj3, view, arrayList);
            z(pVar, obj3, obj2, i2, eVar.f1203e, eVar.f1204f);
            if (obj != null) {
                pVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        androidx.core.view.r.a(viewGroup, new d(pVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(p pVar, ViewGroup viewGroup, View view, c.e.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.a;
        Fragment fragment2 = eVar.f1202d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar.f1200b;
        Object t = aVar.isEmpty() ? null : t(pVar, fragment, fragment2, z);
        c.e.a<String, View> i2 = i(pVar, aVar, t, eVar);
        c.e.a<String, View> h2 = h(pVar, aVar, t, eVar);
        if (aVar.isEmpty()) {
            if (i2 != null) {
                i2.clear();
            }
            if (h2 != null) {
                h2.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i2, aVar.keySet());
            a(arrayList2, h2, aVar.values());
            obj3 = t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, i2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            pVar.y(obj3, view, arrayList);
            z(pVar, obj3, obj2, i2, eVar.f1203e, eVar.f1204f);
            Rect rect2 = new Rect();
            View s = s(h2, eVar, obj, z);
            if (s != null) {
                pVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.r.a(viewGroup, new c(fragment, fragment2, z, h2, view2, pVar, rect));
        return obj3;
    }

    private static void n(i iVar, int i2, e eVar, View view, c.e.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        p j2;
        Object obj;
        ViewGroup viewGroup = iVar.z.c() ? (ViewGroup) iVar.z.b(i2) : null;
        if (viewGroup == null || (j2 = j((fragment2 = eVar.f1202d), (fragment = eVar.a))) == null) {
            return;
        }
        boolean z = eVar.f1200b;
        boolean z2 = eVar.f1203e;
        Object q = q(j2, fragment, z);
        Object r = r(j2, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l = l(j2, viewGroup, view, aVar, eVar, arrayList, arrayList2, q, r);
        if (q == null && l == null) {
            obj = r;
            if (obj == null) {
                return;
            }
        } else {
            obj = r;
        }
        ArrayList<View> k2 = k(j2, obj, fragment2, arrayList, view);
        Object obj2 = (k2 == null || k2.isEmpty()) ? null : obj;
        j2.a(q, view);
        Object u = u(j2, q, obj2, l, fragment, eVar.f1200b);
        if (u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j2.t(u, q, arrayList3, obj2, k2, l, arrayList2);
            y(j2, viewGroup, fragment, view, arrayList2, q, arrayList3, obj2, k2);
            j2.w(viewGroup, arrayList2, aVar);
            j2.c(viewGroup, u);
            j2.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(i iVar, int i2, e eVar, View view, c.e.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        p j2;
        Object obj;
        ViewGroup viewGroup = iVar.z.c() ? (ViewGroup) iVar.z.b(i2) : null;
        if (viewGroup == null || (j2 = j((fragment2 = eVar.f1202d), (fragment = eVar.a))) == null) {
            return;
        }
        boolean z = eVar.f1200b;
        boolean z2 = eVar.f1203e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q = q(j2, fragment, z);
        Object r = r(j2, fragment2, z2);
        Object m = m(j2, viewGroup, view, aVar, eVar, arrayList2, arrayList, q, r);
        if (q == null && m == null) {
            obj = r;
            if (obj == null) {
                return;
            }
        } else {
            obj = r;
        }
        ArrayList<View> k2 = k(j2, obj, fragment2, arrayList2, view);
        ArrayList<View> k3 = k(j2, q, fragment, arrayList, view);
        A(k3, 4);
        Object u = u(j2, q, obj, m, fragment, z);
        if (u != null) {
            v(j2, obj, fragment2, k2);
            ArrayList<String> o = j2.o(arrayList);
            j2.t(u, q, k3, obj, k2, m, arrayList);
            j2.c(viewGroup, u);
            j2.x(viewGroup, arrayList2, arrayList, o, aVar);
            A(k3, 0);
            j2.z(m, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int i2) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(i2, eVar2);
        return eVar2;
    }

    private static Object q(p pVar, Fragment fragment, boolean z) {
        Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return pVar.g(enterTransition);
    }

    private static Object r(p pVar, Fragment fragment, boolean z) {
        Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return pVar.g(exitTransition);
    }

    static View s(c.e.a<String, View> aVar, e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        androidx.fragment.app.a aVar2 = eVar.f1201c;
        if (obj == null || aVar == null || (arrayList = aVar2.o) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.o.get(0);
        } else {
            str = aVar2.p.get(0);
        }
        return aVar.get(str);
    }

    private static Object t(p pVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object sharedElementEnterTransition;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
        }
        return pVar.A(pVar.g(sharedElementEnterTransition));
    }

    private static Object u(p pVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else if (z) {
            z2 = fragment.getAllowReturnTransitionOverlap();
        } else {
            z2 = fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return pVar.n(obj2, obj, obj3);
        }
        return pVar.m(obj2, obj, obj3);
    }

    private static void v(p pVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            pVar.r(obj, fragment.getView(), arrayList);
            androidx.core.view.r.a(fragment.mContainer, new a(arrayList));
        }
    }

    private static p w() {
        try {
            return (p) Class.forName("c.s.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(c.e.a<String, String> aVar, c.e.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void y(p pVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        androidx.core.view.r.a(viewGroup, new b(obj, pVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(p pVar, Object obj, Object obj2, c.e.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z) {
            str = aVar2.p.get(0);
        } else {
            str = aVar2.o.get(0);
        }
        View view = aVar.get(str);
        pVar.v(obj, view);
        if (obj2 != null) {
            pVar.v(obj2, view);
        }
    }
}
