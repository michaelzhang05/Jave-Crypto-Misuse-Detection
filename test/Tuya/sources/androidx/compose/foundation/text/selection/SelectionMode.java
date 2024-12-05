package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public enum SelectionMode {
    Vertical { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo1070compare3MmeM6k$foundation_release(long j8, Rect bounds) {
            AbstractC3159y.i(bounds, "bounds");
            if (bounds.m2761containsk4lQ0M(j8)) {
                return 0;
            }
            if (Offset.m2736getYimpl(j8) < bounds.getTop()) {
                return -1;
            }
            if (Offset.m2735getXimpl(j8) < bounds.getLeft() && Offset.m2736getYimpl(j8) < bounds.getBottom()) {
                return -1;
            }
            return 1;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo1070compare3MmeM6k$foundation_release(long j8, Rect bounds) {
            AbstractC3159y.i(bounds, "bounds");
            if (bounds.m2761containsk4lQ0M(j8)) {
                return 0;
            }
            if (Offset.m2735getXimpl(j8) < bounds.getLeft()) {
                return -1;
            }
            if (Offset.m2736getYimpl(j8) < bounds.getTop() && Offset.m2735getXimpl(j8) < bounds.getRight()) {
                return -1;
            }
            return 1;
        }
    };

    /* synthetic */ SelectionMode(AbstractC3151p abstractC3151p) {
        this();
    }

    /* renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo1070compare3MmeM6k$foundation_release(long j8, Rect rect);

    /* renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m1071isSelected2x9bVx0$foundation_release(Rect bounds, long j8, long j9) {
        boolean z8;
        AbstractC3159y.i(bounds, "bounds");
        boolean z9 = true;
        if (bounds.m2761containsk4lQ0M(j8) || bounds.m2761containsk4lQ0M(j9)) {
            return true;
        }
        int mo1070compare3MmeM6k$foundation_release = mo1070compare3MmeM6k$foundation_release(j8, bounds);
        int mo1070compare3MmeM6k$foundation_release2 = mo1070compare3MmeM6k$foundation_release(j9, bounds);
        if (mo1070compare3MmeM6k$foundation_release > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (mo1070compare3MmeM6k$foundation_release2 <= 0) {
            z9 = false;
        }
        return z8 ^ z9;
    }
}
