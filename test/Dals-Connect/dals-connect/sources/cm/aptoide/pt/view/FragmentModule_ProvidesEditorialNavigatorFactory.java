package cm.aptoide.pt.view;

import cm.aptoide.pt.account.view.AccountNavigator;
import cm.aptoide.pt.app.AppNavigator;
import cm.aptoide.pt.editorial.EditorialNavigator;
import cm.aptoide.pt.navigator.FragmentNavigator;
import cm.aptoide.pt.socialmedia.SocialMediaNavigator;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesEditorialNavigatorFactory implements Provider {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;
    private final Provider<SocialMediaNavigator> socialMediaNavigatorProvider;

    public FragmentModule_ProvidesEditorialNavigatorFactory(FragmentModule fragmentModule, Provider<AppNavigator> provider, Provider<AccountNavigator> provider2, Provider<SocialMediaNavigator> provider3, Provider<FragmentNavigator> provider4) {
        this.module = fragmentModule;
        this.appNavigatorProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.socialMediaNavigatorProvider = provider3;
        this.fragmentNavigatorProvider = provider4;
    }

    public static FragmentModule_ProvidesEditorialNavigatorFactory create(FragmentModule fragmentModule, Provider<AppNavigator> provider, Provider<AccountNavigator> provider2, Provider<SocialMediaNavigator> provider3, Provider<FragmentNavigator> provider4) {
        return new FragmentModule_ProvidesEditorialNavigatorFactory(fragmentModule, provider, provider2, provider3, provider4);
    }

    public static EditorialNavigator providesEditorialNavigator(FragmentModule fragmentModule, AppNavigator appNavigator, AccountNavigator accountNavigator, SocialMediaNavigator socialMediaNavigator, FragmentNavigator fragmentNavigator) {
        return (EditorialNavigator) f.b.b.c(fragmentModule.providesEditorialNavigator(appNavigator, accountNavigator, socialMediaNavigator, fragmentNavigator));
    }

    @Override // javax.inject.Provider
    public EditorialNavigator get() {
        return providesEditorialNavigator(this.module, this.appNavigatorProvider.get(), this.accountNavigatorProvider.get(), this.socialMediaNavigatorProvider.get(), this.fragmentNavigatorProvider.get());
    }
}
