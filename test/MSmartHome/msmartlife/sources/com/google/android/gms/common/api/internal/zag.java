package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zag<ResultT> extends zac {

    /* renamed from: b, reason: collision with root package name */
    private final TaskApiCall<Api.AnyClient, ResultT> f10725b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource<ResultT> f10726c;

    /* renamed from: d, reason: collision with root package name */
    private final StatusExceptionMapper f10727d;

    @Override // com.google.android.gms.common.api.internal.zab
    public final void b(Status status) {
        this.f10726c.d(this.f10727d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final void c(GoogleApiManager.zaa<?> zaaVar) throws DeadObjectException {
        Status a;
        try {
            this.f10725b.a(zaaVar.l(), this.f10726c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a = zab.a(e3);
            b(a);
        } catch (RuntimeException e4) {
            e(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final void d(zaab zaabVar, boolean z) {
        zaabVar.c(this.f10726c, z);
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final void e(RuntimeException runtimeException) {
        this.f10726c.d(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(GoogleApiManager.zaa<?> zaaVar) {
        return this.f10725b.c();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean h(GoogleApiManager.zaa<?> zaaVar) {
        return this.f10725b.b();
    }
}
