package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f15941j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f15942k;
    private final /* synthetic */ zzea.a l;
    private final /* synthetic */ zzea m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zzea zzeaVar, String str, String str2, zzea.a aVar) {
        super(zzeaVar);
        this.m = zzeaVar;
        this.f15941j = str;
        this.f15942k = str2;
        this.l = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.m.f16092j;
        zzdnVar.g7(this.f15941j, this.f15942k, this.l);
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    protected final void b() {
        this.l.zzb(null);
    }
}
