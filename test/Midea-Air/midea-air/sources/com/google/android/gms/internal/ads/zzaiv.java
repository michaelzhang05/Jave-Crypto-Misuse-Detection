package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaiv extends zzfm implements zzait {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void B4(List<zzaio> list) throws RemoteException {
        Parcel u = u();
        u.writeTypedList(list);
        R(1, u);
    }
}
