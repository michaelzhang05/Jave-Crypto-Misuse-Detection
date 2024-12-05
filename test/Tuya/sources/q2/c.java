package q2;

import L5.I;
import X5.n;
import X5.o;
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
import b4.k;
import j4.AbstractC3087m;
import j4.C3085k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.s;

/* loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f37265a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f37266b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37267c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RoundedCornerShape f37268d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BorderStroke f37269e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f37270f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f37271g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f37272h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextStyle f37273i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f37274j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f37275k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q2.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0852a extends AbstractC3160z implements o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f37276a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f37277b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextStyle f37278c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f37279d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f37280e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f37281f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0852a(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, boolean z10) {
                super(3);
                this.f37276a = str;
                this.f37277b = j8;
                this.f37278c = textStyle;
                this.f37279d = z8;
                this.f37280e = z9;
                this.f37281f = z10;
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6487a;
            }

            public final void invoke(RowScope TextButton, Composer composer, int i8) {
                AbstractC3159y.i(TextButton, "$this$TextButton");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-154386641, i8, -1, "com.stripe.android.common.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButton.kt:80)");
                }
                c.b(this.f37276a, Color.m2970copywmQWz5c$default(this.f37277b, ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), this.f37278c, this.f37279d, this.f37280e, this.f37281f, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, Function0 function0, boolean z8, RoundedCornerShape roundedCornerShape, BorderStroke borderStroke, long j8, String str, long j9, TextStyle textStyle, boolean z9, boolean z10) {
            super(2);
            this.f37265a = modifier;
            this.f37266b = function0;
            this.f37267c = z8;
            this.f37268d = roundedCornerShape;
            this.f37269e = borderStroke;
            this.f37270f = j8;
            this.f37271g = str;
            this.f37272h = j9;
            this.f37273i = textStyle;
            this.f37274j = z9;
            this.f37275k = z10;
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
                ComposerKt.traceEventStart(-1403289044, i8, -1, "com.stripe.android.common.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:61)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(this.f37265a, 0.0f, 1, null);
            Alignment center = Alignment.Companion.getCenter();
            Function0 function0 = this.f37266b;
            boolean z8 = this.f37267c;
            RoundedCornerShape roundedCornerShape = this.f37268d;
            BorderStroke borderStroke = this.f37269e;
            long j8 = this.f37270f;
            String str = this.f37271g;
            long j9 = this.f37272h;
            TextStyle textStyle = this.f37273i;
            boolean z9 = this.f37274j;
            boolean z10 = this.f37275k;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            ButtonKt.TextButton(function0, SizeKt.m632defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(s.f37392g, composer, 0), 1, null), z8, null, null, roundedCornerShape, borderStroke, ButtonDefaults.INSTANCE.m1142buttonColorsro_MJ88(j8, 0L, j8, 0L, composer, ButtonDefaults.$stable << 12, 10), null, ComposableLambdaKt.composableLambda(composer, -154386641, true, new C0852a(str, j9, textStyle, z8, z9, z10)), composer, 805306368, 280);
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
    public static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f37284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37285d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37286e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f37287f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37288g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37289h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z8, Function0 function0, Modifier modifier, boolean z9, boolean z10, int i8, int i9) {
            super(2);
            this.f37282a = str;
            this.f37283b = z8;
            this.f37284c = function0;
            this.f37285d = modifier;
            this.f37286e = z9;
            this.f37287f = z10;
            this.f37288g = i8;
            this.f37289h = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            c.a(this.f37282a, this.f37283b, this.f37284c, this.f37285d, this.f37286e, this.f37287f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37288g | 1), this.f37289h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0853c extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37291b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f37292c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37293d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37294e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f37295f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f37296g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0853c(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, long j9, boolean z10) {
            super(3);
            this.f37290a = str;
            this.f37291b = j8;
            this.f37292c = textStyle;
            this.f37293d = z8;
            this.f37294e = z9;
            this.f37295f = j9;
            this.f37296g = z10;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3159y.i(BoxWithConstraints, "$this$BoxWithConstraints");
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
            TextKt.m1414Text4IGK_g(this.f37290a, BoxWithConstraints.align(companion, companion2.getCenter()), this.f37291b, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, this.f37292c, composer, 0, 0, 65528);
            if (this.f37293d) {
                composer.startReplaceableGroup(290615605);
                Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(SizeKt.m652width3ABfNKs(companion, BoxWithConstraints.mo540getMaxWidthD9Ej5fM()), 0.0f, 0.0f, Dp.m5178constructorimpl(8), 0.0f, 11, null);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0 constructor = companion3.getConstructor();
                o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m604paddingqDBjuR0$default);
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
                Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                q2.b.b(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenterEnd()), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1175getOnPrimary0d7_KjU(), composer, 0, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (this.f37294e) {
                composer.startReplaceableGroup(291002144);
                Modifier m604paddingqDBjuR0$default2 = PaddingKt.m604paddingqDBjuR0$default(SizeKt.m652width3ABfNKs(companion, BoxWithConstraints.mo540getMaxWidthD9Ej5fM()), 0.0f, 0.0f, Dp.m5178constructorimpl(8), 0.0f, 11, null);
                long j8 = this.f37295f;
                boolean z8 = this.f37296g;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                Function0 constructor2 = companion4.getConstructor();
                o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m604paddingqDBjuR0$default2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2496constructorimpl2 = Updater.m2496constructorimpl(composer);
                Updater.m2503setimpl(m2496constructorimpl2, rememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                n setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Painter painterResource = PainterResources_androidKt.painterResource(k.f14659d, composer, 0);
                composer.startReplaceableGroup(747079535);
                float floatValue = z8 ? ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue() : 0.5f;
                composer.endReplaceableGroup();
                IconKt.m1266Iconww6aTOc(painterResource, "lock", boxScopeInstance.align(companion, companion2.getCenterEnd()), Color.m2970copywmQWz5c$default(j8, floatValue, 0.0f, 0.0f, 0.0f, 14, null), composer, 56, 0);
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
    public static final class d extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37297a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f37299c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37300d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37301e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f37302f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37303g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, long j8, TextStyle textStyle, boolean z8, boolean z9, boolean z10, int i8) {
            super(2);
            this.f37297a = str;
            this.f37298b = j8;
            this.f37299c = textStyle;
            this.f37300d = z8;
            this.f37301e = z9;
            this.f37302f = z10;
            this.f37303g = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            c.b(this.f37297a, this.f37298b, this.f37299c, this.f37300d, this.f37301e, this.f37302f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37303g | 1));
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
        throw new UnsupportedOperationException("Method not decompiled: q2.c.a(java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
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
            BoxWithConstraintsKt.BoxWithConstraints(null, Alignment.Companion.getCenterStart(), false, ComposableLambdaKt.composableLambda(startRestartGroup, 1456958795, true, new C0853c(str, j8, textStyle, z9, z10, ColorKt.Color(AbstractC3087m.k(C3085k.f33229a.b(), (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), z8)), startRestartGroup, 3120, 5);
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
