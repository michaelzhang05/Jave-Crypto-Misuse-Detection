package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;

/* loaded from: classes3.dex */
public abstract class ConstraintController<T> {
    private final ConstraintTracker<T> tracker;

    public ConstraintController(ConstraintTracker<T> tracker) {
        AbstractC3159y.i(tracker, "tracker");
        this.tracker = tracker;
    }

    public static /* synthetic */ void getReason$annotations() {
    }

    public abstract int getReason();

    public abstract boolean hasConstraint(WorkSpec workSpec);

    public final boolean isConstrained(WorkSpec workSpec) {
        AbstractC3159y.i(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained((ConstraintController<T>) this.tracker.readSystemState());
    }

    public abstract boolean isConstrained(T t8);

    public final InterfaceC3358f track() {
        return AbstractC3360h.e(new ConstraintController$track$1(this, null));
    }
}
