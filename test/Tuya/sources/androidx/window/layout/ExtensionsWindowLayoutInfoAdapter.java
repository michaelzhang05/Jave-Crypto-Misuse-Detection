package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ExtensionsWindowLayoutInfoAdapter {
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    private final boolean validBounds(Activity activity, Bounds bounds) {
        Rect bounds2 = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() != bounds2.width() && bounds.getHeight() != bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() < bounds2.width() && bounds.getHeight() < bounds2.height()) {
            return false;
        }
        if (bounds.getWidth() == bounds2.width() && bounds.getHeight() == bounds2.height()) {
            return false;
        }
        return true;
    }

    public final FoldingFeature translate$window_release(Activity activity, androidx.window.extensions.layout.FoldingFeature oemFeature) {
        HardwareFoldingFeature.Type fold;
        FoldingFeature.State state;
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            fold = HardwareFoldingFeature.Type.Companion.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        int state2 = oemFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.FLAT;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = FoldingFeature.State.HALF_OPENED;
        }
        Rect bounds = oemFeature.getBounds();
        AbstractC3159y.h(bounds, "oemFeature.bounds");
        if (!validBounds(activity, new Bounds(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        AbstractC3159y.h(bounds2, "oemFeature.bounds");
        return new HardwareFoldingFeature(new Bounds(bounds2), fold, state);
    }

    public final WindowLayoutInfo translate$window_release(Activity activity, androidx.window.extensions.layout.WindowLayoutInfo info) {
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(info, "info");
        List<androidx.window.extensions.layout.DisplayFeature> displayFeatures = info.getDisplayFeatures();
        AbstractC3159y.h(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.DisplayFeature displayFeature : displayFeatures) {
        }
        return new WindowLayoutInfo(arrayList);
    }
}
