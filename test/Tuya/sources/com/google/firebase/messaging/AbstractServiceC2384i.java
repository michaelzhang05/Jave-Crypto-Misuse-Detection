package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.h0;
import java.util.concurrent.ExecutorService;
import r0.C3679j;
import r0.InterfaceC3674e;

/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractServiceC2384i extends Service {

    /* renamed from: b, reason: collision with root package name */
    private Binder f17473b;

    /* renamed from: d, reason: collision with root package name */
    private int f17475d;

    /* renamed from: a, reason: collision with root package name */
    final ExecutorService f17472a = AbstractC2390o.d();

    /* renamed from: c, reason: collision with root package name */
    private final Object f17474c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private int f17476e = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    /* loaded from: classes3.dex */
    class a implements h0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.h0.a
        public Task a(Intent intent) {
            return AbstractServiceC2384i.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            f0.c(intent);
        }
        synchronized (this.f17474c) {
            try {
                int i8 = this.f17476e - 1;
                this.f17476e = i8;
                if (i8 == 0) {
                    k(this.f17475d);
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
    public /* synthetic */ void i(Intent intent, C3679j c3679j) {
        try {
            f(intent);
        } finally {
            c3679j.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task j(final Intent intent) {
        if (g(intent)) {
            return r0.l.e(null);
        }
        final C3679j c3679j = new C3679j();
        this.f17472a.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2384i.this.i(intent, c3679j);
            }
        });
        return c3679j.a();
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
            if (this.f17473b == null) {
                this.f17473b = new h0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17473b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f17472a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i8, int i9) {
        synchronized (this.f17474c) {
            this.f17475d = i9;
            this.f17476e++;
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
        j8.b(new androidx.profileinstaller.c(), new InterfaceC3674e() { // from class: com.google.firebase.messaging.g
            @Override // r0.InterfaceC3674e
            public final void a(Task task) {
                AbstractServiceC2384i.this.h(intent, task);
            }
        });
        return 3;
    }
}
