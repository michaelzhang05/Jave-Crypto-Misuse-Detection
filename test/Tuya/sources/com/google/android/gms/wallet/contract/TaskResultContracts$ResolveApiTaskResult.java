package com.google.android.gms.wallet.contract;

import P.b;
import P.i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public abstract class TaskResultContracts$ResolveApiTaskResult<I, O> extends ActivityResultContract<Task, O> {

    /* renamed from: a, reason: collision with root package name */
    Status f16991a;

    /* renamed from: b, reason: collision with root package name */
    private PendingIntent f16992b;

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Task task) {
        return new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, new IntentSenderRequest.Builder(this.f16992b).build());
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityResultContract.SynchronousResult getSynchronousResult(Context context, Task task) {
        if (task.m()) {
            Exception i8 = task.i();
            if (i8 instanceof b) {
                this.f16991a = ((b) i8).a();
                if (i8 instanceof i) {
                    this.f16992b = ((i) i8).b();
                }
            }
            if (this.f16992b == null) {
                return new ActivityResultContract.SynchronousResult(c(task));
            }
            return null;
        }
        throw new IllegalArgumentException("The task has to be executed before using this API to resolve its result.");
    }

    protected abstract Object c(Task task);
}
