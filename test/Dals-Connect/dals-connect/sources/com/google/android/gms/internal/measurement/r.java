package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f16017j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f16018k;
    private final /* synthetic */ Object l;
    private final /* synthetic */ boolean m = true;
    private final /* synthetic */ zzea n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(zzea zzeaVar, String str, String str2, Object obj, boolean z) {
        super(zzeaVar);
        this.n = zzeaVar;
        this.f16017j = str;
        this.f16018k = str2;
        this.l = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.n.f16092j;
        zzdnVar.W2(this.f16017j, this.f16018k, ObjectWrapper.i0(this.l), this.m, this.f16096f);
    }
}
