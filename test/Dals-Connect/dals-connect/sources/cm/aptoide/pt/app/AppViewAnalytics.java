package cm.aptoide.pt.app;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.account.AdultContentAnalytics;
import cm.aptoide.pt.ads.data.ApplicationAd;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.app.view.AppViewSimilarAppsAdapter;
import cm.aptoide.pt.database.room.RoomDownload;
import cm.aptoide.pt.dataprovider.model.v7.store.Store;
import cm.aptoide.pt.download.DownloadAnalytics;
import cm.aptoide.pt.download.InstallType;
import cm.aptoide.pt.install.InstallAnalytics;
import cm.aptoide.pt.logger.Logger;
import cm.aptoide.pt.store.StoreAnalytics;
import cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppViewAnalytics {
    private static final String ACTION = "Action";
    public static final String ADS_BLOCK_BY_OFFER = "Ads_Block_By_Offer";
    public static final String APPC_SIMILAR_APP_INTERACT = "Appc_Similar_App_Interact";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String APPLICATION_PUBLISHER = "Application Publisher";
    private static final String APP_BUNDLE = "app_bundle";
    private static final String APP_SHORTCUT = "App_Shortcut";
    public static final String APP_VIEW_INTERACT = "App_View_Interact";
    public static final String APP_VIEW_OPEN_FROM = "App_Viewed_Open_From";
    public static final String BONUS_GAME_WALLET_OFFER_19 = "Bonus_Game_Wallet_Offer_19_App_View";
    public static final String BONUS_MIGRATION_APPVIEW = "Bonus_Migration_19_App_View";
    public static final String CLICK_INSTALL = "Clicked on install button";
    private static final String CONTEXT = "context";
    public static final String EDITORS_CHOICE_CLICKS = "Editors_Choice_Clicks";
    public static final String HOME_PAGE_EDITORS_CHOICE_FLURRY = "Home_Page_Editors_Choice";
    private static final String IMPRESSION = "impression";
    private static final String IS_AD = "Is_ad";
    private static final String IS_APKFY = "apkfy_app_install";
    private static final String NETWORK = "network";
    private static final String PACKAGE_NAME = "Package_name";
    private static final String POSITION = "Position";
    public static final String SIMILAR_APP_INTERACT = "Similar_App_Interact";
    private static final String TAP_ON_APP = "tap_on_app";
    private static final String TYPE = "type";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final StoreAnalytics storeAnalytics;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.app.AppViewAnalytics$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr;
            try {
                iArr[DownloadModel.Action.DOWNGRADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.MIGRATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AppViewAnalytics(DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, StoreAnalytics storeAnalytics, InstallAnalytics installAnalytics) {
        this.downloadAnalytics = downloadAnalytics;
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.storeAnalytics = storeAnalytics;
        this.installAnalytics = installAnalytics;
    }

    private HashMap<String, Object> createAppViewedFromMap(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, boolean z, boolean z2) throws NullPointerException {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (screenTagHistory != null) {
            if (screenTagHistory.getFragment() != null) {
                hashMap.put("fragment", screenTagHistory.getFragment());
            }
            if (screenTagHistory.getStore() != null) {
                hashMap.put(AccountAnalytics.STORE, screenTagHistory.getStore());
            }
        }
        if (screenTagHistory2 != null && screenTagHistory2.getTag() != null) {
            hashMap.put(StoreTabGridRecyclerFragment.BundleCons.TAG, screenTagHistory2.getTag());
        }
        hashMap.put("appcoins_type", mapAppCoinsInfo(z, z2));
        hashMap.put("package_name", str);
        hashMap.put("application_publisher", str2);
        hashMap.put("trusted_badge", str3);
        return hashMap;
    }

    private Map<String, Object> createEditorsChoiceClickEventMap(ScreenTagHistory screenTagHistory, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (screenTagHistory != null && screenTagHistory.getFragment() != null) {
            hashMap.put("fragment", screenTagHistory.getFragment());
        }
        hashMap.put("package_name", str);
        hashMap.put("position", str2);
        return hashMap;
    }

    private Map<String, Object> createEditorsClickEventMap(ScreenTagHistory screenTagHistory, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(APPLICATION_NAME, str);
        hashMap.put("Search Position", str2);
        if (screenTagHistory != null && screenTagHistory.getFragment() != null) {
            hashMap.put("fragment", screenTagHistory.getFragment());
        }
        return hashMap;
    }

    private Map<String, Object> createFlagAppEventData(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, str);
        hashMap.put("flag_details", str2);
        return hashMap;
    }

    private Map<String, Object> createMapData(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    private Map<String, Object> createSimilarAppsEventData(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "Open App on Recommended for you");
        hashMap.put("bundle_tag", str);
        return hashMap;
    }

    private HashMap<String, Object> getABTestMap(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("group", str);
        return hashMap;
    }

    private HashMap<String, Object> getSimilarABTestData(boolean z) {
        return getABTestMap(z ? "control" : "appc_bundle");
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private String mapAppCoinsInfo(boolean z, boolean z2) {
        return (z && z2) ? "AppCoins Ads IAB" : z ? "AppCoins IAB" : z2 ? "AppCoins Ads" : "None";
    }

    private InstallType mapDownloadAction(DownloadModel.Action action) {
        InstallType installType = InstallType.INSTALL;
        int i2 = AnonymousClass1.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i2 == 1) {
            return InstallType.DOWNGRADE;
        }
        if (i2 == 2) {
            return installType;
        }
        if (i2 == 3) {
            return InstallType.UPDATE;
        }
        if (i2 != 4 && i2 != 5) {
            return installType;
        }
        throw new IllegalStateException("Mapping an invalid download action " + action.name());
    }

    private String mapToPromotionOffer(String str) {
        return str.equals("BONUS_MIGRATION_19") ? BONUS_MIGRATION_APPVIEW : str.equals("BONUS_GAME_WALLET_OFFER_19") ? BONUS_GAME_WALLET_OFFER_19 : "N/A";
    }

    private void sendClickOnClaimAppcWalletPromotion(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "claim");
        this.analyticsManager.logEvent(hashMap, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendClickOnNoThanksWalletInstall(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "no thanks");
        this.analyticsManager.logEvent(hashMap, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendInstallAppcWalletEvent(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "install wallet");
        this.analyticsManager.logEvent(hashMap, str, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void sendPromotionImpressionEvent(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, IMPRESSION);
        this.analyticsManager.logEvent(hashMap, str, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    private void similarAppInteract(ApplicationAd.Network network, String str, String str2, int i2, boolean z) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put(NETWORK, network.getName());
        }
        hashMap.put(ACTION, str);
        hashMap.put(IS_AD, z ? "true" : AdultContentAnalytics.UNLOCK);
        if (str.equals(TAP_ON_APP)) {
            hashMap.put(PACKAGE_NAME, str2);
            hashMap.put(POSITION, Integer.valueOf(i2));
        }
        this.analyticsManager.logEvent(hashMap, SIMILAR_APP_INTERACT, str.equals(IMPRESSION) ? AnalyticsManager.Action.IMPRESSION : AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    private void similarAppcAppClick(int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, TAP_ON_APP);
        hashMap.put(PACKAGE_NAME, str);
        hashMap.put(POSITION, Integer.valueOf(i2));
        this.analyticsManager.logEvent(hashMap, APPC_SIMILAR_APP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void clickOnInstallButton(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, boolean z4, boolean z5, List<String> list, String str7) {
        String viewName = getViewName(true);
        HashMap hashMap = new HashMap();
        hashMap.put("type", str3);
        hashMap.put(APPLICATION_NAME, str);
        hashMap.put(APPLICATION_PUBLISHER, str2);
        hashMap.put(APP_BUNDLE, Boolean.valueOf(z));
        hashMap.put(CONTEXT, viewName);
        hashMap.put(IS_APKFY, Boolean.valueOf(z4));
        this.installAnalytics.clickOnInstallEvent(str, str3, z, z2, z3, str4, str5, str6, z4, z5, list.contains("STORE_BDS"), str7);
        this.analyticsManager.logEvent(hashMap, CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
    }

    public void sendAppShareEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "App Share"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendAppViewOpenedFromEvent(String str, String str2, String str3, boolean z, boolean z2) {
        this.analyticsManager.logEvent(createAppViewedFromMap(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, str3, z, z2), APP_VIEW_OPEN_FROM, AnalyticsManager.Action.CLICK, getViewName(false));
    }

    public void sendAppcInfoInteractEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "AppCoins Info View"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendAppcMigrationAppOpen() {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "open");
        this.analyticsManager.logEvent(hashMap, BONUS_MIGRATION_APPVIEW, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }

    public void sendAppcMigrationUpdateClick() {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "update to appc");
        this.analyticsManager.logEvent(hashMap, BONUS_MIGRATION_APPVIEW, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendBadgeClickEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Badge"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendClickOnClaimAppViewPromotion(String str) {
        sendClickOnClaimAppcWalletPromotion(mapToPromotionOffer(str));
    }

    public void sendClickOnNoThanksWallet(String str) {
        sendClickOnNoThanksWalletInstall(mapToPromotionOffer(str));
    }

    public void sendDownloadCancelEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "cancel");
    }

    public void sendDownloadPauseEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "pause");
    }

    public void sendEditorsChoiceClickEvent(String str, String str2) {
        AnalyticsManager analyticsManager = this.analyticsManager;
        Map<String, Object> createEditorsChoiceClickEventMap = createEditorsChoiceClickEventMap(this.navigationTracker.getPreviousScreen(), str, str2);
        AnalyticsManager.Action action = AnalyticsManager.Action.CLICK;
        analyticsManager.logEvent(createEditorsChoiceClickEventMap, EDITORS_CHOICE_CLICKS, action, getViewName(false));
        this.analyticsManager.logEvent(createEditorsClickEventMap(this.navigationTracker.getPreviousScreen(), str, str2), HOME_PAGE_EDITORS_CHOICE_FLURRY, action, getViewName(false));
    }

    public void sendFlagAppEvent(String str) {
        this.analyticsManager.logEvent(createFlagAppEventData("Flag App", str), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendFollowStoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Follow Store"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendInstallAppcWallet(String str) {
        sendInstallAppcWalletEvent(mapToPromotionOffer(str));
    }

    public void sendInstallPromotionApp() {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, "install appc app");
        this.analyticsManager.logEvent(hashMap, BONUS_GAME_WALLET_OFFER_19, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendInvalidAppEventError(String str, int i2, DownloadModel.Action action, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, Throwable th, boolean z5, String str4, String str5) {
        this.downloadAnalytics.sendAppNotValidError(str, i2, mapDownloadAction(action), z, z2, z3, str2, str3, z4, th, z5, str4, str3.equals("catappult"), str5);
    }

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendOpenScreenshotEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Screenshot"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOpenStoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Store"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOpenVideoEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Open Video"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendOtherVersionsEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Other Versions"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPromotionImpression(String str) {
        if (str.equals("BONUS_MIGRATION_19")) {
            sendPromotionImpressionEvent(BONUS_MIGRATION_APPVIEW);
        } else if (str.equals("BONUS_GAME_WALLET_OFFER_19")) {
            sendPromotionImpressionEvent(BONUS_GAME_WALLET_OFFER_19);
        }
    }

    public void sendRateThisAppEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Rate This App"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendReadAllEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Read All"), APP_VIEW_INTERACT, AnalyticsManager.Action.VIEW, getViewName(true));
    }

    public void sendReadMoreEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Read More"), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendRemoteInstallEvent() {
        this.analyticsManager.logEvent(createMapData(ACTION, "Install on TV"), APP_VIEW_INTERACT, AnalyticsManager.Action.INSTALL, getViewName(true));
    }

    public void sendSimilarABTestGroupEvent(boolean z) {
        Logger.getInstance().d("AppViewAnalytics", "similar_apps_control_group: " + z);
    }

    public void sendSimilarAppsInteractEvent(String str) {
        this.analyticsManager.logEvent(createSimilarAppsEventData(str), APP_VIEW_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreOpenEvent(Store store) {
        this.storeAnalytics.sendStoreOpenEvent("App View", store.getName(), true);
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i2, String str, DownloadModel.Action action, AnalyticsManager.Action action2, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6) {
        if (DownloadModel.Action.MIGRATE.equals(action)) {
            this.downloadAnalytics.migrationClicked(roomDownload.getMd5(), roomDownload.getVersionCode(), roomDownload.getPackageName(), str2, str3, InstallType.UPDATE_TO_APPC, action2, roomDownload.hasAppc(), roomDownload.hasSplits(), str4, z, roomDownload.hasObbs(), str5, z2, str6);
        } else {
            this.downloadAnalytics.installClicked(roomDownload.getMd5(), roomDownload.getVersionCode(), roomDownload.getPackageName(), str2, str3, mapDownloadAction(action), action2, roomDownload.hasAppc(), roomDownload.hasSplits(), str4, z, roomDownload.hasObbs(), str5, z2, str6);
        }
    }

    public void similarAppBundleImpression(ApplicationAd.Network network, boolean z) {
        similarAppInteract(network, IMPRESSION, null, -1, z);
    }

    public void similarAppClick(AppViewSimilarAppsAdapter.SimilarAppType similarAppType, ApplicationAd.Network network, String str, int i2, boolean z) {
        if (similarAppType.equals(AppViewSimilarAppsAdapter.SimilarAppType.APPC_SIMILAR_APPS)) {
            similarAppcAppClick(i2, str);
        } else if (similarAppType.equals(AppViewSimilarAppsAdapter.SimilarAppType.SIMILAR_APPS)) {
            similarAppInteract(network, TAP_ON_APP, str, i2, z);
        }
    }

    public void similarAppcAppBundleImpression() {
        HashMap hashMap = new HashMap();
        hashMap.put(IS_AD, Boolean.FALSE);
        String lowerCase = ACTION.toLowerCase();
        AnalyticsManager.Action action = AnalyticsManager.Action.IMPRESSION;
        hashMap.put(lowerCase, action.name().toLowerCase());
        this.analyticsManager.logEvent(hashMap, APPC_SIMILAR_APP_INTERACT, action, this.navigationTracker.getViewName(true));
    }
}
