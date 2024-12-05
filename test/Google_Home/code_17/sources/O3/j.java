package O3;

import M3.W;
import O3.i;
import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.C4033g;

/* loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4033g f8058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, C4033g c4033g) {
            super(0);
            this.f8057a = iVar;
            this.f8058b = c4033g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m55invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m55invoke() {
            this.f8057a.a(new i.b.c(this.f8058b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8059a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4033g f8060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f8061c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f8062d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f8063a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.f8063a = iVar;
            }

            public final void a(C4033g paymentMethod) {
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f8063a.a(new i.b.a(paymentMethod));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4033g) obj);
                return I.f8278a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.j$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0162b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f8064a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0162b(i iVar) {
                super(1);
                this.f8064a = iVar;
            }

            public final void a(C4033g paymentMethod) {
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f8064a.a(new i.b.C0161b(paymentMethod));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4033g) obj);
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C4033g c4033g, State state, i iVar) {
            super(3);
            this.f8059a = z8;
            this.f8060b = c4033g;
            this.f8061c = state;
            this.f8062d = iVar;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3255y.i(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(77758085, i8, -1, "com.stripe.android.paymentsheet.verticalmode.ManageScreenUI.<anonymous>.<anonymous>.<anonymous> (ManageScreenUI.kt:40)");
            }
            j.c(this.f8059a, j.b(this.f8061c).e(), this.f8060b.f(), j.b(this.f8061c).b(), this.f8060b, new a(this.f8062d), new C0162b(this.f8062d), composer, 32768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8065a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i iVar, int i8) {
            super(2);
            this.f8065a = iVar;
            this.f8066b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            j.a(this.f8065a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8066b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8067a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8068b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8069c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8070d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4033g f8071e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f8072f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f8073g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f8074h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, boolean z10, boolean z11, C4033g c4033g, Function1 function1, Function1 function12, int i8) {
            super(2);
            this.f8067a = z8;
            this.f8068b = z9;
            this.f8069c = z10;
            this.f8070d = z11;
            this.f8071e = c4033g;
            this.f8072f = function1;
            this.f8073g = function12;
            this.f8074h = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            j.c(this.f8067a, this.f8068b, this.f8069c, this.f8070d, this.f8071e, this.f8072f, this.f8073g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8074h | 1));
        }
    }

    public static final void a(i interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3255y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(-655977581);
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
                ComposerKt.traceEventStart(-655977581, i9, -1, "com.stripe.android.paymentsheet.verticalmode.ManageScreenUI (ManageScreenUI.kt:18)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(t3.s.f39712e, startRestartGroup, 0);
            State a8 = y4.f.a(interactor.getState(), startRestartGroup, 8);
            Modifier testTag = TestTagKt.testTag(PaddingKt.m607paddingVpY3zN4$default(Modifier.Companion, dimensionResource, 0.0f, 2, null), "manage_screen_saved_pms_list");
            Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(Dp.m5183constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m519spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-648129373);
            for (C4033g c4033g : b(a8).d()) {
                boolean d8 = AbstractC3255y.d(c4033g, b(a8).c());
                p.a(c4033g, true, !b(a8).e(), d8, null, new a(interactor, c4033g), ComposableLambdaKt.composableLambda(startRestartGroup, 77758085, true, new b(d8, c4033g, a8, interactor)), startRestartGroup, 1572920, 16);
            }
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new c(interactor, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i.a b(State state) {
        return (i.a) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z8, boolean z9, boolean z10, boolean z11, C4033g c4033g, Function1 function1, Function1 function12, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-176682203);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176682203, i8, -1, "com.stripe.android.paymentsheet.verticalmode.TrailingContent (ManageScreenUI.kt:75)");
        }
        if (z9 && z10) {
            startRestartGroup.startReplaceableGroup(-959522877);
            Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(Dp.m5183constructorimpl(12));
            startRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m519spacedBy0680j_4, Alignment.Companion.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            h.b(c4033g, function12, startRestartGroup, ((i8 >> 15) & 112) | 8);
            startRestartGroup.startReplaceableGroup(114380678);
            if (z11) {
                h.a(c4033g, function1, startRestartGroup, ((i8 >> 12) & 112) | 8);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else if (z9 && z11) {
            startRestartGroup.startReplaceableGroup(-959251782);
            h.a(c4033g, function1, startRestartGroup, ((i8 >> 12) & 112) | 8);
            startRestartGroup.endReplaceableGroup();
        } else if (z8) {
            startRestartGroup.startReplaceableGroup(-959169415);
            W.a(null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-959139624);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(z8, z9, z10, z11, c4033g, function1, function12, i8));
        }
    }
}
