package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ zzea.a f15976j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzea f15977k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zzea zzeaVar, zzea.a aVar) {
        super(zzeaVar);
        this.f15977k = zzeaVar;
        this.f15976j = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.f15977k.f16092j;
        zzdnVar.c1(this.f15976j);
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    protected final void b() {
        this.f15976j.zzb(null);
    }
}
