package rx.n.a;

import java.util.NoSuchElementException;
import rx.e;

/* compiled from: OperatorSingle.java */
/* loaded from: classes3.dex */
public final class w0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22892f;

    /* renamed from: g, reason: collision with root package name */
    private final T f22893g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSingle.java */
    /* loaded from: classes3.dex */
    public static final class a {
        static final w0<?> a = new w0<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorSingle.java */
    /* loaded from: classes3.dex */
    public static final class b<T> extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        private final rx.j<? super T> f22894f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f22895g;

        /* renamed from: h, reason: collision with root package name */
        private final T f22896h;

        /* renamed from: i, reason: collision with root package name */
        private T f22897i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f22898j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f22899k;

        b(rx.j<? super T> jVar, boolean z, T t) {
            this.f22894f = jVar;
            this.f22895g = z;
            this.f22896h = t;
            request(2L);
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22899k) {
                return;
            }
            if (this.f22898j) {
                this.f22894f.setProducer(new rx.n.b.c(this.f22894f, this.f22897i));
            } else if (this.f22895g) {
                this.f22894f.setProducer(new rx.n.b.c(this.f22894f, this.f22896h));
            } else {
                this.f22894f.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            if (this.f22899k) {
                rx.q.c.j(th);
            } else {
                this.f22894f.onError(th);
            }
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22899k) {
                return;
            }
            if (this.f22898j) {
                this.f22899k = true;
                this.f22894f.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            } else {
                this.f22897i = t;
                this.f22898j = true;
            }
        }
    }

    w0() {
        this(false, null);
    }

    public static <T> w0<T> b() {
        return (w0<T>) a.a;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        b bVar = new b(jVar, this.f22892f, this.f22893g);
        jVar.add(bVar);
        return bVar;
    }

    private w0(boolean z, T t) {
        this.f22892f = z;
        this.f22893g = t;
    }
}
