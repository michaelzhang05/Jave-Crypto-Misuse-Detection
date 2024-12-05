package cm.aptoide.pt.dataprovider.ws.v2.aptwords;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import cm.aptoide.pt.dataprovider.ads.AdNetworkUtils;
import cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse;
import cm.aptoide.pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.pt.dataprovider.util.referrer.ReferrerUtils;
import cm.aptoide.pt.dataprovider.util.referrer.ReferrersMap;
import cm.aptoide.pt.dataprovider.ws.v2.aptwords.Aptwords;
import cm.aptoide.pt.preferences.toolbox.ToolboxManager;
import cm.aptoide.pt.utils.AptoideUtils;
import java.util.Iterator;
import java.util.List;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import rx.e;

/* loaded from: classes.dex */
public class GetAdsRequest extends Aptwords<GetAdsResponse> {
    private static String forcedCountry;
    private String categories;
    private final String clientUniqueId;
    private ConnectivityManager connectivityManager;
    private String excludedNetworks;
    private String excludedPackage;
    private final boolean googlePlayServicesAvailable;
    private String groupPackageName;
    private String keyword;
    private Integer limit;
    private Location location;
    private boolean mature;
    private final String oemid;
    private String packageName;
    private final String q;
    private String repo;
    private Resources resources;
    private final SharedPreferences sharedPreferences;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;

    private GetAdsRequest(String str, boolean z, String str2, boolean z2, Converter.Factory factory, OkHttpClient okHttpClient, String str3, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        super(okHttpClient, factory, sharedPreferences);
        this.clientUniqueId = str;
        this.googlePlayServicesAvailable = z;
        this.oemid = str2;
        this.mature = z2;
        this.q = str3;
        this.sharedPreferences = sharedPreferences;
        this.connectivityManager = connectivityManager;
        this.resources = resources;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
    }

    private String getExcludedPackages() {
        return this.excludedPackage;
    }

    public static String getForcedCountry() {
        return forcedCountry;
    }

    private String getGroupPackageName() {
        return this.groupPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$loadDataFromNetwork$0(GetAdsResponse getAdsResponse) {
        Iterator<GetAdsResponse.Ad> it = getAdsResponse.getAds().iterator();
        while (it.hasNext()) {
            AdNetworkUtils.knockImpression(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ e lambda$loadDataFromNetwork$1(HashMapNotNull hashMapNotNull, Aptwords.Interfaces interfaces, boolean z, Integer num) {
        hashMapNotNull.put("aptvercode", String.valueOf(num));
        return interfaces.getAds(hashMapNotNull, z).x(new rx.m.b() { // from class: cm.aptoide.pt.dataprovider.ws.v2.aptwords.a
            @Override // rx.m.b
            public final void call(Object obj) {
                GetAdsRequest.lambda$loadDataFromNetwork$0((GetAdsResponse) obj);
            }
        });
    }

    private static GetAdsRequest of(Location location, Integer num, String str, boolean z, String str2, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str3, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return of(location, "__NULL__", num, str, z, str2, z2, okHttpClient, factory, str3, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofAppviewOrganic(String str, String str2, String str3, boolean z, String str4, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str5, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        GetAdsRequest ofPackageName = ofPackageName(Location.appview, str, str3, z, str4, z2, okHttpClient, factory, str5, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
        ofPackageName.setRepo(str2);
        ofPackageName.setGroupPackageName(str);
        return ofPackageName;
    }

    public static GetAdsRequest ofAppviewSuggested(List<String> list, String str, boolean z, String str2, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        GetAdsRequest of = of(Location.middleappview, 1, str, z, str3, z2, okHttpClient, factory, str4, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
        of.setExcludedPackage(str2);
        of.setKeyword(AptoideUtils.StringU.join(list, ",") + ",__null__");
        of.setGroupPackageName(str2);
        return of;
    }

    public static GetAdsRequest ofFirstInstall(String str, boolean z, String str2, int i2, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str3, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return of(Location.firstinstall, Integer.valueOf(i2), str, z, str2, z2, okHttpClient, factory, str3, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofHomepage(String str, boolean z, String str2, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str3, SharedPreferences sharedPreferences, Resources resources, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, int i2) {
        return of(Location.homepage, Integer.valueOf(i2), str, z, str2, z2, okHttpClient, factory, str3, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofHomepageMore(String str, boolean z, String str2, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str3, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return of(Location.homepage, 50, str, z, str2, z2, okHttpClient, factory, str3, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
    }

    private static GetAdsRequest ofPackageName(Location location, String str, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        GetAdsRequest of = of(location, 1, str2, z, str3, z2, okHttpClient, factory, str4, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
        of.setPackageName(str);
        ReferrersMap referrersMap = ReferrerUtils.excludedNetworks;
        if (referrersMap.containsKey(str)) {
            of.excludedNetworks = AptoideUtils.StringU.commaSeparatedValues(referrersMap.get(str));
        }
        return of;
    }

    public static GetAdsRequest ofSearch(String str, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return of(Location.search, str, 1, str2, z, str3, z2, okHttpClient, factory, str4, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofSecondInstall(String str, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return ofPackageName(Location.secondinstall, str, str2, z, str3, z2, okHttpClient, factory, str4, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
    }

    public static GetAdsRequest ofSecondTry(String str, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        return ofPackageName(Location.secondtry, str, str2, z, str3, z2, okHttpClient, factory, str4, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
    }

    public static void setForcedCountry(String str) {
        forcedCountry = str;
    }

    private void setGroupPackageName(String str) {
        this.groupPackageName = str;
    }

    public String getCategories() {
        return this.categories;
    }

    public String getClientUniqueId() {
        return this.clientUniqueId;
    }

    public ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    public String getExcludedNetworks() {
        return this.excludedNetworks;
    }

    public String getExcludedPackage() {
        return this.excludedPackage;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Location getLocation() {
        return this.location;
    }

    public String getOemid() {
        return this.oemid;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getQ() {
        return this.q;
    }

    public String getRepo() {
        return this.repo;
    }

    public Resources getResources() {
        return this.resources;
    }

    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public AdsApplicationVersionCodeProvider getVersionCodeProvider() {
        return this.versionCodeProvider;
    }

    public boolean isGooglePlayServicesAvailable() {
        return this.googlePlayServicesAvailable;
    }

    public boolean isMature() {
        return this.mature;
    }

    public void setCategories(String str) {
        this.categories = str;
    }

    public void setConnectivityManager(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    public void setExcludedNetworks(String str) {
        this.excludedNetworks = str;
    }

    public void setExcludedPackage(String str) {
        this.excludedPackage = str;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setMature(boolean z) {
        this.mature = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setRepo(String str) {
        this.repo = str;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public static GetAdsRequest of(Location location, String str, Integer num, String str2, boolean z, String str3, boolean z2, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider) {
        GetAdsRequest getAdsRequest = new GetAdsRequest(str2, z, str3, z2, factory, okHttpClient, str4, sharedPreferences, connectivityManager, resources, adsApplicationVersionCodeProvider);
        getAdsRequest.setLocation(location);
        getAdsRequest.setKeyword(str);
        getAdsRequest.setLimit(num);
        return getAdsRequest;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.pt.dataprovider.WebService
    public e<GetAdsResponse> loadDataFromNetwork(final Aptwords.Interfaces interfaces, final boolean z) {
        final HashMapNotNull hashMapNotNull = new HashMapNotNull();
        hashMapNotNull.put("q", this.q);
        hashMapNotNull.put("lang", AptoideUtils.SystemU.getCountryCode(this.resources));
        hashMapNotNull.put("cpuid", this.clientUniqueId);
        hashMapNotNull.put("location", this.location.toString());
        hashMapNotNull.put("type", "1-3");
        hashMapNotNull.put("partners", "1-3,5-10");
        hashMapNotNull.put("keywords", this.keyword);
        String str = this.oemid;
        if (str != null && !str.isEmpty()) {
            hashMapNotNull.put("oem_id", this.oemid);
        }
        hashMapNotNull.put("country", forcedCountry);
        hashMapNotNull.put("group_package_name", this.groupPackageName);
        String forceCountry = ToolboxManager.getForceCountry(this.sharedPreferences);
        if (!TextUtils.isEmpty(forceCountry)) {
            hashMapNotNull.put("country", forceCountry);
        }
        if (this.googlePlayServicesAvailable) {
            hashMapNotNull.put("flag", "gms");
        }
        hashMapNotNull.put("excluded_pkg", getExcludedPackages());
        hashMapNotNull.put("limit", String.valueOf(this.limit));
        hashMapNotNull.put("get_mature", Integer.toString(this.mature ? 1 : 0));
        hashMapNotNull.put("app_pkg", this.packageName);
        hashMapNotNull.put("app_store", this.repo);
        hashMapNotNull.put("filter_pkg", "true");
        hashMapNotNull.put("conn_type", AptoideUtils.SystemU.getConnectionType(this.connectivityManager));
        hashMapNotNull.put("excluded_partners", this.excludedNetworks);
        return this.versionCodeProvider.getApplicationVersionCode().k(new rx.m.e() { // from class: cm.aptoide.pt.dataprovider.ws.v2.aptwords.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                return GetAdsRequest.lambda$loadDataFromNetwork$1(HashMapNotNull.this, interfaces, z, (Integer) obj);
            }
        });
    }
}
