package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzfz extends zzfm implements zzfx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void G0(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void L3(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeString(str);
        u.writeString(null);
        R(8, u);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void S2(int[] iArr) throws RemoteException {
        Parcel u = u();
        u.writeIntArray(null);
        R(4, u);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void t6() throws RemoteException {
        R(3, u());
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void u0(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeString(str);
        R(2, u);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void u3(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(6, u);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void y0(byte[] bArr) throws RemoteException {
        Parcel u = u();
        u.writeByteArray(bArr);
        R(5, u);
    }
}
