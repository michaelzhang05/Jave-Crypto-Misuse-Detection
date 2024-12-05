package com.google.android.gms.wallet.contract;

import android.content.Intent;
import s0.C3719i;

/* loaded from: classes3.dex */
public final class TaskResultContracts$GetPaymentData extends TaskResultContracts$UnpackApiTaskResult<C3719i> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C3719i parseResult(int i8, Intent intent) {
        if (intent != null) {
            return C3719i.s(intent);
        }
        return null;
    }
}
