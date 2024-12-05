package cm.aptoide.pt.view;

import cm.aptoide.pt.account.view.AccountNavigator;
import cm.aptoide.pt.editorialList.EditorialListNavigator;
import cm.aptoide.pt.navigator.FragmentNavigator;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesEditorialListNavigatorFactory implements Provider {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesEditorialListNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<AccountNavigator> provider2) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.accountNavigatorProvider = provider2;
    }

    public static FragmentModule_ProvidesEditorialListNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<AccountNavigator> provider2) {
        return new FragmentModule_ProvidesEditorialListNavigatorFactory(fragmentModule, provider, provider2);
    }

    public static EditorialListNavigator providesEditorialListNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, AccountNavigator accountNavigator) {
        return (EditorialListNavigator) f.b.b.c(fragmentModule.providesEditorialListNavigator(fragmentNavigator, accountNavigator));
    }

    @Override // javax.inject.Provider
    public EditorialListNavigator get() {
        return providesEditorialListNavigator(this.module, this.fragmentNavigatorProvider.get(), this.accountNavigatorProvider.get());
    }
}
