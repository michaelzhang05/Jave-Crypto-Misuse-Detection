package androidx.window.layout;

import android.app.Activity;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* loaded from: classes3.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        AbstractC3255y.i(windowMetricsCalculator, "windowMetricsCalculator");
        AbstractC3255y.i(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public InterfaceC3706f windowLayoutInfo(Activity activity) {
        AbstractC3255y.i(activity, "activity");
        return AbstractC3708h.z(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }
}
