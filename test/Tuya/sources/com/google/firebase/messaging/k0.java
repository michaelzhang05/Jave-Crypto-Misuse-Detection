package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.k0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r0.C3679j;
import r0.InterfaceC3674e;

/* loaded from: classes3.dex */
class k0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17485a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f17486b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f17487c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f17488d;

    /* renamed from: e, reason: collision with root package name */
    private h0 f17489e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17490f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f17491a;

        /* renamed from: b, reason: collision with root package name */
        private final C3679j f17492b = new C3679j();

        a(Intent intent) {
            this.f17491a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f17491a.getAction() + " finishing.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.i0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.a.this.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().b(scheduledExecutorService, new InterfaceC3674e() { // from class: com.google.firebase.messaging.j0
                @Override // r0.InterfaceC3674e
                public final void a(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f17492b.e(null);
        }

        Task e() {
            return this.f17492b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new X.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f17488d.isEmpty()) {
            ((a) this.f17488d.poll()).d();
        }
    }

    private synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f17488d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                h0 h0Var = this.f17489e;
                if (h0Var != null && h0Var.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f17489e.c((a) this.f17488d.poll());
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
            sb.append(!this.f17490f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f17490f) {
            return;
        }
        this.f17490f = true;
        try {
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e8);
        }
        if (V.b.b().a(this.f17485a, this.f17486b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f17490f = false;
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
            aVar.c(this.f17487c);
            this.f17488d.add(aVar);
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
            this.f17490f = false;
            if (!(iBinder instanceof h0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                a();
                return;
            }
            this.f17489e = (h0) iBinder;
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

    k0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f17488d = new ArrayDeque();
        this.f17490f = false;
        Context applicationContext = context.getApplicationContext();
        this.f17485a = applicationContext;
        this.f17486b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f17487c = scheduledExecutorService;
    }
}
