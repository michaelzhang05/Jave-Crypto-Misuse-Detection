package rx.r;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.Single;
import rx.i;
import rx.n.e.d;

/* compiled from: BlockingSingle.java */
/* loaded from: classes3.dex */
public final class a<T> {
    private final Single<? extends T> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BlockingSingle.java */
    /* renamed from: rx.r.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0426a extends i<T> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AtomicReference f23223g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f23224h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AtomicReference f23225i;

        C0426a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f23223g = atomicReference;
            this.f23224h = countDownLatch;
            this.f23225i = atomicReference2;
        }

        @Override // rx.i
        public void c(T t) {
            this.f23223g.set(t);
            this.f23224h.countDown();
        }

        @Override // rx.i
        public void onError(Throwable th) {
            this.f23225i.set(th);
            this.f23224h.countDown();
        }
    }

    private a(Single<? extends T> single) {
        this.a = single;
    }

    public static <T> a<T> a(Single<? extends T> single) {
        return new a<>(single);
    }

    public T b() {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        d.a(countDownLatch, this.a.t(new C0426a(atomicReference, countDownLatch, atomicReference2)));
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return (T) atomicReference.get();
        }
        throw rx.exceptions.a.c(th);
    }
}
