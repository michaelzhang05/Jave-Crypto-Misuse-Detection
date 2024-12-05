package L3;

import J3.AbstractC1214w;
import J3.AbstractC1216y;
import L3.s;
import L5.I;
import android.content.Context;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import s4.C3755g;
import t4.AbstractC3794a;

/* loaded from: classes4.dex */
public abstract class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6421a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W2.a f6422b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6423c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, W2.a aVar, int i8) {
            super(2);
            this.f6421a = z8;
            this.f6422b = aVar;
            this.f6423c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            t.a(this.f6421a, this.f6422b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6423c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f6424a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar) {
            super(1);
            this.f6424a = sVar;
        }

        public final void a(w3.c cVar) {
            this.f6424a.c(new s.b.C0136b(cVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((w3.c) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f6425a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f6426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s sVar, MutableState mutableState) {
            super(0);
            this.f6425a = sVar;
            this.f6426b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m57invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m57invoke() {
            if (t.c(this.f6426b)) {
                return;
            }
            this.f6425a.c(s.b.a.f6419a);
            t.d(this.f6426b, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f6427a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6428b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s sVar, int i8) {
            super(2);
            this.f6427a = sVar;
            this.f6428b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            t.b(this.f6427a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6428b | 1));
        }
    }

    public static final void a(boolean z8, W2.a formHeaderInformation, Composer composer, int i8) {
        String g8;
        AbstractC3159y.i(formHeaderInformation, "formHeaderInformation");
        Composer startRestartGroup = composer.startRestartGroup(-1058685397);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058685397, i8, -1, "com.stripe.android.paymentsheet.verticalmode.VerticalModeFormHeaderUI (VerticalModeFormUI.kt:74)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        startRestartGroup.startReplaceableGroup(-1087910524);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3755g(context, null, null, null, null, 30, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        C3755g c3755g = (C3755g) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0) && formHeaderInformation.c() != null) {
            g8 = formHeaderInformation.c();
        } else {
            g8 = formHeaderInformation.g();
        }
        String str = g8;
        Modifier.Companion companion = Modifier.Companion;
        float f8 = 20;
        float f9 = 12;
        Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(PaddingKt.m602paddingVpY3zN4$default(companion, Dp.m5178constructorimpl(f8), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(f9), 7, null);
        Alignment.Companion companion2 = Alignment.Companion;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m604paddingqDBjuR0$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(693531892);
        if (formHeaderInformation.h()) {
            AbstractC1216y.a(formHeaderInformation.f(), str, c3755g, formHeaderInformation.e(), SizeKt.m647size3ABfNKs(PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5178constructorimpl(f9), 0.0f, 11, null), Dp.m5178constructorimpl(f8)), companion2.getCenter(), startRestartGroup, (C3755g.f37939g << 6) | 221184, 0);
        }
        startRestartGroup.endReplaceableGroup();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i9 = MaterialTheme.$stable;
        long h8 = AbstractC3087m.n(materialTheme, startRestartGroup, i9).h();
        String a8 = AbstractC3794a.a(formHeaderInformation.d(), startRestartGroup, 8);
        TextStyle h42 = materialTheme.getTypography(startRestartGroup, i9).getH4();
        if (!z8) {
            h8 = Color.m2970copywmQWz5c$default(h8, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        TextKt.m1414Text4IGK_g(a8, TestTagKt.testTag(companion, "TEST_TAG_HEADER_TITLE"), h8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5132getEllipsisgIe3tQ8(), false, 1, 0, (Function1) null, h42, startRestartGroup, 48, 3120, 55288);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(z8, formHeaderInformation, i8));
        }
    }

    public static final void b(s interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3159y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(905874727);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
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
                ComposerKt.traceEventStart(905874727, i9, -1, "com.stripe.android.paymentsheet.verticalmode.VerticalModeFormUI (VerticalModeFormUI.kt:33)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(q3.s.f37390e, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1389393466);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            State a8 = v4.f.a(interactor.getState(), startRestartGroup, 8);
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            W2.a c8 = e(a8).c();
            boolean z8 = !e(a8).f();
            startRestartGroup.startReplaceableGroup(-1525420046);
            if (c8 != null) {
                a(z8, c8, startRestartGroup, 64);
            }
            startRestartGroup.endReplaceableGroup();
            AbstractC1214w.a(z8, e(a8).d(), e(a8).b(), e(a8).a(), e(a8).e(), dimensionResource, new b(interactor), new c(interactor, mutableState), startRestartGroup, 37376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(interactor, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean c(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final s.a e(State state) {
        return (s.a) state.getValue();
    }
}
