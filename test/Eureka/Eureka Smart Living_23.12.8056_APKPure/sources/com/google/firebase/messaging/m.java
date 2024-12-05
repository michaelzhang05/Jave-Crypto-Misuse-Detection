package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f5937c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static j1 f5938d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f5939a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5940b = new androidx.profileinstaller.g();

    public m(Context context) {
        this.f5939a = context;
    }

    private static l2.i d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (t0.b().e(context)) {
            e1.f(context, e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            e(context, "com.google.firebase.MESSAGING_EVENT").c(intent);
        }
        return l2.l.e(-1);
    }

    private static j1 e(Context context, String str) {
        j1 j1Var;
        synchronized (f5937c) {
            if (f5938d == null) {
                f5938d = new j1(context, str);
            }
            j1Var = f5938d;
        }
        return j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer f(Context context, Intent intent) {
        return Integer.valueOf(t0.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(l2.i iVar) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l2.i h(Context context, Intent intent, l2.i iVar) {
        return (z1.i.g() && ((Integer) iVar.i()).intValue() == 402) ? d(context, intent).f(new androidx.profileinstaller.g(), new l2.a() { // from class: com.google.firebase.messaging.l
            @Override // l2.a
            public final Object a(l2.i iVar2) {
                Integer g6;
                g6 = m.g(iVar2);
                return g6;
            }
        }) : iVar;
    }

    public l2.i i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return j(this.f5939a, intent);
    }

    public l2.i j(final Context context, final Intent intent) {
        return (!(z1.i.g() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? l2.l.c(this.f5940b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f6;
                f6 = m.f(context, intent);
                return f6;
            }
        }).g(this.f5940b, new l2.a() { // from class: com.google.firebase.messaging.k
            @Override // l2.a
            public final Object a(l2.i iVar) {
                l2.i h6;
                h6 = m.h(context, intent, iVar);
                return h6;
            }
        }) : d(context, intent);
    }
}
