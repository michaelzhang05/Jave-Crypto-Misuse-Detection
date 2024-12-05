package cm.aptoide.pt.store.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class TopStoresFragment_MembersInjector implements f.a<TopStoresFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public TopStoresFragment_MembersInjector(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
    }

    public static f.a<TopStoresFragment> create(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2) {
        return new TopStoresFragment_MembersInjector(provider, provider2);
    }

    public static void injectAnalyticsManager(TopStoresFragment topStoresFragment, AnalyticsManager analyticsManager) {
        topStoresFragment.analyticsManager = analyticsManager;
    }

    public static void injectNavigationTracker(TopStoresFragment topStoresFragment, NavigationTracker navigationTracker) {
        topStoresFragment.navigationTracker = navigationTracker;
    }

    public void injectMembers(TopStoresFragment topStoresFragment) {
        injectAnalyticsManager(topStoresFragment, this.analyticsManagerProvider.get());
        injectNavigationTracker(topStoresFragment, this.navigationTrackerProvider.get());
    }
}
