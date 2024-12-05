package cm.aptoide.pt;

import cm.aptoide.pt.downloadmanager.FileDownloaderProvider;
import cm.aptoide.pt.downloadmanager.RetryFileDownloaderProvider;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRetryFileDownloaderProviderFactory implements Provider {
    private final Provider<FileDownloaderProvider> fileDownloaderProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRetryFileDownloaderProviderFactory(ApplicationModule applicationModule, Provider<FileDownloaderProvider> provider) {
        this.module = applicationModule;
        this.fileDownloaderProvider = provider;
    }

    public static ApplicationModule_ProvidesRetryFileDownloaderProviderFactory create(ApplicationModule applicationModule, Provider<FileDownloaderProvider> provider) {
        return new ApplicationModule_ProvidesRetryFileDownloaderProviderFactory(applicationModule, provider);
    }

    public static RetryFileDownloaderProvider providesRetryFileDownloaderProvider(ApplicationModule applicationModule, FileDownloaderProvider fileDownloaderProvider) {
        return (RetryFileDownloaderProvider) f.b.b.c(applicationModule.providesRetryFileDownloaderProvider(fileDownloaderProvider));
    }

    @Override // javax.inject.Provider
    public RetryFileDownloaderProvider get() {
        return providesRetryFileDownloaderProvider(this.module, this.fileDownloaderProvider.get());
    }
}
