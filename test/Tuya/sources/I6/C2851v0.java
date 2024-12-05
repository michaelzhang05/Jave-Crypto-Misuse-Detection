package i6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: i6.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2851v0 extends AbstractC2859z0 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31806f = AtomicIntegerFieldUpdater.newUpdater(C2851v0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f31807e;

    public C2851v0(Function1 function1) {
        this.f31807e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return L5.I.f6487a;
    }

    @Override // i6.AbstractC2806E
    public void r(Throwable th) {
        if (f31806f.compareAndSet(this, 0, 1)) {
            this.f31807e.invoke(th);
        }
    }
}
