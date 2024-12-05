package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    private final View f1015f;

    /* renamed from: g, reason: collision with root package name */
    private ViewTreeObserver f1016g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f1017h;

    private r(View view, Runnable runnable) {
        this.f1015f = view;
        this.f1016g = view.getViewTreeObserver();
        this.f1017h = runnable;
    }

    public static r a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable != null) {
            r rVar = new r(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(rVar);
            view.addOnAttachStateChangeListener(rVar);
            return rVar;
        }
        throw new NullPointerException("runnable == null");
    }

    public void b() {
        if (this.f1016g.isAlive()) {
            this.f1016g.removeOnPreDrawListener(this);
        } else {
            this.f1015f.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1015f.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1017h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1016g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
