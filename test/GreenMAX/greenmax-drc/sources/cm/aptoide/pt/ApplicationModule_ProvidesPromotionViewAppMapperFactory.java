package cm.aptoide.pt;

import cm.aptoide.pt.app.DownloadStateParser;
import cm.aptoide.pt.promotions.PromotionViewAppMapper;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesPromotionViewAppMapperFactory implements Provider {
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesPromotionViewAppMapperFactory(ApplicationModule applicationModule, Provider<DownloadStateParser> provider) {
        this.module = applicationModule;
        this.downloadStateParserProvider = provider;
    }

    public static ApplicationModule_ProvidesPromotionViewAppMapperFactory create(ApplicationModule applicationModule, Provider<DownloadStateParser> provider) {
        return new ApplicationModule_ProvidesPromotionViewAppMapperFactory(applicationModule, provider);
    }

    public static PromotionViewAppMapper providesPromotionViewAppMapper(ApplicationModule applicationModule, DownloadStateParser downloadStateParser) {
        return (PromotionViewAppMapper) f.b.b.c(applicationModule.providesPromotionViewAppMapper(downloadStateParser));
    }

    @Override // javax.inject.Provider
    public PromotionViewAppMapper get() {
        return providesPromotionViewAppMapper(this.module, this.downloadStateParserProvider.get());
    }
}
