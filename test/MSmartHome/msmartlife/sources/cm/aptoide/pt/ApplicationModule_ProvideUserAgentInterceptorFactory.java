package cm.aptoide.pt;

import cm.aptoide.pt.networking.IdsRepository;
import cm.aptoide.pt.preferences.AptoideMd5Manager;
import javax.inject.Provider;
import okhttp3.Interceptor;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideUserAgentInterceptorFactory implements Provider {
    private final Provider<AptoideMd5Manager> aptoideMd5ManagerProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideUserAgentInterceptorFactory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AptoideMd5Manager> provider2) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.aptoideMd5ManagerProvider = provider2;
    }

    public static ApplicationModule_ProvideUserAgentInterceptorFactory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AptoideMd5Manager> provider2) {
        return new ApplicationModule_ProvideUserAgentInterceptorFactory(applicationModule, provider, provider2);
    }

    public static Interceptor provideUserAgentInterceptor(ApplicationModule applicationModule, IdsRepository idsRepository, AptoideMd5Manager aptoideMd5Manager) {
        return (Interceptor) f.b.b.c(applicationModule.provideUserAgentInterceptor(idsRepository, aptoideMd5Manager));
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return provideUserAgentInterceptor(this.module, this.idsRepositoryProvider.get(), this.aptoideMd5ManagerProvider.get());
    }
}
