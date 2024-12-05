package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class m0<T> extends zac {

    /* renamed from: b, reason: collision with root package name */
    protected final TaskCompletionSource<T> f10640b;

    public m0(int i2, TaskCompletionSource<T> taskCompletionSource) {
        super(i2);
        this.f10640b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public void b(Status status) {
        this.f10640b.d(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final void c(GoogleApiManager.zaa<?> zaaVar) throws DeadObjectException {
        Status a;
        Status a2;
        try {
            i(zaaVar);
        } catch (DeadObjectException e2) {
            a2 = zab.a(e2);
            b(a2);
            throw e2;
        } catch (RemoteException e3) {
            a = zab.a(e3);
            b(a);
        } catch (RuntimeException e4) {
            e(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public void e(RuntimeException runtimeException) {
        this.f10640b.d(runtimeException);
    }

    protected abstract void i(GoogleApiManager.zaa<?> zaaVar) throws RemoteException;
}
