package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import java.util.HashMap;

/* loaded from: classes.dex */
public class AppShortcutsAnalytics {
    public static final String APPS_SHORTCUTS = "Apps_Shortcuts";
    private static final String DESTINATION = "destination";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public AppShortcutsAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void shortcutNavigation(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(DESTINATION, str);
        this.analyticsManager.logEvent(hashMap, APPS_SHORTCUTS, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
