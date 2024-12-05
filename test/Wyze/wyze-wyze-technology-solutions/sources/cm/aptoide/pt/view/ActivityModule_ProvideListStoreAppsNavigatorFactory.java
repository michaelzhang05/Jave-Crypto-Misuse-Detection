package cm.aptoide.pt.view;

import cm.aptoide.pt.app.AppNavigator;
import cm.aptoide.pt.navigator.FragmentNavigator;
import cm.aptoide.pt.view.app.ListStoreAppsNavigator;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideListStoreAppsNavigatorFactory implements Provider {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideListStoreAppsNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.appNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvideListStoreAppsNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AppNavigator> provider2) {
        return new ActivityModule_ProvideListStoreAppsNavigatorFactory(activityModule, provider, provider2);
    }

    public static ListStoreAppsNavigator provideListStoreAppsNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        return (ListStoreAppsNavigator) f.b.b.c(activityModule.provideListStoreAppsNavigator(fragmentNavigator, appNavigator));
    }

    @Override // javax.inject.Provider
    public ListStoreAppsNavigator get() {
        return provideListStoreAppsNavigator(this.module, this.fragmentNavigatorProvider.get(), this.appNavigatorProvider.get());
    }
}
