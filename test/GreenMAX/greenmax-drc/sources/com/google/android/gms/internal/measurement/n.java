package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ int f15999j = 5;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f16000k;
    private final /* synthetic */ Object l;
    private final /* synthetic */ Object m;
    private final /* synthetic */ Object n;
    private final /* synthetic */ zzea o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zzea zzeaVar, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.o = zzeaVar;
        this.f16000k = str;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.o.f16092j;
        zzdnVar.W0(this.f15999j, this.f16000k, ObjectWrapper.i0(this.l), ObjectWrapper.i0(this.m), ObjectWrapper.i0(this.n));
    }
}
