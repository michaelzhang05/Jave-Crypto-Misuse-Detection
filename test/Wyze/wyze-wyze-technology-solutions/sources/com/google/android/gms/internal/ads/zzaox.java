package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaox extends zzfm implements zzaov {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaox(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final boolean B2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        Parcel C = C(17, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void R4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaoj zzaojVar, zzamv zzamvVar, zzyd zzydVar) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzfo.d(u, zzxzVar);
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, zzaojVar);
        zzfo.c(u, zzamvVar);
        zzfo.d(u, zzydVar);
        R(13, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void T6(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaom zzaomVar, zzamv zzamvVar) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzfo.d(u, zzxzVar);
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, zzaomVar);
        zzfo.c(u, zzamvVar);
        R(14, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void e4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaop zzaopVar, zzamv zzamvVar) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzfo.d(u, zzxzVar);
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, zzaopVar);
        zzfo.c(u, zzamvVar);
        R(18, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final zzaar getVideoController() throws RemoteException {
        Parcel C = C(5, u());
        zzaar H7 = zzaas.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final boolean l2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        Parcel C = C(15, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void p3(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzyd zzydVar, zzaoy zzaoyVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        u.writeString(str);
        zzfo.d(u, bundle);
        zzfo.d(u, bundle2);
        zzfo.d(u, zzydVar);
        zzfo.c(u, zzaoyVar);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final void s5(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaos zzaosVar, zzamv zzamvVar) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzfo.d(u, zzxzVar);
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, zzaosVar);
        zzfo.c(u, zzamvVar);
        R(16, u);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final zzapj s6() throws RemoteException {
        Parcel C = C(2, u());
        zzapj zzapjVar = (zzapj) zzfo.b(C, zzapj.CREATOR);
        C.recycle();
        return zzapjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final zzapj t5() throws RemoteException {
        Parcel C = C(3, u());
        zzapj zzapjVar = (zzapj) zzfo.b(C, zzapj.CREATOR);
        C.recycle();
        return zzapjVar;
    }
}
