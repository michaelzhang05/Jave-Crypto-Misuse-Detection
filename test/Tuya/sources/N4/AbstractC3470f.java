package n4;

import L5.I;
import X5.n;
import X5.o;
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
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: n4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3470f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f36148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3471g f36149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f36150c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3471g c3471g, Function0 function0, P5.d dVar) {
            super(2, dVar);
            this.f36149b = c3471g;
            this.f36150c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f36149b, this.f36150c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r4.f36148a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                L5.t.b(r5)
                goto L37
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                L5.t.b(r5)
                goto L2c
            L1e:
                L5.t.b(r5)
                n4.g r5 = r4.f36149b
                r4.f36148a = r3
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                n4.g r5 = r4.f36149b
                r4.f36148a = r2
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L37
                return r0
            L37:
                n4.g$a r5 = (n4.C3471g.a) r5
                n4.g$a r0 = n4.C3471g.a.f36165b
                if (r5 != r0) goto L42
                kotlin.jvm.functions.Function0 r5 = r4.f36150c
                r5.invoke()
            L42:
                L5.I r5 = L5.I.f6487a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: n4.AbstractC3470f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f36151a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(3);
            this.f36151a = nVar;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(ColumnScope ModalBottomSheetLayout, Composer composer, int i8) {
            AbstractC3159y.i(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1959122039, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout.<anonymous> (StripeBottomSheetLayout.kt:58)");
            }
            Modifier testTag = TestTagKt.testTag(Modifier.Companion, "BottomSheetContentTestTag");
            n nVar = this.f36151a;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
            nVar.invoke(composer, 0);
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
    /* renamed from: n4.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3471g f36152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3468d f36153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f36154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f36155d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f36156e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f36157f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f36158g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3471g c3471g, C3468d c3468d, Modifier modifier, Function0 function0, n nVar, int i8, int i9) {
            super(2);
            this.f36152a = c3471g;
            this.f36153b = c3468d;
            this.f36154c = modifier;
            this.f36155d = function0;
            this.f36156e = nVar;
            this.f36157f = i8;
            this.f36158g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3470f.a(this.f36152a, this.f36153b, this.f36154c, this.f36155d, this.f36156e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f36157f | 1), this.f36158g);
        }
    }

    public static final void a(C3471g state, C3468d layoutInfo, Modifier modifier, Function0 onDismissed, n sheetContent, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3159y.i(state, "state");
        AbstractC3159y.i(layoutInfo, "layoutInfo");
        AbstractC3159y.i(onDismissed, "onDismissed");
        AbstractC3159y.i(sheetContent, "sheetContent");
        Composer startRestartGroup = composer.startRestartGroup(217685577);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(217685577, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout (StripeBottomSheetLayout.kt:37)");
        }
        EffectsKt.LaunchedEffect(I.f6487a, new a(state, onDismissed, null), startRestartGroup, 70);
        Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.statusBarsPadding(modifier2));
        long a8 = layoutInfo.a();
        long b8 = layoutInfo.b();
        float m5178constructorimpl = Dp.m5178constructorimpl(0);
        ModalBottomSheetKt.m1277ModalBottomSheetLayoutGs3lGvM(ComposableLambdaKt.composableLambda(startRestartGroup, 1959122039, true, new b(sheetContent)), imePadding, state.b(), false, layoutInfo.c(), m5178constructorimpl, b8, 0L, a8, C3465a.f36135a.a(), startRestartGroup, (ModalBottomSheetState.$stable << 6) | 805506054, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(state, layoutInfo, modifier2, onDismissed, sheetContent, i8, i9));
        }
    }
}
