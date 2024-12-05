package cm.aptoide.pt.view;

import cm.aptoide.pt.CatappultNavigator;
import cm.aptoide.pt.navigator.FragmentNavigator;
import cm.aptoide.pt.socialmedia.SocialMediaNavigator;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesAppCoinsInfoNavigatorFactory implements Provider {
    private final Provider<CatappultNavigator> catappultNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;
    private final Provider<SocialMediaNavigator> socialMediaNavigatorProvider;

    public ActivityModule_ProvidesAppCoinsInfoNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<SocialMediaNavigator> provider2, Provider<CatappultNavigator> provider3) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.socialMediaNavigatorProvider = provider2;
        this.catappultNavigatorProvider = provider3;
    }

    public static ActivityModule_ProvidesAppCoinsInfoNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<SocialMediaNavigator> provider2, Provider<CatappultNavigator> provider3) {
        return new ActivityModule_ProvidesAppCoinsInfoNavigatorFactory(activityModule, provider, provider2, provider3);
    }

    public static AppCoinsInfoNavigator providesAppCoinsInfoNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, SocialMediaNavigator socialMediaNavigator, CatappultNavigator catappultNavigator) {
        return (AppCoinsInfoNavigator) f.b.b.c(activityModule.providesAppCoinsInfoNavigator(fragmentNavigator, socialMediaNavigator, catappultNavigator));
    }

    @Override // javax.inject.Provider
    public AppCoinsInfoNavigator get() {
        return providesAppCoinsInfoNavigator(this.module, this.fragmentNavigatorProvider.get(), this.socialMediaNavigatorProvider.get(), this.catappultNavigatorProvider.get());
    }
}
