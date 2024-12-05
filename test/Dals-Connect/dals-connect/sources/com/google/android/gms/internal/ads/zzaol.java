package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaol extends zzfm implements zzaoj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    public final void I0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    public final void j(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(2, u);
    }
}
