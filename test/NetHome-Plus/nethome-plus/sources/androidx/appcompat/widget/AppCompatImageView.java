package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements androidx.core.view.t, androidx.core.widget.n {

    /* renamed from: f, reason: collision with root package name */
    private final d f355f;

    /* renamed from: g, reason: collision with root package name */
    private final l f356g;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f355f;
        if (dVar != null) {
            dVar.b();
        }
        l lVar = this.f356g;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // androidx.core.view.t
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f355f;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f355f;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.n
    public ColorStateList getSupportImageTintList() {
        l lVar = this.f356g;
        if (lVar != null) {
            return lVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.n
    public PorterDuff.Mode getSupportImageTintMode() {
        l lVar = this.f356g;
        if (lVar != null) {
            return lVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f356g.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f355f;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.f355f;
        if (dVar != null) {
            dVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.f356g;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.f356g;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        l lVar = this.f356g;
        if (lVar != null) {
            lVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f356g;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // androidx.core.view.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f355f;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f355f;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.n
    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.f356g;
        if (lVar != null) {
            lVar.h(colorStateList);
        }
    }

    @Override // androidx.core.widget.n
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.f356g;
        if (lVar != null) {
            lVar.i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i2) {
        super(n0.b(context), attributeSet, i2);
        l0.a(this, getContext());
        d dVar = new d(this);
        this.f355f = dVar;
        dVar.e(attributeSet, i2);
        l lVar = new l(this);
        this.f356g = lVar;
        lVar.f(attributeSet, i2);
    }
}