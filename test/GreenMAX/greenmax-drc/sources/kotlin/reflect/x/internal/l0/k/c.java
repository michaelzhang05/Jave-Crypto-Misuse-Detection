package kotlin.reflect.x.internal.l0.k;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.u;

/* compiled from: locks.kt */
/* loaded from: classes2.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f21155c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<InterruptedException, u> f21156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Lock lock, Runnable runnable, Function1<? super InterruptedException, u> function1) {
        super(lock);
        l.f(lock, "lock");
        l.f(runnable, "checkCancelled");
        l.f(function1, "interruptedExceptionHandler");
        this.f21155c = runnable;
        this.f21156d = function1;
    }

    @Override // kotlin.reflect.x.internal.l0.k.d, kotlin.reflect.x.internal.l0.k.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f21155c.run();
            } catch (InterruptedException e2) {
                this.f21156d.invoke(e2);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable runnable, Function1<? super InterruptedException, u> function1) {
        this(new ReentrantLock(), runnable, function1);
        l.f(runnable, "checkCancelled");
        l.f(function1, "interruptedExceptionHandler");
    }
}
