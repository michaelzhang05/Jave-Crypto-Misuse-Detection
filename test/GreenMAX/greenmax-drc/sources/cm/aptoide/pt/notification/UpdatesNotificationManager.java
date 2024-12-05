package cm.aptoide.pt.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.work.c;
import androidx.work.s;
import cm.aptoide.pt.updates.UpdatesAnalytics;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: UpdatesNotificationManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcm/aptoide/pt/notification/UpdatesNotificationManager;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "updatesWorkRequest", "Landroidx/work/PeriodicWorkRequest;", "setUpChannel", HttpUrl.FRAGMENT_ENCODE_SET, "setUpNotification", "Lrx/Completable;", "setUpWorkRequest", "Companion", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdatesNotificationManager {
    public static final String CHANNEL_ID = "updates_notification_channel";
    public static final int UPDATE_NOTIFICATION_ID = 123;
    private static final String WORKER_TAG = "UpdatesNotificationWorker";
    private final Context context;
    private androidx.work.s updatesWorkRequest;

    public UpdatesNotificationManager(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.context = context;
    }

    private final void setUpChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Updates notifications", 3);
            notificationChannel.setDescription(UpdatesAnalytics.UPDATE_EVENT);
            Object systemService = this.context.getSystemService("notification");
            if (systemService != null) {
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUpNotification$lambda-0, reason: not valid java name */
    public static final void m283setUpNotification$lambda0(UpdatesNotificationManager updatesNotificationManager) {
        kotlin.jvm.internal.l.f(updatesNotificationManager, "this$0");
        updatesNotificationManager.setUpChannel();
        updatesNotificationManager.setUpWorkRequest();
    }

    private final void setUpWorkRequest() {
        androidx.work.s b2 = new s.a(UpdatesNotificationWorker.class, 1L, TimeUnit.DAYS).e(new c.a().b(androidx.work.o.UNMETERED).a()).b();
        kotlin.jvm.internal.l.e(b2, "PeriodicWorkRequestBuild…build())\n        .build()");
        this.updatesWorkRequest = b2;
        androidx.work.y h2 = androidx.work.y.h(this.context);
        androidx.work.f fVar = androidx.work.f.KEEP;
        androidx.work.s sVar = this.updatesWorkRequest;
        if (sVar == null) {
            kotlin.jvm.internal.l.v("updatesWorkRequest");
            sVar = null;
        }
        h2.e(WORKER_TAG, fVar, sVar);
    }

    public final rx.b setUpNotification() {
        rx.b t = rx.b.t(new rx.m.a() { // from class: cm.aptoide.pt.notification.k2
            @Override // rx.m.a
            public final void call() {
                UpdatesNotificationManager.m283setUpNotification$lambda0(UpdatesNotificationManager.this);
            }
        });
        kotlin.jvm.internal.l.e(t, "fromAction {\n      setUp… setUpWorkRequest()\n    }");
        return t;
    }
}
