package d1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6453a;

    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f6454a;

        a(Runnable runnable) {
            this.f6454a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f6454a.run();
            } catch (Exception e6) {
                h1.a.d("Executor", "Background execution failure.", e6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Executor executor) {
        this.f6453a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6453a.execute(new a(runnable));
    }
}
