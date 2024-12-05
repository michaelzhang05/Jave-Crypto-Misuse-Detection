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
import com.google.firebase.messaging.AbstractC2379d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2381f {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f17459a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17460b;

    /* renamed from: c, reason: collision with root package name */
    private final H f17461c;

    public C2381f(Context context, H h8, ExecutorService executorService) {
        this.f17459a = executorService;
        this.f17460b = context;
        this.f17461c = h8;
    }

    private boolean b() {
        if (((KeyguardManager) this.f17460b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!W.k.f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f17460b.getSystemService("activity")).getRunningAppProcesses();
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

    private void c(AbstractC2379d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f17460b.getSystemService("notification")).notify(aVar.f17445b, aVar.f17446c, aVar.f17444a.build());
    }

    private D d() {
        D f8 = D.f(this.f17461c.p("gcm.n.image"));
        if (f8 != null) {
            f8.l(this.f17459a);
        }
        return f8;
    }

    private void e(NotificationCompat.Builder builder, D d8) {
        if (d8 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) r0.l.b(d8.g(), 5L, TimeUnit.SECONDS);
            builder.setLargeIcon(bitmap);
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            d8.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e8) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e8.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            d8.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f17461c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        D d8 = d();
        AbstractC2379d.a e8 = AbstractC2379d.e(this.f17460b, this.f17461c);
        e(e8.f17444a, d8);
        c(e8);
        return true;
    }
}
