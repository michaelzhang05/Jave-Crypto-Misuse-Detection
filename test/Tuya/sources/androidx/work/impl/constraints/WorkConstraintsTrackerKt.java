package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import i6.AbstractC2829k;
import i6.D0;
import i6.I;
import i6.InterfaceC2802A;
import i6.InterfaceC2855x0;
import i6.N;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class WorkConstraintsTrackerKt {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkConstraintsTracker");
        AbstractC3159y.h(tagWithPrefix, "tagWithPrefix(\"WorkConstraintsTracker\")");
        TAG = tagWithPrefix;
    }

    public static final InterfaceC2855x0 listen(WorkConstraintsTracker workConstraintsTracker, WorkSpec spec, I dispatcher, OnConstraintsStateChangedListener listener) {
        InterfaceC2802A b8;
        AbstractC3159y.i(workConstraintsTracker, "<this>");
        AbstractC3159y.i(spec, "spec");
        AbstractC3159y.i(dispatcher, "dispatcher");
        AbstractC3159y.i(listener, "listener");
        b8 = D0.b(null, 1, null);
        AbstractC2829k.d(N.a(dispatcher.plus(b8)), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, spec, listener, null), 3, null);
        return b8;
    }
}
