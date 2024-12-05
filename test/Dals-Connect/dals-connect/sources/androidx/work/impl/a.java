package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.work.v;

/* compiled from: DefaultRunnableScheduler.java */
/* loaded from: classes.dex */
public class a implements v {
    private final Handler a = androidx.core.os.b.a(Looper.getMainLooper());

    @Override // androidx.work.v
    public void a(long j2, Runnable runnable) {
        this.a.postDelayed(runnable, j2);
    }

    @Override // androidx.work.v
    public void b(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
}
