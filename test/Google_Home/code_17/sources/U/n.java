package u;

import java.util.concurrent.Executor;
import y.AbstractC4194a;

/* loaded from: classes3.dex */
class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f39893a;

    /* loaded from: classes3.dex */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f39894a;

        a(Runnable runnable) {
            this.f39894a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f39894a.run();
            } catch (Exception e8) {
                AbstractC4194a.d("Executor", "Background execution failure.", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Executor executor) {
        this.f39893a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f39893a.execute(new a(runnable));
    }
}
