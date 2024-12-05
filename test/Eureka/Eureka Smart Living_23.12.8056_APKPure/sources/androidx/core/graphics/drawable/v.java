package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v extends u {

    /* renamed from: h, reason: collision with root package name */
    private static Method f2104h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f2104h == null) {
            try {
                f2104h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e6) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e6);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.u
    protected boolean c() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2103f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2103f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2103f;
        if (drawable != null && (method = f2104h) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e6) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e6);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f6, float f7) {
        this.f2103f.setHotspot(f6, f7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i6, int i7, int i8, int i9) {
        this.f2103f.setHotspotBounds(i6, i7, i8, i9);
    }

    @Override // androidx.core.graphics.drawable.u, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.u, android.graphics.drawable.Drawable
    public void setTint(int i6) {
        if (c()) {
            super.setTint(i6);
        } else {
            this.f2103f.setTint(i6);
        }
    }

    @Override // androidx.core.graphics.drawable.u, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2103f.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.u, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f2103f.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(w wVar, Resources resources) {
        super(wVar, resources);
        g();
    }
}
