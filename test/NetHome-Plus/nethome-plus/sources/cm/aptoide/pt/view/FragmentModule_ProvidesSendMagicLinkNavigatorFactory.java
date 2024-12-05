package cm.aptoide.pt.view;

import cm.aptoide.pt.account.view.magiclink.SendMagicLinkNavigator;
import cm.aptoide.pt.navigator.FragmentNavigator;
import cm.aptoide.pt.themes.ThemeManager;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesSendMagicLinkNavigatorFactory implements Provider {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public FragmentModule_ProvidesSendMagicLinkNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<ThemeManager> provider2) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static FragmentModule_ProvidesSendMagicLinkNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<ThemeManager> provider2) {
        return new FragmentModule_ProvidesSendMagicLinkNavigatorFactory(fragmentModule, provider, provider2);
    }

    public static SendMagicLinkNavigator providesSendMagicLinkNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, ThemeManager themeManager) {
        return (SendMagicLinkNavigator) f.b.b.c(fragmentModule.providesSendMagicLinkNavigator(fragmentNavigator, themeManager));
    }

    @Override // javax.inject.Provider
    public SendMagicLinkNavigator get() {
        return providesSendMagicLinkNavigator(this.module, this.fragmentNavigatorProvider.get(), this.themeManagerProvider.get());
    }
}
