package o4;

import L5.I;
import X5.n;
import X5.o;
import X5.r;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f36389a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f36390b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36391c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f36392d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f36393e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f36394f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f36395g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f36396h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ n f36397i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f36398j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ PaddingValues f36399k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f36400l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0839a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f36401a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f36402b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ n f36403c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f36404d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f36405e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0839a(float f8, long j8, n nVar, boolean z8, long j9) {
                super(2);
                this.f36401a = f8;
                this.f36402b = j8;
                this.f36403c = nVar;
                this.f36404d = z8;
                this.f36405e = j9;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                TextStyle textStyle;
                TextStyle m4719copyv2rsoow;
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-753626064, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:270)");
                }
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i9 = MaterialTheme.$stable;
                TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer, i9).getSubtitle1(), materialTheme.getTypography(composer, i9).getCaption(), this.f36401a);
                boolean z8 = this.f36404d;
                long j8 = this.f36405e;
                if (z8) {
                    m4719copyv2rsoow = lerp.m4719copyv2rsoow((r48 & 1) != 0 ? lerp.spanStyle.m4651getColor0d7_KjU() : j8, (r48 & 2) != 0 ? lerp.spanStyle.m4652getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? lerp.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? lerp.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? lerp.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? lerp.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(lerp.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(lerp.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? lerp.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.platformStyle : null, (r48 & 1048576) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(lerp.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(lerp.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? lerp.paragraphStyle.getTextMotion() : null);
                    textStyle = m4719copyv2rsoow;
                } else {
                    textStyle = lerp;
                }
                b.c(this.f36402b, textStyle, null, this.f36403c, composer, 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o4.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0840b extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f36406a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f36407b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0840b(long j8, n nVar) {
                super(2);
                this.f36406a = j8;
                this.f36407b = nVar;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-816802558, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:301)");
                }
                b.c(this.f36406a, null, null, this.f36407b, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3160z implements o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f36408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextFieldColors f36409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f36410c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ n f36411d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f8, TextFieldColors textFieldColors, boolean z8, n nVar) {
                super(3);
                this.f36408a = f8;
                this.f36409b = textFieldColors;
                this.f36410c = z8;
                this.f36411d = nVar;
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6487a;
            }

            public final void invoke(Modifier modifier, Composer composer, int i8) {
                AbstractC3159y.i(modifier, "modifier");
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
                Modifier alpha = AlphaKt.alpha(modifier, this.f36408a);
                TextFieldColors textFieldColors = this.f36409b;
                boolean z8 = this.f36410c;
                n nVar = this.f36411d;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0 constructor = companion.getConstructor();
                o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(alpha);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
                Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                n setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                b.c(textFieldColors.placeholderColor(z8, composer, 0).getValue().m2981unboximpl(), MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), null, nVar, composer, 0, 4);
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
        public static final class d extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f36412a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f36413b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(long j8, n nVar) {
                super(2);
                this.f36412a = j8;
                this.f36413b = nVar;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2104269322, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:308)");
                }
                b.c(this.f36412a, null, null, this.f36413b, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, n nVar2, String str, TextFieldColors textFieldColors, boolean z8, boolean z9, n nVar3, n nVar4, n nVar5, boolean z10, PaddingValues paddingValues, boolean z11) {
            super(6);
            this.f36389a = nVar;
            this.f36390b = nVar2;
            this.f36391c = str;
            this.f36392d = textFieldColors;
            this.f36393e = z8;
            this.f36394f = z9;
            this.f36395g = nVar3;
            this.f36396h = nVar4;
            this.f36397i = nVar5;
            this.f36398j = z10;
            this.f36399k = paddingValues;
            this.f36400l = z11;
        }

        @Override // X5.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            m5621invokeRIQooxk(((Number) obj).floatValue(), ((Color) obj2).m2981unboximpl(), ((Color) obj3).m2981unboximpl(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
            return I.f6487a;
        }

        /* renamed from: invoke-RIQooxk, reason: not valid java name */
        public final void m5621invokeRIQooxk(float f8, long j8, long j9, float f9, Composer composer, int i8) {
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
            n nVar = this.f36389a;
            if (nVar != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composer, -753626064, true, new C0839a(f8, j9, nVar, this.f36400l, j8));
            } else {
                composableLambda = null;
            }
            if (this.f36390b != null && this.f36391c.length() == 0 && f9 > 0.0f) {
                composableLambda2 = ComposableLambdaKt.composableLambda(composer, -848031908, true, new c(f9, this.f36392d, this.f36393e, this.f36390b));
            } else {
                composableLambda2 = null;
            }
            long m2981unboximpl = this.f36392d.leadingIconColor(this.f36393e, this.f36394f, composer, 0).getValue().m2981unboximpl();
            n nVar2 = this.f36395g;
            if (nVar2 != null) {
                composableLambda3 = ComposableLambdaKt.composableLambda(composer, -816802558, true, new C0840b(m2981unboximpl, nVar2));
            } else {
                composableLambda3 = null;
            }
            long m2981unboximpl2 = this.f36392d.trailingIconColor(this.f36393e, this.f36394f, composer, 0).getValue().m2981unboximpl();
            n nVar3 = this.f36396h;
            if (nVar3 != null) {
                composableLambda4 = ComposableLambdaKt.composableLambda(composer, -2104269322, true, new d(m2981unboximpl2, nVar3));
            } else {
                composableLambda4 = null;
            }
            int i14 = ((i9 << 21) & 29360128) | 6;
            o4.d.a(Modifier.Companion, this.f36397i, composableLambda, composableLambda2, composableLambda3, composableLambda4, this.f36398j, f8, this.f36399k, composer, i14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0841b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36414a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f36415b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f36416c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f36417d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f36418e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f36419f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f36420g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f36421h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f36422i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f36423j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InteractionSource f36424k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ PaddingValues f36425l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f36426m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f36427n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f36428o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f36429p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0841b(String str, n nVar, VisualTransformation visualTransformation, n nVar2, n nVar3, n nVar4, n nVar5, boolean z8, boolean z9, boolean z10, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, int i8, int i9, int i10) {
            super(2);
            this.f36414a = str;
            this.f36415b = nVar;
            this.f36416c = visualTransformation;
            this.f36417d = nVar2;
            this.f36418e = nVar3;
            this.f36419f = nVar4;
            this.f36420g = nVar5;
            this.f36421h = z8;
            this.f36422i = z9;
            this.f36423j = z10;
            this.f36424k = interactionSource;
            this.f36425l = paddingValues;
            this.f36426m = textFieldColors;
            this.f36427n = i8;
            this.f36428o = i9;
            this.f36429p = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f36414a, this.f36415b, this.f36416c, this.f36417d, this.f36418e, this.f36419f, this.f36420g, this.f36421h, this.f36422i, this.f36423j, this.f36424k, this.f36425l, this.f36426m, composer, RecomposeScopeImplKt.updateChangedFlags(this.f36427n | 1), RecomposeScopeImplKt.updateChangedFlags(this.f36428o), this.f36429p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f36430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36431b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f36432c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InteractionSource f36433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(TextFieldColors textFieldColors, boolean z8, boolean z9, InteractionSource interactionSource) {
            super(3);
            this.f36430a = textFieldColors;
            this.f36431b = z8;
            this.f36432c = z9;
            this.f36433d = interactionSource;
        }

        public final long a(o4.c it, Composer composer, int i8) {
            boolean z8;
            AbstractC3159y.i(it, "it");
            composer.startReplaceableGroup(348982872);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348982872, i8, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous> (CompatTextField.kt:240)");
            }
            TextFieldColors textFieldColors = this.f36430a;
            boolean z9 = this.f36431b;
            if (it == o4.c.f36482b) {
                z8 = false;
            } else {
                z8 = this.f36432c;
            }
            long m2981unboximpl = textFieldColors.labelColor(z9, z8, this.f36433d, composer, 0).getValue().m2981unboximpl();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return m2981unboximpl;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return Color.m2961boximpl(a((o4.c) obj, (Composer) obj2, ((Number) obj3).intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f36434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f36435b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f36436c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f36437d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f36438e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f36439f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f36440g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f36441h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f36442i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ MutableInteractionSource f36443j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f36444k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(TextFieldValue textFieldValue, n nVar, VisualTransformation visualTransformation, n nVar2, n nVar3, n nVar4, boolean z8, boolean z9, boolean z10, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
            super(3);
            this.f36434a = textFieldValue;
            this.f36435b = nVar;
            this.f36436c = visualTransformation;
            this.f36437d = nVar2;
            this.f36438e = nVar3;
            this.f36439f = nVar4;
            this.f36440g = z8;
            this.f36441h = z9;
            this.f36442i = z10;
            this.f36443j = mutableInteractionSource;
            this.f36444k = textFieldColors;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((n) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(n innerTextField, Composer composer, int i8) {
            int i9;
            PaddingValues m1389textFieldWithLabelPaddinga9UjIt4$default;
            AbstractC3159y.i(innerTextField, "innerTextField");
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
            String text = this.f36434a.getText();
            if (this.f36435b == null) {
                m1389textFieldWithLabelPaddinga9UjIt4$default = TextFieldDefaults.m1390textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            } else {
                m1389textFieldWithLabelPaddinga9UjIt4$default = TextFieldDefaults.m1389textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            }
            b.a(text, innerTextField, this.f36436c, this.f36435b, this.f36437d, this.f36438e, this.f36439f, this.f36440g, this.f36441h, this.f36442i, this.f36443j, m1389textFieldWithLabelPaddinga9UjIt4$default, this.f36444k, composer, (i9 << 3) & 112, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f36445a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f36446b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f36447c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f36448d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f36449e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextStyle f36450f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f36451g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f36452h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ n f36453i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ n f36454j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f36455k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f36456l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f36457m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ KeyboardActions f36458n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f36459o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f36460p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f36461q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableInteractionSource f36462r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Shape f36463s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ TextFieldColors f36464t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f36465u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f36466v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f36467w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z8, boolean z9, TextStyle textStyle, n nVar, n nVar2, n nVar3, n nVar4, boolean z10, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z11, int i8, int i9, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i10, int i11, int i12) {
            super(2);
            this.f36445a = textFieldValue;
            this.f36446b = function1;
            this.f36447c = modifier;
            this.f36448d = z8;
            this.f36449e = z9;
            this.f36450f = textStyle;
            this.f36451g = nVar;
            this.f36452h = nVar2;
            this.f36453i = nVar3;
            this.f36454j = nVar4;
            this.f36455k = z10;
            this.f36456l = visualTransformation;
            this.f36457m = keyboardOptions;
            this.f36458n = keyboardActions;
            this.f36459o = z11;
            this.f36460p = i8;
            this.f36461q = i9;
            this.f36462r = mutableInteractionSource;
            this.f36463s = shape;
            this.f36464t = textFieldColors;
            this.f36465u = i10;
            this.f36466v = i11;
            this.f36467w = i12;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f36445a, this.f36446b, this.f36447c, this.f36448d, this.f36449e, this.f36450f, this.f36451g, this.f36452h, this.f36453i, this.f36454j, this.f36455k, this.f36456l, this.f36457m, this.f36458n, this.f36459o, this.f36460p, this.f36461q, this.f36462r, this.f36463s, this.f36464t, composer, RecomposeScopeImplKt.updateChangedFlags(this.f36465u | 1), RecomposeScopeImplKt.updateChangedFlags(this.f36466v), this.f36467w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f36468a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextStyle f36469b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Float f36470c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f36471d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f36472e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f36473f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j8, TextStyle textStyle, Float f8, n nVar, int i8, int i9) {
            super(2);
            this.f36468a = j8;
            this.f36469b = textStyle;
            this.f36470c = f8;
            this.f36471d = nVar;
            this.f36472e = i8;
            this.f36473f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f36468a, this.f36469b, this.f36470c, this.f36471d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f36472e | 1), this.f36473f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f36474a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Float f36475b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f36476c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Float f36477a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f36478b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f36479c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Float f8, n nVar, long j8) {
                super(2);
                this.f36477a = f8;
                this.f36478b = nVar;
                this.f36479c = j8;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1070796295, i8, -1, "com.stripe.android.uicore.elements.compat.Decoration.<anonymous>.<anonymous> (CompatTextField.kt:341)");
                }
                if (this.f36477a != null) {
                    composer.startReplaceableGroup(-979697943);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(this.f36477a)}, this.f36478b, composer, 8);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-979519197);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2973getAlphaimpl(this.f36479c)))}, this.f36478b, composer, 8);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j8, Float f8, n nVar) {
            super(2);
            this.f36474a = j8;
            this.f36475b = f8;
            this.f36476c = nVar;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1247846727, i8, -1, "com.stripe.android.uicore.elements.compat.Decoration.<anonymous> (CompatTextField.kt:340)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2961boximpl(this.f36474a))}, ComposableLambdaKt.composableLambda(composer, -1070796295, true, new a(this.f36475b, this.f36476c, this.f36474a)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36480a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(1);
            this.f36480a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.error(semantics, this.f36480a);
        }
    }

    public static final void a(String value, n innerTextField, VisualTransformation visualTransformation, n nVar, n nVar2, n nVar3, n nVar4, boolean z8, boolean z9, boolean z10, InteractionSource interactionSource, PaddingValues contentPadding, TextFieldColors colors, Composer composer, int i8, int i9, int i10) {
        int i11;
        int i12;
        o4.c cVar;
        Composer composer2;
        boolean z11;
        n nVar5;
        n nVar6;
        n nVar7;
        boolean z12;
        boolean z13;
        AbstractC3159y.i(value, "value");
        AbstractC3159y.i(innerTextField, "innerTextField");
        AbstractC3159y.i(visualTransformation, "visualTransformation");
        AbstractC3159y.i(interactionSource, "interactionSource");
        AbstractC3159y.i(contentPadding, "contentPadding");
        AbstractC3159y.i(colors, "colors");
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
            i11 |= startRestartGroup.changedInstance(nVar) ? 2048 : 1024;
        }
        int i13 = i10 & 16;
        if (i13 != 0) {
            i11 |= 24576;
        } else if ((i8 & 57344) == 0) {
            i11 |= startRestartGroup.changedInstance(nVar2) ? 16384 : 8192;
        }
        int i14 = i10 & 32;
        if (i14 != 0) {
            i11 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i8 & 458752) == 0) {
            i11 |= startRestartGroup.changedInstance(nVar3) ? 131072 : 65536;
        }
        int i15 = i10 & 64;
        if (i15 != 0) {
            i11 |= 1572864;
        } else if ((i8 & 3670016) == 0) {
            i11 |= startRestartGroup.changedInstance(nVar4) ? 1048576 : 524288;
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
            nVar5 = nVar2;
            nVar6 = nVar3;
            z11 = z8;
            z13 = z9;
            z12 = z10;
            composer2 = startRestartGroup;
            nVar7 = nVar4;
        } else {
            n nVar8 = i13 != 0 ? null : nVar2;
            n nVar9 = i14 != 0 ? null : nVar3;
            n nVar10 = i15 != 0 ? null : nVar4;
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
                cVar = o4.c.f36481a;
            } else {
                cVar = text.length() == 0 ? o4.c.f36482b : o4.c.f36483c;
            }
            o4.c cVar2 = cVar;
            c cVar3 = new c(colors, z15, z16, interactionSource);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i19 = MaterialTheme.$stable;
            Typography typography = materialTheme.getTypography(startRestartGroup, i19);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long m4722getColor0d7_KjU = subtitle1.m4722getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            boolean z18 = z14;
            boolean z19 = (Color.m2972equalsimpl0(m4722getColor0d7_KjU, companion.m3007getUnspecified0d7_KjU()) && !Color.m2972equalsimpl0(caption.m4722getColor0d7_KjU(), companion.m3007getUnspecified0d7_KjU())) || (!Color.m2972equalsimpl0(subtitle1.m4722getColor0d7_KjU(), companion.m3007getUnspecified0d7_KjU()) && Color.m2972equalsimpl0(caption.m4722getColor0d7_KjU(), companion.m3007getUnspecified0d7_KjU()));
            o4.f fVar = o4.f.f36517a;
            startRestartGroup.startReplaceableGroup(1391197102);
            long m4722getColor0d7_KjU2 = materialTheme.getTypography(startRestartGroup, i19).getCaption().m4722getColor0d7_KjU();
            boolean z20 = z16;
            startRestartGroup.startReplaceableGroup(1391198921);
            if (z19 && m4722getColor0d7_KjU2 == companion.m3007getUnspecified0d7_KjU()) {
                m4722getColor0d7_KjU2 = ((Color) cVar3.invoke(cVar2, startRestartGroup, 0)).m2981unboximpl();
            }
            long j8 = m4722getColor0d7_KjU2;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1391203216);
            long m4722getColor0d7_KjU3 = materialTheme.getTypography(startRestartGroup, i19).getSubtitle1().m4722getColor0d7_KjU();
            startRestartGroup.startReplaceableGroup(1391205097);
            if (z19 && m4722getColor0d7_KjU3 == companion.m3007getUnspecified0d7_KjU()) {
                m4722getColor0d7_KjU3 = ((Color) cVar3.invoke(cVar2, startRestartGroup, 0)).m2981unboximpl();
            }
            long j9 = m4722getColor0d7_KjU3;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            boolean z21 = z15;
            composer2 = startRestartGroup;
            fVar.a(cVar2, j8, j9, cVar3, nVar != null, ComposableLambdaKt.composableLambda(composer2, 1648140010, true, new a(nVar, nVar8, text, colors, z15, z20, nVar9, nVar10, innerTextField, z18, contentPadding, z19)), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z11 = z18;
            nVar5 = nVar8;
            nVar6 = nVar9;
            nVar7 = nVar10;
            z12 = z20;
            z13 = z21;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0841b(value, innerTextField, visualTransformation, nVar, nVar5, nVar6, nVar7, z11, z13, z12, interactionSource, contentPadding, colors, i8, i9, i10));
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
    public static final void b(androidx.compose.ui.text.input.TextFieldValue r73, kotlin.jvm.functions.Function1 r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, X5.n r79, X5.n r80, X5.n r81, X5.n r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.b.b(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, X5.n, X5.n, X5.n, X5.n, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final void c(long r13, androidx.compose.ui.text.TextStyle r15, java.lang.Float r16, X5.n r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.b.c(long, androidx.compose.ui.text.TextStyle, java.lang.Float, X5.n, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier d(Modifier modifier, boolean z8, String str) {
        if (z8) {
            return SemanticsModifierKt.semantics$default(modifier, false, new h(str), 1, null);
        }
        return modifier;
    }
}
