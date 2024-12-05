package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f2105a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f2106b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f2107c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f2108d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(w wVar) {
        this.f2107c = null;
        this.f2108d = u.f2097g;
        if (wVar != null) {
            this.f2105a = wVar.f2105a;
            this.f2106b = wVar.f2106b;
            this.f2107c = wVar.f2107c;
            this.f2108d = wVar.f2108d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f2106b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i6 = this.f2105a;
        Drawable.ConstantState constantState = this.f2106b;
        return i6 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new v(this, resources);
    }
}
