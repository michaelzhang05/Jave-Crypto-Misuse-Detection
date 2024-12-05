package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaad extends zzfm implements zzaab {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void D2(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(10, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final String F3() throws RemoteException {
        Parcel C = C(9, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final boolean H3() throws RemoteException {
        Parcel C = C(8, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final float I4() throws RemoteException {
        Parcel C = C(7, u());
        float readFloat = C.readFloat();
        C.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void I5(float f2) throws RemoteException {
        Parcel u = u();
        u.writeFloat(f2);
        R(2, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void M6(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeString(str);
        R(5, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void S1(boolean z) throws RemoteException {
        Parcel u = u();
        zzfo.a(u, z);
        R(4, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void f0() throws RemoteException {
        R(1, u());
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void p2(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        zzfo.c(u, iObjectWrapper);
        R(6, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final void s0(zzamp zzampVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, zzampVar);
        R(11, u);
    }
}
