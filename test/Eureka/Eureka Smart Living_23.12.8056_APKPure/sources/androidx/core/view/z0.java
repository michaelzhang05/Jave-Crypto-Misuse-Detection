package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class z0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f2414a;

    /* renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f2415b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f2416c;

    private z0(View view, Runnable runnable) {
        this.f2414a = view;
        this.f2415b = view.getViewTreeObserver();
        this.f2416c = runnable;
    }

    public static z0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        z0 z0Var = new z0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(z0Var);
        view.addOnAttachStateChangeListener(z0Var);
        return z0Var;
    }

    public void b() {
        (this.f2415b.isAlive() ? this.f2415b : this.f2414a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2414a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2416c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2415b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
