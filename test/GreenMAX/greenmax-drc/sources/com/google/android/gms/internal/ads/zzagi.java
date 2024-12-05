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
public final class zzagi extends zzfm implements zzagg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void I() throws RemoteException {
        R(22, u());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void N(zzagd zzagdVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzagdVar);
        R(21, u);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void O(zzaak zzaakVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzaakVar);
        R(25, u);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void Q() throws RemoteException {
        R(27, u());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaea a() throws RemoteException {
        zzaea zzaecVar;
        Parcel C = C(14, u());
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

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void a7() throws RemoteException {
        R(28, u());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String b() throws RemoteException {
        Parcel C = C(2, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String c() throws RemoteException {
        Parcel C = C(6, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String d() throws RemoteException {
        Parcel C = C(4, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void destroy() throws RemoteException {
        R(13, u());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final IObjectWrapper e() throws RemoteException {
        Parcel C = C(19, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaee e2() throws RemoteException {
        zzaee zzaegVar;
        Parcel C = C(29, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzaegVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzaee) {
                zzaegVar = (zzaee) queryLocalInterface;
            } else {
                zzaegVar = new zzaeg(readStrongBinder);
            }
        }
        C.recycle();
        return zzaegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final List f() throws RemoteException {
        Parcel C = C(3, u());
        ArrayList f2 = zzfo.f(C);
        C.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final Bundle getExtras() throws RemoteException {
        Parcel C = C(20, u());
        Bundle bundle = (Bundle) zzfo.b(C, Bundle.CREATOR);
        C.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel C = C(12, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getStore() throws RemoteException {
        Parcel C = C(9, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaar getVideoController() throws RemoteException {
        Parcel C = C(11, u());
        zzaar H7 = zzaas.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaei h() throws RemoteException {
        zzaei zzaekVar;
        Parcel C = C(5, u());
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

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String i() throws RemoteException {
        Parcel C = C(10, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final IObjectWrapper k() throws RemoteException {
        Parcel C = C(18, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void k0(zzaag zzaagVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzaagVar);
        R(26, u);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean k2() throws RemoteException {
        Parcel C = C(24, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final double l() throws RemoteException {
        Parcel C = C(8, u());
        double readDouble = C.readDouble();
        C.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String m() throws RemoteException {
        Parcel C = C(7, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void n(Bundle bundle) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, bundle);
        R(15, u);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean s(Bundle bundle) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, bundle);
        Parcel C = C(16, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void y(Bundle bundle) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, bundle);
        R(17, u);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final List z4() throws RemoteException {
        Parcel C = C(23, u());
        ArrayList f2 = zzfo.f(C);
        C.recycle();
        return f2;
    }
}
