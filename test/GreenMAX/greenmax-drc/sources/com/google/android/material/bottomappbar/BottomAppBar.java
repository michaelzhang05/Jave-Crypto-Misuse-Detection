package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.e.b.b.k;
import e.e.b.b.z.g;
import e.e.b.b.z.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int U = k.o;
    private final int V;
    private final g W;
    private Animator a0;
    private Animator b0;
    private int c0;
    private int d0;
    private boolean e0;
    private int f0;
    private ArrayList<f> g0;
    private boolean h0;
    private Behavior i0;
    private int j0;
    private int k0;
    private int l0;
    AnimatorListenerAdapter m0;
    e.e.b.b.m.k<FloatingActionButton> n0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h, reason: collision with root package name */
        int f16433h;

        /* renamed from: i, reason: collision with root package name */
        boolean f16434i;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f16433h);
            parcel.writeInt(this.f16434i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16433h = parcel.readInt();
            this.f16434i = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.i0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends FloatingActionButton.b {
        final /* synthetic */ int a;

        /* loaded from: classes2.dex */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.i0();
            }
        }

        b(int i2) {
            this.a = i2;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.n0(this.a));
            floatingActionButton.s(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.i0();
            BottomAppBar.this.b0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        public boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f16436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f16437c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f16438d;

        d(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f16436b = actionMenuView;
            this.f16437c = i2;
            this.f16438d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            BottomAppBar.this.u0(this.f16436b, this.f16437c, this.f16438d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0.onAnimationStart(animator);
            FloatingActionButton k0 = BottomAppBar.this.k0();
            if (k0 != null) {
                k0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface f {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.m0);
        floatingActionButton.f(new e());
        floatingActionButton.g(this.n0);
    }

    private void e0() {
        Animator animator = this.b0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.a0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void g0(int i2, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k0(), "translationX", n0(i2));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.j0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return n0(this.c0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.k0;
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.W.D().p();
    }

    private void h0(int i2, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m0(actionMenuView, i2, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new d(actionMenuView, i2, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        ArrayList<f> arrayList;
        int i2 = this.f0 - 1;
        this.f0 = i2;
        if (i2 != 0 || (arrayList = this.g0) == null) {
            return;
        }
        Iterator<f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        ArrayList<f> arrayList;
        int i2 = this.f0;
        this.f0 = i2 + 1;
        if (i2 != 0 || (arrayList = this.g0) == null) {
            return;
        }
        Iterator<f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton k0() {
        View l0 = l0();
        if (l0 instanceof FloatingActionButton) {
            return (FloatingActionButton) l0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View l0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n0(int i2) {
        boolean d2 = com.google.android.material.internal.k.d(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) - (this.V + (d2 ? this.l0 : this.k0))) * (d2 ? -1 : 1);
        }
        return 0.0f;
    }

    private boolean o0() {
        FloatingActionButton k0 = k0();
        return k0 != null && k0.o();
    }

    private void p0(int i2, boolean z) {
        if (u.O(this)) {
            Animator animator = this.b0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!o0()) {
                i2 = 0;
                z = false;
            }
            h0(i2, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.b0 = animatorSet;
            animatorSet.addListener(new c());
            this.b0.start();
        }
    }

    private void q0(int i2) {
        if (this.c0 == i2 || !u.O(this)) {
            return;
        }
        Animator animator = this.a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.d0 == 1) {
            g0(i2, arrayList);
        } else {
            f0(i2, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.a0 = animatorSet;
        animatorSet.addListener(new a());
        this.a0.start();
    }

    private void r0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!o0()) {
                u0(actionMenuView, 0, false);
            } else {
                u0(actionMenuView, this.c0, this.h0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        getTopEdgeTreatment().m(getFabTranslationX());
        View l0 = l0();
        this.W.Y((this.h0 && o0()) ? 1.0f : 0.0f);
        if (l0 != null) {
            l0.setTranslationY(getFabTranslationY());
            l0.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(ActionMenuView actionMenuView, int i2, boolean z) {
        actionMenuView.setTranslationX(m0(actionMenuView, i2, z));
    }

    protected void f0(int i2, List<Animator> list) {
        FloatingActionButton k0 = k0();
        if (k0 == null || k0.n()) {
            return;
        }
        j0();
        k0.l(new b(i2));
    }

    public ColorStateList getBackgroundTint() {
        return this.W.F();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.c0;
    }

    public int getFabAnimationMode() {
        return this.d0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.e0;
    }

    protected int m0(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 != 1 || !z) {
            return 0;
        }
        boolean d2 = com.google.android.material.internal.k.d(this);
        int measuredWidth = d2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                if (d2) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((d2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d2 ? this.k0 : -this.l0));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.W);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            e0();
            s0();
        }
        r0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.c0 = savedState.f16433h;
        this.h0 = savedState.f16434i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16433h = this.c0;
        savedState.f16434i = this.h0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.W, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i(f2);
            this.W.invalidateSelf();
            s0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.W.W(f2);
        getBehavior().G(this, this.W.C() - this.W.B());
    }

    public void setFabAlignmentMode(int i2) {
        q0(i2);
        p0(i2, this.h0);
        this.c0 = i2;
    }

    public void setFabAnimationMode(int i2) {
        this.d0 = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().j(f2);
            this.W.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().k(f2);
            this.W.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.e0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    boolean t0(int i2) {
        float f2 = i2;
        if (f2 == getTopEdgeTreatment().h()) {
            return false;
        }
        getTopEdgeTreatment().l(f2);
        this.W.invalidateSelf();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.i0 == null) {
            this.i0 = new Behavior();
        }
        return this.i0;
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f16429e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<BottomAppBar> f16430f;

        /* renamed from: g, reason: collision with root package name */
        private int f16431g;

        /* renamed from: h, reason: collision with root package name */
        private final View.OnLayoutChangeListener f16432h;

        /* loaded from: classes2.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f16430f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f16429e);
                    int height = Behavior.this.f16429e.height();
                    bottomAppBar.t0(height);
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.f16431g == 0) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(e.e.b.b.d.v) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (com.google.android.material.internal.k.d(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.V;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.V;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f16432h = new a();
            this.f16429e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
            this.f16430f = new WeakReference<>(bottomAppBar);
            View l0 = bottomAppBar.l0();
            if (l0 != null && !u.O(l0)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) l0.getLayoutParams();
                fVar.f788d = 49;
                this.f16431g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (l0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) l0;
                    floatingActionButton.addOnLayoutChangeListener(this.f16432h);
                    bottomAppBar.d0(floatingActionButton);
                }
                bottomAppBar.s0();
            }
            coordinatorLayout.I(bottomAppBar, i2);
            return super.l(coordinatorLayout, bottomAppBar, i2);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i2, int i3) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i2, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16432h = new a();
            this.f16429e = new Rect();
        }
    }
}
