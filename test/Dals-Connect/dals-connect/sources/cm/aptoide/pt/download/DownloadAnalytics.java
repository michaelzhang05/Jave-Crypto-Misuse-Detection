package cm.aptoide.pt.download;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.pt.database.room.RoomDownload;
import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import cm.aptoide.pt.logger.Logger;
import cm.aptoide.pt.view.DeepLinkManager;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class DownloadAnalytics implements cm.aptoide.pt.downloadmanager.DownloadAnalytics {
    private static final String AB_TEST_GROUP = "ab_test_group";
    private static final String ACTION = "action";
    private static final String ADS_BLOCK_BY_OFFER = "ads_block_by_offer";
    private static final String APP = "app";
    private static final String APPC = "appc";
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
    private static final String CONTEXT = "context";
    public static final String DOWNLOAD_COMPLETE_EVENT = "Download Complete";
    public static final String DOWNLOAD_INTERACT = "Download_Interact";
    public static final String EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME = "Editors_Choice_Download_Complete";
    private static final String ERROR = "error";
    private static final String ERROR_MESSAGE = "error_message";
    private static final String ERROR_TYPE = "error_type";
    private static final String FAIL = "FAIL";
    public static final String GAMES_CATEGORY = "games";
    private static final String IS_APKFY = "apkfy_app_install";
    private static final String MAIN = "MAIN";
    private static final String MESSAGE = "message";
    private static final String MIGRATOR = "migrator";
    private static final String MIRROR = "mirror";
    private static final String MIUI_AAB_FIX = "miui_aab_fix";
    private static final String NETWORK = "network";
    public static final String NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME = "Aptoide_Push_Notification_Download_Complete";
    private static final String OBB = "obb";
    private static final String ORIGIN = "origin";
    private static final String PACKAGE = "package";
    private static final String PACKAGENAME = "Package Name";
    private static final String PACKAGE_NAME = "package_name";
    private static final String PATCH = "PATCH";
    private static final String POSITION = "position";
    private static final String PREVIOUS_CONTEXT = "previous_context";
    private static final String PREVIOUS_TAG = "previous_tag";
    public static final String RAKAM_DOWNLOAD_EVENT = "download";
    private static final String RESULT = "result";
    private static final String STATUS = "status";
    private static final String STORE = "store";
    private static final String SUCCESS = "SUCC";
    private static final String TAG = "tag";
    private static final String TELECO = "teleco";
    private static final String TRUSTED_BADGE = "Trusted Badge";
    private static final String TYPE = "type";
    private static final String UPDATE_TO_APPC = "UPDATE TO APPC";
    private static final String URL = "url";
    private final AnalyticsManager analyticsManager;
    private final Map<String, DownloadEvent> cache = new HashMap();
    private final ConnectivityManager connectivityManager;
    private final NavigationTracker navigationTracker;
    private final TelephonyManager telephonyManager;

    /* loaded from: classes.dex */
    public enum AppContext {
        TIMELINE,
        APPVIEW,
        UPDATE_TAB,
        APPS_FRAGMENT,
        APPS_MIGRATOR_SEE_MORE,
        AUTO_UPDATE,
        DOWNLOADS,
        EDITORIAL,
        PROMOTIONS,
        WALLET_INSTALL_ACTIVITY,
        SEARCH
    }

    /* loaded from: classes.dex */
    public static class DownloadEvent {
        private final AnalyticsManager.Action action;
        private final String context;
        private final Map<String, Object> data;
        private final String eventName;
        private boolean hadProgress = false;

        public DownloadEvent(String str, HashMap<String, Object> hashMap, String str2, AnalyticsManager.Action action) {
            this.data = hashMap;
            this.eventName = str;
            this.action = action;
            this.context = str2;
        }

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

        public boolean isHadProgress() {
            return this.hadProgress;
        }

        public void setHadProgress(boolean z) {
            this.hadProgress = z;
        }
    }

    public DownloadAnalytics(ConnectivityManager connectivityManager, TelephonyManager telephonyManager, NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        this.connectivityManager = connectivityManager;
        this.telephonyManager = telephonyManager;
        this.navigationTracker = navigationTracker;
        this.analyticsManager = analyticsManager;
    }

    private HashMap<String, Object> createDownloadCompleteEventMap(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(PACKAGENAME, str);
        hashMap.put(CONTEXT, str3);
        hashMap.put(TRUSTED_BADGE, str2);
        hashMap.put(APPC, Boolean.valueOf(z2));
        hashMap.put(APP_BUNDLE, Boolean.valueOf(z3));
        hashMap.put(MIGRATOR, Boolean.valueOf(z));
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        if (screenTagHistory != null) {
            hashMap.put("tag", screenTagHistory2.getTag());
            if (screenTagHistory.getFragment() != null) {
                hashMap.put(PREVIOUS_CONTEXT, screenTagHistory.getFragment());
            }
            if (screenTagHistory.getStore() != null) {
                hashMap.put("store", screenTagHistory.getStore());
            }
        }
        return hashMap;
    }

    private HashMap<String, Object> createRakamDownloadEvent(String str, int i2, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4, String str5, String str6, String str7, boolean z5, String str8, boolean z6, String str9) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(CONTEXT, str6);
        hashMap.put("action", str2.toLowerCase());
        hashMap.put("package_name", str);
        hashMap.put(APP_VERSION_CODE, Integer.valueOf(i2));
        hashMap.put(PREVIOUS_CONTEXT, str5);
        hashMap.put(APP_MIGRATION, Boolean.valueOf(z));
        hashMap.put(APP_APPC, Boolean.valueOf(z3));
        hashMap.put(APP_AAB, Boolean.valueOf(z2));
        hashMap.put(APP_OBB, Boolean.valueOf(z5));
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        hashMap.put(APP_AAB_INSTALL_TIME, str8);
        hashMap.put(APP_IN_CATAPPULT, Boolean.valueOf(z6));
        if (!str9.isEmpty()) {
            hashMap.put(APP_IS_GAME, Boolean.valueOf(str9.equals("games")));
        }
        if (str3 != null) {
            hashMap.put(TRUSTED_BADGE, str3.toLowerCase());
        }
        if (!str7.isEmpty()) {
            hashMap.put("tag", str7);
        }
        hashMap.put("store", str4);
        return hashMap;
    }

    private void editorsChoiceDownloadCompletedEvent(String str, String str2, String str3, String str4, InstallType installType, String str5, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3) {
        if (str4 == null || str4.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PACKAGENAME, str3);
        hashMap.put(CONTEXT, str5);
        hashMap.put(PREVIOUS_CONTEXT, str);
        hashMap.put(POSITION, str4);
        hashMap.put("type", installType.name());
        hashMap.put(APPC, Boolean.valueOf(z));
        hashMap.put(APP_BUNDLE, Boolean.valueOf(z2));
        hashMap.put(IS_APKFY, Boolean.valueOf(z3));
        DownloadEvent downloadEvent = new DownloadEvent(EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME, hashMap, str5, action);
        this.cache.put(str2 + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME, downloadEvent);
    }

    private void handleRakamOnError(String str, Throwable th) {
        DownloadEvent downloadEvent = this.cache.get(str + RAKAM_DOWNLOAD_EVENT);
        if (downloadEvent != null) {
            Map<String, Object> data = downloadEvent.getData();
            data.put(STATUS, "fail");
            data.put(ERROR_TYPE, th.getClass().getSimpleName());
            data.put(ERROR_MESSAGE, th.getMessage());
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
            this.cache.remove(str + RAKAM_DOWNLOAD_EVENT);
        }
    }

    private void pushNotificationDownloadEvent(String str, String str2, String str3, InstallType installType, AnalyticsManager.Action action, String str4, boolean z) {
        if (str.equals(DeepLinkManager.DEEPLINK_KEY)) {
            HashMap hashMap = new HashMap();
            hashMap.put(PACKAGENAME, str3);
            hashMap.put("type", installType.name());
            hashMap.put(IS_APKFY, Boolean.valueOf(z));
            DownloadEvent downloadEvent = new DownloadEvent(NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME, hashMap, str4, action);
            this.cache.put(str2 + NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME, downloadEvent);
        }
    }

    private void rakamDownloadCompleteEvent(String str, String str2, int i2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, boolean z4, boolean z5, String str6, boolean z6, String str7) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        DownloadEvent downloadEvent = new DownloadEvent(RAKAM_DOWNLOAD_EVENT, createRakamDownloadEvent(str2, i2, str3, z, z2, z3, str4, str5, z4, previousViewName, currentViewName, this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : HttpUrl.FRAGMENT_ENCODE_SET, z5, str6, z6, str7), currentViewName, AnalyticsManager.Action.CLICK);
        this.cache.put(str + RAKAM_DOWNLOAD_EVENT, downloadEvent);
    }

    private void sendDownloadEvent(String str) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent == null || !downloadEvent.isHadProgress()) {
            return;
        }
        this.analyticsManager.logEvent(downloadEvent.getData(), downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
        this.cache.remove(str);
    }

    private void sendRakamDownloadEvent(String str) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent == null || !downloadEvent.isHadProgress()) {
            return;
        }
        Map<String, Object> data = downloadEvent.getData();
        data.put(STATUS, RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
        this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
        this.cache.remove(str);
    }

    private void setUpInstallEvent(String str, int i2, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3, String str5, boolean z4, boolean z5, String str6, boolean z6, String str7) {
        String viewName = this.navigationTracker.getViewName(true);
        rakamDownloadCompleteEvent(str, str2, i2, installType.toString(), z, z3, z2, str3, str5, z4, z5, str6, z6, str7);
        editorsChoiceDownloadCompletedEvent(viewName, str, str2, str4, installType, viewName, action, z2, z3, z4);
        pushNotificationDownloadEvent(viewName, str, str2, installType, action, viewName, z4);
        downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, str3, action, viewName, z, Boolean.valueOf(z2), z3, z4);
    }

    private void updateDownloadEventWithHasProgress(String str) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent != null) {
            downloadEvent.setHadProgress(true);
            return;
        }
        Logger.getInstance().d("DownloadAnalytics", "Tried setting progress on an event that was not setup " + str);
    }

    public void downloadCompleteEvent(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, AnalyticsManager.Action action, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        HashMap<String, Object> createDownloadCompleteEventMap = createDownloadCompleteEventMap(screenTagHistory, screenTagHistory2, str2, str3, z2, z3, z4, str4, z5);
        createDownloadCompleteEventMap.put(ADS_BLOCK_BY_OFFER, Boolean.valueOf(z));
        DownloadEvent downloadEvent = new DownloadEvent(DOWNLOAD_COMPLETE_EVENT, createDownloadCompleteEventMap, str4, action);
        this.cache.put(str + DOWNLOAD_COMPLETE_EVENT, downloadEvent);
    }

    public void downloadInteractEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("package_name", str);
        hashMap.put("action", str2);
        this.analyticsManager.logEvent(hashMap, DOWNLOAD_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public Origin getOrigin(int i2) {
        if (i2 == 0) {
            return Origin.INSTALL;
        }
        if (i2 == 1) {
            return Origin.UPDATE;
        }
        if (i2 != 2) {
            return Origin.INSTALL;
        }
        return Origin.DOWNGRADE;
    }

    public void installClicked(String str, int i2, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6, boolean z5, String str7) {
        setUpInstallEvent(str, i2, str2, str3, str4, installType, action, false, z, z2, str5, z3, z4, str6, z5, str7);
    }

    public void migrationClicked(String str, int i2, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6, boolean z5, String str7) {
        setUpInstallEvent(str, i2, str2, str3, str4, installType, action, true, z, z2, str5, z3, z4, str6, z5, str7);
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadAnalytics
    public void onDownloadComplete(String str, String str2, int i2) {
        sendDownloadEvent(str + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME);
        sendDownloadEvent(str + DOWNLOAD_COMPLETE_EVENT);
        sendDownloadEvent(str + NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME);
        sendRakamDownloadEvent(str + RAKAM_DOWNLOAD_EVENT);
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadAnalytics
    public void onError(String str, int i2, String str2, Throwable th) {
        handleRakamOnError(str2, th);
    }

    public void sendAppNotValidError(String str, int i2, InstallType installType, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, Throwable th, boolean z5, String str4, boolean z6, String str5) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        HashMap<String, Object> createRakamDownloadEvent = createRakamDownloadEvent(str, i2, installType.toString(), z, z2, z3, str2, str3, z4, previousViewName, currentViewName, this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : HttpUrl.FRAGMENT_ENCODE_SET, z5, str4, z6, str5);
        createRakamDownloadEvent.put(STATUS, "fail");
        createRakamDownloadEvent.put(ERROR_TYPE, th.getClass().getSimpleName());
        createRakamDownloadEvent.put(ERROR_MESSAGE, th.getMessage());
        DownloadEvent downloadEvent = new DownloadEvent(RAKAM_DOWNLOAD_EVENT, createRakamDownloadEvent, currentViewName, AnalyticsManager.Action.CLICK);
        this.analyticsManager.logEvent(createRakamDownloadEvent, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
    }

    public void sendNotEnoughSpaceError(String str) {
        DownloadEvent downloadEvent = this.cache.get(str + RAKAM_DOWNLOAD_EVENT);
        if (downloadEvent != null) {
            Map<String, Object> data = downloadEvent.getData();
            data.put(STATUS, "incomplete");
            data.put(ERROR_TYPE, "FileDownloadOutOfSpace");
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
        }
    }

    @Override // cm.aptoide.pt.downloadmanager.DownloadAnalytics
    public void startProgress(RoomDownload roomDownload) {
        updateDownloadEventWithHasProgress(roomDownload.getMd5() + DOWNLOAD_COMPLETE_EVENT);
        updateDownloadEventWithHasProgress(roomDownload.getMd5() + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME);
        updateDownloadEventWithHasProgress(roomDownload.getMd5() + RAKAM_DOWNLOAD_EVENT);
    }

    public void installClicked(String str, String str2, int i2, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, boolean z4, String str7, boolean z5, String str8) {
        setUpInstallEvent(str, str2, i2, action, z, z2, z3, str3, str5, str6, z4, str7, z5, str8);
    }

    public void migrationClicked(String str, String str2, int i2, AnalyticsManager.Action action, boolean z, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7) {
        setUpInstallEvent(str, str2, i2, action, true, true, z, str3, str5, "update_to_appc", z2, str6, z3, str7);
    }

    public void downloadCompleteEvent(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, AnalyticsManager.Action action, String str4, boolean z, Boolean bool, boolean z2, boolean z3) {
        DownloadEvent downloadEvent = new DownloadEvent(DOWNLOAD_COMPLETE_EVENT, createDownloadCompleteEventMap(screenTagHistory, screenTagHistory2, str2, str3, z, bool.booleanValue(), z2, str4, z3), str4, action);
        this.cache.put(str + DOWNLOAD_COMPLETE_EVENT, downloadEvent);
    }

    private void setUpInstallEvent(String str, String str2, int i2, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, String str6, boolean z5, String str7) {
        String viewName = this.navigationTracker.getViewName(true);
        rakamDownloadCompleteEvent(str, str2, i2, str5, z, z3, z2, str3, str4, false, z4, str6, z5, str7);
        downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, null, action, viewName, z, Boolean.valueOf(z2), z3, false);
    }

    public void downloadCompleteEvent(String str, String str2, String str3, AnalyticsManager.Action action, boolean z) {
        downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, str3, action, this.navigationTracker.getViewName(true), false, Boolean.FALSE, z, false);
    }
}
