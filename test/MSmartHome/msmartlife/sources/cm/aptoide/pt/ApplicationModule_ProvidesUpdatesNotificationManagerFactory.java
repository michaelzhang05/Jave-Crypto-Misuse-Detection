package cm.aptoide.pt;

import cm.aptoide.pt.notification.UpdatesNotificationManager;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesUpdatesNotificationManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdatesNotificationManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesUpdatesNotificationManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesUpdatesNotificationManagerFactory(applicationModule);
    }

    public static UpdatesNotificationManager providesUpdatesNotificationManager(ApplicationModule applicationModule) {
        return (UpdatesNotificationManager) f.b.b.c(applicationModule.providesUpdatesNotificationManager());
    }

    @Override // javax.inject.Provider
    public UpdatesNotificationManager get() {
        return providesUpdatesNotificationManager(this.module);
    }
}
