package u3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.C3440l;
import t3.w;

/* loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f39999a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(1);
            this.f39999a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return I.f8278a;
        }

        public final void invoke(int i8) {
            this.f39999a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f40000a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0, int i8) {
            super(2);
            this.f40000a = function0;
            this.f40001b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            h.a(this.f40000a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40001b | 1));
        }
    }

    public static final void a(Function0 onClick, Composer composer, int i8) {
        int i9;
        TextStyle m4724copyv2rsoow;
        int i10;
        AbstractC3255y.i(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-776723448);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(onClick)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-776723448, i9, -1, "com.stripe.android.paymentsheet.addresselement.EnterManuallyText (EnterManuallyText.kt:13)");
            }
            startRestartGroup.startReplaceableGroup(-1477616075);
            boolean z8 = false;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringResources_androidKt.stringResource(w.f39754H, startRestartGroup, 0));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            startRestartGroup.endReplaceableGroup();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            m4724copyv2rsoow = r15.m4724copyv2rsoow((r48 & 1) != 0 ? r15.spanStyle.m4656getColor0d7_KjU() : materialTheme.getColors(startRestartGroup, i11).m1183getPrimary0d7_KjU(), (r48 & 2) != 0 ? r15.spanStyle.m4657getFontSizeXSAIIZE() : C3440l.f35212a.f().n(), (r48 & 4) != 0 ? r15.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r15.spanStyle.m4658getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r15.spanStyle.m4659getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r15.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r15.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r15.spanStyle.m4660getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r15.spanStyle.m4655getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r15.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r15.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r15.spanStyle.m4654getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r15.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r15.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r15.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5080boximpl(r15.paragraphStyle.m4612getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5094boximpl(r15.paragraphStyle.m4614getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r15.paragraphStyle.m4610getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r15.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r15.platformStyle : null, (r48 & 1048576) != 0 ? r15.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m5000boximpl(r15.paragraphStyle.m4609getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4990boximpl(r15.paragraphStyle.m4607getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? materialTheme.getTypography(startRestartGroup, i11).getBody1().paragraphStyle.getTextMotion() : null);
            startRestartGroup.startReplaceableGroup(-1477604019);
            if ((i9 & 14) == 4) {
                z8 = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(onClick);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            ClickableTextKt.m870ClickableText4YKlhWE(annotatedString, null, m4724copyv2rsoow, false, 0, 0, null, (Function1) rememberedValue, startRestartGroup, 0, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(onClick, i8));
        }
    }
}
