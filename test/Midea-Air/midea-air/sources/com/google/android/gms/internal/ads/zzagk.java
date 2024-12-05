package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzagk extends RemoteCreator<zzaep> {
    @VisibleForTesting
    public zzagk() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzaep a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzaep) {
            return (zzaep) queryLocalInterface;
        }
        return new zzaeq(iBinder);
    }

    public final zzaem c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder o3 = b(context).o3(ObjectWrapper.i0(context), ObjectWrapper.i0(frameLayout), ObjectWrapper.i0(frameLayout2), 15000000);
            if (o3 == null) {
                return null;
            }
            IInterface queryLocalInterface = o3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzaem) {
                return (zzaem) queryLocalInterface;
            }
            return new zzaeo(o3);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.d("Could not create remote NativeAdViewDelegate.", e2);
            return null;
        }
    }
}
