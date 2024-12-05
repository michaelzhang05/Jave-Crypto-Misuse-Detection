package a4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import v1.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f51f = Logger.getLogger(l.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Executor f52a;

    /* renamed from: b, reason: collision with root package name */
    private final Deque f53b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private c f54c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    private long f55d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final b f56e = new b(this, null);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f57a;

        a(Runnable runnable) {
            this.f57a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57a.run();
        }

        public String toString() {
            return this.f57a.toString();
        }
    }

    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Runnable f59a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        
            r8.f59a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            a4.l.f51f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f59a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        
            r8.f59a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L2:
                a4.l r2 = a4.l.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = a4.l.b(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                a4.l r0 = a4.l.this     // Catch: java.lang.Throwable -> L7f
                a4.l$c r0 = a4.l.c(r0)     // Catch: java.lang.Throwable -> L7f
                a4.l$c r3 = a4.l.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                a4.l r0 = a4.l.this     // Catch: java.lang.Throwable -> L7f
                a4.l.e(r0)     // Catch: java.lang.Throwable -> L7f
                a4.l r0 = a4.l.this     // Catch: java.lang.Throwable -> L7f
                a4.l.d(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                a4.l r3 = a4.l.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = a4.l.b(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f59a = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                a4.l r0 = a4.l.this     // Catch: java.lang.Throwable -> L7f
                a4.l$c r3 = a4.l.c.IDLE     // Catch: java.lang.Throwable -> L7f
                a4.l.d(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f59a     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f59a = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = a4.l.f()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f59a     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f59a = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.l.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e6) {
                synchronized (l.this.f53b) {
                    l.this.f54c = c.IDLE;
                    throw e6;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f59a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + l.this.f54c + "}";
        }

        /* synthetic */ b(l lVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Executor executor) {
        this.f52a = (Executor) n.h(executor);
    }

    static /* synthetic */ long e(l lVar) {
        long j6 = lVar.f55d;
        lVar.f55d = 1 + j6;
        return j6;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        n.h(runnable);
        synchronized (this.f53b) {
            c cVar2 = this.f54c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j6 = this.f55d;
                a aVar = new a(runnable);
                this.f53b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f54c = cVar3;
                try {
                    this.f52a.execute(this.f56e);
                    if (this.f54c != cVar3) {
                        return;
                    }
                    synchronized (this.f53b) {
                        if (this.f55d == j6 && this.f54c == cVar3) {
                            this.f54c = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e6) {
                    synchronized (this.f53b) {
                        c cVar4 = this.f54c;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f53b.removeLastOccurrence(aVar)) {
                            r0 = false;
                        }
                        if (!(e6 instanceof RejectedExecutionException) || r0) {
                            throw e6;
                        }
                    }
                    return;
                }
            }
            this.f53b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f52a + "}";
    }
}
