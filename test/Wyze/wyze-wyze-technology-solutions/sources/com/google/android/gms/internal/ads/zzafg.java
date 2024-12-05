package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafg extends zzfm implements zzafe {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final zzaei B1(String str) throws RemoteException {
        zzaei zzaekVar;
        Parcel u = u();
        u.writeString(str);
        Parcel C = C(2, u);
        IBinder readStrongBinder = C.readStrongBinder();
        if (readStrongBinder == null) {
            zzaekVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzaei) {
                zzaekVar = (zzaei) queryLocalInterface;
            } else {
                zzaekVar = new zzaek(readStrongBinder);
            }
        }
        C.recycle();
        return zzaekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final boolean D3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        Parcel C = C(10, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final String E0(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        Parcel C = C(1, u);
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final IObjectWrapper c5() throws RemoteException {
        Parcel C = C(9, u());
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void destroy() throws RemoteException {
        R(8, u());
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel C = C(3, u());
        ArrayList<String> createStringArrayList = C.createStringArrayList();
        C.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final String getCustomTemplateId() throws RemoteException {
        Parcel C = C(4, u());
        String readString = C.readString();
        C.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final zzaar getVideoController() throws RemoteException {
        Parcel C = C(7, u());
        zzaar H7 = zzaas.H7(C.readStrongBinder());
        C.recycle();
        return H7;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void performClick(String str) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        R(5, u);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void recordImpression() throws RemoteException {
        R(6, u());
    }
}
