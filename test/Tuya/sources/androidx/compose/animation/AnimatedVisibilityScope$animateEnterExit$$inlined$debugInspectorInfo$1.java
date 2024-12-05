package androidx.compose.animation;

import L5.I;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ EnterTransition $enter$inlined;
    final /* synthetic */ ExitTransition $exit$inlined;
    final /* synthetic */ String $label$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1(EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        super(1);
        this.$enter$inlined = enterTransition;
        this.$exit$inlined = exitTransition;
        this.$label$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6487a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("animateEnterExit");
        inspectorInfo.getProperties().set("enter", this.$enter$inlined);
        inspectorInfo.getProperties().set("exit", this.$exit$inlined);
        inspectorInfo.getProperties().set("label", this.$label$inlined);
    }
}
