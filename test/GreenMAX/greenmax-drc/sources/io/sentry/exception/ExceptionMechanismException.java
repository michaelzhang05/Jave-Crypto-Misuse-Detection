package io.sentry.exception;

import io.sentry.protocol.i;
import io.sentry.util.q;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class ExceptionMechanismException extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    private final i f18927f;

    /* renamed from: g, reason: collision with root package name */
    private final Throwable f18928g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread f18929h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f18930i;

    public ExceptionMechanismException(i iVar, Throwable th, Thread thread, boolean z) {
        this.f18927f = (i) q.c(iVar, "Mechanism is required.");
        this.f18928g = (Throwable) q.c(th, "Throwable is required.");
        this.f18929h = (Thread) q.c(thread, "Thread is required.");
        this.f18930i = z;
    }

    public i a() {
        return this.f18927f;
    }

    public Thread b() {
        return this.f18929h;
    }

    public Throwable c() {
        return this.f18928g;
    }

    public boolean d() {
        return this.f18930i;
    }

    public ExceptionMechanismException(i iVar, Throwable th, Thread thread) {
        this(iVar, th, thread, false);
    }
}
