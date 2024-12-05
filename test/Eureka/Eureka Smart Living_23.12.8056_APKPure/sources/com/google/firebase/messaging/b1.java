package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: i, reason: collision with root package name */
    private static final long f5864i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    private final Context f5865a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f5866b;

    /* renamed from: c, reason: collision with root package name */
    private final b0 f5867c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f5868d;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f5870f;

    /* renamed from: h, reason: collision with root package name */
    private final z0 f5872h;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5869e = new l.a();

    /* renamed from: g, reason: collision with root package name */
    private boolean f5871g = false;

    private b1(FirebaseMessaging firebaseMessaging, g0 g0Var, z0 z0Var, b0 b0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5868d = firebaseMessaging;
        this.f5866b = g0Var;
        this.f5872h = z0Var;
        this.f5867c = b0Var;
        this.f5865a = context;
        this.f5870f = scheduledExecutorService;
    }

    private static void b(l2.i iVar) {
        try {
            l2.l.b(iVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            e = e6;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e7);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e8) {
            e = e8;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void c(String str) {
        b(this.f5867c.l(this.f5868d.j(), str));
    }

    private void d(String str) {
        b(this.f5867c.m(this.f5868d.j(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l2.i e(final FirebaseMessaging firebaseMessaging, final g0 g0Var, final b0 b0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return l2.l.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.a1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b1 i6;
                i6 = b1.i(context, scheduledExecutorService, firebaseMessaging, g0Var, b0Var);
                return i6;
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b1 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, g0 g0Var, b0 b0Var) {
        return new b1(firebaseMessaging, g0Var, z0.a(context, scheduledExecutorService), b0Var, context, scheduledExecutorService);
    }

    private void j(y0 y0Var) {
        synchronized (this.f5869e) {
            String e6 = y0Var.e();
            if (this.f5869e.containsKey(e6)) {
                ArrayDeque arrayDeque = (ArrayDeque) this.f5869e.get(e6);
                l2.j jVar = (l2.j) arrayDeque.poll();
                if (jVar != null) {
                    jVar.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f5869e.remove(e6);
                }
            }
        }
    }

    private void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    boolean f() {
        return this.f5872h.b() != null;
    }

    synchronized boolean h() {
        return this.f5871g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: IOException -> 0x009d, TryCatch #0 {IOException -> 0x009d, blocks: (B:3:0x0003, B:12:0x0030, B:14:0x0036, B:15:0x004c, B:19:0x0050, B:21:0x005d, B:22:0x0076, B:24:0x0083, B:25:0x0015, B:28:0x001f), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean k(com.google.firebase.messaging.y0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> L9d
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L9d
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L1f
            r4 = 85
            if (r3 == r4) goto L15
            goto L29
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L29
            r2 = 1
            goto L2a
        L1f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L29
            r2 = 0
            goto L2a
        L29:
            r2 = -1
        L2a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L76
            if (r2 == r5) goto L50
            boolean r2 = g()     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d
            r2.<init>()     // Catch: java.io.IOException -> L9d
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L9d
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L9d
        L4c:
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L9d
            goto L9c
        L50:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L9d
            r6.d(r2)     // Catch: java.io.IOException -> L9d
            boolean r2 = g()     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d
            r2.<init>()     // Catch: java.io.IOException -> L9d
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L9d
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            r2.append(r3)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L9d
            goto L4c
        L76:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L9d
            r6.c(r2)     // Catch: java.io.IOException -> L9d
            boolean r2 = g()     // Catch: java.io.IOException -> L9d
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9d
            r2.<init>()     // Catch: java.io.IOException -> L9d
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L9d
            r2.append(r7)     // Catch: java.io.IOException -> L9d
            r2.append(r3)     // Catch: java.io.IOException -> L9d
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L9d
            goto L4c
        L9c:
            return r5
        L9d:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lb7
            goto Lc4
        Lb7:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lc3
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
        Lbf:
            android.util.Log.e(r0, r7)
            return r1
        Lc3:
            throw r7
        Lc4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            goto Lbf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.b1.k(com.google.firebase.messaging.y0):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j6) {
        this.f5870f.schedule(runnable, j6, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void m(boolean z5) {
        this.f5871g = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        if (f()) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (g() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.z0 r0 = r2.f5872h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.y0 r0 = r0.b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.z0 r1 = r2.f5872h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.b1.p():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(long j6) {
        l(new c1(this, this.f5865a, this.f5866b, Math.min(Math.max(30L, 2 * j6), f5864i)), j6);
        m(true);
    }
}
