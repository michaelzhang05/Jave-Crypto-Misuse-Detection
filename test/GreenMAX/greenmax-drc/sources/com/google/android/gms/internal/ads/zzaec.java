package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaec extends zzfm implements zzaea {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final String X0() throws RemoteException {
        Parcel C = C(2, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final List<zzaei> q0() throws RemoteException {
        Parcel C = C(3, u());
        ArrayList f2 = zzfo.f(C);
        C.recycle();
        return f2;
    }
}
