package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.isConsumed() && !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        if (!pointerInputChange.isConsumed() && pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed()) {
            return true;
        }
        return false;
    }

    public static final void consumeAllChanges(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    public static final void consumeDownChange(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    public static final void consumePositionChange(PointerInputChange pointerInputChange) {
        if (!Offset.m2732equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m2751getZeroF1C5BW0())) {
            pointerInputChange.consume();
        }
    }

    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m3960isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j8) {
        long m4016getPositionF1C5BW0 = pointerInputChange.m4016getPositionF1C5BW0();
        float m2735getXimpl = Offset.m2735getXimpl(m4016getPositionF1C5BW0);
        float m2736getYimpl = Offset.m2736getYimpl(m4016getPositionF1C5BW0);
        int m5344getWidthimpl = IntSize.m5344getWidthimpl(j8);
        int m5343getHeightimpl = IntSize.m5343getHeightimpl(j8);
        if (m2735getXimpl >= 0.0f && m2735getXimpl <= m5344getWidthimpl && m2736getYimpl >= 0.0f && m2736getYimpl <= m5343getHeightimpl) {
            return false;
        }
        return true;
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m3961isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j8, long j9) {
        if (!PointerType.m4077equalsimpl0(pointerInputChange.m4019getTypeT8wyACA(), PointerType.Companion.m4084getTouchT8wyACA())) {
            return m3960isOutOfBoundsO0kMr_c(pointerInputChange, j8);
        }
        long m4016getPositionF1C5BW0 = pointerInputChange.m4016getPositionF1C5BW0();
        float m2735getXimpl = Offset.m2735getXimpl(m4016getPositionF1C5BW0);
        float m2736getYimpl = Offset.m2736getYimpl(m4016getPositionF1C5BW0);
        float f8 = -Size.m2804getWidthimpl(j9);
        float m5344getWidthimpl = IntSize.m5344getWidthimpl(j8) + Size.m2804getWidthimpl(j9);
        float f9 = -Size.m2801getHeightimpl(j9);
        float m5343getHeightimpl = IntSize.m5343getHeightimpl(j8) + Size.m2801getHeightimpl(j9);
        if (m2735getXimpl >= f8 && m2735getXimpl <= m5344getWidthimpl && m2736getYimpl >= f9 && m2736getYimpl <= m5343getHeightimpl) {
            return false;
        }
        return true;
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z8) {
        long m2739minusMKHz9U = Offset.m2739minusMKHz9U(pointerInputChange.m4016getPositionF1C5BW0(), pointerInputChange.m4017getPreviousPositionF1C5BW0());
        if (!z8 && pointerInputChange.isConsumed()) {
            return Offset.Companion.m2751getZeroF1C5BW0();
        }
        return m2739minusMKHz9U;
    }

    static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return positionChangeInternal(pointerInputChange, z8);
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        return !Offset.m2732equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m2751getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m2732equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m2751getZeroF1C5BW0());
    }
}
