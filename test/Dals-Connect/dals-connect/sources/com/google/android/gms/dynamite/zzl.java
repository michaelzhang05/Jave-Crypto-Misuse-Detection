package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public final class zzl extends zza implements zzk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.zzk
    public final IObjectWrapper m1(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel u = u();
        zzc.c(u, iObjectWrapper);
        u.writeString(str);
        u.writeInt(i2);
        zzc.c(u, iObjectWrapper2);
        Parcel C = C(2, u);
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.dynamite.zzk
    public final IObjectWrapper r1(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel u = u();
        zzc.c(u, iObjectWrapper);
        u.writeString(str);
        u.writeInt(i2);
        zzc.c(u, iObjectWrapper2);
        Parcel C = C(3, u);
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }
}
