package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes2.dex */
public final class zzk extends zza implements zzi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzi
    public final int g() throws RemoteException {
        Parcel C = C(2, u());
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzi
    public final IObjectWrapper l0() throws RemoteException {
        Parcel C = C(1, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }
}
