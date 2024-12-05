package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzagh extends zzfn implements zzagg {
    public zzagh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzagd zzagfVar;
        switch (i2) {
            case 2:
                String b2 = b();
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            case 3:
                List f2 = f();
                parcel2.writeNoException();
                parcel2.writeList(f2);
                return true;
            case 4:
                String d2 = d();
                parcel2.writeNoException();
                parcel2.writeString(d2);
                return true;
            case 5:
                zzaei h2 = h();
                parcel2.writeNoException();
                zzfo.c(parcel2, h2);
                return true;
            case 6:
                String c2 = c();
                parcel2.writeNoException();
                parcel2.writeString(c2);
                return true;
            case 7:
                String m = m();
                parcel2.writeNoException();
                parcel2.writeString(m);
                return true;
            case 8:
                double l = l();
                parcel2.writeNoException();
                parcel2.writeDouble(l);
                return true;
            case 9:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 10:
                String i4 = i();
                parcel2.writeNoException();
                parcel2.writeString(i4);
                return true;
            case 11:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.c(parcel2, videoController);
                return true;
            case 12:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                zzaea a = a();
                parcel2.writeNoException();
                zzfo.c(parcel2, a);
                return true;
            case 15:
                n((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean s = s((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.a(parcel2, s);
                return true;
            case 17:
                y((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper k2 = k();
                parcel2.writeNoException();
                zzfo.c(parcel2, k2);
                return true;
            case 19:
                IObjectWrapper e2 = e();
                parcel2.writeNoException();
                zzfo.c(parcel2, e2);
                return true;
            case 20:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.g(parcel2, extras);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzagfVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof zzagd) {
                        zzagfVar = (zzagd) queryLocalInterface;
                    } else {
                        zzagfVar = new zzagf(readStrongBinder);
                    }
                }
                N(zzagfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                I();
                parcel2.writeNoException();
                return true;
            case 23:
                List z4 = z4();
                parcel2.writeNoException();
                parcel2.writeList(z4);
                return true;
            case 24:
                boolean k22 = k2();
                parcel2.writeNoException();
                zzfo.a(parcel2, k22);
                return true;
            case 25:
                O(zzaal.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                k0(zzaah.H7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                Q();
                parcel2.writeNoException();
                return true;
            case 28:
                a7();
                parcel2.writeNoException();
                return true;
            case 29:
                zzaee e22 = e2();
                parcel2.writeNoException();
                zzfo.c(parcel2, e22);
                return true;
            default:
                return false;
        }
    }
}
