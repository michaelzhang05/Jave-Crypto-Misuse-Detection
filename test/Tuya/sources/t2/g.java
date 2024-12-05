package T2;

import L5.I;
import L5.t;
import X5.n;
import X5.o;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.C0;
import m4.Q;
import m4.T;
import m4.p0;
import m4.w0;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U2.a f9798b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9799c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f9800d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9801e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f9802f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9803g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ S2.b f9804h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9805i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f9806j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f9807k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ w0 f9808l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9809m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: T2.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0216a extends AbstractC3160z implements o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ S2.b f9810a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0216a(S2.b bVar) {
                super(3);
                this.f9810a = bVar;
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6487a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                String b8;
                AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(556915907, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:83)");
                }
                S2.b bVar = this.f9810a;
                if (bVar == null) {
                    b8 = null;
                } else {
                    Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    AbstractC3159y.h(resources, "getResources(...)");
                    b8 = bVar.b(resources);
                }
                if (b8 == null) {
                    b8 = "";
                }
                S2.d.a(b8, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f9811a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f9812b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f9813c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ w0 f9814d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ U2.a f9815e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f9816f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ FocusRequester f9817g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Q f9818h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ FocusRequester f9819i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ w0 f9820j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ FocusRequester f9821k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ S2.b f9822l;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: T2.g$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0217a extends kotlin.coroutines.jvm.internal.l implements n {

                /* renamed from: a, reason: collision with root package name */
                int f9823a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0 f9824b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0217a(Function0 function0, P5.d dVar) {
                    super(2, dVar);
                    this.f9824b = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0217a(this.f9824b, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0217a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Q5.b.e();
                    if (this.f9823a == 0) {
                        t.b(obj);
                        this.f9824b.invoke();
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: T2.g$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0218b extends AbstractC3160z implements o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ S2.b f9825a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0218b(S2.b bVar) {
                    super(3);
                    this.f9825a = bVar;
                }

                @Override // X5.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return I.f6487a;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                    String b8;
                    AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-631105122, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:150)");
                    }
                    S2.b bVar = this.f9825a;
                    if (bVar == null) {
                        b8 = null;
                    } else {
                        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        AbstractC3159y.h(resources, "getResources(...)");
                        b8 = bVar.b(resources);
                    }
                    if (b8 == null) {
                        b8 = "";
                    }
                    S2.d.a(b8, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, composer, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0 function0, boolean z8, boolean z9, w0 w0Var, U2.a aVar, boolean z10, FocusRequester focusRequester, Q q8, FocusRequester focusRequester2, w0 w0Var2, FocusRequester focusRequester3, S2.b bVar) {
                super(3);
                this.f9811a = function0;
                this.f9812b = z8;
                this.f9813c = z9;
                this.f9814d = w0Var;
                this.f9815e = aVar;
                this.f9816f = z10;
                this.f9817g = focusRequester;
                this.f9818h = q8;
                this.f9819i = focusRequester2;
                this.f9820j = w0Var2;
                this.f9821k = focusRequester3;
                this.f9822l = bVar;
            }

            @Override // X5.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f6487a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                boolean z8;
                int m4868getDoneeUduSuo;
                ColumnScopeInstance columnScopeInstance;
                int i9;
                int m4868getDoneeUduSuo2;
                AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-333430484, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:92)");
                }
                I i10 = I.f6487a;
                composer.startReplaceableGroup(-1787610638);
                boolean changed = composer.changed(this.f9811a);
                Function0 function0 = this.f9811a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0217a(function0, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(i10, (n) rememberedValue, composer, 70);
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                boolean z9 = this.f9812b;
                boolean z10 = this.f9813c;
                w0 w0Var = this.f9814d;
                U2.a aVar = this.f9815e;
                boolean z11 = this.f9816f;
                FocusRequester focusRequester = this.f9817g;
                Q q8 = this.f9818h;
                FocusRequester focusRequester2 = this.f9819i;
                w0 w0Var2 = this.f9820j;
                FocusRequester focusRequester3 = this.f9821k;
                S2.b bVar = this.f9822l;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i11 = MaterialTheme.$stable;
                DividerKt.m1213DivideroMI9zvI(PaddingKt.m602paddingVpY3zN4$default(companion, Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, composer, i11).c()), 0.0f, 2, null), AbstractC3087m.n(materialTheme, composer, i11).f(), Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, composer, i11).c()), 0.0f, composer, 0, 8);
                if (z9) {
                    composer.startReplaceableGroup(1068105420);
                    if (z11) {
                        m4868getDoneeUduSuo2 = ImeAction.Companion.m4870getNexteUduSuo();
                    } else {
                        m4868getDoneeUduSuo2 = ImeAction.Companion.m4868getDoneeUduSuo();
                    }
                    z8 = z10;
                    i.a(z10, w0Var, aVar, m4868getDoneeUduSuo2, focusRequester, false, null, composer, 64, 96);
                    composer.endReplaceableGroup();
                    columnScopeInstance = columnScopeInstance2;
                    i9 = i11;
                } else {
                    z8 = z10;
                    composer.startReplaceableGroup(1068616455);
                    boolean z12 = q8.A().length() == 0;
                    if (z11) {
                        m4868getDoneeUduSuo = ImeAction.Companion.m4870getNexteUduSuo();
                    } else {
                        m4868getDoneeUduSuo = ImeAction.Companion.m4868getDoneeUduSuo();
                    }
                    columnScopeInstance = columnScopeInstance2;
                    i9 = i11;
                    T.b(z8, q8, null, null, z12, z11, focusRequester2, null, m4868getDoneeUduSuo, composer, Q.f35195s << 3, 140);
                    composer.endReplaceableGroup();
                }
                DividerKt.m1213DivideroMI9zvI(PaddingKt.m602paddingVpY3zN4$default(companion, Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, composer, i9).c()), 0.0f, 2, null), AbstractC3087m.n(materialTheme, composer, i9).f(), Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, composer, i9).c()), 0.0f, composer, 0, 8);
                composer.startReplaceableGroup(588692827);
                if (z11) {
                    C0.c(w0Var2, z8, ImeAction.Companion.m4868getDoneeUduSuo(), null, null, 0, 0, focusRequester3, composer, 392, 120);
                }
                composer.endReplaceableGroup();
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, bVar != null, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -631105122, true, new C0218b(bVar)), composer, 1572870, 30);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, U2.a aVar, boolean z9, Q q8, FocusRequester focusRequester, w0 w0Var, FocusRequester focusRequester2, S2.b bVar, boolean z10, Function0 function0, boolean z11, w0 w0Var2, FocusRequester focusRequester3) {
            super(2);
            this.f9797a = z8;
            this.f9798b = aVar;
            this.f9799c = z9;
            this.f9800d = q8;
            this.f9801e = focusRequester;
            this.f9802f = w0Var;
            this.f9803g = focusRequester2;
            this.f9804h = bVar;
            this.f9805i = z10;
            this.f9806j = function0;
            this.f9807k = z11;
            this.f9808l = w0Var2;
            this.f9809m = focusRequester3;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            int m4868getDoneeUduSuo;
            int m4868getDoneeUduSuo2;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1115593573, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous> (LinkInlineSignupFields.kt:52)");
            }
            if (this.f9797a) {
                composer.startReplaceableGroup(1694416591);
                if (this.f9798b == U2.a.f11072c) {
                    m4868getDoneeUduSuo2 = ImeAction.Companion.m4870getNexteUduSuo();
                } else {
                    m4868getDoneeUduSuo2 = ImeAction.Companion.m4868getDoneeUduSuo();
                }
                T.b(this.f9799c, this.f9800d, null, null, false, true, this.f9801e, T2.a.f9710a.a(), m4868getDoneeUduSuo2, composer, (Q.f35195s << 3) | 12779520, 28);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1694918078);
                boolean z8 = this.f9799c;
                w0 w0Var = this.f9802f;
                U2.a aVar = this.f9798b;
                if (aVar == U2.a.f11072c) {
                    m4868getDoneeUduSuo = ImeAction.Companion.m4870getNexteUduSuo();
                } else {
                    m4868getDoneeUduSuo = ImeAction.Companion.m4868getDoneeUduSuo();
                }
                i.a(z8, w0Var, aVar, m4868getDoneeUduSuo, this.f9803g, false, T2.a.f9710a.b(), composer, 1572928, 32);
                composer.endReplaceableGroup();
            }
            U2.a aVar2 = this.f9798b;
            U2.a aVar3 = U2.a.f11072c;
            AnimatedVisibilityKt.AnimatedVisibility((aVar2 == aVar3 || this.f9804h == null) ? false : true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 556915907, true, new C0216a(this.f9804h)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            AnimatedVisibilityKt.AnimatedVisibility(this.f9805i || this.f9798b == aVar3, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -333430484, true, new b(this.f9806j, this.f9797a, this.f9799c, this.f9802f, this.f9798b, this.f9807k, this.f9803g, this.f9800d, this.f9801e, this.f9808l, this.f9809m, this.f9804h)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f9826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f9827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f9828c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f9829d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ U2.a f9830e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9831f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f9832g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9833h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ S2.b f9834i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f9835j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f9836k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f9837l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9838m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9839n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9840o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f9841p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f9842q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f9843r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Integer num, w0 w0Var, Q q8, w0 w0Var2, U2.a aVar, boolean z8, boolean z9, boolean z10, S2.b bVar, boolean z11, Function0 function0, Modifier modifier, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, int i8, int i9, int i10) {
            super(2);
            this.f9826a = num;
            this.f9827b = w0Var;
            this.f9828c = q8;
            this.f9829d = w0Var2;
            this.f9830e = aVar;
            this.f9831f = z8;
            this.f9832g = z9;
            this.f9833h = z10;
            this.f9834i = bVar;
            this.f9835j = z11;
            this.f9836k = function0;
            this.f9837l = modifier;
            this.f9838m = focusRequester;
            this.f9839n = focusRequester2;
            this.f9840o = focusRequester3;
            this.f9841p = i8;
            this.f9842q = i9;
            this.f9843r = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f9826a, this.f9827b, this.f9828c, this.f9829d, this.f9830e, this.f9831f, this.f9832g, this.f9833h, this.f9834i, this.f9835j, this.f9836k, this.f9837l, this.f9838m, this.f9839n, this.f9840o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9841p | 1), RecomposeScopeImplKt.updateChangedFlags(this.f9842q), this.f9843r);
        }
    }

    public static final void a(Integer num, w0 emailController, Q phoneNumberController, w0 nameController, U2.a signUpState, boolean z8, boolean z9, boolean z10, S2.b bVar, boolean z11, Function0 onShowingAllFields, Modifier modifier, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, Composer composer, int i8, int i9, int i10) {
        FocusRequester focusRequester4;
        FocusRequester focusRequester5;
        FocusRequester focusRequester6;
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(phoneNumberController, "phoneNumberController");
        AbstractC3159y.i(nameController, "nameController");
        AbstractC3159y.i(signUpState, "signUpState");
        AbstractC3159y.i(onShowingAllFields, "onShowingAllFields");
        Composer startRestartGroup = composer.startRestartGroup(1600593703);
        Modifier modifier2 = (i10 & 2048) != 0 ? Modifier.Companion : modifier;
        if ((i10 & 4096) != 0) {
            startRestartGroup.startReplaceableGroup(-280055715);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester4 = (FocusRequester) rememberedValue;
        } else {
            focusRequester4 = focusRequester;
        }
        if ((i10 & 8192) != 0) {
            startRestartGroup.startReplaceableGroup(-280053379);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester5 = (FocusRequester) rememberedValue2;
        } else {
            focusRequester5 = focusRequester2;
        }
        if ((i10 & 16384) != 0) {
            startRestartGroup.startReplaceableGroup(-280051075);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester6 = (FocusRequester) rememberedValue3;
        } else {
            focusRequester6 = focusRequester3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1600593703, i8, i9, "com.stripe.android.link.ui.inline.LinkInlineSignupFields (LinkInlineSignupFields.kt:45)");
        }
        startRestartGroup.startReplaceableGroup(-280047878);
        String stringResource = num == null ? null : StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        p0.a(null, stringResource, modifier2, false, false, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1115593573, true, new a(z9, signUpState, z8, phoneNumberController, focusRequester5, emailController, focusRequester4, bVar, z11, onShowingAllFields, z10, nameController, focusRequester6)), startRestartGroup, ((i9 << 3) & 896) | 1597446, 40);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(num, emailController, phoneNumberController, nameController, signUpState, z8, z9, z10, bVar, z11, onShowingAllFields, modifier2, focusRequester4, focusRequester5, focusRequester6, i8, i9, i10));
        }
    }
}
