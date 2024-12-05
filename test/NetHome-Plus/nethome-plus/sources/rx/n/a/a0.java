package rx.n.a;

import java.util.NoSuchElementException;
import rx.Single;

/* compiled from: OnSubscribeSingle.java */
/* loaded from: classes3.dex */
public class a0<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    private final rx.e<T> f22470f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeSingle.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private boolean f22471f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f22472g;

        /* renamed from: h, reason: collision with root package name */
        private T f22473h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ rx.i f22474i;

        a(rx.i iVar) {
            this.f22474i = iVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22471f) {
                return;
            }
            if (this.f22472g) {
                this.f22474i.c(this.f22473h);
            } else {
                this.f22474i.onError(new NoSuchElementException("Observable emitted no items"));
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22474i.onError(th);
            unsubscribe();
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22472g) {
                this.f22471f = true;
                this.f22474i.onError(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
            } else {
                this.f22472g = true;
                this.f22473h = t;
            }
        }

        @Override // rx.j
        public void onStart() {
            request(2L);
        }
    }

    public a0(rx.e<T> eVar) {
        this.f22470f = eVar;
    }

    public static <T> a0<T> b(rx.e<T> eVar) {
        return new a0<>(eVar);
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super T> iVar) {
        a aVar = new a(iVar);
        iVar.b(aVar);
        this.f22470f.c1(aVar);
    }
}
