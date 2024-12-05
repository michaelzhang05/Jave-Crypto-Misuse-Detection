package cm.aptoide.pt.store;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.utils.AptoideUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class StoreAnalytics {
    private static final String ACTION = "action";
    private static final String FOLLOW_STORE_APPS = "follow_store_apps";
    private static final String FOLLOW_STORE_FOLLOWERS = "follow_store_followers";
    private static final String SOURCE = "source";
    public static final String STORES_INTERACT = "Store_Interact";
    public static final String STORES_OPEN = "Store_Open";
    public static final String STORES_TAB_INTERACT = "Stores_Tab_Interact";
    private static final String STORE_NAME = "store_name";
    private static final String TAB = "tab_name";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public StoreAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private Map<String, Object> createStoreInteractDataMap(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put(TAB, str2);
        hashMap.put("store_name", str3);
        return hashMap;
    }

    private Map<String, Object> createStoreInteractMap(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        return hashMap;
    }

    private Map<String, Object> createStoreOpenDataMap(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(SOURCE, str);
        hashMap.put("store_name", str2);
        return hashMap;
    }

    private Map<String, Object> createStoreTabInteractDataMap(String str, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put(FOLLOW_STORE_APPS, AptoideUtils.StringU.toString(Integer.valueOf(i2)));
        hashMap.put(FOLLOW_STORE_FOLLOWERS, AptoideUtils.StringU.toString(Integer.valueOf(i3)));
        return hashMap;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void sendFollowersStoresInteractEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "Open Followers");
        this.analyticsManager.logEvent(hashMap, STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendFollowingStoresInteractEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "Open Following");
        this.analyticsManager.logEvent(hashMap, STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreInteractEvent(String str, String str2, String str3) {
        this.analyticsManager.logEvent(createStoreInteractDataMap(str, str2, str3), STORES_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreOpenEvent(String str, String str2, boolean z) {
        this.analyticsManager.logEvent(createStoreOpenDataMap(str, str2), STORES_OPEN, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendStoreTabInteractEvent(String str, boolean z) {
        this.analyticsManager.logEvent(createStoreInteractMap(str), STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendStoreTabInteractEvent(String str, int i2, int i3) {
        this.analyticsManager.logEvent(createStoreTabInteractDataMap(str, i2, i3), STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
