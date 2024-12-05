package cm.aptoide.pt;

import cm.aptoide.pt.reactions.ReactionsManager;
import cm.aptoide.pt.reactions.network.ReactionsService;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesReactionsManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<ReactionsService> reactionsServiceProvider;

    public ApplicationModule_ProvidesReactionsManagerFactory(ApplicationModule applicationModule, Provider<ReactionsService> provider) {
        this.module = applicationModule;
        this.reactionsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesReactionsManagerFactory create(ApplicationModule applicationModule, Provider<ReactionsService> provider) {
        return new ApplicationModule_ProvidesReactionsManagerFactory(applicationModule, provider);
    }

    public static ReactionsManager providesReactionsManager(ApplicationModule applicationModule, ReactionsService reactionsService) {
        return (ReactionsManager) f.b.b.c(applicationModule.providesReactionsManager(reactionsService));
    }

    @Override // javax.inject.Provider
    public ReactionsManager get() {
        return providesReactionsManager(this.module, this.reactionsServiceProvider.get());
    }
}
