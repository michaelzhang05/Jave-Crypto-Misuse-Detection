package cm.aptoide.pt.view;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideFragmentManagerFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvideFragmentManagerFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideFragmentManagerFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideFragmentManagerFactory(activityModule);
    }

    public static androidx.fragment.app.h provideFragmentManager(ActivityModule activityModule) {
        return (androidx.fragment.app.h) f.b.b.c(activityModule.provideFragmentManager());
    }

    @Override // javax.inject.Provider
    public androidx.fragment.app.h get() {
        return provideFragmentManager(this.module);
    }
}
