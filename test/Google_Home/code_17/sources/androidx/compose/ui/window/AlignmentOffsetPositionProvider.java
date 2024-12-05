package androidx.compose.ui.window;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3247p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j8, AbstractC3247p abstractC3247p) {
        this(alignment, j8);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo1015calculatePositionllwVHH4(IntRect intRect, long j8, LayoutDirection layoutDirection, long j9) {
        int i8;
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        long mo2613alignKFBX0sM = alignment.mo2613alignKFBX0sM(companion.m5354getZeroYbymL2g(), intRect.m5333getSizeYbymL2g(), layoutDirection);
        long mo2613alignKFBX0sM2 = this.alignment.mo2613alignKFBX0sM(companion.m5354getZeroYbymL2g(), j9, layoutDirection);
        long IntOffset = IntOffsetKt.IntOffset(-IntOffset.m5307getXimpl(mo2613alignKFBX0sM2), -IntOffset.m5308getYimpl(mo2613alignKFBX0sM2));
        int m5307getXimpl = IntOffset.m5307getXimpl(this.offset);
        if (layoutDirection == LayoutDirection.Ltr) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        long IntOffset2 = IntOffsetKt.IntOffset(m5307getXimpl * i8, IntOffset.m5308getYimpl(this.offset));
        long m5335getTopLeftnOccac = intRect.m5335getTopLeftnOccac();
        long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(m5335getTopLeftnOccac) + IntOffset.m5307getXimpl(mo2613alignKFBX0sM), IntOffset.m5308getYimpl(m5335getTopLeftnOccac) + IntOffset.m5308getYimpl(mo2613alignKFBX0sM));
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset3) + IntOffset.m5307getXimpl(IntOffset), IntOffset.m5308getYimpl(IntOffset3) + IntOffset.m5308getYimpl(IntOffset));
        return IntOffsetKt.IntOffset(IntOffset.m5307getXimpl(IntOffset4) + IntOffset.m5307getXimpl(IntOffset2), IntOffset.m5308getYimpl(IntOffset4) + IntOffset.m5308getYimpl(IntOffset2));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m5435getOffsetnOccac() {
        return this.offset;
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j8) {
        this.alignment = alignment;
        this.offset = j8;
    }
}
