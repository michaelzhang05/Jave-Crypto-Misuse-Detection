package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {
    int a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f946b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f947c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f948d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.f947c = null;
        this.f948d = d.f940f;
        if (fVar != null) {
            this.a = fVar.a;
            this.f946b = fVar.f946b;
            this.f947c = fVar.f947c;
            this.f948d = fVar.f948d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f946b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.a;
        Drawable.ConstantState constantState = this.f946b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }
}
