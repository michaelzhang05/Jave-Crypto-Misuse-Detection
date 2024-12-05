package cm.aptoide.pt.home.more.apps;

import cm.aptoide.pt.ads.AdsRepository;
import cm.aptoide.pt.ads.MinimalAd;
import cm.aptoide.pt.ads.data.AptoideNativeAd;
import cm.aptoide.pt.dataprovider.model.v7.ListApps;
import cm.aptoide.pt.dataprovider.model.v7.listapp.App;
import cm.aptoide.pt.view.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.text.u;
import okhttp3.HttpUrl;
import rx.e;

/* compiled from: ListAppsMoreManager.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J?\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0018J.\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013J\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMoreManager;", HttpUrl.FRAGMENT_ENCODE_SET, "listAppsMoreRepository", "Lcm/aptoide/pt/home/more/apps/ListAppsMoreRepository;", "adsRepository", "Lcm/aptoide/pt/ads/AdsRepository;", "(Lcm/aptoide/pt/home/more/apps/ListAppsMoreRepository;Lcm/aptoide/pt/ads/AdsRepository;)V", "getAdsRepository", "()Lcm/aptoide/pt/ads/AdsRepository;", "getListAppsMoreRepository", "()Lcm/aptoide/pt/home/more/apps/ListAppsMoreRepository;", "next", HttpUrl.FRAGMENT_ENCODE_SET, "total", "loadFreshApps", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/view/app/Application;", "baseUrl", HttpUrl.FRAGMENT_ENCODE_SET, "refresh", HttpUrl.FRAGMENT_ENCODE_SET, "type", "limit", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)Lrx/Observable;", "loadMoreApps", "url", "mapAdsResponse", "response", "Lcm/aptoide/pt/ads/MinimalAd;", "mapResponse", "listApps", "Lcm/aptoide/pt/dataprovider/model/v7/ListApps;", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListAppsMoreManager {
    private final AdsRepository adsRepository;
    private final ListAppsMoreRepository listAppsMoreRepository;
    private int next;
    private int total;

    public ListAppsMoreManager(ListAppsMoreRepository listAppsMoreRepository, AdsRepository adsRepository) {
        l.f(listAppsMoreRepository, "listAppsMoreRepository");
        l.f(adsRepository, "adsRepository");
        this.listAppsMoreRepository = listAppsMoreRepository;
        this.adsRepository = adsRepository;
    }

    public static /* synthetic */ e loadFreshApps$default(ListAppsMoreManager listAppsMoreManager, String str, boolean z, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        return listAppsMoreManager.loadFreshApps(str, z, str2, num);
    }

    /* renamed from: loadFreshApps$lambda-0 */
    public static final List m235loadFreshApps$lambda0(ListAppsMoreManager listAppsMoreManager, List list) {
        l.f(listAppsMoreManager, "this$0");
        l.e(list, "response");
        return listAppsMoreManager.mapAdsResponse(list);
    }

    /* renamed from: loadFreshApps$lambda-1 */
    public static final List m236loadFreshApps$lambda1(ListAppsMoreManager listAppsMoreManager, ListApps listApps) {
        l.f(listAppsMoreManager, "this$0");
        l.e(listApps, "response");
        return listAppsMoreManager.mapResponse(listApps);
    }

    /* renamed from: loadMoreApps$lambda-2 */
    public static final List m237loadMoreApps$lambda2(ListAppsMoreManager listAppsMoreManager, ListApps listApps) {
        l.f(listAppsMoreManager, "this$0");
        l.e(listApps, "response");
        return listAppsMoreManager.mapResponse(listApps);
    }

    private final List<Application> mapAdsResponse(List<MinimalAd> response) {
        ArrayList arrayList = new ArrayList();
        Iterator<MinimalAd> it = response.iterator();
        while (it.hasNext()) {
            arrayList.add(new AptoideNativeAd(it.next()));
        }
        return arrayList;
    }

    private final List<Application> mapResponse(ListApps listApps) {
        ArrayList arrayList = new ArrayList();
        this.total = listApps.getDataList().getTotal();
        this.next = listApps.getDataList().getNext();
        for (App app : listApps.getDataList().getList()) {
            l.e(app, "listApps.dataList.list");
            App app2 = app;
            arrayList.add(new Application(app2.getName(), app2.getIcon(), app2.getStats().getRating().getAvg(), app2.getStats().getDownloads(), app2.getPackageName(), app2.getId(), HttpUrl.FRAGMENT_ENCODE_SET, app2.getAppcoins() != null && app2.getAppcoins().hasBilling()));
        }
        return arrayList;
    }

    public final AdsRepository getAdsRepository() {
        return this.adsRepository;
    }

    public final ListAppsMoreRepository getListAppsMoreRepository() {
        return this.listAppsMoreRepository;
    }

    public final e<List<Application>> loadFreshApps(String str, boolean z, String str2, Integer num) {
        boolean n;
        if (num != null) {
            str = str + "/limit=" + num;
        }
        n = u.n(str2, "getAds", false, 2, null);
        if (n) {
            e X = this.adsRepository.getAdsFromHomepageMore(z).X(new rx.m.e() { // from class: cm.aptoide.pt.home.more.apps.c
                @Override // rx.m.e
                public final Object call(Object obj) {
                    List m235loadFreshApps$lambda0;
                    m235loadFreshApps$lambda0 = ListAppsMoreManager.m235loadFreshApps$lambda0(ListAppsMoreManager.this, (List) obj);
                    return m235loadFreshApps$lambda0;
                }
            });
            l.e(X, "adsRepository.getAdsFrom…apAdsResponse(response) }");
            return X;
        }
        e X2 = this.listAppsMoreRepository.getApps(str, z).X(new rx.m.e() { // from class: cm.aptoide.pt.home.more.apps.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                List m236loadFreshApps$lambda1;
                m236loadFreshApps$lambda1 = ListAppsMoreManager.m236loadFreshApps$lambda1(ListAppsMoreManager.this, (ListApps) obj);
                return m236loadFreshApps$lambda1;
            }
        });
        l.e(X2, "listAppsMoreRepository.g…> mapResponse(response) }");
        return X2;
    }

    public final e<List<Application>> loadMoreApps(String str, boolean z, String str2) {
        boolean n;
        int i2;
        n = u.n(str2, "getAds", false, 2, null);
        if (!n && (i2 = this.next) < this.total) {
            e X = this.listAppsMoreRepository.loadMoreApps(str, z, i2).X(new rx.m.e() { // from class: cm.aptoide.pt.home.more.apps.a
                @Override // rx.m.e
                public final Object call(Object obj) {
                    List m237loadMoreApps$lambda2;
                    m237loadMoreApps$lambda2 = ListAppsMoreManager.m237loadMoreApps$lambda2(ListAppsMoreManager.this, (ListApps) obj);
                    return m237loadMoreApps$lambda2;
                }
            });
            l.e(X, "{\n      listAppsMoreRepo…esponse(response) }\n    }");
            return X;
        }
        e<List<Application>> S = e.S(null);
        l.e(S, "just(null)");
        return S;
    }
}
