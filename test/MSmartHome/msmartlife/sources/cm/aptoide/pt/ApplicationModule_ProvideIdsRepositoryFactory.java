package cm.aptoide.pt;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import cm.aptoide.pt.networking.IdsRepository;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideIdsRepositoryFactory implements Provider {
    private final Provider<ContentResolver> contentResolverProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideIdsRepositoryFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<ContentResolver> provider2) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.contentResolverProvider = provider2;
    }

    public static ApplicationModule_ProvideIdsRepositoryFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<ContentResolver> provider2) {
        return new ApplicationModule_ProvideIdsRepositoryFactory(applicationModule, provider, provider2);
    }

    public static IdsRepository provideIdsRepository(ApplicationModule applicationModule, SharedPreferences sharedPreferences, ContentResolver contentResolver) {
        return (IdsRepository) f.b.b.c(applicationModule.provideIdsRepository(sharedPreferences, contentResolver));
    }

    @Override // javax.inject.Provider
    public IdsRepository get() {
        return provideIdsRepository(this.module, this.defaultSharedPreferencesProvider.get(), this.contentResolverProvider.get());
    }
}
