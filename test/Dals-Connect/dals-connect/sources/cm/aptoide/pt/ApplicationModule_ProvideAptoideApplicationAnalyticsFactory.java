package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsManager;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAptoideApplicationAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideAptoideApplicationAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvideAptoideApplicationAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvideAptoideApplicationAnalyticsFactory(applicationModule, provider);
    }

    public static AptoideApplicationAnalytics provideAptoideApplicationAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        return (AptoideApplicationAnalytics) f.b.b.c(applicationModule.provideAptoideApplicationAnalytics(analyticsManager));
    }

    @Override // javax.inject.Provider
    public AptoideApplicationAnalytics get() {
        return provideAptoideApplicationAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
