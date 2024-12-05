package rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import rx.h;
import rx.k;
import rx.n.c.i;
import rx.t.e;

/* loaded from: classes3.dex */
public class TestScheduler extends h {
    static long a;

    /* renamed from: b, reason: collision with root package name */
    final Queue<c> f23259b = new PriorityQueue(11, new a());

    /* renamed from: c, reason: collision with root package name */
    long f23260c;

    /* loaded from: classes3.dex */
    static final class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            long j2 = cVar.a;
            long j3 = cVar2.a;
            if (j2 == j3) {
                if (cVar.f23269d < cVar2.f23269d) {
                    return -1;
                }
                return cVar.f23269d > cVar2.f23269d ? 1 : 0;
            }
            if (j2 < j3) {
                return -1;
            }
            return j2 > j3 ? 1 : 0;
        }
    }

    /* loaded from: classes3.dex */
    final class b extends h.a implements i.b {

        /* renamed from: f, reason: collision with root package name */
        private final rx.t.a f23261f = new rx.t.a();

        /* loaded from: classes3.dex */
        class a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f23263f;

            a(c cVar) {
                this.f23263f = cVar;
            }

            @Override // rx.m.a
            public void call() {
                TestScheduler.this.f23259b.remove(this.f23263f);
            }
        }

        /* renamed from: rx.schedulers.TestScheduler$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0429b implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f23265f;

            C0429b(c cVar) {
                this.f23265f = cVar;
            }

            @Override // rx.m.a
            public void call() {
                TestScheduler.this.f23259b.remove(this.f23265f);
            }
        }

        b() {
        }

        @Override // rx.n.c.i.b
        public long a() {
            return TestScheduler.this.f23260c;
        }

        @Override // rx.h.a
        public long b() {
            return TestScheduler.this.now();
        }

        @Override // rx.h.a
        public k c(rx.m.a aVar) {
            c cVar = new c(this, 0L, aVar);
            TestScheduler.this.f23259b.add(cVar);
            return e.a(new C0429b(cVar));
        }

        @Override // rx.h.a
        public k d(rx.m.a aVar, long j2, TimeUnit timeUnit) {
            c cVar = new c(this, TestScheduler.this.f23260c + timeUnit.toNanos(j2), aVar);
            TestScheduler.this.f23259b.add(cVar);
            return e.a(new a(cVar));
        }

        @Override // rx.h.a
        public k e(rx.m.a aVar, long j2, long j3, TimeUnit timeUnit) {
            return i.a(this, aVar, j2, j3, timeUnit, this);
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f23261f.isUnsubscribed();
        }

        @Override // rx.k
        public void unsubscribe() {
            this.f23261f.unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c {
        final long a;

        /* renamed from: b, reason: collision with root package name */
        final rx.m.a f23267b;

        /* renamed from: c, reason: collision with root package name */
        final h.a f23268c;

        /* renamed from: d, reason: collision with root package name */
        private final long f23269d;

        c(h.a aVar, long j2, rx.m.a aVar2) {
            long j3 = TestScheduler.a;
            TestScheduler.a = 1 + j3;
            this.f23269d = j3;
            this.a = j2;
            this.f23267b = aVar2;
            this.f23268c = aVar;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.a), this.f23267b.toString());
        }
    }

    private void a(long j2) {
        while (!this.f23259b.isEmpty()) {
            c peek = this.f23259b.peek();
            long j3 = peek.a;
            if (j3 > j2) {
                break;
            }
            if (j3 == 0) {
                j3 = this.f23260c;
            }
            this.f23260c = j3;
            this.f23259b.remove();
            if (!peek.f23268c.isUnsubscribed()) {
                peek.f23267b.call();
            }
        }
        this.f23260c = j2;
    }

    public void advanceTimeBy(long j2, TimeUnit timeUnit) {
        advanceTimeTo(this.f23260c + timeUnit.toNanos(j2), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j2, TimeUnit timeUnit) {
        a(timeUnit.toNanos(j2));
    }

    @Override // rx.h
    public h.a createWorker() {
        return new b();
    }

    @Override // rx.h
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.f23260c);
    }

    public void triggerActions() {
        a(this.f23260c);
    }
}
