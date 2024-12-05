package androidx.compose.animation;

import S5.h;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;

/* loaded from: classes.dex */
final class AnimationModifierKt$animateContentSize$2 extends AbstractC3256z implements InterfaceC1669o {
    final /* synthetic */ FiniteAnimationSpec<IntSize> $animationSpec;
    final /* synthetic */ InterfaceC1668n $finishedListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationModifierKt$animateContentSize$2(InterfaceC1668n interfaceC1668n, FiniteAnimationSpec<IntSize> finiteAnimationSpec) {
        super(3);
        this.$finishedListener = interfaceC1668n;
        this.$animationSpec = finiteAnimationSpec;
    }

    @Override // a6.InterfaceC1669o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3255y.i(composed, "$this$composed");
        composer.startReplaceableGroup(-843180607);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-843180607, i8, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f9825a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        FiniteAnimationSpec<IntSize> finiteAnimationSpec = this.$animationSpec;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SizeAnimationModifier(finiteAnimationSpec, coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) rememberedValue2;
        sizeAnimationModifier.setListener(this.$finishedListener);
        Modifier then = ClipKt.clipToBounds(composed).then(sizeAnimationModifier);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
