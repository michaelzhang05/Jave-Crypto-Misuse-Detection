package androidx.compose.foundation.text.selection;

import L5.p;
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
import d6.m;
import kotlin.jvm.internal.AbstractC3159y;

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
    public static final long m1064calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager manager, long j8) {
        int i8;
        AbstractC3159y.i(manager, "manager");
        Selection selection = manager.getSelection();
        if (selection == null) {
            return Offset.Companion.m2750getUnspecifiedF1C5BW0();
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
        return Offset.Companion.m2750getUnspecifiedF1C5BW0();
    }

    private static final long calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(SelectionManager selectionManager, long j8, Selection.AnchorInfo anchorInfo, boolean z8) {
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.Companion.m2750getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m2750getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m2750getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (!z8) {
            offset--;
        }
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.Companion.m2750getUnspecifiedF1C5BW0();
        }
        Offset m1050getCurrentDragPosition_m7T9E = selectionManager.m1050getCurrentDragPosition_m7T9E();
        AbstractC3159y.f(m1050getCurrentDragPosition_m7T9E);
        float m2735getXimpl = Offset.m2735getXimpl(layoutCoordinates.mo4139localPositionOfR5De75A(containerLayoutCoordinates, m1050getCurrentDragPosition_m7T9E.m2745unboximpl()));
        long mo1012getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo1012getRangeOfLineContainingjx7JFs(offset);
        Rect boundingBox = anchorSelectable$foundation_release.getBoundingBox(TextRange.m4690getMinimpl(mo1012getRangeOfLineContainingjx7JFs));
        Rect boundingBox2 = anchorSelectable$foundation_release.getBoundingBox(m.d(TextRange.m4689getMaximpl(mo1012getRangeOfLineContainingjx7JFs) - 1, TextRange.m4690getMinimpl(mo1012getRangeOfLineContainingjx7JFs)));
        float j9 = m.j(m2735getXimpl, Math.min(boundingBox.getLeft(), boundingBox2.getLeft()), Math.max(boundingBox.getRight(), boundingBox2.getRight()));
        if (Math.abs(m2735getXimpl - j9) > IntSize.m5344getWidthimpl(j8) / 2) {
            return Offset.Companion.m2750getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo4139localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(j9, Offset.m2736getYimpl(anchorSelectable$foundation_release.getBoundingBox(offset).m2765getCenterF1C5BW0())));
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1065containsInclusiveUv8p0NA(Rect containsInclusive, long j8) {
        AbstractC3159y.i(containsInclusive, "$this$containsInclusive");
        float left = containsInclusive.getLeft();
        float right = containsInclusive.getRight();
        float m2735getXimpl = Offset.m2735getXimpl(j8);
        if (left <= m2735getXimpl && m2735getXimpl <= right) {
            float top = containsInclusive.getTop();
            float bottom = containsInclusive.getBottom();
            float m2736getYimpl = Offset.m2736getYimpl(j8);
            if (top <= m2736getYimpl && m2736getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    public static final AnnotatedString getCurrentSelectedText(Selectable selectable, Selection selection) {
        AbstractC3159y.i(selectable, "selectable");
        AbstractC3159y.i(selection, "selection");
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
        AbstractC3159y.i(layoutCoordinates, "<this>");
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m2773Rect0a9Yr6o(layoutCoordinates.mo4143windowToLocalMKHz9U(boundsInWindow.m2770getTopLeftF1C5BW0()), layoutCoordinates.mo4143windowToLocalMKHz9U(boundsInWindow.m2764getBottomRightF1C5BW0()));
    }
}
