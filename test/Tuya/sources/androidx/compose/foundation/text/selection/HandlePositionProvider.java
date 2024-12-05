package androidx.compose.foundation.text.selection;

import L5.p;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    private final HandleReferencePoint handleReferencePoint;
    private final long offset;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            try {
                iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HandleReferencePoint.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HandleReferencePoint.TopMiddle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ HandlePositionProvider(HandleReferencePoint handleReferencePoint, long j8, AbstractC3151p abstractC3151p) {
        this(handleReferencePoint, j8);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo1010calculatePositionllwVHH4(IntRect anchorBounds, long j8, LayoutDirection layoutDirection, long j9) {
        AbstractC3159y.i(anchorBounds, "anchorBounds");
        AbstractC3159y.i(layoutDirection, "layoutDirection");
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.handleReferencePoint.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return IntOffsetKt.IntOffset((anchorBounds.getLeft() + IntOffset.m5302getXimpl(this.offset)) - (IntSize.m5344getWidthimpl(j9) / 2), anchorBounds.getTop() + IntOffset.m5303getYimpl(this.offset));
                }
                throw new p();
            }
            return IntOffsetKt.IntOffset((anchorBounds.getLeft() + IntOffset.m5302getXimpl(this.offset)) - IntSize.m5344getWidthimpl(j9), anchorBounds.getTop() + IntOffset.m5303getYimpl(this.offset));
        }
        return IntOffsetKt.IntOffset(anchorBounds.getLeft() + IntOffset.m5302getXimpl(this.offset), anchorBounds.getTop() + IntOffset.m5303getYimpl(this.offset));
    }

    private HandlePositionProvider(HandleReferencePoint handleReferencePoint, long j8) {
        AbstractC3159y.i(handleReferencePoint, "handleReferencePoint");
        this.handleReferencePoint = handleReferencePoint;
        this.offset = j8;
    }
}
