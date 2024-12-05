package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.k0;
import r0.InterfaceC3674e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class h0 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f17471a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface a {
        Task a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(a aVar) {
        this.f17471a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final k0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f17471a.a(aVar.f17491a).b(new androidx.profileinstaller.c(), new InterfaceC3674e() { // from class: com.google.firebase.messaging.g0
                @Override // r0.InterfaceC3674e
                public final void a(Task task) {
                    k0.a.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
