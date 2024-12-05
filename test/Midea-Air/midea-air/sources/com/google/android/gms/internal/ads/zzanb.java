package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzanb extends zzfn implements zzana {
    public zzanb() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
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
                double l = l();
                parcel2.writeNoException();
                parcel2.writeDouble(l);
                return true;
            case 8:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 9:
                String i4 = i();
                parcel2.writeNoException();
                parcel2.writeString(i4);
                return true;
            case 10:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 11:
                A(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                e0(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean q = q();
                parcel2.writeNoException();
                zzfo.a(parcel2, q);
                return true;
            case 14:
                boolean z = z();
                parcel2.writeNoException();
                zzfo.a(parcel2, z);
                return true;
            case 15:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.g(parcel2, extras);
                return true;
            case 16:
                o(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.c(parcel2, videoController);
                return true;
            case 18:
                IObjectWrapper x = x();
                parcel2.writeNoException();
                zzfo.c(parcel2, x);
                return true;
            case 19:
                zzaea a = a();
                parcel2.writeNoException();
                zzfo.c(parcel2, a);
                return true;
            case 20:
                IObjectWrapper v = v();
                parcel2.writeNoException();
                zzfo.c(parcel2, v);
                return true;
            case 21:
                IObjectWrapper e2 = e();
                parcel2.writeNoException();
                zzfo.c(parcel2, e2);
                return true;
            case 22:
                r(IObjectWrapper.Stub.C(parcel.readStrongBinder()), IObjectWrapper.Stub.C(parcel.readStrongBinder()), IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
