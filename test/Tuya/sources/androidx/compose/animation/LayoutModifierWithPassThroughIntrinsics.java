package androidx.compose.animation;

import X5.n;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public abstract class LayoutModifierWithPassThroughIntrinsics implements LayoutModifier {
    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, n nVar) {
        return b.c(this, obj, nVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, n nVar) {
        return b.d(this, obj, nVar);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        return measurable.maxIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        return measurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3159y.i(intrinsicMeasureScope, "<this>");
        AbstractC3159y.i(measurable, "measurable");
        return measurable.minIntrinsicWidth(i8);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return a.a(this, modifier);
    }
}
