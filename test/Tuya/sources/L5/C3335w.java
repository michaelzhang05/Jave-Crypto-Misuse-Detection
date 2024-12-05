package l5;

import N4.w;
import X4.C1491a;
import X4.C1498h;
import X4.C1505o;
import X4.O;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.uptodown.R;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.receivers.DownloadNotificationReceiver;
import com.uptodown.workers.DownloadApkWorker;
import com.uptodown.workers.DownloadWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;

/* renamed from: l5.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3335w {

    /* renamed from: a, reason: collision with root package name */
    public static final C3335w f34546a = new C3335w();

    private C3335w() {
    }

    private final void A(NotificationCompat.Builder builder) {
        builder.setSmallIcon(R.drawable.vector_uptodown_logo_bag_transp);
    }

    private final void b(Context context, int i8) {
        StatusBarNotification[] activeNotifications;
        String str;
        if (Build.VERSION.SDK_INT >= 24 && i8 > 0) {
            Object systemService = context.getSystemService("notification");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            activeNotifications = notificationManager.getActiveNotifications();
            AbstractC3159y.h(activeNotifications, "activeNotifications");
            int length = activeNotifications.length;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    StatusBarNotification statusBarNotification = activeNotifications[i9];
                    if (i8 == statusBarNotification.getId()) {
                        str = statusBarNotification.getGroupKey();
                        break;
                    }
                    i9++;
                } else {
                    str = null;
                    break;
                }
            }
            if (str != null) {
                for (StatusBarNotification statusBarNotification2 : activeNotifications) {
                    if (i8 != statusBarNotification2.getId() && AbstractC3159y.d(statusBarNotification2.getGroupKey(), str)) {
                        return;
                    }
                }
                notificationManager.cancel(i8);
            }
        }
    }

    private final Bitmap p(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                AbstractC3159y.h(bitmap, "drawable.bitmap");
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            AbstractC3159y.h(createBitmap, "{\n            Bitmap.cre…nfig.ARGB_8888)\n        }");
        } else {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            AbstractC3159y.h(createBitmap, "{\n            Bitmap.cre…ed of 1x1 pixel\n        }");
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private final int q(Context context) {
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        int i02 = a8.i0();
        a8.g();
        if (i02 == 0) {
            return 300;
        }
        return i02 + 1;
    }

    private final int r() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 201326592;
        }
        return 134217728;
    }

    private final void u(O o8, Context context) {
        Drawable drawable;
        Object systemService = context.getSystemService("notification");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        o8.V(1);
        a8.r1(o8);
        a8.g();
        String str = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3159y.h(packageManager, "context.packageManager");
            PackageInfo d8 = N4.q.d(packageManager, o8.n(), 0);
            drawable = d8.applicationInfo.loadIcon(context.getPackageManager());
            try {
                str = d8.applicationInfo.loadLabel(context.getPackageManager()).toString();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            drawable = null;
        }
        if (str != null) {
            String string = context.getString(R.string.notification_update_available_title);
            AbstractC3159y.h(string, "context.getString(R.stri…n_update_available_title)");
            String string2 = context.getString(R.string.notification_update_available_message, str);
            AbstractC3159y.h(string2, "context.getString(R.stri…ailable_message, appName)");
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            inboxStyle.setBigContentTitle(string);
            inboxStyle.addLine(string2);
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            AbstractC3159y.h(sb, "append(...)");
            sb.append('\n');
            AbstractC3159y.h(sb, "append(...)");
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            builder.setOnlyAlertOnce(true);
            A(builder);
            builder.setAutoCancel(true);
            if (drawable != null) {
                builder.setLargeIcon(p(drawable));
            }
            builder.setTimeoutAfter(3600000L);
            builder.setOngoing(false);
            builder.setContentText(string2);
            builder.setStyle(inboxStyle);
            Intent intent = new Intent(context, (Class<?>) Updates.class);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            AbstractC3159y.h(create, "create(context)");
            create.addParentStack(Updates.class);
            create.addNextIntent(intent);
            builder.setContentIntent(create.getPendingIntent(0, r()));
            notificationManager.notify(258, builder.build());
            SettingsPreferences.f29323b.M0(context, String.valueOf(System.currentTimeMillis()));
            x(string, String.valueOf(System.currentTimeMillis()), sb.toString(), null, null, context);
        }
    }

    private final void w(Context context) {
        Object systemService = context.getSystemService("notification");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        int b8 = O.f12422l.b(context);
        if (b8 > 0) {
            String string = context.getResources().getString(R.string.app_name);
            AbstractC3159y.h(string, "context.resources.getString(R.string.app_name)");
            String string2 = context.getString(R.string.updates_availables_notification, String.valueOf(b8));
            AbstractC3159y.h(string2, "context.getString(R.stri…atesAvailable.toString())");
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            inboxStyle.setBigContentTitle(string);
            inboxStyle.addLine(string2);
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            AbstractC3159y.h(sb, "append(...)");
            sb.append('\n');
            AbstractC3159y.h(sb, "append(...)");
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            builder.setOnlyAlertOnce(true);
            A(builder);
            builder.setAutoCancel(false);
            builder.setOngoing(false);
            builder.setContentText(string2);
            builder.setStyle(inboxStyle);
            Intent intent = new Intent(context, (Class<?>) Updates.class);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            AbstractC3159y.h(create, "create(context)");
            create.addParentStack(Updates.class);
            create.addNextIntent(intent);
            builder.setContentIntent(create.getPendingIntent(0, r()));
            builder.setNumber(b8);
            notificationManager.notify(258, builder.build());
            SettingsPreferences.f29323b.M0(context, String.valueOf(System.currentTimeMillis()));
            x(string, String.valueOf(System.currentTimeMillis()), sb.toString(), null, null, context);
            return;
        }
        notificationManager.cancel(258);
    }

    private final void x(String str, String str2, String str3, String str4, String str5, Context context) {
        X4.y yVar = new X4.y();
        yVar.m(str);
        yVar.l(str2);
        yVar.k(str3);
        yVar.i(str4);
        yVar.j(str5);
        yVar.h(context);
    }

    private final void z(NotificationCompat.Builder builder, int i8) {
        builder.setOnlyAlertOnce(true);
        A(builder);
        builder.setAutoCancel(false);
        builder.setOngoing(true);
        builder.setProgress(100, i8, false);
    }

    public final boolean a(Context context) {
        AbstractC3159y.i(context, "context");
        if (Build.VERSION.SDK_INT >= 33) {
            if (s(context) && SettingsPreferences.f29323b.b0(context)) {
                return true;
            }
            return false;
        }
        return SettingsPreferences.f29323b.b0(context);
    }

    public final void c(Context context, int i8) {
        AbstractC3159y.i(context, "context");
        Object systemService = context.getSystemService("notification");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(i8);
    }

    public final void d(Context context) {
        AbstractC3159y.i(context, "context");
        c(context, 261);
    }

    public final void e(Context context) {
        AbstractC3159y.i(context, "context");
        c(context, 255);
    }

    public final void f(Context context) {
        AbstractC3159y.i(context, "context");
        c(context, 259);
    }

    public final void g(Context context) {
        AbstractC3159y.i(context, "context");
        c(context, 258);
    }

    public final void h(Context context) {
        StatusBarNotification[] activeNotifications;
        AbstractC3159y.i(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            Object systemService = context.getSystemService("notification");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            Iterator it = a8.R().iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                C1491a activeNotificationDDBB = (C1491a) it.next();
                AbstractC3159y.h(activeNotifications, "activeNotifications");
                int length = activeNotifications.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    if (activeNotificationDDBB.a() == activeNotifications[i8].getId()) {
                        z8 = true;
                        break;
                    }
                    i8++;
                }
                if (!z8) {
                    AbstractC3159y.h(activeNotificationDDBB, "activeNotificationDDBB");
                    a8.l(activeNotificationDDBB);
                }
            }
            a8.g();
        }
    }

    public final void i(Context context) {
        String X7;
        Intent intent;
        CharSequence string;
        int i8;
        AbstractC3159y.i(context, "context");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
        C1505o b8 = DownloadApkWorker.f30002k.b();
        if (b8 != null) {
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            ArrayList c02 = a8.c0();
            a8.g();
            Iterator it = c02.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                C1505o c1505o = (C1505o) it.next();
                if (c1505o.Z() == 0 && !DownloadApkWorker.f30002k.c(c1505o.f())) {
                    i9++;
                }
            }
            String i10 = b8.i();
            if (i10 != null && i10.length() != 0) {
                X7 = b8.i();
            } else {
                X7 = b8.X();
            }
            CharSequence charSequence = context.getResources().getString(R.string.notification_line_downloading) + ' ' + X7 + " (" + b8.Z() + context.getResources().getString(R.string.percent) + ')';
            String str = new N4.g().c((b8.a0() * b8.Z()) / 100) + '/' + new N4.g().c(b8.a0());
            z(builder, b8.Z());
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            inboxStyle.addLine(str);
            if (i9 > 0) {
                Y y8 = Y.f33766a;
                String string2 = context.getString(R.string.x_downloads_in_queue);
                AbstractC3159y.h(string2, "context.getString(R.string.x_downloads_in_queue)");
                String format = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i9)}, 1));
                AbstractC3159y.h(format, "format(...)");
                inboxStyle.addLine(format);
            }
            builder.setStyle(inboxStyle);
            builder.setContentTitle(charSequence);
            Intent intent2 = new Intent(context, (Class<?>) MyDownloads.class);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            AbstractC3159y.h(create, "create(context)");
            create.addParentStack(MyDownloads.class);
            create.addNextIntent(intent2);
            builder.setContentIntent(create.getPendingIntent(0, r()));
            if (DownloadWorker.f30020c.c()) {
                intent = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
                intent.setAction("RESUME");
                string = context.getString(R.string.updates_button_resume);
                AbstractC3159y.h(string, "context.getString(R.string.updates_button_resume)");
                i8 = R.drawable.vector_play_resume;
            } else {
                intent = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
                intent.setAction("PAUSE");
                string = context.getString(R.string.action_pause);
                AbstractC3159y.h(string, "context.getString(R.string.action_pause)");
                i8 = R.drawable.vector_pause;
            }
            builder.addAction(i8, string, PendingIntent.getBroadcast(context, 0, intent, r()));
            Intent intent3 = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
            intent3.setAction("CANCEL");
            intent3.putExtra("download", b8);
            intent3.putExtra("notificationID", 261);
            builder.addAction(R.drawable.core_vector_cross, context.getString(R.string.option_button_cancel), PendingIntent.getBroadcast(context, 0, intent3, r()));
        } else {
            builder.setOnlyAlertOnce(true);
            A(builder);
            builder.setAutoCancel(false);
            builder.setOngoing(true);
            CharSequence string3 = context.getString(R.string.preparing_update_download);
            AbstractC3159y.h(string3, "context.getString(R.stri…reparing_update_download)");
            builder.setContentTitle(string3);
        }
        Object systemService = context.getSystemService("notification");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(261, builder.build());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.content.Context r12, X4.C1505o r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C3335w.j(android.content.Context, X4.o):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C3335w.k(android.content.Context, java.lang.String):void");
    }

    public final void l(Context context, String contentText) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(contentText, "contentText");
        if (a(context) && SettingsPreferences.f29323b.Z(context)) {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            String string = context.getString(R.string.installing);
            AbstractC3159y.h(string, "context.getString(R.string.installing)");
            builder.setContentTitle(string);
            builder.setContentText(contentText);
            builder.setProgress(100, 0, true);
            Object systemService = context.getSystemService("notification");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(255, builder.build());
            x(string, String.valueOf(System.currentTimeMillis()), contentText, null, null, context);
        }
    }

    public final void m(Context context, File file, boolean z8, int i8) {
        boolean z9;
        String str;
        Drawable d8;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(file, "file");
        if (a(context) && new G4.a(context).p()) {
            int i9 = i8 + 260;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(context.getPackageName());
            intent.setDataAndType(new C3323k().t(file, context), "application/vnd.android.package-archive");
            intent.putExtra("notificationId", i9);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            String name = file.getName();
            AbstractC3159y.h(name, "file.name");
            if (g6.n.r(name, ".apk", false, 2, null)) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3159y.h(packageManager, "context.packageManager");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3159y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = N4.q.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        Drawable loadIcon = c8.applicationInfo.loadIcon(context.getPackageManager());
                        AbstractC3159y.h(loadIcon, "pInfoFile.applicationInf…n(context.packageManager)");
                        builder.setLargeIcon(p(loadIcon));
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } else {
                w.a aVar = N4.w.f7281b;
                String name2 = file.getName();
                AbstractC3159y.h(name2, "file.name");
                if (aVar.a(name2) && (d8 = new N4.w().d(file, context)) != null) {
                    builder.setLargeIcon(p(d8));
                }
            }
            String name3 = file.getName();
            builder.setContentTitle(name3);
            if (z8) {
                Y y8 = Y.f33766a;
                String string = context.getString(R.string.notification_installable_found);
                AbstractC3159y.h(string, "context.getString(R.stri…cation_installable_found)");
                String absolutePath2 = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath2, "file.absolutePath");
                String absolutePath3 = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath3, "file.absolutePath");
                String substring = absolutePath2.substring(0, g6.n.X(absolutePath3, "/", 0, false, 6, null));
                AbstractC3159y.h(substring, "substring(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{substring}, 1));
                AbstractC3159y.h(format, "format(...)");
                str = format;
                z9 = true;
            } else {
                Y y9 = Y.f33766a;
                String string2 = context.getString(R.string.notification_installable_to_delete);
                AbstractC3159y.h(string2, "context.getString(R.stri…on_installable_to_delete)");
                String absolutePath4 = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath4, "file.absolutePath");
                String absolutePath5 = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath5, "file.absolutePath");
                String substring2 = absolutePath4.substring(0, g6.n.X(absolutePath5, "/", 0, false, 6, null));
                AbstractC3159y.h(substring2, "substring(...)");
                z9 = true;
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{substring2}, 1));
                AbstractC3159y.h(format2, "format(...)");
                str = format2;
            }
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str));
            builder.setContentText(str);
            builder.setAutoCancel(z9);
            builder.setGroup("com.uptodown.INSTALLABLE_FOUND");
            Intent intent2 = new Intent(context, (Class<?>) InstallerActivity.class);
            intent2.putExtra("realPath", file.getAbsolutePath());
            intent2.putExtra("action", "delete");
            intent2.putExtra("notificationId", i9);
            PendingIntent activity2 = PendingIntent.getActivity(context, i9, intent2, r());
            StringBuilder sb = new StringBuilder();
            if (z8) {
                builder.addAction(R.drawable.vector_user_panel_my_apps, context.getString(R.string.option_button_install), activity);
                builder.setContentIntent(activity);
                sb.append("install");
                sb.append(";");
            }
            builder.addAction(R.drawable.core_vector_cross, context.getString(R.string.option_button_delete), activity2);
            sb.append("delete");
            Object systemService = context.getSystemService("notification");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 24) {
                NotificationCompat.Builder groupSummary = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN").setContentTitle(str).setSmallIcon(R.drawable.vector_uptodown_logo_bag_transp).setGroup("com.uptodown.INSTALLABLE_FOUND").setAutoCancel(true).setGroupSummary(true);
                AbstractC3159y.h(groupSummary, "Builder(context, CHANNEL…   .setGroupSummary(true)");
                notificationManager.notify(5, groupSummary.build());
            }
            notificationManager.notify(i9, builder.build());
            x(name3, String.valueOf(System.currentTimeMillis()), str, sb.toString(), file.getAbsolutePath(), context);
        }
    }

    public final void n(Context context, int i8, String str) {
        int i9;
        String format;
        AbstractC3159y.i(context, "context");
        try {
            if (a(context)) {
                Intent intent = new Intent(context, (Class<?>) SecurityActivity.class);
                intent.setPackage(context.getPackageName());
                if (Build.VERSION.SDK_INT >= 31) {
                    i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i9 = 0;
                }
                PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i9);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
                A(builder);
                builder.setContentIntent(activity);
                if (i8 > 0) {
                    if (i8 == 1 && str != null && str.length() != 0) {
                        Y y8 = Y.f33766a;
                        String string = context.getString(R.string.notification_app_positives_found);
                        AbstractC3159y.h(string, "context.getString(R.stri…tion_app_positives_found)");
                        format = String.format(string, Arrays.copyOf(new Object[]{context.getString(R.string.app_name), str}, 2));
                        AbstractC3159y.h(format, "format(...)");
                        String str2 = format;
                        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str2));
                        builder.setContentText(str2);
                        builder.setAutoCancel(true);
                        Object systemService = context.getSystemService("notification");
                        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService).notify(256, builder.build());
                        x(null, String.valueOf(System.currentTimeMillis()), str2, "positive_apps", null, context);
                    }
                    Y y9 = Y.f33766a;
                    String string2 = context.getString(R.string.notification_apps_positives_found);
                    AbstractC3159y.h(string2, "context.getString(R.stri…ion_apps_positives_found)");
                    format = String.format(string2, Arrays.copyOf(new Object[]{context.getString(R.string.app_name), String.valueOf(i8)}, 2));
                    AbstractC3159y.h(format, "format(...)");
                    String str22 = format;
                    builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str22));
                    builder.setContentText(str22);
                    builder.setAutoCancel(true);
                    Object systemService2 = context.getSystemService("notification");
                    AbstractC3159y.g(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService2).notify(256, builder.build());
                    x(null, String.valueOf(System.currentTimeMillis()), str22, "positive_apps", null, context);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void o(Context context, C1498h appInfo, int i8, Bitmap bitmap, X4.D preRegister) {
        int i9;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(preRegister, "preRegister");
        if (a(context)) {
            int i10 = i8 + 500;
            Intent intent = new Intent(context, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", appInfo);
            if (Build.VERSION.SDK_INT >= 31) {
                i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i9 = 0;
            }
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i9);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            builder.setContentIntent(activity);
            Y y8 = Y.f33766a;
            String string = context.getString(R.string.notification_upcoming_releases);
            AbstractC3159y.h(string, "context.getString(R.stri…cation_upcoming_releases)");
            String format = String.format(string, Arrays.copyOf(new Object[]{appInfo.s0(), context.getString(R.string.app_name)}, 2));
            AbstractC3159y.h(format, "format(...)");
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            }
            builder.setContentIntent(activity);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(format));
            builder.setContentText(format);
            builder.setAutoCancel(true);
            builder.setGroup("com.uptodown.PREREGISTER");
            Object systemService = context.getSystemService("notification");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(i10, builder.build());
            x(null, String.valueOf(System.currentTimeMillis()), format, "preregister", String.valueOf(appInfo.i()), context);
            Bundle bundle = new Bundle();
            bundle.putString("type", "notification_shown");
            new C3330r(context).b("preregister", bundle);
        } else {
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            if (a8.o0(preRegister.b()) == null) {
                a8.M0(preRegister);
            }
            a8.g();
        }
        preRegister.i(context);
    }

    public final boolean s(Context context) {
        AbstractC3159y.i(context, "context");
        if (ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    public final void t(Context context, C1505o c1505o, String str) {
        String str2;
        String str3;
        String str4;
        String string;
        AbstractC3159y.i(context, "context");
        if (a(context) && SettingsPreferences.f29323b.T(context)) {
            String str5 = null;
            if (c1505o != null) {
                str2 = c1505o.i();
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                AbstractC3159y.f(c1505o);
                str5 = c1505o.i();
                AbstractC3159y.f(str5);
            } else {
                if (c1505o != null) {
                    str3 = c1505o.X();
                } else {
                    str3 = null;
                }
                if (str3 != null && str3.length() != 0) {
                    AbstractC3159y.f(c1505o);
                    str5 = c1505o.X();
                    AbstractC3159y.f(str5);
                } else {
                    if (c1505o != null) {
                        str4 = c1505o.Y();
                    } else {
                        str4 = null;
                    }
                    if (str4 != null && str4.length() != 0) {
                        AbstractC3159y.f(c1505o);
                        str5 = c1505o.Y();
                        AbstractC3159y.f(str5);
                    }
                }
            }
            String str6 = str5;
            if (str != null && str.length() != 0) {
                string = context.getString(R.string.descarga_error) + str;
            } else {
                string = context.getString(R.string.descarga_error);
                AbstractC3159y.h(string, "context.getString(R.string.descarga_error)");
            }
            Object systemService = context.getSystemService("notification");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            if (str6 != null && str6.length() != 0) {
                builder.setContentTitle(str6);
            }
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(string));
            builder.setContentText(string);
            builder.setAutoCancel(true);
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            AbstractC3159y.h(create, "create(context)");
            create.addParentStack(MainActivity.class);
            create.addNextIntent(intent);
            builder.setContentIntent(create.getPendingIntent(0, r()));
            Intent intent2 = new Intent(context, (Class<?>) MyDownloads.class);
            TaskStackBuilder create2 = TaskStackBuilder.create(context);
            AbstractC3159y.h(create2, "create(context)");
            create2.addParentStack(MyDownloads.class);
            create2.addNextIntent(intent2);
            builder.setContentIntent(create2.getPendingIntent(0, r()));
            notificationManager.notify(257, builder.build());
            x(str6, String.valueOf(System.currentTimeMillis()), str, null, null, context);
        }
    }

    public final void v(Context context, Uri uri) {
        AbstractC3159y.i(context, "context");
        if (uri != null) {
            String string = context.getString(R.string.app_name);
            AbstractC3159y.h(string, "context.getString(R.string.app_name)");
            String string2 = context.getString(R.string.notification_msg_update_uptodown);
            AbstractC3159y.h(string2, "context.getString(R.stri…tion_msg_update_uptodown)");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(context.getPackageName());
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, r());
            Object systemService = context.getSystemService("notification");
            AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            A(builder);
            builder.setContentTitle(string);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(string2));
            builder.setContentText(string2);
            builder.setAutoCancel(true);
            builder.setContentIntent(activity);
            ((NotificationManager) systemService).notify(259, builder.build());
            x(string, String.valueOf(System.currentTimeMillis()), string2, "update_uptodown", uri.getPath(), context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C3335w.y(android.content.Context):void");
    }
}
