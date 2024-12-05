package c.s;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import c.s.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.p {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class a extends m.e {
        final /* synthetic */ Rect a;

        a(Rect rect) {
            this.a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class b implements m.f {
        final /* synthetic */ View a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2973b;

        b(View view, ArrayList arrayList) {
            this.a = view;
            this.f2973b = arrayList;
        }

        @Override // c.s.m.f
        public void a(m mVar) {
        }

        @Override // c.s.m.f
        public void b(m mVar) {
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            mVar.W(this);
            this.a.setVisibility(8);
            int size = this.f2973b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f2973b.get(i2)).setVisibility(0);
            }
        }

        @Override // c.s.m.f
        public void d(m mVar) {
        }

        @Override // c.s.m.f
        public void e(m mVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class c extends n {
        final /* synthetic */ Object a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f2976c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f2977d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f2978e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f2979f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.f2975b = arrayList;
            this.f2976c = obj2;
            this.f2977d = arrayList2;
            this.f2978e = obj3;
            this.f2979f = arrayList3;
        }

        @Override // c.s.n, c.s.m.f
        public void a(m mVar) {
            Object obj = this.a;
            if (obj != null) {
                e.this.q(obj, this.f2975b, null);
            }
            Object obj2 = this.f2976c;
            if (obj2 != null) {
                e.this.q(obj2, this.f2977d, null);
            }
            Object obj3 = this.f2978e;
            if (obj3 != null) {
                e.this.q(obj3, this.f2979f, null);
            }
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            mVar.W(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class d extends m.e {
        final /* synthetic */ Rect a;

        d(Rect rect) {
            this.a = rect;
        }
    }

    private static boolean B(m mVar) {
        return (androidx.fragment.app.p.l(mVar.C()) && androidx.fragment.app.p.l(mVar.E()) && androidx.fragment.app.p.l(mVar.F())) ? false : true;
    }

    @Override // androidx.fragment.app.p
    public Object A(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.n0((m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.p
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.p
    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int q0 = qVar.q0();
            while (i2 < q0) {
                b(qVar.p0(i2), arrayList);
                i2++;
            }
            return;
        }
        if (B(mVar) || !androidx.fragment.app.p.l(mVar.G())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            mVar.c(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.p
    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.p
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.p
    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.p
    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null && mVar2 != null) {
            mVar = new q().n0(mVar).n0(mVar2).v0(1);
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar = new q();
        if (mVar != null) {
            qVar.n0(mVar);
        }
        qVar.n0(mVar3);
        return qVar;
    }

    @Override // androidx.fragment.app.p
    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.n0((m) obj);
        }
        if (obj2 != null) {
            qVar.n0((m) obj2);
        }
        if (obj3 != null) {
            qVar.n0((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.p
    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).X(view);
        }
    }

    @Override // androidx.fragment.app.p
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int q0 = qVar.q0();
            while (i2 < q0) {
                q(qVar.p0(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (B(mVar)) {
            return;
        }
        List<View> G = mVar.G();
        if (G.size() == arrayList.size() && G.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                mVar.c(arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                mVar.X(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.p
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.p
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.p
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).d0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.p
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).d0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.p
    public void y(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> G = qVar.G();
        G.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.fragment.app.p.d(G, arrayList.get(i2));
        }
        G.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }

    @Override // androidx.fragment.app.p
    public void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.G().clear();
            qVar.G().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }
}
