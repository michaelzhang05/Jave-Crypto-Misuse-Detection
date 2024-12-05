package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzanf extends zzfm implements zzand {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void A(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(9, u);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final zzaea a() throws RemoteException {
        Parcel C = C(19, u());
        zzaea H7 = zzaeb.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final String b() throws RemoteException {
        Parcel C = C(2, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final String c() throws RemoteException {
        Parcel C = C(6, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final String d() throws RemoteException {
        Parcel C = C(4, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final IObjectWrapper e() throws RemoteException {
        Parcel C = C(21, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void e0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(10, u);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final List f() throws RemoteException {
        Parcel C = C(3, u());
        ArrayList f2 = zzfo.f(C);
        C.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final Bundle getExtras() throws RemoteException {
        Parcel C = C(13, u());
        Bundle bundle = (Bundle) zzfo.b(C, Bundle.CREATOR);
        C.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final zzaar getVideoController() throws RemoteException {
        Parcel C = C(16, u());
        zzaar H7 = zzaas.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final zzaei h0() throws RemoteException {
        Parcel C = C(5, u());
        zzaei H7 = zzaej.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final String m() throws RemoteException {
        Parcel C = C(7, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void o(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(14, u);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final boolean q() throws RemoteException {
        Parcel C = C(11, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void r(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, iObjectWrapper2);
        zzfo.c(u, iObjectWrapper3);
        R(22, u);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void recordImpression() throws RemoteException {
        R(8, u());
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final IObjectWrapper v() throws RemoteException {
        Parcel C = C(20, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final IObjectWrapper x() throws RemoteException {
        Parcel C = C(15, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final boolean z() throws RemoteException {
        Parcel C = C(12, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }
}
