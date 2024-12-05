package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaaa extends zzfm implements zzzy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final long getValue() throws RemoteException {
        Parcel C = C(1, u());
        long readLong = C.readLong();
        C.recycle();
        return readLong;
    }
}
