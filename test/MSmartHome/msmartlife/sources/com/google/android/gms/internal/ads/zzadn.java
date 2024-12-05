package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzadn extends zzfm implements zzadl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final String d6() throws RemoteException {
        Parcel C = C(1, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final String getContent() throws RemoteException {
        Parcel C = C(2, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void o1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void recordClick() throws RemoteException {
        R(4, u());
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void recordImpression() throws RemoteException {
        R(5, u());
    }
}
