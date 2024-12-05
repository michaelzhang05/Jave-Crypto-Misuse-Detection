package W2;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;
import m4.AbstractC3441m;
import p4.C0;
import p4.Q;
import p4.T;
import p4.p0;
import p4.w0;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11454a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.a f11455b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11456c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f11457d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11458e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f11459f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11460g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ V2.b f11461h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f11462i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f11463j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f11464k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ w0 f11465l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11466m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: W2.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0241a extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ V2.b f11467a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0241a(V2.b bVar) {
                super(3);
                this.f11467a = bVar;
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8278a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                String a8;
                AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(556915907, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:83)");
                }
                V2.b bVar = this.f11467a;
                if (bVar == null) {
                    a8 = null;
                } else {
                    Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    AbstractC3255y.h(resources, "getResources(...)");
                    a8 = bVar.a(resources);
                }
                if (a8 == null) {
                    a8 = "";
                }
                V2.d.a(a8, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f11468a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f11469b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f11470c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ w0 f11471d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ X2.a f11472e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f11473f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ FocusRequester f11474g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Q f11475h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ FocusRequester f11476i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ w0 f11477j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ FocusRequester f11478k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ V2.b f11479l;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: W2.g$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0242a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f11480a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0 f11481b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0242a(Function0 function0, S5.d dVar) {
                    super(2, dVar);
                    this.f11481b = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0242a(this.f11481b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f11480a == 0) {
                        t.b(obj);
                        this.f11481b.invoke();
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0242a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: W2.g$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0243b extends AbstractC3256z implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ V2.b f11482a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0243b(V2.b bVar) {
                    super(3);
                    this.f11482a = bVar;
                }

                @Override // a6.InterfaceC1669o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return I.f8278a;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                    String a8;
                    AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-631105122, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:150)");
                    }
                    V2.b bVar = this.f11482a;
                    if (bVar == null) {
                        a8 = null;
                    } else {
                        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        AbstractC3255y.h(resources, "getResources(...)");
                        a8 = bVar.a(resources);
                    }
                    if (a8 == null) {
                        a8 = "";
                    }
                    V2.d.a(a8, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, composer, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function0 function0, boolean z8, boolean z9, w0 w0Var, X2.a aVar, boolean z10, FocusRequester focusRequester, Q q8, FocusRequester focusRequester2, w0 w0Var2, FocusRequester focusRequester3, V2.b bVar) {
                super(3);
                this.f11468a = function0;
                this.f11469b = z8;
                this.f11470c = z9;
                this.f11471d = w0Var;
                this.f11472e = aVar;
                this.f11473f = z10;
                this.f11474g = focusRequester;
                this.f11475h = q8;
                this.f11476i = focusRequester2;
                this.f11477j = w0Var2;
                this.f11478k = focusRequester3;
                this.f11479l = bVar;
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8278a;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
                boolean z8;
                int m4873getDoneeUduSuo;
                ColumnScopeInstance columnScopeInstance;
                int i9;
                int m4873getDoneeUduSuo2;
                AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-333430484, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:92)");
                }
                I i10 = I.f8278a;
                composer.startReplaceableGroup(-1787610638);
                boolean changed = composer.changed(this.f11468a);
                Function0 function0 = this.f11468a;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0242a(function0, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(i10, (InterfaceC1668n) rememberedValue, composer, 70);
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                boolean z9 = this.f11469b;
                boolean z10 = this.f11470c;
                w0 w0Var = this.f11471d;
                X2.a aVar = this.f11472e;
                boolean z11 = this.f11473f;
                FocusRequester focusRequester = this.f11474g;
                Q q8 = this.f11475h;
                FocusRequester focusRequester2 = this.f11476i;
                w0 w0Var2 = this.f11477j;
                FocusRequester focusRequester3 = this.f11478k;
                V2.b bVar = this.f11479l;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i11 = MaterialTheme.$stable;
                DividerKt.m1218DivideroMI9zvI(PaddingKt.m607paddingVpY3zN4$default(companion, Dp.m5183constructorimpl(AbstractC3441m.o(materialTheme, composer, i11).c()), 0.0f, 2, null), AbstractC3441m.n(materialTheme, composer, i11).f(), Dp.m5183constructorimpl(AbstractC3441m.o(materialTheme, composer, i11).c()), 0.0f, composer, 0, 8);
                if (z9) {
                    composer.startReplaceableGroup(1068105420);
                    if (z11) {
                        m4873getDoneeUduSuo2 = ImeAction.Companion.m4875getNexteUduSuo();
                    } else {
                        m4873getDoneeUduSuo2 = ImeAction.Companion.m4873getDoneeUduSuo();
                    }
                    z8 = z10;
                    i.a(z10, w0Var, aVar, m4873getDoneeUduSuo2, focusRequester, false, null, composer, 64, 96);
                    composer.endReplaceableGroup();
                    columnScopeInstance = columnScopeInstance2;
                    i9 = i11;
                } else {
                    z8 = z10;
                    composer.startReplaceableGroup(1068616455);
                    boolean z12 = q8.A().length() == 0;
                    if (z11) {
                        m4873getDoneeUduSuo = ImeAction.Companion.m4875getNexteUduSuo();
                    } else {
                        m4873getDoneeUduSuo = ImeAction.Companion.m4873getDoneeUduSuo();
                    }
                    columnScopeInstance = columnScopeInstance2;
                    i9 = i11;
                    T.b(z8, q8, null, null, z12, z11, focusRequester2, null, m4873getDoneeUduSuo, composer, Q.f37221s << 3, 140);
                    composer.endReplaceableGroup();
                }
                DividerKt.m1218DivideroMI9zvI(PaddingKt.m607paddingVpY3zN4$default(companion, Dp.m5183constructorimpl(AbstractC3441m.o(materialTheme, composer, i9).c()), 0.0f, 2, null), AbstractC3441m.n(materialTheme, composer, i9).f(), Dp.m5183constructorimpl(AbstractC3441m.o(materialTheme, composer, i9).c()), 0.0f, composer, 0, 8);
                composer.startReplaceableGroup(588692827);
                if (z11) {
                    C0.c(w0Var2, z8, ImeAction.Companion.m4873getDoneeUduSuo(), null, null, 0, 0, focusRequester3, composer, 392, 120);
                }
                composer.endReplaceableGroup();
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, bVar != null, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -631105122, true, new C0243b(bVar)), composer, 1572870, 30);
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
        a(boolean z8, X2.a aVar, boolean z9, Q q8, FocusRequester focusRequester, w0 w0Var, FocusRequester focusRequester2, V2.b bVar, boolean z10, Function0 function0, boolean z11, w0 w0Var2, FocusRequester focusRequester3) {
            super(2);
            this.f11454a = z8;
            this.f11455b = aVar;
            this.f11456c = z9;
            this.f11457d = q8;
            this.f11458e = focusRequester;
            this.f11459f = w0Var;
            this.f11460g = focusRequester2;
            this.f11461h = bVar;
            this.f11462i = z10;
            this.f11463j = function0;
            this.f11464k = z11;
            this.f11465l = w0Var2;
            this.f11466m = focusRequester3;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            int m4873getDoneeUduSuo;
            int m4873getDoneeUduSuo2;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1115593573, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous> (LinkInlineSignupFields.kt:52)");
            }
            if (this.f11454a) {
                composer.startReplaceableGroup(1694416591);
                if (this.f11455b == X2.a.f12743c) {
                    m4873getDoneeUduSuo2 = ImeAction.Companion.m4875getNexteUduSuo();
                } else {
                    m4873getDoneeUduSuo2 = ImeAction.Companion.m4873getDoneeUduSuo();
                }
                T.b(this.f11456c, this.f11457d, null, null, false, true, this.f11458e, W2.a.f11367a.a(), m4873getDoneeUduSuo2, composer, (Q.f37221s << 3) | 12779520, 28);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1694918078);
                boolean z8 = this.f11456c;
                w0 w0Var = this.f11459f;
                X2.a aVar = this.f11455b;
                if (aVar == X2.a.f12743c) {
                    m4873getDoneeUduSuo = ImeAction.Companion.m4875getNexteUduSuo();
                } else {
                    m4873getDoneeUduSuo = ImeAction.Companion.m4873getDoneeUduSuo();
                }
                i.a(z8, w0Var, aVar, m4873getDoneeUduSuo, this.f11460g, false, W2.a.f11367a.b(), composer, 1572928, 32);
                composer.endReplaceableGroup();
            }
            X2.a aVar2 = this.f11455b;
            X2.a aVar3 = X2.a.f12743c;
            AnimatedVisibilityKt.AnimatedVisibility((aVar2 == aVar3 || this.f11461h == null) ? false : true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 556915907, true, new C0241a(this.f11461h)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            AnimatedVisibilityKt.AnimatedVisibility(this.f11462i || this.f11455b == aVar3, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -333430484, true, new b(this.f11463j, this.f11454a, this.f11456c, this.f11459f, this.f11455b, this.f11464k, this.f11460g, this.f11457d, this.f11458e, this.f11465l, this.f11466m, this.f11461h)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f11483a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f11484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f11485c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f11486d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ X2.a f11487e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11488f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11489g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f11490h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ V2.b f11491i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f11492j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f11493k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f11494l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11495m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11496n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11497o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f11498p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f11499q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f11500r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Integer num, w0 w0Var, Q q8, w0 w0Var2, X2.a aVar, boolean z8, boolean z9, boolean z10, V2.b bVar, boolean z11, Function0 function0, Modifier modifier, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, int i8, int i9, int i10) {
            super(2);
            this.f11483a = num;
            this.f11484b = w0Var;
            this.f11485c = q8;
            this.f11486d = w0Var2;
            this.f11487e = aVar;
            this.f11488f = z8;
            this.f11489g = z9;
            this.f11490h = z10;
            this.f11491i = bVar;
            this.f11492j = z11;
            this.f11493k = function0;
            this.f11494l = modifier;
            this.f11495m = focusRequester;
            this.f11496n = focusRequester2;
            this.f11497o = focusRequester3;
            this.f11498p = i8;
            this.f11499q = i9;
            this.f11500r = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f11483a, this.f11484b, this.f11485c, this.f11486d, this.f11487e, this.f11488f, this.f11489g, this.f11490h, this.f11491i, this.f11492j, this.f11493k, this.f11494l, this.f11495m, this.f11496n, this.f11497o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11498p | 1), RecomposeScopeImplKt.updateChangedFlags(this.f11499q), this.f11500r);
        }
    }

    public static final void a(Integer num, w0 emailController, Q phoneNumberController, w0 nameController, X2.a signUpState, boolean z8, boolean z9, boolean z10, V2.b bVar, boolean z11, Function0 onShowingAllFields, Modifier modifier, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, Composer composer, int i8, int i9, int i10) {
        FocusRequester focusRequester4;
        FocusRequester focusRequester5;
        FocusRequester focusRequester6;
        AbstractC3255y.i(emailController, "emailController");
        AbstractC3255y.i(phoneNumberController, "phoneNumberController");
        AbstractC3255y.i(nameController, "nameController");
        AbstractC3255y.i(signUpState, "signUpState");
        AbstractC3255y.i(onShowingAllFields, "onShowingAllFields");
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
