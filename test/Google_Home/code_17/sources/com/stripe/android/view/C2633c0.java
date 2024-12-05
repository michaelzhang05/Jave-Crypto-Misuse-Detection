package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.StripeEditText;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2633c0 implements StripeEditText.c {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f28710a;

    public C2633c0(TextInputLayout textInputLayout) {
        AbstractC3255y.i(textInputLayout, "textInputLayout");
        this.f28710a = textInputLayout;
    }

    @Override // com.stripe.android.view.StripeEditText.c
    public void a(String str) {
        if (str == null) {
            this.f28710a.setError(null);
            this.f28710a.setErrorEnabled(false);
        } else {
            this.f28710a.setError(str);
        }
    }
}
