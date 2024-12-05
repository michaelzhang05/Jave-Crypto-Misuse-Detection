package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaas extends zzfn implements zzaar {
    public zzaas() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzaar H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof zzaar) {
            return (zzaar) queryLocalInterface;
        }
        return new zzaat(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaau zzaawVar;
        switch (i2) {
            case 1:
                v5();
                parcel2.writeNoException();
                return true;
            case 2:
                pause();
                parcel2.writeNoException();
                return true;
            case 3:
                f2(zzfo.e(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean u1 = u1();
                parcel2.writeNoException();
                zzfo.a(parcel2, u1);
                return true;
            case 5:
                int t = t();
                parcel2.writeNoException();
                parcel2.writeInt(t);
                return true;
            case 6:
                float q7 = q7();
                parcel2.writeNoException();
                parcel2.writeFloat(q7);
                return true;
            case 7:
                float j6 = j6();
                parcel2.writeNoException();
                parcel2.writeFloat(j6);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
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
                F1(zzaawVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float G = G();
                parcel2.writeNoException();
                parcel2.writeFloat(G);
                return true;
            case 10:
                boolean w5 = w5();
                parcel2.writeNoException();
                zzfo.a(parcel2, w5);
                return true;
            case 11:
                zzaau k5 = k5();
                parcel2.writeNoException();
                zzfo.c(parcel2, k5);
                return true;
            case 12:
                boolean J0 = J0();
                parcel2.writeNoException();
                zzfo.a(parcel2, J0);
                return true;
            default:
                return false;
        }
    }
}
