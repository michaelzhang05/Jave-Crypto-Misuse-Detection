package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.b1;
import androidx.core.view.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final List f2715a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2716b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f2717c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2718d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2719a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            f5.h.e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            f5.h.e(view, "v");
            f5.h.e(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            f5.h.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f5.h.e(context, "context");
    }

    private final void a(View view) {
        if (this.f2716b.contains(view)) {
            this.f2715a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        f5.h.e(view, "child");
        if (w.B0(view) != null) {
            super.addView(view, i6, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        c3 c02;
        f5.h.e(windowInsets, "insets");
        c3 v5 = c3.v(windowInsets);
        f5.h.d(v5, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2717c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f2719a;
            f5.h.b(onApplyWindowInsetsListener);
            c02 = c3.v(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            c02 = b1.c0(this, v5);
        }
        f5.h.d(c02, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c02.n()) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                b1.i(getChildAt(i6), c02);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        f5.h.e(canvas, "canvas");
        if (this.f2718d) {
            Iterator it = this.f2715a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j6) {
        f5.h.e(canvas, "canvas");
        f5.h.e(view, "child");
        if (this.f2718d && (!this.f2715a.isEmpty()) && this.f2715a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        f5.h.e(view, "view");
        this.f2716b.remove(view);
        if (this.f2715a.remove(view)) {
            this.f2718d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) w.k0(this).h0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f5.h.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                f5.h.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        f5.h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i6) {
        View childAt = getChildAt(i6);
        f5.h.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i6);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        f5.h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            f5.h.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i6, i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            f5.h.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i6, i7);
    }

    public final void setDrawDisappearingViewsLast(boolean z5) {
        this.f2718d = z5;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        f5.h.e(onApplyWindowInsetsListener, "listener");
        this.f2717c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        f5.h.e(view, "view");
        if (view.getParent() == this) {
            this.f2716b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        String str;
        f5.h.e(context, "context");
        this.f2715a = new ArrayList();
        this.f2716b = new ArrayList();
        this.f2718d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = b0.c.f3809e;
            f5.h.d(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(b0.c.f3810f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i6, int i7, f5.f fVar) {
        this(context, attributeSet, (i7 & 4) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, w wVar) {
        super(context, attributeSet);
        String str;
        f5.h.e(context, "context");
        f5.h.e(attributeSet, "attrs");
        f5.h.e(wVar, "fm");
        this.f2715a = new ArrayList();
        this.f2716b = new ArrayList();
        this.f2718d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = b0.c.f3809e;
        f5.h.d(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(b0.c.f3810f) : classAttribute;
        String string = obtainStyledAttributes.getString(b0.c.f3811g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment h02 = wVar.h0(id);
        if (classAttribute != null && h02 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a6 = wVar.s0().a(context.getClassLoader(), classAttribute);
            f5.h.d(a6, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a6.B0(context, attributeSet, null);
            wVar.o().o(true).c(this, a6, string).i();
        }
        wVar.X0(this);
    }
}
