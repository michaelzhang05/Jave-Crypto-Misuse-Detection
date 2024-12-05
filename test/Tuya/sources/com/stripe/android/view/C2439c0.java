package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.StripeEditText;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2439c0 implements StripeEditText.c {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f27655a;

    public C2439c0(TextInputLayout textInputLayout) {
        AbstractC3159y.i(textInputLayout, "textInputLayout");
        this.f27655a = textInputLayout;
    }

    @Override // com.stripe.android.view.StripeEditText.c
    public void a(String str) {
        if (str == null) {
            this.f27655a.setError(null);
            this.f27655a.setErrorEnabled(false);
        } else {
            this.f27655a.setError(str);
        }
    }
}
