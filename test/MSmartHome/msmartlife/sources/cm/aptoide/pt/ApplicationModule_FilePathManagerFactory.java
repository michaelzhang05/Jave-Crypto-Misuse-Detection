package cm.aptoide.pt;

import cm.aptoide.pt.install.FilePathProvider;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_FilePathManagerFactory implements Provider {
    private final Provider<String> apkPathProvider;
    private final Provider<String> cachePathProvider;
    private final ApplicationModule module;
    private final Provider<String> obbPathProvider;

    public ApplicationModule_FilePathManagerFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<String> provider2, Provider<String> provider3) {
        this.module = applicationModule;
        this.cachePathProvider = provider;
        this.apkPathProvider = provider2;
        this.obbPathProvider = provider3;
    }

    public static ApplicationModule_FilePathManagerFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<String> provider2, Provider<String> provider3) {
        return new ApplicationModule_FilePathManagerFactory(applicationModule, provider, provider2, provider3);
    }

    public static FilePathProvider filePathManager(ApplicationModule applicationModule, String str, String str2, String str3) {
        return (FilePathProvider) f.b.b.c(applicationModule.filePathManager(str, str2, str3));
    }

    @Override // javax.inject.Provider
    public FilePathProvider get() {
        return filePathManager(this.module, this.cachePathProvider.get(), this.apkPathProvider.get(), this.obbPathProvider.get());
    }
}
