package rx.n.a;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Single;

/* compiled from: SingleOperatorZip.java */
/* loaded from: classes3.dex */
public final class r1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SingleOperatorZip.java */
    /* loaded from: classes3.dex */
    public static class a<R> implements Single.j<R> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Single[] f22823f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.m.h f22824g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: SingleOperatorZip.java */
        /* renamed from: rx.n.a.r1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0407a<T> extends rx.i<T> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object[] f22825g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f22826h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f22827i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ rx.i f22828j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f22829k;

            C0407a(Object[] objArr, int i2, AtomicInteger atomicInteger, rx.i iVar, AtomicBoolean atomicBoolean) {
                this.f22825g = objArr;
                this.f22826h = i2;
                this.f22827i = atomicInteger;
                this.f22828j = iVar;
                this.f22829k = atomicBoolean;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.i
            public void c(T t) {
                this.f22825g[this.f22826h] = t;
                if (this.f22827i.decrementAndGet() == 0) {
                    try {
                        this.f22828j.c(a.this.f22824g.call(this.f22825g));
                    } catch (Throwable th) {
                        rx.exceptions.a.e(th);
                        onError(th);
                    }
                }
            }

            @Override // rx.i
            public void onError(Throwable th) {
                if (this.f22829k.compareAndSet(false, true)) {
                    this.f22828j.onError(th);
                } else {
                    rx.q.c.j(th);
                }
            }
        }

        a(Single[] singleArr, rx.m.h hVar) {
            this.f22823f = singleArr;
            this.f22824g = hVar;
        }

        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(rx.i<? super R> iVar) {
            if (this.f22823f.length == 0) {
                iVar.onError(new NoSuchElementException("Can't zip 0 Singles."));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f22823f.length);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object[] objArr = new Object[this.f22823f.length];
            rx.t.b bVar = new rx.t.b();
            iVar.b(bVar);
            for (int i2 = 0; i2 < this.f22823f.length && !bVar.isUnsubscribed() && !atomicBoolean.get(); i2++) {
                C0407a c0407a = new C0407a(objArr, i2, atomicInteger, iVar, atomicBoolean);
                bVar.a(c0407a);
                if (bVar.isUnsubscribed() || atomicBoolean.get()) {
                    return;
                }
                this.f22823f[i2].t(c0407a);
            }
        }
    }

    public static <T, R> Single<R> a(Single<? extends T>[] singleArr, rx.m.h<? extends R> hVar) {
        return Single.b(new a(singleArr, hVar));
    }
}
