package cm.aptoide.pt;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.install.InstallAnalytics;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideInstallAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<TelephonyManager> telephonyManagerProvider;

    public ApplicationModule_ProvideInstallAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.connectivityManagerProvider = provider3;
        this.telephonyManagerProvider = provider4;
    }

    public static ApplicationModule_ProvideInstallAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4) {
        return new ApplicationModule_ProvideInstallAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static InstallAnalytics provideInstallAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        return (InstallAnalytics) f.b.b.c(applicationModule.provideInstallAnalytics(analyticsManager, navigationTracker, connectivityManager, telephonyManager));
    }

    @Override // javax.inject.Provider
    public InstallAnalytics get() {
        return provideInstallAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.connectivityManagerProvider.get(), this.telephonyManagerProvider.get());
    }
}
