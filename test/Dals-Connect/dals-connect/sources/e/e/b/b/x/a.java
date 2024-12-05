package e.e.b.b.x;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import e.e.b.b.z.g;
import e.e.b.b.z.k;
import e.e.b.b.z.n;

/* compiled from: RippleDrawableCompat.java */
/* loaded from: classes2.dex */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: f, reason: collision with root package name */
    private b f17550f;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f17550f = new b(this.f17550f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f17550f;
        if (bVar.f17551b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f17550f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f17550f.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17550f.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f17550f.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e2 = e.e.b.b.x.b.e(iArr);
        b bVar = this.f17550f;
        if (bVar.f17551b == e2) {
            return onStateChange;
        }
        bVar.f17551b = e2;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f17550f.a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f17550f.a.setColorFilter(colorFilter);
    }

    @Override // e.e.b.b.z.n
    public void setShapeAppearanceModel(k kVar) {
        this.f17550f.a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        this.f17550f.a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f17550f.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f17550f.a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleDrawableCompat.java */
    /* loaded from: classes2.dex */
    public static final class b extends Drawable.ConstantState {
        g a;

        /* renamed from: b, reason: collision with root package name */
        boolean f17551b;

        public b(g gVar) {
            this.a = gVar;
            this.f17551b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.a = (g) bVar.a.getConstantState().newDrawable();
            this.f17551b = bVar.f17551b;
        }
    }

    private a(b bVar) {
        this.f17550f = bVar;
    }
}
