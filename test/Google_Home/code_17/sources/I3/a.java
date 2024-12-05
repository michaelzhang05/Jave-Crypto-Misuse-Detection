package I3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import e4.n;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.s;
import t3.t;
import t3.w;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3986a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1669o f3987b = ComposableLambdaKt.composableLambdaInstance(-2126683352, false, C0064a.f3995a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC1668n f3988c = ComposableLambdaKt.composableLambdaInstance(662623310, false, b.f3996a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC1668n f3989d = ComposableLambdaKt.composableLambdaInstance(792710640, false, c.f3997a);

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC1669o f3990e = ComposableLambdaKt.composableLambdaInstance(-1743939445, false, d.f3998a);

    /* renamed from: f, reason: collision with root package name */
    public static InterfaceC1668n f3991f = ComposableLambdaKt.composableLambdaInstance(2030747547, false, e.f3999a);

    /* renamed from: g, reason: collision with root package name */
    public static InterfaceC1668n f3992g = ComposableLambdaKt.composableLambdaInstance(1074415455, false, f.f4001a);

    /* renamed from: h, reason: collision with root package name */
    public static InterfaceC1668n f3993h = ComposableLambdaKt.composableLambdaInstance(-742473454, false, g.f4002a);

    /* renamed from: i, reason: collision with root package name */
    public static InterfaceC1668n f3994i = ComposableLambdaKt.composableLambdaInstance(-1698805546, false, h.f4004a);

    /* renamed from: I3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0064a extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final C0064a f3995a = new C0064a();

        C0064a() {
            super(3);
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
                ComposerKt.traceEventStart(-2126683352, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-1.<anonymous> (PollingScreen.kt:136)");
            }
            TextKt.m1419Text4IGK_g(StringResources_androidKt.stringResource(w.f39790i0, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3996a = new b();

        b() {
            super(2);
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
                ComposerKt.traceEventStart(662623310, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-2.<anonymous> (PollingScreen.kt:149)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3997a = new c();

        c() {
            super(2);
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
                ComposerKt.traceEventStart(792710640, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-3.<anonymous> (PollingScreen.kt:154)");
            }
            IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(t.f39722g, composer, 0), StringResources_androidKt.stringResource(n.f31724c, composer, 0), (Modifier) null, 0L, composer, 8, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final d f3998a = new d();

        d() {
            super(3);
        }

        public final void a(PaddingValues paddingValues, Composer composer, int i8) {
            int i9;
            int i10;
            AbstractC3255y.i(paddingValues, "paddingValues");
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
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(androidx.compose.foundation.layout.d.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier m606paddingVpY3zN4 = PaddingKt.m606paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(s.f39712e, composer, 0), PrimitiveResources_androidKt.dimensionResource(s.f39713f, composer, 0));
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m606paddingVpY3zN4);
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
            Updater.m2508setimpl(m2501constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            Painter painterResource = PainterResources_androidKt.painterResource(t.f39738w, composer, 0);
            I3.g gVar = I3.g.f4041a;
            ImageKt.Image(painterResource, (String) null, PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, gVar.a(), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
            String stringResource = StringResources_androidKt.stringResource(w.f39798m0, composer, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            TextStyle h42 = materialTheme.getTypography(composer, i11).getH4();
            TextAlign.Companion companion4 = TextAlign.Companion;
            TextKt.m1419Text4IGK_g(stringResource, PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, gVar.b(), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5080boximpl(companion4.m5087getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1) null, h42, composer, 48, 0, 65020);
            String stringResource2 = StringResources_androidKt.stringResource(w.f39796l0, composer, 0);
            TextAlign m5080boximpl = TextAlign.m5080boximpl(companion4.m5087getCentere0LSkKk());
            long m4728getFontSizeXSAIIZE = materialTheme.getTypography(composer, i11).getBody1().m4728getFontSizeXSAIIZE();
            TextUnitKt.m5383checkArithmeticR2X_6o(m4728getFontSizeXSAIIZE);
            TextKt.m1419Text4IGK_g(stringResource2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, m5080boximpl, TextUnitKt.pack(TextUnit.m5368getRawTypeimpl(m4728getFontSizeXSAIIZE), TextUnit.m5370getValueimpl(m4728getFontSizeXSAIIZE) * 1.3f), 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 129534);
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

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f3999a = new e();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0065a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0065a f4000a = new C0065a();

            C0065a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m17invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m17invoke() {
            }
        }

        e() {
            super(2);
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
                ComposerKt.traceEventStart(2030747547, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-5.<anonymous> (PollingScreen.kt:240)");
            }
            C3225a.C0782a c0782a = C3225a.f34131b;
            I3.d.c(new I3.f(AbstractC3227c.s(83, EnumC3228d.f34141e), w.f39794k0, I3.e.f4032a, null), C0065a.f4000a, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f4001a = new f();

        f() {
            super(2);
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
                ComposerKt.traceEventStart(1074415455, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-6.<anonymous> (PollingScreen.kt:239)");
            }
            SurfaceKt.m1358SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, a.f3986a.e(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f4002a = new g();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I3.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0066a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0066a f4003a = new C0066a();

            C0066a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m18invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18invoke() {
            }
        }

        g() {
            super(2);
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
                ComposerKt.traceEventStart(-742473454, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-7.<anonymous> (PollingScreen.kt:257)");
            }
            C3225a.C0782a c0782a = C3225a.f34131b;
            I3.d.c(new I3.f(AbstractC3227c.s(83, EnumC3228d.f34141e), w.f39794k0, I3.e.f4034c, null), C0066a.f4003a, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f4004a = new h();

        h() {
            super(2);
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
                ComposerKt.traceEventStart(-1698805546, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.ComposableSingletons$PollingScreenKt.lambda-8.<anonymous> (PollingScreen.kt:256)");
            }
            SurfaceKt.m1358SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, a.f3986a.f(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1669o a() {
        return f3987b;
    }

    public final InterfaceC1668n b() {
        return f3988c;
    }

    public final InterfaceC1668n c() {
        return f3989d;
    }

    public final InterfaceC1669o d() {
        return f3990e;
    }

    public final InterfaceC1668n e() {
        return f3991f;
    }

    public final InterfaceC1668n f() {
        return f3993h;
    }
}
