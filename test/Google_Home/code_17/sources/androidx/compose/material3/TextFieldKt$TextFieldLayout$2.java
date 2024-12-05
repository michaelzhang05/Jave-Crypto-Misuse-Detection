package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldKt$TextFieldLayout$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ InterfaceC1668n $container;
    final /* synthetic */ InterfaceC1668n $label;
    final /* synthetic */ InterfaceC1668n $leading;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ InterfaceC1669o $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ InterfaceC1668n $supporting;
    final /* synthetic */ InterfaceC1668n $textField;
    final /* synthetic */ InterfaceC1668n $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextFieldLayout$2(Modifier modifier, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1669o interfaceC1669o, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, boolean z8, float f8, InterfaceC1668n interfaceC1668n5, InterfaceC1668n interfaceC1668n6, PaddingValues paddingValues, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$textField = interfaceC1668n;
        this.$label = interfaceC1668n2;
        this.$placeholder = interfaceC1669o;
        this.$leading = interfaceC1668n3;
        this.$trailing = interfaceC1668n4;
        this.$singleLine = z8;
        this.$animationProgress = f8;
        this.$container = interfaceC1668n5;
        this.$supporting = interfaceC1668n6;
        this.$paddingValues = paddingValues;
        this.$$changed = i8;
        this.$$changed1 = i9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        TextFieldKt.TextFieldLayout(this.$modifier, this.$textField, this.$label, this.$placeholder, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$container, this.$supporting, this.$paddingValues, composer, this.$$changed | 1, this.$$changed1);
    }
}
