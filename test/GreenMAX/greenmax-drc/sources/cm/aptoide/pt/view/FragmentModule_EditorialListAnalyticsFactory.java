package cm.aptoide.pt.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.editorialList.EditorialListAnalytics;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class FragmentModule_EditorialListAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final FragmentModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public FragmentModule_EditorialListAnalyticsFactory(FragmentModule fragmentModule, Provider<NavigationTracker> provider, Provider<AnalyticsManager> provider2) {
        this.module = fragmentModule;
        this.navigationTrackerProvider = provider;
        this.analyticsManagerProvider = provider2;
    }

    public static FragmentModule_EditorialListAnalyticsFactory create(FragmentModule fragmentModule, Provider<NavigationTracker> provider, Provider<AnalyticsManager> provider2) {
        return new FragmentModule_EditorialListAnalyticsFactory(fragmentModule, provider, provider2);
    }

    public static EditorialListAnalytics editorialListAnalytics(FragmentModule fragmentModule, NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        return (EditorialListAnalytics) f.b.b.c(fragmentModule.editorialListAnalytics(navigationTracker, analyticsManager));
    }

    @Override // javax.inject.Provider
    public EditorialListAnalytics get() {
        return editorialListAnalytics(this.module, this.navigationTrackerProvider.get(), this.analyticsManagerProvider.get());
    }
}
