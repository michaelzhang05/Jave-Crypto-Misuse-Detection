package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyt;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza, MediationRewardedVideoAdAdapter, zzbjl {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzmd;
    private InterstitialAd zzme;
    private AdLoader zzmf;
    private Context zzmg;
    private InterstitialAd zzmh;
    private MediationRewardedVideoAdListener zzmi;

    @VisibleForTesting
    private final RewardedVideoAdListener zzmj = new com.google.ads.mediation.f(this);

    /* loaded from: classes2.dex */
    static class a extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd a;

        public a(NativeAppInstallAd nativeAppInstallAd) {
            this.a = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.a);
            }
        }
    }

    /* loaded from: classes2.dex */
    static class b extends NativeContentAdMapper {
        private final NativeContentAd a;

        public b(NativeContentAd nativeContentAd) {
            this.a = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.a);
            }
        }
    }

    /* loaded from: classes2.dex */
    static class c extends UnifiedNativeAdMapper {
        private final UnifiedNativeAd a;

        public c(UnifiedNativeAd unifiedNativeAd) {
            this.a = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzp(unifiedNativeAd.zzkv());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.a);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.a);
            }
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    static final class d extends AdListener implements AppEventListener, zzxr {

        /* renamed from: f, reason: collision with root package name */
        @VisibleForTesting
        private final AbstractAdViewAdapter f10282f;

        /* renamed from: g, reason: collision with root package name */
        @VisibleForTesting
        private final MediationBannerListener f10283g;

        public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f10282f = abstractAdViewAdapter;
            this.f10283g = mediationBannerListener;
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzxr
        public final void onAdClicked() {
            this.f10283g.onAdClicked(this.f10282f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.f10283g.onAdClosed(this.f10282f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i2) {
            this.f10283g.onAdFailedToLoad(this.f10282f, i2);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.f10283g.onAdLeftApplication(this.f10282f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.f10283g.onAdLoaded(this.f10282f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.f10283g.onAdOpened(this.f10282f);
        }

        @Override // com.google.android.gms.ads.doubleclick.AppEventListener
        public final void onAppEvent(String str, String str2) {
            this.f10283g.zza(this.f10282f, str, str2);
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    static final class e extends AdListener implements zzxr {

        /* renamed from: f, reason: collision with root package name */
        @VisibleForTesting
        private final AbstractAdViewAdapter f10284f;

        /* renamed from: g, reason: collision with root package name */
        @VisibleForTesting
        private final MediationInterstitialListener f10285g;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f10284f = abstractAdViewAdapter;
            this.f10285g = mediationInterstitialListener;
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzxr
        public final void onAdClicked() {
            this.f10285g.onAdClicked(this.f10284f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.f10285g.onAdClosed(this.f10284f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i2) {
            this.f10285g.onAdFailedToLoad(this.f10284f, i2);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.f10285g.onAdLeftApplication(this.f10284f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.f10285g.onAdLoaded(this.f10284f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.f10285g.onAdOpened(this.f10284f);
        }
    }

    @VisibleForTesting
    /* loaded from: classes2.dex */
    static final class f extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {

        /* renamed from: f, reason: collision with root package name */
        @VisibleForTesting
        private final AbstractAdViewAdapter f10286f;

        /* renamed from: g, reason: collision with root package name */
        @VisibleForTesting
        private final MediationNativeListener f10287g;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f10286f = abstractAdViewAdapter;
            this.f10287g = mediationNativeListener;
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzxr
        public final void onAdClicked() {
            this.f10287g.onAdClicked(this.f10286f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.f10287g.onAdClosed(this.f10286f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i2) {
            this.f10287g.onAdFailedToLoad(this.f10286f, i2);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdImpression() {
            this.f10287g.onAdImpression(this.f10286f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.f10287g.onAdLeftApplication(this.f10286f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.f10287g.onAdOpened(this.f10286f);
        }

        @Override // com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f10287g.onAdLoaded(this.f10286f, new a(nativeAppInstallAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f10287g.onAdLoaded(this.f10286f, new b(nativeContentAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f10287g.zza(this.f10286f, nativeCustomTemplateAd, str);
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f10287g.zza(this.f10286f, nativeCustomTemplateAd);
        }

        @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.f10287g.onAdLoaded(this.f10286f, new c(unifiedNativeAd));
        }
    }

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            Iterator<String> it = keywords.iterator();
            while (it.hasNext()) {
                builder.addKeyword(it.next());
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzyt.a();
            builder.addTestDevice(zzazt.l(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.tagForChildDirectedTreatment(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzmd;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdj(1).zzacc();
    }

    @Override // com.google.android.gms.ads.mediation.zza
    public zzaar getVideoController() {
        VideoController videoController;
        AdView adView = this.zzmd;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzdh();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzmg = context.getApplicationContext();
        this.zzmi = mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzmi != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Context context = this.zzmg;
        if (context != null && this.zzmi != null) {
            InterstitialAd interstitialAd = new InterstitialAd(context);
            this.zzmh = interstitialAd;
            interstitialAd.zzc(true);
            this.zzmh.setAdUnitId(getAdUnitId(bundle));
            this.zzmh.setRewardedVideoAdListener(this.zzmj);
            this.zzmh.setAdMetadataListener(new g(this));
            this.zzmh.loadAd(zza(this.zzmg, mediationAdRequest, bundle2, bundle));
            return;
        }
        zzbad.g("AdMobAdapter.loadAd called before initialize.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.destroy();
            this.zzmd = null;
        }
        if (this.zzme != null) {
            this.zzme = null;
        }
        if (this.zzmf != null) {
            this.zzmf = null;
        }
        if (this.zzmh != null) {
            this.zzmh = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzme;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzmh;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.resume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzmd = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzmd.setAdUnitId(getAdUnitId(bundle));
        this.zzmd.setAdListener(new d(this, mediationBannerListener));
        this.zzmd.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzme = interstitialAd;
        interstitialAd.setAdUnitId(getAdUnitId(bundle));
        this.zzme.setAdListener(new e(this, mediationInterstitialListener));
        this.zzme.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        f fVar = new f(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(fVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(fVar);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(fVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(fVar);
        }
        if (nativeMediationAdRequest.zzsu()) {
            for (String str : nativeMediationAdRequest.zzsv().keySet()) {
                withAdListener.forCustomTemplateAd(str, fVar, nativeMediationAdRequest.zzsv().get(str).booleanValue() ? fVar : null);
            }
        }
        AdLoader build = withAdListener.build();
        this.zzmf = build;
        build.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzme.show();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzmh.show();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ InterstitialAd zza(AbstractAdViewAdapter abstractAdViewAdapter, InterstitialAd interstitialAd) {
        abstractAdViewAdapter.zzmh = null;
        return null;
    }
}
