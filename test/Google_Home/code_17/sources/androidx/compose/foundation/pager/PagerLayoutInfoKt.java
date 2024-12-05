package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class PagerLayoutInfoKt {
    public static final int getMainAxisViewportSize(PagerLayoutInfo pagerLayoutInfo) {
        AbstractC3255y.i(pagerLayoutInfo, "<this>");
        if (pagerLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m5348getHeightimpl(pagerLayoutInfo.mo817getViewportSizeYbymL2g());
        }
        return IntSize.m5349getWidthimpl(pagerLayoutInfo.mo817getViewportSizeYbymL2g());
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getMainAxisViewportSize$annotations(PagerLayoutInfo pagerLayoutInfo) {
    }
}
