package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class IconButtonKt$FilledTonalIconToggleButton$4 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ IconToggleButtonColors $colors;
    final /* synthetic */ n $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onCheckedChange;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonKt$FilledTonalIconToggleButton$4(boolean z8, Function1 function1, Modifier modifier, boolean z9, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, n nVar, int i8, int i9) {
        super(2);
        this.$checked = z8;
        this.$onCheckedChange = function1;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$shape = shape;
        this.$colors = iconToggleButtonColors;
        this.$interactionSource = mutableInteractionSource;
        this.$content = nVar;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        IconButtonKt.FilledTonalIconToggleButton(this.$checked, this.$onCheckedChange, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$interactionSource, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
