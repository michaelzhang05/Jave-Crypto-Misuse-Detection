package androidx.compose.material3;

import L5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ State<Float> $alpha$delegate;
    final /* synthetic */ State<Float> $scale$delegate;
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(MutableState<TransformOrigin> mutableState, State<Float> state, State<Float> state2) {
        super(1);
        this.$transformOriginState = mutableState;
        this.$scale$delegate = state;
        this.$alpha$delegate = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f6487a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayer) {
        float m1690DropdownMenuContent$lambda1;
        float m1690DropdownMenuContent$lambda12;
        float m1691DropdownMenuContent$lambda3;
        AbstractC3159y.i(graphicsLayer, "$this$graphicsLayer");
        m1690DropdownMenuContent$lambda1 = MenuKt.m1690DropdownMenuContent$lambda1(this.$scale$delegate);
        graphicsLayer.setScaleX(m1690DropdownMenuContent$lambda1);
        m1690DropdownMenuContent$lambda12 = MenuKt.m1690DropdownMenuContent$lambda1(this.$scale$delegate);
        graphicsLayer.setScaleY(m1690DropdownMenuContent$lambda12);
        m1691DropdownMenuContent$lambda3 = MenuKt.m1691DropdownMenuContent$lambda3(this.$alpha$delegate);
        graphicsLayer.setAlpha(m1691DropdownMenuContent$lambda3);
        graphicsLayer.mo3144setTransformOrigin__ExYCQ(this.$transformOriginState.getValue().m3338unboximpl());
    }
}
