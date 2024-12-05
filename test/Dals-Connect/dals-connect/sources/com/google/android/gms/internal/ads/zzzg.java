package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes2.dex */
public abstract class zzzg extends zzfn implements zzzf {
    public zzzg() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzyz zzyzVar = null;
        zzzy zzzyVar = null;
        switch (i2) {
            case 1:
                zzzc x1 = x1();
                parcel2.writeNoException();
                zzfo.c(parcel2, x1);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzyz) {
                        zzyzVar = (zzyz) queryLocalInterface;
                    } else {
                        zzyzVar = new zzzb(readStrongBinder);
                    }
                }
                U1(zzyzVar);
                parcel2.writeNoException();
                return true;
            case 3:
                E3(zzafj.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                n1(zzafm.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                R5(parcel.readString(), zzafs.H7(parcel.readStrongBinder()), zzafp.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                C6((zzady) zzfo.b(parcel, zzady.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzzy) {
                        zzzyVar = (zzzy) queryLocalInterface2;
                    } else {
                        zzzyVar = new zzaaa(readStrongBinder2);
                    }
                }
                C5(zzzyVar);
                parcel2.writeNoException();
                return true;
            case 8:
                Q0(zzafv.H7(parcel.readStrongBinder()), (zzyd) zzfo.b(parcel, zzyd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                O1((PublisherAdViewOptions) zzfo.b(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                Y3(zzafy.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                O3((zzaiy) zzfo.b(parcel, zzaiy.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                C2(zzajf.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
