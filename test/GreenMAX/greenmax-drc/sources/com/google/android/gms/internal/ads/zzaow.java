package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaow extends zzfn implements zzaov {
    public zzaow() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzaov H7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzaov) {
            return (zzaov) queryLocalInterface;
        }
        return new zzaox(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaoy zzapaVar;
        zzaoy zzaoyVar;
        zzaoj zzaojVar = null;
        zzaop zzaorVar = null;
        zzaos zzaouVar = null;
        zzaom zzaooVar = null;
        if (i2 == 1) {
            IObjectWrapper C = IObjectWrapper.Stub.C(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzfo.b(parcel, creator);
            Bundle bundle2 = (Bundle) zzfo.b(parcel, creator);
            zzyd zzydVar = (zzyd) zzfo.b(parcel, zzyd.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaoyVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface instanceof zzaoy) {
                    zzapaVar = (zzaoy) queryLocalInterface;
                } else {
                    zzapaVar = new zzapa(readStrongBinder);
                }
                zzaoyVar = zzapaVar;
            }
            p3(C, readString, bundle, bundle2, zzydVar, zzaoyVar);
            parcel2.writeNoException();
        } else if (i2 == 2) {
            zzapj s6 = s6();
            parcel2.writeNoException();
            zzfo.g(parcel2, s6);
        } else if (i2 == 3) {
            zzapj t5 = t5();
            parcel2.writeNoException();
            zzfo.g(parcel2, t5);
        } else if (i2 == 5) {
            zzaar videoController = getVideoController();
            parcel2.writeNoException();
            zzfo.c(parcel2, videoController);
        } else if (i2 == 10) {
            k3(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i2 != 11) {
            switch (i2) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzxz zzxzVar = (zzxz) zzfo.b(parcel, zzxz.CREATOR);
                    IObjectWrapper C2 = IObjectWrapper.Stub.C(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface2 instanceof zzaoj) {
                            zzaojVar = (zzaoj) queryLocalInterface2;
                        } else {
                            zzaojVar = new zzaol(readStrongBinder2);
                        }
                    }
                    R4(readString2, readString3, zzxzVar, C2, zzaojVar, zzamw.H7(parcel.readStrongBinder()), (zzyd) zzfo.b(parcel, zzyd.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzxz zzxzVar2 = (zzxz) zzfo.b(parcel, zzxz.CREATOR);
                    IObjectWrapper C3 = IObjectWrapper.Stub.C(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        if (queryLocalInterface3 instanceof zzaom) {
                            zzaooVar = (zzaom) queryLocalInterface3;
                        } else {
                            zzaooVar = new zzaoo(readStrongBinder3);
                        }
                    }
                    T6(readString4, readString5, zzxzVar2, C3, zzaooVar, zzamw.H7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean l2 = l2(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzfo.a(parcel2, l2);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzxz zzxzVar3 = (zzxz) zzfo.b(parcel, zzxz.CREATOR);
                    IObjectWrapper C4 = IObjectWrapper.Stub.C(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface4 instanceof zzaos) {
                            zzaouVar = (zzaos) queryLocalInterface4;
                        } else {
                            zzaouVar = new zzaou(readStrongBinder4);
                        }
                    }
                    s5(readString6, readString7, zzxzVar3, C4, zzaouVar, zzamw.H7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean B2 = B2(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzfo.a(parcel2, B2);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzxz zzxzVar4 = (zzxz) zzfo.b(parcel, zzxz.CREATOR);
                    IObjectWrapper C5 = IObjectWrapper.Stub.C(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface5 instanceof zzaop) {
                            zzaorVar = (zzaop) queryLocalInterface5;
                        } else {
                            zzaorVar = new zzaor(readStrongBinder5);
                        }
                    }
                    e4(readString8, readString9, zzxzVar4, C5, zzaorVar, zzamw.H7(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            u5(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
