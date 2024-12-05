package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC1668n $it;
    final /* synthetic */ long $labelContentColor;
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ long $labelTextStyleColor;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(float f8, long j8, InterfaceC1668n interfaceC1668n, int i8, boolean z8, long j9) {
        super(2);
        this.$labelProgress = f8;
        this.$labelContentColor = j8;
        this.$it = interfaceC1668n;
        this.$$dirty = i8;
        this.$shouldOverrideTextStyleColor = z8;
        this.$labelTextStyleColor = j9;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        TextStyle textStyle;
        TextStyle m4724copyv2rsoow;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(362863774, i8, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer, 6).getSubtitle1(), materialTheme.getTypography(composer, 6).getCaption(), this.$labelProgress);
        boolean z8 = this.$shouldOverrideTextStyleColor;
        long j8 = this.$labelTextStyleColor;
        if (z8) {
            m4724copyv2rsoow = lerp.m4724copyv2rsoow((r48 & 1) != 0 ? lerp.spanStyle.m4656getColor0d7_KjU() : j8, (r48 & 2) != 0 ? lerp.spanStyle.m4657getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? lerp.spanStyle.m4658getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? lerp.spanStyle.m4659getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.spanStyle.m4660getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? lerp.spanStyle.m4655getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.spanStyle.m4654getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? lerp.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5080boximpl(lerp.paragraphStyle.m4612getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5094boximpl(lerp.paragraphStyle.m4614getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? lerp.paragraphStyle.m4610getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.platformStyle : null, (r48 & 1048576) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m5000boximpl(lerp.paragraphStyle.m4609getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4990boximpl(lerp.paragraphStyle.m4607getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? lerp.paragraphStyle.getTextMotion() : null);
            textStyle = m4724copyv2rsoow;
        } else {
            textStyle = lerp;
        }
        TextFieldImplKt.m1409DecorationeuL9pac(this.$labelContentColor, textStyle, null, this.$it, composer, ((this.$$dirty >> 6) & 14) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
