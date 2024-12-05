package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.t;
import com.google.firebase.messaging.d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f5897a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5898b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f5899c;

    public f(Context context, h0 h0Var, ExecutorService executorService) {
        this.f5897a = executorService;
        this.f5898b = context;
        this.f5899c = h0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f5898b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!z1.i.e()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f5898b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f5898b.getSystemService("notification")).notify(aVar.f5887b, aVar.f5888c, aVar.f5886a.b());
    }

    private d0 d() {
        d0 D = d0.D(this.f5899c.p("gcm.n.image"));
        if (D != null) {
            D.I(this.f5897a);
        }
        return D;
    }

    private void e(t.e eVar, d0 d0Var) {
        if (d0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) l2.l.b(d0Var.G(), 5L, TimeUnit.SECONDS);
            eVar.o(bitmap);
            eVar.w(new t.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            d0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e6) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e6.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            d0Var.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f5899c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        d0 d6 = d();
        d.a e6 = d.e(this.f5898b, this.f5899c);
        e(e6.f5886a, d6);
        c(e6);
        return true;
    }
}
