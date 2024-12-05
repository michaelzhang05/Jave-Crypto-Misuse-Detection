package C0;

import R.AbstractC1319p;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f1156f = Logger.getLogger(l.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1157a;

    /* renamed from: b, reason: collision with root package name */
    private final Deque f1158b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private c f1159c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    private long f1160d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final b f1161e = new b(this, null);

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f1162a;

        a(Runnable runnable) {
            this.f1162a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1162a.run();
        }

        public String toString() {
            return this.f1162a.toString();
        }
    }

    /* loaded from: classes3.dex */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Runnable f1164a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
        
            r8.f1164a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
        
            r8.f1164a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            C0.l.f1156f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f1164a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
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
                C0.l r2 = C0.l.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = C0.l.a(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                C0.l r0 = C0.l.this     // Catch: java.lang.Throwable -> L20
                C0.l$c r0 = C0.l.b(r0)     // Catch: java.lang.Throwable -> L20
                C0.l$c r3 = C0.l.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L83
            L22:
                C0.l r0 = C0.l.this     // Catch: java.lang.Throwable -> L20
                C0.l.d(r0)     // Catch: java.lang.Throwable -> L20
                C0.l r0 = C0.l.this     // Catch: java.lang.Throwable -> L20
                C0.l.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                C0.l r3 = C0.l.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = C0.l.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f1164a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                C0.l r0 = C0.l.this     // Catch: java.lang.Throwable -> L20
                C0.l$c r3 = C0.l.c.IDLE     // Catch: java.lang.Throwable -> L20
                C0.l.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f1164a     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f1164a = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L85
            L60:
                r0 = move-exception
                goto L80
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = C0.l.e()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f1164a     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L80:
                r8.f1164a = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L83:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L85:
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: C0.l.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e8) {
                synchronized (l.this.f1158b) {
                    l.this.f1159c = c.IDLE;
                    throw e8;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f1164a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + l.this.f1159c + "}";
        }

        /* synthetic */ b(l lVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Executor executor) {
        this.f1157a = (Executor) AbstractC1319p.l(executor);
    }

    static /* synthetic */ long d(l lVar) {
        long j8 = lVar.f1160d;
        lVar.f1160d = 1 + j8;
        return j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            R.AbstractC1319p.l(r8)
            java.util.Deque r0 = r7.f1158b
            monitor-enter(r0)
            C0.l$c r1 = r7.f1159c     // Catch: java.lang.Throwable -> L6d
            C0.l$c r2 = C0.l.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            C0.l$c r2 = C0.l.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f1160d     // Catch: java.lang.Throwable -> L6d
            C0.l$a r1 = new C0.l$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque r8 = r7.f1158b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            C0.l$c r8 = C0.l.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f1159c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f1157a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            C0.l$b r5 = r7.f1161e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            C0.l$c r0 = r7.f1159c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f1158b
            monitor-enter(r0)
            long r5 = r7.f1160d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            C0.l$c r1 = r7.f1159c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f1159c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque r2 = r7.f1158b
            monitor-enter(r2)
            C0.l$c r0 = r7.f1159c     // Catch: java.lang.Throwable -> L55
            C0.l$c r3 = C0.l.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            C0.l$c r3 = C0.l.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque r0 = r7.f1158b     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque r1 = r7.f1158b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.l.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f1157a + "}";
    }
}
