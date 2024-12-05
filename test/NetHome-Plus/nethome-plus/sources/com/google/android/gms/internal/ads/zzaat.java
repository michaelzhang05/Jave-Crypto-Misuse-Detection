package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaat extends zzfm implements zzaar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void F1(zzaau zzaauVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzaauVar);
        R(8, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final float G() throws RemoteException {
        Parcel C = C(9, u());
        float readFloat = C.readFloat();
        C.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean J0() throws RemoteException {
        Parcel C = C(12, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void f2(boolean z) throws RemoteException {
        Parcel u = u();
        zzfo.a(u, z);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final zzaau k5() throws RemoteException {
        zzaau zzaawVar;
        Parcel C = C(11, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzaawVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof zzaau) {
                zzaawVar = (zzaau) queryLocalInterface;
            } else {
                zzaawVar = new zzaaw(readStrongBinder);
            }
        }
        C.recycle();
        return zzaawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void pause() throws RemoteException {
        R(2, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int t() throws RemoteException {
        Parcel C = C(5, u());
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean u1() throws RemoteException {
        Parcel C = C(4, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void v5() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final boolean w5() throws RemoteException {
        Parcel C = C(10, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }
}
