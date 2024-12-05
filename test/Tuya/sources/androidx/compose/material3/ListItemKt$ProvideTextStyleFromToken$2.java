package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ProvideTextStyleFromToken$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ n $content;
    final /* synthetic */ TypographyKeyTokens $textToken;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ProvideTextStyleFromToken$2(long j8, TypographyKeyTokens typographyKeyTokens, n nVar, int i8) {
        super(2);
        this.$color = j8;
        this.$textToken = typographyKeyTokens;
        this.$content = nVar;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        ListItemKt.m1682ProvideTextStyleFromToken3JVO9M(this.$color, this.$textToken, this.$content, composer, this.$$changed | 1);
    }
}
