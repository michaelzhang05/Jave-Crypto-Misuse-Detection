package M3;

import B3.f;
import C3.c;
import M3.V;
import P5.a0;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
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
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;
import o6.InterfaceC3698L;
import p4.p0;
import t3.C4033g;
import w4.AbstractC4148a;

/* loaded from: classes4.dex */
public abstract class U {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f6685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6687c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f6688d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6689e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6690f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f8, boolean z8, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6685a = f8;
            this.f6686b = z8;
            this.f6687c = function0;
            this.f6688d = modifier;
            this.f6689e = i8;
            this.f6690f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.a(this.f6685a, this.f6686b, this.f6687c, this.f6688d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6689e | 1), this.f6690f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6691a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6692b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusManager f6693c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, FocusManager focusManager, S5.d dVar) {
            super(2, dVar);
            this.f6692b = z8;
            this.f6693c = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f6692b, this.f6693c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f6691a == 0) {
                O5.t.b(obj);
                if (this.f6692b) {
                    androidx.compose.ui.focus.b.a(this.f6693c, false, 1, null);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6695b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f6696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, MutableState mutableState, S5.d dVar) {
            super(2, dVar);
            this.f6695b = i8;
            this.f6696c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f6695b, this.f6696c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6694a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                long j8 = this.f6695b;
                this.f6694a = 1;
                if (l6.X.b(j8, this) == e8) {
                    return e8;
                }
            }
            U.c(this.f6696c, true);
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6697a = new d();

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
    public static final class e extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f6698a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h4.S f6699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6700c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusRequester f6701d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h4.S f6702a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f6703b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ FocusRequester f6704c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h4.S s8, boolean z8, FocusRequester focusRequester) {
                super(2);
                this.f6702a = s8;
                this.f6703b = z8;
                this.f6704c = focusRequester;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return O5.I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408385964, i8, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:471)");
                }
                h4.Q i9 = this.f6702a.i();
                boolean z8 = !this.f6703b;
                h4.S s8 = this.f6702a;
                Modifier focusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), this.f6704c);
                Set f8 = a0.f();
                FocusDirection.Companion companion = FocusDirection.Companion;
                i9.c(z8, s8, focusRequester, f8, null, companion.m2665getExitdhqQ8s(), companion.m2668getPreviousdhqQ8s(), composer, (h4.S.f32457f << 3) | 27648 | (p4.G.f37099d << 9) | (h4.Q.f32411x << 21));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(State state, h4.S s8, boolean z8, FocusRequester focusRequester) {
            super(3);
            this.f6698a = state;
            this.f6699b = s8;
            this.f6700c = z8;
            this.f6701d = focusRequester;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1074270777, i8, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:458)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 20;
            float f9 = 0;
            Modifier m608paddingqDBjuR0 = PaddingKt.m608paddingqDBjuR0(companion, Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f9));
            State state = this.f6698a;
            h4.S s8 = this.f6699b;
            boolean z8 = this.f6700c;
            FocusRequester focusRequester = this.f6701d;
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
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m608paddingqDBjuR0);
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
            String stringResource = StringResources_androidKt.stringResource(t3.w.f39753G, composer, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m1419Text4IGK_g(stringResource, (Modifier) null, AbstractC3441m.n(materialTheme, composer, i9).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i9).getBody1(), composer, 0, 0, 65530);
            float f10 = 8;
            p0.b(IntrinsicKt.height(PaddingKt.m608paddingqDBjuR0(companion, Dp.m5183constructorimpl(f9), Dp.m5183constructorimpl(f10), Dp.m5183constructorimpl(f9), Dp.m5183constructorimpl(f10)), IntrinsicSize.Min), null, false, 0L, null, ComposableLambdaKt.composableLambda(composer, 408385964, true, new a(s8, z8, focusRequester)), composer, 196614, 30);
            p4.C c8 = (p4.C) state.getValue();
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
                InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
                Updater.m2508setimpl(m2501constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
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
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f6705a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6707c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6708d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6709e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6710f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC3698L interfaceC3698L, boolean z8, int i8, int i9, int i10, int i11) {
            super(2);
            this.f6705a = interfaceC3698L;
            this.f6706b = z8;
            this.f6707c = i8;
            this.f6708d = i9;
            this.f6709e = i10;
            this.f6710f = i11;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.b(this.f6705a, this.f6706b, this.f6707c, this.f6708d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6709e | 1), this.f6710f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6711a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1) {
            super(0);
            this.f6711a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m27invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27invoke() {
            this.f6711a.invoke(f.c.f820a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f6712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6714c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f6715d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f6716e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6717f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6718g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f8, boolean z8, boolean z9, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6712a = f8;
            this.f6713b = z8;
            this.f6714c = z9;
            this.f6715d = function1;
            this.f6716e = modifier;
            this.f6717f = i8;
            this.f6718g = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.f(this.f6712a, this.f6713b, this.f6714c, this.f6715d, this.f6716e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6717f | 1), this.f6718g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1) {
            super(0);
            this.f6719a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m28invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m28invoke() {
            this.f6719a.invoke(f.d.f821a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f6720a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6721b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6722c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f6723d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f6724e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6725f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6726g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f8, boolean z8, boolean z9, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6720a = f8;
            this.f6721b = z8;
            this.f6722c = z9;
            this.f6723d = function1;
            this.f6724e = modifier;
            this.f6725f = i8;
            this.f6726g = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.g(this.f6720a, this.f6721b, this.f6722c, this.f6723d, this.f6724e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6725f | 1), this.f6726g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f6727a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f6728b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6729c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6730d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6731e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f6732f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f6733g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f6734h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f6735i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f6736j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f6737k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6738l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(com.stripe.android.paymentsheet.p pVar, float f8, boolean z8, boolean z9, boolean z10, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6727a = pVar;
            this.f6728b = f8;
            this.f6729c = z8;
            this.f6730d = z9;
            this.f6731e = z10;
            this.f6732f = function0;
            this.f6733g = function1;
            this.f6734h = function12;
            this.f6735i = function13;
            this.f6736j = modifier;
            this.f6737k = i8;
            this.f6738l = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.i(this.f6727a, this.f6728b, this.f6729c, this.f6730d, this.f6731e, this.f6732f, this.f6733g, this.f6734h, this.f6735i, this.f6736j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6737k | 1), this.f6738l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6739a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6740b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, String str, boolean z9) {
            super(1);
            this.f6739a = z8;
            this.f6740b = str;
            this.f6741c = z9;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return O5.I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "PaymentSheetSavedPaymentOption");
            SemanticsPropertiesKt.setSelected(semantics, this.f6739a);
            SemanticsPropertiesKt.setText(semantics, new AnnotatedString(this.f6740b, null, null, 6, null));
            if (this.f6741c) {
                return;
            }
            SemanticsPropertiesKt.disabled(semantics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6742a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f6743b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Function1 function1, p.d dVar) {
            super(0);
            this.f6742a = function1;
            this.f6743b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m29invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m29invoke() {
            this.f6742a.invoke(this.f6743b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6744a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f6745b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, p.d dVar) {
            super(0);
            this.f6744a = function1;
            this.f6745b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m30invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m30invoke() {
            this.f6744a.invoke(this.f6745b.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6746a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p.d f6747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Function1 function1, p.d dVar) {
            super(0);
            this.f6746a = function1;
            this.f6747b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m31invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m31invoke() {
            this.f6746a.invoke(com.stripe.android.paymentsheet.s.c(this.f6747b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.d f6748a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f6749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6751d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6752e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6753f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f6754g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f6755h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f6756i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f6757j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f6758k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6759l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(p.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6748a = dVar;
            this.f6749b = f8;
            this.f6750c = z8;
            this.f6751d = z9;
            this.f6752e = z10;
            this.f6753f = z11;
            this.f6754g = function1;
            this.f6755h = function12;
            this.f6756i = function13;
            this.f6757j = modifier;
            this.f6758k = i8;
            this.f6759l = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.h(this.f6748a, this.f6749b, this.f6750c, this.f6751d, this.f6752e, this.f6753f, this.f6754g, this.f6755h, this.f6756i, this.f6757j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6758k | 1), this.f6759l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.d f6760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f6761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6762c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6763d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f6764e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f6765f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f6766g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f6767h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f6768i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f6769j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f6770k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6771l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(p.d dVar, float f8, boolean z8, boolean z9, boolean z10, boolean z11, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6760a = dVar;
            this.f6761b = f8;
            this.f6762c = z8;
            this.f6763d = z9;
            this.f6764e = z10;
            this.f6765f = z11;
            this.f6766g = function1;
            this.f6767h = function12;
            this.f6768i = function13;
            this.f6769j = modifier;
            this.f6770k = i8;
            this.f6771l = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.h(this.f6760a, this.f6761b, this.f6762c, this.f6763d, this.f6764e, this.f6765f, this.f6766g, this.f6767h, this.f6768i, this.f6769j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6770k | 1), this.f6771l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f6772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(V v8) {
            super(0);
            this.f6772a = v8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m32invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m32invoke() {
            this.f6772a.a(V.b.a.f6832a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f6773a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(V v8) {
            super(1);
            this.f6773a = v8;
        }

        public final void a(B3.f fVar) {
            this.f6773a.a(new V.b.d(fVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B3.f) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f6774a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(V v8) {
            super(1);
            this.f6774a = v8;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3255y.i(it, "it");
            this.f6774a.a(new V.b.c(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f6775a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(V v8) {
            super(1);
            this.f6775a = v8;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3255y.i(it, "it");
            this.f6775a.a(new V.b.C0120b(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f6776a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.j.b f6777b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f6778c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(V v8, c.j.b bVar, Modifier modifier, int i8) {
            super(2);
            this.f6776a = v8;
            this.f6777b = bVar;
            this.f6778c = modifier;
            this.f6779d = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.j(this.f6776a, this.f6777b, this.f6778c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6779d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LazyListState f6781b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f6782c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6783d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f6784e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f6785f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f6786g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f6787h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f6788i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f6789a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f6790b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f6791c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.p f6792d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f6793e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0 f6794f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f6795g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1 f6796h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1 f6797i;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: M3.U$w$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0119a extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final C0119a f6798a = new C0119a();

                C0119a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.stripe.android.paymentsheet.p it) {
                    AbstractC3255y.i(it, "it");
                    return com.stripe.android.paymentsheet.q.a(it);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final b f6799a = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return O5.I.f8278a;
                }

                public final void invoke(SemanticsPropertyReceiver semantics) {
                    AbstractC3255y.i(semantics, "$this$semantics");
                    SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                }
            }

            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                public static final c f6800a = new c();

                public c() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Object obj) {
                    return null;
                }
            }

            /* loaded from: classes4.dex */
            public static final class d extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f6801a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f6802b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Function1 function1, List list) {
                    super(1);
                    this.f6801a = function1;
                    this.f6802b = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    return this.f6801a.invoke(this.f6802b.get(i8));
                }
            }

            /* loaded from: classes4.dex */
            public static final class e extends AbstractC3256z implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function1 f6803a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ List f6804b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(Function1 function1, List list) {
                    super(1);
                    this.f6803a = function1;
                    this.f6804b = list;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i8) {
                    return this.f6803a.invoke(this.f6804b.get(i8));
                }
            }

            /* loaded from: classes4.dex */
            public static final class f extends AbstractC3256z implements InterfaceC1670p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f6805a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f6806b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f6807c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.p f6808d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f6809e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0 f6810f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function1 f6811g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ Function1 f6812h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ Function1 f6813i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(List list, boolean z8, boolean z9, com.stripe.android.paymentsheet.p pVar, float f8, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
                    super(4);
                    this.f6805a = list;
                    this.f6806b = z8;
                    this.f6807c = z9;
                    this.f6808d = pVar;
                    this.f6809e = f8;
                    this.f6810f = function0;
                    this.f6811g = function1;
                    this.f6812h = function12;
                    this.f6813i = function13;
                }

                @Override // a6.InterfaceC1670p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return O5.I.f8278a;
                }

                public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
                    int i10;
                    AbstractC3255y.i(items, "$this$items");
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
                    com.stripe.android.paymentsheet.p pVar = (com.stripe.android.paymentsheet.p) this.f6805a.get(i8);
                    composer.startReplaceableGroup(1592562601);
                    boolean z8 = !this.f6806b && (!this.f6807c || pVar.b());
                    U.i(pVar, this.f6809e, z8, this.f6807c, AbstractC3255y.d(pVar, this.f6808d) && !this.f6807c, this.f6810f, this.f6811g, this.f6812h, this.f6813i, androidx.compose.foundation.lazy.a.a(items, TestTagKt.testTag(SemanticsModifierKt.semantics$default(Modifier.Companion, false, b.f6799a, 1, null), pVar.a().name()), null, 1, null), composer, 0, 0);
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, boolean z8, boolean z9, com.stripe.android.paymentsheet.p pVar, float f8, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
                super(1);
                this.f6789a = list;
                this.f6790b = z8;
                this.f6791c = z9;
                this.f6792d = pVar;
                this.f6793e = f8;
                this.f6794f = function0;
                this.f6795g = function1;
                this.f6796h = function12;
                this.f6797i = function13;
            }

            public final void a(LazyListScope LazyRow) {
                d dVar;
                AbstractC3255y.i(LazyRow, "$this$LazyRow");
                List list = this.f6789a;
                C0119a c0119a = C0119a.f6798a;
                boolean z8 = this.f6790b;
                boolean z9 = this.f6791c;
                com.stripe.android.paymentsheet.p pVar = this.f6792d;
                float f8 = this.f6793e;
                Function0 function0 = this.f6794f;
                Function1 function1 = this.f6795g;
                Function1 function12 = this.f6796h;
                Function1 function13 = this.f6797i;
                c cVar = c.f6800a;
                int size = list.size();
                if (c0119a != null) {
                    dVar = new d(c0119a, list);
                } else {
                    dVar = null;
                }
                LazyRow.items(size, dVar, new e(cVar, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(list, z8, z9, pVar, f8, function0, function1, function12, function13)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((LazyListScope) obj);
                return O5.I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z8, LazyListState lazyListState, List list, boolean z9, com.stripe.android.paymentsheet.p pVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13) {
            super(3);
            this.f6780a = z8;
            this.f6781b = lazyListState;
            this.f6782c = list;
            this.f6783d = z9;
            this.f6784e = pVar;
            this.f6785f = function0;
            this.f6786g = function1;
            this.f6787h = function12;
            this.f6788i = function13;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3255y.i(BoxWithConstraints, "$this$BoxWithConstraints");
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
            LazyDslKt.LazyRow(null, this.f6781b, PaddingKt.m600PaddingValuesYgX7TsA$default(Dp.m5183constructorimpl(17), 0.0f, 2, null), false, null, null, null, !this.f6780a, new a(this.f6782c, this.f6780a, this.f6783d, this.f6784e, U.s(BoxWithConstraints.mo545getMaxWidthD9Ej5fM(), composer, 0), this.f6785f, this.f6786g, this.f6787h, this.f6788i), composer, 384, 121);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6814a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.p f6815b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6816c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6817d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f6818e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f6819f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f6820g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f6821h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f6822i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LazyListState f6823j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f6824k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6825l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(List list, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, LazyListState lazyListState, int i8, int i9) {
            super(2);
            this.f6814a = list;
            this.f6815b = pVar;
            this.f6816c = z8;
            this.f6817d = z9;
            this.f6818e = function0;
            this.f6819f = function1;
            this.f6820g = function12;
            this.f6821h = function13;
            this.f6822i = modifier;
            this.f6823j = lazyListState;
            this.f6824k = i8;
            this.f6825l = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            U.k(this.f6814a, this.f6815b, this.f6816c, this.f6817d, this.f6818e, this.f6819f, this.f6820g, this.f6821h, this.f6822i, this.f6823j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6824k | 1), this.f6825l);
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
        throw new UnsupportedOperationException("Method not decompiled: M3.U.a(float, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(InterfaceC3698L cvcControllerFlow, boolean z8, int i8, int i9, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        boolean z9;
        AbstractC3255y.i(cvcControllerFlow, "cvcControllerFlow");
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
        State a8 = y4.f.a(cvcControllerFlow, startRestartGroup, 8);
        State a9 = y4.f.a(d(a8).getError(), startRestartGroup, 8);
        h4.S s8 = new h4.S(new p4.G(), d(a8));
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
        O5.I i14 = O5.I.f8278a;
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
        EffectsKt.LaunchedEffect(i14, (InterfaceC1668n) rememberedValue3, startRestartGroup, 70);
        AnimatedVisibilityKt.AnimatedVisibility(e(mutableState), (Modifier) null, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(i12, i13, null, 4, null), null, false, d.f6697a, 6, null), (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1074270777, true, new e(a9, s8, z8, focusRequester)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
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

    private static final h4.Q d(State state) {
        return (h4.Q) state.getValue();
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
        throw new UnsupportedOperationException("Method not decompiled: M3.U.f(float, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: M3.U.g(float, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
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
        B2.b d8 = B.d(dVar.e());
        startRestartGroup.startReplaceableGroup(358888102);
        if (d8 == null) {
            a8 = null;
        } else {
            a8 = AbstractC4148a.a(d8, startRestartGroup, 8);
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (z8 && z9 && z10) {
            c8 = C.f6481c;
        } else if (z8 && z9) {
            c8 = C.f6480b;
        } else {
            c8 = C.f6479a;
        }
        C c9 = c8;
        int g8 = B.g(dVar.e(), false, 1, null);
        C4033g d9 = dVar.d();
        String a9 = AbstractC1306a.a(AbstractC4148a.a(dVar.d().a(), startRestartGroup, 8));
        String a10 = AbstractC1306a.a(AbstractC4148a.a(dVar.d().c(), startRestartGroup, 8));
        Modifier modifier3 = modifier2;
        T.e(f8, z11, c9, z8, !z9, g8, modifier3, null, e8, a8, d9, a9, false, new m(function13, dVar), new n(function12, dVar), AbstractC1306a.a(AbstractC4148a.a(dVar.d().e(), startRestartGroup, 8)), a10, new o(function1, dVar), startRestartGroup, ((i8 >> 3) & 14) | ((i8 >> 12) & 112) | ((i8 << 3) & 7168) | ((i8 >> 9) & 3670016), 8, 4224);
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
        throw new UnsupportedOperationException("Method not decompiled: M3.U.i(com.stripe.android.paymentsheet.p, float, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void j(V interactor, c.j.b cvcRecollectionState, Modifier modifier, Composer composer, int i8) {
        int i9;
        Composer composer2;
        p.d dVar;
        com.stripe.android.model.o e8;
        int i10;
        int i11;
        int i12;
        AbstractC3255y.i(interactor, "interactor");
        AbstractC3255y.i(cvcRecollectionState, "cvcRecollectionState");
        AbstractC3255y.i(modifier, "modifier");
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
            State a8 = y4.f.a(interactor.getState(), startRestartGroup, 8);
            composer2 = startRestartGroup;
            k(l(a8).d(), l(a8).e(), l(a8).f(), l(a8).g(), new r(interactor), new s(interactor), new t(interactor), new u(interactor), TestTagKt.testTag(modifier, "PaymentSheetSavedPaymentOptionTabLayout"), null, startRestartGroup, 8, 512);
            if (cvcRecollectionState instanceof c.j.b.C0021b) {
                com.stripe.android.paymentsheet.p e9 = l(a8).e();
                o.p pVar = null;
                if (e9 instanceof p.d) {
                    dVar = (p.d) e9;
                } else {
                    dVar = null;
                }
                if (dVar != null && (e8 = dVar.e()) != null) {
                    pVar = e8.f25467e;
                }
                if (pVar == o.p.f25587i) {
                    b(((c.j.b.C0021b) cvcRecollectionState).a(), l(a8).g(), 0, 0, composer2, 8, 12);
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
        AbstractC3255y.i(paymentOptionsItems, "paymentOptionsItems");
        AbstractC3255y.i(onAddCardPressed, "onAddCardPressed");
        AbstractC3255y.i(onItemSelected, "onItemSelected");
        AbstractC3255y.i(onModifyItem, "onModifyItem");
        AbstractC3255y.i(onItemRemoved, "onItemRemoved");
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
            rememberedValue = Dp.m5181boximpl(Dp.m5183constructorimpl(Dp.m5183constructorimpl(f8 - Dp.m5183constructorimpl(Dp.m5183constructorimpl(17) * 2)) / (((int) (Dp.m5183constructorimpl(r0 * r3) / Dp.m5183constructorimpl(Dp.m5183constructorimpl(100) + Dp.m5183constructorimpl(Dp.m5183constructorimpl(6) * r0)))) / 2.0f)));
            composer.updateRememberedValue(rememberedValue);
        }
        float m5197unboximpl = ((Dp) rememberedValue).m5197unboximpl();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m5197unboximpl;
    }
}
