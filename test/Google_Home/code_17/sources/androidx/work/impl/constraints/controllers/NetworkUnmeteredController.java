package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class NetworkUnmeteredController extends ConstraintController<NetworkState> {
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkUnmeteredController(ConstraintTracker<NetworkState> tracker) {
        super(tracker);
        AbstractC3255y.i(tracker, "tracker");
        this.reason = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        AbstractC3255y.i(workSpec, "workSpec");
        NetworkType requiredNetworkType = workSpec.constraints.getRequiredNetworkType();
        if (requiredNetworkType != NetworkType.UNMETERED && (Build.VERSION.SDK_INT < 30 || requiredNetworkType != NetworkType.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(NetworkState value) {
        AbstractC3255y.i(value, "value");
        return !value.isConnected() || value.isMetered();
    }
}
