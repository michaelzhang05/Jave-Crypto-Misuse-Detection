package com.stripe.android.paymentsheet;

import P5.Q;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.provider.FontsContractCompat;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;
import s3.AbstractC3995c;
import t3.AbstractC4035i;
import w2.C4141h;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExternalPaymentMethodContract extends ActivityResultContract<AbstractC4035i, AbstractC3995c> {

    /* renamed from: a, reason: collision with root package name */
    private final n3.i f26500a;

    public ExternalPaymentMethodContract(n3.i errorReporter) {
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f26500a = errorReporter;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, AbstractC4035i input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtra = new Intent().setClass(context, ExternalPaymentMethodProxyActivity.class).putExtra("external_payment_method_type", input.b()).putExtra("external_payment_method_billing_details", input.a());
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3995c parseResult(int i8, Intent intent) {
        String str;
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1) {
                    i.b.a(this.f26500a, i.f.f35435s, null, Q.e(O5.x.a(FontsContractCompat.Columns.RESULT_CODE, String.valueOf(i8))), 2, null);
                    return new AbstractC3995c.d(new IllegalArgumentException("Invalid result code returned by external payment method activity"));
                }
                if (intent != null) {
                    str = intent.getStringExtra("external_payment_method_error_message");
                } else {
                    str = null;
                }
                return new AbstractC3995c.d(new C4141h(str, "externalPaymentMethodFailure"));
            }
            return AbstractC3995c.a.f39223c;
        }
        return AbstractC3995c.C0877c.f39224c;
    }
}
