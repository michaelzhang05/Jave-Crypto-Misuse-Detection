package l6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: l6.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3386v0 extends AbstractC3394z0 {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34658f = AtomicIntegerFieldUpdater.newUpdater(C3386v0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f34659e;

    public C3386v0(Function1 function1) {
        this.f34659e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return O5.I.f8278a;
    }

    @Override // l6.AbstractC3341E
    public void r(Throwable th) {
        if (f34658f.compareAndSet(this, 0, 1)) {
            this.f34659e.invoke(th);
        }
    }
}
