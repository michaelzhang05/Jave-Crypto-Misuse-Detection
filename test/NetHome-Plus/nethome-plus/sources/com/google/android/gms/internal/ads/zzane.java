package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzane extends zzfn implements zzand {
    public zzane() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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
                zzaei h0 = h0();
                parcel2.writeNoException();
                zzfo.c(parcel2, h0);
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
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 9:
                A(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                e0(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean q = q();
                parcel2.writeNoException();
                zzfo.a(parcel2, q);
                return true;
            case 12:
                boolean z = z();
                parcel2.writeNoException();
                zzfo.a(parcel2, z);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.g(parcel2, extras);
                return true;
            case 14:
                o(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper x = x();
                parcel2.writeNoException();
                zzfo.c(parcel2, x);
                return true;
            case 16:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.c(parcel2, videoController);
                return true;
            case 17:
            case 18:
            default:
                return false;
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
        }
    }
}
