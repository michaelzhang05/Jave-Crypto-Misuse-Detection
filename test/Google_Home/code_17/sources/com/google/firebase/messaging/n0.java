package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.n0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q0.C3826j;
import q0.InterfaceC3821e;

/* loaded from: classes4.dex */
class n0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18526a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f18527b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f18528c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f18529d;

    /* renamed from: e, reason: collision with root package name */
    private k0 f18530e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18531f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f18532a;

        /* renamed from: b, reason: collision with root package name */
        private final C3826j f18533b = new C3826j();

        a(Intent intent) {
            this.f18532a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f18532a.getAction() + " finishing.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.l0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.this.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().b(scheduledExecutorService, new InterfaceC3821e() { // from class: com.google.firebase.messaging.m0
                @Override // q0.InterfaceC3821e
                public final void a(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f18533b.e(null);
        }

        Task e() {
            return this.f18533b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new W.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f18529d.isEmpty()) {
            ((a) this.f18529d.poll()).d();
        }
    }

    private synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f18529d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                k0 k0Var = this.f18530e;
                if (k0Var != null && k0Var.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f18530e.c((a) this.f18529d.poll());
                } else {
                    d();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f18531f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f18531f) {
            return;
        }
        this.f18531f = true;
        try {
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e8);
        }
        if (U.b.b().a(this.f18526a, this.f18527b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f18531f = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Task c(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f18528c);
            this.f18529d.add(aVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f18531f = false;
            if (!(iBinder instanceof k0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                a();
                return;
            }
            this.f18530e = (k0) iBinder;
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    n0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f18529d = new ArrayDeque();
        this.f18531f = false;
        Context applicationContext = context.getApplicationContext();
        this.f18526a = applicationContext;
        this.f18527b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f18528c = scheduledExecutorService;
    }
}
