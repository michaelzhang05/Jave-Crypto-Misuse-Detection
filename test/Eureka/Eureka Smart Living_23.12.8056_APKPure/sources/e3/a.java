package e3;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.k1;
import m2.j;
import z2.b;
import z2.c;

/* loaded from: classes.dex */
public class a extends k1 {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void r(Resources.Theme theme, int i6) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i6, j.f7795n3);
        int v5 = v(getContext(), obtainStyledAttributes, j.f7809p3, j.f7816q3);
        obtainStyledAttributes.recycle();
        if (v5 >= 0) {
            setLineHeight(v5);
        }
    }

    private static boolean s(Context context) {
        return b.b(context, m2.a.L, true);
    }

    private static int t(Resources.Theme theme, AttributeSet attributeSet, int i6, int i7) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f7823r3, i6, i7);
        int resourceId = obtainStyledAttributes.getResourceId(j.f7829s3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void u(AttributeSet attributeSet, int i6, int i7) {
        int t5;
        Context context = getContext();
        if (s(context)) {
            Resources.Theme theme = context.getTheme();
            if (w(context, theme, attributeSet, i6, i7) || (t5 = t(theme, attributeSet, i6, i7)) == -1) {
                return;
            }
            r(theme, t5);
        }
    }

    private static int v(Context context, TypedArray typedArray, int... iArr) {
        int i6 = -1;
        for (int i7 = 0; i7 < iArr.length && i6 < 0; i7++) {
            i6 = c.c(context, typedArray, iArr[i7], -1);
        }
        return i6;
    }

    private static boolean w(Context context, Resources.Theme theme, AttributeSet attributeSet, int i6, int i7) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f7823r3, i6, i7);
        int v5 = v(context, obtainStyledAttributes, j.f7835t3, j.f7841u3);
        obtainStyledAttributes.recycle();
        return v5 != -1;
    }

    @Override // androidx.appcompat.widget.k1, android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        if (s(context)) {
            r(context.getTheme(), i6);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i6) {
        super(f3.a.c(context, attributeSet, i6, 0), attributeSet, i6);
        u(attributeSet, i6, 0);
    }
}
