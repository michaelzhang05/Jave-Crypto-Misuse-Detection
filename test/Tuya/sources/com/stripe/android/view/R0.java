package com.stripe.android.view;

import com.stripe.android.view.t0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class R0 implements t0.b {

    /* renamed from: a, reason: collision with root package name */
    private final C2437b0 f27575a;

    public R0(C2437b0 deletePaymentMethodDialogFactory) {
        AbstractC3159y.i(deletePaymentMethodDialogFactory, "deletePaymentMethodDialogFactory");
        this.f27575a = deletePaymentMethodDialogFactory;
    }

    @Override // com.stripe.android.view.t0.b
    public void a(com.stripe.android.model.o paymentMethod) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        this.f27575a.d(paymentMethod).show();
    }
}
