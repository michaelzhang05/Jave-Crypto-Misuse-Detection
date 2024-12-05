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
        if (!Offset.m2737equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m2756getZeroF1C5BW0())) {
            pointerInputChange.consume();
        }
    }

    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m3965isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j8) {
        long m4021getPositionF1C5BW0 = pointerInputChange.m4021getPositionF1C5BW0();
        float m2740getXimpl = Offset.m2740getXimpl(m4021getPositionF1C5BW0);
        float m2741getYimpl = Offset.m2741getYimpl(m4021getPositionF1C5BW0);
        int m5349getWidthimpl = IntSize.m5349getWidthimpl(j8);
        int m5348getHeightimpl = IntSize.m5348getHeightimpl(j8);
        if (m2740getXimpl >= 0.0f && m2740getXimpl <= m5349getWidthimpl && m2741getYimpl >= 0.0f && m2741getYimpl <= m5348getHeightimpl) {
            return false;
        }
        return true;
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m3966isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j8, long j9) {
        if (!PointerType.m4082equalsimpl0(pointerInputChange.m4024getTypeT8wyACA(), PointerType.Companion.m4089getTouchT8wyACA())) {
            return m3965isOutOfBoundsO0kMr_c(pointerInputChange, j8);
        }
        long m4021getPositionF1C5BW0 = pointerInputChange.m4021getPositionF1C5BW0();
        float m2740getXimpl = Offset.m2740getXimpl(m4021getPositionF1C5BW0);
        float m2741getYimpl = Offset.m2741getYimpl(m4021getPositionF1C5BW0);
        float f8 = -Size.m2809getWidthimpl(j9);
        float m5349getWidthimpl = IntSize.m5349getWidthimpl(j8) + Size.m2809getWidthimpl(j9);
        float f9 = -Size.m2806getHeightimpl(j9);
        float m5348getHeightimpl = IntSize.m5348getHeightimpl(j8) + Size.m2806getHeightimpl(j9);
        if (m2740getXimpl >= f8 && m2740getXimpl <= m5349getWidthimpl && m2741getYimpl >= f9 && m2741getYimpl <= m5348getHeightimpl) {
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
        long m2744minusMKHz9U = Offset.m2744minusMKHz9U(pointerInputChange.m4021getPositionF1C5BW0(), pointerInputChange.m4022getPreviousPositionF1C5BW0());
        if (!z8 && pointerInputChange.isConsumed()) {
            return Offset.Companion.m2756getZeroF1C5BW0();
        }
        return m2744minusMKHz9U;
    }

    static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return positionChangeInternal(pointerInputChange, z8);
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        return !Offset.m2737equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m2756getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m2737equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m2756getZeroF1C5BW0());
    }
}
