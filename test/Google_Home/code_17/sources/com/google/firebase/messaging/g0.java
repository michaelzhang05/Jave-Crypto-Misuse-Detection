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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class g0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f18490f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f18491g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f18492h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f18493a;

    /* renamed from: b, reason: collision with root package name */
    private final I f18494b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f18495c;

    /* renamed from: d, reason: collision with root package name */
    private final f0 f18496d;

    /* renamed from: e, reason: collision with root package name */
    private final long f18497e;

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private g0 f18498a;

        public a(g0 g0Var) {
            this.f18498a = g0Var;
        }

        public void a() {
            if (g0.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            g0.this.f18493a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                g0 g0Var = this.f18498a;
                if (g0Var == null) {
                    return;
                }
                if (!g0Var.i()) {
                    return;
                }
                if (g0.b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f18498a.f18496d.l(this.f18498a, 0L);
                context.unregisterReceiver(this);
                this.f18498a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(f0 f0Var, Context context, I i8, long j8) {
        this.f18496d = f0Var;
        this.f18493a = context;
        this.f18497e = j8;
        this.f18494b = i8;
        this.f18495c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* synthetic */ boolean b() {
        return j();
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f18490f) {
            try {
                Boolean bool = f18492h;
                if (bool == null) {
                    booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f18492h = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        boolean z8;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z8;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f18490f) {
            try {
                Boolean bool = f18491g;
                if (bool == null) {
                    booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f18491g = valueOf;
                booleanValue2 = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo networkInfo;
        boolean z8;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f18493a.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    z8 = true;
                }
            }
            z8 = false;
        } catch (Throwable th) {
            throw th;
        }
        return z8;
    }

    private static boolean j() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f18493a)) {
            this.f18495c.acquire(AbstractC2574e.f18470a);
        }
        try {
            try {
                try {
                    this.f18496d.m(true);
                } catch (Throwable th) {
                    if (h(this.f18493a)) {
                        try {
                            this.f18495c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e8.getMessage());
                this.f18496d.m(false);
                if (h(this.f18493a)) {
                    wakeLock = this.f18495c;
                } else {
                    return;
                }
            }
            if (!this.f18494b.g()) {
                this.f18496d.m(false);
                if (h(this.f18493a)) {
                    try {
                        this.f18495c.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (f(this.f18493a) && !i()) {
                new a(this).a();
                if (h(this.f18493a)) {
                    try {
                        this.f18495c.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f18496d.p()) {
                this.f18496d.m(false);
            } else {
                this.f18496d.q(this.f18497e);
            }
            if (h(this.f18493a)) {
                wakeLock = this.f18495c;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
