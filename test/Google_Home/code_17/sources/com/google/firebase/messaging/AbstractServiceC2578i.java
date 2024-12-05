package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.k0;
import java.util.concurrent.ExecutorService;
import q0.AbstractC3828l;
import q0.C3826j;
import q0.InterfaceC3821e;

/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC2578i extends Service {

    /* renamed from: b, reason: collision with root package name */
    private Binder f18505b;

    /* renamed from: d, reason: collision with root package name */
    private int f18507d;

    /* renamed from: a, reason: collision with root package name */
    final ExecutorService f18504a = AbstractC2584o.d();

    /* renamed from: c, reason: collision with root package name */
    private final Object f18506c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private int f18508e = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    /* loaded from: classes4.dex */
    class a implements k0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.k0.a
        public Task a(Intent intent) {
            return AbstractServiceC2578i.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            i0.c(intent);
        }
        synchronized (this.f18506c) {
            try {
                int i8 = this.f18508e - 1;
                this.f18508e = i8;
                if (i8 == 0) {
                    k(this.f18507d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, Task task) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, C3826j c3826j) {
        try {
            f(intent);
        } finally {
            c3826j.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task j(final Intent intent) {
        if (g(intent)) {
            return AbstractC3828l.e(null);
        }
        final C3826j c3826j = new C3826j();
        this.f18504a.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2578i.this.i(intent, c3826j);
            }
        });
        return c3826j.a();
    }

    protected abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i8) {
        return stopSelfResult(i8);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f18505b == null) {
                this.f18505b = new k0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18505b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f18504a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i8, int i9) {
        synchronized (this.f18506c) {
            this.f18507d = i9;
            this.f18508e++;
        }
        Intent e8 = e(intent);
        if (e8 == null) {
            d(intent);
            return 2;
        }
        Task j8 = j(e8);
        if (j8.m()) {
            d(intent);
            return 2;
        }
        j8.b(new androidx.privacysandbox.ads.adservices.adid.g(), new InterfaceC3821e() { // from class: com.google.firebase.messaging.g
            @Override // q0.InterfaceC3821e
            public final void a(Task task) {
                AbstractServiceC2578i.this.h(intent, task);
            }
        });
        return 3;
    }
}
