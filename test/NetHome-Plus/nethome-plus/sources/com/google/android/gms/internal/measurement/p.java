package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f16008j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ zzea.a f16009k;
    private final /* synthetic */ zzea l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zzea zzeaVar, String str, zzea.a aVar) {
        super(zzeaVar);
        this.l = zzeaVar;
        this.f16008j = str;
        this.f16009k = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.l.f16092j;
        zzdnVar.M1(this.f16008j, this.f16009k);
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    protected final void b() {
        this.f16009k.zzb(null);
    }
}
