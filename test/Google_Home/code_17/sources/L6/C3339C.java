package l6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC3247p;

/* renamed from: l6.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3339C {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34529b = AtomicIntegerFieldUpdater.newUpdater(C3339C.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f34530a;

    public C3339C(Throwable th, boolean z8) {
        this.f34530a = th;
        this._handled = z8 ? 1 : 0;
    }

    public final boolean a() {
        if (f34529b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return f34529b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return Q.a(this) + '[' + this.f34530a + ']';
    }

    public /* synthetic */ C3339C(Throwable th, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this(th, (i8 & 2) != 0 ? false : z8);
    }
}
