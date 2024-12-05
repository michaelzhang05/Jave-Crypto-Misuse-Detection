package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import q0.C3643a;
import r0.InterfaceC3674e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    static final long f17462a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f17463b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C3643a f17464c;

    private static void b(Context context) {
        if (f17464c == null) {
            C3643a c3643a = new C3643a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f17464c = c3643a;
            c3643a.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f17463b) {
            try {
                if (f17464c != null && d(intent)) {
                    g(intent, false);
                    f17464c.c();
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
    public static void f(Context context, k0 k0Var, final Intent intent) {
        synchronized (f17463b) {
            try {
                b(context);
                boolean d8 = d(intent);
                g(intent, true);
                if (!d8) {
                    f17464c.a(f17462a);
                }
                k0Var.c(intent).c(new InterfaceC3674e() { // from class: com.google.firebase.messaging.e0
                    @Override // r0.InterfaceC3674e
                    public final void a(Task task) {
                        f0.c(intent);
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
        synchronized (f17463b) {
            try {
                b(context);
                boolean d8 = d(intent);
                g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d8) {
                    f17464c.a(f17462a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
