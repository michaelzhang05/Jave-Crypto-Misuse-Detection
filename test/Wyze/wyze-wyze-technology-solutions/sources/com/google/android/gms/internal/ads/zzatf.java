package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzatf extends RemoteCreator<zzasz> {
    public zzatf() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzasz a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof zzasz) {
            return (zzasz) queryLocalInterface;
        }
        return new zzata(iBinder);
    }

    public final zzasw c(Context context, zzamp zzampVar) {
        try {
            IBinder o6 = b(context).o6(ObjectWrapper.i0(context), zzampVar, 15000000);
            if (o6 == null) {
                return null;
            }
            IInterface queryLocalInterface = o6.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof zzasw) {
                return (zzasw) queryLocalInterface;
            }
            return new zzasy(o6);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.d("Could not get remote RewardedVideoAd.", e2);
            return null;
        }
    }
}
