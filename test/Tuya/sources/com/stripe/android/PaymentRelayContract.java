package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.a;
import com.stripe.android.view.PaymentRelayActivity;
import f3.C2662c;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentRelayContract extends ActivityResultContract<a.AbstractC0444a, C2662c> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a.AbstractC0444a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        C2662c c8 = input.c();
        if (c8 == null) {
            c8 = new C2662c(null, 0, null, false, null, null, null, 127, null);
        }
        Intent putExtras = new Intent(context, (Class<?>) PaymentRelayActivity.class).putExtras(c8.o());
        AbstractC3159y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2662c parseResult(int i8, Intent intent) {
        return C2662c.f31012h.b(intent);
    }
}
