package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
public final class r0<T> extends kotlinx.coroutines.internal.t<T> {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f22269i = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public r0(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
        this._decision = 0;
    }

    private final boolean u0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f22269i.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean v0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f22269i.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.r1
    public void k(Object obj) {
        o0(obj);
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.c
    protected void o0(Object obj) {
        Continuation b2;
        if (u0()) {
            return;
        }
        b2 = kotlin.coroutines.intrinsics.c.b(this.f22240h);
        kotlinx.coroutines.internal.f.c(b2, z.a(obj, this.f22240h), null, 2, null);
    }

    public final Object t0() {
        Object c2;
        if (v0()) {
            c2 = kotlin.coroutines.intrinsics.d.c();
            return c2;
        }
        Object h2 = s1.h(E());
        if (h2 instanceof w) {
            throw ((w) h2).f22295b;
        }
        return h2;
    }
}
