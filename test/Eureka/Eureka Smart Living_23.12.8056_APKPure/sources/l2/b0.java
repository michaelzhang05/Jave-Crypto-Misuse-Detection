package l2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7353a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c0 f7354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(c0 c0Var, i iVar) {
        this.f7354b = c0Var;
        this.f7353a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        try {
            hVar = this.f7354b.f7356b;
            i a6 = hVar.a(this.f7353a.i());
            if (a6 == null) {
                this.f7354b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f7372b;
            a6.e(executor, this.f7354b);
            a6.d(executor, this.f7354b);
            a6.a(executor, this.f7354b);
        } catch (CancellationException unused) {
            this.f7354b.a();
        } catch (g e6) {
            if (e6.getCause() instanceof Exception) {
                this.f7354b.c((Exception) e6.getCause());
            } else {
                this.f7354b.c(e6);
            }
        } catch (Exception e7) {
            this.f7354b.c(e7);
        }
    }
}
