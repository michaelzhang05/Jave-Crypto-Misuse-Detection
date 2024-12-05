package io.sentry.android.core;

/* loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    private final Thread f18561f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.q.c(thread, "Thread must be provided.");
        this.f18561f = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public Thread a() {
        return this.f18561f;
    }
}
