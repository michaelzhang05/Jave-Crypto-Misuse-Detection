package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ zzea.a f15974j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzea f15975k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zzea zzeaVar, zzea.a aVar) {
        super(zzeaVar);
        this.f15975k = zzeaVar;
        this.f15974j = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.f15975k.f16092j;
        zzdnVar.N5(this.f15974j);
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    protected final void b() {
        this.f15974j.zzb(null);
    }
}
