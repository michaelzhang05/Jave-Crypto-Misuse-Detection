package cm.aptoide.pt;

import android.content.SharedPreferences;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBaseRakamHostFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesBaseRakamHostFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesBaseRakamHostFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesBaseRakamHostFactory(applicationModule, provider);
    }

    public static String providesBaseRakamHost(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        return (String) f.b.b.c(applicationModule.providesBaseRakamHost(sharedPreferences));
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesBaseRakamHost(this.module, this.sharedPreferencesProvider.get());
    }
}