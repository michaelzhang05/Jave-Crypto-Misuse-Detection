package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.f4;
import io.sentry.u4;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AppStartState.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class q0 {
    private static q0 a = new q0();

    /* renamed from: b, reason: collision with root package name */
    private Long f18779b;

    /* renamed from: c, reason: collision with root package name */
    private Long f18780c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f18781d = null;

    /* renamed from: e, reason: collision with root package name */
    private f4 f18782e;

    private q0() {
    }

    public static q0 e() {
        return a;
    }

    public f4 a() {
        Long b2;
        f4 d2 = d();
        if (d2 == null || (b2 = b()) == null) {
            return null;
        }
        return new u4(d2.r() + io.sentry.a1.h(b2.longValue()));
    }

    public synchronized Long b() {
        Long l;
        if (this.f18779b != null && (l = this.f18780c) != null && this.f18781d != null) {
            long longValue = l.longValue() - this.f18779b.longValue();
            if (longValue >= 60000) {
                return null;
            }
            return Long.valueOf(longValue);
        }
        return null;
    }

    public Long c() {
        return this.f18779b;
    }

    public f4 d() {
        return this.f18782e;
    }

    public Boolean f() {
        return this.f18781d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        h(SystemClock.uptimeMillis());
    }

    void h(long j2) {
        this.f18780c = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void i(long j2, f4 f4Var) {
        if (this.f18782e == null || this.f18779b == null) {
            this.f18782e = f4Var;
            this.f18779b = Long.valueOf(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void j(boolean z) {
        if (this.f18781d != null) {
            return;
        }
        this.f18781d = Boolean.valueOf(z);
    }
}
