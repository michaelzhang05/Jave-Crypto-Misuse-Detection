package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzabk extends RemoteCreator<zzaae> {
    public zzabk() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzaae a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzaae) {
            return (zzaae) queryLocalInterface;
        }
        return new zzaaf(iBinder);
    }

    public final zzaab c(Context context) {
        try {
            IBinder Z6 = b(context).Z6(ObjectWrapper.i0(context), 15000000);
            if (Z6 == null) {
                return null;
            }
            IInterface queryLocalInterface = Z6.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzaab) {
                return (zzaab) queryLocalInterface;
            }
            return new zzaad(Z6);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.d("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
