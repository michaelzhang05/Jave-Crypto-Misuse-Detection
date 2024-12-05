package com.stripe.android.paymentsheet;

import M5.Q;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.provider.FontsContractCompat;
import k3.i;
import kotlin.jvm.internal.AbstractC3159y;
import p3.AbstractC3601c;
import q3.AbstractC3656i;
import t2.C3787h;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExternalPaymentMethodContract extends ActivityResultContract<AbstractC3656i, AbstractC3601c> {

    /* renamed from: a, reason: collision with root package name */
    private final k3.i f25445a;

    public ExternalPaymentMethodContract(k3.i errorReporter) {
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f25445a = errorReporter;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, AbstractC3656i input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtra = new Intent().setClass(context, ExternalPaymentMethodProxyActivity.class).putExtra("external_payment_method_type", input.b()).putExtra("external_payment_method_billing_details", input.a());
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3601c parseResult(int i8, Intent intent) {
        String str;
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1) {
                    i.b.a(this.f25445a, i.f.f33443s, null, Q.e(L5.x.a(FontsContractCompat.Columns.RESULT_CODE, String.valueOf(i8))), 2, null);
                    return new AbstractC3601c.d(new IllegalArgumentException("Invalid result code returned by external payment method activity"));
                }
                if (intent != null) {
                    str = intent.getStringExtra("external_payment_method_error_message");
                } else {
                    str = null;
                }
                return new AbstractC3601c.d(new C3787h(str, "externalPaymentMethodFailure"));
            }
            return AbstractC3601c.a.f37024c;
        }
        return AbstractC3601c.C0846c.f37025c;
    }
}
