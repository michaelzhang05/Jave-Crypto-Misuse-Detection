package cm.aptoide.pt;

import cm.aptoide.pt.download.AppValidator;
import cm.aptoide.pt.download.DownloadFactory;
import cm.aptoide.pt.download.SplitTypeSubFileTypeMapper;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideDownloadFactoryFactory implements Provider {
    private final Provider<AppValidator> appValidatorProvider;
    private final Provider<String> cachePathProvider;
    private final Provider<String> marketNameProvider;
    private final ApplicationModule module;
    private final Provider<SplitTypeSubFileTypeMapper> splitTypeSubFileTypeMapperProvider;

    public ApplicationModule_ProvideDownloadFactoryFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<String> provider2, Provider<AppValidator> provider3, Provider<SplitTypeSubFileTypeMapper> provider4) {
        this.module = applicationModule;
        this.marketNameProvider = provider;
        this.cachePathProvider = provider2;
        this.appValidatorProvider = provider3;
        this.splitTypeSubFileTypeMapperProvider = provider4;
    }

    public static ApplicationModule_ProvideDownloadFactoryFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<String> provider2, Provider<AppValidator> provider3, Provider<SplitTypeSubFileTypeMapper> provider4) {
        return new ApplicationModule_ProvideDownloadFactoryFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static DownloadFactory provideDownloadFactory(ApplicationModule applicationModule, String str, String str2, AppValidator appValidator, SplitTypeSubFileTypeMapper splitTypeSubFileTypeMapper) {
        return (DownloadFactory) f.b.b.c(applicationModule.provideDownloadFactory(str, str2, appValidator, splitTypeSubFileTypeMapper));
    }

    @Override // javax.inject.Provider
    public DownloadFactory get() {
        return provideDownloadFactory(this.module, this.marketNameProvider.get(), this.cachePathProvider.get(), this.appValidatorProvider.get(), this.splitTypeSubFileTypeMapperProvider.get());
    }
}
