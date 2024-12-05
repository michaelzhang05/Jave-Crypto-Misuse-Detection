package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzafb extends zzfn implements zzafa {
    public zzafb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                IObjectWrapper k2 = k();
                parcel2.writeNoException();
                zzfo.c(parcel2, k2);
                return true;
            case 3:
                String b2 = b();
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            case 4:
                List f2 = f();
                parcel2.writeNoException();
                parcel2.writeList(f2);
                return true;
            case 5:
                String d2 = d();
                parcel2.writeNoException();
                parcel2.writeString(d2);
                return true;
            case 6:
                zzaei h0 = h0();
                parcel2.writeNoException();
                zzfo.c(parcel2, h0);
                return true;
            case 7:
                String c2 = c();
                parcel2.writeNoException();
                parcel2.writeString(c2);
                return true;
            case 8:
                String m = m();
                parcel2.writeNoException();
                parcel2.writeString(m);
                return true;
            case 9:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.g(parcel2, extras);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.c(parcel2, videoController);
                return true;
            case 12:
                n((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean s = s((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.a(parcel2, s);
                return true;
            case 14:
                y((Bundle) zzfo.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzaea a = a();
                parcel2.writeNoException();
                zzfo.c(parcel2, a);
                return true;
            case 16:
                IObjectWrapper e2 = e();
                parcel2.writeNoException();
                zzfo.c(parcel2, e2);
                return true;
            case 17:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
