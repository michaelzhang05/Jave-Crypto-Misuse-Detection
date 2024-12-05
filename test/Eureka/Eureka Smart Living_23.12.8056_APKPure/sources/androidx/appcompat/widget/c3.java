package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

/* loaded from: classes.dex */
public class c3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f950a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f951b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f952c;

    private c3(Context context, TypedArray typedArray) {
        this.f950a = context;
        this.f951b = typedArray;
    }

    public static c3 t(Context context, int i6, int[] iArr) {
        return new c3(context, context.obtainStyledAttributes(i6, iArr));
    }

    public static c3 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new c3(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static c3 v(Context context, AttributeSet attributeSet, int[] iArr, int i6, int i7) {
        return new c3(context, context.obtainStyledAttributes(attributeSet, iArr, i6, i7));
    }

    public boolean a(int i6, boolean z5) {
        return this.f951b.getBoolean(i6, z5);
    }

    public int b(int i6, int i7) {
        return this.f951b.getColor(i6, i7);
    }

    public ColorStateList c(int i6) {
        int resourceId;
        ColorStateList a6;
        return (!this.f951b.hasValue(i6) || (resourceId = this.f951b.getResourceId(i6, 0)) == 0 || (a6 = e.a.a(this.f950a, resourceId)) == null) ? this.f951b.getColorStateList(i6) : a6;
    }

    public float d(int i6, float f6) {
        return this.f951b.getDimension(i6, f6);
    }

    public int e(int i6, int i7) {
        return this.f951b.getDimensionPixelOffset(i6, i7);
    }

    public int f(int i6, int i7) {
        return this.f951b.getDimensionPixelSize(i6, i7);
    }

    public Drawable g(int i6) {
        int resourceId;
        return (!this.f951b.hasValue(i6) || (resourceId = this.f951b.getResourceId(i6, 0)) == 0) ? this.f951b.getDrawable(i6) : e.a.b(this.f950a, resourceId);
    }

    public Drawable h(int i6) {
        int resourceId;
        if (!this.f951b.hasValue(i6) || (resourceId = this.f951b.getResourceId(i6, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f950a, resourceId, true);
    }

    public float i(int i6, float f6) {
        return this.f951b.getFloat(i6, f6);
    }

    public Typeface j(int i6, int i7, h.e eVar) {
        int resourceId = this.f951b.getResourceId(i6, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f952c == null) {
            this.f952c = new TypedValue();
        }
        return androidx.core.content.res.h.h(this.f950a, resourceId, this.f952c, i7, eVar);
    }

    public int k(int i6, int i7) {
        return this.f951b.getInt(i6, i7);
    }

    public int l(int i6, int i7) {
        return this.f951b.getInteger(i6, i7);
    }

    public int m(int i6, int i7) {
        return this.f951b.getLayoutDimension(i6, i7);
    }

    public int n(int i6, int i7) {
        return this.f951b.getResourceId(i6, i7);
    }

    public String o(int i6) {
        return this.f951b.getString(i6);
    }

    public CharSequence p(int i6) {
        return this.f951b.getText(i6);
    }

    public CharSequence[] q(int i6) {
        return this.f951b.getTextArray(i6);
    }

    public TypedArray r() {
        return this.f951b;
    }

    public boolean s(int i6) {
        return this.f951b.hasValue(i6);
    }

    public void w() {
        this.f951b.recycle();
    }
}
