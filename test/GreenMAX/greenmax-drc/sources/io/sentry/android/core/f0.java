package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.s4;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.VisibleForTesting;

/* compiled from: ActivityFramesTracker.java */
/* loaded from: classes2.dex */
public final class f0 {
    private FrameMetricsAggregator a;

    /* renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f18643b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<io.sentry.protocol.q, Map<String, io.sentry.protocol.h>> f18644c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Activity, b> f18645d;

    /* renamed from: e, reason: collision with root package name */
    private final c1 f18646e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActivityFramesTracker.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final int f18647b;

        /* renamed from: c, reason: collision with root package name */
        private final int f18648c;

        private b(int i2, int i3, int i4) {
            this.a = i2;
            this.f18647b = i3;
            this.f18648c = i4;
        }
    }

    public f0(b1 b1Var, SentryAndroidOptions sentryAndroidOptions, c1 c1Var) {
        this.a = null;
        this.f18644c = new ConcurrentHashMap();
        this.f18645d = new WeakHashMap();
        if (b1Var.a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.a = new FrameMetricsAggregator();
        }
        this.f18643b = sentryAndroidOptions;
        this.f18646e = c1Var;
    }

    private b b() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i2;
        int i3;
        SparseIntArray sparseIntArray;
        if (!d() || (frameMetricsAggregator = this.a) == null) {
            return null;
        }
        SparseIntArray[] b2 = frameMetricsAggregator.b();
        int i4 = 0;
        if (b2 == null || b2.length <= 0 || (sparseIntArray = b2[0]) == null) {
            i2 = 0;
            i3 = 0;
        } else {
            int i5 = 0;
            i2 = 0;
            i3 = 0;
            while (i4 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i4);
                int valueAt = sparseIntArray.valueAt(i4);
                i5 += valueAt;
                if (keyAt > 700) {
                    i3 += valueAt;
                } else if (keyAt > 16) {
                    i2 += valueAt;
                }
                i4++;
            }
            i4 = i5;
        }
        return new b(i4, i2, i3);
    }

    private b c(Activity activity) {
        b b2;
        b remove = this.f18645d.remove(activity);
        if (remove == null || (b2 = b()) == null) {
            return null;
        }
        return new b(b2.a - remove.a, b2.f18647b - remove.f18647b, b2.f18648c - remove.f18648c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f(Activity activity) {
        this.a.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                this.f18643b.getLogger().c(s4.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void j(Activity activity) {
        this.a.c(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l() {
        this.a.e();
    }

    private void m(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.h.e().d()) {
                runnable.run();
            } else {
                this.f18646e.b(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.this.h(runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f18643b.getLogger().c(s4.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void o(Activity activity) {
        b b2 = b();
        if (b2 != null) {
            this.f18645d.put(activity, b2);
        }
    }

    public synchronized void a(final Activity activity) {
        if (d()) {
            m(new Runnable() { // from class: io.sentry.android.core.f
                @Override // java.lang.Runnable
                public final void run() {
                    f0.this.f(activity);
                }
            }, "FrameMetricsAggregator.add");
            o(activity);
        }
    }

    @VisibleForTesting
    public boolean d() {
        return this.a != null && this.f18643b.isEnableFramesTracking();
    }

    public synchronized void n(final Activity activity, io.sentry.protocol.q qVar) {
        if (d()) {
            m(new Runnable() { // from class: io.sentry.android.core.c
                @Override // java.lang.Runnable
                public final void run() {
                    f0.this.j(activity);
                }
            }, null);
            b c2 = c(activity);
            if (c2 != null && (c2.a != 0 || c2.f18647b != 0 || c2.f18648c != 0)) {
                io.sentry.protocol.h hVar = new io.sentry.protocol.h(Integer.valueOf(c2.a), "none");
                io.sentry.protocol.h hVar2 = new io.sentry.protocol.h(Integer.valueOf(c2.f18647b), "none");
                io.sentry.protocol.h hVar3 = new io.sentry.protocol.h(Integer.valueOf(c2.f18648c), "none");
                HashMap hashMap = new HashMap();
                hashMap.put("frames_total", hVar);
                hashMap.put("frames_slow", hVar2);
                hashMap.put("frames_frozen", hVar3);
                this.f18644c.put(qVar, hashMap);
            }
        }
    }

    public synchronized void p() {
        if (d()) {
            m(new Runnable() { // from class: io.sentry.android.core.d
                @Override // java.lang.Runnable
                public final void run() {
                    f0.this.l();
                }
            }, "FrameMetricsAggregator.stop");
            this.a.d();
        }
        this.f18644c.clear();
    }

    public synchronized Map<String, io.sentry.protocol.h> q(io.sentry.protocol.q qVar) {
        if (!d()) {
            return null;
        }
        Map<String, io.sentry.protocol.h> map = this.f18644c.get(qVar);
        this.f18644c.remove(qVar);
        return map;
    }

    public f0(b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
        this(b1Var, sentryAndroidOptions, new c1());
    }
}
