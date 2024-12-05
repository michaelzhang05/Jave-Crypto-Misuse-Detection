package com.mbridge.msdk.e.a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f19855a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final p f19858a;

        /* renamed from: b, reason: collision with root package name */
        private final r f19859b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f19860c;

        public a(p pVar, r rVar, Runnable runnable) {
            this.f19858a = pVar;
            this.f19859b = rVar;
            this.f19860c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f19858a.m()) {
                this.f19858a.c("canceled-at-delivery");
                return;
            }
            if (this.f19859b.a()) {
                this.f19858a.a((p) this.f19859b.f19909a);
            } else {
                this.f19858a.b(this.f19859b.f19911c);
            }
            if (!this.f19859b.f19912d) {
                this.f19858a.c("done");
            }
            Runnable runnable = this.f19860c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public h(final Handler handler) {
        this.f19855a = new Executor() { // from class: com.mbridge.msdk.e.a.h.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, r<?> rVar) {
        a(pVar, rVar, null);
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, r<?> rVar, Runnable runnable) {
        pVar.t();
        this.f19855a.execute(new a(pVar, rVar, runnable));
    }

    public h(Executor executor) {
        this.f19855a = executor;
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, z zVar) {
        this.f19855a.execute(new a(pVar, r.a(zVar), null));
    }
}
