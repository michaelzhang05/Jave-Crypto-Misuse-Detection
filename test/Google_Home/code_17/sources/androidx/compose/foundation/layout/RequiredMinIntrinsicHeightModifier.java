package androidx.compose.foundation.layout;

import a6.InterfaceC1668n;
import androidx.compose.foundation.layout.IntrinsicSizeModifier;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
final class RequiredMinIntrinsicHeightModifier implements IntrinsicSizeModifier {
    public static final RequiredMinIntrinsicHeightModifier INSTANCE = new RequiredMinIntrinsicHeightModifier();
    private static final boolean enforceIncoming = false;

    private RequiredMinIntrinsicHeightModifier() {
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo559calculateContentConstraintsl58MMJ0(MeasureScope calculateContentConstraints, Measurable measurable, long j8) {
        AbstractC3255y.i(calculateContentConstraints, "$this$calculateContentConstraints");
        AbstractC3255y.i(measurable, "measurable");
        return Constraints.Companion.m5160fixedHeightOenEA2s(measurable.minIntrinsicHeight(Constraints.m5151getMaxWidthimpl(j8)));
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC1668n interfaceC1668n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC1668n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC1668n interfaceC1668n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC1668n);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return enforceIncoming;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3255y.i(intrinsicMeasureScope, "<this>");
        AbstractC3255y.i(measurable, "measurable");
        return measurable.minIntrinsicHeight(i8);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return IntrinsicSizeModifier.CC.c(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public /* synthetic */ MeasureResult mo161measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
        return IntrinsicSizeModifier.CC.d(this, measureScope, measurable, j8);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return IntrinsicSizeModifier.CC.e(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
        return IntrinsicSizeModifier.CC.f(this, intrinsicMeasureScope, intrinsicMeasurable, i8);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}