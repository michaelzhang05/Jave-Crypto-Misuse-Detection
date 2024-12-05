package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaek extends zzfm implements zzaei {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaek(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final double T3() throws RemoteException {
        Parcel C = C(3, u());
        double readDouble = C.readDouble();
        C.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final int getHeight() throws RemoteException {
        Parcel C = C(5, u());
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final int getWidth() throws RemoteException {
        Parcel C = C(4, u());
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final Uri n0() throws RemoteException {
        Parcel C = C(2, u());
        Uri uri = (Uri) zzfo.b(C, Uri.CREATOR);
        C.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final IObjectWrapper y4() throws RemoteException {
        Parcel C = C(1, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }
}
