package m0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static l f7507a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f7508b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList f7509c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        l f7510a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f7511b;

        /* renamed from: m0.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0117a extends m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ l.a f7512a;

            C0117a(l.a aVar) {
                this.f7512a = aVar;
            }

            @Override // m0.l.f
            public void d(l lVar) {
                ((ArrayList) this.f7512a.get(a.this.f7511b)).remove(lVar);
                lVar.Q(this);
            }
        }

        a(l lVar, ViewGroup viewGroup) {
            this.f7510a = lVar;
            this.f7511b = viewGroup;
        }

        private void a() {
            this.f7511b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f7511b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!n.f7509c.remove(this.f7511b)) {
                return true;
            }
            l.a b6 = n.b();
            ArrayList arrayList = (ArrayList) b6.get(this.f7511b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b6.put(this.f7511b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f7510a);
            this.f7510a.a(new C0117a(b6));
            this.f7510a.l(this.f7511b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).S(this.f7511b);
                }
            }
            this.f7510a.P(this.f7511b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            n.f7509c.remove(this.f7511b);
            ArrayList arrayList = (ArrayList) n.b().get(this.f7511b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).S(this.f7511b);
                }
            }
            this.f7510a.m(true);
        }
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        if (f7509c.contains(viewGroup) || !b1.U(viewGroup)) {
            return;
        }
        f7509c.add(viewGroup);
        if (lVar == null) {
            lVar = f7507a;
        }
        l clone = lVar.clone();
        d(viewGroup, clone);
        k.b(viewGroup, null);
        c(viewGroup, clone);
    }

    static l.a b() {
        l.a aVar;
        WeakReference weakReference = (WeakReference) f7508b.get();
        if (weakReference != null && (aVar = (l.a) weakReference.get()) != null) {
            return aVar;
        }
        l.a aVar2 = new l.a();
        f7508b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, l lVar) {
        if (lVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(lVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, l lVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((l) it.next()).O(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.l(viewGroup, true);
        }
        k.a(viewGroup);
    }
}
