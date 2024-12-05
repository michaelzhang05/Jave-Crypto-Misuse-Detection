package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zah extends m0<Boolean> {

    /* renamed from: c, reason: collision with root package name */
    private final ListenerHolder.ListenerKey<?> f10728c;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f10728c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.m0, com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void b(Status status) {
        super.b(status);
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void d(zaab zaabVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.m0, com.google.android.gms.common.api.internal.zab
    public final /* bridge */ /* synthetic */ void e(RuntimeException runtimeException) {
        super.e(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(GoogleApiManager.zaa<?> zaaVar) {
        zabw zabwVar = zaaVar.v().get(this.f10728c);
        if (zabwVar == null) {
            return null;
        }
        return zabwVar.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean h(GoogleApiManager.zaa<?> zaaVar) {
        zabw zabwVar = zaaVar.v().get(this.f10728c);
        return zabwVar != null && zabwVar.a.e();
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void i(GoogleApiManager.zaa<?> zaaVar) throws RemoteException {
        zabw remove = zaaVar.v().remove(this.f10728c);
        if (remove != null) {
            remove.f10705b.a(zaaVar.l(), this.f10640b);
            remove.a.a();
        } else {
            this.f10640b.e(Boolean.FALSE);
        }
    }
}
