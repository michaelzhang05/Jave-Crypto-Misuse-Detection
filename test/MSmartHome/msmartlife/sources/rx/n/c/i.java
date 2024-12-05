package rx.n.c;

import java.util.concurrent.TimeUnit;
import rx.h;

/* compiled from: SchedulePeriodicHelper.java */
/* loaded from: classes3.dex */
public final class i {
    public static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SchedulePeriodicHelper.java */
    /* loaded from: classes3.dex */
    public static class a implements rx.m.a {

        /* renamed from: f, reason: collision with root package name */
        long f23041f;

        /* renamed from: g, reason: collision with root package name */
        long f23042g;

        /* renamed from: h, reason: collision with root package name */
        long f23043h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f23044i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f23045j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ rx.m.a f23046k;
        final /* synthetic */ rx.n.d.a l;
        final /* synthetic */ b m;
        final /* synthetic */ h.a n;
        final /* synthetic */ long o;

        a(long j2, long j3, rx.m.a aVar, rx.n.d.a aVar2, b bVar, h.a aVar3, long j4) {
            this.f23044i = j2;
            this.f23045j = j3;
            this.f23046k = aVar;
            this.l = aVar2;
            this.m = bVar;
            this.n = aVar3;
            this.o = j4;
            this.f23042g = j2;
            this.f23043h = j3;
        }

        @Override // rx.m.a
        public void call() {
            long j2;
            this.f23046k.call();
            if (this.l.isUnsubscribed()) {
                return;
            }
            b bVar = this.m;
            long a = bVar != null ? bVar.a() : TimeUnit.MILLISECONDS.toNanos(this.n.b());
            long j3 = i.a;
            long j4 = a + j3;
            long j5 = this.f23042g;
            if (j4 >= j5) {
                long j6 = this.o;
                if (a < j5 + j6 + j3) {
                    long j7 = this.f23043h;
                    long j8 = this.f23041f + 1;
                    this.f23041f = j8;
                    j2 = j7 + (j8 * j6);
                    this.f23042g = a;
                    this.l.b(this.n.d(this, j2 - a, TimeUnit.NANOSECONDS));
                }
            }
            long j9 = this.o;
            long j10 = a + j9;
            long j11 = this.f23041f + 1;
            this.f23041f = j11;
            this.f23043h = j10 - (j9 * j11);
            j2 = j10;
            this.f23042g = a;
            this.l.b(this.n.d(this, j2 - a, TimeUnit.NANOSECONDS));
        }
    }

    /* compiled from: SchedulePeriodicHelper.java */
    /* loaded from: classes3.dex */
    public interface b {
        long a();
    }

    public static rx.k a(h.a aVar, rx.m.a aVar2, long j2, long j3, TimeUnit timeUnit, b bVar) {
        long nanos = timeUnit.toNanos(j3);
        long a2 = bVar != null ? bVar.a() : TimeUnit.MILLISECONDS.toNanos(aVar.b());
        long nanos2 = timeUnit.toNanos(j2) + a2;
        rx.n.d.a aVar3 = new rx.n.d.a();
        rx.n.d.a aVar4 = new rx.n.d.a(aVar3);
        aVar3.b(aVar.d(new a(a2, nanos2, aVar2, aVar4, bVar, aVar, nanos), j2, timeUnit));
        return aVar4;
    }
}
