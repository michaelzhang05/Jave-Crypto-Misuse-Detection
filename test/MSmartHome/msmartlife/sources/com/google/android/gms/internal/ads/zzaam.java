package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaam extends zzfm implements zzaak {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzaak
    public final String Q1() throws RemoteException {
        Parcel C = C(2, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaak
    public final String getDescription() throws RemoteException {
        Parcel C = C(1, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }
}
