package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import p0.C3732a;
import q0.InterfaceC3821e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    static final long f18510a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f18511b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C3732a f18512c;

    private static void b(Context context) {
        if (f18512c == null) {
            C3732a c3732a = new C3732a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f18512c = c3732a;
            c3732a.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f18511b) {
            try {
                if (f18512c != null && d(intent)) {
                    g(intent, false);
                    f18512c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Context context, n0 n0Var, final Intent intent) {
        synchronized (f18511b) {
            try {
                b(context);
                boolean d8 = d(intent);
                g(intent, true);
                if (!d8) {
                    f18512c.a(f18510a);
                }
                n0Var.c(intent).c(new InterfaceC3821e() { // from class: com.google.firebase.messaging.h0
                    @Override // q0.InterfaceC3821e
                    public final void a(Task task) {
                        i0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void g(Intent intent, boolean z8) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName h(Context context, Intent intent) {
        synchronized (f18511b) {
            try {
                b(context);
                boolean d8 = d(intent);
                g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d8) {
                    f18512c.a(f18510a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
