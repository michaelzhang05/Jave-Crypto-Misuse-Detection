package com.stripe.android.stripe3ds2.transaction;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class ChallengeContract extends ActivityResultContract<com.stripe.android.stripe3ds2.views.d, h> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, com.stripe.android.stripe3ds2.views.d input) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtras = new Intent(context, (Class<?>) ChallengeActivity.class).putExtras(input.u());
        AbstractC3255y.h(putExtras, "putExtras(...)");
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h parseResult(int i8, Intent intent) {
        return h.f27892a.a(intent);
    }
}
