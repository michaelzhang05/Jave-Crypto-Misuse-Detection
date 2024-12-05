package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 0;
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: isReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final boolean m2611isReadInh_f27i8$runtime_release(int i8) {
        if ((i8 & ReaderKind.m2596constructorimpl(this.readerKind.get())) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return c.a(this, stateRecord, stateRecord2, stateRecord3);
    }

    /* renamed from: recordReadIn-h_f27i8$runtime_release, reason: not valid java name */
    public final void m2612recordReadInh_f27i8$runtime_release(int i8) {
        int m2596constructorimpl;
        do {
            m2596constructorimpl = ReaderKind.m2596constructorimpl(this.readerKind.get());
            if ((m2596constructorimpl & i8) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(m2596constructorimpl, ReaderKind.m2596constructorimpl(m2596constructorimpl | i8)));
    }
}
