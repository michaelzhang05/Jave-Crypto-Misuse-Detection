package androidx.compose.foundation.text.selection;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(Modifier modifier, boolean z8, ResolvedTextDirection resolvedTextDirection, boolean z9, int i8) {
        super(2);
        this.$modifier = modifier;
        this.$isStartHandle = z8;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z9;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        AndroidSelectionHandles_androidKt.DefaultSelectionHandle(this.$modifier, this.$isStartHandle, this.$direction, this.$handlesCrossed, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
