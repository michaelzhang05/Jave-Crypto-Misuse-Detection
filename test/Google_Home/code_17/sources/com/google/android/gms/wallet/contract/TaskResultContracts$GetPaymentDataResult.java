package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import r0.AbstractC3893a;
import r0.C3901i;
import t0.C4022a;

/* loaded from: classes3.dex */
public final class TaskResultContracts$GetPaymentDataResult extends TaskResultContracts$GetApiTaskResult<C3901i> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    /* renamed from: e */
    public C4022a parseResult(int i8, Intent intent) {
        if (i8 != 1) {
            return super.parseResult(i8, intent);
        }
        Status a8 = AbstractC3893a.a(intent);
        if (a8 == null) {
            a8 = Status.f15891h;
        }
        return new C4022a(a8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3901i f(Intent intent) {
        return C3901i.p(intent);
    }

    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$GetApiTaskResult, androidx.activity.result.contract.ActivityResultContract
    public final /* bridge */ /* synthetic */ Object parseResult(int i8, Intent intent) {
        return parseResult(i8, intent);
    }
}
