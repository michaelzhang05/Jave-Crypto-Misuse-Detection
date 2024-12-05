package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.EventLogger;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFacebookEventLoggerFactory implements Provider {
    private final Provider<com.facebook.t.g> facebookProvider;
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFacebookEventLoggerFactory(ApplicationModule applicationModule, Provider<com.facebook.t.g> provider, Provider<AnalyticsLogger> provider2) {
        this.module = applicationModule;
        this.facebookProvider = provider;
        this.loggerProvider = provider2;
    }

    public static ApplicationModule_ProvidesFacebookEventLoggerFactory create(ApplicationModule applicationModule, Provider<com.facebook.t.g> provider, Provider<AnalyticsLogger> provider2) {
        return new ApplicationModule_ProvidesFacebookEventLoggerFactory(applicationModule, provider, provider2);
    }

    public static EventLogger providesFacebookEventLogger(ApplicationModule applicationModule, com.facebook.t.g gVar, AnalyticsLogger analyticsLogger) {
        return (EventLogger) f.b.b.c(applicationModule.providesFacebookEventLogger(gVar, analyticsLogger));
    }

    @Override // javax.inject.Provider
    public EventLogger get() {
        return providesFacebookEventLogger(this.module, this.facebookProvider.get(), this.loggerProvider.get());
    }
}
