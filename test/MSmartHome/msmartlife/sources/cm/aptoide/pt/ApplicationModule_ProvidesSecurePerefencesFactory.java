package cm.aptoide.pt;

import android.content.SharedPreferences;
import cm.aptoide.pt.preferences.SecurePreferences;
import cm.aptoide.pt.preferences.secure.SecureCoderDecoder;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesSecurePerefencesFactory implements Provider {
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;
    private final Provider<SecureCoderDecoder> secureCoderDecoderProvider;

    public ApplicationModule_ProvidesSecurePerefencesFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<SecureCoderDecoder> provider2) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.secureCoderDecoderProvider = provider2;
    }

    public static ApplicationModule_ProvidesSecurePerefencesFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<SecureCoderDecoder> provider2) {
        return new ApplicationModule_ProvidesSecurePerefencesFactory(applicationModule, provider, provider2);
    }

    public static SecurePreferences providesSecurePerefences(ApplicationModule applicationModule, SharedPreferences sharedPreferences, SecureCoderDecoder secureCoderDecoder) {
        return (SecurePreferences) f.b.b.c(applicationModule.providesSecurePerefences(sharedPreferences, secureCoderDecoder));
    }

    @Override // javax.inject.Provider
    public SecurePreferences get() {
        return providesSecurePerefences(this.module, this.defaultSharedPreferencesProvider.get(), this.secureCoderDecoderProvider.get());
    }
}
