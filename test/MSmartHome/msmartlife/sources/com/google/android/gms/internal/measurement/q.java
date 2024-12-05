package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Long f16014j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f16015k;
    private final /* synthetic */ String l;
    private final /* synthetic */ Bundle m;
    private final /* synthetic */ boolean n = true;
    private final /* synthetic */ boolean o;
    private final /* synthetic */ zzea p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zzea zzeaVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzeaVar);
        this.p = zzeaVar;
        this.f16014j = l;
        this.f16015k = str;
        this.l = str2;
        this.m = bundle;
        this.o = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        Long l = this.f16014j;
        long longValue = l == null ? this.f16096f : l.longValue();
        zzdnVar = this.p.f16092j;
        zzdnVar.I1(this.f16015k, this.l, this.m, this.n, this.o, longValue);
    }
}
