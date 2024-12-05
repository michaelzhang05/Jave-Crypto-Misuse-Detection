package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzavz extends zzfm implements zzavy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void onError(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(2, u);
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void t7(String str, String str2) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        R(1, u);
    }
}
