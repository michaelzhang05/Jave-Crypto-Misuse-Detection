package androidx.compose.foundation;

import L5.I;
import androidx.compose.ui.platform.InspectorInfo;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$$inlined$debugInspectorInfo$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ Function1 $magnifierCenter$inlined;
    final /* synthetic */ Function1 $sourceCenter$inlined;
    final /* synthetic */ MagnifierStyle $style$inlined;
    final /* synthetic */ float $zoom$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(Function1 function1, Function1 function12, float f8, MagnifierStyle magnifierStyle) {
        super(1);
        this.$sourceCenter$inlined = function1;
        this.$magnifierCenter$inlined = function12;
        this.$zoom$inlined = f8;
        this.$style$inlined = magnifierStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return I.f6487a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        AbstractC3159y.i(inspectorInfo, "$this$null");
        inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
        inspectorInfo.getProperties().set("sourceCenter", this.$sourceCenter$inlined);
        inspectorInfo.getProperties().set("magnifierCenter", this.$magnifierCenter$inlined);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.$zoom$inlined));
        inspectorInfo.getProperties().set(TtmlNode.TAG_STYLE, this.$style$inlined);
    }
}
