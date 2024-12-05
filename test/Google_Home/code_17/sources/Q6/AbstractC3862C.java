package q6;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l6.N0;

/* renamed from: q6.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3862C extends AbstractC3870e implements N0 {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38360d = AtomicIntegerFieldUpdater.newUpdater(AbstractC3862C.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f38361c;
    private volatile int cleanedAndPointers;

    public AbstractC3862C(long j8, AbstractC3862C abstractC3862C, int i8) {
        super(abstractC3862C);
        this.f38361c = j8;
        this.cleanedAndPointers = i8 << 16;
    }

    @Override // q6.AbstractC3870e
    public boolean h() {
        if (f38360d.get(this) == n() && !i()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (f38360d.addAndGet(this, SupportMenu.CATEGORY_MASK) == n() && !i()) {
            return true;
        }
        return false;
    }

    public abstract int n();

    public abstract void o(int i8, Throwable th, S5.g gVar);

    public final void p() {
        if (f38360d.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38360d;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}
