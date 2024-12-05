package cm.aptoide.pt;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideCallbackManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCallbackManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCallbackManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCallbackManagerFactory(applicationModule);
    }

    public static com.facebook.d provideCallbackManager(ApplicationModule applicationModule) {
        return (com.facebook.d) f.b.b.c(applicationModule.provideCallbackManager());
    }

    @Override // javax.inject.Provider
    public com.facebook.d get() {
        return provideCallbackManager(this.module);
    }
}
