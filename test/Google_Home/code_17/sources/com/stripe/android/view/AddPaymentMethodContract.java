package com.stripe.android.view;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AddPaymentMethodContract extends ActivityResultContract<C2634d, AbstractC2636e> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, C2634d input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) AddPaymentMethodActivity.class).putExtra("extra_activity_args", input);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2636e parseResult(int i8, Intent intent) {
        return AbstractC2636e.f28726a.a(intent);
    }
}
