package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f6009a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f6010b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f6011c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f6012d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a2.a("firebase-iid-executor"));

    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private x0 f6013a;

        public a(x0 x0Var) {
            this.f6013a = x0Var;
        }

        public void a() {
            if (x0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f6013a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            x0 x0Var = this.f6013a;
            if (x0Var != null && x0Var.d()) {
                if (x0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f6013a.f6011c.l(this.f6013a, 0L);
                this.f6013a.b().unregisterReceiver(this);
                this.f6013a = null;
            }
        }
    }

    public x0(FirebaseMessaging firebaseMessaging, long j6) {
        this.f6011c = firebaseMessaging;
        this.f6009a = j6;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6010b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    Context b() {
        return this.f6011c.m();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() {
        String str;
        try {
            if (this.f6011c.j() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e6) {
            if (b0.h(e6.getMessage())) {
                str = "Token retrieval failed: " + e6.getMessage() + ". Will retry token retrieval";
            } else {
                if (e6.getMessage() != null) {
                    throw e6;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (t0.b().e(b())) {
            this.f6010b.acquire();
        }
        try {
            try {
                this.f6011c.E(true);
            } catch (IOException e6) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e6.getMessage() + ". Won't retry the operation.");
                this.f6011c.E(false);
                if (!t0.b().e(b())) {
                    return;
                }
            }
            if (!this.f6011c.v()) {
                this.f6011c.E(false);
                if (t0.b().e(b())) {
                    this.f6010b.release();
                    return;
                }
                return;
            }
            if (t0.b().d(b()) && !d()) {
                new a(this).a();
                if (t0.b().e(b())) {
                    this.f6010b.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f6011c.E(false);
            } else {
                this.f6011c.H(this.f6009a);
            }
            if (!t0.b().e(b())) {
                return;
            }
            this.f6010b.release();
        } catch (Throwable th) {
            if (t0.b().e(b())) {
                this.f6010b.release();
            }
            throw th;
        }
    }
}
