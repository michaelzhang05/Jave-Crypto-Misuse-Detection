package com.bumptech.glide.p.l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p.m.d;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes.dex */
public abstract class d<Z> extends j<ImageView, Z> implements d.a {
    private Animatable m;

    public d(ImageView imageView) {
        super(imageView);
    }

    private void g(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.m = animatable;
            animatable.start();
            return;
        }
        this.m = null;
    }

    private void i(Z z) {
        h(z);
        g(z);
    }

    @Override // com.bumptech.glide.p.m.d.a
    public void a(Drawable drawable) {
        ((ImageView) this.f8930h).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.p.m.d.a
    public Drawable b() {
        return ((ImageView) this.f8930h).getDrawable();
    }

    protected abstract void h(Z z);

    @Override // com.bumptech.glide.p.l.j, com.bumptech.glide.p.l.a, com.bumptech.glide.p.l.i
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.m;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        a(drawable);
    }

    @Override // com.bumptech.glide.p.l.a, com.bumptech.glide.p.l.i
    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        i(null);
        a(drawable);
    }

    @Override // com.bumptech.glide.p.l.j, com.bumptech.glide.p.l.a, com.bumptech.glide.p.l.i
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        i(null);
        a(drawable);
    }

    @Override // com.bumptech.glide.p.l.i
    public void onResourceReady(Z z, com.bumptech.glide.p.m.d<? super Z> dVar) {
        if (dVar != null && dVar.a(z, this)) {
            g(z);
        } else {
            i(z);
        }
    }

    @Override // com.bumptech.glide.p.l.a, com.bumptech.glide.m.i
    public void onStart() {
        Animatable animatable = this.m;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.p.l.a, com.bumptech.glide.m.i
    public void onStop() {
        Animatable animatable = this.m;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
