package cm.aptoide.pt;

import android.content.SharedPreferences;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideSearchBaseUrlFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideSearchBaseUrlFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvideSearchBaseUrlFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvideSearchBaseUrlFactory(applicationModule, provider);
    }

    public static String provideSearchBaseUrl(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (String) f.b.b.c(applicationModule.provideSearchBaseUrl(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideSearchBaseUrl(this.module, this.sharedPreferencesProvider.get());
    }
}
