package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FloatingActionButtonKt$SmallFloatingActionButton$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ n $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ FloatingActionButtonElevation $elevation;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$SmallFloatingActionButton$2(Function0 function0, Modifier modifier, Shape shape, long j8, long j9, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, n nVar, int i8, int i9) {
        super(2);
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$shape = shape;
        this.$containerColor = j8;
        this.$contentColor = j9;
        this.$elevation = floatingActionButtonElevation;
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
        FloatingActionButtonKt.m1659SmallFloatingActionButtonXz6DiA(this.$onClick, this.$modifier, this.$shape, this.$containerColor, this.$contentColor, this.$elevation, this.$interactionSource, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
