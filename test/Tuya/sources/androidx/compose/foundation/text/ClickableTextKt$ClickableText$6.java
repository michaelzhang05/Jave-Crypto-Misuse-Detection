package androidx.compose.foundation.text;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ClickableTextKt$ClickableText$6 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1 $onClick;
    final /* synthetic */ Function1 $onHover;
    final /* synthetic */ Function1 $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ AnnotatedString $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$6(AnnotatedString annotatedString, Function1 function1, Modifier modifier, TextStyle textStyle, boolean z8, int i8, int i9, Function1 function12, Function1 function13, int i10, int i11) {
        super(2);
        this.$text = annotatedString;
        this.$onHover = function1;
        this.$modifier = modifier;
        this.$style = textStyle;
        this.$softWrap = z8;
        this.$overflow = i8;
        this.$maxLines = i9;
        this.$onTextLayout = function12;
        this.$onClick = function13;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        ClickableTextKt.m864ClickableText03UYbkw(this.$text, this.$onHover, this.$modifier, this.$style, this.$softWrap, this.$overflow, this.$maxLines, this.$onTextLayout, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
