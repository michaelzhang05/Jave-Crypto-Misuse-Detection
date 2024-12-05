package q4;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;

/* renamed from: q4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3849f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f38276a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3850g f38277b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f38278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3850g c3850g, Function0 function0, S5.d dVar) {
            super(2, dVar);
            this.f38277b = c3850g;
            this.f38278c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f38277b, this.f38278c, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r4.f38276a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                O5.t.b(r5)
                goto L37
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                O5.t.b(r5)
                goto L2c
            L1e:
                O5.t.b(r5)
                q4.g r5 = r4.f38277b
                r4.f38276a = r3
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                q4.g r5 = r4.f38277b
                r4.f38276a = r2
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L37
                return r0
            L37:
                q4.g$a r5 = (q4.C3850g.a) r5
                q4.g$a r0 = q4.C3850g.a.f38293b
                if (r5 != r0) goto L42
                kotlin.jvm.functions.Function0 r5 = r4.f38278c
                r5.invoke()
            L42:
                O5.I r5 = O5.I.f8278a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: q4.AbstractC3849f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38279a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1668n interfaceC1668n) {
            super(3);
            this.f38279a = interfaceC1668n;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(ColumnScope ModalBottomSheetLayout, Composer composer, int i8) {
            AbstractC3255y.i(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1959122039, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout.<anonymous> (StripeBottomSheetLayout.kt:58)");
            }
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "BottomSheetContentTestTag");
            InterfaceC1668n interfaceC1668n = this.f38279a;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
            interfaceC1668n.invoke(composer, 0);
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
    /* renamed from: q4.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3850g f38280a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3847d f38281b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f38282c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f38283d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f38284e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f38285f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38286g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3850g c3850g, C3847d c3847d, Modifier modifier, Function0 function0, InterfaceC1668n interfaceC1668n, int i8, int i9) {
            super(2);
            this.f38280a = c3850g;
            this.f38281b = c3847d;
            this.f38282c = modifier;
            this.f38283d = function0;
            this.f38284e = interfaceC1668n;
            this.f38285f = i8;
            this.f38286g = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3849f.a(this.f38280a, this.f38281b, this.f38282c, this.f38283d, this.f38284e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38285f | 1), this.f38286g);
        }
    }

    public static final void a(C3850g state, C3847d layoutInfo, Modifier modifier, Function0 onDismissed, InterfaceC1668n sheetContent, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3255y.i(state, "state");
        AbstractC3255y.i(layoutInfo, "layoutInfo");
        AbstractC3255y.i(onDismissed, "onDismissed");
        AbstractC3255y.i(sheetContent, "sheetContent");
        Composer startRestartGroup = composer.startRestartGroup(217685577);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(217685577, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout (StripeBottomSheetLayout.kt:37)");
        }
        EffectsKt.LaunchedEffect(I.f8278a, new a(state, onDismissed, null), startRestartGroup, 70);
        Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.statusBarsPadding(modifier2));
        long a8 = layoutInfo.a();
        long b8 = layoutInfo.b();
        float m5183constructorimpl = Dp.m5183constructorimpl(0);
        ModalBottomSheetKt.m1282ModalBottomSheetLayoutGs3lGvM(ComposableLambdaKt.composableLambda(startRestartGroup, 1959122039, true, new b(sheetContent)), imePadding, state.b(), false, layoutInfo.c(), m5183constructorimpl, b8, 0L, a8, C3844a.f38263a.a(), startRestartGroup, (ModalBottomSheetState.$stable << 6) | 805506054, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(state, layoutInfo, modifier2, onDismissed, sheetContent, i8, i9));
        }
    }
}
