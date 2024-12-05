package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzg extends zza implements zze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final boolean g() throws RemoteException {
        Parcel C = C(6, u());
        boolean b2 = zzc.b(C);
        C.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final String getId() throws RemoteException {
        Parcel C = C(1, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final boolean s2(boolean z) throws RemoteException {
        Parcel u = u();
        zzc.a(u, true);
        Parcel C = C(2, u);
        boolean b2 = zzc.b(C);
        C.recycle();
        return b2;
    }
}
