package cm.aptoide.pt;

import cm.aptoide.pt.app.DownloadStateParser;
import cm.aptoide.pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.pt.install.InstallManager;
import cm.aptoide.pt.view.app.AppCenter;
import cm.aptoide.pt.wallet.WalletAppProvider;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesWalletAppProviderFactory implements Provider {
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesWalletAppProviderFactory(ApplicationModule applicationModule, Provider<AppCenter> provider, Provider<AptoideInstalledAppsRepository> provider2, Provider<InstallManager> provider3, Provider<DownloadStateParser> provider4) {
        this.module = applicationModule;
        this.appCenterProvider = provider;
        this.aptoideInstalledAppsRepositoryProvider = provider2;
        this.installManagerProvider = provider3;
        this.downloadStateParserProvider = provider4;
    }

    public static ApplicationModule_ProvidesWalletAppProviderFactory create(ApplicationModule applicationModule, Provider<AppCenter> provider, Provider<AptoideInstalledAppsRepository> provider2, Provider<InstallManager> provider3, Provider<DownloadStateParser> provider4) {
        return new ApplicationModule_ProvidesWalletAppProviderFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static WalletAppProvider providesWalletAppProvider(ApplicationModule applicationModule, AppCenter appCenter, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, InstallManager installManager, DownloadStateParser downloadStateParser) {
        return (WalletAppProvider) f.b.b.c(applicationModule.providesWalletAppProvider(appCenter, aptoideInstalledAppsRepository, installManager, downloadStateParser));
    }

    @Override // javax.inject.Provider
    public WalletAppProvider get() {
        return providesWalletAppProvider(this.module, this.appCenterProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.installManagerProvider.get(), this.downloadStateParserProvider.get());
    }
}
