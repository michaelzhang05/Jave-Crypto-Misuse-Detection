package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdaj extends zzfm implements zzdah {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final void A7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final void R6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(4, u);
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final IObjectWrapper X2(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        zzfo.c(u, iObjectWrapper);
        u.writeString(str2);
        u.writeString(str3);
        u.writeString(str4);
        u.writeString(str5);
        Parcel C = C(9, u);
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final void a1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, iObjectWrapper2);
        R(5, u);
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final String m0() throws RemoteException {
        Parcel C = C(6, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final boolean v1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        Parcel C = C(2, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }
}
