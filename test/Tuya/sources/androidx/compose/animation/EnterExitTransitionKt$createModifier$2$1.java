package androidx.compose.animation;

import L5.I;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ State<Float> $alpha$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$2$1(State<Float> state) {
        super(1);
        this.$alpha$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return I.f6487a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayer) {
        float createModifier$lambda$8;
        AbstractC3159y.i(graphicsLayer, "$this$graphicsLayer");
        createModifier$lambda$8 = EnterExitTransitionKt.createModifier$lambda$8(this.$alpha$delegate);
        graphicsLayer.setAlpha(createModifier$lambda$8);
    }
}
