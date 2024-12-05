package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$LeadingIconTab$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC1668n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ long $selectedContentColor;
    final /* synthetic */ InterfaceC1668n $text;
    final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$LeadingIconTab$3(boolean z8, Function0 function0, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, Modifier modifier, boolean z9, long j8, long j9, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$selected = z8;
        this.$onClick = function0;
        this.$text = interfaceC1668n;
        this.$icon = interfaceC1668n2;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$selectedContentColor = j8;
        this.$unselectedContentColor = j9;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        TabKt.m1829LeadingIconTabwqdebIU(this.$selected, this.$onClick, this.$text, this.$icon, this.$modifier, this.$enabled, this.$selectedContentColor, this.$unselectedContentColor, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
