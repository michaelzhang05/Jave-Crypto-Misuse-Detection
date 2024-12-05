package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f15936j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f15937k;
    private final /* synthetic */ Bundle l;
    private final /* synthetic */ zzea m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zzea zzeaVar, String str, String str2, Bundle bundle) {
        super(zzeaVar);
        this.m = zzeaVar;
        this.f15936j = str;
        this.f15937k = str2;
        this.l = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.m.f16092j;
        zzdnVar.Z(this.f15936j, this.f15937k, this.l);
    }
}
