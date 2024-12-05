package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.install.InstallAnalytics;
import cm.aptoide.pt.updates.UpdatesAnalytics;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesUpdatesAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvidesUpdatesAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<InstallAnalytics> provider3) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.installAnalyticsProvider = provider3;
    }

    public static ApplicationModule_ProvidesUpdatesAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<InstallAnalytics> provider3) {
        return new ApplicationModule_ProvidesUpdatesAnalyticsFactory(applicationModule, provider, provider2, provider3);
    }

    public static UpdatesAnalytics providesUpdatesAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, InstallAnalytics installAnalytics) {
        return (UpdatesAnalytics) f.b.b.c(applicationModule.providesUpdatesAnalytics(analyticsManager, navigationTracker, installAnalytics));
    }

    @Override // javax.inject.Provider
    public UpdatesAnalytics get() {
        return providesUpdatesAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.installAnalyticsProvider.get());
    }
}
