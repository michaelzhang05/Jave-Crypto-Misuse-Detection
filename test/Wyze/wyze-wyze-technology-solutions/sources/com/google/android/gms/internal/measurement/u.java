package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* loaded from: classes2.dex */
final class u extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Activity f16031j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzea.c f16032k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zzea.c cVar, Activity activity) {
        super(zzea.this);
        this.f16032k = cVar;
        this.f16031j = activity;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = zzea.this.f16092j;
        zzdnVar.A6(ObjectWrapper.i0(this.f16031j), this.f16097g);
    }
}
