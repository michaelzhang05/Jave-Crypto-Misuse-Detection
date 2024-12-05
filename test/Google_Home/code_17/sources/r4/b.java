package r4;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1672r;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1672r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f38600d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f38601e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f38602f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38603g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38604h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38605i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f38606j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ PaddingValues f38607k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f38608l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0870a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f38609a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f38610b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC1668n f38611c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f38612d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f38613e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0870a(float f8, long j8, InterfaceC1668n interfaceC1668n, boolean z8, long j9) {
                super(2);
                this.f38609a = f8;
                this.f38610b = j8;
                this.f38611c = interfaceC1668n;
                this.f38612d = z8;
                this.f38613e = j9;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                TextStyle textStyle;
                TextStyle m4724copyv2rsoow;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-753626064, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:270)");
                }
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i9 = MaterialTheme.$stable;
                TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer, i9).getSubtitle1(), materialTheme.getTypography(composer, i9).getCaption(), this.f38609a);
                boolean z8 = this.f38612d;
                long j8 = this.f38613e;
                if (z8) {
                    m4724copyv2rsoow = lerp.m4724copyv2rsoow((r48 & 1) != 0 ? lerp.spanStyle.m4656getColor0d7_KjU() : j8, (r48 & 2) != 0 ? lerp.spanStyle.m4657getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? lerp.spanStyle.m4658getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? lerp.spanStyle.m4659getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.spanStyle.m4660getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? lerp.spanStyle.m4655getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.spanStyle.m4654getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? lerp.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5080boximpl(lerp.paragraphStyle.m4612getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5094boximpl(lerp.paragraphStyle.m4614getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? lerp.paragraphStyle.m4610getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.platformStyle : null, (r48 & 1048576) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m5000boximpl(lerp.paragraphStyle.m4609getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4990boximpl(lerp.paragraphStyle.m4607getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? lerp.paragraphStyle.getTextMotion() : null);
                    textStyle = m4724copyv2rsoow;
                } else {
                    textStyle = lerp;
                }
                b.c(this.f38610b, textStyle, null, this.f38611c, composer, 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r4.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0871b extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f38614a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1668n f38615b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0871b(long j8, InterfaceC1668n interfaceC1668n) {
                super(2);
                this.f38614a = j8;
                this.f38615b = interfaceC1668n;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-816802558, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:301)");
                }
                b.c(this.f38614a, null, null, this.f38615b, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f38616a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextFieldColors f38617b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f38618c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC1668n f38619d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f8, TextFieldColors textFieldColors, boolean z8, InterfaceC1668n interfaceC1668n) {
                super(3);
                this.f38616a = f8;
                this.f38617b = textFieldColors;
                this.f38618c = z8;
                this.f38619d = interfaceC1668n;
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8278a;
            }

            public final void invoke(Modifier modifier, Composer composer, int i8) {
                AbstractC3255y.i(modifier, "modifier");
                if ((i8 & 14) == 0) {
                    i8 |= composer.changed(modifier) ? 4 : 2;
                }
                if ((i8 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-848031908, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous> (CompatTextField.kt:286)");
                }
                Modifier alpha = AlphaKt.alpha(modifier, this.f38616a);
                TextFieldColors textFieldColors = this.f38617b;
                boolean z8 = this.f38618c;
                InterfaceC1668n interfaceC1668n = this.f38619d;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0 constructor = companion.getConstructor();
                InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(alpha);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
                Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                b.c(textFieldColors.placeholderColor(z8, composer, 0).getValue().m2986unboximpl(), MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), null, interfaceC1668n, composer, 0, 4);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f38620a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1668n f38621b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(long j8, InterfaceC1668n interfaceC1668n) {
                super(2);
                this.f38620a = j8;
                this.f38621b = interfaceC1668n;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2104269322, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:308)");
                }
                b.c(this.f38620a, null, null, this.f38621b, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, String str, TextFieldColors textFieldColors, boolean z8, boolean z9, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, InterfaceC1668n interfaceC1668n5, boolean z10, PaddingValues paddingValues, boolean z11) {
            super(6);
            this.f38597a = interfaceC1668n;
            this.f38598b = interfaceC1668n2;
            this.f38599c = str;
            this.f38600d = textFieldColors;
            this.f38601e = z8;
            this.f38602f = z9;
            this.f38603g = interfaceC1668n3;
            this.f38604h = interfaceC1668n4;
            this.f38605i = interfaceC1668n5;
            this.f38606j = z10;
            this.f38607k = paddingValues;
            this.f38608l = z11;
        }

        @Override // a6.InterfaceC1672r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            m5625invokeRIQooxk(((Number) obj).floatValue(), ((Color) obj2).m2986unboximpl(), ((Color) obj3).m2986unboximpl(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
            return I.f8278a;
        }

        /* renamed from: invoke-RIQooxk, reason: not valid java name */
        public final void m5625invokeRIQooxk(float f8, long j8, long j9, float f9, Composer composer, int i8) {
            int i9;
            ComposableLambda composableLambda;
            ComposableLambda composableLambda2;
            ComposableLambda composableLambda3;
            ComposableLambda composableLambda4;
            int i10;
            int i11;
            int i12;
            int i13;
            if ((i8 & 14) == 0) {
                if (composer.changed(f8)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i9 = i13 | i8;
            } else {
                i9 = i8;
            }
            if ((i8 & 112) == 0) {
                if (composer.changed(j8)) {
                    i12 = 32;
                } else {
                    i12 = 16;
                }
                i9 |= i12;
            }
            if ((i8 & 896) == 0) {
                if (composer.changed(j9)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i9 |= i11;
            }
            if ((i8 & 7168) == 0) {
                if (composer.changed(f9)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i9 |= i10;
            }
            if ((46811 & i9) == 9362 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1648140010, i9, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous> (CompatTextField.kt:268)");
            }
            InterfaceC1668n interfaceC1668n = this.f38597a;
            if (interfaceC1668n != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composer, -753626064, true, new C0870a(f8, j9, interfaceC1668n, this.f38608l, j8));
            } else {
                composableLambda = null;
            }
            if (this.f38598b != null && this.f38599c.length() == 0 && f9 > 0.0f) {
                composableLambda2 = ComposableLambdaKt.composableLambda(composer, -848031908, true, new c(f9, this.f38600d, this.f38601e, this.f38598b));
            } else {
                composableLambda2 = null;
            }
            long m2986unboximpl = this.f38600d.leadingIconColor(this.f38601e, this.f38602f, composer, 0).getValue().m2986unboximpl();
            InterfaceC1668n interfaceC1668n2 = this.f38603g;
            if (interfaceC1668n2 != null) {
                composableLambda3 = ComposableLambdaKt.composableLambda(composer, -816802558, true, new C0871b(m2986unboximpl, interfaceC1668n2));
            } else {
                composableLambda3 = null;
            }
            long m2986unboximpl2 = this.f38600d.trailingIconColor(this.f38601e, this.f38602f, composer, 0).getValue().m2986unboximpl();
            InterfaceC1668n interfaceC1668n3 = this.f38604h;
            if (interfaceC1668n3 != null) {
                composableLambda4 = ComposableLambdaKt.composableLambda(composer, -2104269322, true, new d(m2986unboximpl2, interfaceC1668n3));
            } else {
                composableLambda4 = null;
            }
            int i14 = ((i9 << 21) & 29360128) | 6;
            r4.d.a(Modifier.Companion, this.f38605i, composableLambda, composableLambda2, composableLambda3, composableLambda4, this.f38606j, f8, this.f38607k, composer, i14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0872b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38623b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f38624c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38625d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38626e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38627f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38628g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f38629h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f38630i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f38631j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InteractionSource f38632k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ PaddingValues f38633l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f38634m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f38635n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f38636o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f38637p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0872b(String str, InterfaceC1668n interfaceC1668n, VisualTransformation visualTransformation, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, InterfaceC1668n interfaceC1668n5, boolean z8, boolean z9, boolean z10, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, int i8, int i9, int i10) {
            super(2);
            this.f38622a = str;
            this.f38623b = interfaceC1668n;
            this.f38624c = visualTransformation;
            this.f38625d = interfaceC1668n2;
            this.f38626e = interfaceC1668n3;
            this.f38627f = interfaceC1668n4;
            this.f38628g = interfaceC1668n5;
            this.f38629h = z8;
            this.f38630i = z9;
            this.f38631j = z10;
            this.f38632k = interactionSource;
            this.f38633l = paddingValues;
            this.f38634m = textFieldColors;
            this.f38635n = i8;
            this.f38636o = i9;
            this.f38637p = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f38622a, this.f38623b, this.f38624c, this.f38625d, this.f38626e, this.f38627f, this.f38628g, this.f38629h, this.f38630i, this.f38631j, this.f38632k, this.f38633l, this.f38634m, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38635n | 1), RecomposeScopeImplKt.updateChangedFlags(this.f38636o), this.f38637p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f38638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38639b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38640c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InteractionSource f38641d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TextFieldColors textFieldColors, boolean z8, boolean z9, InteractionSource interactionSource) {
            super(3);
            this.f38638a = textFieldColors;
            this.f38639b = z8;
            this.f38640c = z9;
            this.f38641d = interactionSource;
        }

        public final long a(r4.c it, Composer composer, int i8) {
            boolean z8;
            AbstractC3255y.i(it, "it");
            composer.startReplaceableGroup(348982872);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348982872, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous> (CompatTextField.kt:240)");
            }
            TextFieldColors textFieldColors = this.f38638a;
            boolean z9 = this.f38639b;
            if (it == r4.c.f38690b) {
                z8 = false;
            } else {
                z8 = this.f38640c;
            }
            long m2986unboximpl = textFieldColors.labelColor(z9, z8, this.f38641d, composer, 0).getValue().m2986unboximpl();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return m2986unboximpl;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return Color.m2966boximpl(a((r4.c) obj, (Composer) obj2, ((Number) obj3).intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f38642a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38643b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f38644c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38645d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38646e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38647f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f38648g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f38649h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f38650i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ MutableInteractionSource f38651j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f38652k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(TextFieldValue textFieldValue, InterfaceC1668n interfaceC1668n, VisualTransformation visualTransformation, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, boolean z8, boolean z9, boolean z10, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
            super(3);
            this.f38642a = textFieldValue;
            this.f38643b = interfaceC1668n;
            this.f38644c = visualTransformation;
            this.f38645d = interfaceC1668n2;
            this.f38646e = interfaceC1668n3;
            this.f38647f = interfaceC1668n4;
            this.f38648g = z8;
            this.f38649h = z9;
            this.f38650i = z10;
            this.f38651j = mutableInteractionSource;
            this.f38652k = textFieldColors;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1668n) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(InterfaceC1668n innerTextField, Composer composer, int i8) {
            int i9;
            PaddingValues m1394textFieldWithLabelPaddinga9UjIt4$default;
            AbstractC3255y.i(innerTextField, "innerTextField");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changedInstance(innerTextField) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1540251746, i9, -1, "com.stripe.android.uicore.elements.compat.CompatTextField.<anonymous> (CompatTextField.kt:185)");
            }
            String text = this.f38642a.getText();
            if (this.f38643b == null) {
                m1394textFieldWithLabelPaddinga9UjIt4$default = TextFieldDefaults.m1395textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            } else {
                m1394textFieldWithLabelPaddinga9UjIt4$default = TextFieldDefaults.m1394textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            }
            b.a(text, innerTextField, this.f38644c, this.f38643b, this.f38645d, this.f38646e, this.f38647f, this.f38648g, this.f38649h, this.f38650i, this.f38651j, m1394textFieldWithLabelPaddinga9UjIt4$default, this.f38652k, composer, (i9 << 3) & 112, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f38653a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f38654b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f38655c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f38656d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f38657e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextStyle f38658f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38659g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38660h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38661i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38662j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f38663k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f38664l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f38665m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ KeyboardActions f38666n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f38667o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f38668p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f38669q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableInteractionSource f38670r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Shape f38671s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f38672t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f38673u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f38674v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f38675w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z8, boolean z9, TextStyle textStyle, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, boolean z10, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z11, int i8, int i9, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i10, int i11, int i12) {
            super(2);
            this.f38653a = textFieldValue;
            this.f38654b = function1;
            this.f38655c = modifier;
            this.f38656d = z8;
            this.f38657e = z9;
            this.f38658f = textStyle;
            this.f38659g = interfaceC1668n;
            this.f38660h = interfaceC1668n2;
            this.f38661i = interfaceC1668n3;
            this.f38662j = interfaceC1668n4;
            this.f38663k = z10;
            this.f38664l = visualTransformation;
            this.f38665m = keyboardOptions;
            this.f38666n = keyboardActions;
            this.f38667o = z11;
            this.f38668p = i8;
            this.f38669q = i9;
            this.f38670r = mutableInteractionSource;
            this.f38671s = shape;
            this.f38672t = textFieldColors;
            this.f38673u = i10;
            this.f38674v = i11;
            this.f38675w = i12;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f38653a, this.f38654b, this.f38655c, this.f38656d, this.f38657e, this.f38658f, this.f38659g, this.f38660h, this.f38661i, this.f38662j, this.f38663k, this.f38664l, this.f38665m, this.f38666n, this.f38667o, this.f38668p, this.f38669q, this.f38670r, this.f38671s, this.f38672t, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38673u | 1), RecomposeScopeImplKt.updateChangedFlags(this.f38674v), this.f38675w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f38676a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextStyle f38677b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Float f38678c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38679d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f38680e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f38681f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j8, TextStyle textStyle, Float f8, InterfaceC1668n interfaceC1668n, int i8, int i9) {
            super(2);
            this.f38676a = j8;
            this.f38677b = textStyle;
            this.f38678c = f8;
            this.f38679d = interfaceC1668n;
            this.f38680e = i8;
            this.f38681f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f38676a, this.f38677b, this.f38678c, this.f38679d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38680e | 1), this.f38681f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f38682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Float f38683b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38684c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Float f38685a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1668n f38686b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f38687c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Float f8, InterfaceC1668n interfaceC1668n, long j8) {
                super(2);
                this.f38685a = f8;
                this.f38686b = interfaceC1668n;
                this.f38687c = j8;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1070796295, i8, -1, "com.stripe.android.uicore.elements.compat.Decoration.<anonymous>.<anonymous> (CompatTextField.kt:341)");
                }
                if (this.f38685a != null) {
                    composer.startReplaceableGroup(-979697943);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(this.f38685a)}, this.f38686b, composer, 8);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-979519197);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2978getAlphaimpl(this.f38687c)))}, this.f38686b, composer, 8);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j8, Float f8, InterfaceC1668n interfaceC1668n) {
            super(2);
            this.f38682a = j8;
            this.f38683b = f8;
            this.f38684c = interfaceC1668n;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1247846727, i8, -1, "com.stripe.android.uicore.elements.compat.Decoration.<anonymous> (CompatTextField.kt:340)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(this.f38682a))}, ComposableLambdaKt.composableLambda(composer, -1070796295, true, new a(this.f38683b, this.f38684c, this.f38682a)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(1);
            this.f38688a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.error(semantics, this.f38688a);
        }
    }

    public static final void a(String value, InterfaceC1668n innerTextField, VisualTransformation visualTransformation, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, InterfaceC1668n interfaceC1668n3, InterfaceC1668n interfaceC1668n4, boolean z8, boolean z9, boolean z10, InteractionSource interactionSource, PaddingValues contentPadding, TextFieldColors colors, Composer composer, int i8, int i9, int i10) {
        int i11;
        int i12;
        r4.c cVar;
        Composer composer2;
        boolean z11;
        InterfaceC1668n interfaceC1668n5;
        InterfaceC1668n interfaceC1668n6;
        InterfaceC1668n interfaceC1668n7;
        boolean z12;
        boolean z13;
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(innerTextField, "innerTextField");
        AbstractC3255y.i(visualTransformation, "visualTransformation");
        AbstractC3255y.i(interactionSource, "interactionSource");
        AbstractC3255y.i(contentPadding, "contentPadding");
        AbstractC3255y.i(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1341778867);
        if ((i10 & 1) != 0) {
            i11 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i11 = (startRestartGroup.changed(value) ? 4 : 2) | i8;
        } else {
            i11 = i8;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i8 & 112) == 0) {
            i11 |= startRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i8 & 896) == 0) {
            i11 |= startRestartGroup.changed(visualTransformation) ? 256 : 128;
        }
        if ((i10 & 8) != 0) {
            i11 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC1668n) ? 2048 : 1024;
        }
        int i13 = i10 & 16;
        if (i13 != 0) {
            i11 |= 24576;
        } else if ((i8 & 57344) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC1668n2) ? 16384 : 8192;
        }
        int i14 = i10 & 32;
        if (i14 != 0) {
            i11 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i8 & 458752) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC1668n3) ? 131072 : 65536;
        }
        int i15 = i10 & 64;
        if (i15 != 0) {
            i11 |= 1572864;
        } else if ((i8 & 3670016) == 0) {
            i11 |= startRestartGroup.changedInstance(interfaceC1668n4) ? 1048576 : 524288;
        }
        int i16 = i10 & 128;
        if (i16 != 0) {
            i11 |= 12582912;
        } else if ((i8 & 29360128) == 0) {
            i11 |= startRestartGroup.changed(z8) ? 8388608 : 4194304;
        }
        int i17 = i10 & 256;
        if (i17 != 0) {
            i11 |= 100663296;
        } else if ((i8 & 234881024) == 0) {
            i11 |= startRestartGroup.changed(z9) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i18 = i10 & 512;
        if (i18 != 0) {
            i11 |= 805306368;
        } else if ((i8 & 1879048192) == 0) {
            i11 |= startRestartGroup.changed(z10) ? 536870912 : 268435456;
        }
        if ((i10 & 1024) != 0) {
            i12 = i9 | 6;
        } else if ((i9 & 14) == 0) {
            i12 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i9;
        } else {
            i12 = i9;
        }
        if ((i10 & 2048) != 0) {
            i12 |= 48;
        } else if ((i9 & 112) == 0) {
            i12 |= startRestartGroup.changed(contentPadding) ? 32 : 16;
        }
        if ((i10 & 4096) != 0) {
            i12 |= 384;
        } else if ((i9 & 896) == 0) {
            i12 |= startRestartGroup.changed(colors) ? 256 : 128;
        }
        if ((1533916891 & i11) == 306783378 && (i12 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            interfaceC1668n5 = interfaceC1668n2;
            interfaceC1668n6 = interfaceC1668n3;
            z11 = z8;
            z13 = z9;
            z12 = z10;
            composer2 = startRestartGroup;
            interfaceC1668n7 = interfaceC1668n4;
        } else {
            InterfaceC1668n interfaceC1668n8 = i13 != 0 ? null : interfaceC1668n2;
            InterfaceC1668n interfaceC1668n9 = i14 != 0 ? null : interfaceC1668n3;
            InterfaceC1668n interfaceC1668n10 = i15 != 0 ? null : interfaceC1668n4;
            boolean z14 = i16 != 0 ? false : z8;
            boolean z15 = i17 != 0 ? true : z9;
            boolean z16 = i18 != 0 ? false : z10;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1341778867, i11, i12, "com.stripe.android.uicore.elements.compat.CommonDecorationBox (CompatTextField.kt:227)");
            }
            startRestartGroup.startReplaceableGroup(1391159388);
            boolean z17 = ((i11 & 14) == 4) | ((i11 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z17 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            String text = ((TransformedText) rememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, i12 & 14).getValue().booleanValue()) {
                cVar = r4.c.f38689a;
            } else {
                cVar = text.length() == 0 ? r4.c.f38690b : r4.c.f38691c;
            }
            r4.c cVar2 = cVar;
            c cVar3 = new c(colors, z15, z16, interactionSource);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i19 = MaterialTheme.$stable;
            Typography typography = materialTheme.getTypography(startRestartGroup, i19);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long m4727getColor0d7_KjU = subtitle1.m4727getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            boolean z18 = z14;
            boolean z19 = (Color.m2977equalsimpl0(m4727getColor0d7_KjU, companion.m3012getUnspecified0d7_KjU()) && !Color.m2977equalsimpl0(caption.m4727getColor0d7_KjU(), companion.m3012getUnspecified0d7_KjU())) || (!Color.m2977equalsimpl0(subtitle1.m4727getColor0d7_KjU(), companion.m3012getUnspecified0d7_KjU()) && Color.m2977equalsimpl0(caption.m4727getColor0d7_KjU(), companion.m3012getUnspecified0d7_KjU()));
            r4.f fVar = r4.f.f38725a;
            startRestartGroup.startReplaceableGroup(1391197102);
            long m4727getColor0d7_KjU2 = materialTheme.getTypography(startRestartGroup, i19).getCaption().m4727getColor0d7_KjU();
            boolean z20 = z16;
            startRestartGroup.startReplaceableGroup(1391198921);
            if (z19 && m4727getColor0d7_KjU2 == companion.m3012getUnspecified0d7_KjU()) {
                m4727getColor0d7_KjU2 = ((Color) cVar3.invoke(cVar2, startRestartGroup, 0)).m2986unboximpl();
            }
            long j8 = m4727getColor0d7_KjU2;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1391203216);
            long m4727getColor0d7_KjU3 = materialTheme.getTypography(startRestartGroup, i19).getSubtitle1().m4727getColor0d7_KjU();
            startRestartGroup.startReplaceableGroup(1391205097);
            if (z19 && m4727getColor0d7_KjU3 == companion.m3012getUnspecified0d7_KjU()) {
                m4727getColor0d7_KjU3 = ((Color) cVar3.invoke(cVar2, startRestartGroup, 0)).m2986unboximpl();
            }
            long j9 = m4727getColor0d7_KjU3;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            boolean z21 = z15;
            composer2 = startRestartGroup;
            fVar.a(cVar2, j8, j9, cVar3, interfaceC1668n != null, ComposableLambdaKt.composableLambda(composer2, 1648140010, true, new a(interfaceC1668n, interfaceC1668n8, text, colors, z15, z20, interfaceC1668n9, interfaceC1668n10, innerTextField, z18, contentPadding, z19)), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z11 = z18;
            interfaceC1668n5 = interfaceC1668n8;
            interfaceC1668n6 = interfaceC1668n9;
            interfaceC1668n7 = interfaceC1668n10;
            z12 = z20;
            z13 = z21;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0872b(value, innerTextField, visualTransformation, interfaceC1668n, interfaceC1668n5, interfaceC1668n6, interfaceC1668n7, z11, z13, z12, interactionSource, contentPadding, colors, i8, i9, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0654  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.text.input.TextFieldValue r73, kotlin.jvm.functions.Function1 r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, a6.InterfaceC1668n r79, a6.InterfaceC1668n r80, a6.InterfaceC1668n r81, a6.InterfaceC1668n r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.b.b(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, a6.n, a6.n, a6.n, a6.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(long r13, androidx.compose.ui.text.TextStyle r15, java.lang.Float r16, a6.InterfaceC1668n r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.b.c(long, androidx.compose.ui.text.TextStyle, java.lang.Float, a6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier d(Modifier modifier, boolean z8, String str) {
        if (z8) {
            return SemanticsModifierKt.semantics$default(modifier, false, new h(str), 1, null);
        }
        return modifier;
    }
}
