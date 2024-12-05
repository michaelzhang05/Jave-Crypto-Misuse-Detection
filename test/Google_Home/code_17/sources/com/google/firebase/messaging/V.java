package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import q0.InterfaceC3818b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18410a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f18411b = new ArrayMap();

    /* loaded from: classes4.dex */
    interface a {
        Task start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(Executor executor) {
        this.f18410a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task c(String str, Task task) {
        synchronized (this) {
            this.f18411b.remove(str);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Task b(final String str, a aVar) {
        Task task = (Task) this.f18411b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task h8 = aVar.start().h(this.f18410a, new InterfaceC3818b() { // from class: com.google.firebase.messaging.U
            @Override // q0.InterfaceC3818b
            public final Object a(Task task2) {
                Task c8;
                c8 = V.this.c(str, task2);
                return c8;
            }
        });
        this.f18411b.put(str, h8);
        return h8;
    }
}
