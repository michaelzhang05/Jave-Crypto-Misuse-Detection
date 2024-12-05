package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Bundle f16002j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzea.a f16003k;
    private final /* synthetic */ zzea l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zzea zzeaVar, Bundle bundle, zzea.a aVar) {
        super(zzeaVar);
        this.l = zzeaVar;
        this.f16002j = bundle;
        this.f16003k = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.l.f16092j;
        zzdnVar.T0(this.f16002j, this.f16003k, this.f16096f);
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    protected final void b() {
        this.f16003k.zzb(null);
    }
}
