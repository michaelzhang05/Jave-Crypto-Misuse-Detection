package e.e.b.b.w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.d.f;
import e.e.b.b.l;

/* compiled from: TextAppearance.java */
/* loaded from: classes2.dex */
public class d {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f17537b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f17538c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f17539d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17540e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17541f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17542g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17543h;

    /* renamed from: i, reason: collision with root package name */
    public final ColorStateList f17544i;

    /* renamed from: j, reason: collision with root package name */
    public final float f17545j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17546k;
    public final float l;
    private final int m;
    private boolean n = false;
    private Typeface o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* loaded from: classes2.dex */
    public class a extends f.c {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
        }

        @Override // androidx.core.content.d.f.c
        public void d(int i2) {
            d.this.n = true;
            this.a.a(i2);
        }

        @Override // androidx.core.content.d.f.c
        public void e(Typeface typeface) {
            d dVar = d.this;
            dVar.o = Typeface.create(typeface, dVar.f17540e);
            d.this.n = true;
            this.a.b(d.this.o, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* loaded from: classes2.dex */
    public class b extends f {
        final /* synthetic */ TextPaint a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f17548b;

        b(TextPaint textPaint, f fVar) {
            this.a = textPaint;
            this.f17548b = fVar;
        }

        @Override // e.e.b.b.w.f
        public void a(int i2) {
            this.f17548b.a(i2);
        }

        @Override // e.e.b.b.w.f
        public void b(Typeface typeface, boolean z) {
            d.this.k(this.a, typeface);
            this.f17548b.b(typeface, z);
        }
    }

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, l.x4);
        this.a = obtainStyledAttributes.getDimension(l.y4, 0.0f);
        this.f17537b = c.a(context, obtainStyledAttributes, l.B4);
        this.f17538c = c.a(context, obtainStyledAttributes, l.C4);
        this.f17539d = c.a(context, obtainStyledAttributes, l.D4);
        this.f17540e = obtainStyledAttributes.getInt(l.A4, 0);
        this.f17541f = obtainStyledAttributes.getInt(l.z4, 1);
        int e2 = c.e(obtainStyledAttributes, l.J4, l.I4);
        this.m = obtainStyledAttributes.getResourceId(e2, 0);
        this.f17542g = obtainStyledAttributes.getString(e2);
        this.f17543h = obtainStyledAttributes.getBoolean(l.K4, false);
        this.f17544i = c.a(context, obtainStyledAttributes, l.E4);
        this.f17545j = obtainStyledAttributes.getFloat(l.F4, 0.0f);
        this.f17546k = obtainStyledAttributes.getFloat(l.G4, 0.0f);
        this.l = obtainStyledAttributes.getFloat(l.H4, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.o == null && (str = this.f17542g) != null) {
            this.o = Typeface.create(str, this.f17540e);
        }
        if (this.o == null) {
            int i2 = this.f17541f;
            if (i2 == 1) {
                this.o = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.o = Typeface.SERIF;
            } else if (i2 != 3) {
                this.o = Typeface.DEFAULT;
            } else {
                this.o = Typeface.MONOSPACE;
            }
            this.o = Typeface.create(this.o, this.f17540e);
        }
    }

    public Typeface e() {
        d();
        return this.o;
    }

    public Typeface f(Context context) {
        if (this.n) {
            return this.o;
        }
        if (!context.isRestricted()) {
            try {
                Typeface e2 = androidx.core.content.d.f.e(context, this.m);
                this.o = e2;
                if (e2 != null) {
                    this.o = Typeface.create(e2, this.f17540e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e3) {
                Log.d("TextAppearance", "Error loading font " + this.f17542g, e3);
            }
        }
        d();
        this.n = true;
        return this.o;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        k(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (e.a()) {
            f(context);
        } else {
            d();
        }
        int i2 = this.m;
        if (i2 == 0) {
            this.n = true;
        }
        if (this.n) {
            fVar.b(this.o, true);
            return;
        }
        try {
            androidx.core.content.d.f.g(context, i2, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f17542g, e2);
            this.n = true;
            fVar.a(-3);
        }
    }

    public void i(Context context, TextPaint textPaint, f fVar) {
        j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f17537b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.l;
        float f3 = this.f17545j;
        float f4 = this.f17546k;
        ColorStateList colorStateList2 = this.f17544i;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f17540e;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.a);
    }
}
