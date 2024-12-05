package J3;

import J3.V;
import M5.a0;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.p;
import j4.AbstractC3087m;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.p0;
import q3.C3654g;
import t4.AbstractC3794a;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public abstract class U {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f4979a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4980b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f4981c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f4982d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4983e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4984f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f8, boolean z8, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4979a = f8;
            this.f4980b = z8;
            this.f4981c = function0;
            this.f4982d = modifier;
            this.f4983e = i8;
            this.f4984f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.a(this.f4979a, this.f4980b, this.f4981c, this.f4982d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4983e | 1), this.f4984f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4986b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusManager f4987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, FocusManager focusManager, P5.d dVar) {
            super(2, dVar);
            this.f4986b = z8;
            this.f4987c = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f4986b, this.f4987c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f4985a == 0) {
                L5.t.b(obj);
                if (this.f4986b) {
                    androidx.compose.ui.focus.b.a(this.f4987c, false, 1, null);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f4988a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4989b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f4990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, MutableState mutableState, P5.d dVar) {
            super(2, dVar);
            this.f4989b = i8;
            this.f4990c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f4989b, this.f4990c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f4988a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                long j8 = this.f4989b;
                this.f4988a = 1;
                if (i6.X.b(j8, this) == e8) {
                    return e8;
                }
            }
            U.c(this.f4990c, true);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4991a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Integer invoke(int i8) {
            return Integer.valueOf(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f4992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e4.S f4993b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4994c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusRequester f4995d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e4.S f4996a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f4997b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ FocusRequester f4998c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e4.S s8, boolean z8, FocusRequester focusRequester) {
                super(2);
                this.f4996a = s8;
                this.f4997b = z8;
                this.f4998c = focusRequester;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return L5.I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408385964, i8, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:471)");
                }
                e4.Q i9 = this.f4996a.i();
                boolean z8 = !this.f4997b;
                e4.S s8 = this.f4996a;
                Modifier focusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), this.f4998c);
                Set f8 = a0.f();
                FocusDirection.Companion companion = FocusDirection.Companion;
                i9.f(z8, s8, focusRequester, f8, null, companion.m2660getExitdhqQ8s(), companion.m2663getPreviousdhqQ8s(), composer, (e4.S.f30536f << 3) | 27648 | (m4.G.f35073d << 9) | (e4.Q.f30490x << 21));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(State state, e4.S s8, boolean z8, FocusRequester focusRequester) {
            super(3);
            this.f4992a = state;
            this.f4993b = s8;
            this.f4994c = z8;
            this.f4995d = focusRequester;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1074270777, i8, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:458)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 20;
            float f9 = 0;
            Modifier m603paddingqDBjuR0 = PaddingKt.m603paddingqDBjuR0(companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f9));
            State state = this.f4992a;
            e4.S s8 = this.f4993b;
            boolean z8 = this.f4994c;
            FocusRequester focusRequester = this.f4995d;
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
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m603paddingqDBjuR0);
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
            X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(q3.w.f37431G, composer, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m1414Text4IGK_g(stringResource, (Modifier) null, AbstractC3087m.n(materialTheme, composer, i9).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i9).getBody1(), composer, 0, 0, 65530);
            float f10 = 8;
            p0.b(IntrinsicKt.height(PaddingKt.m603paddingqDBjuR0(companion, Dp.m5178constructorimpl(f9), Dp.m5178constructorimpl(f10), Dp.m5178constructorimpl(f9), Dp.m5178constructorimpl(f10)), IntrinsicSize.Min), null, false, 0L, null, ComposableLambdaKt.composableLambda(composer, 408385964, true, new a(s8, z8, focusRequester)), composer, 196614, 30);
            m4.C c8 = (m4.C) state.getValue();
            Integer valueOf = c8 != null ? Integer.valueOf(c8.a()) : null;
            composer.startReplaceableGroup(272129292);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
                Updater.m2503setimpl(m2496constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                X5.n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                p0.c(StringResources_androidKt.stringResource(intValue, composer, 0), composer, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
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
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f4999a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5001c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5002d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5003e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5004f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC3349K interfaceC3349K, boolean z8, int i8, int i9, int i10, int i11) {
            super(2);
            this.f4999a = interfaceC3349K;
            this.f5000b = z8;
            this.f5001c = i8;
            this.f5002d = i9;
            this.f5003e = i10;
            this.f5004f = i11;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.b(this.f4999a, this.f5000b, this.f5001c, this.f5002d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5003e | 1), this.f5004f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5005a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1) {
            super(0);
            this.f5005a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m22invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m22invoke() {
            this.f5005a.invoke(AbstractC3991f.c.f39776a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f5006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5008c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f5009d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f5010e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5011f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5012g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f8, boolean z8, boolean z9, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5006a = f8;
            this.f5007b = z8;
            this.f5008c = z9;
            this.f5009d = function1;
            this.f5010e = modifier;
            this.f5011f = i8;
            this.f5012g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.f(this.f5006a, this.f5007b, this.f5008c, this.f5009d, this.f5010e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5011f | 1), this.f5012g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5013a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1) {
            super(0);
            this.f5013a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m23invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m23invoke() {
            this.f5013a.invoke(AbstractC3991f.d.f39777a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f5014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5016c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f5017d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f5018e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5019f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5020g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f8, boolean z8, boolean z9, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5014a = f8;
            this.f5015b = z8;
            this.f5016c = z9;
            this.f5017d = function1;
            this.f5018e = modifier;
            this.f5019f = i8;
            this.f5020g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.g(this.f5014a, this.f5015b, this.f5016c, this.f5017d, this.f5018e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5019f | 1), this.f5020g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f5021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5022b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5023c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5024d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5025e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f5026f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5027g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5028h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f5029i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f5030j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5031k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5032l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.stripe.android.paymentsheet.p pVar, float f8, boolean z8, boolean z9, boolean z10, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5021a = pVar;
            this.f5022b = f8;
            this.f5023c = z8;
            this.f5024d = z9;
            this.f5025e = z10;
            this.f5026f = function0;
            this.f5027g = function1;
            this.f5028h = function12;
            this.f5029i = function13;
            this.f5030j = modifier;
            this.f5031k = i8;
            this.f5032l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.i(this.f5021a, this.f5022b, this.f5023c, this.f5024d, this.f5025e, this.f5026f, this.f5027g, this.f5028h, this.f5029i, this.f5030j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5031k | 1), this.f5032l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5034b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5035c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, String str, boolean z9) {
            super(1);
            this.f5033a = z8;
            this.f5034b = str;
            this.f5035c = z9;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return L5.I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "PaymentSheetSavedPaymentOption");
            SemanticsPropertiesKt.setSelected(semantics, this.f5033a);
            SemanticsPropertiesKt.setText(semantics, new AnnotatedString(this.f5034b, null, null, 6, null));
            if (this.f5035c) {
                return;
            }
            SemanticsPropertiesKt.disabled(semantics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5036a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f5037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Function1 function1, p.d dVar) {
            super(0);
            this.f5036a = function1;
            this.f5037b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m24invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m24invoke() {
            this.f5036a.invoke(this.f5037b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5038a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f5039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, p.d dVar) {
            super(0);
            this.f5038a = function1;
            this.f5039b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m25invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m25invoke() {
            this.f5038a.invoke(this.f5039b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f5040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f5041b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Function1 function1, p.d dVar) {
            super(0);
            this.f5040a = function1;
            this.f5041b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m26invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m26invoke() {
            this.f5040a.invoke(com.stripe.android.paymentsheet.s.c(this.f5041b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.d f5042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5043b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5044c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5045d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5046e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5047f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5048g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5049h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f5050i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f5051j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5052k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5053l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(p.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5042a = dVar;
            this.f5043b = f8;
            this.f5044c = z8;
            this.f5045d = z9;
            this.f5046e = z10;
            this.f5047f = z11;
            this.f5048g = function1;
            this.f5049h = function12;
            this.f5050i = function13;
            this.f5051j = modifier;
            this.f5052k = i8;
            this.f5053l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.h(this.f5042a, this.f5043b, this.f5044c, this.f5045d, this.f5046e, this.f5047f, this.f5048g, this.f5049h, this.f5050i, this.f5051j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5052k | 1), this.f5053l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.d f5054a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5056c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5057d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5058e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5059f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5060g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5061h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f5062i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f5063j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5064k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5065l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(p.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5054a = dVar;
            this.f5055b = f8;
            this.f5056c = z8;
            this.f5057d = z9;
            this.f5058e = z10;
            this.f5059f = z11;
            this.f5060g = function1;
            this.f5061h = function12;
            this.f5062i = function13;
            this.f5063j = modifier;
            this.f5064k = i8;
            this.f5065l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.h(this.f5054a, this.f5055b, this.f5056c, this.f5057d, this.f5058e, this.f5059f, this.f5060g, this.f5061h, this.f5062i, this.f5063j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5064k | 1), this.f5065l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5066a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(V v8) {
            super(0);
            this.f5066a = v8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m27invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27invoke() {
            this.f5066a.b(V.b.a.f5126a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5067a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(V v8) {
            super(1);
            this.f5067a = v8;
        }

        public final void a(AbstractC3991f abstractC3991f) {
            this.f5067a.b(new V.b.d(abstractC3991f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC3991f) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5068a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(V v8) {
            super(1);
            this.f5068a = v8;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
            this.f5068a.b(new V.b.c(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5069a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(V v8) {
            super(1);
            this.f5069a = v8;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
            this.f5069a.b(new V.b.C0095b(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f5070a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4021c.j.b f5071b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f5072c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5073d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(V v8, InterfaceC4021c.j.b bVar, Modifier modifier, int i8) {
            super(2);
            this.f5070a = v8;
            this.f5071b = bVar;
            this.f5072c = modifier;
            this.f5073d = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.j(this.f5070a, this.f5071b, this.f5072c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5073d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5074a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LazyListState f5075b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f5076c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5077d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f5078e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f5079f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5080g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5081h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f5082i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f5083a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f5084b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f5085c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.p f5086d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f5087e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0 f5088f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f5089g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f5090h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1 f5091i;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: J3.U$w$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0094a extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final C0094a f5092a = new C0094a();

                C0094a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.stripe.android.paymentsheet.p it) {
                    AbstractC3159y.i(it, "it");
                    return com.stripe.android.paymentsheet.q.a(it);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final b f5093a = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return L5.I.f6487a;
                }

                public final void invoke(SemanticsPropertyReceiver semantics) {
                    AbstractC3159y.i(semantics, "$this$semantics");
                    SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                }
            }

            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final c f5094a = new c();

                public c() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Object obj) {
                    return null;
                }
            }

            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f5095a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f5096b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Function1 function1, List list) {
                    super(1);
                    this.f5095a = function1;
                    this.f5096b = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    return this.f5095a.invoke(this.f5096b.get(i8));
                }
            }

            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3160z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f5097a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f5098b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(Function1 function1, List list) {
                    super(1);
                    this.f5097a = function1;
                    this.f5098b = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    return this.f5097a.invoke(this.f5098b.get(i8));
                }
            }

            /* loaded from: classes4.dex */
            public static final class f extends AbstractC3160z implements X5.p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f5099a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f5100b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f5101c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.p f5102d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f5103e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0 f5104f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function1 f5105g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function1 f5106h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ Function1 f5107i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(List list, boolean z8, boolean z9, com.stripe.android.paymentsheet.p pVar, float f8, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
                    super(4);
                    this.f5099a = list;
                    this.f5100b = z8;
                    this.f5101c = z9;
                    this.f5102d = pVar;
                    this.f5103e = f8;
                    this.f5104f = function0;
                    this.f5105g = function1;
                    this.f5106h = function12;
                    this.f5107i = function13;
                }

                @Override // X5.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return L5.I.f6487a;
                }

                public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
                    int i10;
                    AbstractC3159y.i(items, "$this$items");
                    if ((i9 & 14) == 0) {
                        i10 = i9 | (composer.changed(items) ? 4 : 2);
                    } else {
                        i10 = i9;
                    }
                    if ((i9 & 112) == 0) {
                        i10 |= composer.changed(i8) ? 32 : 16;
                    }
                    if ((i10 & 731) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                    }
                    com.stripe.android.paymentsheet.p pVar = (com.stripe.android.paymentsheet.p) this.f5099a.get(i8);
                    composer.startReplaceableGroup(1592562601);
                    boolean z8 = !this.f5100b && (!this.f5101c || pVar.b());
                    U.i(pVar, this.f5103e, z8, this.f5101c, AbstractC3159y.d(pVar, this.f5102d) && !this.f5101c, this.f5104f, this.f5105g, this.f5106h, this.f5107i, androidx.compose.foundation.lazy.a.a(items, TestTagKt.testTag(SemanticsModifierKt.semantics$default(Modifier.Companion, false, b.f5093a, 1, null), pVar.a().name()), null, 1, null), composer, 0, 0);
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, boolean z8, boolean z9, com.stripe.android.paymentsheet.p pVar, float f8, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
                super(1);
                this.f5083a = list;
                this.f5084b = z8;
                this.f5085c = z9;
                this.f5086d = pVar;
                this.f5087e = f8;
                this.f5088f = function0;
                this.f5089g = function1;
                this.f5090h = function12;
                this.f5091i = function13;
            }

            public final void a(LazyListScope LazyRow) {
                d dVar;
                AbstractC3159y.i(LazyRow, "$this$LazyRow");
                List list = this.f5083a;
                C0094a c0094a = C0094a.f5092a;
                boolean z8 = this.f5084b;
                boolean z9 = this.f5085c;
                com.stripe.android.paymentsheet.p pVar = this.f5086d;
                float f8 = this.f5087e;
                Function0 function0 = this.f5088f;
                Function1 function1 = this.f5089g;
                Function1 function12 = this.f5090h;
                Function1 function13 = this.f5091i;
                c cVar = c.f5094a;
                int size = list.size();
                if (c0094a != null) {
                    dVar = new d(c0094a, list);
                } else {
                    dVar = null;
                }
                LazyRow.items(size, dVar, new e(cVar, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(list, z8, z9, pVar, f8, function0, function1, function12, function13)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((LazyListScope) obj);
                return L5.I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z8, LazyListState lazyListState, List list, boolean z9, com.stripe.android.paymentsheet.p pVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
            super(3);
            this.f5074a = z8;
            this.f5075b = lazyListState;
            this.f5076c = list;
            this.f5077d = z9;
            this.f5078e = pVar;
            this.f5079f = function0;
            this.f5080g = function1;
            this.f5081h = function12;
            this.f5082i = function13;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
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
                ComposerKt.traceEventStart(912695486, i9, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:138)");
            }
            LazyDslKt.LazyRow(null, this.f5075b, PaddingKt.m595PaddingValuesYgX7TsA$default(Dp.m5178constructorimpl(17), 0.0f, 2, null), false, null, null, null, !this.f5074a, new a(this.f5076c, this.f5074a, this.f5077d, this.f5078e, U.s(BoxWithConstraints.mo540getMaxWidthD9Ej5fM(), composer, 0), this.f5079f, this.f5080g, this.f5081h, this.f5082i), composer, 384, 121);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f5108a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f5109b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5110c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5111d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f5112e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f5113f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5114g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5115h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f5116i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LazyListState f5117j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5118k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5119l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(List list, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, LazyListState lazyListState, int i8, int i9) {
            super(2);
            this.f5108a = list;
            this.f5109b = pVar;
            this.f5110c = z8;
            this.f5111d = z9;
            this.f5112e = function0;
            this.f5113f = function1;
            this.f5114g = function12;
            this.f5115h = function13;
            this.f5116i = modifier;
            this.f5117j = lazyListState;
            this.f5118k = i8;
            this.f5119l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            U.k(this.f5108a, this.f5109b, this.f5110c, this.f5111d, this.f5112e, this.f5113f, this.f5114g, this.f5115h, this.f5116i, this.f5117j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5118k | 1), this.f5119l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(float r29, boolean r30, kotlin.jvm.functions.Function0 r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.U.a(float, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(InterfaceC3349K cvcControllerFlow, boolean z8, int i8, int i9, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z9;
        AbstractC3159y.i(cvcControllerFlow, "cvcControllerFlow");
        Composer startRestartGroup = composer.startRestartGroup(685072799);
        if ((i11 & 4) != 0) {
            i12 = 500;
        } else {
            i12 = i8;
        }
        if ((i11 & 8) != 0) {
            i13 = 400;
        } else {
            i13 = i9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(685072799, i10, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField (SavedPaymentMethodTabLayoutUI.kt:431)");
        }
        State a8 = v4.f.a(cvcControllerFlow, startRestartGroup, 8);
        State a9 = v4.f.a(d(a8).getError(), startRestartGroup, 8);
        e4.S s8 = new e4.S(new m4.G(), d(a8));
        startRestartGroup.startReplaceableGroup(-1879197778);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1879196205);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Boolean.valueOf(z8), new b(z8, (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), null), startRestartGroup, ((i10 >> 3) & 14) | 64);
        L5.I i14 = L5.I.f6487a;
        startRestartGroup.startReplaceableGroup(-1879186954);
        if ((((i10 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(i13)) || (i10 & 3072) == 2048) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new c(i13, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(i14, (X5.n) rememberedValue3, startRestartGroup, 70);
        AnimatedVisibilityKt.AnimatedVisibility(e(mutableState), (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(i12, i13, null, 4, null), null, false, d.f4991a, 6, null), (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1074270777, true, new e(a9, s8, z8, focusRequester)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(cvcControllerFlow, z8, i12, i13, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final e4.Q d(State state) {
        return (e4.Q) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(float r30, boolean r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.U.f(float, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(float r30, boolean r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.U.g(float, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(p.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        String a8;
        boolean z12;
        boolean z13;
        C c8;
        Composer startRestartGroup = composer.startRestartGroup(-411046220);
        if ((i9 & 512) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-411046220, i8, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab (SavedPaymentMethodTabLayoutUI.kt:370)");
        }
        Integer e8 = B.e(dVar.e());
        InterfaceC3983b d8 = B.d(dVar.e());
        startRestartGroup.startReplaceableGroup(358888102);
        if (d8 == null) {
            a8 = null;
        } else {
            a8 = AbstractC3794a.a(d8, startRestartGroup, 8);
        }
        startRestartGroup.endReplaceableGroup();
        if (a8 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new q(dVar, f8, z8, z9, z10, z11, function1, function12, function13, modifier2, i8, i9));
                return;
            }
            return;
        }
        Modifier.Companion companion = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(358890484);
        if ((((458752 & i8) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && startRestartGroup.changed(z11)) || (i8 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean changed = z12 | startRestartGroup.changed(a8);
        if ((((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(z8)) || (i8 & 384) == 256) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z14 = changed | z13;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new l(z11, a8, z8);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (z8 && z9 && z10) {
            c8 = C.f4775c;
        } else if (z8 && z9) {
            c8 = C.f4774b;
        } else {
            c8 = C.f4773a;
        }
        C c9 = c8;
        int g8 = B.g(dVar.e(), false, 1, null);
        C3654g d9 = dVar.d();
        String a9 = AbstractC1193a.a(AbstractC3794a.a(dVar.d().a(), startRestartGroup, 8));
        String a10 = AbstractC1193a.a(AbstractC3794a.a(dVar.d().c(), startRestartGroup, 8));
        Modifier modifier3 = modifier2;
        T.e(f8, z11, c9, z8, !z9, g8, modifier3, null, e8, a8, d9, a9, false, new m(function13, dVar), new n(function12, dVar), AbstractC1193a.a(AbstractC3794a.a(dVar.d().e(), startRestartGroup, 8)), a10, new o(function1, dVar), startRestartGroup, ((i8 >> 3) & 14) | ((i8 >> 12) & 112) | ((i8 << 3) & 7168) | ((i8 >> 9) & 3670016), 8, 4224);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new p(dVar, f8, z8, z9, z10, z11, function1, function12, function13, modifier2, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(com.stripe.android.paymentsheet.p r26, float r27, boolean r28, boolean r29, boolean r30, kotlin.jvm.functions.Function0 r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function1 r34, androidx.compose.ui.Modifier r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.U.i(com.stripe.android.paymentsheet.p, float, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void j(V interactor, InterfaceC4021c.j.b cvcRecollectionState, Modifier modifier, Composer composer, int i8) {
        int i9;
        Composer composer2;
        p.d dVar;
        com.stripe.android.model.o e8;
        int i10;
        int i11;
        int i12;
        AbstractC3159y.i(interactor, "interactor");
        AbstractC3159y.i(cvcRecollectionState, "cvcRecollectionState");
        AbstractC3159y.i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-1088084493);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(cvcRecollectionState)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088084493, i9, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI (SavedPaymentMethodTabLayoutUI.kt:78)");
            }
            State a8 = v4.f.a(interactor.getState(), startRestartGroup, 8);
            composer2 = startRestartGroup;
            k(l(a8).d(), l(a8).e(), l(a8).f(), l(a8).g(), new r(interactor), new s(interactor), new t(interactor), new u(interactor), TestTagKt.testTag(modifier, "PaymentSheetSavedPaymentOptionTabLayout"), null, startRestartGroup, 8, 512);
            if (cvcRecollectionState instanceof InterfaceC4021c.j.b.C0928b) {
                com.stripe.android.paymentsheet.p e9 = l(a8).e();
                o.p pVar = null;
                if (e9 instanceof p.d) {
                    dVar = (p.d) e9;
                } else {
                    dVar = null;
                }
                if (dVar != null && (e8 = dVar.e()) != null) {
                    pVar = e8.f24412e;
                }
                if (pVar == o.p.f24532i) {
                    b(((InterfaceC4021c.j.b.C0928b) cvcRecollectionState).a(), l(a8).g(), 0, 0, composer2, 8, 12);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v(interactor, cvcRecollectionState, modifier, i8));
        }
    }

    public static final void k(List paymentOptionsItems, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, Function0 onAddCardPressed, Function1 onItemSelected, Function1 onModifyItem, Function1 onItemRemoved, Modifier modifier, LazyListState lazyListState, Composer composer, int i8, int i9) {
        Modifier modifier2;
        LazyListState lazyListState2;
        int i10;
        AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
        AbstractC3159y.i(onAddCardPressed, "onAddCardPressed");
        AbstractC3159y.i(onItemSelected, "onItemSelected");
        AbstractC3159y.i(onModifyItem, "onModifyItem");
        AbstractC3159y.i(onItemRemoved, "onItemRemoved");
        Composer startRestartGroup = composer.startRestartGroup(1549652);
        if ((i9 & 256) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 512) != 0) {
            i10 = i8 & (-1879048193);
            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
        } else {
            lazyListState2 = lazyListState;
            i10 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1549652, i10, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI (SavedPaymentMethodTabLayoutUI.kt:136)");
        }
        Modifier modifier3 = modifier2;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 912695486, true, new w(z9, lazyListState2, paymentOptionsItems, z8, pVar, onAddCardPressed, onItemSelected, onModifyItem, onItemRemoved)), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x(paymentOptionsItems, pVar, z8, z9, onAddCardPressed, onItemSelected, onModifyItem, onItemRemoved, modifier3, lazyListState2, i8, i9));
        }
    }

    private static final V.a l(State state) {
        return (V.a) state.getValue();
    }

    public static final float s(float f8, Composer composer, int i8) {
        boolean z8;
        composer.startReplaceableGroup(-1122512013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1122512013, i8, -1, "com.stripe.android.paymentsheet.ui.rememberItemWidth (SavedPaymentMethodTabLayoutUI.kt:224)");
        }
        composer.startReplaceableGroup(697167163);
        if ((((i8 & 14) ^ 6) > 4 && composer.changed(f8)) || (i8 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Dp.m5176boximpl(Dp.m5178constructorimpl(Dp.m5178constructorimpl(f8 - Dp.m5178constructorimpl(Dp.m5178constructorimpl(17) * 2)) / (((int) (Dp.m5178constructorimpl(r0 * r3) / Dp.m5178constructorimpl(Dp.m5178constructorimpl(100) + Dp.m5178constructorimpl(Dp.m5178constructorimpl(6) * r0)))) / 2.0f)));
            composer.updateRememberedValue(rememberedValue);
        }
        float m5192unboximpl = ((Dp) rememberedValue).m5192unboximpl();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m5192unboximpl;
    }
}
