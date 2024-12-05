package io.sentry.android.core;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: AppState.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class r0 {
    private static r0 a = new r0();

    /* renamed from: b, reason: collision with root package name */
    private Boolean f18783b = null;

    private r0() {
    }

    public static r0 a() {
        return a;
    }

    public Boolean b() {
        return this.f18783b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c(boolean z) {
        this.f18783b = Boolean.valueOf(z);
    }
}
