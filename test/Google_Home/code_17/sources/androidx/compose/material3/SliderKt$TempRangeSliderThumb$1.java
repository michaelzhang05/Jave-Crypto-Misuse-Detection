package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SliderKt$TempRangeSliderThumb$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC1669o $content;
    final /* synthetic */ float $offset;
    final /* synthetic */ BoxScope $this_TempRangeSliderThumb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$TempRangeSliderThumb$1(BoxScope boxScope, float f8, InterfaceC1669o interfaceC1669o, int i8) {
        super(2);
        this.$this_TempRangeSliderThumb = boxScope;
        this.$offset = f8;
        this.$content = interfaceC1669o;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        SliderKt.m1764TempRangeSliderThumbrAjV9yQ(this.$this_TempRangeSliderThumb, this.$offset, this.$content, composer, this.$$changed | 1);
    }
}
