package com.stripe.android.view;

import android.text.Editable;
import com.stripe.android.view.StripeEditText;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2660q implements StripeEditText.b {

    /* renamed from: a, reason: collision with root package name */
    private final StripeEditText f28958a;

    public C2660q(StripeEditText backUpTarget) {
        AbstractC3255y.i(backUpTarget, "backUpTarget");
        this.f28958a = backUpTarget;
    }

    @Override // com.stripe.android.view.StripeEditText.b
    public void a() {
        String str;
        Editable text = this.f28958a.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() > 1) {
            StripeEditText stripeEditText = this.f28958a;
            String substring = str.substring(0, str.length() - 1);
            AbstractC3255y.h(substring, "substring(...)");
            stripeEditText.setText(substring);
        }
        this.f28958a.requestFocus();
        StripeEditText stripeEditText2 = this.f28958a;
        stripeEditText2.setSelection(stripeEditText2.length());
    }
}
