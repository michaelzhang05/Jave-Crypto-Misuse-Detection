package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f15956j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzea f15957k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zzea zzeaVar, String str) {
        super(zzeaVar);
        this.f15957k = zzeaVar;
        this.f15956j = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.f15957k.f16092j;
        zzdnVar.B6(this.f15956j, this.f16097g);
    }
}