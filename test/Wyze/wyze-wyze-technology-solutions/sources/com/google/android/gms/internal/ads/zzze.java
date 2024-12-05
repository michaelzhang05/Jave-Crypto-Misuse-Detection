package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzze extends zzfm implements zzzc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final String M() throws RemoteException {
        Parcel C = C(4, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean U() throws RemoteException {
        Parcel C = C(3, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void U5(zzxz zzxzVar, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzxzVar);
        u.writeInt(i2);
        R(5, u);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void a2(zzxz zzxzVar) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzxzVar);
        R(1, u);
    }
}
