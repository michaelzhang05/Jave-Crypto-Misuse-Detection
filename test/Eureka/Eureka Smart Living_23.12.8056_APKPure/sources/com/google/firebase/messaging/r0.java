package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5977a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5978b = new l.a();

    /* loaded from: classes.dex */
    interface a {
        l2.i start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(Executor executor) {
        this.f5977a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ l2.i c(String str, l2.i iVar) {
        synchronized (this) {
            this.f5978b.remove(str);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized l2.i b(final String str, a aVar) {
        l2.i iVar = (l2.i) this.f5978b.get(str);
        if (iVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return iVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        l2.i g6 = aVar.start().g(this.f5977a, new l2.a() { // from class: com.google.firebase.messaging.q0
            @Override // l2.a
            public final Object a(l2.i iVar2) {
                l2.i c6;
                c6 = r0.this.c(str, iVar2);
                return c6;
            }
        });
        this.f5978b.put(str, g6);
        return g6;
    }
}
