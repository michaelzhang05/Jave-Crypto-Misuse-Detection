package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.j1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class j1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5924a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f5925b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f5926c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f5927d;

    /* renamed from: e, reason: collision with root package name */
    private g1 f5928e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5929f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f5930a;

        /* renamed from: b, reason: collision with root package name */
        private final l2.j f5931b = new l2.j();

        a(Intent intent) {
            this.f5930a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f5930a.getAction() + " Releasing WakeLock.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.h1
                @Override // java.lang.Runnable
                public final void run() {
                    j1.a.this.f();
                }
            }, (this.f5930a.getFlags() & 268435456) != 0 ? e1.f5894a : 9000L, TimeUnit.MILLISECONDS);
            e().b(scheduledExecutorService, new l2.d() { // from class: com.google.firebase.messaging.i1
                @Override // l2.d
                public final void a(l2.i iVar) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f5931b.e(null);
        }

        l2.i e() {
            return this.f5931b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new a2.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f5927d.isEmpty()) {
            ((a) this.f5927d.poll()).d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f5927d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            g1 g1Var = this.f5928e;
            if (g1Var == null || !g1Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f5928e.c((a) this.f5927d.poll());
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f5929f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f5929f) {
            return;
        }
        this.f5929f = true;
        try {
        } catch (SecurityException e6) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e6);
        }
        if (y1.b.b().a(this.f5924a, this.f5925b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f5929f = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized l2.i c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f5926c);
        this.f5927d.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f5929f = false;
        if (iBinder instanceof g1) {
            this.f5928e = (g1) iBinder;
            b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    j1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f5927d = new ArrayDeque();
        this.f5929f = false;
        Context applicationContext = context.getApplicationContext();
        this.f5924a = applicationContext;
        this.f5925b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f5926c = scheduledExecutorService;
    }
}
