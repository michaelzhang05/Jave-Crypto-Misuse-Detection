package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* loaded from: classes2.dex */
final class t extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Activity f16029j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ Bundle f16030k;
    private final /* synthetic */ zzea.c l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zzea.c cVar, Activity activity, Bundle bundle) {
        super(zzea.this);
        this.l = cVar;
        this.f16029j = activity;
        this.f16030k = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = zzea.this.f16092j;
        zzdnVar.m6(ObjectWrapper.i0(this.f16029j), this.f16030k, this.f16097g);
    }
}
