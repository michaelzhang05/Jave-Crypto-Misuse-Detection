package cm.aptoide.pt;

import cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesknockEventLoggerFactory implements Provider {
    private final Provider<OkHttpClient> clientProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesknockEventLoggerFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider) {
        this.module = applicationModule;
        this.clientProvider = provider;
    }

    public static ApplicationModule_ProvidesknockEventLoggerFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider) {
        return new ApplicationModule_ProvidesknockEventLoggerFactory(applicationModule, provider);
    }

    public static HttpKnockEventLogger providesknockEventLogger(ApplicationModule applicationModule, OkHttpClient okHttpClient) {
        return (HttpKnockEventLogger) f.b.b.c(applicationModule.providesknockEventLogger(okHttpClient));
    }

    @Override // javax.inject.Provider
    public HttpKnockEventLogger get() {
        return providesknockEventLogger(this.module, this.clientProvider.get());
    }
}
