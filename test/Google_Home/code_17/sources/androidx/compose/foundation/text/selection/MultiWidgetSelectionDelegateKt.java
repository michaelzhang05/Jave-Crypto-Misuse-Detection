package androidx.compose.foundation.text.selection;

import O5.r;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import g6.m;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegateKt {
    /* renamed from: access$getAssembledSelectionInfo-vJH6DeI */
    public static final /* synthetic */ Selection m1019access$getAssembledSelectionInfovJH6DeI(long j8, boolean z8, long j9, TextLayoutResult textLayoutResult) {
        return m1020getAssembledSelectionInfovJH6DeI(j8, z8, j9, textLayoutResult);
    }

    /* renamed from: getAssembledSelectionInfo-vJH6DeI */
    public static final Selection m1020getAssembledSelectionInfovJH6DeI(long j8, boolean z8, long j9, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m4697getStartimpl(j8)), TextRange.m4697getStartimpl(j8), j9), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m4692getEndimpl(j8) - 1, 0)), TextRange.m4692getEndimpl(j8), j9), z8);
    }

    /* renamed from: getOffsetForPosition-0AR0LA0 */
    public static final int m1021getOffsetForPosition0AR0LA0(TextLayoutResult textLayoutResult, Rect bounds, long j8) {
        AbstractC3255y.i(textLayoutResult, "textLayoutResult");
        AbstractC3255y.i(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.m2766containsk4lQ0M(j8)) {
            return m.k(textLayoutResult.m4669getOffsetForPositionk4lQ0M(j8), 0, length);
        }
        if (SelectionMode.Vertical.mo1075compare3MmeM6k$foundation_release(j8, bounds) < 0) {
            return 0;
        }
        return length;
    }

    /* renamed from: getTextSelectionInfo-yM0VcXU */
    public static final r m1022getTextSelectionInfoyM0VcXU(TextLayoutResult textLayoutResult, long j8, long j9, Offset offset, long j10, SelectionAdjustment adjustment, Selection selection, boolean z8) {
        int i8;
        TextRange textRange;
        AbstractC3255y.i(textLayoutResult, "textLayoutResult");
        AbstractC3255y.i(adjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m5349getWidthimpl(textLayoutResult.m4670getSizeYbymL2g()), IntSize.m5348getHeightimpl(textLayoutResult.m4670getSizeYbymL2g()));
        if (!SelectionMode.Vertical.m1076isSelected2x9bVx0$foundation_release(rect, j8, j9)) {
            return new r(null, Boolean.FALSE);
        }
        int m1021getOffsetForPosition0AR0LA0 = m1021getOffsetForPosition0AR0LA0(textLayoutResult, rect, j8);
        int m1021getOffsetForPosition0AR0LA02 = m1021getOffsetForPosition0AR0LA0(textLayoutResult, rect, j9);
        if (offset != null) {
            i8 = m1021getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.m2750unboximpl());
        } else {
            i8 = -1;
        }
        long TextRange = TextRangeKt.TextRange(m1021getOffsetForPosition0AR0LA0, m1021getOffsetForPosition0AR0LA02);
        if (selection != null) {
            textRange = TextRange.m4685boximpl(selection.m1024toTextRanged9O1mEE());
        } else {
            textRange = null;
        }
        long mo1025adjustZXO7KMw = adjustment.mo1025adjustZXO7KMw(textLayoutResult, TextRange, i8, z8, textRange);
        Selection m1020getAssembledSelectionInfovJH6DeI = m1020getAssembledSelectionInfovJH6DeI(mo1025adjustZXO7KMw, TextRange.m4696getReversedimpl(mo1025adjustZXO7KMw), j10, textLayoutResult);
        boolean z9 = true;
        boolean z10 = !AbstractC3255y.d(m1020getAssembledSelectionInfovJH6DeI, selection);
        if (!z8 ? m1021getOffsetForPosition0AR0LA02 == i8 : m1021getOffsetForPosition0AR0LA0 == i8) {
            if (!z10) {
                z9 = false;
            }
        }
        return new r(m1020getAssembledSelectionInfovJH6DeI, Boolean.valueOf(z9));
    }

    /* renamed from: getTextSelectionInfo-yM0VcXU$default */
    public static /* synthetic */ r m1023getTextSelectionInfoyM0VcXU$default(TextLayoutResult textLayoutResult, long j8, long j9, Offset offset, long j10, SelectionAdjustment selectionAdjustment, Selection selection, boolean z8, int i8, Object obj) {
        Selection selection2;
        boolean z9;
        if ((i8 & 64) != 0) {
            selection2 = null;
        } else {
            selection2 = selection;
        }
        if ((i8 & 128) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        return m1022getTextSelectionInfoyM0VcXU(textLayoutResult, j8, j9, offset, j10, selectionAdjustment, selection2, z9);
    }
}
