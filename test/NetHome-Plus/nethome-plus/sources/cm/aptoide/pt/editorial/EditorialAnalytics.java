package cm.aptoide.pt.editorial;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.app.AppViewAnalytics;
import cm.aptoide.pt.database.room.RoomDownload;
import cm.aptoide.pt.download.DownloadAnalytics;
import cm.aptoide.pt.download.SplitAnalyticsMapper;
import cm.aptoide.pt.install.InstallAnalytics;
import java.util.HashMap;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class EditorialAnalytics {
    private static final String ACTION = "action";
    private static final String APPLICATION_NAME = "Application Name";
    private static final String CONTEXT = "context";
    public static final String CURATION_CARD_INSTALL = "Curation_Card_Install";
    private static final String CURATION_DETAIL = "curation_detail";
    public static final String EDITORIAL_BN_CURATION_CARD_INSTALL = "Editorial_BN_Curation_Card_Install";
    public static final String REACTION_INTERACT = "Reaction_Interact";
    private static final String TYPE = "type";
    private static final String WHERE = "where";
    private final AnalyticsManager analyticsManager;
    private final DownloadAnalytics downloadAnalytics;
    private final boolean fromHome;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final SplitAnalyticsMapper splitAnalyticsMapper;

    public EditorialAnalytics(DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, boolean z, InstallAnalytics installAnalytics, SplitAnalyticsMapper splitAnalyticsMapper) {
        this.downloadAnalytics = downloadAnalytics;
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.fromHome = z;
        this.installAnalytics = installAnalytics;
        this.splitAnalyticsMapper = splitAnalyticsMapper;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void clickOnInstallButton(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, List<String> list) {
        String viewName = getViewName(true);
        String str6 = !this.fromHome ? EDITORIAL_BN_CURATION_CARD_INSTALL : CURATION_CARD_INSTALL;
        HashMap hashMap = new HashMap();
        hashMap.put(APPLICATION_NAME, str);
        hashMap.put("type", str2);
        hashMap.put(CONTEXT, viewName);
        this.installAnalytics.clickOnInstallEvent(str, str2, z, z2, z3, str3, str4, str5, false, z4, list.contains("STORE_BDS"), HttpUrl.FRAGMENT_ENCODE_SET);
        AnalyticsManager analyticsManager = this.analyticsManager;
        AnalyticsManager.Action action = AnalyticsManager.Action.CLICK;
        analyticsManager.logEvent(hashMap, str6, action, viewName);
        this.analyticsManager.logEvent(hashMap, AppViewAnalytics.CLICK_INSTALL, action, viewName);
    }

    public void sendDeletedEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "delete_reaction");
        hashMap.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(hashMap, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendDownloadCancelEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "cancel");
    }

    public void sendDownloadPauseEvent(String str) {
        this.downloadAnalytics.downloadInteractEvent(str, "pause");
    }

    public void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    public void sendReactedEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "click_to_react");
        hashMap.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(hashMap, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendReactionButtonClickEvent() {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "view_reactions");
        hashMap.put(WHERE, CURATION_DETAIL);
        this.analyticsManager.logEvent(hashMap, REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void setupDownloadEvents(RoomDownload roomDownload, int i2, String str, AnalyticsManager.Action action, String str2, String str3, String str4, boolean z) {
        this.downloadAnalytics.installClicked(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode(), action, false, roomDownload.hasAppc(), roomDownload.hasSplits(), str2, (String) null, str3, str4, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), z, HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
