package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzzl extends zzfn implements zzzk {
    public zzzl() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzzk H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzzk) {
            return (zzzk) queryLocalInterface;
        }
        return new zzzm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzyz zzyzVar = null;
        zzzp zzzpVar = null;
        zzzy zzzyVar = null;
        zzyw zzywVar = null;
        zzzs zzzsVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper w0 = w0();
                parcel2.writeNoException();
                zzfo.c(parcel2, w0);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean p = p();
                parcel2.writeNoException();
                zzfo.a(parcel2, p);
                return true;
            case 4:
                boolean Q4 = Q4((zzxz) zzfo.b(parcel, zzxz.CREATOR));
                parcel2.writeNoException();
                zzfo.a(parcel2, Q4);
                return true;
            case 5:
                pause();
                parcel2.writeNoException();
                return true;
            case 6:
                resume();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzyz) {
                        zzyzVar = (zzyz) queryLocalInterface;
                    } else {
                        zzyzVar = new zzzb(readStrongBinder);
                    }
                }
                p0(zzyzVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzzs) {
                        zzzsVar = (zzzs) queryLocalInterface2;
                    } else {
                        zzzsVar = new zzzu(readStrongBinder2);
                    }
                }
                g6(zzzsVar);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                k4();
                parcel2.writeNoException();
                return true;
            case 11:
                S6();
                parcel2.writeNoException();
                return true;
            case 12:
                zzyd Q5 = Q5();
                parcel2.writeNoException();
                zzfo.g(parcel2, Q5);
                return true;
            case 13:
                q2((zzyd) zzfo.b(parcel, zzyd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                n6(zzaqo.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                z3(zzaqu.H7(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 19:
                f7(zzadp.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzyw) {
                        zzywVar = (zzyw) queryLocalInterface3;
                    } else {
                        zzywVar = new zzyy(readStrongBinder3);
                    }
                }
                C4(zzywVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzzy) {
                        zzzyVar = (zzzy) queryLocalInterface4;
                    } else {
                        zzzyVar = new zzaaa(readStrongBinder4);
                    }
                }
                A4(zzzyVar);
                parcel2.writeNoException();
                return true;
            case 22:
                i1(zzfo.e(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean U = U();
                parcel2.writeNoException();
                zzfo.a(parcel2, U);
                return true;
            case 24:
                P(zzatc.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.c(parcel2, videoController);
                return true;
            case 29:
                x7((zzacd) zzfo.b(parcel, zzacd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                q6((zzaax) zzfo.b(parcel, zzaax.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String x6 = x6();
                parcel2.writeNoException();
                parcel2.writeString(x6);
                return true;
            case 32:
                zzzs P4 = P4();
                parcel2.writeNoException();
                zzfo.c(parcel2, P4);
                return true;
            case 33:
                zzyz K5 = K5();
                parcel2.writeNoException();
                zzfo.c(parcel2, K5);
                return true;
            case 34:
                setImmersiveMode(zzfo.e(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String M = M();
                parcel2.writeNoException();
                parcel2.writeString(M);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzzp) {
                        zzzpVar = (zzzp) queryLocalInterface5;
                    } else {
                        zzzpVar = new zzzr(readStrongBinder5);
                    }
                }
                c0(zzzpVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzfo.g(parcel2, adMetadata);
                return true;
            case 38:
                m4(parcel.readString());
                parcel2.writeNoException();
                return true;
        }
    }
}
