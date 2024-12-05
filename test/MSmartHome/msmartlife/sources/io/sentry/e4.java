package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryCrashLastRunState.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class e4 {
    private static final e4 a = new e4();

    /* renamed from: b, reason: collision with root package name */
    private boolean f18915b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f18916c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f18917d = new Object();

    private e4() {
    }

    public static e4 a() {
        return a;
    }

    public void b(boolean z) {
        synchronized (this.f18917d) {
            if (!this.f18915b) {
                this.f18916c = Boolean.valueOf(z);
                this.f18915b = true;
            }
        }
    }
}
