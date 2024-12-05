package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.d.f;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public class q0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f571b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f572c;

    private q0(Context context, TypedArray typedArray) {
        this.a = context;
        this.f571b = typedArray;
    }

    public static q0 t(Context context, int i2, int[] iArr) {
        return new q0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static q0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new q0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static q0 v(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new q0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.f571b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.f571b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList c2;
        return (!this.f571b.hasValue(i2) || (resourceId = this.f571b.getResourceId(i2, 0)) == 0 || (c2 = c.a.k.a.a.c(this.a, resourceId)) == null) ? this.f571b.getColorStateList(i2) : c2;
    }

    public float d(int i2, float f2) {
        return this.f571b.getDimension(i2, f2);
    }

    public int e(int i2, int i3) {
        return this.f571b.getDimensionPixelOffset(i2, i3);
    }

    public int f(int i2, int i3) {
        return this.f571b.getDimensionPixelSize(i2, i3);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (this.f571b.hasValue(i2) && (resourceId = this.f571b.getResourceId(i2, 0)) != 0) {
            return c.a.k.a.a.d(this.a, resourceId);
        }
        return this.f571b.getDrawable(i2);
    }

    public Drawable h(int i2) {
        int resourceId;
        if (!this.f571b.hasValue(i2) || (resourceId = this.f571b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return h.b().d(this.a, resourceId, true);
    }

    public float i(int i2, float f2) {
        return this.f571b.getFloat(i2, f2);
    }

    public Typeface j(int i2, int i3, f.c cVar) {
        int resourceId = this.f571b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f572c == null) {
            this.f572c = new TypedValue();
        }
        return androidx.core.content.d.f.f(this.a, resourceId, this.f572c, i3, cVar);
    }

    public int k(int i2, int i3) {
        return this.f571b.getInt(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f571b.getInteger(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.f571b.getLayoutDimension(i2, i3);
    }

    public int n(int i2, int i3) {
        return this.f571b.getResourceId(i2, i3);
    }

    public String o(int i2) {
        return this.f571b.getString(i2);
    }

    public CharSequence p(int i2) {
        return this.f571b.getText(i2);
    }

    public CharSequence[] q(int i2) {
        return this.f571b.getTextArray(i2);
    }

    public TypedArray r() {
        return this.f571b;
    }

    public boolean s(int i2) {
        return this.f571b.hasValue(i2);
    }

    public void w() {
        this.f571b.recycle();
    }
}
