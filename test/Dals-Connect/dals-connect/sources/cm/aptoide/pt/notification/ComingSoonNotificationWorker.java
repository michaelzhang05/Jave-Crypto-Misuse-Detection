package cm.aptoide.pt.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.i;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.R;
import cm.aptoide.pt.app.aptoideinstall.ComingSoonApp;
import cm.aptoide.pt.networking.image.ImageLoader;
import cm.aptoide.pt.view.app.AppCenter;
import cm.aptoide.pt.view.app.DetailedAppRequestResult;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: ComingSoonNotificationWorker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcm/aptoide/pt/notification/ComingSoonNotificationWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "appCenter", "Lcm/aptoide/pt/view/app/AppCenter;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcm/aptoide/pt/view/app/AppCenter;)V", "cancelComingSoonVerification", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", HttpUrl.FRAGMENT_ENCODE_SET, "doWork", "Landroidx/work/ListenableWorker$Result;", "handleAppArrived", "comingSoonApp", "Lcm/aptoide/pt/app/aptoideinstall/ComingSoonApp;", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComingSoonNotificationWorker extends Worker {
    private final AppCenter appCenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComingSoonNotificationWorker(Context context, WorkerParameters workerParameters, AppCenter appCenter) {
        super(context, workerParameters);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(workerParameters, "workerParameters");
        kotlin.jvm.internal.l.f(appCenter, "appCenter");
        this.appCenter = appCenter;
    }

    private final void cancelComingSoonVerification(String packageName) {
        if (packageName != null) {
            androidx.work.y.h(getApplicationContext()).a(ComingSoonNotificationManager.WORKER_TAG + packageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWork$lambda-1, reason: not valid java name */
    public static final void m277doWork$lambda1(ComingSoonNotificationWorker comingSoonNotificationWorker, String str, DetailedAppRequestResult detailedAppRequestResult) {
        kotlin.jvm.internal.l.f(comingSoonNotificationWorker, "this$0");
        if (detailedAppRequestResult == null || detailedAppRequestResult.getDetailedApp() == null) {
            return;
        }
        comingSoonNotificationWorker.cancelComingSoonVerification(str);
        String name = detailedAppRequestResult.getDetailedApp().getName();
        kotlin.jvm.internal.l.e(name, "detailedAppResult.detailedApp.name");
        String icon = detailedAppRequestResult.getDetailedApp().getIcon();
        kotlin.jvm.internal.l.e(icon, "detailedAppResult.detailedApp.icon");
        String md5 = detailedAppRequestResult.getDetailedApp().getMd5();
        kotlin.jvm.internal.l.e(md5, "detailedAppResult.detailedApp.md5");
        String name2 = detailedAppRequestResult.getDetailedApp().getStore().getName();
        kotlin.jvm.internal.l.e(name2, "detailedAppResult.detailedApp.store.name");
        String packageName = detailedAppRequestResult.getDetailedApp().getPackageName();
        kotlin.jvm.internal.l.e(packageName, "detailedAppResult.detailedApp.packageName");
        comingSoonNotificationWorker.handleAppArrived(new ComingSoonApp(name, icon, md5, name2, packageName));
    }

    private final void handleAppArrived(ComingSoonApp comingSoonApp) {
        Intent intent = new Intent(getApplicationContext(), AptoideApplication.getActivityProvider().getMainActivityFragmentClass());
        intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("md5", comingSoonApp.getMd5());
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 67108864);
        String string = getApplicationContext().getString(R.string.promotional_new_notification_body, comingSoonApp.getAppName());
        kotlin.jvm.internal.l.e(string, "applicationContext.getSt…   comingSoonApp.appName)");
        Notification c2 = new i.d(getApplicationContext(), ComingSoonNotificationManager.CHANNEL_ID).j(activity).q(false).u(R.drawable.ic_stat_aptoide_notification).o(ImageLoader.with(getApplicationContext()).loadBitmap(comingSoonApp.getAppIcon())).l(getApplicationContext().getString(R.string.promotional_new_notification_title)).k(string).g(true).c();
        kotlin.jvm.internal.l.e(c2, "Builder(applicationConte…tAutoCancel(true).build()");
        androidx.core.app.l.a(getApplicationContext()).c(1994, c2);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        final String j2 = getInputData().j("package_name");
        this.appCenter.loadDetailedApp(j2, "catappult").g(new rx.m.b() { // from class: cm.aptoide.pt.notification.c
            @Override // rx.m.b
            public final void call(Object obj) {
                ComingSoonNotificationWorker.m277doWork$lambda1(ComingSoonNotificationWorker.this, j2, (DetailedAppRequestResult) obj);
            }
        }).y().b();
        ListenableWorker.a c2 = ListenableWorker.a.c();
        kotlin.jvm.internal.l.e(c2, "success()");
        return c2;
    }
}
