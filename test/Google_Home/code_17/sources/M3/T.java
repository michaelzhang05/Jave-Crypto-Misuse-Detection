package M3;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.C4033g;

/* loaded from: classes4.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    private static final long f6603a = ColorKt.Color(2566914048L);

    /* renamed from: b, reason: collision with root package name */
    private static final long f6604b = Color.Companion.m3013getWhite0d7_KjU();

    /* renamed from: c, reason: collision with root package name */
    private static final long f6605c = ColorKt.Color(4293256682L);

    /* renamed from: d, reason: collision with root package name */
    private static final long f6606d = ColorKt.Color(4283585106L);

    /* renamed from: e, reason: collision with root package name */
    private static final float f6607e = Dp.m5183constructorimpl(12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f6609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f6610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6611d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6612e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6608a = str;
            this.f6609b = function0;
            this.f6610c = modifier;
            this.f6611d = i8;
            this.f6612e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            T.a(this.f6608a, this.f6609b, this.f6610c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6611d | 1), this.f6612e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6613a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f6614b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f6615c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6616d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6617e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6613a = str;
            this.f6614b = function0;
            this.f6615c = modifier;
            this.f6616d = i8;
            this.f6617e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            T.b(this.f6613a, this.f6614b, this.f6615c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6616d | 1), this.f6617e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f6618a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f6618a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m23invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m23invoke() {
            Function0 function0 = this.f6618a;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f6619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MutableState mutableState) {
            super(0);
            this.f6619a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m24invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m24invoke() {
            this.f6619a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f6621b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f6622c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6623d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6624e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6625f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6626g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f6627h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, C c8, MutableState mutableState, Function0 function0, String str, String str2, int i8, int i9) {
            super(2);
            this.f6620a = z8;
            this.f6621b = c8;
            this.f6622c = mutableState;
            this.f6623d = function0;
            this.f6624e = str;
            this.f6625f = str2;
            this.f6626g = i8;
            this.f6627h = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            T.c(this.f6620a, this.f6621b, this.f6622c, this.f6623d, this.f6624e, this.f6625f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6626g | 1), this.f6627h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6629b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6630c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6631d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6632e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Color f6633f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z8, boolean z9, Function0 function0, int i8, Color color) {
            super(2);
            this.f6628a = str;
            this.f6629b = z8;
            this.f6630c = z9;
            this.f6631d = function0;
            this.f6632e = i8;
            this.f6633f = color;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            ColorFilter colorFilter;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852290854, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodCard.<anonymous> (SavedPaymentMethodTab.kt:188)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            Modifier m830selectableXHw0xAI$default = SelectableKt.m830selectableXHw0xAI$default(TestTagKt.testTag(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), "SAVED_PAYMENT_METHOD_CARD_TEST_TAG_" + this.f6628a), this.f6629b, this.f6630c, null, this.f6631d, 4, null);
            int i9 = this.f6632e;
            Color color = this.f6633f;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m830selectableXHw0xAI$default);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(i9, composer, 0);
            if (color != null) {
                colorFilter = ColorFilter.Companion.m3017tintxETnrds$default(ColorFilter.Companion, color.m2986unboximpl(), 0, 2, null);
            } else {
                colorFilter = null;
            }
            ImageKt.Image(painterResource, (String) null, SizeKt.m657width3ABfNKs(SizeKt.m638height3ABfNKs(companion, Dp.m5183constructorimpl(40)), Dp.m5183constructorimpl(56)), (Alignment) null, (ContentScale) null, 0.0f, colorFilter, composer, 440, 56);
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
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6634a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6636c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Color f6637d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6638e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f6639f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f6640g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f6641h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6642i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z8, boolean z9, int i8, Color color, String str, Function0 function0, Modifier modifier, int i9, int i10) {
            super(2);
            this.f6634a = z8;
            this.f6635b = z9;
            this.f6636c = i8;
            this.f6637d = color;
            this.f6638e = str;
            this.f6639f = function0;
            this.f6640g = modifier;
            this.f6641h = i9;
            this.f6642i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            T.d(this.f6634a, this.f6635b, this.f6636c, this.f6637d, this.f6638e, this.f6639f, this.f6640g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6641h | 1), this.f6642i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f6644b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f6645c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6646d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6647e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6648f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, C c8, MutableState mutableState, Function0 function0, String str, String str2) {
            super(3);
            this.f6643a = z8;
            this.f6644b = c8;
            this.f6645c = mutableState;
            this.f6646d = function0;
            this.f6647e = str;
            this.f6648f = str2;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(BoxScope BadgedBox, Composer composer, int i8) {
            AbstractC3255y.i(BadgedBox, "$this$BadgedBox");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355851704, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:89)");
            }
            T.c(this.f6643a, this.f6644b, this.f6645c, this.f6646d, this.f6647e, this.f6648f, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Color f6652d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6653e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f6654f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f6655g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f6656h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f6657i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f6658a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f6658a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return O5.I.f8278a;
            }

            public final void invoke(SemanticsPropertyReceiver semantics) {
                AbstractC3255y.i(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, AbstractC1306a.a(this.f6658a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z8, boolean z9, int i8, Color color, String str, Function0 function0, String str2, Integer num, boolean z10) {
            super(3);
            this.f6649a = z8;
            this.f6650b = z9;
            this.f6651c = i8;
            this.f6652d = color;
            this.f6653e = str;
            this.f6654f = function0;
            this.f6655g = str2;
            this.f6656h = num;
            this.f6657i = z10;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(BoxScope BadgedBox, Composer composer, int i8) {
            AbstractC3255y.i(BadgedBox, "$this$BadgedBox");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766600890, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:99)");
            }
            boolean z8 = this.f6649a;
            boolean z9 = this.f6650b;
            int i9 = this.f6651c;
            Color color = this.f6652d;
            String str = this.f6653e;
            Function0 function0 = this.f6654f;
            String str2 = this.f6655g;
            Integer num = this.f6656h;
            boolean z10 = this.f6657i;
            composer.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            T.d(z8, z9, i9, color, str, function0, null, composer, 0, 64);
            long m1182getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1182getOnSurface0d7_KjU();
            float f8 = 6;
            Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(companion, Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(4), Dp.m5183constructorimpl(f8), 0.0f, 8, null);
            composer.startReplaceableGroup(1159217395);
            boolean changed = composer.changed(str2);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(str2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            r.a(num, str, m1182getOnSurface0d7_KjU, SemanticsModifierKt.semantics$default(m609paddingqDBjuR0$default, false, (Function1) rememberedValue, 1, null), z10, composer, 0, 0);
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
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f6659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f6660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState, Function0 function0) {
            super(0);
            this.f6659a = mutableState;
            this.f6660b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m25invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m25invoke() {
            this.f6659a.setValue(Boolean.FALSE);
            this.f6660b.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f6661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(MutableState mutableState) {
            super(0);
            this.f6661a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m26invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m26invoke() {
            this.f6661a.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f6662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C f6664c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6665d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6666e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6667f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f6668g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Color f6669h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f6670i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f6671j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C4033g f6672k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f6673l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f6674m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f6675n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f6676o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f6677p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f6678q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f6679r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f6680s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f6681t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f6682u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(float f8, boolean z8, C c8, boolean z9, boolean z10, int i8, Modifier modifier, Color color, Integer num, String str, C4033g c4033g, String str2, boolean z11, Function0 function0, Function0 function02, String str3, String str4, Function0 function03, int i9, int i10, int i11) {
            super(2);
            this.f6662a = f8;
            this.f6663b = z8;
            this.f6664c = c8;
            this.f6665d = z9;
            this.f6666e = z10;
            this.f6667f = i8;
            this.f6668g = modifier;
            this.f6669h = color;
            this.f6670i = num;
            this.f6671j = str;
            this.f6672k = c4033g;
            this.f6673l = str2;
            this.f6674m = z11;
            this.f6675n = function0;
            this.f6676o = function02;
            this.f6677p = str3;
            this.f6678q = str4;
            this.f6679r = function03;
            this.f6680s = i9;
            this.f6681t = i10;
            this.f6682u = i11;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            T.e(this.f6662a, this.f6663b, this.f6664c, this.f6665d, this.f6666e, this.f6667f, this.f6668g, this.f6669h, this.f6670i, this.f6671j, this.f6672k, this.f6673l, this.f6674m, this.f6675n, this.f6676o, this.f6677p, this.f6678q, this.f6679r, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6680s | 1), RecomposeScopeImplKt.updateChangedFlags(this.f6681t), this.f6682u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z8) {
            super(0);
            this.f6683a = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableState invoke() {
            MutableState mutableStateOf$default;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.f6683a), null, 2, null);
            return mutableStateOf$default;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class n {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6684a;

        static {
            int[] iArr = new int[C.values().length];
            try {
                iArr[C.f6481c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.f6480b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.f6479a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6684a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r22, kotlin.jvm.functions.Function0 r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.T.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r22, kotlin.jvm.functions.Function0 r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.T.b(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r18, M3.C r19, androidx.compose.runtime.MutableState r20, kotlin.jvm.functions.Function0 r21, java.lang.String r22, java.lang.String r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.T.c(boolean, M3.C, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r20, boolean r21, int r22, androidx.compose.ui.graphics.Color r23, java.lang.String r24, kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.T.d(boolean, boolean, int, androidx.compose.ui.graphics.Color, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(float r41, boolean r42, M3.C r43, boolean r44, boolean r45, int r46, androidx.compose.ui.Modifier r47, androidx.compose.ui.graphics.Color r48, java.lang.Integer r49, java.lang.String r50, t3.C4033g r51, java.lang.String r52, boolean r53, kotlin.jvm.functions.Function0 r54, kotlin.jvm.functions.Function0 r55, java.lang.String r56, java.lang.String r57, kotlin.jvm.functions.Function0 r58, androidx.compose.runtime.Composer r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.T.e(float, boolean, M3.C, boolean, boolean, int, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, java.lang.Integer, java.lang.String, t3.g, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final float j() {
        return f6607e;
    }
}
