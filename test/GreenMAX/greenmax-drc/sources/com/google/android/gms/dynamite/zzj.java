package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public final class zzj extends zza implements zzi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final int O6() throws RemoteException {
        Parcel C = C(6, u());
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final int Q3(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel u = u();
        zzc.c(u, iObjectWrapper);
        u.writeString(str);
        zzc.a(u, z);
        Parcel C = C(5, u);
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final int S4(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel u = u();
        zzc.c(u, iObjectWrapper);
        u.writeString(str);
        zzc.a(u, z);
        Parcel C = C(3, u);
        int readInt = C.readInt();
        C.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final IObjectWrapper i5(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel u = u();
        zzc.c(u, iObjectWrapper);
        u.writeString(str);
        u.writeInt(i2);
        Parcel C = C(4, u);
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.dynamite.zzi
    public final IObjectWrapper o2(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel u = u();
        zzc.c(u, iObjectWrapper);
        u.writeString(str);
        u.writeInt(i2);
        Parcel C = C(2, u);
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }
}
