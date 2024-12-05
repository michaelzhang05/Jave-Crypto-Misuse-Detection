package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzccy implements zzbrx {

    /* renamed from: f, reason: collision with root package name */
    private final zzams f13905f;

    public zzccy(zzams zzamsVar) {
        this.f13905f = zzamsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final void j(Context context) {
        try {
            this.f13905f.destroy();
        } catch (RemoteException e2) {
            zzbad.d("Nonagon: Can't invoke onDestroy for rewarded video.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final void k(Context context) {
        try {
            this.f13905f.resume();
            if (context != null) {
                this.f13905f.X4(ObjectWrapper.i0(context));
            }
        } catch (RemoteException e2) {
            zzbad.d("Nonagon: Can't invoke onResume for rewarded video.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    public final void r(Context context) {
        try {
            this.f13905f.pause();
        } catch (RemoteException e2) {
            zzbad.d("Nonagon: Can't invoke onPause for rewarded video.", e2);
        }
    }
}
