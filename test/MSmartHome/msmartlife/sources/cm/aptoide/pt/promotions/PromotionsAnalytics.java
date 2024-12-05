package cm.aptoide.pt.promotions;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.app.AppViewAnalytics;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.database.room.RoomDownload;
import cm.aptoide.pt.database.room.RoomInstalled;
import cm.aptoide.pt.download.DownloadAnalytics;
import cm.aptoide.pt.download.Origin;
import cm.aptoide.pt.install.InstallAnalytics;
import java.util.HashMap;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class PromotionsAnalytics {
    private static final String ACTION = "action";
    private static final String ACTION_CLAIM = "claim";
    private static final String ACTION_INSTALL = "install";
    private static final String ACTION_UPDATE = "update";
    private static final String AMOUNT = "amount";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String CONTEXT = "context";
    private static final String PACKAGE = "package";
    public static final String PROMOTIONS_INTERACT = "Promotions_Interact";
    public static final String PROMOTION_DIALOG = "Promotion_Dialog";
    public static final String VALENTINE_MIGRATOR = "Valentine_Migrator";
    private static final String VIEW = "view";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final String NEXT = "next";
    private final String CANCEL = "cancel";
    private final String OPEN_WALLET = "open wallet";
    private final String WALLET_DIALOG = "wallet dialog";
    private final String SIGNATURE = RoomInstalled.SIGNATURE;
    private final String ACTION_OPEN = "open";

    public PromotionsAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.downloadAnalytics = downloadAnalytics;
        this.installAnalytics = installAnalytics;
    }

    private HashMap<String, Object> createPromotionsInteractMap(String str, String str2, float f2) {
        HashMap<String, Object> putPromotionAppAction = putPromotionAppAction(str, new HashMap<>());
        putPromotionAppAction.put("package", str2);
        putPromotionAppAction.put(AMOUNT, Float.valueOf(f2));
        return putPromotionAppAction;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private HashMap<String, Object> putPromotionAppAction(String str, HashMap<String, Object> hashMap) {
        hashMap.put("action", str);
        return hashMap;
    }

    public void sendClickOnWalletDialogCancel(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "cancel");
        hashMap.put("package", str);
        hashMap.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(hashMap, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendClickOnWalletDialogFindWallet(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "open wallet");
        hashMap.put("package", str);
        hashMap.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(hashMap, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendClickOnWalletDialogNext(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "next");
        hashMap.put("package", str);
        hashMap.put(VIEW, "wallet dialog");
        this.analyticsManager.logEvent(hashMap, PROMOTION_DIALOG, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendOpenPromotionsFragmentEvent() {
        this.analyticsManager.logEvent(putPromotionAppAction("open", new HashMap<>()), PROMOTIONS_INTERACT, AnalyticsManager.Action.CLICK, getViewName(false));
    }

    public void sendPromotionsAppInteractClaimEvent(String str, float f2) {
        this.analyticsManager.logEvent(createPromotionsInteractMap(ACTION_CLAIM, str, f2), PROMOTIONS_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPromotionsAppInteractInstallEvent(String str, float f2, DownloadModel.Action action, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, List<String> list) {
        String str5;
        String viewName = getViewName(true);
        if (action == DownloadModel.Action.INSTALL) {
            str5 = "install";
        } else {
            str5 = action == DownloadModel.Action.UPDATE ? ACTION_UPDATE : null;
        }
        String str6 = str5;
        HashMap hashMap = new HashMap();
        hashMap.put(APPLICATION_NAME, str);
        hashMap.put(CONTEXT, viewName);
        hashMap.put("action", str6);
        if (str6 != null) {
            this.installAnalytics.clickOnInstallEvent(str, str6, z, z2, str6.equals(DownloadModel.Action.MIGRATE.toString()), str2, str3, str4, false, z3, list.contains("STORE_BDS"), HttpUrl.FRAGMENT_ENCODE_SET);
            AnalyticsManager analyticsManager = this.analyticsManager;
            HashMap<String, Object> createPromotionsInteractMap = createPromotionsInteractMap(str6, str, f2);
            AnalyticsManager.Action action2 = AnalyticsManager.Action.CLICK;
            analyticsManager.logEvent(createPromotionsInteractMap, PROMOTIONS_INTERACT, action2, viewName);
            this.analyticsManager.logEvent(hashMap, AppViewAnalytics.CLICK_INSTALL, action2, viewName);
        }
    }

    public void sendValentineMigratorEvent(String str, Boolean bool) {
        HashMap hashMap = new HashMap();
        hashMap.put("package", str);
        hashMap.put(RoomInstalled.SIGNATURE, bool.booleanValue() ? "same" : "different");
        this.analyticsManager.logEvent(hashMap, VALENTINE_MIGRATOR, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i2, String str, AnalyticsManager.Action action, Origin origin, boolean z) {
        this.downloadAnalytics.downloadCompleteEvent(roomDownload.getMd5(), roomDownload.getPackageName(), HttpUrl.FRAGMENT_ENCODE_SET, action, z);
    }
}
