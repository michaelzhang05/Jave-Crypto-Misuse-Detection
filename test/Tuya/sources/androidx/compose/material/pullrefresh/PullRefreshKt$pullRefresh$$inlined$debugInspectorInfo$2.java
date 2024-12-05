package androidx.compose.material.pullrefresh;

import L5.I;
import X5.n;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ Function1 $onPull$inlined;
    final /* synthetic */ n $onRelease$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(Function1 function1, n nVar, boolean z8) {
        super(1);
        this.$onPull$inlined = function1;
        this.$onRelease$inlined = nVar;
        this.$enabled$inlined = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6487a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName("pullRefresh");
        inspectorInfo.getProperties().set("onPull", this.$onPull$inlined);
        inspectorInfo.getProperties().set("onRelease", this.$onRelease$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
    }
}
