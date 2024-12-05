package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.b1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f3475s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f3476h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f3477i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f3478j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f3479k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    ArrayList f3480l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    ArrayList f3481m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    ArrayList f3482n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    ArrayList f3483o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    ArrayList f3484p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    ArrayList f3485q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    ArrayList f3486r = new ArrayList();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f3487a;

        a(ArrayList arrayList) {
            this.f3487a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3487a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f3521a, jVar.f3522b, jVar.f3523c, jVar.f3524d, jVar.f3525e);
            }
            this.f3487a.clear();
            c.this.f3481m.remove(this.f3487a);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f3489a;

        b(ArrayList arrayList) {
            this.f3489a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3489a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f3489a.clear();
            c.this.f3482n.remove(this.f3489a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0059c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f3491a;

        RunnableC0059c(ArrayList arrayList) {
            this.f3491a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3491a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.c0) it.next());
            }
            this.f3491a.clear();
            c.this.f3480l.remove(this.f3491a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f3493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3494b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3495c;

        d(RecyclerView.c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3493a = c0Var;
            this.f3494b = viewPropertyAnimator;
            this.f3495c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3494b.setListener(null);
            this.f3495c.setAlpha(1.0f);
            c.this.G(this.f3493a);
            c.this.f3485q.remove(this.f3493a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f3493a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f3497a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3499c;

        e(RecyclerView.c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3497a = c0Var;
            this.f3498b = view;
            this.f3499c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3498b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3499c.setListener(null);
            c.this.A(this.f3497a);
            c.this.f3483o.remove(this.f3497a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f3497a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.c0 f3501a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3503c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3504d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3505e;

        f(RecyclerView.c0 c0Var, int i6, View view, int i7, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3501a = c0Var;
            this.f3502b = i6;
            this.f3503c = view;
            this.f3504d = i7;
            this.f3505e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3502b != 0) {
                this.f3503c.setTranslationX(0.0f);
            }
            if (this.f3504d != 0) {
                this.f3503c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3505e.setListener(null);
            c.this.E(this.f3501a);
            c.this.f3484p.remove(this.f3501a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f3501a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3507a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3509c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3507a = iVar;
            this.f3508b = viewPropertyAnimator;
            this.f3509c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3508b.setListener(null);
            this.f3509c.setAlpha(1.0f);
            this.f3509c.setTranslationX(0.0f);
            this.f3509c.setTranslationY(0.0f);
            c.this.C(this.f3507a.f3515a, true);
            c.this.f3486r.remove(this.f3507a.f3515a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3507a.f3515a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3513c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3511a = iVar;
            this.f3512b = viewPropertyAnimator;
            this.f3513c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3512b.setListener(null);
            this.f3513c.setAlpha(1.0f);
            this.f3513c.setTranslationX(0.0f);
            this.f3513c.setTranslationY(0.0f);
            c.this.C(this.f3511a.f3516b, false);
            c.this.f3486r.remove(this.f3511a.f3516b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3511a.f3516b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.c0 f3515a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.c0 f3516b;

        /* renamed from: c, reason: collision with root package name */
        public int f3517c;

        /* renamed from: d, reason: collision with root package name */
        public int f3518d;

        /* renamed from: e, reason: collision with root package name */
        public int f3519e;

        /* renamed from: f, reason: collision with root package name */
        public int f3520f;

        private i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            this.f3515a = c0Var;
            this.f3516b = c0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3515a + ", newHolder=" + this.f3516b + ", fromX=" + this.f3517c + ", fromY=" + this.f3518d + ", toX=" + this.f3519e + ", toY=" + this.f3520f + '}';
        }

        i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i6, int i7, int i8, int i9) {
            this(c0Var, c0Var2);
            this.f3517c = i6;
            this.f3518d = i7;
            this.f3519e = i8;
            this.f3520f = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.c0 f3521a;

        /* renamed from: b, reason: collision with root package name */
        public int f3522b;

        /* renamed from: c, reason: collision with root package name */
        public int f3523c;

        /* renamed from: d, reason: collision with root package name */
        public int f3524d;

        /* renamed from: e, reason: collision with root package name */
        public int f3525e;

        j(RecyclerView.c0 c0Var, int i6, int i7, int i8, int i9) {
            this.f3521a = c0Var;
            this.f3522b = i6;
            this.f3523c = i7;
            this.f3524d = i8;
            this.f3525e = i9;
        }
    }

    private void T(RecyclerView.c0 c0Var) {
        View view = c0Var.f3308a;
        ViewPropertyAnimator animate = view.animate();
        this.f3485q.add(c0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(c0Var, animate, view)).start();
    }

    private void W(List list, RecyclerView.c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, c0Var) && iVar.f3515a == null && iVar.f3516b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.c0 c0Var = iVar.f3515a;
        if (c0Var != null) {
            Y(iVar, c0Var);
        }
        RecyclerView.c0 c0Var2 = iVar.f3516b;
        if (c0Var2 != null) {
            Y(iVar, c0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.c0 c0Var) {
        boolean z5 = false;
        if (iVar.f3516b == c0Var) {
            iVar.f3516b = null;
        } else {
            if (iVar.f3515a != c0Var) {
                return false;
            }
            iVar.f3515a = null;
            z5 = true;
        }
        c0Var.f3308a.setAlpha(1.0f);
        c0Var.f3308a.setTranslationX(0.0f);
        c0Var.f3308a.setTranslationY(0.0f);
        C(c0Var, z5);
        return true;
    }

    private void Z(RecyclerView.c0 c0Var) {
        if (f3475s == null) {
            f3475s = new ValueAnimator().getInterpolator();
        }
        c0Var.f3308a.animate().setInterpolator(f3475s);
        j(c0Var);
    }

    void Q(RecyclerView.c0 c0Var) {
        View view = c0Var.f3308a;
        ViewPropertyAnimator animate = view.animate();
        this.f3483o.add(c0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(c0Var, view, animate)).start();
    }

    void R(i iVar) {
        RecyclerView.c0 c0Var = iVar.f3515a;
        View view = c0Var == null ? null : c0Var.f3308a;
        RecyclerView.c0 c0Var2 = iVar.f3516b;
        View view2 = c0Var2 != null ? c0Var2.f3308a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f3486r.add(iVar.f3515a);
            duration.translationX(iVar.f3519e - iVar.f3517c);
            duration.translationY(iVar.f3520f - iVar.f3518d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f3486r.add(iVar.f3516b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void S(RecyclerView.c0 c0Var, int i6, int i7, int i8, int i9) {
        View view = c0Var.f3308a;
        int i10 = i8 - i6;
        int i11 = i9 - i7;
        if (i10 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i11 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3484p.add(c0Var);
        animate.setDuration(n()).setListener(new f(c0Var, i10, view, i11, animate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.c0) list.get(size)).f3308a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.c0 c0Var, List list) {
        return !list.isEmpty() || super.g(c0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.c0 c0Var) {
        View view = c0Var.f3308a;
        view.animate().cancel();
        int size = this.f3478j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f3478j.get(size)).f3521a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(c0Var);
                this.f3478j.remove(size);
            }
        }
        W(this.f3479k, c0Var);
        if (this.f3476h.remove(c0Var)) {
            view.setAlpha(1.0f);
            G(c0Var);
        }
        if (this.f3477i.remove(c0Var)) {
            view.setAlpha(1.0f);
            A(c0Var);
        }
        for (int size2 = this.f3482n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3482n.get(size2);
            W(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.f3482n.remove(size2);
            }
        }
        for (int size3 = this.f3481m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3481m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f3521a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3481m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3480l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3480l.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                A(c0Var);
                if (arrayList3.isEmpty()) {
                    this.f3480l.remove(size5);
                }
            }
        }
        this.f3485q.remove(c0Var);
        this.f3483o.remove(c0Var);
        this.f3486r.remove(c0Var);
        this.f3484p.remove(c0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f3478j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f3478j.get(size);
            View view = jVar.f3521a.f3308a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3521a);
            this.f3478j.remove(size);
        }
        for (int size2 = this.f3476h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.c0) this.f3476h.get(size2));
            this.f3476h.remove(size2);
        }
        int size3 = this.f3477i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = (RecyclerView.c0) this.f3477i.get(size3);
            c0Var.f3308a.setAlpha(1.0f);
            A(c0Var);
            this.f3477i.remove(size3);
        }
        for (int size4 = this.f3479k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f3479k.get(size4));
        }
        this.f3479k.clear();
        if (p()) {
            for (int size5 = this.f3481m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3481m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f3521a.f3308a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3521a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3481m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3480l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3480l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.c0 c0Var2 = (RecyclerView.c0) arrayList2.get(size8);
                    c0Var2.f3308a.setAlpha(1.0f);
                    A(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3480l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3482n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3482n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3482n.remove(arrayList3);
                    }
                }
            }
            U(this.f3485q);
            U(this.f3484p);
            U(this.f3483o);
            U(this.f3486r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f3477i.isEmpty() && this.f3479k.isEmpty() && this.f3478j.isEmpty() && this.f3476h.isEmpty() && this.f3484p.isEmpty() && this.f3485q.isEmpty() && this.f3483o.isEmpty() && this.f3486r.isEmpty() && this.f3481m.isEmpty() && this.f3480l.isEmpty() && this.f3482n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean z5 = !this.f3476h.isEmpty();
        boolean z6 = !this.f3478j.isEmpty();
        boolean z7 = !this.f3479k.isEmpty();
        boolean z8 = !this.f3477i.isEmpty();
        if (z5 || z6 || z8 || z7) {
            Iterator it = this.f3476h.iterator();
            while (it.hasNext()) {
                T((RecyclerView.c0) it.next());
            }
            this.f3476h.clear();
            if (z6) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3478j);
                this.f3481m.add(arrayList);
                this.f3478j.clear();
                a aVar = new a(arrayList);
                if (z5) {
                    b1.j0(((j) arrayList.get(0)).f3521a.f3308a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z7) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3479k);
                this.f3482n.add(arrayList2);
                this.f3479k.clear();
                b bVar = new b(arrayList2);
                if (z5) {
                    b1.j0(((i) arrayList2.get(0)).f3515a.f3308a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z8) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3477i);
                this.f3480l.add(arrayList3);
                this.f3477i.clear();
                RunnableC0059c runnableC0059c = new RunnableC0059c(arrayList3);
                if (z5 || z6 || z7) {
                    b1.j0(((RecyclerView.c0) arrayList3.get(0)).f3308a, runnableC0059c, (z5 ? o() : 0L) + Math.max(z6 ? n() : 0L, z7 ? m() : 0L));
                } else {
                    runnableC0059c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.c0 c0Var) {
        Z(c0Var);
        c0Var.f3308a.setAlpha(0.0f);
        this.f3477i.add(c0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i6, int i7, int i8, int i9) {
        if (c0Var == c0Var2) {
            return y(c0Var, i6, i7, i8, i9);
        }
        float translationX = c0Var.f3308a.getTranslationX();
        float translationY = c0Var.f3308a.getTranslationY();
        float alpha = c0Var.f3308a.getAlpha();
        Z(c0Var);
        int i10 = (int) ((i8 - i6) - translationX);
        int i11 = (int) ((i9 - i7) - translationY);
        c0Var.f3308a.setTranslationX(translationX);
        c0Var.f3308a.setTranslationY(translationY);
        c0Var.f3308a.setAlpha(alpha);
        if (c0Var2 != null) {
            Z(c0Var2);
            c0Var2.f3308a.setTranslationX(-i10);
            c0Var2.f3308a.setTranslationY(-i11);
            c0Var2.f3308a.setAlpha(0.0f);
        }
        this.f3479k.add(new i(c0Var, c0Var2, i6, i7, i8, i9));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.c0 c0Var, int i6, int i7, int i8, int i9) {
        View view = c0Var.f3308a;
        int translationX = i6 + ((int) view.getTranslationX());
        int translationY = i7 + ((int) c0Var.f3308a.getTranslationY());
        Z(c0Var);
        int i10 = i8 - translationX;
        int i11 = i9 - translationY;
        if (i10 == 0 && i11 == 0) {
            E(c0Var);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        this.f3478j.add(new j(c0Var, translationX, translationY, i8, i9));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.c0 c0Var) {
        Z(c0Var);
        this.f3476h.add(c0Var);
        return true;
    }
}
