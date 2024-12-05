package rx.n.a;

import java.util.concurrent.atomic.AtomicLong;
import rx.e;

/* compiled from: OnSubscribeRange.java */
/* loaded from: classes3.dex */
public final class x implements e.a<Integer> {

    /* renamed from: f, reason: collision with root package name */
    private final int f22900f;

    /* renamed from: g, reason: collision with root package name */
    private final int f22901g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeRange.java */
    /* loaded from: classes3.dex */
    public static final class a extends AtomicLong implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        private final rx.j<? super Integer> f22902f;

        /* renamed from: g, reason: collision with root package name */
        private final int f22903g;

        /* renamed from: h, reason: collision with root package name */
        private long f22904h;

        a(rx.j<? super Integer> jVar, int i2, int i3) {
            this.f22902f = jVar;
            this.f22904h = i2;
            this.f22903g = i3;
        }

        void a() {
            long j2 = this.f22903g + 1;
            rx.j<? super Integer> jVar = this.f22902f;
            for (long j3 = this.f22904h; j3 != j2; j3++) {
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onNext(Integer.valueOf((int) j3));
            }
            if (jVar.isUnsubscribed()) {
                return;
            }
            jVar.onCompleted();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        
            r12.f22904h = r4;
            r13 = addAndGet(-r9);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void b(long r13) {
            /*
                r12 = this;
                int r0 = r12.f22903g
                long r0 = (long) r0
                r2 = 1
                long r0 = r0 + r2
                long r4 = r12.f22904h
                rx.j<? super java.lang.Integer> r6 = r12.f22902f
                r7 = 0
            Lc:
                r9 = r7
            Ld:
                int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r11 == 0) goto L27
                int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r11 == 0) goto L27
                boolean r11 = r6.isUnsubscribed()
                if (r11 == 0) goto L1c
                return
            L1c:
                int r11 = (int) r4
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r6.onNext(r11)
                long r4 = r4 + r2
                long r9 = r9 + r2
                goto Ld
            L27:
                boolean r13 = r6.isUnsubscribed()
                if (r13 == 0) goto L2e
                return
            L2e:
                int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r13 != 0) goto L36
                r6.onCompleted()
                return
            L36:
                long r13 = r12.get()
                int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r11 != 0) goto Ld
                r12.f22904h = r4
                long r13 = -r9
                long r13 = r12.addAndGet(r13)
                int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r9 != 0) goto Lc
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.x.a.b(long):void");
        }

        @Override // rx.g
        public void request(long j2) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j2 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                a();
            } else {
                if (j2 <= 0 || rx.n.a.a.b(this, j2) != 0) {
                    return;
                }
                b(j2);
            }
        }
    }

    public x(int i2, int i3) {
        this.f22900f = i2;
        this.f22901g = i3;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super Integer> jVar) {
        jVar.setProducer(new a(jVar, this.f22900f, this.f22901g));
    }
}
