package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

@zzard
/* loaded from: classes2.dex */
public final class zzano implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zzamv a;

    /* renamed from: b, reason: collision with root package name */
    private NativeAdMapper f12832b;

    /* renamed from: c, reason: collision with root package name */
    private UnifiedNativeAdMapper f12833c;

    /* renamed from: d, reason: collision with root package name */
    private NativeCustomTemplateAd f12834d;

    public zzano(zzamv zzamvVar) {
        this.a = zzamvVar;
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper, NativeAdMapper nativeAdMapper) {
        if (mediationNativeAdapter instanceof AdMobAdapter) {
            return;
        }
        VideoController videoController = new VideoController();
        videoController.zza(new zzanj());
        if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
            unifiedNativeAdMapper.zza(videoController);
        }
        if (nativeAdMapper == null || !nativeAdMapper.hasVideoContent()) {
            return;
        }
        nativeAdMapper.zza(videoController);
    }

    public final NativeAdMapper b() {
        return this.f12832b;
    }

    public final UnifiedNativeAdMapper c() {
        return this.f12833c;
    }

    public final NativeCustomTemplateAd d() {
        return this.f12834d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdClicked.");
        try {
            this.a.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdClosed.");
        try {
            this.a.onAdClosed();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i2) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i2);
        zzbad.e(sb.toString());
        try {
            this.a.onAdFailedToLoad(i2);
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f12832b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f12833c;
        if (this.f12834d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzbad.f("#007 Could not call remote method.", null);
                return;
            }
            if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzbad.e("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                zzbad.e("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzbad.e("Adapter called onAdImpression.");
        try {
            this.a.onAdImpression();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdLeftApplication.");
        try {
            this.a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdLoaded.");
        try {
            this.a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdOpened.");
        try {
            this.a.onAdOpened();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onVideoEnd.");
        try {
            this.a.S();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAppEvent.");
        try {
            this.a.onAppEvent(str, str2);
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdClicked.");
        try {
            this.a.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdClosed.");
        try {
            this.a.onAdClosed();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i2) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i2);
        sb.append(".");
        zzbad.e(sb.toString());
        try {
            this.a.onAdFailedToLoad(i2);
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdLeftApplication.");
        try {
            this.a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdLoaded.");
        try {
            this.a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdOpened.");
        try {
            this.a.onAdOpened();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        zzbad.e(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f12834d = nativeCustomTemplateAd;
        try {
            this.a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f12832b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f12833c;
        if (this.f12834d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzbad.f("#007 Could not call remote method.", null);
                return;
            }
            if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzbad.e("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                zzbad.e("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzbad.e("Adapter called onAdClicked.");
        try {
            this.a.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdClosed.");
        try {
            this.a.onAdClosed();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i2) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i2);
        sb.append(".");
        zzbad.e(sb.toString());
        try {
            this.a.onAdFailedToLoad(i2);
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdLeftApplication.");
        try {
            this.a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdLoaded.");
        this.f12832b = nativeAdMapper;
        this.f12833c = null;
        a(mediationNativeAdapter, null, nativeAdMapper);
        try {
            this.a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdOpened.");
        try {
            this.a.onAdOpened();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzafh) {
            try {
                this.a.j0(((zzafh) nativeCustomTemplateAd).b(), str);
                return;
            } catch (RemoteException e2) {
                zzbad.f("#007 Could not call remote method.", e2);
                return;
            }
        }
        zzbad.i("Unexpected native custom template ad type.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.f("#008 Must be called on the main UI thread.");
        zzbad.e("Adapter called onAdLoaded.");
        this.f12833c = unifiedNativeAdMapper;
        this.f12832b = null;
        a(mediationNativeAdapter, unifiedNativeAdMapper, null);
        try {
            this.a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
        }
    }
}
