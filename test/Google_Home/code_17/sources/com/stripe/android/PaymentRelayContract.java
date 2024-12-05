package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.a;
import com.stripe.android.view.PaymentRelayActivity;
import i3.C2980c;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentRelayContract extends ActivityResultContract<a.AbstractC0440a, C2980c> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a.AbstractC0440a input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        C2980c b8 = input.b();
        if (b8 == null) {
            b8 = new C2980c(null, 0, null, false, null, null, null, 127, null);
        }
        Intent putExtras = new Intent(context, (Class<?>) PaymentRelayActivity.class).putExtras(b8.u());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2980c parseResult(int i8, Intent intent) {
        return C2980c.f32875h.b(intent);
    }
}
