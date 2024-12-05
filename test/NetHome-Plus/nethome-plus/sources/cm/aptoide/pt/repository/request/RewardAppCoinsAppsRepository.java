package cm.aptoide.pt.repository.request;

import android.content.SharedPreferences;
import cm.aptoide.pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign;
import cm.aptoide.pt.dataprovider.model.v7.DataList;
import cm.aptoide.pt.dataprovider.model.v7.ListAppCoinsCampaigns;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseBody;
import cm.aptoide.pt.dataprovider.ws.v7.GetAppCoinsCampaignsRequest;
import cm.aptoide.pt.home.bundles.apps.RewardApp;
import cm.aptoide.pt.install.InstallManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import rx.e;

/* loaded from: classes.dex */
public class RewardAppCoinsAppsRepository {
    private static final int APPCOINS_REWARD_LIMIT = 50;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private InstallManager installManager;
    private SharedPreferences sharedPreferences;
    private TokenInvalidator tokenInvalidator;
    private int total = 0;
    private int next = 0;

    public RewardAppCoinsAppsRepository(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, InstallManager installManager) {
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.bodyInterceptor = bodyInterceptor;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.installManager = installManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getFreshAppCoinsRewardAppsFromHomeMore$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ e a(String str, ListAppCoinsCampaigns listAppCoinsCampaigns) {
        return map(listAppCoinsCampaigns.getDataList(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getNextAppCoinsRewardAppsFromHomeMore$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ e b(String str, ListAppCoinsCampaigns listAppCoinsCampaigns) {
        return map(listAppCoinsCampaigns.getDataList(), str);
    }

    private e<List<RewardApp>> map(DataList<AppCoinsCampaign> dataList, String str) {
        this.total = dataList.getTotal();
        this.next = dataList.getNext();
        ArrayList arrayList = new ArrayList();
        for (AppCoinsCampaign appCoinsCampaign : dataList.getList()) {
            AppCoinsCampaign.CampaignApp app = appCoinsCampaign.getApp();
            if (!this.installManager.wasAppEverInstalled(app.getPackageName())) {
                arrayList.add(new RewardApp(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), str, app.getAppcoins() != null, app.getAppcoins().getClicks().getClick(), app.getAppcoins().getClicks().getInstall(), mapReward(appCoinsCampaign.getReward()), app.getGraphic()));
            }
        }
        return e.S(arrayList);
    }

    private RewardApp.Reward mapReward(AppCoinsCampaign.Reward reward) {
        AppCoinsCampaign.Fiat fiat = reward.getFiat();
        return new RewardApp.Reward(reward.getAppc(), new RewardApp.Fiat(fiat.getAmount(), fiat.getCurrency(), fiat.getSymbol()));
    }

    public e<List<RewardApp>> getFreshAppCoinsRewardAppsFromHomeMore(final String str) {
        return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(0, 50), this.httpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences).observe(true).G(new rx.m.e() { // from class: cm.aptoide.pt.repository.request.a
            @Override // rx.m.e
            public final Object call(Object obj) {
                return RewardAppCoinsAppsRepository.this.a(str, (ListAppCoinsCampaigns) obj);
            }
        });
    }

    public e<List<RewardApp>> getNextAppCoinsRewardAppsFromHomeMore(final String str) {
        int i2 = this.next;
        if (i2 >= this.total) {
            return e.S(Collections.emptyList());
        }
        return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(i2, 50), this.httpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences).observe(false).G(new rx.m.e() { // from class: cm.aptoide.pt.repository.request.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                return RewardAppCoinsAppsRepository.this.b(str, (ListAppCoinsCampaigns) obj);
            }
        });
    }
}
