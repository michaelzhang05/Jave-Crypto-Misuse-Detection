package i6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: i6.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2804C {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31677b = AtomicIntegerFieldUpdater.newUpdater(C2804C.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f31678a;

    public C2804C(Throwable th, boolean z8) {
        this.f31678a = th;
        this._handled = z8 ? 1 : 0;
    }

    public final boolean a() {
        if (f31677b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return f31677b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return Q.a(this) + '[' + this.f31678a + ']';
    }

    public /* synthetic */ C2804C(Throwable th, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this(th, (i8 & 2) != 0 ? false : z8);
    }
}
