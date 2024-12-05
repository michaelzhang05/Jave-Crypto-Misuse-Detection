package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;

/* loaded from: classes2.dex */
public final class SignInButtonImpl extends Button {
    public SignInButtonImpl(Context context) {
        this(context, null);
    }

    private static int b(int i2, int i3, int i4, int i5) {
        if (i2 == 0) {
            return i3;
        }
        if (i2 == 1) {
            return i4;
        }
        if (i2 == 2) {
            return i5;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(Resources resources, int i2, int i3) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i4 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i4);
        setMinWidth(i4);
        int i5 = R.drawable.f10476b;
        int i6 = R.drawable.f10477c;
        int b2 = b(i3, i5, i6, i6);
        int i7 = R.drawable.f10478d;
        int i8 = R.drawable.f10479e;
        int b3 = b(i3, i7, i8, i8);
        if (i2 == 0 || i2 == 1) {
            b2 = b3;
        } else if (i2 != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
        Drawable r = androidx.core.graphics.drawable.a.r(resources.getDrawable(b2));
        androidx.core.graphics.drawable.a.o(r, resources.getColorStateList(R.color.f10475c));
        androidx.core.graphics.drawable.a.p(r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r);
        int i9 = R.color.a;
        int i10 = R.color.f10474b;
        setTextColor((ColorStateList) Preconditions.j(resources.getColorStateList(b(i3, i9, i10, i10))));
        if (i2 == 0) {
            setText(resources.getString(R.string.p));
        } else if (i2 == 1) {
            setText(resources.getString(R.string.q));
        } else if (i2 == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod(null);
        if (DeviceProperties.d(getContext())) {
            setGravity(19);
        }
    }

    public SignInButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, android.R.attr.buttonStyle);
    }
}
