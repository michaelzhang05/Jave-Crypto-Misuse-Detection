package androidx.compose.ui.graphics.vector;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class VectorPainterKt$RenderVectorGroup$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Map<String, VectorConfig> $configs;
    final /* synthetic */ VectorGroup $group;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainterKt$RenderVectorGroup$2(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, int i8, int i9) {
        super(2);
        this.$group = vectorGroup;
        this.$configs = map;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        VectorPainterKt.RenderVectorGroup(this.$group, this.$configs, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
