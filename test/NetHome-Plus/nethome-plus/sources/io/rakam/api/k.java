package io.rakam.api;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: WorkerThread.java */
/* loaded from: classes2.dex */
public class k extends HandlerThread {

    /* renamed from: f, reason: collision with root package name */
    private Handler f18514f;

    public k(String str) {
        super(str);
    }

    private synchronized void c() {
        if (this.f18514f == null) {
            this.f18514f = new Handler(getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        c();
        this.f18514f.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Runnable runnable, long j2) {
        c();
        this.f18514f.postDelayed(runnable, j2);
    }
}
