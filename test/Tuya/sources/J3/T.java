package J3;

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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;

/* loaded from: classes4.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    private static final long f4897a = ColorKt.Color(2566914048L);

    /* renamed from: b, reason: collision with root package name */
    private static final long f4898b = Color.Companion.m3008getWhite0d7_KjU();

    /* renamed from: c, reason: collision with root package name */
    private static final long f4899c = ColorKt.Color(4293256682L);

    /* renamed from: d, reason: collision with root package name */
    private static final long f4900d = ColorKt.Color(4283585106L);

    /* renamed from: e, reason: collision with root package name */
    private static final float f4901e = Dp.m5178constructorimpl(12);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4902a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f4903b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f4904c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4905d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4906e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4902a = str;
            this.f4903b = function0;
            this.f4904c = modifier;
            this.f4905d = i8;
            this.f4906e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            T.a(this.f4902a, this.f4903b, this.f4904c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4905d | 1), this.f4906e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4907a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f4908b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f4909c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4910d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4911e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4907a = str;
            this.f4908b = function0;
            this.f4909c = modifier;
            this.f4910d = i8;
            this.f4911e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            T.b(this.f4907a, this.f4908b, this.f4909c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4910d | 1), this.f4911e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f4912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0) {
            super(0);
            this.f4912a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m18invoke() {
            Function0 function0 = this.f4912a;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f4913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MutableState mutableState) {
            super(0);
            this.f4913a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m19invoke() {
            this.f4913a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4914a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f4915b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f4916c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f4917d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4918e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f4919f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f4920g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f4921h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, C c8, MutableState mutableState, Function0 function0, String str, String str2, int i8, int i9) {
            super(2);
            this.f4914a = z8;
            this.f4915b = c8;
            this.f4916c = mutableState;
            this.f4917d = function0;
            this.f4918e = str;
            this.f4919f = str2;
            this.f4920g = i8;
            this.f4921h = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            T.c(this.f4914a, this.f4915b, this.f4916c, this.f4917d, this.f4918e, this.f4919f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4920g | 1), this.f4921h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4922a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4924c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f4925d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4926e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Color f4927f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z8, boolean z9, Function0 function0, int i8, Color color) {
            super(2);
            this.f4922a = str;
            this.f4923b = z8;
            this.f4924c = z9;
            this.f4925d = function0;
            this.f4926e = i8;
            this.f4927f = color;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
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
            Modifier m825selectableXHw0xAI$default = SelectableKt.m825selectableXHw0xAI$default(TestTagKt.testTag(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), "SAVED_PAYMENT_METHOD_CARD_TEST_TAG_" + this.f4922a), this.f4923b, this.f4924c, null, this.f4925d, 4, null);
            int i9 = this.f4926e;
            Color color = this.f4927f;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m825selectableXHw0xAI$default);
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
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(i9, composer, 0);
            if (color != null) {
                colorFilter = ColorFilter.Companion.m3012tintxETnrds$default(ColorFilter.Companion, color.m2981unboximpl(), 0, 2, null);
            } else {
                colorFilter = null;
            }
            ImageKt.Image(painterResource, (String) null, SizeKt.m652width3ABfNKs(SizeKt.m633height3ABfNKs(companion, Dp.m5178constructorimpl(40)), Dp.m5178constructorimpl(56)), (Alignment) null, (ContentScale) null, 0.0f, colorFilter, composer, 440, 56);
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
    public static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4928a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4929b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4930c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Color f4931d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4932e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f4933f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f4934g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f4935h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f4936i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z8, boolean z9, int i8, Color color, String str, Function0 function0, Modifier modifier, int i9, int i10) {
            super(2);
            this.f4928a = z8;
            this.f4929b = z9;
            this.f4930c = i8;
            this.f4931d = color;
            this.f4932e = str;
            this.f4933f = function0;
            this.f4934g = modifier;
            this.f4935h = i9;
            this.f4936i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            T.d(this.f4928a, this.f4929b, this.f4930c, this.f4931d, this.f4932e, this.f4933f, this.f4934g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4935h | 1), this.f4936i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f4938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f4939c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f4940d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4941e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f4942f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, C c8, MutableState mutableState, Function0 function0, String str, String str2) {
            super(3);
            this.f4937a = z8;
            this.f4938b = c8;
            this.f4939c = mutableState;
            this.f4940d = function0;
            this.f4941e = str;
            this.f4942f = str2;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(BoxScope BadgedBox, Composer composer, int i8) {
            AbstractC3159y.i(BadgedBox, "$this$BadgedBox");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355851704, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:89)");
            }
            T.c(this.f4937a, this.f4938b, this.f4939c, this.f4940d, this.f4941e, this.f4942f, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4943a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4944b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4945c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Color f4946d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4947e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f4948f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f4949g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f4950h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f4951i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f4952a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f4952a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return L5.I.f6487a;
            }

            public final void invoke(SemanticsPropertyReceiver semantics) {
                AbstractC3159y.i(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, AbstractC1193a.a(this.f4952a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z8, boolean z9, int i8, Color color, String str, Function0 function0, String str2, Integer num, boolean z10) {
            super(3);
            this.f4943a = z8;
            this.f4944b = z9;
            this.f4945c = i8;
            this.f4946d = color;
            this.f4947e = str;
            this.f4948f = function0;
            this.f4949g = str2;
            this.f4950h = num;
            this.f4951i = z10;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(BoxScope BadgedBox, Composer composer, int i8) {
            AbstractC3159y.i(BadgedBox, "$this$BadgedBox");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766600890, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:99)");
            }
            boolean z8 = this.f4943a;
            boolean z9 = this.f4944b;
            int i9 = this.f4945c;
            Color color = this.f4946d;
            String str = this.f4947e;
            Function0 function0 = this.f4948f;
            String str2 = this.f4949g;
            Integer num = this.f4950h;
            boolean z10 = this.f4951i;
            composer.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            T.d(z8, z9, i9, color, str, function0, null, composer, 0, 64);
            long m1177getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1177getOnSurface0d7_KjU();
            float f8 = 6;
            Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(4), Dp.m5178constructorimpl(f8), 0.0f, 8, null);
            composer.startReplaceableGroup(1159217395);
            boolean changed = composer.changed(str2);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(str2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            r.a(num, str, m1177getOnSurface0d7_KjU, SemanticsModifierKt.semantics$default(m604paddingqDBjuR0$default, false, (Function1) rememberedValue, 1, null), z10, composer, 0, 0);
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
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f4953a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f4954b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState, Function0 function0) {
            super(0);
            this.f4953a = mutableState;
            this.f4954b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m20invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m20invoke() {
            this.f4953a.setValue(Boolean.FALSE);
            this.f4954b.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f4955a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(MutableState mutableState) {
            super(0);
            this.f4955a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m21invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m21invoke() {
            this.f4955a.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f4956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4957b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C f4958c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4959d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f4960e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4961f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f4962g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Color f4963h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f4964i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f4965j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C3654g f4966k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f4967l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f4968m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f4969n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f4970o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f4971p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f4972q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f4973r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f4974s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f4975t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f4976u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(float f8, boolean z8, C c8, boolean z9, boolean z10, int i8, Modifier modifier, Color color, Integer num, String str, C3654g c3654g, String str2, boolean z11, Function0 function0, Function0 function02, String str3, String str4, Function0 function03, int i9, int i10, int i11) {
            super(2);
            this.f4956a = f8;
            this.f4957b = z8;
            this.f4958c = c8;
            this.f4959d = z9;
            this.f4960e = z10;
            this.f4961f = i8;
            this.f4962g = modifier;
            this.f4963h = color;
            this.f4964i = num;
            this.f4965j = str;
            this.f4966k = c3654g;
            this.f4967l = str2;
            this.f4968m = z11;
            this.f4969n = function0;
            this.f4970o = function02;
            this.f4971p = str3;
            this.f4972q = str4;
            this.f4973r = function03;
            this.f4974s = i9;
            this.f4975t = i10;
            this.f4976u = i11;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            T.e(this.f4956a, this.f4957b, this.f4958c, this.f4959d, this.f4960e, this.f4961f, this.f4962g, this.f4963h, this.f4964i, this.f4965j, this.f4966k, this.f4967l, this.f4968m, this.f4969n, this.f4970o, this.f4971p, this.f4972q, this.f4973r, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4974s | 1), RecomposeScopeImplKt.updateChangedFlags(this.f4975t), this.f4976u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4977a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z8) {
            super(0);
            this.f4977a = z8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableState invoke() {
            MutableState mutableStateOf$default;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.f4977a), null, 2, null);
            return mutableStateOf$default;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class n {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4978a;

        static {
            int[] iArr = new int[C.values().length];
            try {
                iArr[C.f4775c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.f4774b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.f4773a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4978a = iArr;
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
        throw new UnsupportedOperationException("Method not decompiled: J3.T.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: J3.T.b(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void c(boolean r18, J3.C r19, androidx.compose.runtime.MutableState r20, kotlin.jvm.functions.Function0 r21, java.lang.String r22, java.lang.String r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.T.c(boolean, J3.C, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: J3.T.d(boolean, boolean, int, androidx.compose.ui.graphics.Color, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
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
    public static final void e(float r41, boolean r42, J3.C r43, boolean r44, boolean r45, int r46, androidx.compose.ui.Modifier r47, androidx.compose.ui.graphics.Color r48, java.lang.Integer r49, java.lang.String r50, q3.C3654g r51, java.lang.String r52, boolean r53, kotlin.jvm.functions.Function0 r54, kotlin.jvm.functions.Function0 r55, java.lang.String r56, java.lang.String r57, kotlin.jvm.functions.Function0 r58, androidx.compose.runtime.Composer r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.T.e(float, boolean, J3.C, boolean, boolean, int, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, java.lang.Integer, java.lang.String, q3.g, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final float j() {
        return f4901e;
    }
}
