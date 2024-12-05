package rx.n.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import rx.e;

/* compiled from: OperatorToObservableSortedList.java */
/* loaded from: classes3.dex */
public final class f1<T> implements e.b<List<T>, T> {

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator f22571f = new c();

    /* renamed from: g, reason: collision with root package name */
    final Comparator<? super T> f22572g;

    /* renamed from: h, reason: collision with root package name */
    final int f22573h;

    /* compiled from: OperatorToObservableSortedList.java */
    /* loaded from: classes3.dex */
    class a implements Comparator<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.m.f f22574f;

        a(rx.m.f fVar) {
            this.f22574f = fVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return ((Integer) this.f22574f.a(t, t2)).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorToObservableSortedList.java */
    /* loaded from: classes3.dex */
    public class b extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        List<T> f22576f;

        /* renamed from: g, reason: collision with root package name */
        boolean f22577g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.n.b.b f22578h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ rx.j f22579i;

        b(rx.n.b.b bVar, rx.j jVar) {
            this.f22578h = bVar;
            this.f22579i = jVar;
            this.f22576f = new ArrayList(f1.this.f22573h);
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22577g) {
                return;
            }
            this.f22577g = true;
            List<T> list = this.f22576f;
            this.f22576f = null;
            try {
                Collections.sort(list, f1.this.f22572g);
                this.f22578h.b(list);
            } catch (Throwable th) {
                rx.exceptions.a.f(th, this);
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22579i.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22577g) {
                return;
            }
            this.f22576f.add(t);
        }

        @Override // rx.j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: OperatorToObservableSortedList.java */
    /* loaded from: classes3.dex */
    static final class c implements Comparator<Object> {
        c() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public f1(rx.m.f<? super T, ? super T, Integer> fVar, int i2) {
        this.f22573h = i2;
        this.f22572g = new a(fVar);
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super List<T>> jVar) {
        rx.n.b.b bVar = new rx.n.b.b(jVar);
        b bVar2 = new b(bVar, jVar);
        jVar.add(bVar2);
        jVar.setProducer(bVar);
        return bVar2;
    }
}
