package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzagq extends zzafv {

    /* renamed from: f, reason: collision with root package name */
    private final OnPublisherAdViewLoadedListener f12709f;

    public zzagq(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.f12709f = onPublisherAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafu
    public final void P0(zzzk zzzkVar, IObjectWrapper iObjectWrapper) {
        if (zzzkVar == null || iObjectWrapper == null) {
            return;
        }
        PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.R(iObjectWrapper));
        try {
            if (zzzkVar.K5() instanceof zzxv) {
                zzxv zzxvVar = (zzxv) zzzkVar.K5();
                publisherAdView.setAdListener(zzxvVar != null ? zzxvVar.H7() : null);
            }
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        try {
            if (zzzkVar.P4() instanceof zzyf) {
                zzyf zzyfVar = (zzyf) zzzkVar.P4();
                publisherAdView.setAppEventListener(zzyfVar != null ? zzyfVar.I7() : null);
            }
        } catch (RemoteException e3) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
        }
        zzazt.a.post(new x(this, publisherAdView, zzzkVar));
    }
}
