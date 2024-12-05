package r0;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ I f37520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f37521b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(I i8, Callable callable) {
        this.f37520a = i8;
        this.f37521b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f37520a.r(this.f37521b.call());
        } catch (Exception e8) {
            this.f37520a.q(e8);
        } catch (Throwable th) {
            this.f37520a.q(new RuntimeException(th));
        }
    }
}
