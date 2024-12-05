package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* loaded from: classes3.dex */
public abstract class ConstraintController<T> {
    private final ConstraintTracker<T> tracker;

    public ConstraintController(ConstraintTracker<T> tracker) {
        AbstractC3255y.i(tracker, "tracker");
        this.tracker = tracker;
    }

    public static /* synthetic */ void getReason$annotations() {
    }

    public abstract int getReason();

    public abstract boolean hasConstraint(WorkSpec workSpec);

    public final boolean isConstrained(WorkSpec workSpec) {
        AbstractC3255y.i(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained((ConstraintController<T>) this.tracker.readSystemState());
    }

    public abstract boolean isConstrained(T t8);

    public final InterfaceC3706f track() {
        return AbstractC3708h.e(new ConstraintController$track$1(this, null));
    }
}
