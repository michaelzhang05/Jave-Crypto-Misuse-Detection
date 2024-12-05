package a3;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.s;
import c3.g;
import c3.k;
import c3.n;

/* loaded from: classes.dex */
public class a extends Drawable implements n, s {

    /* renamed from: a, reason: collision with root package name */
    private b f36a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        g f37a;

        /* renamed from: b, reason: collision with root package name */
        boolean f38b;

        public b(b bVar) {
            this.f37a = (g) bVar.f37a.getConstantState().newDrawable();
            this.f38b = bVar.f38b;
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

        public b(g gVar) {
            this.f37a = gVar;
            this.f38b = false;
        }
    }

    private a(b bVar) {
        this.f36a = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f36a = new b(this.f36a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f36a;
        if (bVar.f38b) {
            bVar.f37a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f36a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f36a.f37a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f36a.f37a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f36a.f37a.setState(iArr)) {
            onStateChange = true;
        }
        boolean c6 = a3.b.c(iArr);
        b bVar = this.f36a;
        if (bVar.f38b == c6) {
            return onStateChange;
        }
        bVar.f38b = c6;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        this.f36a.f37a.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36a.f37a.setColorFilter(colorFilter);
    }

    @Override // c3.n
    public void setShapeAppearanceModel(k kVar) {
        this.f36a.f37a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        this.f36a.f37a.setTint(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f36a.f37a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f36a.f37a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }
}
