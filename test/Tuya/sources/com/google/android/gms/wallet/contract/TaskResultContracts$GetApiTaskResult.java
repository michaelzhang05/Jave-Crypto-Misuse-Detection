package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import u0.C3799a;

/* loaded from: classes3.dex */
public abstract class TaskResultContracts$GetApiTaskResult<T> extends TaskResultContracts$ResolveApiTaskResult<T, C3799a> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$ResolveApiTaskResult
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C3799a c(Task task) {
        if (task.n()) {
            return new C3799a(task.j(), Status.f15088f);
        }
        if (task.l()) {
            return new C3799a(new Status(16, "The task has been canceled."));
        }
        Status status = this.f16991a;
        if (status != null) {
            return new C3799a(status);
        }
        return new C3799a(Status.f15090h);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C3799a parseResult(int i8, Intent intent) {
        Object obj;
        if (i8 != -1) {
            if (i8 != 0) {
                return new C3799a(null, Status.f15090h);
            }
            return new C3799a(null, Status.f15092j);
        }
        if (intent != null) {
            obj = f(intent);
        } else {
            obj = null;
        }
        if (obj != null) {
            return new C3799a(obj, Status.f15088f);
        }
        return new C3799a(null, Status.f15090h);
    }

    protected abstract Object f(Intent intent);
}
