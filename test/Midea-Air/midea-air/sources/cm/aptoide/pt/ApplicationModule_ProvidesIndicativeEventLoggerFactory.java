package cm.aptoide.pt;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.EventLogger;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesIndicativeEventLoggerFactory implements Provider {
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesIndicativeEventLoggerFactory(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider) {
        this.module = applicationModule;
        this.loggerProvider = provider;
    }

    public static ApplicationModule_ProvidesIndicativeEventLoggerFactory create(ApplicationModule applicationModule, Provider<AnalyticsLogger> provider) {
        return new ApplicationModule_ProvidesIndicativeEventLoggerFactory(applicationModule, provider);
    }

    public static EventLogger providesIndicativeEventLogger(ApplicationModule applicationModule, AnalyticsLogger analyticsLogger) {
        return (EventLogger) f.b.b.c(applicationModule.providesIndicativeEventLogger(analyticsLogger));
    }

    @Override // javax.inject.Provider
    public EventLogger get() {
        return providesIndicativeEventLogger(this.module, this.loggerProvider.get());
    }
}
