package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzafh implements NativeCustomTemplateAd {
    private static WeakHashMap<IBinder, zzafh> a = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final zzafe f12692b;

    /* renamed from: c, reason: collision with root package name */
    private final MediaView f12693c;

    /* renamed from: d, reason: collision with root package name */
    private final VideoController f12694d = new VideoController();

    @VisibleForTesting
    private zzafh(zzafe zzafeVar) {
        Context context;
        this.f12692b = zzafeVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.R(zzafeVar.c5());
        } catch (RemoteException | NullPointerException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.f12692b.D3(ObjectWrapper.i0(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e3) {
                zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
            }
        }
        this.f12693c = mediaView;
    }

    public static zzafh a(zzafe zzafeVar) {
        synchronized (a) {
            zzafh zzafhVar = a.get(zzafeVar.asBinder());
            if (zzafhVar != null) {
                return zzafhVar;
            }
            zzafh zzafhVar2 = new zzafh(zzafeVar);
            a.put(zzafeVar.asBinder(), zzafhVar2);
            return zzafhVar2;
        }
    }

    public final zzafe b() {
        return this.f12692b;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.f12692b.destroy();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.f12692b.getAvailableAssetNames();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.f12692b.getCustomTemplateId();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            zzaei B1 = this.f12692b.B1(str);
            if (B1 != null) {
                return new zzael(B1);
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.f12692b.E0(str);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            zzaar videoController = this.f12692b.getVideoController();
            if (videoController != null) {
                this.f12694d.zza(videoController);
            }
        } catch (RemoteException e2) {
            zzbad.c("Exception occurred while getting video controller", e2);
        }
        return this.f12694d;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.f12693c;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.f12692b.performClick(str);
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.f12692b.recordImpression();
        } catch (RemoteException e2) {
            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
