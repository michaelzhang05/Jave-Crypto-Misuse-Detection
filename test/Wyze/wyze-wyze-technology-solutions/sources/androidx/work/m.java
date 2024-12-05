package androidx.work;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.l1;

/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class m<R> implements e.e.c.a.a.a<R> {

    /* renamed from: f, reason: collision with root package name */
    private final l1 f2140f;

    /* renamed from: g, reason: collision with root package name */
    private final androidx.work.impl.utils.o.c<R> f2141g;

    /* compiled from: ListenableFuture.kt */
    /* loaded from: classes.dex */
    static final class a extends Lambda implements Function1<Throwable, kotlin.u> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m<R> f2142f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<R> mVar) {
            super(1);
            this.f2142f = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.u invoke(Throwable th) {
            invoke2(th);
            return kotlin.u.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th == null) {
                if (!((m) this.f2142f).f2141g.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th instanceof CancellationException) {
                    ((m) this.f2142f).f2141g.cancel(true);
                    return;
                }
                androidx.work.impl.utils.o.c cVar = ((m) this.f2142f).f2141g;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                cVar.r(th);
            }
        }
    }

    public m(l1 l1Var, androidx.work.impl.utils.o.c<R> cVar) {
        kotlin.jvm.internal.l.f(l1Var, "job");
        kotlin.jvm.internal.l.f(cVar, "underlying");
        this.f2140f = l1Var;
        this.f2141g = cVar;
        l1Var.Y(new a(this));
    }

    public final void b(R r) {
        this.f2141g.q(r);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f2141g.cancel(z);
    }

    @Override // e.e.c.a.a.a
    public void d(Runnable runnable, Executor executor) {
        this.f2141g.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f2141g.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, TimeUnit timeUnit) {
        return this.f2141g.get(j2, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2141g.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f2141g.isDone();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ m(kotlinx.coroutines.l1 r1, androidx.work.impl.utils.o.c r2, int r3, kotlin.jvm.internal.g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            androidx.work.impl.utils.o.c r2 = androidx.work.impl.utils.o.c.u()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.l.e(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.m.<init>(kotlinx.coroutines.l1, androidx.work.impl.utils.o.c, int, kotlin.a0.d.g):void");
    }
}
