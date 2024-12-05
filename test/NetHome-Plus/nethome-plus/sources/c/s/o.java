package c.s;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public class o {
    private static m a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<c.e.a<ViewGroup, ArrayList<m>>>> f3022b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f3023c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f, reason: collision with root package name */
        m f3024f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f3025g;

        /* compiled from: TransitionManager.java */
        /* renamed from: c.s.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0085a extends n {
            final /* synthetic */ c.e.a a;

            C0085a(c.e.a aVar) {
                this.a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // c.s.m.f
            public void c(m mVar) {
                ((ArrayList) this.a.get(a.this.f3025g)).remove(mVar);
                mVar.W(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f3024f = mVar;
            this.f3025g = viewGroup;
        }

        private void a() {
            this.f3025g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3025g.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!o.f3023c.remove(this.f3025g)) {
                return true;
            }
            c.e.a<ViewGroup, ArrayList<m>> b2 = o.b();
            ArrayList<m> arrayList = b2.get(this.f3025g);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b2.put(this.f3025g, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3024f);
            this.f3024f.b(new C0085a(b2));
            this.f3024f.l(this.f3025g, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).Z(this.f3025g);
                }
            }
            this.f3024f.V(this.f3025g);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f3023c.remove(this.f3025g);
            ArrayList<m> arrayList = o.b().get(this.f3025g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().Z(this.f3025g);
                }
            }
            this.f3024f.m(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f3023c.contains(viewGroup) || !androidx.core.view.u.O(viewGroup)) {
            return;
        }
        f3023c.add(viewGroup);
        if (mVar == null) {
            mVar = a;
        }
        m clone = mVar.clone();
        d(viewGroup, clone);
        l.c(viewGroup, null);
        c(viewGroup, clone);
    }

    static c.e.a<ViewGroup, ArrayList<m>> b() {
        c.e.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<c.e.a<ViewGroup, ArrayList<m>>> weakReference = f3022b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        c.e.a<ViewGroup, ArrayList<m>> aVar2 = new c.e.a<>();
        f3022b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().U(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.l(viewGroup, true);
        }
        l b2 = l.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }
}
