package l2;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h0 f7368a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f7369b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(h0 h0Var, Callable callable) {
        this.f7368a = h0Var;
        this.f7369b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7368a.p(this.f7369b.call());
        } catch (Exception e6) {
            this.f7368a.o(e6);
        } catch (Throwable th) {
            this.f7368a.o(new RuntimeException(th));
        }
    }
}
