package cm.aptoide.pt.install;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.pt.app.AppViewAnalytics;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.download.DownloadAnalytics;
import cm.aptoide.pt.download.Origin;
import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import cm.aptoide.pt.utils.AptoideUtils;
import cm.aptoide.pt.view.DeepLinkManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class InstallAnalytics {
    private static final String AB_TEST_GROUP = "ab_test_group";
    private static final String ACTION = "action";
    private static final String APP = "app";
    private static final String APPC = "appc";
    public static final String APPLICATION_INSTALL = "Application Install";
    private static final String APP_AAB = "app_aab";
    private static final String APP_AAB_INSTALL_TIME = "app_aab_install_time";
    private static final String APP_APPC = "app_appc";
    private static final String APP_BUNDLE = "app_bundle";
    private static final String APP_IN_CATAPPULT = "app_in_catappult";
    private static final String APP_IS_GAME = "app_is_game";
    private static final String APP_MIGRATION = "app_migration";
    private static final String APP_OBB = "app_obb";
    private static final String APP_VERSION_CODE = "app_version_code";
    private static final String CAMPAIGN_ID = "campaign_id";
    private static final String CANCEL = "CANCEL";
    public static final String CLICK_ON_INSTALL = "click_on_install_button";
    private static final String CONTEXT = "context";
    public static final String EDITORS_APPLICATION_INSTALL = "Editors_Choice_Application_Install";
    private static final String EDITORS_CHOICE = "apps-group-editors-choice";
    private static final String ERROR_MESSAGE = "error_message";
    private static final String ERROR_TYPE = "error_type";
    private static final String FAIL = "FAIL";
    public static final String GAMES_CATEGORY = "games";
    private static final String IS_APKFY = "apkfy_app_install";
    private static final String MAIN = "MAIN";
    private static final String MESSAGE = "message";
    private static final int MIGRATION_UNINSTALL_KEY = 8726;
    private static final String MIGRATOR = "migrator";
    private static final String MIUI_AAB_FIX = "miui_aab_fix";
    private static final String NETWORK = "network";
    public static final String NOTIFICATION_APPLICATION_INSTALL = "Aptoide_Push_Notification_Application_Install";
    private static final String NO_PREVIOUS_SCREEN_ERROR = "No_Previous_Screen";
    private static final String OBB = "obb";
    private static final String ORIGIN = "origin";
    private static final String PACKAGE = "package";
    private static final String PACKAGE_NAME = "package_name";
    private static final String PATCH = "PATCH";
    private static final String PHONE = "phone";
    private static final String PREVIOUS_CONTEXT = "previous_context";
    public static final String RAKAM_INSTALL_EVENT = "install";
    private static final String RESULT = "result";
    private static final String ROOT = "root";
    private static final String SETTINGS = "aptoide_settings";
    private static final String STATUS = "status";
    private static final String STORE = "store";
    private static final String SUCCESS = "SUCC";
    private static final String TAG = "tag";
    private static final String TELECO = "teleco";
    private static final String TRUSTED_BADGE = "trusted_badge";
    private static final String TYPE = "type";
    private static final String UPDATE_TO_APPC = "UPDATE TO APPC";
    private static final String URL = "url";
    private final AnalyticsManager analyticsManager;
    private final Map<String, InstallEvent> cache;
    private final ConnectivityManager connectivityManager;
    private final CrashReport crashReport;
    private final NavigationTracker navigationTracker;
    private final TelephonyManager telephonyManager;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class InstallEvent {
        private final AnalyticsManager.Action action;
        private final String context;
        private final Map<String, Object> data;
        private final String eventName;

        public AnalyticsManager.Action getAction() {
            return this.action;
        }

        public String getContext() {
            return this.context;
        }

        public Map<String, Object> getData() {
            return this.data;
        }

        public String getEventName() {
            return this.eventName;
        }

        private InstallEvent(Map<String, Object> map, String str, String str2, AnalyticsManager.Action action) {
            this.data = map;
            this.eventName = str;
            this.context = str2;
            this.action = action;
        }
    }

    public InstallAnalytics(CrashReport crashReport, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, Map<String, InstallEvent> map, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        this.crashReport = crashReport;
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.cache = map;
        this.connectivityManager = connectivityManager;
        this.telephonyManager = telephonyManager;
    }

    private void applicationInstallUpdateApp(int i2, String str, int i3, String str2, InstallEvent installEvent, String str3) {
        if (i3 == 0) {
            Map<String, Object> data = installEvent.getData();
            data.put(URL, str2);
            this.cache.put(getKey(str, i2, str3), new InstallEvent(data, str3, installEvent.getContext(), installEvent.getAction()));
        }
    }

    private void createApplicationInstallEvent(AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, Origin origin, String str, int i2, int i3, String str2, List<String> list, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        Map<String, Object> applicationInstallEventsBaseBundle = getApplicationInstallEventsBaseBundle(str, i3, str2, z2, z3, this.navigationTracker.getViewName(true));
        applicationInstallEventsBaseBundle.put(MIGRATOR, Boolean.valueOf(z));
        if (z) {
            applicationInstallEventsBaseBundle.put(ORIGIN, Origin.UPDATE_TO_APPC);
        } else {
            applicationInstallEventsBaseBundle.put(ORIGIN, origin);
        }
        applicationInstallEventsBaseBundle.put(IS_APKFY, Boolean.valueOf(z4));
        ScreenTagHistory previousScreen = this.navigationTracker.getPreviousScreen();
        ScreenTagHistory currentScreen = this.navigationTracker.getCurrentScreen();
        if (currentScreen.getTag() == null || !currentScreen.getTag().contains(EDITORS_CHOICE)) {
            if (previousScreen == null) {
                if (!list.isEmpty()) {
                    this.crashReport.log(NO_PREVIOUS_SCREEN_ERROR, list.toString());
                }
            } else if (currentScreen.getTag() != null && previousScreen.getFragment().equals(DeepLinkManager.DEEPLINK_KEY)) {
                str3 = NOTIFICATION_APPLICATION_INSTALL;
            }
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str3 = EDITORS_APPLICATION_INSTALL;
        }
        if (!str3.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            this.cache.put(getKey(str, i2, str3), new InstallEvent(applicationInstallEventsBaseBundle, str3, appContext.name(), action));
        }
        this.cache.put(getKey(str, i2, APPLICATION_INSTALL), new InstallEvent(applicationInstallEventsBaseBundle, APPLICATION_INSTALL, appContext.name(), action));
    }

    private Map<String, Object> createInstallClickEventMap(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, boolean z4, boolean z5, boolean z6, String str7) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        HashMap hashMap = new HashMap();
        hashMap.put(CONTEXT, str6);
        hashMap.put("action", str2.toLowerCase());
        hashMap.put("package_name", str);
        hashMap.put(PREVIOUS_CONTEXT, previousViewName);
        hashMap.put(APP_MIGRATION, Boolean.valueOf(z3));
        hashMap.put(APP_APPC, Boolean.valueOf(z2));
        hashMap.put(APP_AAB, Boolean.valueOf(z));
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        hashMap.put(APP_OBB, Boolean.valueOf(z5));
        hashMap.put(APP_IN_CATAPPULT, Boolean.valueOf(z6));
        if (!str7.isEmpty()) {
            hashMap.put(APP_IS_GAME, Boolean.valueOf(str7.equals("games")));
        }
        if (str3 != null) {
            hashMap.put(TRUSTED_BADGE, str3.toLowerCase());
        }
        if (str4 != null) {
            hashMap.put("tag", str4);
        }
        hashMap.put("store", str5);
        return hashMap;
    }

    private void createMigrationInstallEvent(AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, String str, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "install appc app");
        this.cache.put(getKey(str, i2, AppViewAnalytics.BONUS_MIGRATION_APPVIEW), new InstallEvent(hashMap, AppViewAnalytics.BONUS_MIGRATION_APPVIEW, appContext.name(), action));
    }

    private Map<String, Object> createObbData(int i2, String str) {
        HashMap hashMap = new HashMap();
        if (i2 == 1) {
            hashMap.put("type", MAIN);
        } else if (i2 == 2) {
            hashMap.put("type", PATCH);
        }
        hashMap.put(URL, str);
        return hashMap;
    }

    private void createRakamInstallEvent(int i2, String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, DownloadAnalytics.AppContext appContext, boolean z4, boolean z5, String str5, boolean z6, int i3, String str6) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        String tag = this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : HttpUrl.FRAGMENT_ENCODE_SET;
        HashMap hashMap = new HashMap();
        hashMap.put(CONTEXT, currentViewName);
        hashMap.put("action", str2.toLowerCase());
        hashMap.put("package_name", str);
        hashMap.put(PREVIOUS_CONTEXT, previousViewName);
        hashMap.put(APP_MIGRATION, Boolean.valueOf(z));
        hashMap.put(APP_APPC, Boolean.valueOf(z3));
        hashMap.put(APP_AAB, Boolean.valueOf(z2));
        hashMap.put(APP_OBB, Boolean.valueOf(z5));
        hashMap.put(STATUS, RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        hashMap.put(APP_AAB_INSTALL_TIME, str5);
        hashMap.put(APP_VERSION_CODE, Integer.valueOf(i3));
        hashMap.put(APP_IN_CATAPPULT, Boolean.valueOf(z6));
        if (!str6.isEmpty()) {
            hashMap.put(APP_IS_GAME, Boolean.valueOf(str6.equals("games")));
        }
        if (str3 != null) {
            hashMap.put(TRUSTED_BADGE, str3.toLowerCase());
        }
        if (!tag.isEmpty()) {
            hashMap.put("tag", tag);
        }
        hashMap.put("store", str4);
        this.cache.put(getKey(str, i2, RAKAM_INSTALL_EVENT), new InstallEvent(hashMap, RAKAM_INSTALL_EVENT, appContext.name(), AnalyticsManager.Action.CLICK));
    }

    private Map<String, Object> createRoot(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(PHONE, Boolean.valueOf(z));
        hashMap.put(SETTINGS, Boolean.valueOf(z2));
        return hashMap;
    }

    private Map<String, Object> getApplicationInstallEventsBaseBundle(String str, int i2, String str2, boolean z, boolean z2, String str3) {
        ScreenTagHistory previousScreen = this.navigationTracker.getPreviousScreen();
        ScreenTagHistory currentScreen = this.navigationTracker.getCurrentScreen();
        HashMap hashMap = new HashMap();
        hashMap.put("package", str);
        hashMap.put(APPC, Boolean.valueOf(z));
        hashMap.put(APP_BUNDLE, Boolean.valueOf(z2));
        hashMap.put(NETWORK, AptoideUtils.SystemU.getConnectionType(this.connectivityManager).toUpperCase());
        hashMap.put(PREVIOUS_CONTEXT, previousScreen.getFragment());
        hashMap.put("tag", currentScreen.getTag());
        if (i2 >= 0) {
            hashMap.put(CAMPAIGN_ID, Integer.valueOf(i2));
        }
        if (str2 != null) {
            hashMap.put(AB_TEST_GROUP, str2);
        }
        hashMap.put("store", this.navigationTracker.getCurrentScreen().getStore());
        hashMap.put(TELECO, AptoideUtils.SystemU.getCarrierName(this.telephonyManager));
        hashMap.put(CONTEXT, str3);
        return hashMap;
    }

    private String getKey(String str, int i2, String str2) {
        return str + i2 + str2;
    }

    private void sendApplicationInstallEvent(InstallEvent installEvent, boolean z, boolean z2, String str, int i2) {
        Map<String, Object> data = installEvent.getData();
        data.put(ROOT, createRoot(z, z2));
        this.analyticsManager.logEvent(data, APPLICATION_INSTALL, installEvent.getAction(), installEvent.getContext());
        this.cache.remove(getKey(str, i2, APPLICATION_INSTALL));
    }

    private void sendEvent(String str) {
        InstallEvent installEvent = this.cache.get(str);
        if (installEvent != null) {
            this.analyticsManager.logEvent(installEvent.getData(), installEvent.getEventName(), installEvent.getAction(), installEvent.getContext());
        }
        this.cache.remove(str);
    }

    private void sendInstallEvents(String str, int i2, boolean z, boolean z2) {
        InstallEvent installEvent = this.cache.get(getKey(str, i2, APPLICATION_INSTALL));
        if (installEvent != null) {
            sendApplicationInstallEvent(installEvent, z, z2, str, i2);
        }
    }

    private void sendRakamInstallCanceledEvent(String str, int i2) {
        InstallEvent installEvent = this.cache.get(getKey(str, i2, RAKAM_INSTALL_EVENT));
        if (installEvent != null) {
            Map<String, Object> data = installEvent.getData();
            data.put(STATUS, "fail");
            data.put(ERROR_TYPE, "canceled");
            data.put(ERROR_MESSAGE, "The install was canceled");
            this.analyticsManager.logEvent(data, RAKAM_INSTALL_EVENT, installEvent.getAction(), installEvent.getContext());
            this.cache.remove(getKey(str, i2, RAKAM_INSTALL_EVENT));
        }
    }

    private void updateObb(int i2, String str, int i3, String str2, InstallEvent installEvent, String str3) {
        if (i3 == 1 || i3 == 2) {
            Map<String, Object> data = installEvent.getData();
            List list = (List) data.get(OBB);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(createObbData(i3, str2));
            data.put(OBB, list);
            this.cache.put(getKey(str, i2, str3), new InstallEvent(data, installEvent.getEventName(), installEvent.getContext(), installEvent.getAction()));
        }
    }

    public void clickOnInstallEvent(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, boolean z5, boolean z6, String str6) {
        String currentViewName = this.navigationTracker.getCurrentViewName();
        this.analyticsManager.logEvent(createInstallClickEventMap(str, str2, z, z2, z3, str3, str4, str5, currentViewName, z4, z5, z6, str6), CLICK_ON_INSTALL, AnalyticsManager.Action.CLICK, currentViewName);
    }

    public void installCompleted(String str, int i2, boolean z, boolean z2) {
        sendEvent(getKey(str, i2, NOTIFICATION_APPLICATION_INSTALL));
        sendEvent(getKey(str, i2, EDITORS_APPLICATION_INSTALL));
        sendEvent(getKey(str, i2, APPLICATION_INSTALL));
        sendEvent(getKey(str, i2, AppViewAnalytics.BONUS_MIGRATION_APPVIEW));
        sendEvent(getKey(str, i2, RAKAM_INSTALL_EVENT));
        sendInstallEvents(str, i2, z, z2);
    }

    public void installStarted(String str, int i2, AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, Origin origin, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, String str4, boolean z5, String str5) {
        createRakamInstallEvent(i2, str, origin.toString(), z, z3, z2, str2, str3, appContext, false, z4, str4, z5, i2, str5);
        createApplicationInstallEvent(action, appContext, origin, str, i2, -1, null, Collections.emptyList(), z, z2, z3, false);
    }

    public void logInstallCancelEvent(String str, int i2) {
        sendRakamInstallCanceledEvent(str, i2);
    }

    public void uninstallCompleted(String str) {
        sendEvent(getKey(str, MIGRATION_UNINSTALL_KEY, AppViewAnalytics.BONUS_MIGRATION_APPVIEW));
    }

    public void uninstallStarted(String str, AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "uninstall");
        this.cache.put(getKey(str, MIGRATION_UNINSTALL_KEY, AppViewAnalytics.BONUS_MIGRATION_APPVIEW), new InstallEvent(hashMap, AppViewAnalytics.BONUS_MIGRATION_APPVIEW, appContext.name(), action));
    }

    public void updateInstallEvents(int i2, String str, int i3, String str2) {
        InstallEvent installEvent = this.cache.get(getKey(str, i2, APPLICATION_INSTALL));
        if (installEvent != null) {
            applicationInstallUpdateApp(i2, str, i3, str2, installEvent, APPLICATION_INSTALL);
            updateObb(i2, str, i3, str2, installEvent, APPLICATION_INSTALL);
        }
    }

    public void installStarted(String str, int i2, AnalyticsManager.Action action, DownloadAnalytics.AppContext appContext, Origin origin, int i3, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4, boolean z5, String str5, boolean z6, String str6) {
        createRakamInstallEvent(i2, str, origin.toString(), z, z3, z2, str3, str4, appContext, z4, z5, str5, z6, i2, str6);
        if (z) {
            createMigrationInstallEvent(action, appContext, str, i2);
        }
        createApplicationInstallEvent(action, appContext, origin, str, i2, i3, str2, Collections.emptyList(), z, z2, z3, z4);
    }
}
