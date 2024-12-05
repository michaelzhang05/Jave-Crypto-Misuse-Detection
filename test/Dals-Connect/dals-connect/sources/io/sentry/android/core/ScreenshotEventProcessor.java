package io.sentry.android.core;

import android.app.Activity;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.i2;
import io.sentry.j1;
import io.sentry.j2;
import io.sentry.k1;
import io.sentry.l4;
import io.sentry.n1;
import io.sentry.s4;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements k1, j2 {

    /* renamed from: f, reason: collision with root package name */
    private final SentryAndroidOptions f18591f;

    /* renamed from: g, reason: collision with root package name */
    private final s0 f18592g;

    /* renamed from: h, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.n f18593h = new io.sentry.android.core.internal.util.n(io.sentry.android.core.internal.util.g.b(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, s0 s0Var) {
        this.f18591f = (SentryAndroidOptions) io.sentry.util.q.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f18592g = (s0) io.sentry.util.q.c(s0Var, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            a();
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // io.sentry.k1
    public l4 b(l4 l4Var, n1 n1Var) {
        if (!l4Var.w0()) {
            return l4Var;
        }
        if (!this.f18591f.isAttachScreenshot()) {
            this.f18591f.getLogger().c(s4.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return l4Var;
        }
        Activity b2 = u0.c().b();
        if (b2 != null && !io.sentry.util.m.e(n1Var)) {
            boolean a = this.f18593h.a();
            SentryAndroidOptions.a beforeScreenshotCaptureCallback = this.f18591f.getBeforeScreenshotCaptureCallback();
            if (beforeScreenshotCaptureCallback != null) {
                if (!beforeScreenshotCaptureCallback.a(l4Var, n1Var, a)) {
                    return l4Var;
                }
            } else if (a) {
                return l4Var;
            }
            byte[] d2 = io.sentry.android.core.internal.util.s.d(b2, this.f18591f.getMainThreadChecker(), this.f18591f.getLogger(), this.f18592g);
            if (d2 == null) {
                return l4Var;
            }
            n1Var.k(io.sentry.s0.a(d2));
            n1Var.j("android:activity", b2);
        }
        return l4Var;
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    @Override // io.sentry.k1
    public /* synthetic */ io.sentry.protocol.x w(io.sentry.protocol.x xVar, n1 n1Var) {
        return j1.a(this, xVar, n1Var);
    }
}
