package rx.n.c;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.h;

/* compiled from: TrampolineScheduler.java */
/* loaded from: classes3.dex */
public final class n extends rx.h {
    public static final n a = new n();

    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes3.dex */
    static final class a extends h.a implements rx.k {

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f23077f = new AtomicInteger();

        /* renamed from: g, reason: collision with root package name */
        final PriorityBlockingQueue<b> f23078g = new PriorityBlockingQueue<>();

        /* renamed from: h, reason: collision with root package name */
        private final rx.t.a f23079h = new rx.t.a();

        /* renamed from: i, reason: collision with root package name */
        private final AtomicInteger f23080i = new AtomicInteger();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TrampolineScheduler.java */
        /* renamed from: rx.n.c.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0421a implements rx.m.a {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f23081f;

            C0421a(b bVar) {
                this.f23081f = bVar;
            }

            @Override // rx.m.a
            public void call() {
                a.this.f23078g.remove(this.f23081f);
            }
        }

        a() {
        }

        private rx.k f(rx.m.a aVar, long j2) {
            if (this.f23079h.isUnsubscribed()) {
                return rx.t.e.c();
            }
            b bVar = new b(aVar, Long.valueOf(j2), this.f23077f.incrementAndGet());
            this.f23078g.add(bVar);
            if (this.f23080i.getAndIncrement() != 0) {
                return rx.t.e.a(new C0421a(bVar));
            }
            do {
                b poll = this.f23078g.poll();
                if (poll != null) {
                    poll.f23083f.call();
                }
            } while (this.f23080i.decrementAndGet() > 0);
            return rx.t.e.c();
        }

        @Override // rx.h.a
        public rx.k c(rx.m.a aVar) {
            return f(aVar, b());
        }

        @Override // rx.h.a
        public rx.k d(rx.m.a aVar, long j2, TimeUnit timeUnit) {
            long b2 = b() + timeUnit.toMillis(j2);
            return f(new m(aVar, this, b2), b2);
        }

        @Override // rx.k
        public boolean isUnsubscribed() {
            return this.f23079h.isUnsubscribed();
        }

        @Override // rx.k
        public void unsubscribe() {
            this.f23079h.unsubscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TrampolineScheduler.java */
    /* loaded from: classes3.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: f, reason: collision with root package name */
        final rx.m.a f23083f;

        /* renamed from: g, reason: collision with root package name */
        final Long f23084g;

        /* renamed from: h, reason: collision with root package name */
        final int f23085h;

        b(rx.m.a aVar, Long l, int i2) {
            this.f23083f = aVar;
            this.f23084g = l;
            this.f23085h = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int compareTo = this.f23084g.compareTo(bVar.f23084g);
            return compareTo == 0 ? n.a(this.f23085h, bVar.f23085h) : compareTo;
        }
    }

    private n() {
    }

    static int a(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    @Override // rx.h
    public h.a createWorker() {
        return new a();
    }
}
