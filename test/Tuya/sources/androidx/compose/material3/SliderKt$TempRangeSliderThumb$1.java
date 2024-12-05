package androidx.compose.material3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$TempRangeSliderThumb$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ o $content;
    final /* synthetic */ float $offset;
    final /* synthetic */ BoxScope $this_TempRangeSliderThumb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$TempRangeSliderThumb$1(BoxScope boxScope, float f8, o oVar, int i8) {
        super(2);
        this.$this_TempRangeSliderThumb = boxScope;
        this.$offset = f8;
        this.$content = oVar;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.m1759TempRangeSliderThumbrAjV9yQ(this.$this_TempRangeSliderThumb, this.$offset, this.$content, composer, this.$$changed | 1);
    }
}
