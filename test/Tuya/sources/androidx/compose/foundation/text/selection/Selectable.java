package androidx.compose.foundation.text.selection;

import L5.r;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes.dex */
public interface Selectable {
    Rect getBoundingBox(int i8);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo1011getHandlePositiondBAh8RU(Selection selection, boolean z8);

    int getLastVisibleOffset();

    LayoutCoordinates getLayoutCoordinates();

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo1012getRangeOfLineContainingjx7JFs(int i8);

    Selection getSelectAllSelection();

    long getSelectableId();

    AnnotatedString getText();

    /* renamed from: updateSelection-qCDeeow */
    r mo1013updateSelectionqCDeeow(long j8, long j9, Offset offset, boolean z8, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection);
}
