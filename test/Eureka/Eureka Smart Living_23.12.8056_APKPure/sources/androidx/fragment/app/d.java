package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.f;
import androidx.core.view.b1;
import androidx.core.view.t2;
import androidx.core.view.z0;
import androidx.fragment.app.k;
import androidx.fragment.app.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class d extends k0 {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2764a;

        static {
            int[] iArr = new int[k0.e.c.values().length];
            f2764a = iArr;
            try {
                iArr[k0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2764a[k0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2764a[k0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2764a[k0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f2765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0.e f2766b;

        b(List list, k0.e eVar) {
            this.f2765a = list;
            this.f2766b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2765a.contains(this.f2766b)) {
                this.f2765a.remove(this.f2766b);
                d.this.s(this.f2766b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2769b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2770c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0.e f2771d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f2772e;

        c(ViewGroup viewGroup, View view, boolean z5, k0.e eVar, k kVar) {
            this.f2768a = viewGroup;
            this.f2769b = view;
            this.f2770c = z5;
            this.f2771d = eVar;
            this.f2772e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2768a.endViewTransition(this.f2769b);
            if (this.f2770c) {
                this.f2771d.e().a(this.f2769b);
            }
            this.f2772e.a();
            if (w.H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f2771d + " has ended.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0046d implements f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f2774a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0.e f2775b;

        C0046d(Animator animator, k0.e eVar) {
            this.f2774a = animator;
            this.f2775b = eVar;
        }

        @Override // androidx.core.os.f.b
        public void a() {
            this.f2774a.end();
            if (w.H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f2775b + " has been canceled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.e f2777a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2778b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2779c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f2780d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2778b.endViewTransition(eVar.f2779c);
                e.this.f2780d.a();
            }
        }

        e(k0.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f2777a = eVar;
            this.f2778b = viewGroup;
            this.f2779c = view;
            this.f2780d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2778b.post(new a());
            if (w.H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f2777a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (w.H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f2777a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f2785c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0.e f2786d;

        f(View view, ViewGroup viewGroup, k kVar, k0.e eVar) {
            this.f2783a = view;
            this.f2784b = viewGroup;
            this.f2785c = kVar;
            this.f2786d = eVar;
        }

        @Override // androidx.core.os.f.b
        public void a() {
            this.f2783a.clearAnimation();
            this.f2784b.endViewTransition(this.f2783a);
            this.f2785c.a();
            if (w.H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f2786d + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0.e f2788a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0.e f2789b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2790c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l.a f2791d;

        g(k0.e eVar, k0.e eVar2, boolean z5, l.a aVar) {
            this.f2788a = eVar;
            this.f2789b = eVar2;
            this.f2790c = z5;
            this.f2791d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.a(this.f2788a.f(), this.f2789b.f(), this.f2790c, this.f2791d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f2793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2794b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f2795c;

        h(h0 h0Var, View view, Rect rect) {
            this.f2793a = h0Var;
            this.f2794b = view;
            this.f2795c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2793a.h(this.f2794b, this.f2795c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f2797a;

        i(ArrayList arrayList) {
            this.f2797a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.d(this.f2797a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f2799a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0.e f2800b;

        j(m mVar, k0.e eVar) {
            this.f2799a = mVar;
            this.f2800b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2799a.a();
            if (w.H0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f2800b + "has completed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f2802c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2803d;

        /* renamed from: e, reason: collision with root package name */
        private k.a f2804e;

        k(k0.e eVar, androidx.core.os.f fVar, boolean z5) {
            super(eVar, fVar);
            this.f2803d = false;
            this.f2802c = z5;
        }

        k.a e(Context context) {
            if (this.f2803d) {
                return this.f2804e;
            }
            k.a b6 = androidx.fragment.app.k.b(context, b().f(), b().e() == k0.e.c.VISIBLE, this.f2802c);
            this.f2804e = b6;
            this.f2803d = true;
            return b6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        private final k0.e f2805a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.os.f f2806b;

        l(k0.e eVar, androidx.core.os.f fVar) {
            this.f2805a = eVar;
            this.f2806b = fVar;
        }

        void a() {
            this.f2805a.d(this.f2806b);
        }

        k0.e b() {
            return this.f2805a;
        }

        androidx.core.os.f c() {
            return this.f2806b;
        }

        boolean d() {
            k0.e.c cVar;
            k0.e.c c6 = k0.e.c.c(this.f2805a.f().I);
            k0.e.c e6 = this.f2805a.e();
            return c6 == e6 || !(c6 == (cVar = k0.e.c.VISIBLE) || e6 == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final Object f2807c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2808d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f2809e;

        m(k0.e eVar, androidx.core.os.f fVar, boolean z5, boolean z6) {
            super(eVar, fVar);
            boolean z7;
            Object obj;
            if (eVar.e() == k0.e.c.VISIBLE) {
                Fragment f6 = eVar.f();
                this.f2807c = z5 ? f6.N() : f6.x();
                Fragment f7 = eVar.f();
                z7 = z5 ? f7.p() : f7.o();
            } else {
                Fragment f8 = eVar.f();
                this.f2807c = z5 ? f8.P() : f8.A();
                z7 = true;
            }
            this.f2808d = z7;
            if (z6) {
                Fragment f9 = eVar.f();
                obj = z5 ? f9.R() : f9.Q();
            } else {
                obj = null;
            }
            this.f2809e = obj;
        }

        private h0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            h0 h0Var = f0.f2865a;
            if (h0Var != null && h0Var.e(obj)) {
                return h0Var;
            }
            h0 h0Var2 = f0.f2866b;
            if (h0Var2 != null && h0Var2.e(obj)) {
                return h0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        h0 e() {
            h0 f6 = f(this.f2807c);
            h0 f7 = f(this.f2809e);
            if (f6 == null || f7 == null || f6 == f7) {
                return f6 != null ? f6 : f7;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f2807c + " which uses a different Transition  type than its shared element transition " + this.f2809e);
        }

        public Object g() {
            return this.f2809e;
        }

        Object h() {
            return this.f2807c;
        }

        public boolean i() {
            return this.f2809e != null;
        }

        boolean j() {
            return this.f2808d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List list, List list2, boolean z5, Map map) {
        int i6;
        StringBuilder sb;
        String str;
        boolean z6;
        Context context;
        View view;
        k.a e6;
        k0.e eVar;
        ViewGroup m6 = m();
        Context context2 = m6.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z7 = false;
        while (true) {
            i6 = 2;
            if (!it.hasNext()) {
                break;
            }
            k kVar = (k) it.next();
            if (kVar.d() || (e6 = kVar.e(context2)) == null) {
                kVar.a();
            } else {
                Animator animator = e6.f2906b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    k0.e b6 = kVar.b();
                    Fragment f6 = b6.f();
                    if (Boolean.TRUE.equals(map.get(b6))) {
                        if (w.H0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f6 + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z8 = b6.e() == k0.e.c.GONE;
                        if (z8) {
                            list2.remove(b6);
                        }
                        View view2 = f6.I;
                        m6.startViewTransition(view2);
                        animator.addListener(new c(m6, view2, z8, b6, kVar));
                        animator.setTarget(view2);
                        animator.start();
                        if (w.H0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Animator from operation ");
                            eVar = b6;
                            sb2.append(eVar);
                            sb2.append(" has started.");
                            Log.v("FragmentManager", sb2.toString());
                        } else {
                            eVar = b6;
                        }
                        kVar.c().c(new C0046d(animator, eVar));
                        z7 = true;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            k0.e b7 = kVar2.b();
            Fragment f7 = b7.f();
            if (z5) {
                if (w.H0(i6)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f7);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z7) {
                if (w.H0(i6)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f7);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view3 = f7.I;
                Animation animation = (Animation) androidx.core.util.h.f(((k.a) androidx.core.util.h.f(kVar2.e(context2))).f2905a);
                if (b7.e() != k0.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.a();
                    z6 = z7;
                    context = context2;
                    view = view3;
                } else {
                    m6.startViewTransition(view3);
                    k.b bVar = new k.b(animation, m6, view3);
                    z6 = z7;
                    context = context2;
                    view = view3;
                    bVar.setAnimationListener(new e(b7, m6, view3, kVar2));
                    view.startAnimation(bVar);
                    if (w.H0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b7 + " has started.");
                    }
                }
                kVar2.c().c(new f(view, m6, kVar2, b7));
                z7 = z6;
                context2 = context;
                i6 = 2;
            }
        }
    }

    private Map x(List list, List list2, boolean z5, k0.e eVar, k0.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        HashMap hashMap;
        View view2;
        Object k6;
        l.a aVar;
        ArrayList arrayList3;
        k0.e eVar3;
        ArrayList arrayList4;
        Rect rect;
        h0 h0Var;
        HashMap hashMap2;
        k0.e eVar4;
        View view3;
        View view4;
        View view5;
        boolean z6 = z5;
        k0.e eVar5 = eVar;
        k0.e eVar6 = eVar2;
        HashMap hashMap3 = new HashMap();
        Iterator it = list.iterator();
        h0 h0Var2 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                h0 e6 = mVar.e();
                if (h0Var2 == null) {
                    h0Var2 = e6;
                } else if (e6 != null && h0Var2 != e6) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (h0Var2 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                hashMap3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap3;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        l.a aVar2 = new l.a();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z7 = false;
        while (true) {
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            m mVar3 = (m) it3.next();
            if (!mVar3.i() || eVar5 == null || eVar6 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar3 = eVar5;
                arrayList4 = arrayList5;
                rect = rect2;
                h0Var = h0Var2;
                hashMap2 = hashMap3;
                View view8 = view6;
                eVar4 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object u5 = h0Var2.u(h0Var2.f(mVar3.g()));
                ArrayList S = eVar2.f().S();
                ArrayList S2 = eVar.f().S();
                ArrayList T = eVar.f().T();
                View view9 = view7;
                int i6 = 0;
                while (i6 < T.size()) {
                    int indexOf = S.indexOf(T.get(i6));
                    ArrayList arrayList7 = T;
                    if (indexOf != -1) {
                        S.set(indexOf, (String) S2.get(i6));
                    }
                    i6++;
                    T = arrayList7;
                }
                ArrayList T2 = eVar2.f().T();
                Fragment f6 = eVar.f();
                if (z6) {
                    f6.y();
                    eVar2.f().B();
                } else {
                    f6.B();
                    eVar2.f().y();
                }
                int i7 = 0;
                for (int size = S.size(); i7 < size; size = size) {
                    aVar2.put((String) S.get(i7), (String) T2.get(i7));
                    i7++;
                }
                if (w.H0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator it4 = T2.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it5 = S.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v("FragmentManager", "Name: " + ((String) it5.next()));
                    }
                }
                l.a aVar3 = new l.a();
                u(aVar3, eVar.f().I);
                aVar3.o(S);
                aVar2.o(aVar3.keySet());
                l.a aVar4 = new l.a();
                u(aVar4, eVar2.f().I);
                aVar4.o(T2);
                aVar4.o(aVar2.values());
                f0.c(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar3 = eVar5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    h0Var = h0Var2;
                    view7 = view9;
                    obj3 = null;
                    eVar4 = eVar2;
                    hashMap2 = hashMap3;
                } else {
                    f0.a(eVar2.f(), eVar.f(), z6, aVar3, true);
                    HashMap hashMap4 = hashMap3;
                    View view10 = view6;
                    aVar = aVar2;
                    ArrayList arrayList8 = arrayList6;
                    z0.a(m(), new g(eVar2, eVar, z5, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (S.isEmpty()) {
                        view7 = view9;
                    } else {
                        View view11 = (View) aVar3.get((String) S.get(0));
                        h0Var2.p(u5, view11);
                        view7 = view11;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (T2.isEmpty() || (view5 = (View) aVar4.get((String) T2.get(0))) == null) {
                        view4 = view10;
                    } else {
                        z0.a(m(), new h(h0Var2, view5, rect2));
                        view4 = view10;
                        z7 = true;
                    }
                    h0Var2.s(u5, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    h0Var = h0Var2;
                    h0Var2.n(u5, null, null, null, null, u5, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar3, bool);
                    eVar4 = eVar2;
                    hashMap2.put(eVar4, bool);
                    obj3 = u5;
                }
            }
            eVar5 = eVar3;
            arrayList5 = arrayList4;
            rect2 = rect;
            hashMap3 = hashMap2;
            aVar2 = aVar;
            z6 = z5;
            arrayList6 = arrayList3;
            h0Var2 = h0Var;
            k0.e eVar7 = eVar4;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view12 = view7;
        l.a aVar5 = aVar2;
        ArrayList arrayList9 = arrayList6;
        k0.e eVar8 = eVar5;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        h0 h0Var3 = h0Var2;
        HashMap hashMap5 = hashMap3;
        View view13 = view6;
        k0.e eVar9 = eVar6;
        View view14 = view13;
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it6.hasNext()) {
            m mVar4 = (m) it6.next();
            if (mVar4.d()) {
                hashMap5.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object f7 = h0Var3.f(mVar4.h());
                k0.e b6 = mVar4.b();
                boolean z8 = obj3 != null && (b6 == eVar8 || b6 == eVar9);
                if (f7 == null) {
                    if (!z8) {
                        hashMap5.put(b6, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    str3 = str;
                    arrayList = arrayList10;
                    view = view14;
                    k6 = obj4;
                    hashMap = hashMap5;
                    view2 = view12;
                } else {
                    str3 = str;
                    ArrayList arrayList12 = new ArrayList();
                    Object obj6 = obj4;
                    t(arrayList12, b6.f().I);
                    if (z8) {
                        if (b6 == eVar8) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        h0Var3.a(f7, view14);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view14;
                        obj2 = obj5;
                        hashMap = hashMap5;
                        obj = obj6;
                    } else {
                        h0Var3.b(f7, arrayList12);
                        view = view14;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        hashMap = hashMap5;
                        h0Var3.n(f7, f7, arrayList12, null, null, null, null);
                        if (b6.e() == k0.e.c.GONE) {
                            list2.remove(b6);
                            ArrayList arrayList13 = new ArrayList(arrayList12);
                            arrayList13.remove(b6.f().I);
                            h0Var3.m(f7, b6.f().I, arrayList13);
                            z0.a(m(), new i(arrayList12));
                        }
                    }
                    if (b6.e() == k0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z7) {
                            h0Var3.o(f7, rect3);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        h0Var3.p(f7, view2);
                    }
                    hashMap.put(b6, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj5 = h0Var3.k(obj2, f7, null);
                        k6 = obj;
                    } else {
                        k6 = h0Var3.k(obj, f7, null);
                        obj5 = obj2;
                    }
                }
                eVar9 = eVar2;
                hashMap5 = hashMap;
                obj4 = k6;
                view12 = view2;
                str = str3;
                view14 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList arrayList14 = arrayList9;
        String str4 = str;
        ArrayList arrayList15 = arrayList10;
        HashMap hashMap6 = hashMap5;
        Object j6 = h0Var3.j(obj5, obj4, obj3);
        if (j6 == null) {
            return hashMap6;
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            m mVar5 = (m) it7.next();
            if (!mVar5.d()) {
                Object h6 = mVar5.h();
                k0.e b7 = mVar5.b();
                HashMap hashMap7 = hashMap6;
                boolean z9 = obj3 != null && (b7 == eVar8 || b7 == eVar2);
                if (h6 == null && !z9) {
                    str2 = str4;
                } else if (b1.U(m())) {
                    str2 = str4;
                    h0Var3.q(mVar5.b().f(), j6, mVar5.c(), new j(mVar5, b7));
                } else {
                    if (w.H0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b7);
                    } else {
                        str2 = str4;
                    }
                    mVar5.a();
                }
                hashMap6 = hashMap7;
                str4 = str2;
            }
        }
        HashMap hashMap8 = hashMap6;
        String str5 = str4;
        if (!b1.U(m())) {
            return hashMap8;
        }
        f0.d(arrayList11, 4);
        ArrayList l6 = h0Var3.l(arrayList14);
        if (w.H0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it8 = arrayList15.iterator();
            while (it8.hasNext()) {
                View view15 = (View) it8.next();
                Log.v(str5, "View: " + view15 + " Name: " + b1.M(view15));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it9 = arrayList14.iterator();
            while (it9.hasNext()) {
                View view16 = (View) it9.next();
                Log.v(str5, "View: " + view16 + " Name: " + b1.M(view16));
            }
        }
        h0Var3.c(m(), j6);
        h0Var3.r(m(), arrayList15, arrayList14, l6, aVar5);
        f0.d(arrayList11, 0);
        h0Var3.t(obj3, arrayList15, arrayList14);
        return hashMap8;
    }

    private void y(List list) {
        Fragment f6 = ((k0.e) list.get(list.size() - 1)).f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k0.e eVar = (k0.e) it.next();
            eVar.f().L.f2697c = f6.L.f2697c;
            eVar.f().L.f2698d = f6.L.f2698d;
            eVar.f().L.f2699e = f6.L.f2699e;
            eVar.f().L.f2700f = f6.L.f2700f;
        }
    }

    @Override // androidx.fragment.app.k0
    void f(List list, boolean z5) {
        Iterator it = list.iterator();
        k0.e eVar = null;
        k0.e eVar2 = null;
        while (it.hasNext()) {
            k0.e eVar3 = (k0.e) it.next();
            k0.e.c c6 = k0.e.c.c(eVar3.f().I);
            int i6 = a.f2764a[eVar3.e().ordinal()];
            if (i6 == 1 || i6 == 2 || i6 == 3) {
                if (c6 == k0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i6 == 4 && c6 != k0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (w.H0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        y(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            k0.e eVar4 = (k0.e) it2.next();
            androidx.core.os.f fVar = new androidx.core.os.f();
            eVar4.j(fVar);
            arrayList.add(new k(eVar4, fVar, z5));
            androidx.core.os.f fVar2 = new androidx.core.os.f();
            eVar4.j(fVar2);
            boolean z6 = false;
            if (z5) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, fVar2, z5, z6));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z6 = true;
                arrayList2.add(new m(eVar4, fVar2, z5, z6));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, fVar2, z5, z6));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z6 = true;
                arrayList2.add(new m(eVar4, fVar2, z5, z6));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map x5 = x(arrayList2, arrayList3, z5, eVar, eVar2);
        w(arrayList, arrayList3, x5.containsValue(Boolean.TRUE), x5);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            s((k0.e) it3.next());
        }
        arrayList3.clear();
        if (w.H0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    void s(k0.e eVar) {
        eVar.e().a(eVar.f().I);
    }

    void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (t2.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map map, View view) {
        String M = b1.M(view);
        if (M != null) {
            map.put(M, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(l.a aVar, Collection collection) {
        Iterator it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(b1.M((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
