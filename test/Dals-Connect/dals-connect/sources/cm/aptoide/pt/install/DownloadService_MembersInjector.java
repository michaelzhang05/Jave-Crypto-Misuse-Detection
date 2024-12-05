package cm.aptoide.pt.install;

import cm.aptoide.pt.AppInBackgroundTracker;
import cm.aptoide.pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.pt.notification.NotificationProvider;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class DownloadService_MembersInjector implements f.a<DownloadService> {
    private final Provider<AppInBackgroundTracker> appInBackgroundTrackerProvider;
    private final Provider<AptoideDownloadManager> downloadManagerProvider;
    private final Provider<NotificationProvider> notificationProvider;

    public DownloadService_MembersInjector(Provider<AptoideDownloadManager> provider, Provider<AppInBackgroundTracker> provider2, Provider<NotificationProvider> provider3) {
        this.downloadManagerProvider = provider;
        this.appInBackgroundTrackerProvider = provider2;
        this.notificationProvider = provider3;
    }

    public static f.a<DownloadService> create(Provider<AptoideDownloadManager> provider, Provider<AppInBackgroundTracker> provider2, Provider<NotificationProvider> provider3) {
        return new DownloadService_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAppInBackgroundTracker(DownloadService downloadService, AppInBackgroundTracker appInBackgroundTracker) {
        downloadService.appInBackgroundTracker = appInBackgroundTracker;
    }

    public static void injectDownloadManager(DownloadService downloadService, AptoideDownloadManager aptoideDownloadManager) {
        downloadService.downloadManager = aptoideDownloadManager;
    }

    public static void injectNotificationProvider(DownloadService downloadService, NotificationProvider notificationProvider) {
        downloadService.notificationProvider = notificationProvider;
    }

    public void injectMembers(DownloadService downloadService) {
        injectDownloadManager(downloadService, this.downloadManagerProvider.get());
        injectAppInBackgroundTracker(downloadService, this.appInBackgroundTrackerProvider.get());
        injectNotificationProvider(downloadService, this.notificationProvider.get());
    }
}
