package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class PagerLayoutInfoKt {
    public static final int getMainAxisViewportSize(PagerLayoutInfo pagerLayoutInfo) {
        AbstractC3159y.i(pagerLayoutInfo, "<this>");
        if (pagerLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m5343getHeightimpl(pagerLayoutInfo.mo812getViewportSizeYbymL2g());
        }
        return IntSize.m5344getWidthimpl(pagerLayoutInfo.mo812getViewportSizeYbymL2g());
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getMainAxisViewportSize$annotations(PagerLayoutInfo pagerLayoutInfo) {
    }
}
