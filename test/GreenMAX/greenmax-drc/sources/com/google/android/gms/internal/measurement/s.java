package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Bundle f16026j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzea f16027k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(zzea zzeaVar, Bundle bundle) {
        super(zzeaVar);
        this.f16027k = zzeaVar;
        this.f16026j = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.f16027k.f16092j;
        zzdnVar.v0(this.f16026j, this.f16096f);
    }
}
