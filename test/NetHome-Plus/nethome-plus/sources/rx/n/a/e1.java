package rx.n.a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx.e;

/* compiled from: OperatorToObservableList.java */
/* loaded from: classes3.dex */
public final class e1<T> implements e.b<List<T>, T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorToObservableList.java */
    /* loaded from: classes3.dex */
    public class a extends rx.j<T> {

        /* renamed from: f, reason: collision with root package name */
        boolean f22555f;

        /* renamed from: g, reason: collision with root package name */
        List<T> f22556g = new LinkedList();

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ rx.n.b.b f22557h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ rx.j f22558i;

        a(rx.n.b.b bVar, rx.j jVar) {
            this.f22557h = bVar;
            this.f22558i = jVar;
        }

        @Override // rx.f
        public void onCompleted() {
            if (this.f22555f) {
                return;
            }
            this.f22555f = true;
            try {
                ArrayList arrayList = new ArrayList(this.f22556g);
                this.f22556g = null;
                this.f22557h.b(arrayList);
            } catch (Throwable th) {
                rx.exceptions.a.f(th, this);
            }
        }

        @Override // rx.f
        public void onError(Throwable th) {
            this.f22558i.onError(th);
        }

        @Override // rx.f
        public void onNext(T t) {
            if (this.f22555f) {
                return;
            }
            this.f22556g.add(t);
        }

        @Override // rx.j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OperatorToObservableList.java */
    /* loaded from: classes3.dex */
    public static final class b {
        static final e1<Object> a = new e1<>();
    }

    e1() {
    }

    public static <T> e1<T> b() {
        return (e1<T>) b.a;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super List<T>> jVar) {
        rx.n.b.b bVar = new rx.n.b.b(jVar);
        a aVar = new a(bVar, jVar);
        jVar.add(aVar);
        jVar.setProducer(bVar);
        return aVar;
    }
}
