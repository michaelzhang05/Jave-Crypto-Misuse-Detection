package cm.aptoide.pt;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.dataprovider.WebService;
import cm.aptoide.pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseBody;
import cm.aptoide.pt.dataprovider.ws.v7.BaseRequestWithStore;
import cm.aptoide.pt.dataprovider.ws.v7.store.GetStoreMetaRequest;
import cm.aptoide.pt.store.StoreCredentialsProvider;
import cm.aptoide.pt.store.StoreUtilsProxy;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* compiled from: FollowedStoresManager.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcm/aptoide/pt/FollowedStoresManager;", HttpUrl.FRAGMENT_ENCODE_SET, "storeCredentials", "Lcm/aptoide/pt/store/StoreCredentialsProvider;", "defaultFollowedStores", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "storeUtilsProxy", "Lcm/aptoide/pt/store/StoreUtilsProxy;", "accountSettingsBodyInterceptorPoolV7", "Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "Lcm/aptoide/pt/dataprovider/ws/v7/BaseBody;", "accountManager", "Lcm/aptoide/accountmanager/AptoideAccountManager;", "defaultClient", "Lokhttp3/OkHttpClient;", "tokenInvalidator", "Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "defaultSharedPreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/store/StoreCredentialsProvider;Ljava/util/List;Lcm/aptoide/pt/store/StoreUtilsProxy;Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;Lcm/aptoide/accountmanager/AptoideAccountManager;Lokhttp3/OkHttpClient;Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;Landroid/content/SharedPreferences;)V", "setDefaultFollowedStores", "Lrx/Completable;", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FollowedStoresManager {
    private final AptoideAccountManager accountManager;
    private final BodyInterceptor<BaseBody> accountSettingsBodyInterceptorPoolV7;
    private final OkHttpClient defaultClient;
    private final List<String> defaultFollowedStores;
    private final SharedPreferences defaultSharedPreferences;
    private final StoreCredentialsProvider storeCredentials;
    private final StoreUtilsProxy storeUtilsProxy;
    private final TokenInvalidator tokenInvalidator;

    public FollowedStoresManager(StoreCredentialsProvider storeCredentialsProvider, List<String> list, StoreUtilsProxy storeUtilsProxy, BodyInterceptor<BaseBody> bodyInterceptor, AptoideAccountManager aptoideAccountManager, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.l.f(storeCredentialsProvider, "storeCredentials");
        kotlin.jvm.internal.l.f(list, "defaultFollowedStores");
        kotlin.jvm.internal.l.f(storeUtilsProxy, "storeUtilsProxy");
        kotlin.jvm.internal.l.f(bodyInterceptor, "accountSettingsBodyInterceptorPoolV7");
        kotlin.jvm.internal.l.f(aptoideAccountManager, "accountManager");
        kotlin.jvm.internal.l.f(okHttpClient, "defaultClient");
        kotlin.jvm.internal.l.f(tokenInvalidator, "tokenInvalidator");
        kotlin.jvm.internal.l.f(sharedPreferences, "defaultSharedPreferences");
        this.storeCredentials = storeCredentialsProvider;
        this.defaultFollowedStores = list;
        this.storeUtilsProxy = storeUtilsProxy;
        this.accountSettingsBodyInterceptorPoolV7 = bodyInterceptor;
        this.accountManager = aptoideAccountManager;
        this.defaultClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.defaultSharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDefaultFollowedStores$lambda-0, reason: not valid java name */
    public static final rx.b m20setDefaultFollowedStores$lambda0(FollowedStoresManager followedStoresManager, String str) {
        kotlin.jvm.internal.l.f(followedStoresManager, "this$0");
        BaseRequestWithStore.StoreCredentials storeCredentials = followedStoresManager.storeCredentials.get(str);
        return followedStoresManager.storeUtilsProxy.addDefaultStore(GetStoreMetaRequest.of(storeCredentials, followedStoresManager.accountSettingsBodyInterceptorPoolV7, followedStoresManager.defaultClient, WebService.getDefaultConverter(), followedStoresManager.tokenInvalidator, followedStoresManager.defaultSharedPreferences), followedStoresManager.accountManager, storeCredentials);
    }

    public final rx.b setDefaultFollowedStores() {
        rx.b z = rx.e.N(this.defaultFollowedStores).H(new rx.m.e() { // from class: cm.aptoide.pt.m0
            @Override // rx.m.e
            public final Object call(Object obj) {
                rx.b m20setDefaultFollowedStores$lambda0;
                m20setDefaultFollowedStores$lambda0 = FollowedStoresManager.m20setDefaultFollowedStores$lambda0(FollowedStoresManager.this, (String) obj);
                return m20setDefaultFollowedStores$lambda0;
            }
        }).Y0().E().Z0().z();
        kotlin.jvm.internal.l.e(z, "from(defaultFollowedStor…\n        .toCompletable()");
        return z;
    }
}
