package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.notification.NotificationAnalytics;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideNotificationAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public ApplicationModule_ProvideNotificationAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static ApplicationModule_ProvideNotificationAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new ApplicationModule_ProvideNotificationAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static NotificationAnalytics provideNotificationAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        return (NotificationAnalytics) f.b.b.c(applicationModule.provideNotificationAnalytics(analyticsManager, navigationTracker));
    }

    @Override // javax.inject.Provider
    public NotificationAnalytics get() {
        return provideNotificationAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
