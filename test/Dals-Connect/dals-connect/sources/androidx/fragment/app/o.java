package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
class o extends p {

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class a extends Transition.EpicenterCallback {
        final /* synthetic */ Rect a;

        a(Rect rect) {
            this.a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.a;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class b implements Transition.TransitionListener {
        final /* synthetic */ View a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1206b;

        b(View view, ArrayList arrayList) {
            this.a = view;
            this.f1206b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.a.setVisibility(8);
            int size = this.f1206b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f1206b.get(i2)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class c implements Transition.TransitionListener {
        final /* synthetic */ Object a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f1210d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f1211e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1212f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.f1208b = arrayList;
            this.f1209c = obj2;
            this.f1210d = arrayList2;
            this.f1211e = obj3;
            this.f1212f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.a;
            if (obj != null) {
                o.this.q(obj, this.f1208b, null);
            }
            Object obj2 = this.f1209c;
            if (obj2 != null) {
                o.this.q(obj2, this.f1210d, null);
            }
            Object obj3 = this.f1211e;
            if (obj3 != null) {
                o.this.q(obj3, this.f1212f, null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class d extends Transition.EpicenterCallback {
        final /* synthetic */ Rect a;

        d(Rect rect) {
            this.a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    private static boolean B(Transition transition) {
        return (p.l(transition.getTargetIds()) && p.l(transition.getTargetNames()) && p.l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.p
    public Object A(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.p
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.p
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                b(transitionSet.getTransitionAt(i2), arrayList);
                i2++;
            }
            return;
        }
        if (B(transition) || !p.l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            transition.addTarget(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.p
    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.p
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.p
    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.p
    public Object m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.p
    public Object n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.p
    public void p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.p
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                q(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (B(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i2 < size) {
            transition.addTarget(arrayList2.get(i2));
            i2++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.p
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.p
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.p
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new d(rect));
        }
    }

    @Override // androidx.fragment.app.p
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.p
    public void y(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            p.d(targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.p
    public void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            q(transitionSet, arrayList, arrayList2);
        }
    }
}
