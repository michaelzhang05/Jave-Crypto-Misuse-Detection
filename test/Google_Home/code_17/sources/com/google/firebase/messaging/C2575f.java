package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.AbstractC2573d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q0.AbstractC3828l;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C2575f {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f18476a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18477b;

    /* renamed from: c, reason: collision with root package name */
    private final J f18478c;

    public C2575f(Context context, J j8, ExecutorService executorService) {
        this.f18476a = executorService;
        this.f18477b = context;
        this.f18478c = j8;
    }

    private boolean b() {
        if (((KeyguardManager) this.f18477b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!V.k.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f18477b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private void c(AbstractC2573d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f18477b.getSystemService("notification")).notify(aVar.f18464b, aVar.f18465c, aVar.f18463a.build());
    }

    private F d() {
        F g8 = F.g(this.f18478c.p("gcm.n.image"));
        if (g8 != null) {
            g8.n(this.f18476a);
        }
        return g8;
    }

    private void e(NotificationCompat.Builder builder, F f8) {
        if (f8 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC3828l.b(f8.l(), 5L, TimeUnit.SECONDS);
            builder.setLargeIcon(bitmap);
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            f8.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e8) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e8.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            f8.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f18478c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        F d8 = d();
        AbstractC2573d.a e8 = AbstractC2573d.e(this.f18477b, this.f18478c);
        e(e8.f18463a, d8);
        c(e8);
        return true;
    }
}
