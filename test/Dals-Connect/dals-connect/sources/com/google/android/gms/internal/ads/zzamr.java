package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzamr extends zzfm implements zzamp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    public final zzams D6(String str) throws RemoteException {
        zzams zzamuVar;
        Parcel u = u();
        u.writeString(str);
        Parcel C = C(1, u);
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzamuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof zzams) {
                zzamuVar = (zzams) queryLocalInterface;
            } else {
                zzamuVar = new zzamu(readStrongBinder);
            }
        }
        C.recycle();
        return zzamuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    public final zzaov F2(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        Parcel C = C(3, u);
        zzaov H7 = zzaow.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    public final boolean m7(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        Parcel C = C(2, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }
}
