package com.mbridge.msdk.e.a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18800a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final p f18803a;

        /* renamed from: b, reason: collision with root package name */
        private final r f18804b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f18805c;

        public a(p pVar, r rVar, Runnable runnable) {
            this.f18803a = pVar;
            this.f18804b = rVar;
            this.f18805c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f18803a.m()) {
                this.f18803a.c("canceled-at-delivery");
                return;
            }
            if (this.f18804b.a()) {
                this.f18803a.a((p) this.f18804b.f18854a);
            } else {
                this.f18803a.b(this.f18804b.f18856c);
            }
            if (!this.f18804b.f18857d) {
                this.f18803a.c("done");
            }
            Runnable runnable = this.f18805c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public h(final Handler handler) {
        this.f18800a = new Executor() { // from class: com.mbridge.msdk.e.a.h.1
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
        this.f18800a.execute(new a(pVar, rVar, runnable));
    }

    public h(Executor executor) {
        this.f18800a = executor;
    }

    @Override // com.mbridge.msdk.e.a.t
    public final void a(p<?> pVar, z zVar) {
        this.f18800a.execute(new a(pVar, r.a(zVar), null));
    }
}
