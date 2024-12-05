package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f15992j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f15993k;
    private final /* synthetic */ boolean l;
    private final /* synthetic */ zzea.a m;
    private final /* synthetic */ zzea n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zzea zzeaVar, String str, String str2, boolean z, zzea.a aVar) {
        super(zzeaVar);
        this.n = zzeaVar;
        this.f15992j = str;
        this.f15993k = str2;
        this.l = z;
        this.m = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    final void a() throws RemoteException {
        zzdn zzdnVar;
        zzdnVar = this.n.f16092j;
        zzdnVar.j4(this.f15992j, this.f15993k, this.l, this.m);
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    protected final void b() {
        this.m.zzb(null);
    }
}
