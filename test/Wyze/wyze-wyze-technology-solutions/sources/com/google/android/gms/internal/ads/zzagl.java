package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

@zzard
/* loaded from: classes2.dex */
public final class zzagl extends RemoteCreator<zzaeu> {
    @VisibleForTesting
    public zzagl() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzaeu a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzaeu) {
            return (zzaeu) queryLocalInterface;
        }
        return new zzaev(iBinder);
    }

    public final zzaer c(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder L5 = b(view.getContext()).L5(ObjectWrapper.i0(view), ObjectWrapper.i0(hashMap), ObjectWrapper.i0(hashMap2));
            if (L5 == null) {
                return null;
            }
            IInterface queryLocalInterface = L5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzaer) {
                return (zzaer) queryLocalInterface;
            }
            return new zzaet(L5);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.d("Could not create remote NativeAdViewHolderDelegate.", e2);
            return null;
        }
    }
}
