package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.w;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.n0;
import com.google.android.material.button.MaterialButton;
import p2.c;
import y2.a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends w {
    @Override // androidx.appcompat.app.w
    protected d c(Context context, AttributeSet attributeSet) {
        return new com.google.android.material.textfield.w(context, attributeSet);
    }

    @Override // androidx.appcompat.app.w
    protected f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.w
    protected g e(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.appcompat.app.w
    protected n0 k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.w
    protected k1 o(Context context, AttributeSet attributeSet) {
        return new e3.a(context, attributeSet);
    }
}
