package androidx.compose.runtime;

import O5.I;
import android.os.Build;
import androidx.compose.runtime.internal.FloatingPointEquality_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public class SnapshotMutableFloatStateImpl extends StateObjectImpl implements MutableFloatState, SnapshotMutableState<Float> {
    public static final int $stable = 0;
    private FloatStateStateRecord next;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class FloatStateStateRecord extends StateRecord {
        private float value;

        public FloatStateStateRecord(float f8) {
            this.value = f8;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC3255y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.value = ((FloatStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new FloatStateStateRecord(this.value);
        }

        public final float getValue() {
            return this.value;
        }

        public final void setValue(float f8) {
            this.value = f8;
        }
    }

    public SnapshotMutableFloatStateImpl(float f8) {
        this.next = new FloatStateStateRecord(f8);
    }

    @Override // androidx.compose.runtime.MutableState
    public Function1 component2() {
        return new SnapshotMutableFloatStateImpl$component2$1(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return ((FloatStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Float> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    public /* synthetic */ Float getValue() {
        return j.a(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        AbstractC3255y.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        AbstractC3255y.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        float value = ((FloatStateStateRecord) stateRecord2).getValue();
        float value2 = ((FloatStateStateRecord) stateRecord3).getValue();
        if (Build.VERSION.SDK_INT >= 23) {
            if (value == value2) {
                return stateRecord2;
            }
        } else if (!FloatingPointEquality_androidKt.isNan(value) && !FloatingPointEquality_androidKt.isNan(value2) && value == value2) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC3255y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (FloatStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public void setFloatValue(float f8) {
        Snapshot current;
        FloatStateStateRecord floatStateStateRecord = (FloatStateStateRecord) SnapshotKt.current(this.next);
        float value = floatStateStateRecord.getValue();
        if (Build.VERSION.SDK_INT >= 23) {
            if (value == f8) {
                return;
            }
        } else if (!FloatingPointEquality_androidKt.isNan(value) && !FloatingPointEquality_androidKt.isNan(f8) && value == f8) {
            return;
        }
        FloatStateStateRecord floatStateStateRecord2 = this.next;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((FloatStateStateRecord) SnapshotKt.overwritableRecord(floatStateStateRecord2, this, current, floatStateStateRecord)).setValue(f8);
            I i8 = I.f8278a;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public /* synthetic */ void setValue(float f8) {
        j.c(this, f8);
    }

    public String toString() {
        return "MutableFloatState(value=" + ((FloatStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Float component1() {
        return Float.valueOf(getFloatValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Float, java.lang.Object] */
    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ Float getValue() {
        ?? value;
        value = getValue();
        return value;
    }

    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(Float f8) {
        setValue(f8.floatValue());
    }
}
