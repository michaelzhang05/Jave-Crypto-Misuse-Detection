package u;

import java.util.concurrent.Executor;
import y.AbstractC3966a;

/* loaded from: classes3.dex */
class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38465a;

    /* loaded from: classes3.dex */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f38466a;

        a(Runnable runnable) {
            this.f38466a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38466a.run();
            } catch (Exception e8) {
                AbstractC3966a.d("Executor", "Background execution failure.", e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Executor executor) {
        this.f38465a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f38465a.execute(new a(runnable));
    }
}
