package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzagc extends zzfm implements zzaga {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean N2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel u = u();
        zzfo.c(u, iObjectWrapper);
        Parcel C = C(2, u);
        boolean e2 = zzfo.e(C);
        C.recycle();
        return e2;
    }
}
