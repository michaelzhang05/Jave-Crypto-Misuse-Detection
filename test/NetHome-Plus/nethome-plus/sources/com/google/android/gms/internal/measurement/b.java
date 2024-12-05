package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzea;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends zzea.b {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Context f15927j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f15928k;
    private final /* synthetic */ String l;
    private final /* synthetic */ Bundle m;
    private final /* synthetic */ zzea n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zzea zzeaVar, Context context, String str, String str2, Bundle bundle) {
        super(zzeaVar);
        this.n = zzeaVar;
        this.f15927j = context;
        this.f15928k = str;
        this.l = str2;
        this.m = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzea.b
    public final void a() {
        zzdn zzdnVar;
        boolean D;
        String str;
        String str2;
        String str3;
        int K;
        int J;
        zzdn zzdnVar2;
        try {
            this.n.f16088f = new HashMap();
            zzea zzeaVar = this.n;
            zzeaVar.f16092j = zzeaVar.F(this.f15927j);
            zzdnVar = this.n.f16092j;
            if (zzdnVar == null) {
                Log.w(this.n.f16084b, "Failed to connect to measurement client.");
                return;
            }
            zzea zzeaVar2 = this.n;
            D = zzea.D(this.f15928k, this.l);
            if (D) {
                String str4 = this.l;
                str2 = this.f15928k;
                str3 = str4;
                str = this.n.f16084b;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            K = zzea.K(this.f15927j);
            J = zzea.J(this.f15927j);
            zzdy zzdyVar = new zzdy(13001L, Math.max(K, J), J < K, str, str2, str3, this.m);
            zzdnVar2 = this.n.f16092j;
            zzdnVar2.i3(ObjectWrapper.i0(this.f15927j), zzdyVar, this.f16096f);
        } catch (RemoteException e2) {
            this.n.v(e2, true, false);
        }
    }
}
