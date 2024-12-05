package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.download.AppValidationAnalytics;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppValidationAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesAppValidationAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppValidationAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvidesAppValidationAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AppValidationAnalytics providesAppValidationAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return (AppValidationAnalytics) f.b.b.c(applicationModule.providesAppValidationAnalytics(analyticsManager, navigationTracker));
    }

    @Override // javax.inject.Provider
    public AppValidationAnalytics get() {
        return providesAppValidationAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
