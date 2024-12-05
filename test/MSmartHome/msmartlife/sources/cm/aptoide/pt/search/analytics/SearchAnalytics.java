package cm.aptoide.pt.search.analytics;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.search.model.SearchQueryModel;
import cm.aptoide.pt.search.model.Source;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class SearchAnalytics {
    public static final String AB_SEARCH_ACTION = "AB_Search_Action";
    public static final String AB_SEARCH_IMPRESSION = "AB_Search_Impression";
    public static final String APP_CLICK = "Search_Results_App_View_Click";
    private static final String EMPTY = "empty";
    public static final String GAMES_CATEGORY = "games";
    public static final String NO_RESULTS = "Search_No_Results";
    public static final String SEARCH = "Search";
    public static final String SEARCH_RESULT_CLICK = "Search_Result_Click";
    public static final String SEARCH_START = "Search_Start";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cm.aptoide.pt.search.analytics.SearchAnalytics$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$search$model$Source;

        static {
            int[] iArr = new int[Source.values().length];
            $SwitchMap$cm$aptoide$pt$search$model$Source = iArr;
            try {
                iArr[Source.FROM_TRENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$search$model$Source[Source.FROM_AUTOCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$search$model$Source[Source.DEEPLINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$search$model$Source[Source.MANUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class AttributeKey {
        private static final String AB_TEST_GROUP = "ab_test_group";
        private static final String AB_TEST_ID = "ab_test_uid";
        private static final String APP_AAB = "app_aab";
        private static final String APP_AAB_INSTALL_TIME = "app_aab_install_time";
        private static final String APP_APPC = "app_appc";
        private static final String APP_IN_CATAPPULT = "app_in_catappult";
        private static final String APP_IS_GAME = "app_is_game";
        private static final String APP_MIGRATION = "app_migration";
        private static final String APP_OBB = "app_obb";
        private static final String APP_VERSION_CODE = "app_version_code";
        private static final String IS_AD = "is_ad";
        private static final String KEYWORD_INPUT = "inserted_keyword";
        private static final String PACKAGE_NAME = "package_name";
        private static final String POSITION = "position";
        private static final String QUERY = "search_term";
        private static final String SEARCH_TERM_POSITION = "search_term_position";
        private static final String SEARCH_TERM_SOURCE = "search_term_source";
        private static final String SOURCE = "source";

        private AttributeKey() {
        }
    }

    public SearchAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private Map<String, Object> createMapData(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private String parseSource(Source source) {
        int i2 = AnonymousClass1.$SwitchMap$cm$aptoide$pt$search$model$Source[source.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "manual" : DeepLinkIntentReceiver.DEEP_LINK : "autocomplete" : "trending";
    }

    public void search(SearchQueryModel searchQueryModel) {
        search(searchQueryModel, 0);
    }

    public void searchAppClick(SearchQueryModel searchQueryModel, String str, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("search_term", searchQueryModel.getFinalQuery());
        hashMap.put("package_name", str);
        hashMap.put("is_ad", Boolean.FALSE);
        hashMap.put("position", Integer.valueOf(i2));
        this.analyticsManager.logEvent(hashMap, APP_CLICK, AnalyticsManager.Action.CLICK, getViewName(true));
        sendRakkamSearchResults(searchQueryModel, false, str, false, z, i2, z2, z3, z4, "no_info", i3, z5, str2);
    }

    public void searchFromSuggestion(SearchQueryModel searchQueryModel, int i2) {
        search(searchQueryModel, i2);
    }

    public void searchNoResults(SearchQueryModel searchQueryModel) {
        this.analyticsManager.logEvent(createMapData("search_term", searchQueryModel.getFinalQuery()), NO_RESULTS, AnalyticsManager.Action.CLICK, getViewName(false));
        sendRakkamSearchResults(searchQueryModel, true, null, false, false, 0, false, false, false, "no_info", 0, false, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void searchStart(SearchSource searchSource, boolean z) {
        this.analyticsManager.logEvent(createMapData("source", searchSource.getIdentifier()), SEARCH_START, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendRakkamSearchResults(SearchQueryModel searchQueryModel, boolean z, String str, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, String str2, int i3, boolean z7, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("search_term", searchQueryModel.getFinalQuery());
        hashMap.put("inserted_keyword", searchQueryModel.getUserQuery());
        hashMap.put("search_term_source", parseSource(searchQueryModel.getSource()));
        if (!z) {
            hashMap.put("package_name", str);
            hashMap.put("position", Integer.valueOf(i2));
            hashMap.put("is_ad", Boolean.valueOf(z2));
            hashMap.put("app_appc", Boolean.valueOf(z3));
            hashMap.put("app_aab", Boolean.valueOf(z5));
            hashMap.put("app_migration", Boolean.valueOf(z4));
            hashMap.put("app_aab_install_time", str2);
            hashMap.put("app_version_code", Integer.valueOf(i3));
            hashMap.put("app_obb", Boolean.valueOf(z6));
            hashMap.put("app_in_catappult", Boolean.valueOf(z7));
            if (!str3.isEmpty()) {
                hashMap.put("app_is_game", Boolean.valueOf(str3.equals("games")));
            }
        } else {
            hashMap.put("package_name", EMPTY);
            hashMap.put("position", EMPTY);
            hashMap.put("is_ad", EMPTY);
            hashMap.put("app_appc", EMPTY);
            hashMap.put("app_aab", EMPTY);
            hashMap.put("app_migration", EMPTY);
            hashMap.put("app_aab_install_time", EMPTY);
            hashMap.put("app_version_code", EMPTY);
            hashMap.put("app_obb", EMPTY);
            hashMap.put("app_in_catappult", EMPTY);
            hashMap.put("app_is_game", EMPTY);
        }
        this.analyticsManager.logEvent(hashMap, SEARCH_RESULT_CLICK, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    private void search(SearchQueryModel searchQueryModel, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("search_term", searchQueryModel.getFinalQuery());
        hashMap.put("search_term_source", parseSource(searchQueryModel.getSource()));
        hashMap.put("inserted_keyword", searchQueryModel.getUserQuery());
        if (searchQueryModel.getSource() != Source.MANUAL) {
            hashMap.put("search_term_position", Integer.toString(i2));
        }
        this.analyticsManager.logEvent(hashMap, SEARCH, AnalyticsManager.Action.CLICK, getViewName(false));
    }
}
