package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.u;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class e extends q {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.c0> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.c0> mPendingAdditions = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.c0>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.c0> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.c0> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.c0> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.c0> mChangeAnimations = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1510f;

        a(ArrayList arrayList) {
            this.f1510f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1510f.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                e.this.animateMoveImpl(jVar.a, jVar.f1538b, jVar.f1539c, jVar.f1540d, jVar.f1541e);
            }
            this.f1510f.clear();
            e.this.mMovesList.remove(this.f1510f);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1512f;

        b(ArrayList arrayList) {
            this.f1512f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1512f.iterator();
            while (it.hasNext()) {
                e.this.animateChangeImpl((i) it.next());
            }
            this.f1512f.clear();
            e.this.mChangesList.remove(this.f1512f);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1514f;

        c(ArrayList arrayList) {
            this.f1514f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f1514f.iterator();
            while (it.hasNext()) {
                e.this.animateAddImpl((RecyclerView.c0) it.next());
            }
            this.f1514f.clear();
            e.this.mAdditionsList.remove(this.f1514f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.c0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1517c;

        d(RecyclerView.c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = c0Var;
            this.f1516b = viewPropertyAnimator;
            this.f1517c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1516b.setListener(null);
            this.f1517c.setAlpha(1.0f);
            e.this.dispatchRemoveFinished(this.a);
            e.this.mRemoveAnimations.remove(this.a);
            e.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.dispatchRemoveStarting(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0028e extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.c0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1519b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1520c;

        C0028e(RecyclerView.c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = c0Var;
            this.f1519b = view;
            this.f1520c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1519b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1520c.setListener(null);
            e.this.dispatchAddFinished(this.a);
            e.this.mAddAnimations.remove(this.a);
            e.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.dispatchAddStarting(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.c0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1523c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1524d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1525e;

        f(RecyclerView.c0 c0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = c0Var;
            this.f1522b = i2;
            this.f1523c = view;
            this.f1524d = i3;
            this.f1525e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f1522b != 0) {
                this.f1523c.setTranslationX(0.0f);
            }
            if (this.f1524d != 0) {
                this.f1523c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1525e.setListener(null);
            e.this.dispatchMoveFinished(this.a);
            e.this.mMoveAnimations.remove(this.a);
            e.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.dispatchMoveStarting(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        final /* synthetic */ i a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1528c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.f1527b = viewPropertyAnimator;
            this.f1528c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1527b.setListener(null);
            this.f1528c.setAlpha(1.0f);
            this.f1528c.setTranslationX(0.0f);
            this.f1528c.setTranslationY(0.0f);
            e.this.dispatchChangeFinished(this.a.a, true);
            e.this.mChangeAnimations.remove(this.a.a);
            e.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.dispatchChangeStarting(this.a.a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        final /* synthetic */ i a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f1530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1531c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.f1530b = viewPropertyAnimator;
            this.f1531c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1530b.setListener(null);
            this.f1531c.setAlpha(1.0f);
            this.f1531c.setTranslationX(0.0f);
            this.f1531c.setTranslationY(0.0f);
            e.this.dispatchChangeFinished(this.a.f1533b, false);
            e.this.mChangeAnimations.remove(this.a.f1533b);
            e.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.dispatchChangeStarting(this.a.f1533b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class j {
        public RecyclerView.c0 a;

        /* renamed from: b, reason: collision with root package name */
        public int f1538b;

        /* renamed from: c, reason: collision with root package name */
        public int f1539c;

        /* renamed from: d, reason: collision with root package name */
        public int f1540d;

        /* renamed from: e, reason: collision with root package name */
        public int f1541e;

        j(RecyclerView.c0 c0Var, int i2, int i3, int i4, int i5) {
            this.a = c0Var;
            this.f1538b = i2;
            this.f1539c = i3;
            this.f1540d = i4;
            this.f1541e = i5;
        }
    }

    private void animateRemoveImpl(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(c0Var);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(c0Var, animate, view)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, c0Var) && iVar.a == null && iVar.f1533b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.c0 c0Var = iVar.a;
        if (c0Var != null) {
            endChangeAnimationIfNecessary(iVar, c0Var);
        }
        RecyclerView.c0 c0Var2 = iVar.f1533b;
        if (c0Var2 != null) {
            endChangeAnimationIfNecessary(iVar, c0Var2);
        }
    }

    private void resetAnimation(RecyclerView.c0 c0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        c0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(c0Var);
    }

    @Override // androidx.recyclerview.widget.q
    public boolean animateAdd(RecyclerView.c0 c0Var) {
        resetAnimation(c0Var);
        c0Var.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(c0Var);
        return true;
    }

    void animateAddImpl(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(c0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C0028e(c0Var, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.q
    public boolean animateChange(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i2, int i3, int i4, int i5) {
        if (c0Var == c0Var2) {
            return animateMove(c0Var, i2, i3, i4, i5);
        }
        float translationX = c0Var.itemView.getTranslationX();
        float translationY = c0Var.itemView.getTranslationY();
        float alpha = c0Var.itemView.getAlpha();
        resetAnimation(c0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        c0Var.itemView.setTranslationX(translationX);
        c0Var.itemView.setTranslationY(translationY);
        c0Var.itemView.setAlpha(alpha);
        if (c0Var2 != null) {
            resetAnimation(c0Var2);
            c0Var2.itemView.setTranslationX(-i6);
            c0Var2.itemView.setTranslationY(-i7);
            c0Var2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new i(c0Var, c0Var2, i2, i3, i4, i5));
        return true;
    }

    void animateChangeImpl(i iVar) {
        RecyclerView.c0 c0Var = iVar.a;
        View view = c0Var == null ? null : c0Var.itemView;
        RecyclerView.c0 c0Var2 = iVar.f1533b;
        View view2 = c0Var2 != null ? c0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.a);
            duration.translationX(iVar.f1536e - iVar.f1534c);
            duration.translationY(iVar.f1537f - iVar.f1535d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.f1533b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.q
    public boolean animateMove(RecyclerView.c0 c0Var, int i2, int i3, int i4, int i5) {
        View view = c0Var.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) c0Var.itemView.getTranslationY());
        resetAnimation(c0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            dispatchMoveFinished(c0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.mPendingMoves.add(new j(c0Var, translationX, translationY, i4, i5));
        return true;
    }

    void animateMoveImpl(RecyclerView.c0 c0Var, int i2, int i3, int i4, int i5) {
        View view = c0Var.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(c0Var);
        animate.setDuration(getMoveDuration()).setListener(new f(c0Var, i6, view, i7, animate)).start();
    }

    @Override // androidx.recyclerview.widget.q
    public boolean animateRemove(RecyclerView.c0 c0Var) {
        resetAnimation(c0Var);
        this.mPendingRemovals.add(c0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean canReuseUpdatedViewHolder(RecyclerView.c0 c0Var, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(c0Var, list);
    }

    void cancelAll(List<RecyclerView.c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void endAnimation(RecyclerView.c0 c0Var) {
        View view = c0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(c0Var);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, c0Var);
        if (this.mPendingRemovals.remove(c0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(c0Var);
        }
        if (this.mPendingAdditions.remove(c0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(c0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.c0> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(c0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(c0Var);
        this.mAddAnimations.remove(c0Var);
        this.mChangeAnimations.remove(c0Var);
        this.mMoveAnimations.remove(c0Var);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = this.mPendingAdditions.get(size3);
            c0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(c0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.c0> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.c0 c0Var2 = arrayList2.get(size8);
                    c0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void runPendingAnimations() {
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.c0> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                a aVar = new a(arrayList);
                if (z) {
                    u.b0(arrayList.get(0).a.itemView, aVar, getRemoveDuration());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    u.b0(arrayList2.get(0).a.itemView, bVar, getRemoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.c0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                c cVar = new c(arrayList3);
                if (!z && !z2 && !z3) {
                    cVar.run();
                } else {
                    u.b0(arrayList3.get(0).itemView, cVar, (z ? getRemoveDuration() : 0L) + Math.max(z2 ? getMoveDuration() : 0L, z3 ? getChangeDuration() : 0L));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class i {
        public RecyclerView.c0 a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.c0 f1533b;

        /* renamed from: c, reason: collision with root package name */
        public int f1534c;

        /* renamed from: d, reason: collision with root package name */
        public int f1535d;

        /* renamed from: e, reason: collision with root package name */
        public int f1536e;

        /* renamed from: f, reason: collision with root package name */
        public int f1537f;

        private i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            this.a = c0Var;
            this.f1533b = c0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.f1533b + ", fromX=" + this.f1534c + ", fromY=" + this.f1535d + ", toX=" + this.f1536e + ", toY=" + this.f1537f + '}';
        }

        i(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i2, int i3, int i4, int i5) {
            this(c0Var, c0Var2);
            this.f1534c = i2;
            this.f1535d = i3;
            this.f1536e = i4;
            this.f1537f = i5;
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.c0 c0Var) {
        boolean z = false;
        if (iVar.f1533b == c0Var) {
            iVar.f1533b = null;
        } else {
            if (iVar.a != c0Var) {
                return false;
            }
            iVar.a = null;
            z = true;
        }
        c0Var.itemView.setAlpha(1.0f);
        c0Var.itemView.setTranslationX(0.0f);
        c0Var.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(c0Var, z);
        return true;
    }
}
