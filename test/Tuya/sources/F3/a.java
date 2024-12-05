package F3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.s;
import q3.t;
import q3.w;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2446a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static o f2447b = ComposableLambdaKt.composableLambdaInstance(-2126683352, false, C0039a.f2455a);

    /* renamed from: c, reason: collision with root package name */
    public static n f2448c = ComposableLambdaKt.composableLambdaInstance(662623310, false, b.f2456a);

    /* renamed from: d, reason: collision with root package name */
    public static n f2449d = ComposableLambdaKt.composableLambdaInstance(792710640, false, c.f2457a);

    /* renamed from: e, reason: collision with root package name */
    public static o f2450e = ComposableLambdaKt.composableLambdaInstance(-1743939445, false, d.f2458a);

    /* renamed from: f, reason: collision with root package name */
    public static n f2451f = ComposableLambdaKt.composableLambdaInstance(2030747547, false, e.f2459a);

    /* renamed from: g, reason: collision with root package name */
    public static n f2452g = ComposableLambdaKt.composableLambdaInstance(1074415455, false, f.f2461a);

    /* renamed from: h, reason: collision with root package name */
    public static n f2453h = ComposableLambdaKt.composableLambdaInstance(-742473454, false, g.f2462a);

    /* renamed from: i, reason: collision with root package name */
    public static n f2454i = ComposableLambdaKt.composableLambdaInstance(-1698805546, false, h.f2464a);

    /* renamed from: F3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0039a extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final C0039a f2455a = new C0039a();

        C0039a() {
            super(3);
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
                ComposerKt.traceEventStart(-2126683352, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-1.<anonymous> (PollingScreen.kt:136)");
            }
            TextKt.m1414Text4IGK_g(StringResources_androidKt.stringResource(w.f37468i0, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2456a = new b();

        b() {
            super(2);
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
                ComposerKt.traceEventStart(662623310, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-2.<anonymous> (PollingScreen.kt:149)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2457a = new c();

        c() {
            super(2);
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
                ComposerKt.traceEventStart(792710640, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-3.<anonymous> (PollingScreen.kt:154)");
            }
            IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(t.f37400g, composer, 0), StringResources_androidKt.stringResource(b4.n.f14718c, composer, 0), (Modifier) null, 0L, composer, 8, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final d f2458a = new d();

        d() {
            super(3);
        }

        public final void a(PaddingValues paddingValues, Composer composer, int i8) {
            int i9;
            int i10;
            AbstractC3159y.i(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                if (composer.changed(paddingValues)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i9 = i8 | i10;
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1743939445, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-4.<anonymous> (PollingScreen.kt:164)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
            composer.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(androidx.compose.foundation.layout.d.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier m601paddingVpY3zN4 = PaddingKt.m601paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(s.f37390e, composer, 0), PrimitiveResources_androidKt.dimensionResource(s.f37391f, composer, 0));
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m601paddingVpY3zN4);
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
            Updater.m2503setimpl(m2496constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            Painter painterResource = PainterResources_androidKt.painterResource(t.f37416w, composer, 0);
            F3.g gVar = F3.g.f2501a;
            ImageKt.Image(painterResource, (String) null, PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, gVar.a(), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
            String stringResource = StringResources_androidKt.stringResource(w.f37476m0, composer, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            TextStyle h42 = materialTheme.getTypography(composer, i11).getH4();
            TextAlign.Companion companion4 = TextAlign.Companion;
            TextKt.m1414Text4IGK_g(stringResource, PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, gVar.b(), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5075boximpl(companion4.m5082getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, h42, composer, 48, 0, 65020);
            String stringResource2 = StringResources_androidKt.stringResource(w.f37474l0, composer, 0);
            TextAlign m5075boximpl = TextAlign.m5075boximpl(companion4.m5082getCentere0LSkKk());
            long m4723getFontSizeXSAIIZE = materialTheme.getTypography(composer, i11).getBody1().m4723getFontSizeXSAIIZE();
            TextUnitKt.m5378checkArithmeticR2X_6o(m4723getFontSizeXSAIIZE);
            TextKt.m1414Text4IGK_g(stringResource2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, m5075boximpl, TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(m4723getFontSizeXSAIIZE), TextUnit.m5365getValueimpl(m4723getFontSizeXSAIIZE) * 1.3f), 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 129534);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            SpacerKt.Spacer(androidx.compose.foundation.layout.d.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f2459a = new e();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: F3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0040a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0040a f2460a = new C0040a();

            C0040a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m12invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12invoke() {
            }
        }

        e() {
            super(2);
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
                ComposerKt.traceEventStart(2030747547, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-5.<anonymous> (PollingScreen.kt:240)");
            }
            C2758a.C0756a c0756a = C2758a.f31409b;
            F3.d.c(new F3.f(AbstractC2760c.s(83, EnumC2761d.f31419e), w.f37472k0, F3.e.f2492a, null), C0040a.f2460a, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f2461a = new f();

        f() {
            super(2);
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
                ComposerKt.traceEventStart(1074415455, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-6.<anonymous> (PollingScreen.kt:239)");
            }
            SurfaceKt.m1353SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, a.f2446a.e(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f2462a = new g();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: F3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0041a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0041a f2463a = new C0041a();

            C0041a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13invoke() {
            }
        }

        g() {
            super(2);
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
                ComposerKt.traceEventStart(-742473454, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-7.<anonymous> (PollingScreen.kt:257)");
            }
            C2758a.C0756a c0756a = C2758a.f31409b;
            F3.d.c(new F3.f(AbstractC2760c.s(83, EnumC2761d.f31419e), w.f37472k0, F3.e.f2494c, null), C0041a.f2463a, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f2464a = new h();

        h() {
            super(2);
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
                ComposerKt.traceEventStart(-1698805546, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-8.<anonymous> (PollingScreen.kt:256)");
            }
            SurfaceKt.m1353SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, a.f2446a.f(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final o a() {
        return f2447b;
    }

    public final n b() {
        return f2448c;
    }

    public final n c() {
        return f2449d;
    }

    public final o d() {
        return f2450e;
    }

    public final n e() {
        return f2451f;
    }

    public final n f() {
        return f2453h;
    }
}
