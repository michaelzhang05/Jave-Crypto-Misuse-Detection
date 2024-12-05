package rx.o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.e;
import rx.j;
import rx.n.e.d;

/* compiled from: BlockingObservable.java */
/* loaded from: classes3.dex */
public final class a<T> {
    static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    static final Object f23187b = new Object();

    /* renamed from: c, reason: collision with root package name */
    static final Object f23188c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final e<? extends T> f23189d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BlockingObservable.java */
    /* renamed from: rx.o.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0423a extends j<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f23190f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AtomicReference f23191g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AtomicReference f23192h;

        C0423a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f23190f = countDownLatch;
            this.f23191g = atomicReference;
            this.f23192h = atomicReference2;
        }

        @Override // rx.f
        public void onCompleted() {
            this.f23190f.countDown();
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f23191g.set(th);
            this.f23190f.countDown();
        }

        @Override // rx.f
        public void onNext(T t) {
            this.f23192h.set(t);
        }
    }

    private a(e<? extends T> eVar) {
        this.f23189d = eVar;
    }

    private T a(e<? extends T> eVar) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        d.a(countDownLatch, eVar.E0(new C0423a(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            rx.exceptions.a.c((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    public static <T> a<T> c(e<? extends T> eVar) {
        return new a<>(eVar);
    }

    public T b() {
        return a(this.f23189d.E());
    }
}
