package t2;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import android.content.Context;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import e4.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;
import m4.C3439k;
import t3.s;

/* loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f39587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f39588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39589c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RoundedCornerShape f39590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BorderStroke f39591e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f39592f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f39593g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f39594h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextStyle f39595i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f39596j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f39597k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t2.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0885a extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f39598a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f39599b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextStyle f39600c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f39601d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f39602e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f39603f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0885a(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, boolean z10) {
                super(3);
                this.f39598a = str;
                this.f39599b = j8;
                this.f39600c = textStyle;
                this.f39601d = z8;
                this.f39602e = z9;
                this.f39603f = z10;
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8278a;
            }

            public final void invoke(RowScope TextButton, Composer composer, int i8) {
                AbstractC3255y.i(TextButton, "$this$TextButton");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-154386641, i8, -1, "com.stripe.android.common.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButton.kt:80)");
                }
                c.b(this.f39598a, Color.m2975copywmQWz5c$default(this.f39599b, ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), this.f39600c, this.f39601d, this.f39602e, this.f39603f, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, Function0 function0, boolean z8, RoundedCornerShape roundedCornerShape, BorderStroke borderStroke, long j8, String str, long j9, TextStyle textStyle, boolean z9, boolean z10) {
            super(2);
            this.f39587a = modifier;
            this.f39588b = function0;
            this.f39589c = z8;
            this.f39590d = roundedCornerShape;
            this.f39591e = borderStroke;
            this.f39592f = j8;
            this.f39593g = str;
            this.f39594h = j9;
            this.f39595i = textStyle;
            this.f39596j = z9;
            this.f39597k = z10;
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
                ComposerKt.traceEventStart(-1403289044, i8, -1, "com.stripe.android.common.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:61)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(this.f39587a, 0.0f, 1, null);
            Alignment center = Alignment.Companion.getCenter();
            Function0 function0 = this.f39588b;
            boolean z8 = this.f39589c;
            RoundedCornerShape roundedCornerShape = this.f39590d;
            BorderStroke borderStroke = this.f39591e;
            long j8 = this.f39592f;
            String str = this.f39593g;
            long j9 = this.f39594h;
            TextStyle textStyle = this.f39595i;
            boolean z9 = this.f39596j;
            boolean z10 = this.f39597k;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            ButtonKt.TextButton(function0, SizeKt.m637defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(s.f39714g, composer, 0), 1, null), z8, null, null, roundedCornerShape, borderStroke, ButtonDefaults.INSTANCE.m1147buttonColorsro_MJ88(j8, 0L, j8, 0L, composer, ButtonDefaults.$stable << 12, 10), null, ComposableLambdaKt.composableLambda(composer, -154386641, true, new C0885a(str, j9, textStyle, z8, z9, z10)), composer, 805306368, 280);
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
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f39605b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f39606c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f39607d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f39608e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f39609f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f39610g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f39611h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z8, Function0 function0, Modifier modifier, boolean z9, boolean z10, int i8, int i9) {
            super(2);
            this.f39604a = str;
            this.f39605b = z8;
            this.f39606c = function0;
            this.f39607d = modifier;
            this.f39608e = z9;
            this.f39609f = z10;
            this.f39610g = i8;
            this.f39611h = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            c.a(this.f39604a, this.f39605b, this.f39606c, this.f39607d, this.f39608e, this.f39609f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39610g | 1), this.f39611h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0886c extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f39613b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f39614c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f39615d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f39616e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f39617f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f39618g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0886c(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, long j9, boolean z10) {
            super(3);
            this.f39612a = str;
            this.f39613b = j8;
            this.f39614c = textStyle;
            this.f39615d = z8;
            this.f39616e = z9;
            this.f39617f = j9;
            this.f39618g = z10;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3255y.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1456958795, i9, -1, "com.stripe.android.common.ui.PrimaryButtonContent.<anonymous> (PrimaryButton.kt:106)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            TextKt.m1419Text4IGK_g(this.f39612a, BoxWithConstraints.align(companion, companion2.getCenter()), this.f39613b, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, this.f39614c, composer, 0, 0, 65528);
            if (this.f39615d) {
                composer.startReplaceableGroup(290615605);
                Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(SizeKt.m657width3ABfNKs(companion, BoxWithConstraints.mo545getMaxWidthD9Ej5fM()), 0.0f, 0.0f, Dp.m5183constructorimpl(8), 0.0f, 11, null);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0 constructor = companion3.getConstructor();
                InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
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
                Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                t2.b.b(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenterEnd()), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1180getOnPrimary0d7_KjU(), composer, 0, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (this.f39616e) {
                composer.startReplaceableGroup(291002144);
                Modifier m609paddingqDBjuR0$default2 = PaddingKt.m609paddingqDBjuR0$default(SizeKt.m657width3ABfNKs(companion, BoxWithConstraints.mo545getMaxWidthD9Ej5fM()), 0.0f, 0.0f, Dp.m5183constructorimpl(8), 0.0f, 11, null);
                long j8 = this.f39617f;
                boolean z8 = this.f39618g;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                Function0 constructor2 = companion4.getConstructor();
                InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2501constructorimpl2 = Updater.m2501constructorimpl(composer);
                Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Painter painterResource = PainterResources_androidKt.painterResource(k.f31665d, composer, 0);
                composer.startReplaceableGroup(747079535);
                float floatValue = z8 ? ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue() : 0.5f;
                composer.endReplaceableGroup();
                IconKt.m1271Iconww6aTOc(painterResource, "lock", boxScopeInstance.align(companion, companion2.getCenterEnd()), Color.m2975copywmQWz5c$default(j8, floatValue, 0.0f, 0.0f, 0.0f, 14, null), composer, 56, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(291697908);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39619a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f39620b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f39621c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f39622d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f39623e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f39624f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f39625g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, boolean z10, int i8) {
            super(2);
            this.f39619a = str;
            this.f39620b = j8;
            this.f39621c = textStyle;
            this.f39622d = z8;
            this.f39623e = z9;
            this.f39624f = z10;
            this.f39625g = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            c.b(this.f39619a, this.f39620b, this.f39621c, this.f39622d, this.f39623e, this.f39624f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39625g | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r24, boolean r25, kotlin.jvm.functions.Function0 r26, androidx.compose.ui.Modifier r27, boolean r28, boolean r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.c.a(java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, boolean z10, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(81045877);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(j8)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(z9)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(z10)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81045877, i9, -1, "com.stripe.android.common.ui.PrimaryButtonContent (PrimaryButton.kt:101)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(null, Alignment.Companion.getCenterStart(), false, ComposableLambdaKt.composableLambda(startRestartGroup, 1456958795, true, new C0886c(str, j8, textStyle, z9, z10, ColorKt.Color(AbstractC3441m.k(C3439k.f35205a.b(), (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), z8)), startRestartGroup, 3120, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(str, j8, textStyle, z8, z9, z10, i8));
        }
    }
}
