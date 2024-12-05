package q0;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q0.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC3816J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3815I f38072a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f38073b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3816J(C3815I c3815i, Callable callable) {
        this.f38072a = c3815i;
        this.f38073b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f38072a.r(this.f38073b.call());
        } catch (Exception e8) {
            this.f38072a.q(e8);
        } catch (Throwable th) {
            this.f38072a.q(new RuntimeException(th));
        }
    }
}
