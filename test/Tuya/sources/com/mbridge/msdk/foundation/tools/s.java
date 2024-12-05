package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class s implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f20097a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f20098b;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f20097a == null) {
                this.f20097a = a(runnable);
                q.a().execute(this.f20097a);
            } else if (this.f20098b == null) {
                this.f20098b = a(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private Runnable a(final Runnable runnable) {
        return new Runnable() { // from class: com.mbridge.msdk.foundation.tools.s.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        runnable.run();
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("LimitExecutor", e8.getMessage());
                        }
                    }
                } finally {
                    s.this.a();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f20098b;
        this.f20097a = runnable;
        this.f20098b = null;
        if (runnable != null) {
            q.a().execute(this.f20097a);
        }
    }
}
