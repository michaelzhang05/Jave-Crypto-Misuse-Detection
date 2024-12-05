package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.account.AdultContentAnalytics;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAdultContentAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvideAdultContentAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvideAdultContentAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvideAdultContentAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AdultContentAnalytics provideAdultContentAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return (AdultContentAnalytics) f.b.b.c(applicationModule.provideAdultContentAnalytics(analyticsManager, navigationTracker));
    }

    @Override // javax.inject.Provider
    public AdultContentAnalytics get() {
        return provideAdultContentAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
