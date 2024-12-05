package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Activity f15949j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f15950k;
    private final /* synthetic */ String l;
    private final /* synthetic */ zzea m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zzea zzeaVar, Activity activity, String str, String str2) {
        super(zzeaVar);
        this.m = zzeaVar;
        this.f15949j = activity;
        this.f15950k = str;
        this.l = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.m.f16092j;
        zzdnVar.C0(ObjectWrapper.i0(this.f15949j), this.f15950k, this.l, this.f16096f);
    }
}
