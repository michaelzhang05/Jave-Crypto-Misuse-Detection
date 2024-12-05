package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d6.InterfaceC2561e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$3 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onValueChange;
    final /* synthetic */ Function0 $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ o $thumb;
    final /* synthetic */ o $track;
    final /* synthetic */ float $value;
    final /* synthetic */ InterfaceC2561e $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$3(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, Function1 function1, Function0 function0, int i8, float f8, InterfaceC2561e interfaceC2561e, o oVar, o oVar2, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$enabled = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$onValueChange = function1;
        this.$onValueChangeFinished = function0;
        this.$steps = i8;
        this.$value = f8;
        this.$valueRange = interfaceC2561e;
        this.$thumb = oVar;
        this.$track = oVar2;
        this.$$changed = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.SliderImpl(this.$modifier, this.$enabled, this.$interactionSource, this.$onValueChange, this.$onValueChangeFinished, this.$steps, this.$value, this.$valueRange, this.$thumb, this.$track, composer, this.$$changed | 1);
    }
}
