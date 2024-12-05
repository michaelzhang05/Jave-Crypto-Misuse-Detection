package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.D0;
import l6.I;
import l6.InterfaceC3337A;
import l6.InterfaceC3390x0;
import l6.N;

/* loaded from: classes3.dex */
public final class WorkConstraintsTrackerKt {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkConstraintsTracker");
        AbstractC3255y.h(tagWithPrefix, "tagWithPrefix(\"WorkConstraintsTracker\")");
        TAG = tagWithPrefix;
    }

    public static final InterfaceC3390x0 listen(WorkConstraintsTracker workConstraintsTracker, WorkSpec spec, I dispatcher, OnConstraintsStateChangedListener listener) {
        InterfaceC3337A b8;
        AbstractC3255y.i(workConstraintsTracker, "<this>");
        AbstractC3255y.i(spec, "spec");
        AbstractC3255y.i(dispatcher, "dispatcher");
        AbstractC3255y.i(listener, "listener");
        b8 = D0.b(null, 1, null);
        AbstractC3364k.d(N.a(dispatcher.plus(b8)), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, spec, listener, null), 3, null);
        return b8;
    }
}
