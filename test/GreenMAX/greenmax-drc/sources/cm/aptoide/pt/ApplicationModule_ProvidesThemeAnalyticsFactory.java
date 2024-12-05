package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.pt.themes.ThemeAnalytics;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesThemeAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesThemeAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesThemeAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvidesThemeAnalyticsFactory(applicationModule, provider);
    }

    public static ThemeAnalytics providesThemeAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        return (ThemeAnalytics) f.b.b.c(applicationModule.providesThemeAnalytics(analyticsManager));
    }

    @Override // javax.inject.Provider
    public ThemeAnalytics get() {
        return providesThemeAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
