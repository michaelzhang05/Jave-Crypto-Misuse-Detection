package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaeo extends zzfm implements zzaem {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaeo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void D0(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeInt(i2);
        R(5, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void H(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void a0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(6, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void destroy() throws RemoteException {
        R(4, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final IObjectWrapper n4(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        Parcel C = C(2, u);
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void o5(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        zzfo.c(u, iObjectWrapper);
        R(1, u);
    }
}
