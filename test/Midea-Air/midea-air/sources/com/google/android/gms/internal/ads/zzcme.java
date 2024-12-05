package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcme implements zzcka<zzbyn, zzams, zzcla> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbxo f14204b;

    public zzcme(Context context, zzbxo zzbxoVar) {
        this.a = context;
        this.f14204b = zzbxoVar;
    }

    private static boolean c(zzcxu zzcxuVar, int i2) {
        return zzcxuVar.a.a.f14576g.contains(Integer.toString(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final /* synthetic */ zzbyn a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException, zzcmw {
        zzbyt r;
        zzana B7 = zzcjyVar.f14136b.B7();
        zzand w6 = zzcjyVar.f14136b.w6();
        zzang D1 = zzcjyVar.f14136b.D1();
        if (D1 != null && c(zzcxuVar, 6)) {
            r = zzbyt.J(D1);
        } else if (B7 != null && c(zzcxuVar, 6)) {
            r = zzbyt.H(B7);
        } else if (B7 != null && c(zzcxuVar, 2)) {
            r = zzbyt.q(B7);
        } else if (w6 != null && c(zzcxuVar, 6)) {
            r = zzbyt.I(w6);
        } else if (w6 != null && c(zzcxuVar, 1)) {
            r = zzbyt.r(w6);
        } else {
            throw new zzcmw("No native ad mappers", 0);
        }
        if (zzcxuVar.a.a.f14576g.contains(Integer.toString(r.w()))) {
            zzbyw b2 = this.f14204b.b(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.a), new zzbzf(r), new zzcag(w6, B7, D1));
            zzcjyVar.f14137c.I7(b2.f());
            return b2.g();
        }
        throw new zzcmw("No corresponding native ad listener", 0);
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException {
        zzams zzamsVar = zzcjyVar.f14136b;
        IObjectWrapper i0 = ObjectWrapper.i0(this.a);
        zzxz zzxzVar = zzcxuVar.a.a.f14573d;
        String jSONObject = zzcxmVar.s.toString();
        String a = zzazc.a(zzcxmVar.p);
        zzcla zzclaVar = zzcjyVar.f14137c;
        zzcxv zzcxvVar = zzcxuVar.a.a;
        zzamsVar.K3(i0, zzxzVar, jSONObject, a, zzclaVar, zzcxvVar.f14578i, zzcxvVar.f14576g);
    }
}
