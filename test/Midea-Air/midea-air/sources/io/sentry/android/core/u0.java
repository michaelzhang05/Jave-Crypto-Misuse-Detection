package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: CurrentActivityHolder.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public class u0 {
    private static final u0 a = new u0();

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f18787b;

    private u0() {
    }

    public static u0 c() {
        return a;
    }

    public void a() {
        this.f18787b = null;
    }

    public Activity b() {
        WeakReference<Activity> weakReference = this.f18787b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference<Activity> weakReference = this.f18787b;
        if (weakReference == null || weakReference.get() != activity) {
            this.f18787b = new WeakReference<>(activity);
        }
    }
}
