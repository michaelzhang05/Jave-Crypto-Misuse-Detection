package rx.n.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.e;

/* compiled from: OperatorTake.java */
/* loaded from: classes3.dex */
public final class b1<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    final int f22501f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorTake.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        int f22502f;

        /* renamed from: g, reason: collision with root package name */
        boolean f22503g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.j f22504h;

        /* compiled from: OperatorTake.java */
        /* renamed from: rx.n.a.b1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0400a implements rx.g {

            /* renamed from: f, reason: collision with root package name */
            final AtomicLong f22506f = new AtomicLong(0);

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ rx.g f22507g;

            C0400a(rx.g gVar) {
                this.f22507g = gVar;
            }

            @Override // rx.g
            public void request(long j2) {
                long j3;
                long min;
                if (j2 <= 0 || a.this.f22503g) {
                    return;
                }
                do {
                    j3 = this.f22506f.get();
                    min = Math.min(j2, b1.this.f22501f - j3);
                    if (min == 0) {
                        return;
                    }
                } while (!this.f22506f.compareAndSet(j3, j3 + min));
                this.f22507g.request(min);
            }
        }

        a(rx.j jVar) {
            this.f22504h = jVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22503g) {
                return;
            }
            this.f22503g = true;
            this.f22504h.onCompleted();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (!this.f22503g) {
                this.f22503g = true;
                try {
                    this.f22504h.onError(th);
                    return;
                } finally {
                    unsubscribe();
                }
            }
            rx.q.c.j(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i2 = this.f22502f;
            int i3 = i2 + 1;
            this.f22502f = i3;
            int i4 = b1.this.f22501f;
            if (i2 < i4) {
                boolean z = i3 == i4;
                this.f22504h.onNext(t);
                if (!z || this.f22503g) {
                    return;
                }
                this.f22503g = true;
                try {
                    this.f22504h.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.j
        public void setProducer(rx.g gVar) {
            this.f22504h.setProducer(new C0400a(gVar));
        }
    }

    public b1(int i2) {
        if (i2 >= 0) {
            this.f22501f = i2;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i2);
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        a aVar = new a(jVar);
        if (this.f22501f == 0) {
            jVar.onCompleted();
            aVar.unsubscribe();
        }
        jVar.add(aVar);
        return aVar;
    }
}
