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
/* loaded from: classes.dex */
public class c1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f5875f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f5876g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f5877h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f5878a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f5879b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f5880c;

    /* renamed from: d, reason: collision with root package name */
    private final b1 f5881d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5882e;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private c1 f5883a;

        public a(c1 c1Var) {
            this.f5883a = c1Var;
        }

        public void a() {
            if (c1.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            c1.this.f5878a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            c1 c1Var = this.f5883a;
            if (c1Var == null) {
                return;
            }
            if (c1Var.i()) {
                if (c1.b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f5883a.f5881d.l(this.f5883a, 0L);
                context.unregisterReceiver(this);
                this.f5883a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(b1 b1Var, Context context, g0 g0Var, long j6) {
        this.f5881d = b1Var;
        this.f5878a = context;
        this.f5882e = j6;
        this.f5879b = g0Var;
        this.f5880c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* synthetic */ boolean b() {
        return j();
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f5875f) {
            Boolean bool = f5877h;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f5877h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z5 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z5 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z5;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f5875f) {
            Boolean bool = f5876g;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f5876g = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z5;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f5878a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z5 = activeNetworkInfo.isConnected();
        }
        return z5;
    }

    private static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f5878a)) {
            this.f5880c.acquire(e.f5893a);
        }
        try {
            try {
                try {
                    this.f5881d.m(true);
                } catch (Throwable th) {
                    if (h(this.f5878a)) {
                        try {
                            this.f5880c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e6.getMessage());
                this.f5881d.m(false);
                if (!h(this.f5878a)) {
                    return;
                } else {
                    wakeLock = this.f5880c;
                }
            }
            if (!this.f5879b.g()) {
                this.f5881d.m(false);
                if (h(this.f5878a)) {
                    try {
                        this.f5880c.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (f(this.f5878a) && !i()) {
                new a(this).a();
                if (h(this.f5878a)) {
                    try {
                        this.f5880c.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f5881d.p()) {
                this.f5881d.m(false);
            } else {
                this.f5881d.q(this.f5882e);
            }
            if (h(this.f5878a)) {
                wakeLock = this.f5880c;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
