package androidx.compose.material;

import L5.I;
import M5.AbstractC1246t;
import X5.n;
import X5.p;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropStack$1$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ n $backLayer;
    final /* synthetic */ Function1 $calculateBackLayerConstraints;
    final /* synthetic */ p $frontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3160z implements Function1 {
        final /* synthetic */ Placeable $backLayerPlaceable;
        final /* synthetic */ List<Placeable> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Placeable placeable, List<? extends Placeable> list) {
            super(1);
            this.$backLayerPlaceable = placeable;
            this.$placeables = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f6487a;
        }

        public final void invoke(Placeable.PlacementScope layout) {
            AbstractC3159y.i(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.$backLayerPlaceable, 0, 0, 0.0f, 4, null);
            List<Placeable> list = this.$placeables;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i8), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$1$1(n nVar, Function1 function1, p pVar, int i8) {
        super(2);
        this.$backLayer = nVar;
        this.$calculateBackLayerConstraints = function1;
        this.$frontLayer = pVar;
        this.$$dirty = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1119invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5152unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1119invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
        AbstractC3159y.i(SubcomposeLayout, "$this$SubcomposeLayout");
        Placeable mo4131measureBRTryo0 = ((Measurable) AbstractC1246t.m0(SubcomposeLayout.subcompose(BackdropLayers.Back, this.$backLayer))).mo4131measureBRTryo0(((Constraints) this.$calculateBackLayerConstraints.invoke(Constraints.m5134boximpl(j8))).m5152unboximpl());
        List<Measurable> subcompose = SubcomposeLayout.subcompose(BackdropLayers.Front, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new BackdropScaffoldKt$BackdropStack$1$1$placeables$1(this.$frontLayer, j8, mo4131measureBRTryo0.getHeight(), this.$$dirty)));
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size = subcompose.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(subcompose.get(i8).mo4131measureBRTryo0(j8));
        }
        int max = Math.max(Constraints.m5148getMinWidthimpl(j8), mo4131measureBRTryo0.getWidth());
        int max2 = Math.max(Constraints.m5147getMinHeightimpl(j8), mo4131measureBRTryo0.getHeight());
        int size2 = arrayList.size();
        int i9 = max2;
        int i10 = max;
        for (int i11 = 0; i11 < size2; i11++) {
            Placeable placeable = (Placeable) arrayList.get(i11);
            i10 = Math.max(i10, placeable.getWidth());
            i9 = Math.max(i9, placeable.getHeight());
        }
        return MeasureScope.CC.q(SubcomposeLayout, i10, i9, null, new AnonymousClass2(mo4131measureBRTryo0, arrayList), 4, null);
    }
}
