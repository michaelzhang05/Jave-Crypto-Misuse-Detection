package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f644f = {R.attr.colorBackground};

    /* renamed from: g, reason: collision with root package name */
    private static final e f645g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f646h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f647i;

    /* renamed from: j, reason: collision with root package name */
    int f648j;

    /* renamed from: k, reason: collision with root package name */
    int f649k;
    final Rect l;
    final Rect m;
    private final d n;

    /* loaded from: classes.dex */
    class a implements d {
        private Drawable a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void a(int i2, int i3, int i4, int i5) {
            CardView.this.m.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.l;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public void b(int i2, int i3) {
            CardView cardView = CardView.this;
            if (i2 > cardView.f648j) {
                CardView.super.setMinimumWidth(i2);
            }
            CardView cardView2 = CardView.this;
            if (i3 > cardView2.f649k) {
                CardView.super.setMinimumHeight(i3);
            }
        }

        @Override // androidx.cardview.widget.d
        public void c(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public Drawable f() {
            return this.a;
        }

        @Override // androidx.cardview.widget.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            f645g = new b();
        } else if (i2 >= 17) {
            f645g = new androidx.cardview.widget.a();
        } else {
            f645g = new c();
        }
        f645g.j();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.d.a.a);
    }

    public void f(int i2, int i3, int i4, int i5) {
        this.l.set(i2, i3, i4, i5);
        f645g.i(this.n);
    }

    public ColorStateList getCardBackgroundColor() {
        return f645g.h(this.n);
    }

    public float getCardElevation() {
        return f645g.c(this.n);
    }

    public int getContentPaddingBottom() {
        return this.l.bottom;
    }

    public int getContentPaddingLeft() {
        return this.l.left;
    }

    public int getContentPaddingRight() {
        return this.l.right;
    }

    public int getContentPaddingTop() {
        return this.l.top;
    }

    public float getMaxCardElevation() {
        return f645g.g(this.n);
    }

    public boolean getPreventCornerOverlap() {
        return this.f647i;
    }

    public float getRadius() {
        return f645g.d(this.n);
    }

    public boolean getUseCompatPadding() {
        return this.f646h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!(f645g instanceof b)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.n)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.n)), View.MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f645g.n(this.n, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        f645g.f(this.n, f2);
    }

    public void setMaxCardElevation(float f2) {
        f645g.o(this.n, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f649k = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f648j = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f647i) {
            this.f647i = z;
            f645g.m(this.n);
        }
    }

    public void setRadius(float f2) {
        f645g.b(this.n, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f646h != z) {
            this.f646h = z;
            f645g.e(this.n);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.l = rect;
        this.m = new Rect();
        a aVar = new a();
        this.n = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.d.e.a, i2, c.d.d.a);
        int i3 = c.d.e.f2384d;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f644f);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(c.d.b.f2379b);
            } else {
                color = getResources().getColor(c.d.b.a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(c.d.e.f2385e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(c.d.e.f2386f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(c.d.e.f2387g, 0.0f);
        this.f646h = obtainStyledAttributes.getBoolean(c.d.e.f2389i, false);
        this.f647i = obtainStyledAttributes.getBoolean(c.d.e.f2388h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(c.d.e.f2390j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(c.d.e.l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(c.d.e.n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(c.d.e.m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(c.d.e.f2391k, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f648j = obtainStyledAttributes.getDimensionPixelSize(c.d.e.f2382b, 0);
        this.f649k = obtainStyledAttributes.getDimensionPixelSize(c.d.e.f2383c, 0);
        obtainStyledAttributes.recycle();
        f645g.a(aVar, context, colorStateList, dimension, dimension2, f2);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f645g.n(this.n, colorStateList);
    }
}
