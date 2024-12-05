package androidx.compose.foundation.text.selection;

import O5.p;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import g6.m;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class SelectionManagerKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1069calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager manager, long j8) {
        int i8;
        AbstractC3255y.i(manager, "manager");
        Selection selection = manager.getSelection();
        if (selection == null) {
            return Offset.Companion.m2755getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        if (draggingHandle == null) {
            i8 = -1;
        } else {
            i8 = WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        }
        if (i8 != -1) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new p();
                    }
                    throw new IllegalStateException("SelectionContainer does not support cursor".toString());
                }
                return calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(manager, j8, selection.getEnd(), false);
            }
            return calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(manager, j8, selection.getStart(), true);
        }
        return Offset.Companion.m2755getUnspecifiedF1C5BW0();
    }

    private static final long calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(SelectionManager selectionManager, long j8, Selection.AnchorInfo anchorInfo, boolean z8) {
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.Companion.m2755getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m2755getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m2755getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (!z8) {
            offset--;
        }
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.Companion.m2755getUnspecifiedF1C5BW0();
        }
        Offset m1055getCurrentDragPosition_m7T9E = selectionManager.m1055getCurrentDragPosition_m7T9E();
        AbstractC3255y.f(m1055getCurrentDragPosition_m7T9E);
        float m2740getXimpl = Offset.m2740getXimpl(layoutCoordinates.mo4144localPositionOfR5De75A(containerLayoutCoordinates, m1055getCurrentDragPosition_m7T9E.m2750unboximpl()));
        long mo1017getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo1017getRangeOfLineContainingjx7JFs(offset);
        Rect boundingBox = anchorSelectable$foundation_release.getBoundingBox(TextRange.m4695getMinimpl(mo1017getRangeOfLineContainingjx7JFs));
        Rect boundingBox2 = anchorSelectable$foundation_release.getBoundingBox(m.d(TextRange.m4694getMaximpl(mo1017getRangeOfLineContainingjx7JFs) - 1, TextRange.m4695getMinimpl(mo1017getRangeOfLineContainingjx7JFs)));
        float j9 = m.j(m2740getXimpl, Math.min(boundingBox.getLeft(), boundingBox2.getLeft()), Math.max(boundingBox.getRight(), boundingBox2.getRight()));
        if (Math.abs(m2740getXimpl - j9) > IntSize.m5349getWidthimpl(j8) / 2) {
            return Offset.Companion.m2755getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo4144localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(j9, Offset.m2741getYimpl(anchorSelectable$foundation_release.getBoundingBox(offset).m2770getCenterF1C5BW0())));
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1070containsInclusiveUv8p0NA(Rect containsInclusive, long j8) {
        AbstractC3255y.i(containsInclusive, "$this$containsInclusive");
        float left = containsInclusive.getLeft();
        float right = containsInclusive.getRight();
        float m2740getXimpl = Offset.m2740getXimpl(j8);
        if (left <= m2740getXimpl && m2740getXimpl <= right) {
            float top = containsInclusive.getTop();
            float bottom = containsInclusive.getBottom();
            float m2741getYimpl = Offset.m2741getYimpl(j8);
            if (top <= m2741getYimpl && m2741getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    public static final AnnotatedString getCurrentSelectedText(Selectable selectable, Selection selection) {
        AbstractC3255y.i(selectable, "selectable");
        AbstractC3255y.i(selection, "selection");
        AnnotatedString text = selectable.getText();
        if (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId()) {
            if (selectable.getSelectableId() == selection.getStart().getSelectableId() && selectable.getSelectableId() == selection.getEnd().getSelectableId()) {
                if (selection.getHandlesCrossed()) {
                    return text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset());
                }
                return text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
            }
            if (selectable.getSelectableId() == selection.getStart().getSelectableId()) {
                if (selection.getHandlesCrossed()) {
                    return text.subSequence(0, selection.getStart().getOffset());
                }
                return text.subSequence(selection.getStart().getOffset(), text.length());
            }
            if (selection.getHandlesCrossed()) {
                return text.subSequence(selection.getEnd().getOffset(), text.length());
            }
            return text.subSequence(0, selection.getEnd().getOffset());
        }
        return text;
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection merge;
        if (selection != null && (merge = selection.merge(selection2)) != null) {
            return merge;
        }
        return selection2;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        AbstractC3255y.i(layoutCoordinates, "<this>");
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m2778Rect0a9Yr6o(layoutCoordinates.mo4148windowToLocalMKHz9U(boundsInWindow.m2775getTopLeftF1C5BW0()), layoutCoordinates.mo4148windowToLocalMKHz9U(boundsInWindow.m2769getBottomRightF1C5BW0()));
    }
}
