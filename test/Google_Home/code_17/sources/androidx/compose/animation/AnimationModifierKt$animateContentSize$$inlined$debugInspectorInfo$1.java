package androidx.compose.animation;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ FiniteAnimationSpec $animationSpec$inlined;
    final /* synthetic */ InterfaceC1668n $finishedListener$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1(FiniteAnimationSpec finiteAnimationSpec, InterfaceC1668n interfaceC1668n) {
        super(1);
        this.$animationSpec$inlined = finiteAnimationSpec;
        this.$finishedListener$inlined = interfaceC1668n;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f8278a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3255y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.$animationSpec$inlined);
        inspectorInfo.getProperties().set("finishedListener", this.$finishedListener$inlined);
    }
}
