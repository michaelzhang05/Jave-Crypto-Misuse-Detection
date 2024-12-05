package cm.aptoide.pt;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.download.DownloadAnalytics;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDownloadAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<TelephonyManager> providesSystemServiceProvider;

    public ApplicationModule_ProvidesDownloadAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.connectivityManagerProvider = provider3;
        this.providesSystemServiceProvider = provider4;
    }

    public static ApplicationModule_ProvidesDownloadAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4) {
        return new ApplicationModule_ProvidesDownloadAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static DownloadAnalytics providesDownloadAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        return (DownloadAnalytics) f.b.b.c(applicationModule.providesDownloadAnalytics(analyticsManager, navigationTracker, connectivityManager, telephonyManager));
    }

    @Override // javax.inject.Provider
    public DownloadAnalytics get() {
        return providesDownloadAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.connectivityManagerProvider.get(), this.providesSystemServiceProvider.get());
    }
}
