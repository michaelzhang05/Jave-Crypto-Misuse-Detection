package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: DiagnosticLogger.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class d1 implements w1 {
    private final x4 a;

    /* renamed from: b, reason: collision with root package name */
    private final w1 f18897b;

    public d1(x4 x4Var, w1 w1Var) {
        this.a = (x4) io.sentry.util.q.c(x4Var, "SentryOptions is required.");
        this.f18897b = w1Var;
    }

    @Override // io.sentry.w1
    public void a(s4 s4Var, Throwable th, String str, Object... objArr) {
        if (this.f18897b == null || !d(s4Var)) {
            return;
        }
        this.f18897b.a(s4Var, th, str, objArr);
    }

    @Override // io.sentry.w1
    public void b(s4 s4Var, String str, Throwable th) {
        if (this.f18897b == null || !d(s4Var)) {
            return;
        }
        this.f18897b.b(s4Var, str, th);
    }

    @Override // io.sentry.w1
    public void c(s4 s4Var, String str, Object... objArr) {
        if (this.f18897b == null || !d(s4Var)) {
            return;
        }
        this.f18897b.c(s4Var, str, objArr);
    }

    @Override // io.sentry.w1
    public boolean d(s4 s4Var) {
        return s4Var != null && this.a.isDebug() && s4Var.ordinal() >= this.a.getDiagnosticLevel().ordinal();
    }
}
