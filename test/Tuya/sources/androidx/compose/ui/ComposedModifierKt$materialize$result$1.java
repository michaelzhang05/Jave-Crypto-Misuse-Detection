package androidx.compose.ui;

import X5.n;
import X5.o;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposedModifierKt$materialize$result$1 extends AbstractC3160z implements n {
    final /* synthetic */ Composer $this_materialize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materialize$result$1(Composer composer) {
        super(2);
        this.$this_materialize = composer;
    }

    @Override // X5.n
    public final Modifier invoke(Modifier modifier, Modifier.Element element) {
        boolean z8 = element instanceof ComposedModifier;
        Modifier modifier2 = element;
        if (z8) {
            o factory = ((ComposedModifier) element).getFactory();
            AbstractC3159y.g(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            modifier2 = ComposedModifierKt.materializeModifier(this.$this_materialize, (Modifier) ((o) Z.d(factory, 3)).invoke(Modifier.Companion, this.$this_materialize, 0));
        }
        return modifier.then(modifier2);
    }
}
