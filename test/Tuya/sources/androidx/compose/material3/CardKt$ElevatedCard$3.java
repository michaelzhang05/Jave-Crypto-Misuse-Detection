package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CardKt$ElevatedCard$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CardColors $colors;
    final /* synthetic */ o $content;
    final /* synthetic */ CardElevation $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardKt$ElevatedCard$3(Function0 function0, Modifier modifier, boolean z8, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, o oVar, int i8, int i9) {
        super(2);
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$enabled = z8;
        this.$shape = shape;
        this.$colors = cardColors;
        this.$elevation = cardElevation;
        this.$interactionSource = mutableInteractionSource;
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
        CardKt.ElevatedCard(this.$onClick, this.$modifier, this.$enabled, this.$shape, this.$colors, this.$elevation, this.$interactionSource, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}