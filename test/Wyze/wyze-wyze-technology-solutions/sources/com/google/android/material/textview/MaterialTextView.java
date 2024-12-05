package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.t;
import com.google.android.material.theme.a.a;
import e.e.b.b.l;
import e.e.b.b.w.b;
import e.e.b.b.w.c;

/* loaded from: classes2.dex */
public class MaterialTextView extends t {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void f(Resources.Theme theme, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i2, l.z3);
        int i3 = i(getContext(), obtainStyledAttributes, l.A3, l.B3);
        obtainStyledAttributes.recycle();
        if (i3 >= 0) {
            setLineHeight(i3);
        }
    }

    private static boolean g(Context context) {
        return b.b(context, e.e.b.b.b.H, true);
    }

    private static int h(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.C3, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(l.D3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int i(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            i2 = c.c(context, typedArray, iArr[i3], -1);
        }
        return i2;
    }

    private static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.C3, i2, i3);
        int i4 = i(context, obtainStyledAttributes, l.E3, l.F3);
        obtainStyledAttributes.recycle();
        return i4 != -1;
    }

    @Override // androidx.appcompat.widget.t, android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (g(context)) {
            f(context.getTheme(), i2);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(a.c(context, attributeSet, i2, i3), attributeSet, i2);
        int h2;
        Context context2 = getContext();
        if (g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (j(context2, theme, attributeSet, i2, i3) || (h2 = h(theme, attributeSet, i2, i3)) == -1) {
                return;
            }
            f(theme, h2);
        }
    }
}
