package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* loaded from: classes2.dex */
public final class zaf extends m0<Void> {

    /* renamed from: c, reason: collision with root package name */
    private final RegisterListenerMethod<Api.AnyClient, ?> f10723c;

    /* renamed from: d, reason: collision with root package name */
    private final UnregisterListenerMethod<Api.AnyClient, ?> f10724d;

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
        return this.f10723c.c();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean h(GoogleApiManager.zaa<?> zaaVar) {
        return this.f10723c.e();
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final void i(GoogleApiManager.zaa<?> zaaVar) throws RemoteException {
        this.f10723c.d(zaaVar.l(), this.f10640b);
        if (this.f10723c.b() != null) {
            zaaVar.v().put(this.f10723c.b(), new zabw(this.f10723c, this.f10724d));
        }
    }
}
