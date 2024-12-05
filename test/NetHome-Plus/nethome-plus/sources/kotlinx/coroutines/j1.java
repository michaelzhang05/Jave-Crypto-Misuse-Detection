package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
final class j1 extends m1 {

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22253j = AtomicIntegerFieldUpdater.newUpdater(j1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: k, reason: collision with root package name */
    private final Function1<Throwable, kotlin.u> f22254k;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(Function1<? super Throwable, kotlin.u> function1) {
        this.f22254k = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.u invoke(Throwable th) {
        v(th);
        return kotlin.u.a;
    }

    @Override // kotlinx.coroutines.y
    public void v(Throwable th) {
        if (f22253j.compareAndSet(this, 0, 1)) {
            this.f22254k.invoke(th);
        }
    }
}
