package z2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h;
import m2.j;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f9949a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f9950b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f9951c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9952d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9953e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9954f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9955g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9956h;

    /* renamed from: i, reason: collision with root package name */
    public final float f9957i;

    /* renamed from: j, reason: collision with root package name */
    public final float f9958j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9959k;

    /* renamed from: l, reason: collision with root package name */
    public final float f9960l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f9961m;

    /* renamed from: n, reason: collision with root package name */
    private float f9962n;

    /* renamed from: o, reason: collision with root package name */
    private final int f9963o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f9964p = false;

    /* renamed from: q, reason: collision with root package name */
    private Typeface f9965q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f9966a;

        a(f fVar) {
            this.f9966a = fVar;
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: h */
        public void f(int i6) {
            d.this.f9964p = true;
            this.f9966a.a(i6);
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f9965q = Typeface.create(typeface, dVar.f9953e);
            d.this.f9964p = true;
            this.f9966a.b(d.this.f9965q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f9969b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f9970c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f9968a = context;
            this.f9969b = textPaint;
            this.f9970c = fVar;
        }

        @Override // z2.f
        public void a(int i6) {
            this.f9970c.a(i6);
        }

        @Override // z2.f
        public void b(Typeface typeface, boolean z5) {
            d.this.p(this.f9968a, this.f9969b, typeface);
            this.f9970c.b(typeface, z5);
        }
    }

    public d(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, j.S4);
        l(obtainStyledAttributes.getDimension(j.T4, 0.0f));
        k(c.a(context, obtainStyledAttributes, j.W4));
        this.f9949a = c.a(context, obtainStyledAttributes, j.X4);
        this.f9950b = c.a(context, obtainStyledAttributes, j.Y4);
        this.f9953e = obtainStyledAttributes.getInt(j.V4, 0);
        this.f9954f = obtainStyledAttributes.getInt(j.U4, 1);
        int e6 = c.e(obtainStyledAttributes, j.f7734e5, j.f7727d5);
        this.f9963o = obtainStyledAttributes.getResourceId(e6, 0);
        this.f9952d = obtainStyledAttributes.getString(e6);
        this.f9955g = obtainStyledAttributes.getBoolean(j.f7741f5, false);
        this.f9951c = c.a(context, obtainStyledAttributes, j.Z4);
        this.f9956h = obtainStyledAttributes.getFloat(j.f7706a5, 0.0f);
        this.f9957i = obtainStyledAttributes.getFloat(j.f7713b5, 0.0f);
        this.f9958j = obtainStyledAttributes.getFloat(j.f7720c5, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i6, j.f7795n3);
        this.f9959k = obtainStyledAttributes2.hasValue(j.f7802o3);
        this.f9960l = obtainStyledAttributes2.getFloat(j.f7802o3, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f9965q == null && (str = this.f9952d) != null) {
            this.f9965q = Typeface.create(str, this.f9953e);
        }
        if (this.f9965q == null) {
            int i6 = this.f9954f;
            this.f9965q = i6 != 1 ? i6 != 2 ? i6 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f9965q = Typeface.create(this.f9965q, this.f9953e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i6 = this.f9963o;
        return (i6 != 0 ? androidx.core.content.res.h.c(context, i6) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f9965q;
    }

    public Typeface f(Context context) {
        if (this.f9964p) {
            return this.f9965q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g6 = androidx.core.content.res.h.g(context, this.f9963o);
                this.f9965q = g6;
                if (g6 != null) {
                    this.f9965q = Typeface.create(g6, this.f9953e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e6) {
                Log.d("TextAppearance", "Error loading font " + this.f9952d, e6);
            }
        }
        d();
        this.f9964p = true;
        return this.f9965q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i6 = this.f9963o;
        if (i6 == 0) {
            this.f9964p = true;
        }
        if (this.f9964p) {
            fVar.b(this.f9965q, true);
            return;
        }
        try {
            androidx.core.content.res.h.i(context, i6, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f9964p = true;
            fVar.a(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f9952d, e6);
            this.f9964p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f9961m;
    }

    public float j() {
        return this.f9962n;
    }

    public void k(ColorStateList colorStateList) {
        this.f9961m = colorStateList;
    }

    public void l(float f6) {
        this.f9962n = f6;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f9961m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f6 = this.f9958j;
        float f7 = this.f9956h;
        float f8 = this.f9957i;
        ColorStateList colorStateList2 = this.f9951c;
        textPaint.setShadowLayer(f6, f7, f8, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a6 = i.a(context, typeface);
        if (a6 != null) {
            typeface = a6;
        }
        textPaint.setTypeface(typeface);
        int i6 = this.f9953e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i6 & 1) != 0);
        textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f9962n);
        if (this.f9959k) {
            textPaint.setLetterSpacing(this.f9960l);
        }
    }
}
