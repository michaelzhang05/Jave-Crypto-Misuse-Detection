package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzamw extends zzfn implements zzamv {
    public zzamw() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzamv H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzamv) {
            return (zzamv) queryLocalInterface;
        }
        return new zzamx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzamy zzamzVar;
        switch (i2) {
            case 1:
                onAdClicked();
                break;
            case 2:
                onAdClosed();
                break;
            case 3:
                onAdFailedToLoad(parcel.readInt());
                break;
            case 4:
                onAdLeftApplication();
                break;
            case 5:
                onAdOpened();
                break;
            case 6:
                onAdLoaded();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzamzVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzamy) {
                        zzamzVar = (zzamy) queryLocalInterface;
                    } else {
                        zzamzVar = new zzamz(readStrongBinder);
                    }
                }
                U0(zzamzVar);
                break;
            case 8:
                onAdImpression();
                break;
            case 9:
                onAppEvent(parcel.readString(), parcel.readString());
                break;
            case 10:
                j0(zzaff.H7(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                S();
                break;
            case 12:
                h3(parcel.readString());
                break;
            case 13:
                H0();
                break;
            case 14:
                G5((zzato) zzfo.b(parcel, zzato.CREATOR));
                break;
            case 15:
                onVideoPause();
                break;
            case 16:
                Y(zzatr.H7(parcel.readStrongBinder()));
                break;
            case 17:
                E(parcel.readInt());
                break;
            case 18:
                h7();
                break;
            case 19:
                zzb((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                break;
            case 20:
                onVideoPlay();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
