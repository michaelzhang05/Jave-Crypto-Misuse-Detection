package cm.aptoide.pt;

import android.content.SharedPreferences;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBaseWebservicesHostFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesBaseWebservicesHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesBaseWebservicesHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesBaseWebservicesHostFactory(applicationModule, provider);
    }

    public static String providesBaseWebservicesHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (String) f.b.b.c(applicationModule.providesBaseWebservicesHost(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesBaseWebservicesHost(this.module, this.sharedPreferencesProvider.get());
    }
}