package m0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import m0.l;

/* loaded from: classes.dex */
public class e extends androidx.fragment.app.h0 {

    /* loaded from: classes.dex */
    class a extends l.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f7450a;

        a(Rect rect) {
            this.f7450a = rect;
        }
    }

    /* loaded from: classes.dex */
    class b implements l.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f7452a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f7453b;

        b(View view, ArrayList arrayList) {
            this.f7452a = view;
            this.f7453b = arrayList;
        }

        @Override // m0.l.f
        public void a(l lVar) {
        }

        @Override // m0.l.f
        public void b(l lVar) {
        }

        @Override // m0.l.f
        public void c(l lVar) {
        }

        @Override // m0.l.f
        public void d(l lVar) {
            lVar.Q(this);
            this.f7452a.setVisibility(8);
            int size = this.f7453b.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((View) this.f7453b.get(i6)).setVisibility(0);
            }
        }

        @Override // m0.l.f
        public void e(l lVar) {
        }
    }

    /* loaded from: classes.dex */
    class c extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f7455a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f7456b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f7457c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f7458d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f7459e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f7460f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f7455a = obj;
            this.f7456b = arrayList;
            this.f7457c = obj2;
            this.f7458d = arrayList2;
            this.f7459e = obj3;
            this.f7460f = arrayList3;
        }

        @Override // m0.m, m0.l.f
        public void a(l lVar) {
            Object obj = this.f7455a;
            if (obj != null) {
                e.this.w(obj, this.f7456b, null);
            }
            Object obj2 = this.f7457c;
            if (obj2 != null) {
                e.this.w(obj2, this.f7458d, null);
            }
            Object obj3 = this.f7459e;
            if (obj3 != null) {
                e.this.w(obj3, this.f7460f, null);
            }
        }

        @Override // m0.l.f
        public void d(l lVar) {
            lVar.Q(this);
        }
    }

    /* loaded from: classes.dex */
    class d extends l.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f7462a;

        d(Rect rect) {
            this.f7462a = rect;
        }
    }

    private static boolean v(l lVar) {
        return (androidx.fragment.app.h0.i(lVar.A()) && androidx.fragment.app.h0.i(lVar.B()) && androidx.fragment.app.h0.i(lVar.C())) ? false : true;
    }

    @Override // androidx.fragment.app.h0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((l) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.h0
    public void b(Object obj, ArrayList arrayList) {
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        int i6 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int i02 = pVar.i0();
            while (i6 < i02) {
                b(pVar.h0(i6), arrayList);
                i6++;
            }
            return;
        }
        if (v(lVar) || !androidx.fragment.app.h0.i(lVar.D())) {
            return;
        }
        int size = arrayList.size();
        while (i6 < size) {
            lVar.b((View) arrayList.get(i6));
            i6++;
        }
    }

    @Override // androidx.fragment.app.h0
    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    @Override // androidx.fragment.app.h0
    public boolean e(Object obj) {
        return obj instanceof l;
    }

    @Override // androidx.fragment.app.h0
    public Object f(Object obj) {
        if (obj != null) {
            return ((l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.h0
    public Object j(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        l lVar3 = (l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new p().f0(lVar).f0(lVar2).n0(1);
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar = new p();
        if (lVar != null) {
            pVar.f0(lVar);
        }
        pVar.f0(lVar3);
        return pVar;
    }

    @Override // androidx.fragment.app.h0
    public Object k(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.f0((l) obj);
        }
        if (obj2 != null) {
            pVar.f0((l) obj2);
        }
        if (obj3 != null) {
            pVar.f0((l) obj3);
        }
        return pVar;
    }

    @Override // androidx.fragment.app.h0
    public void m(Object obj, View view, ArrayList arrayList) {
        ((l) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.h0
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.h0
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((l) obj).W(new d(rect));
        }
    }

    @Override // androidx.fragment.app.h0
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((l) obj).W(new a(rect));
        }
    }

    @Override // androidx.fragment.app.h0
    public void s(Object obj, View view, ArrayList arrayList) {
        p pVar = (p) obj;
        List D = pVar.D();
        D.clear();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.fragment.app.h0.d(D, (View) arrayList.get(i6));
        }
        D.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    @Override // androidx.fragment.app.h0
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.D().clear();
            pVar.D().addAll(arrayList2);
            w(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.h0
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.f0((l) obj);
        return pVar;
    }

    public void w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        l lVar = (l) obj;
        int i6 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int i02 = pVar.i0();
            while (i6 < i02) {
                w(pVar.h0(i6), arrayList, arrayList2);
                i6++;
            }
            return;
        }
        if (v(lVar)) {
            return;
        }
        List D = lVar.D();
        if (D.size() == arrayList.size() && D.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i6 < size) {
                lVar.b((View) arrayList2.get(i6));
                i6++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                lVar.R((View) arrayList.get(size2));
            }
        }
    }
}
