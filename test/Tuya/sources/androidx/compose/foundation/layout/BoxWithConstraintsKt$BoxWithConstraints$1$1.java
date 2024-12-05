package androidx.compose.foundation.layout;

import L5.I;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BoxWithConstraintsKt$BoxWithConstraints$1$1 extends AbstractC3160z implements X5.n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ X5.o $content;
    final /* synthetic */ MeasurePolicy $measurePolicy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1(MeasurePolicy measurePolicy, X5.o oVar, int i8) {
        super(2);
        this.$measurePolicy = measurePolicy;
        this.$content = oVar;
        this.$$dirty = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m537invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5152unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m537invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
        AbstractC3159y.i(SubcomposeLayout, "$this$SubcomposeLayout");
        return this.$measurePolicy.mo132measure3p2s80s(SubcomposeLayout, SubcomposeLayout.subcompose(I.f6487a, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(this.$content, new BoxWithConstraintsScopeImpl(SubcomposeLayout, j8, null), this.$$dirty))), j8);
    }
}
