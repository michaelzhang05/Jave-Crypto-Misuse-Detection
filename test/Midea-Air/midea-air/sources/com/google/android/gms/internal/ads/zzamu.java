package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzamu extends zzfm implements zzams {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzana B7() throws RemoteException {
        zzana zzancVar;
        Parcel C = C(15, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzancVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzana) {
                zzancVar = (zzana) queryLocalInterface;
            } else {
                zzancVar = new zzanc(readStrongBinder);
            }
        }
        C.recycle();
        return zzancVar;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzang D1() throws RemoteException {
        zzang zzaniVar;
        Parcel C = C(27, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzaniVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzang) {
                zzaniVar = (zzang) queryLocalInterface;
            } else {
                zzaniVar = new zzani(readStrongBinder);
            }
        }
        C.recycle();
        return zzaniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void H6(zzxz zzxzVar, String str) throws RemoteException {
        Parcel u = u();
        zzfo.d(u, zzxzVar);
        u.writeString(str);
        R(11, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void K3(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar, zzady zzadyVar, List<String> list) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzxzVar);
        u.writeString(str);
        u.writeString(str2);
        zzfo.c(u, zzamvVar);
        zzfo.d(u, zzadyVar);
        u.writeStringList(list);
        R(14, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void M4(IObjectWrapper iObjectWrapper, zzaiq zzaiqVar, List<zzaiw> list) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, zzaiqVar);
        u.writeTypedList(list);
        R(31, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void O4(IObjectWrapper iObjectWrapper, zzatk zzatkVar, List<String> list) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.c(u, zzatkVar);
        u.writeStringList(list);
        R(23, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void Q2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzxzVar);
        u.writeString(str);
        zzfo.c(u, zzamvVar);
        R(3, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void W1(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzxzVar);
        u.writeString(str);
        zzfo.c(u, zzamvVar);
        R(28, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void X4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(21, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void Z3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        R(30, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void destroy() throws RemoteException {
        R(5, u());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void g4(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzatk zzatkVar, String str2) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzxzVar);
        u.writeString(str);
        zzfo.c(u, zzatkVar);
        u.writeString(str2);
        R(10, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzaar getVideoController() throws RemoteException {
        Parcel C = C(26, u());
        zzaar H7 = zzaas.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean isInitialized() throws RemoteException {
        Parcel C = C(13, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final IObjectWrapper l1() throws RemoteException {
        Parcel C = C(2, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void m2(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzydVar);
        zzfo.d(u, zzxzVar);
        u.writeString(str);
        zzfo.c(u, zzamvVar);
        R(1, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void pause() throws RemoteException {
        R(8, u());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void resume() throws RemoteException {
        R(9, u());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean s3() throws RemoteException {
        Parcel C = C(22, u());
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel u = u();
        zzfo.a(u, z);
        R(25, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showInterstitial() throws RemoteException {
        R(4, u());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showVideo() throws RemoteException {
        R(12, u());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void u6(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzxzVar);
        u.writeString(str);
        u.writeString(str2);
        zzfo.c(u, zzamvVar);
        R(7, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void w4(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        zzfo.d(u, zzydVar);
        zzfo.d(u, zzxzVar);
        u.writeString(str);
        u.writeString(str2);
        zzfo.c(u, zzamvVar);
        R(6, u);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzand w6() throws RemoteException {
        zzand zzanfVar;
        Parcel C = C(16, u());
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzanfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzand) {
                zzanfVar = (zzand) queryLocalInterface;
            } else {
                zzanfVar = new zzanf(readStrongBinder);
            }
        }
        C.recycle();
        return zzanfVar;
    }
}
