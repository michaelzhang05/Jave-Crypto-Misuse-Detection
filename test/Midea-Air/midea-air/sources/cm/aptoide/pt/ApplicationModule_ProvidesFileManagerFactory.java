package cm.aptoide.pt;

import cm.aptoide.pt.dataprovider.cache.L2Cache;
import cm.aptoide.pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.pt.file.CacheHelper;
import cm.aptoide.pt.file.FileManager;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFileManagerFactory implements Provider {
    private final Provider<AptoideDownloadManager> aptoideDownloadManagerProvider;
    private final Provider<CacheHelper> cacheHelperProvider;
    private final Provider<String> cachePathProvider;
    private final Provider<L2Cache> httpClientCacheProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFileManagerFactory(ApplicationModule applicationModule, Provider<CacheHelper> provider, Provider<String> provider2, Provider<AptoideDownloadManager> provider3, Provider<L2Cache> provider4) {
        this.module = applicationModule;
        this.cacheHelperProvider = provider;
        this.cachePathProvider = provider2;
        this.aptoideDownloadManagerProvider = provider3;
        this.httpClientCacheProvider = provider4;
    }

    public static ApplicationModule_ProvidesFileManagerFactory create(ApplicationModule applicationModule, Provider<CacheHelper> provider, Provider<String> provider2, Provider<AptoideDownloadManager> provider3, Provider<L2Cache> provider4) {
        return new ApplicationModule_ProvidesFileManagerFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static FileManager providesFileManager(ApplicationModule applicationModule, CacheHelper cacheHelper, String str, AptoideDownloadManager aptoideDownloadManager, L2Cache l2Cache) {
        return (FileManager) f.b.b.c(applicationModule.providesFileManager(cacheHelper, str, aptoideDownloadManager, l2Cache));
    }

    @Override // javax.inject.Provider
    public FileManager get() {
        return providesFileManager(this.module, this.cacheHelperProvider.get(), this.cachePathProvider.get(), this.aptoideDownloadManagerProvider.get(), this.httpClientCacheProvider.get());
    }
}
