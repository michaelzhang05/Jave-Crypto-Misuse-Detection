package rx.n.e;

import java.util.List;
import rx.e;
import rx.exceptions.OnErrorNotImplementedException;
import rx.n.a.h0;

/* compiled from: InternalObservableUtils.java */
/* loaded from: classes3.dex */
public enum f {
    ;


    /* renamed from: f, reason: collision with root package name */
    public static final e f23100f = new rx.m.f<Long, Object, Long>() { // from class: rx.n.e.f.e
        @Override // rx.m.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Long l2, Object obj) {
            return Long.valueOf(l2.longValue() + 1);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final c f23101g = new rx.m.f<Object, Object, Boolean>() { // from class: rx.n.e.f.c
        @Override // rx.m.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    };

    /* renamed from: h, reason: collision with root package name */
    public static final h f23102h = new rx.m.e<List<? extends rx.e<?>>, rx.e<?>[]>() { // from class: rx.n.e.f.h
        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.e<?>[] call(List<? extends rx.e<?>> list) {
            return (rx.e[]) list.toArray(new rx.e[list.size()]);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    static final g f23103i = new rx.m.e<Object, Void>() { // from class: rx.n.e.f.g
        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Object obj) {
            return null;
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final d f23104j = new rx.m.f<Integer, Object, Integer>() { // from class: rx.n.e.f.d
        @Override // rx.m.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    static final b f23105k = new b();
    public static final rx.m.b<Throwable> l = new rx.m.b<Throwable>() { // from class: rx.n.e.f.a
        @Override // rx.m.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };
    public static final e.b<Boolean, Object> m = new h0(m.a(), true);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalObservableUtils.java */
    /* loaded from: classes3.dex */
    public static final class b implements rx.m.e<rx.d<?>, Throwable> {
        b() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(rx.d<?> dVar) {
            return dVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalObservableUtils.java */
    /* renamed from: rx.n.e.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0422f implements rx.m.e<rx.e<? extends rx.d<?>>, rx.e<?>> {

        /* renamed from: f, reason: collision with root package name */
        final rx.m.e<? super rx.e<? extends Throwable>, ? extends rx.e<?>> f23106f;

        public C0422f(rx.m.e<? super rx.e<? extends Throwable>, ? extends rx.e<?>> eVar) {
            this.f23106f = eVar;
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.e<?> call(rx.e<? extends rx.d<?>> eVar) {
            return this.f23106f.call(eVar.X(f.f23105k));
        }
    }

    public static rx.m.e<rx.e<? extends rx.d<?>>, rx.e<?>> d(rx.m.e<? super rx.e<? extends Throwable>, ? extends rx.e<?>> eVar) {
        return new C0422f(eVar);
    }
}
