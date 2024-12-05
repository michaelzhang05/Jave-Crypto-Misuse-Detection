package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import s0.AbstractC3711a;
import s0.C3719i;
import u0.C3799a;

/* loaded from: classes3.dex */
public final class TaskResultContracts$GetPaymentDataResult extends TaskResultContracts$GetApiTaskResult<C3719i> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    /* renamed from: e */
    public C3799a parseResult(int i8, Intent intent) {
        if (i8 != 1) {
            return super.parseResult(i8, intent);
        }
        Status a8 = AbstractC3711a.a(intent);
        if (a8 == null) {
            a8 = Status.f15090h;
        }
        return new C3799a(a8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3719i f(Intent intent) {
        return C3719i.s(intent);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult, androidx.activity.result.contract.ActivityResultContract
    public final /* bridge */ /* synthetic */ Object parseResult(int i8, Intent intent) {
        return parseResult(i8, intent);
    }
}
