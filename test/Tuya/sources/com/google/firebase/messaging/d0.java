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
/* loaded from: classes3.dex */
public class d0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f17447f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static Boolean f17448g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f17449h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17450a;

    /* renamed from: b, reason: collision with root package name */
    private final G f17451b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f17452c;

    /* renamed from: d, reason: collision with root package name */
    private final c0 f17453d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17454e;

    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private d0 f17455a;

        public a(d0 d0Var) {
            this.f17455a = d0Var;
        }

        public void a() {
            if (d0.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            d0.this.f17450a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                d0 d0Var = this.f17455a;
                if (d0Var == null) {
                    return;
                }
                if (!d0Var.i()) {
                    return;
                }
                if (d0.b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f17455a.f17453d.l(this.f17455a, 0L);
                context.unregisterReceiver(this);
                this.f17455a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(c0 c0Var, Context context, G g8, long j8) {
        this.f17453d = c0Var;
        this.f17450a = context;
        this.f17454e = j8;
        this.f17451b = g8;
        this.f17452c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
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
        synchronized (f17447f) {
            try {
                Boolean bool = f17449h;
                if (bool == null) {
                    booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f17449h = valueOf;
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
        synchronized (f17447f) {
            try {
                Boolean bool = f17448g;
                if (bool == null) {
                    booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    booleanValue = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(booleanValue);
                f17448g = valueOf;
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
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f17450a.getSystemService("connectivity");
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
        if (h(this.f17450a)) {
            this.f17452c.acquire(AbstractC2380e.f17457a);
        }
        try {
            try {
                try {
                    this.f17453d.m(true);
                } catch (Throwable th) {
                    if (h(this.f17450a)) {
                        try {
                            this.f17452c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e8.getMessage());
                this.f17453d.m(false);
                if (h(this.f17450a)) {
                    wakeLock = this.f17452c;
                } else {
                    return;
                }
            }
            if (!this.f17451b.g()) {
                this.f17453d.m(false);
                if (h(this.f17450a)) {
                    try {
                        this.f17452c.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (f(this.f17450a) && !i()) {
                new a(this).a();
                if (h(this.f17450a)) {
                    try {
                        this.f17452c.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f17453d.p()) {
                this.f17453d.m(false);
            } else {
                this.f17453d.q(this.f17454e);
            }
            if (h(this.f17450a)) {
                wakeLock = this.f17452c;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
