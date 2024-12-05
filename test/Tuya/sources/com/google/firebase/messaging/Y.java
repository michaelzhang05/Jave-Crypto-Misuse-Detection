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
/* loaded from: classes3.dex */
public class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f17393a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f17394b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f17395c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f17396d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new X.a("firebase-iid-executor"));

    /* loaded from: classes3.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private Y f17397a;

        public a(Y y8) {
            this.f17397a = y8;
        }

        public void a() {
            if (Y.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f17397a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Y y8 = this.f17397a;
            if (y8 == null || !y8.d()) {
                return;
            }
            if (Y.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f17397a.f17395c.j(this.f17397a, 0L);
            this.f17397a.b().unregisterReceiver(this);
            this.f17397a = null;
        }
    }

    public Y(FirebaseMessaging firebaseMessaging, long j8) {
        this.f17395c = firebaseMessaging;
        this.f17393a = j8;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f17394b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    Context b() {
        return this.f17395c.k();
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
            if (this.f17395c.i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
            return true;
        } catch (IOException e8) {
            if (B.g(e8.getMessage())) {
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
        if (U.b().e(b())) {
            this.f17394b.acquire();
        }
        try {
            try {
                this.f17395c.A(true);
            } catch (IOException e8) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e8.getMessage() + ". Won't retry the operation.");
                this.f17395c.A(false);
                if (!U.b().e(b())) {
                    return;
                }
            }
            if (!this.f17395c.t()) {
                this.f17395c.A(false);
                if (U.b().e(b())) {
                    this.f17394b.release();
                    return;
                }
                return;
            }
            if (U.b().d(b()) && !d()) {
                new a(this).a();
                if (U.b().e(b())) {
                    this.f17394b.release();
                    return;
                }
                return;
            }
            if (e()) {
                this.f17395c.A(false);
            } else {
                this.f17395c.D(this.f17393a);
            }
            if (!U.b().e(b())) {
                return;
            }
            this.f17394b.release();
        } catch (Throwable th) {
            if (U.b().e(b())) {
                this.f17394b.release();
            }
            throw th;
        }
    }
}
