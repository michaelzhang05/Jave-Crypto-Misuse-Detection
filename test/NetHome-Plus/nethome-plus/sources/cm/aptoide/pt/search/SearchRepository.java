package cm.aptoide.pt.search;

import android.content.SharedPreferences;
import cm.aptoide.pt.aab.Split;
import cm.aptoide.pt.app.mmpcampaigns.CampaignMapper;
import cm.aptoide.pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.pt.dataprovider.model.v7.Aab;
import cm.aptoide.pt.dataprovider.model.v7.Malware;
import cm.aptoide.pt.dataprovider.model.v7.search.ListSearchApps;
import cm.aptoide.pt.dataprovider.model.v7.search.SearchApp;
import cm.aptoide.pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseBody;
import cm.aptoide.pt.dataprovider.ws.v7.ListSearchAppsRequest;
import cm.aptoide.pt.download.OemidProvider;
import cm.aptoide.pt.search.model.SearchAppResult;
import cm.aptoide.pt.search.model.SearchFilters;
import cm.aptoide.pt.search.model.SearchResult;
import cm.aptoide.pt.search.model.SearchResultError;
import cm.aptoide.pt.store.RoomStoreRepository;
import cm.aptoide.pt.store.StoreUtils;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import rx.Single;
import rx.schedulers.Schedulers;

/* compiled from: SearchRepository.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J&\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"J,\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u0001052\u0006\u0010.\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u00010/2\u0006\u00107\u001a\u000208H\u0002J \u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020/2\u0006\u0010.\u001a\u00020/H\u0002J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010AH\u0002J \u0010E\u001a\u00020F2\u0006\u0010<\u001a\u00020=2\u0006\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020\"H\u0002J*\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0A0J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020=0A2\u0006\u0010.\u001a\u00020/H\u0002J2\u0010L\u001a\b\u0012\u0004\u0012\u00020\u0017052\u0006\u0010.\u001a\u00020/2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u00100\u001a\u0002012\b\u00106\u001a\u0004\u0018\u00010/H\u0002J\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00170JJ8\u0010P\u001a\b\u0012\u0004\u0012\u00020\u0017052\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010Q\u001a\u00020;2\u0006\u00102\u001a\u00020\"2\b\u00106\u001a\u0004\u0018\u00010/H\u0002J2\u0010R\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\b\u00106\u001a\u0004\u0018\u00010/2\u0006\u00103\u001a\u00020\"H\u0002J.\u0010S\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\u0006\u0010T\u001a\u00020/2\u0006\u00103\u001a\u00020\"J\u0012\u0010U\u001a\u00020-2\b\u0010V\u001a\u0004\u0018\u00010\u0017H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006W"}, d2 = {"Lcm/aptoide/pt/search/SearchRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "storeRepository", "Lcm/aptoide/pt/store/RoomStoreRepository;", "bodyInterceptor", "Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "Lcm/aptoide/pt/dataprovider/ws/v7/BaseBody;", "httpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/Converter$Factory;", "tokenInvalidator", "Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "oemidProvider", "Lcm/aptoide/pt/download/OemidProvider;", "campaignMapper", "Lcm/aptoide/pt/app/mmpcampaigns/CampaignMapper;", "(Lcm/aptoide/pt/store/RoomStoreRepository;Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;Lokhttp3/OkHttpClient;Lretrofit2/Converter$Factory;Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;Landroid/content/SharedPreferences;Lcm/aptoide/pt/download/OemidProvider;Lcm/aptoide/pt/app/mmpcampaigns/CampaignMapper;)V", "getBodyInterceptor", "()Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "cachedSearchResults", "Lcm/aptoide/pt/search/model/SearchResult;", "getCampaignMapper", "()Lcm/aptoide/pt/app/mmpcampaigns/CampaignMapper;", "cancelationSubject", "Lrx/subjects/PublishSubject;", "Ljava/lang/Void;", "getConverterFactory", "()Lretrofit2/Converter$Factory;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "loadingMore", HttpUrl.FRAGMENT_ENCODE_SET, "getOemidProvider", "()Lcm/aptoide/pt/download/OemidProvider;", "resultsSubject", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "getStoreRepository", "()Lcm/aptoide/pt/store/RoomStoreRepository;", "getTokenInvalidator", "()Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "generalSearch", "Lrx/Completable;", "query", HttpUrl.FRAGMENT_ENCODE_SET, "filters", "Lcm/aptoide/pt/search/model/SearchFilters;", "matureEnabled", "useCachedValues", "handleSearchError", "Lrx/Single;", "specificStore", "throwable", HttpUrl.FRAGMENT_ENCODE_SET, "isHighlightedResult", "i", HttpUrl.FRAGMENT_ENCODE_SET, "app", "Lcm/aptoide/pt/dataprovider/model/v7/search/SearchApp;", "isQuerySameAsAppName", "appName", "mapSplits", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/aab/Split;", "splits", "Lcm/aptoide/pt/dataprovider/model/v7/Split;", "mapToSearchAppResult", "Lcm/aptoide/pt/search/model/SearchAppResult;", "oemid", "isHighlighted", "mapToSearchAppResultList", "Lrx/Observable;", "searchAppList", "mapToSearchResult", "response", "Lcm/aptoide/pt/dataprovider/model/v7/search/ListSearchApps;", "observeSearchResults", "requestSearchResults", "nextOffset", "search", "searchInStore", "storeName", "updateMemCache", "results", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchRepository {
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private SearchResult cachedSearchResults;
    private final CampaignMapper campaignMapper;
    private final rx.s.b<Void> cancelationSubject;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private boolean loadingMore;
    private final OemidProvider oemidProvider;
    private final rx.s.b<SearchResult> resultsSubject;
    private final SharedPreferences sharedPreferences;
    private final RoomStoreRepository storeRepository;
    private final TokenInvalidator tokenInvalidator;

    public SearchRepository(RoomStoreRepository roomStoreRepository, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, OemidProvider oemidProvider, CampaignMapper campaignMapper) {
        kotlin.jvm.internal.l.f(roomStoreRepository, "storeRepository");
        kotlin.jvm.internal.l.f(bodyInterceptor, "bodyInterceptor");
        kotlin.jvm.internal.l.f(okHttpClient, "httpClient");
        kotlin.jvm.internal.l.f(factory, "converterFactory");
        kotlin.jvm.internal.l.f(tokenInvalidator, "tokenInvalidator");
        kotlin.jvm.internal.l.f(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.l.f(oemidProvider, "oemidProvider");
        kotlin.jvm.internal.l.f(campaignMapper, "campaignMapper");
        this.storeRepository = roomStoreRepository;
        this.bodyInterceptor = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.oemidProvider = oemidProvider;
        this.campaignMapper = campaignMapper;
        rx.s.b<SearchResult> g1 = rx.s.b.g1();
        kotlin.jvm.internal.l.e(g1, "create()");
        this.resultsSubject = g1;
        rx.s.b<Void> g12 = rx.s.b.g1();
        kotlin.jvm.internal.l.e(g12, "create()");
        this.cancelationSubject = g12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: generalSearch$lambda-0, reason: not valid java name */
    public static final rx.b m292generalSearch$lambda0(SearchRepository searchRepository, String str, SearchFilters searchFilters, boolean z, boolean z2, String str2) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        kotlin.jvm.internal.l.f(str, "$query");
        kotlin.jvm.internal.l.f(searchFilters, "$filters");
        return searchRepository.search(str, searchFilters, z, null, z2);
    }

    private final Single<SearchResult> handleSearchError(String query, String specificStore, Throwable throwable) {
        if (!(throwable instanceof UnknownHostException) && !(throwable instanceof NoNetworkConnectionException)) {
            return Single.m(new SearchResult(query, specificStore, SearchResultError.GENERIC));
        }
        return Single.m(new SearchResult(query, specificStore, SearchResultError.NO_NETWORK));
    }

    private final boolean isHighlightedResult(int i2, SearchApp app, String query) {
        if (i2 == 0) {
            String name = app.getName();
            kotlin.jvm.internal.l.e(name, "app.name");
            if (isQuerySameAsAppName(name, query) && app.getFile().getMalware().getRank() == Malware.Rank.TRUSTED && app.getStats().getPdownloads() >= 1000000) {
                return true;
            }
        }
        return false;
    }

    private final boolean isQuerySameAsAppName(String appName, String query) {
        String w;
        String w2;
        String w3;
        String w4;
        String lowerCase = appName.toLowerCase();
        kotlin.jvm.internal.l.e(lowerCase, "this as java.lang.String).toLowerCase()");
        w = kotlin.text.u.w(lowerCase, " ", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        w2 = kotlin.text.u.w(w, "-", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        String lowerCase2 = query.toLowerCase();
        kotlin.jvm.internal.l.e(lowerCase2, "this as java.lang.String).toLowerCase()");
        w3 = kotlin.text.u.w(lowerCase2, " ", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        w4 = kotlin.text.u.w(w3, "-", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        return kotlin.jvm.internal.l.a(w2, w4);
    }

    private final List<Split> mapSplits(List<? extends cm.aptoide.pt.dataprovider.model.v7.Split> splits) {
        ArrayList arrayList = new ArrayList();
        if (splits == null) {
            return arrayList;
        }
        for (cm.aptoide.pt.dataprovider.model.v7.Split split : splits) {
            String name = split.getName();
            kotlin.jvm.internal.l.e(name, "split.name");
            String type = split.getType();
            kotlin.jvm.internal.l.e(type, "split.type");
            String path = split.getPath();
            kotlin.jvm.internal.l.e(path, "split.path");
            long filesize = split.getFilesize();
            String md5sum = split.getMd5sum();
            kotlin.jvm.internal.l.e(md5sum, "split.md5sum");
            arrayList.add(new Split(name, type, path, filesize, md5sum));
        }
        return arrayList;
    }

    private final SearchAppResult mapToSearchAppResult(SearchApp app, String oemid, boolean isHighlighted) {
        List<String> emptyList = Collections.emptyList();
        List<cm.aptoide.pt.dataprovider.model.v7.Split> emptyList2 = Collections.emptyList();
        Aab aab = app.getAab();
        if (aab != null) {
            emptyList = aab.getRequiredSplits();
            emptyList2 = aab.getSplits();
        }
        return new SearchAppResult(app.getFile().getMalware().getRank().ordinal(), app.getIcon(), app.getStore().getName(), Long.valueOf(app.getStore().getId()), app.getStore().getAppearance().getTheme(), app.getModified().getTime(), app.getStats().getRating().getAvg(), app.getStats().getPdownloads(), app.getName(), app.getPackageName(), app.getFile().getMd5sum(), app.getId(), app.getFile().getVercode(), app.getFile().getVername(), app.getFile().getPath(), app.getFile().getPathAlt(), app.getFile().getMalware(), app.getSize(), app.hasVersions(), app.hasBilling(), app.hasAdvertising(), oemid, isHighlighted, app.getObb(), emptyList, mapSplits(emptyList2), null, null, app.getStore().getName().equals("catappult"), HttpUrl.FRAGMENT_ENCODE_SET, this.campaignMapper.mapCampaign(app.getUrls()));
    }

    private final rx.e<List<SearchAppResult>> mapToSearchAppResultList(List<? extends SearchApp> list, String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (SearchApp searchApp : list) {
            String oemid = this.oemidProvider.getOemid();
            kotlin.jvm.internal.l.e(oemid, "oemidProvider.oemid");
            arrayList.add(mapToSearchAppResult(searchApp, oemid, isHighlightedResult(i2, searchApp, str)));
            i2++;
        }
        rx.e<List<SearchAppResult>> S = rx.e.S(arrayList);
        kotlin.jvm.internal.l.e(S, "just(newList)");
        return S;
    }

    private final Single<SearchResult> mapToSearchResult(final String query, final ListSearchApps response, final SearchFilters filters, final String specificStore) {
        if (response != null) {
            Single<SearchResult> q = rx.e.S(response.getDataList().getList()).G(new rx.m.e() { // from class: cm.aptoide.pt.search.s
                @Override // rx.m.e
                public final Object call(Object obj) {
                    rx.e m293mapToSearchResult$lambda20$lambda17;
                    m293mapToSearchResult$lambda20$lambda17 = SearchRepository.m293mapToSearchResult$lambda20$lambda17(SearchRepository.this, query, (List) obj);
                    return m293mapToSearchResult$lambda20$lambda17;
                }
            }).E().X(new rx.m.e() { // from class: cm.aptoide.pt.search.n
                @Override // rx.m.e
                public final Object call(Object obj) {
                    SearchResult m294mapToSearchResult$lambda20$lambda18;
                    m294mapToSearchResult$lambda20$lambda18 = SearchRepository.m294mapToSearchResult$lambda20$lambda18(query, specificStore, filters, response, (List) obj);
                    return m294mapToSearchResult$lambda20$lambda18;
                }
            }).Z0().q(new rx.m.e() { // from class: cm.aptoide.pt.search.i
                @Override // rx.m.e
                public final Object call(Object obj) {
                    Single m295mapToSearchResult$lambda20$lambda19;
                    m295mapToSearchResult$lambda20$lambda19 = SearchRepository.m295mapToSearchResult$lambda20$lambda19(SearchRepository.this, query, specificStore, (Throwable) obj);
                    return m295mapToSearchResult$lambda20$lambda19;
                }
            });
            kotlin.jvm.internal.l.e(q, "just(r.dataList.list)\n  …ore, throwable)\n        }");
            return q;
        }
        Single<SearchResult> m = Single.m(new SearchResult(query, SearchResultError.GENERIC));
        kotlin.jvm.internal.l.e(m, "just(SearchResult(query,…archResultError.GENERIC))");
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapToSearchResult$lambda-20$lambda-17, reason: not valid java name */
    public static final rx.e m293mapToSearchResult$lambda20$lambda17(SearchRepository searchRepository, String str, List list) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        kotlin.jvm.internal.l.f(str, "$query");
        kotlin.jvm.internal.l.e(list, "list");
        return searchRepository.mapToSearchAppResultList(list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapToSearchResult$lambda-20$lambda-18, reason: not valid java name */
    public static final SearchResult m294mapToSearchResult$lambda20$lambda18(String str, String str2, SearchFilters searchFilters, ListSearchApps listSearchApps, List list) {
        kotlin.jvm.internal.l.f(str, "$query");
        kotlin.jvm.internal.l.f(searchFilters, "$filters");
        kotlin.jvm.internal.l.f(listSearchApps, "$r");
        kotlin.jvm.internal.l.e(list, "list");
        return new SearchResult(str, str2, list, searchFilters, listSearchApps.getDataList().getOffset(), listSearchApps.getDataList().getNext(), listSearchApps.getDataList().getTotal(), !listSearchApps.getDataList().isLoaded(), false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapToSearchResult$lambda-20$lambda-19, reason: not valid java name */
    public static final Single m295mapToSearchResult$lambda20$lambda19(SearchRepository searchRepository, String str, String str2, Throwable th) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        kotlin.jvm.internal.l.f(str, "$query");
        th.printStackTrace();
        kotlin.jvm.internal.l.e(th, "throwable");
        return searchRepository.handleSearchError(str, str2, th);
    }

    private final Single<SearchResult> requestSearchResults(final String query, final SearchFilters filters, int nextOffset, boolean matureEnabled, final String specificStore) {
        HashMapNotNull<String, List<String>> subscribedStoresAuthMap = StoreUtils.getSubscribedStoresAuthMap(this.storeRepository);
        ListSearchAppsRequest of = ListSearchAppsRequest.of(query, nextOffset, filters.getOnlyFollowedStores(), filters.getOnlyTrustedApps(), filters.getOnlyBetaApps(), filters.getOnlyAppcApps(), Boolean.valueOf(matureEnabled), StoreUtils.getSubscribedStoresIds(this.storeRepository), subscribedStoresAuthMap, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences);
        if (specificStore != null) {
            of = ListSearchAppsRequest.of(query, nextOffset, specificStore, filters.getOnlyTrustedApps(), filters.getOnlyBetaApps(), filters.getOnlyAppcApps(), Boolean.valueOf(matureEnabled), subscribedStoresAuthMap, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences);
        }
        Single<SearchResult> q = of.observe(false).Z0().i(new rx.m.e() { // from class: cm.aptoide.pt.search.g
            @Override // rx.m.e
            public final Object call(Object obj) {
                Single m296requestSearchResults$lambda15;
                m296requestSearchResults$lambda15 = SearchRepository.m296requestSearchResults$lambda15(SearchRepository.this, query, filters, specificStore, (ListSearchApps) obj);
                return m296requestSearchResults$lambda15;
            }
        }).q(new rx.m.e() { // from class: cm.aptoide.pt.search.p
            @Override // rx.m.e
            public final Object call(Object obj) {
                Single m297requestSearchResults$lambda16;
                m297requestSearchResults$lambda16 = SearchRepository.m297requestSearchResults$lambda16(SearchRepository.this, query, specificStore, (Throwable) obj);
                return m297requestSearchResults$lambda16;
            }
        });
        kotlin.jvm.internal.l.e(q, "request\n      .observe(f…Store, throwable)\n      }");
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestSearchResults$lambda-15, reason: not valid java name */
    public static final Single m296requestSearchResults$lambda15(SearchRepository searchRepository, String str, SearchFilters searchFilters, String str2, ListSearchApps listSearchApps) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        kotlin.jvm.internal.l.f(str, "$query");
        kotlin.jvm.internal.l.f(searchFilters, "$filters");
        return searchRepository.mapToSearchResult(str, listSearchApps, searchFilters, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestSearchResults$lambda-16, reason: not valid java name */
    public static final Single m297requestSearchResults$lambda16(SearchRepository searchRepository, String str, String str2, Throwable th) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        kotlin.jvm.internal.l.f(str, "$query");
        th.printStackTrace();
        kotlin.jvm.internal.l.e(th, "throwable");
        return searchRepository.handleSearchError(str, str2, th);
    }

    private final synchronized rx.b search(String str, SearchFilters searchFilters, boolean z, String str2, boolean z2) {
        if (z2) {
            rx.b t = rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.search.u
                @Override // rx.m.a
                public final void call() {
                    SearchRepository.m299search$lambda2(SearchRepository.this);
                }
            });
            kotlin.jvm.internal.l.e(t, "fromAction {\n        res…hedSearchResults)\n      }");
            return t;
        }
        final SearchResult searchResult = this.cachedSearchResults;
        if (searchResult != null && kotlin.jvm.internal.l.a(searchResult.getQuery(), str) && kotlin.jvm.internal.l.a(searchResult.getSpecificStore(), str2) && kotlin.jvm.internal.l.a(searchFilters, searchResult.getFilters()) && !searchResult.hasError()) {
            if (searchResult.hasMore()) {
                if (this.loadingMore) {
                    rx.b e2 = rx.b.e();
                    kotlin.jvm.internal.l.e(e2, "complete()");
                    return e2;
                }
                rx.b n = requestSearchResults(str, searchFilters, searchResult.getNextOffset(), z, str2).A().P0(this.cancelationSubject).o(null).Z0().j(new rx.m.e() { // from class: cm.aptoide.pt.search.h
                    @Override // rx.m.e
                    public final Object call(Object obj) {
                        rx.b m300search$lambda9$lambda3;
                        m300search$lambda9$lambda3 = SearchRepository.m300search$lambda9$lambda3(SearchRepository.this, (SearchResult) obj);
                        return m300search$lambda9$lambda3;
                    }
                }).p(new rx.m.b() { // from class: cm.aptoide.pt.search.o
                    @Override // rx.m.b
                    public final void call(Object obj) {
                        SearchRepository.m301search$lambda9$lambda4(SearchRepository.this, (rx.k) obj);
                    }
                }).r(new rx.m.a() { // from class: cm.aptoide.pt.search.k
                    @Override // rx.m.a
                    public final void call() {
                        SearchRepository.m302search$lambda9$lambda5(SearchRepository.this);
                    }
                }).q(new rx.m.a() { // from class: cm.aptoide.pt.search.r
                    @Override // rx.m.a
                    public final void call() {
                        SearchRepository.m303search$lambda9$lambda6(SearchRepository.this);
                    }
                }).n(new rx.m.b() { // from class: cm.aptoide.pt.search.t
                    @Override // rx.m.b
                    public final void call(Object obj) {
                        SearchRepository.m304search$lambda9$lambda7(SearchRepository.this, (Throwable) obj);
                    }
                });
                kotlin.jvm.internal.l.e(n, "requestSearchResults(\n  …r { loadingMore = false }");
                return n;
            }
            rx.b t2 = rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.search.q
                @Override // rx.m.a
                public final void call() {
                    SearchRepository.m305search$lambda9$lambda8(SearchRepository.this, searchResult);
                }
            });
            kotlin.jvm.internal.l.e(t2, "fromAction {\n           …ctiveResults)\n          }");
            return t2;
        }
        this.cachedSearchResults = null;
        this.cancelationSubject.onNext(null);
        rx.b j2 = requestSearchResults(str, searchFilters, 0, z, str2).A().P0(this.cancelationSubject).o(null).Z0().j(new rx.m.e() { // from class: cm.aptoide.pt.search.j
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m298search$lambda10;
                m298search$lambda10 = SearchRepository.m298search$lambda10(SearchRepository.this, (SearchResult) obj);
                return m298search$lambda10;
            }
        });
        kotlin.jvm.internal.l.e(j2, "requestSearchResults(que…updateMemCache(results) }");
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-10, reason: not valid java name */
    public static final rx.b m298search$lambda10(SearchRepository searchRepository, SearchResult searchResult) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        return searchRepository.updateMemCache(searchResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-2, reason: not valid java name */
    public static final void m299search$lambda2(SearchRepository searchRepository) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        searchRepository.resultsSubject.onNext(searchRepository.cachedSearchResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-3, reason: not valid java name */
    public static final rx.b m300search$lambda9$lambda3(SearchRepository searchRepository, SearchResult searchResult) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        return searchRepository.updateMemCache(searchResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-4, reason: not valid java name */
    public static final void m301search$lambda9$lambda4(SearchRepository searchRepository, rx.k kVar) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        searchRepository.loadingMore = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-5, reason: not valid java name */
    public static final void m302search$lambda9$lambda5(SearchRepository searchRepository) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        searchRepository.loadingMore = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-6, reason: not valid java name */
    public static final void m303search$lambda9$lambda6(SearchRepository searchRepository) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        searchRepository.loadingMore = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-7, reason: not valid java name */
    public static final void m304search$lambda9$lambda7(SearchRepository searchRepository, Throwable th) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        searchRepository.loadingMore = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-8, reason: not valid java name */
    public static final void m305search$lambda9$lambda8(SearchRepository searchRepository, SearchResult searchResult) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        kotlin.jvm.internal.l.f(searchResult, "$activeResults");
        searchRepository.resultsSubject.onNext(searchResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchInStore$lambda-1, reason: not valid java name */
    public static final rx.b m306searchInStore$lambda1(SearchRepository searchRepository, String str, SearchFilters searchFilters, boolean z, String str2, boolean z2, String str3) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        kotlin.jvm.internal.l.f(str, "$query");
        kotlin.jvm.internal.l.f(searchFilters, "$filters");
        kotlin.jvm.internal.l.f(str2, "$storeName");
        return searchRepository.search(str, searchFilters, z, str2, z2);
    }

    private final synchronized rx.b updateMemCache(final SearchResult searchResult) {
        rx.b t;
        t = rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.search.m
            @Override // rx.m.a
            public final void call() {
                SearchRepository.m307updateMemCache$lambda13(SearchResult.this, this);
            }
        });
        kotlin.jvm.internal.l.e(t, "fromAction {\n      resul…)\n        }\n      }\n    }");
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateMemCache$lambda-13, reason: not valid java name */
    public static final void m307updateMemCache$lambda13(SearchResult searchResult, SearchRepository searchRepository) {
        kotlin.jvm.internal.l.f(searchRepository, "this$0");
        if (searchResult != null) {
            SearchResult searchResult2 = searchRepository.cachedSearchResults;
            ArrayList arrayList = new ArrayList(searchResult.getSearchResultsList());
            boolean z = true;
            if (searchResult2 != null && kotlin.jvm.internal.l.a(searchResult2.getQuery(), searchResult.getQuery()) && kotlin.jvm.internal.l.a(searchResult2.getFilters(), searchResult.getFilters()) && kotlin.jvm.internal.l.a(searchResult2.getSpecificStore(), searchResult.getSpecificStore())) {
                arrayList = new ArrayList(searchResult2.getSearchResultsList());
                arrayList.addAll(searchResult.getSearchResultsList());
                z = false;
            }
            ArrayList arrayList2 = arrayList;
            boolean z2 = z;
            searchRepository.resultsSubject.onNext(new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), arrayList2, searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), z2, searchResult.getError()));
            searchRepository.cachedSearchResults = new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), arrayList2, searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), z2, searchResult.getError());
        }
    }

    public final rx.b generalSearch(final String str, final SearchFilters searchFilters, final boolean z, final boolean z2) {
        kotlin.jvm.internal.l.f(str, "query");
        kotlin.jvm.internal.l.f(searchFilters, "filters");
        rx.b K = Single.m(str).j(new rx.m.e() { // from class: cm.aptoide.pt.search.l
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m292generalSearch$lambda0;
                m292generalSearch$lambda0 = SearchRepository.m292generalSearch$lambda0(SearchRepository.this, str, searchFilters, z, z2, (String) obj);
                return m292generalSearch$lambda0;
            }
        }).K(Schedulers.io());
        kotlin.jvm.internal.l.e(K, "just(query)\n      .flatM…scribeOn(Schedulers.io())");
        return K;
    }

    public final BodyInterceptor<BaseBody> getBodyInterceptor() {
        return this.bodyInterceptor;
    }

    public final CampaignMapper getCampaignMapper() {
        return this.campaignMapper;
    }

    public final Converter.Factory getConverterFactory() {
        return this.converterFactory;
    }

    public final OkHttpClient getHttpClient() {
        return this.httpClient;
    }

    public final OemidProvider getOemidProvider() {
        return this.oemidProvider;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final RoomStoreRepository getStoreRepository() {
        return this.storeRepository;
    }

    public final TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public final rx.e<SearchResult> observeSearchResults() {
        return this.resultsSubject;
    }

    public final rx.b searchInStore(final String str, final SearchFilters searchFilters, final boolean z, final String str2, final boolean z2) {
        kotlin.jvm.internal.l.f(str, "query");
        kotlin.jvm.internal.l.f(searchFilters, "filters");
        kotlin.jvm.internal.l.f(str2, "storeName");
        rx.b K = Single.m(str).j(new rx.m.e() { // from class: cm.aptoide.pt.search.v
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m306searchInStore$lambda1;
                m306searchInStore$lambda1 = SearchRepository.m306searchInStore$lambda1(SearchRepository.this, str, searchFilters, z, str2, z2, (String) obj);
                return m306searchInStore$lambda1;
            }
        }).K(Schedulers.io());
        kotlin.jvm.internal.l.e(K, "just(query)\n      .flatM…scribeOn(Schedulers.io())");
        return K;
    }
}
