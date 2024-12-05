package J0;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: J0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1287w implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f4787a;

    /* renamed from: b, reason: collision with root package name */
    private final Q0.i f4788b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f4789c;

    /* renamed from: d, reason: collision with root package name */
    private final G0.a f4790d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f4791e = new AtomicBoolean(false);

    /* renamed from: J0.w$a */
    /* loaded from: classes3.dex */
    interface a {
        void a(Q0.i iVar, Thread thread, Throwable th);
    }

    public C1287w(a aVar, Q0.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, G0.a aVar2) {
        this.f4787a = aVar;
        this.f4788b = iVar;
        this.f4789c = uncaughtExceptionHandler;
        this.f4790d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            G0.h.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            G0.h.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (this.f4790d.b()) {
            G0.h.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f4791e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f4791e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f4787a.a(this.f4788b, thread, th);
                } else {
                    G0.h.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e8) {
                G0.h.f().e("An error occurred in the uncaught exception handler", e8);
            }
            G0.h.f().b("Completed exception processing. Invoking default exception handler.");
            this.f4789c.uncaughtException(thread, th);
            this.f4791e.set(false);
        } catch (Throwable th2) {
            G0.h.f().b("Completed exception processing. Invoking default exception handler.");
            this.f4789c.uncaughtException(thread, th);
            this.f4791e.set(false);
            throw th2;
        }
    }
}
