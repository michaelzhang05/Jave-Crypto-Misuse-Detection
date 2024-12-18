package cm.aptoide.pt.navigator;

import cm.aptoide.pt.account.view.AccountNavigator;
import cm.aptoide.pt.themes.ThemeManager;
import javax.inject.Named;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ActivityResultNavigator_MembersInjector implements f.a<ActivityResultNavigator> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityResultNavigator_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
    }

    public static f.a<ActivityResultNavigator> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3) {
        return new ActivityResultNavigator_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAccountNavigator(ActivityResultNavigator activityResultNavigator, AccountNavigator accountNavigator) {
        activityResultNavigator.accountNavigator = accountNavigator;
    }

    @Named
    public static void injectMarketName(ActivityResultNavigator activityResultNavigator, String str) {
        activityResultNavigator.marketName = str;
    }

    public static void injectThemeManager(ActivityResultNavigator activityResultNavigator, ThemeManager themeManager) {
        activityResultNavigator.themeManager = themeManager;
    }

    public void injectMembers(ActivityResultNavigator activityResultNavigator) {
        injectThemeManager(activityResultNavigator, this.themeManagerProvider.get());
        injectAccountNavigator(activityResultNavigator, this.accountNavigatorProvider.get());
        injectMarketName(activityResultNavigator, this.marketNameProvider.get());
    }
}
