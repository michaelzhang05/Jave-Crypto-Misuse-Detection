package rx.n.a;

import android.R;
import java.util.concurrent.atomic.AtomicLong;
import rx.e;

/* compiled from: OnSubscribeFromArray.java */
/* loaded from: classes3.dex */
public final class s<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final T[] f22830f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeFromArray.java */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicLong implements rx.g {

        /* renamed from: f, reason: collision with root package name */
        final rx.j<? super T> f22831f;

        /* renamed from: g, reason: collision with root package name */
        final T[] f22832g;

        /* renamed from: h, reason: collision with root package name */
        int f22833h;

        public a(rx.j<? super T> jVar, T[] tArr) {
            this.f22831f = jVar;
            this.f22832g = tArr;
        }

        void a() {
            rx.j<? super T> jVar = this.f22831f;
            for (R.bool boolVar : this.f22832g) {
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onNext(boolVar);
            }
            if (jVar.isUnsubscribed()) {
                return;
            }
            jVar.onCompleted();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        
            r10.f22833h = r3;
            r11 = addAndGet(r6);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void b(long r11) {
            /*
                r10 = this;
                rx.j<? super T> r0 = r10.f22831f
                T[] r1 = r10.f22832g
                int r2 = r1.length
                int r3 = r10.f22833h
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 == 0) goto L2f
                if (r3 == r2) goto L2f
                boolean r8 = r0.isUnsubscribed()
                if (r8 == 0) goto L17
                return
            L17:
                r8 = r1[r3]
                r0.onNext(r8)
                int r3 = r3 + 1
                if (r3 != r2) goto L2a
                boolean r11 = r0.isUnsubscribed()
                if (r11 != 0) goto L29
                r0.onCompleted()
            L29:
                return
            L2a:
                r8 = 1
                long r11 = r11 - r8
                long r6 = r6 - r8
                goto La
            L2f:
                long r11 = r10.get()
                long r11 = r11 + r6
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f22833h = r3
                long r11 = r10.addAndGet(r6)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.n.a.s.a.b(long):void");
        }

        @Override // rx.g
        public void request(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j2);
            }
            if (j2 == Long.MAX_VALUE) {
                if (rx.n.a.a.b(this, j2) == 0) {
                    a();
                }
            } else {
                if (j2 == 0 || rx.n.a.a.b(this, j2) != 0) {
                    return;
                }
                b(j2);
            }
        }
    }

    public s(T[] tArr) {
        this.f22830f = tArr;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        jVar.setProducer(new a(jVar, this.f22830f));
    }
}
