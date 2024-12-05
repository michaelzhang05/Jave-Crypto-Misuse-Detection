package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import r0.InterfaceC3671b;

/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2389n {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f17493c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static k0 f17494d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17495a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f17496b = new androidx.profileinstaller.c();

    public C2389n(Context context) {
        this.f17495a = context;
    }

    private static Task e(Context context, Intent intent, boolean z8) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        k0 f8 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (z8) {
            if (U.b().e(context)) {
                f0.f(context, f8, intent);
            } else {
                f8.c(intent);
            }
            return r0.l.e(-1);
        }
        return f8.c(intent).f(new androidx.profileinstaller.c(), new InterfaceC3671b() { // from class: com.google.firebase.messaging.m
            @Override // r0.InterfaceC3671b
            public final Object a(Task task) {
                Integer g8;
                g8 = C2389n.g(task);
                return g8;
            }
        });
    }

    private static k0 f(Context context, String str) {
        k0 k0Var;
        synchronized (f17493c) {
            try {
                if (f17494d == null) {
                    f17494d = new k0(context, str);
                }
                k0Var = f17494d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(Task task) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(U.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(Task task) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task j(Context context, Intent intent, boolean z8, Task task) {
        if (W.k.h() && ((Integer) task.j()).intValue() == 402) {
            return e(context, intent, z8).f(new androidx.profileinstaller.c(), new InterfaceC3671b() { // from class: com.google.firebase.messaging.l
                @Override // r0.InterfaceC3671b
                public final Object a(Task task2) {
                    Integer i8;
                    i8 = C2389n.i(task2);
                    return i8;
                }
            });
        }
        return task;
    }

    public Task k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f17495a, intent);
    }

    public Task l(final Context context, final Intent intent) {
        boolean z8;
        final boolean z9 = false;
        if (W.k.h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z9 = true;
        }
        if (z8 && !z9) {
            return e(context, intent, z9);
        }
        return r0.l.c(this.f17496b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h8;
                h8 = C2389n.h(context, intent);
                return h8;
            }
        }).h(this.f17496b, new InterfaceC3671b() { // from class: com.google.firebase.messaging.k
            @Override // r0.InterfaceC3671b
            public final Object a(Task task) {
                Task j8;
                j8 = C2389n.j(context, intent, z9, task);
                return j8;
            }
        });
    }
}
