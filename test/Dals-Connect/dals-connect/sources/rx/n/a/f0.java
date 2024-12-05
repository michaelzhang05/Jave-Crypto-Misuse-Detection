package rx.n.a;

import java.util.concurrent.TimeUnit;
import rx.e;
import rx.h;

/* compiled from: OnSubscribeTimerOnce.java */
/* loaded from: classes3.dex */
public final class f0 implements e.a<Long> {

    /* renamed from: f, reason: collision with root package name */
    final long f22566f;

    /* renamed from: g, reason: collision with root package name */
    final TimeUnit f22567g;

    /* renamed from: h, reason: collision with root package name */
    final rx.h f22568h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeTimerOnce.java */
    /* loaded from: classes3.dex */
    public class a implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ rx.j f22569f;

        a(rx.j jVar) {
            this.f22569f = jVar;
        }

        @Override // rx.m.a
        public void call() {
            try {
                this.f22569f.onNext(0L);
                this.f22569f.onCompleted();
            } catch (Throwable th) {
                rx.exceptions.a.f(th, this.f22569f);
            }
        }
    }

    public f0(long j2, TimeUnit timeUnit, rx.h hVar) {
        this.f22566f = j2;
        this.f22567g = timeUnit;
        this.f22568h = hVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super Long> jVar) {
        h.a createWorker = this.f22568h.createWorker();
        jVar.add(createWorker);
        createWorker.d(new a(jVar), this.f22566f, this.f22567g);
    }
}
