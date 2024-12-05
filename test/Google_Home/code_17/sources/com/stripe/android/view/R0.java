package com.stripe.android.view;

import com.stripe.android.view.t0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class R0 implements t0.b {

    /* renamed from: a, reason: collision with root package name */
    private final C2631b0 f28630a;

    public R0(C2631b0 deletePaymentMethodDialogFactory) {
        AbstractC3255y.i(deletePaymentMethodDialogFactory, "deletePaymentMethodDialogFactory");
        this.f28630a = deletePaymentMethodDialogFactory;
    }

    @Override // com.stripe.android.view.t0.b
    public void a(com.stripe.android.model.o paymentMethod) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        this.f28630a.d(paymentMethod).show();
    }
}
