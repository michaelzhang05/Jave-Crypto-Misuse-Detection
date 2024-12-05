package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.g1;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class i extends Service {

    /* renamed from: b, reason: collision with root package name */
    private Binder f5915b;

    /* renamed from: d, reason: collision with root package name */
    private int f5917d;

    /* renamed from: a, reason: collision with root package name */
    final ExecutorService f5914a = n.d();

    /* renamed from: c, reason: collision with root package name */
    private final Object f5916c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private int f5918e = 0;

    /* loaded from: classes.dex */
    class a implements g1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.g1.a
        public l2.i a(Intent intent) {
            return i.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            e1.c(intent);
        }
        synchronized (this.f5916c) {
            int i6 = this.f5918e - 1;
            this.f5918e = i6;
            if (i6 == 0) {
                k(this.f5917d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, l2.i iVar) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, l2.j jVar) {
        try {
            f(intent);
        } finally {
            jVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l2.i j(final Intent intent) {
        if (g(intent)) {
            return l2.l.e(null);
        }
        final l2.j jVar = new l2.j();
        this.f5914a.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.i(intent, jVar);
            }
        });
        return jVar.a();
    }

    protected abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i6) {
        return stopSelfResult(i6);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f5915b == null) {
            this.f5915b = new g1(new a());
        }
        return this.f5915b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f5914a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i6, int i7) {
        synchronized (this.f5916c) {
            this.f5917d = i7;
            this.f5918e++;
        }
        Intent e6 = e(intent);
        if (e6 == null) {
            d(intent);
            return 2;
        }
        l2.i j6 = j(e6);
        if (j6.l()) {
            d(intent);
            return 2;
        }
        j6.b(new androidx.profileinstaller.g(), new l2.d() { // from class: com.google.firebase.messaging.g
            @Override // l2.d
            public final void a(l2.i iVar) {
                i.this.h(intent, iVar);
            }
        });
        return 3;
    }
}
