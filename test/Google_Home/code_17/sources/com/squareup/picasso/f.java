package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import l2.InterfaceC3309b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class f implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final w f24309a;

    /* renamed from: b, reason: collision with root package name */
    final WeakReference f24310b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC3309b f24311c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(w wVar, ImageView imageView, InterfaceC3309b interfaceC3309b) {
        this.f24309a = wVar;
        this.f24310b = new WeakReference(imageView);
        this.f24311c = interfaceC3309b;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f24309a.b();
        this.f24311c = null;
        ImageView imageView = (ImageView) this.f24310b.get();
        if (imageView == null) {
            return;
        }
        this.f24310b.clear();
        imageView.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f24310b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f24310b.clear();
            this.f24309a.o().m(width, height).j(imageView, this.f24311c);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
