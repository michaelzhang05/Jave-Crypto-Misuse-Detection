package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    static final long f5894a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5895b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static k2.a f5896c;

    private static void b(Context context) {
        if (f5896c == null) {
            k2.a aVar = new k2.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f5896c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f5895b) {
            if (f5896c != null && d(intent)) {
                g(intent, false);
                f5896c.c();
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Context context, j1 j1Var, final Intent intent) {
        synchronized (f5895b) {
            b(context);
            boolean d6 = d(intent);
            g(intent, true);
            if (!d6) {
                f5896c.a(f5894a);
            }
            j1Var.c(intent).c(new l2.d() { // from class: com.google.firebase.messaging.d1
                @Override // l2.d
                public final void a(l2.i iVar) {
                    e1.c(intent);
                }
            });
        }
    }

    private static void g(Intent intent, boolean z5) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName h(Context context, Intent intent) {
        synchronized (f5895b) {
            b(context);
            boolean d6 = d(intent);
            g(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!d6) {
                f5896c.a(f5894a);
            }
            return startService;
        }
    }
}
