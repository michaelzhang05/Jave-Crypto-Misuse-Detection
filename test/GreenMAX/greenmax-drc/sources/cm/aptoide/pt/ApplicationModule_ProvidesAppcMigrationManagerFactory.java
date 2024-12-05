package cm.aptoide.pt;

import cm.aptoide.pt.app.migration.AppcMigrationManager;
import cm.aptoide.pt.app.migration.AppcMigrationRepository;
import cm.aptoide.pt.install.AptoideInstalledAppsRepository;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppcMigrationManagerFactory implements Provider {
    private final Provider<AppcMigrationRepository> appcMigrationRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<AptoideInstalledAppsRepository> repositoryProvider;

    public ApplicationModule_ProvidesAppcMigrationManagerFactory(ApplicationModule applicationModule, Provider<AptoideInstalledAppsRepository> provider, Provider<AppcMigrationRepository> provider2) {
        this.module = applicationModule;
        this.repositoryProvider = provider;
        this.appcMigrationRepositoryProvider = provider2;
    }

    public static ApplicationModule_ProvidesAppcMigrationManagerFactory create(ApplicationModule applicationModule, Provider<AptoideInstalledAppsRepository> provider, Provider<AppcMigrationRepository> provider2) {
        return new ApplicationModule_ProvidesAppcMigrationManagerFactory(applicationModule, provider, provider2);
    }

    public static AppcMigrationManager providesAppcMigrationManager(ApplicationModule applicationModule, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AppcMigrationRepository appcMigrationRepository) {
        return (AppcMigrationManager) f.b.b.c(applicationModule.providesAppcMigrationManager(aptoideInstalledAppsRepository, appcMigrationRepository));
    }

    @Override // javax.inject.Provider
    public AppcMigrationManager get() {
        return providesAppcMigrationManager(this.module, this.repositoryProvider.get(), this.appcMigrationRepositoryProvider.get());
    }
}
