package cm.aptoide.pt;

import android.content.SharedPreferences;
import cm.aptoide.pt.dataprovider.cache.L2Cache;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAptoideMMPOkHttpBuilderFactory implements Provider {
    private final Provider<L2Cache> httpClientCacheProvider;
    private final ApplicationModule module;
    private final Provider<Interceptor> retrofitLogInterceptorProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesAptoideMMPOkHttpBuilderFactory(ApplicationModule applicationModule, Provider<L2Cache> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        this.module = applicationModule;
        this.httpClientCacheProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.retrofitLogInterceptorProvider = provider3;
    }

    public static ApplicationModule_ProvidesAptoideMMPOkHttpBuilderFactory create(ApplicationModule applicationModule, Provider<L2Cache> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        return new ApplicationModule_ProvidesAptoideMMPOkHttpBuilderFactory(applicationModule, provider, provider2, provider3);
    }

    public static OkHttpClient.Builder providesAptoideMMPOkHttpBuilder(ApplicationModule applicationModule, L2Cache l2Cache, SharedPreferences sharedPreferences, Interceptor interceptor) {
        return (OkHttpClient.Builder) f.b.b.c(applicationModule.providesAptoideMMPOkHttpBuilder(l2Cache, sharedPreferences, interceptor));
    }

    @Override // javax.inject.Provider
    public OkHttpClient.Builder get() {
        return providesAptoideMMPOkHttpBuilder(this.module, this.httpClientCacheProvider.get(), this.sharedPreferencesProvider.get(), this.retrofitLogInterceptorProvider.get());
    }
}