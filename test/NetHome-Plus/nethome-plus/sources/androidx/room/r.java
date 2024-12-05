package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.java */
/* loaded from: classes.dex */
class r implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private final Executor f1698f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<Runnable> f1699g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private Runnable f1700h;

    /* compiled from: TransactionExecutor.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Runnable f1701f;

        a(Runnable runnable) {
            this.f1701f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1701f.run();
            } finally {
                r.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Executor executor) {
        this.f1698f = executor;
    }

    synchronized void a() {
        Runnable poll = this.f1699g.poll();
        this.f1700h = poll;
        if (poll != null) {
            this.f1698f.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f1699g.offer(new a(runnable));
        if (this.f1700h == null) {
            a();
        }
    }
}
