package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.j1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g1 extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f5908a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        l2.i a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(a aVar) {
        this.f5908a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final j1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f5908a.a(aVar.f5930a).b(new androidx.profileinstaller.g(), new l2.d() { // from class: com.google.firebase.messaging.f1
            @Override // l2.d
            public final void a(l2.i iVar) {
                j1.a.this.d();
            }
        });
    }
}
