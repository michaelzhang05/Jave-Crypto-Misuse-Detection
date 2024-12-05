package rx.n.a;

import java.util.concurrent.TimeUnit;
import rx.e;
import rx.h;

/* compiled from: OnSubscribeTimerPeriodically.java */
/* loaded from: classes3.dex */
public final class g0 implements e.a<Long> {

    /* renamed from: f, reason: collision with root package name */
    final long f22584f;

    /* renamed from: g, reason: collision with root package name */
    final long f22585g;

    /* renamed from: h, reason: collision with root package name */
    final TimeUnit f22586h;

    /* renamed from: i, reason: collision with root package name */
    final rx.h f22587i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnSubscribeTimerPeriodically.java */
    /* loaded from: classes3.dex */
    public class a implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        long f22588f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ rx.j f22589g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h.a f22590h;

        a(rx.j jVar, h.a aVar) {
            this.f22589g = jVar;
            this.f22590h = aVar;
        }

        @Override // rx.m.a
        public void call() {
            try {
                rx.j jVar = this.f22589g;
                long j2 = this.f22588f;
                this.f22588f = 1 + j2;
                jVar.onNext(Long.valueOf(j2));
            } catch (Throwable th) {
                try {
                    this.f22590h.unsubscribe();
                } finally {
                    rx.exceptions.a.f(th, this.f22589g);
                }
            }
        }
    }

    public g0(long j2, long j3, TimeUnit timeUnit, rx.h hVar) {
        this.f22584f = j2;
        this.f22585g = j3;
        this.f22586h = timeUnit;
        this.f22587i = hVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super Long> jVar) {
        h.a createWorker = this.f22587i.createWorker();
        jVar.add(createWorker);
        createWorker.e(new a(jVar, createWorker), this.f22584f, this.f22585g, this.f22586h);
    }
}
