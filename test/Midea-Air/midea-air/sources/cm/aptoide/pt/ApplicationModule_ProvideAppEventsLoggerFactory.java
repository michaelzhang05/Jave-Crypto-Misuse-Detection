package cm.aptoide.pt;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAppEventsLoggerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAppEventsLoggerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAppEventsLoggerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAppEventsLoggerFactory(applicationModule);
    }

    public static com.facebook.t.g provideAppEventsLogger(ApplicationModule applicationModule) {
        return (com.facebook.t.g) f.b.b.c(applicationModule.provideAppEventsLogger());
    }

    @Override // javax.inject.Provider
    public com.facebook.t.g get() {
        return provideAppEventsLogger(this.module);
    }
}
