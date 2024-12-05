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
/* loaded from: classes4.dex */
public class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f18453a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f18454b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f18455c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f18456d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W.a("firebase-iid-executor"));

    /* loaded from: classes4.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private b0 f18457a;

        public a(b0 b0Var) {
            this.f18457a = b0Var;
        }

        public void a() {
            if (b0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f18457a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            b0 b0Var = this.f18457a;
            if (b0Var == null || !b0Var.d()) {
                return;
            }
            if (b0.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f18457a.f18455c.l(this.f18457a, 0L);
            this.f18457a.b().unregisterReceiver(this);
            this.f18457a = null;
        }
    }

    public b0(FirebaseMessaging firebaseMessaging, long j8) {
        this.f18455c = firebaseMessaging;
        this.f18453a = j8;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f18454b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    Context b() {
        return this.f18455c.m();
    }

    boolean d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    boolean e() {
        try {
            if (this.f18455c.k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e8) {
            if (D.h(e8.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e8.getMessage() + ". Will retry token retrieval");
                return false;
            }
            if (e8.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e8;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (X.b().e(b())) {
            this.f18454b.acquire();
        }
        try {
            try {
                this.f18455c.G(true);
            } catch (IOException e8) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e8.getMessage() + ". Won't retry the operation.");
                this.f18455c.G(false);
                if (!X.b().e(b())) {
                    return;
                }
            }
            if (!this.f18455c.x()) {
                this.f18455c.G(false);
                if (X.b().e(b())) {
                    this.f18454b.release();
                    return;
                }
                return;
            }
            if (X.b().d(b()) && !d()) {
                new a(this).a();
                if (X.b().e(b())) {
                    this.f18454b.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f18455c.G(false);
            } else {
                this.f18455c.K(this.f18453a);
            }
            if (!X.b().e(b())) {
                return;
            }
            this.f18454b.release();
        } catch (Throwable th) {
            if (X.b().e(b())) {
                this.f18454b.release();
            }
            throw th;
        }
    }
}
