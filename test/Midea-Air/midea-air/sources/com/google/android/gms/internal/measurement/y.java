package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* loaded from: classes2.dex */
final class y extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Activity f16056j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzea.a f16057k;
    private final /* synthetic */ zzea.c l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(zzea.c cVar, Activity activity, zzea.a aVar) {
        super(zzea.this);
        this.l = cVar;
        this.f16056j = activity;
        this.f16057k = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = zzea.this.f16092j;
        zzdnVar.R0(ObjectWrapper.i0(this.f16056j), this.f16057k, this.f16097g);
    }
}
