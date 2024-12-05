package cm.aptoide.pt;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.ads.AdsRepository;
import cm.aptoide.pt.dataprovider.ws.v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.pt.download.OemidProvider;
import cm.aptoide.pt.networking.IdsRepository;
import cm.aptoide.pt.utils.q.QManager;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAdsRepositoryFactory implements Provider {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AdsApplicationVersionCodeProvider> adsApplicationVersionCodeProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<OemidProvider> oemidProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<QManager> qManagerProvider;

    public ApplicationModule_ProvideAdsRepositoryFactory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AptoideAccountManager> provider2, Provider<OkHttpClient> provider3, Provider<QManager> provider4, Provider<SharedPreferences> provider5, Provider<AdsApplicationVersionCodeProvider> provider6, Provider<ConnectivityManager> provider7, Provider<OemidProvider> provider8) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.accountManagerProvider = provider2;
        this.okHttpClientProvider = provider3;
        this.qManagerProvider = provider4;
        this.defaultSharedPreferencesProvider = provider5;
        this.adsApplicationVersionCodeProvider = provider6;
        this.connectivityManagerProvider = provider7;
        this.oemidProvider = provider8;
    }

    public static ApplicationModule_ProvideAdsRepositoryFactory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AptoideAccountManager> provider2, Provider<OkHttpClient> provider3, Provider<QManager> provider4, Provider<SharedPreferences> provider5, Provider<AdsApplicationVersionCodeProvider> provider6, Provider<ConnectivityManager> provider7, Provider<OemidProvider> provider8) {
        return new ApplicationModule_ProvideAdsRepositoryFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static AdsRepository provideAdsRepository(ApplicationModule applicationModule, IdsRepository idsRepository, AptoideAccountManager aptoideAccountManager, OkHttpClient okHttpClient, QManager qManager, SharedPreferences sharedPreferences, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, ConnectivityManager connectivityManager, OemidProvider oemidProvider) {
        return (AdsRepository) f.b.b.c(applicationModule.provideAdsRepository(idsRepository, aptoideAccountManager, okHttpClient, qManager, sharedPreferences, adsApplicationVersionCodeProvider, connectivityManager, oemidProvider));
    }

    @Override // javax.inject.Provider
    public AdsRepository get() {
        return provideAdsRepository(this.module, this.idsRepositoryProvider.get(), this.accountManagerProvider.get(), this.okHttpClientProvider.get(), this.qManagerProvider.get(), this.defaultSharedPreferencesProvider.get(), this.adsApplicationVersionCodeProvider.get(), this.connectivityManagerProvider.get(), this.oemidProvider.get());
    }
}
