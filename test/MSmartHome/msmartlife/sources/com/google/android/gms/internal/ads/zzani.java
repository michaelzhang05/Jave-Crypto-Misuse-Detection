package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzani extends zzfm implements zzang {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzani(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void A(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(20, u);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final float W3() throws RemoteException {
        Parcel C = C(23, u());
        float readFloat = C.readFloat();
        C.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaea a() throws RemoteException {
        Parcel C = C(12, u());
        zzaea H7 = zzaeb.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String b() throws RemoteException {
        Parcel C = C(2, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String c() throws RemoteException {
        Parcel C = C(6, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String d() throws RemoteException {
        Parcel C = C(4, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper e() throws RemoteException {
        Parcel C = C(15, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final List f() throws RemoteException {
        Parcel C = C(3, u());
        ArrayList f2 = zzfo.f(C);
        C.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final Bundle getExtras() throws RemoteException {
        Parcel C = C(16, u());
        Bundle bundle = (Bundle) zzfo.b(C, Bundle.CREATOR);
        C.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getStore() throws RemoteException {
        Parcel C = C(9, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaar getVideoController() throws RemoteException {
        Parcel C = C(11, u());
        zzaar H7 = zzaas.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaei h() throws RemoteException {
        Parcel C = C(5, u());
        zzaei H7 = zzaej.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String i() throws RemoteException {
        Parcel C = C(10, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final double l() throws RemoteException {
        Parcel C = C(8, u());
        double readDouble = C.readDouble();
        C.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String m() throws RemoteException {
        Parcel C = C(7, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void o(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(22, u);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean q() throws RemoteException {
        Parcel C = C(17, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void r(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, iObjectWrapper2);
        zzfo.c(u, iObjectWrapper3);
        R(21, u);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void recordImpression() throws RemoteException {
        R(19, u());
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper v() throws RemoteException {
        Parcel C = C(14, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper x() throws RemoteException {
        Parcel C = C(13, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean z() throws RemoteException {
        Parcel C = C(18, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }
}
