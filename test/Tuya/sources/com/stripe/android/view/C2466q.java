package com.stripe.android.view;

import android.text.Editable;
import com.stripe.android.view.StripeEditText;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2466q implements StripeEditText.b {

    /* renamed from: a, reason: collision with root package name */
    private final StripeEditText f27903a;

    public C2466q(StripeEditText backUpTarget) {
        AbstractC3159y.i(backUpTarget, "backUpTarget");
        this.f27903a = backUpTarget;
    }

    @Override // com.stripe.android.view.StripeEditText.b
    public void a() {
        String str;
        Editable text = this.f27903a.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() > 1) {
            StripeEditText stripeEditText = this.f27903a;
            String substring = str.substring(0, str.length() - 1);
            AbstractC3159y.h(substring, "substring(...)");
            stripeEditText.setText(substring);
        }
        this.f27903a.requestFocus();
        StripeEditText stripeEditText2 = this.f27903a;
        stripeEditText2.setSelection(stripeEditText2.length());
    }
}
