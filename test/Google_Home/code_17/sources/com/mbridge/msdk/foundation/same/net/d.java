package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20660a = d.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f20661b;

    /* loaded from: classes4.dex */
    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final i f20680b;

        /* renamed from: c, reason: collision with root package name */
        private final k f20681c;

        public a(i iVar, k kVar) {
            this.f20680b = iVar;
            this.f20681c = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20680b.q()) {
                this.f20680b.a("canceled-at-delivery");
                this.f20680b.c();
                return;
            }
            k kVar = this.f20681c;
            com.mbridge.msdk.foundation.same.net.b.a aVar = kVar.f20814a;
            if (aVar == null) {
                this.f20680b.a(kVar);
            } else {
                this.f20680b.a(aVar);
            }
            this.f20680b.a("done");
            this.f20680b.d();
        }
    }

    public d(final Handler handler) {
        this.f20661b = new Executor() { // from class: com.mbridge.msdk.foundation.same.net.d.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void a(final i<?> iVar) {
        Executor executor = this.f20661b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.c();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void b(final i<?> iVar) {
        Executor executor = this.f20661b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.d();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void c(final i<?> iVar) {
        Executor executor = this.f20661b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.5
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.e();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void d(final i<?> iVar) {
        Executor executor = this.f20661b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.6
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.f();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void e(final i<?> iVar) {
        Executor executor = this.f20661b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.7
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.g();
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void a(final i<?> iVar, final long j8, final long j9) {
        Executor executor = this.f20661b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(j8, j9);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void a(i<?> iVar, com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.c(this.f20660a, "postError error=" + aVar.f20656a);
        if (this.f20661b != null) {
            this.f20661b.execute(new a(iVar, k.a(aVar)));
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public final void a(i<?> iVar, k<?> kVar) {
        Executor executor = this.f20661b;
        if (executor != null) {
            executor.execute(new a(iVar, kVar));
        }
    }
}