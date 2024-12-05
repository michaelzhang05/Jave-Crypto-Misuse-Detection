package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafc extends zzfm implements zzafa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaea a() throws RemoteException {
        zzaea zzaecVar;
        Parcel C = C(15, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzaecVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof zzaea) {
                zzaecVar = (zzaea) queryLocalInterface;
            } else {
                zzaecVar = new zzaec(readStrongBinder);
            }
        }
        C.recycle();
        return zzaecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String b() throws RemoteException {
        Parcel C = C(3, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String c() throws RemoteException {
        Parcel C = C(7, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String d() throws RemoteException {
        Parcel C = C(5, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void destroy() throws RemoteException {
        R(10, u());
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final List f() throws RemoteException {
        Parcel C = C(4, u());
        ArrayList f2 = zzfo.f(C);
        C.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final Bundle getExtras() throws RemoteException {
        Parcel C = C(9, u());
        Bundle bundle = (Bundle) zzfo.b(C, Bundle.CREATOR);
        C.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel C = C(17, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaar getVideoController() throws RemoteException {
        Parcel C = C(11, u());
        zzaar H7 = zzaas.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaei h0() throws RemoteException {
        zzaei zzaekVar;
        Parcel C = C(6, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzaekVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzaei) {
                zzaekVar = (zzaei) queryLocalInterface;
            } else {
                zzaekVar = new zzaek(readStrongBinder);
            }
        }
        C.recycle();
        return zzaekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final IObjectWrapper k() throws RemoteException {
        Parcel C = C(2, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String m() throws RemoteException {
        Parcel C = C(8, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void n(Bundle bundle) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, bundle);
        R(12, u);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final boolean s(Bundle bundle) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, bundle);
        Parcel C = C(13, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void y(Bundle bundle) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, bundle);
        R(14, u);
    }
}
