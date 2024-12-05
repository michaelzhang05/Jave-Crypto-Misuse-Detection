package com.google.android.gms.wallet.contract;

import android.content.Intent;
import r0.C3901i;

/* loaded from: classes3.dex */
public final class TaskResultContracts$GetPaymentData extends TaskResultContracts$UnpackApiTaskResult<C3901i> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C3901i parseResult(int i8, Intent intent) {
        if (intent != null) {
            return C3901i.p(intent);
        }
        return null;
    }
}
