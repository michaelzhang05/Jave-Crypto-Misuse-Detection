package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import r0.InterfaceC3671b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class S {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f17373a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f17374b = new ArrayMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface a {
        Task start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(Executor executor) {
        this.f17373a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task c(String str, Task task) {
        synchronized (this) {
            this.f17374b.remove(str);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Task b(final String str, a aVar) {
        Task task = (Task) this.f17374b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task h8 = aVar.start().h(this.f17373a, new InterfaceC3671b() { // from class: com.google.firebase.messaging.Q
            @Override // r0.InterfaceC3671b
            public final Object a(Task task2) {
                Task c8;
                c8 = S.this.c(str, task2);
                return c8;
            }
        });
        this.f17374b.put(str, h8);
        return h8;
    }
}
