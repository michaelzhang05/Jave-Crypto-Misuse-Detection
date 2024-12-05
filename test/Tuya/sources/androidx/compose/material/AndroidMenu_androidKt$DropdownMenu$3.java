package androidx.compose.material;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt$DropdownMenu$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ o $content;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $offset;
    final /* synthetic */ Function0 $onDismissRequest;
    final /* synthetic */ PopupProperties $properties;
    final /* synthetic */ ScrollState $scrollState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$3(boolean z8, Function0 function0, Modifier modifier, long j8, ScrollState scrollState, PopupProperties popupProperties, o oVar, int i8, int i9) {
        super(2);
        this.$expanded = z8;
        this.$onDismissRequest = function0;
        this.$modifier = modifier;
        this.$offset = j8;
        this.$scrollState = scrollState;
        this.$properties = popupProperties;
        this.$content = oVar;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        AndroidMenu_androidKt.m1100DropdownMenu4kj_NE(this.$expanded, this.$onDismissRequest, this.$modifier, this.$offset, this.$scrollState, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
