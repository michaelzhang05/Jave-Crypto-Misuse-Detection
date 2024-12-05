package W2;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import l6.M;
import m4.AbstractC3441m;
import p4.C;
import p4.Q;
import p4.g0;
import p4.s0;
import p4.w0;
import s4.AbstractC3996a;

/* loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f11501a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f11501a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m66invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m66invoke() {
            this.f11501a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11502a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11504c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11505d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f11506e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11507f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z8, boolean z9, float f8, Function0 function0, int i8) {
            super(2);
            this.f11502a = str;
            this.f11503b = z8;
            this.f11504c = z9;
            this.f11505d = f8;
            this.f11506e = function0;
            this.f11507f = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            h.a(this.f11502a, this.f11503b, this.f11504c, this.f11505d, this.f11506e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11507f | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f11508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f11509b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f11510c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X2.a f11511d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11512e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11513f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ V2.b f11514g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ MutableState f11515h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11516i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ State f11517j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f11518a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MutableState mutableState) {
                super(0);
                this.f11518a = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m67invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m67invoke() {
                h.d(this.f11518a, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w0 w0Var, Q q8, w0 w0Var2, X2.a aVar, boolean z8, boolean z9, V2.b bVar, MutableState mutableState, FocusRequester focusRequester, State state) {
            super(3);
            this.f11508a = w0Var;
            this.f11509b = q8;
            this.f11510c = w0Var2;
            this.f11511d = aVar;
            this.f11512e = z8;
            this.f11513f = z9;
            this.f11514g = bVar;
            this.f11515h = mutableState;
            this.f11516i = focusRequester;
            this.f11517j = state;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195510504, i8, -1, "com.stripe.android.link.ui.inline.LinkFields.<anonymous> (LinkInlineSignup.kt:235)");
            }
            float f8 = 16;
            Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, Dp.m5183constructorimpl(f8), 0.0f, Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f8), 2, null);
            w0 w0Var = this.f11508a;
            Q q8 = this.f11509b;
            w0 w0Var2 = this.f11510c;
            X2.a aVar = this.f11511d;
            boolean z8 = this.f11512e;
            boolean z9 = this.f11513f;
            V2.b bVar = this.f11514g;
            MutableState mutableState = this.f11515h;
            FocusRequester focusRequester = this.f11516i;
            State state = this.f11517j;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            C e8 = h.e(state);
            Integer valueOf = e8 != null ? Integer.valueOf(e8.a()) : null;
            boolean c8 = h.c(mutableState);
            composer.startReplaceableGroup(-574101848);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(mutableState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            W2.g.a(valueOf, w0Var, q8, w0Var2, aVar, z8, false, z9, bVar, c8, (Function0) rememberedValue, null, focusRequester, null, null, composer, (Q.f37221s << 6) | 1577024, 0, 26624);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, aVar == X2.a.f12743c, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, W2.b.f11372a.a(), composer, 1572870, 30);
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
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11519a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11520b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X2.a f11521c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11522d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ V2.b f11523e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f11524f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ w0 f11525g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Q f11526h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w0 f11527i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11528j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11529k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, X2.a aVar, boolean z10, V2.b bVar, g0 g0Var, w0 w0Var, Q q8, w0 w0Var2, FocusRequester focusRequester, int i8) {
            super(2);
            this.f11519a = z8;
            this.f11520b = z9;
            this.f11521c = aVar;
            this.f11522d = z10;
            this.f11523e = bVar;
            this.f11524f = g0Var;
            this.f11525g = w0Var;
            this.f11526h = q8;
            this.f11527i = w0Var2;
            this.f11528j = focusRequester;
            this.f11529k = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            h.b(this.f11519a, this.f11520b, this.f11521c, this.f11522d, this.f11523e, this.f11524f, this.f11525g, this.f11526h, this.f11527i, this.f11528j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11529k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f11530a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableState invoke() {
            MutableState mutableStateOf$default;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            return mutableStateOf$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11531a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f11532b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f11533c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, State state, S5.d dVar) {
            super(2, dVar);
            this.f11532b = function1;
            this.f11533c = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f11532b, this.f11533c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f11531a == 0) {
                t.b(obj);
                this.f11532b.invoke(h.h(this.f11533c));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11534a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f11535b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextInputService f11536c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f11537d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FocusManager focusManager, TextInputService textInputService, State state, S5.d dVar) {
            super(2, dVar);
            this.f11535b = focusManager;
            this.f11536c = textInputService;
            this.f11537d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f11535b, this.f11536c, this.f11537d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f11534a == 0) {
                t.b(obj);
                if (h.h(this.f11537d).f() == X2.a.f12741a && h.h(this.f11537d).i() != null) {
                    this.f11535b.clearFocus(true);
                    TextInputService textInputService = this.f11536c;
                    if (textInputService != null) {
                        textInputService.hideSoftwareKeyboard();
                    }
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W2.h$h, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0244h extends C3252v implements Function0 {
        C0244h(Object obj) {
            super(0, obj, W2.c.class, "toggleExpanded", "toggleExpanded()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m68invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68invoke() {
            ((W2.c) this.receiver).x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W2.c f11538a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11539b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f11540c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f11541d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11542e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11543f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(W2.c cVar, boolean z8, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f11538a = cVar;
            this.f11539b = z8;
            this.f11540c = function1;
            this.f11541d = modifier;
            this.f11542e = i8;
            this.f11543f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            h.f(this.f11538a, this.f11539b, this.f11540c, this.f11541d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11542e | 1), this.f11543f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11544a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11545b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11546c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z8, FocusRequester focusRequester, S5.d dVar) {
            super(2, dVar);
            this.f11545b = z8;
            this.f11546c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(this.f11545b, this.f11546c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f11544a == 0) {
                t.b(obj);
                if (this.f11545b) {
                    this.f11546c.requestFocus();
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f11548b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BringIntoViewRequester f11549c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f11550a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BringIntoViewRequester f11551b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BringIntoViewRequester bringIntoViewRequester, S5.d dVar) {
                super(2, dVar);
                this.f11551b = bringIntoViewRequester;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f11551b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f11550a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    BringIntoViewRequester bringIntoViewRequester = this.f11551b;
                    this.f11550a = 1;
                    if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z8, M m8, BringIntoViewRequester bringIntoViewRequester) {
            super(1);
            this.f11547a = z8;
            this.f11548b = m8;
            this.f11549c = bringIntoViewRequester;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return I.f8278a;
        }

        public final void invoke(FocusState state) {
            AbstractC3255y.i(state, "state");
            if (state.getHasFocus() && this.f11547a) {
                AbstractC3364k.d(this.f11548b, null, null, new a(this.f11549c, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11552a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f11553b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f11554c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f11555d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f11556e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X2.a f11557f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11558g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f11559h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f11560i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V2.b f11561j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f11562k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f11563l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f11564m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f11565n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11566o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, g0 g0Var, w0 w0Var, Q q8, w0 w0Var2, X2.a aVar, boolean z8, boolean z9, boolean z10, V2.b bVar, Function0 function0, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f11552a = str;
            this.f11553b = g0Var;
            this.f11554c = w0Var;
            this.f11555d = q8;
            this.f11556e = w0Var2;
            this.f11557f = aVar;
            this.f11558g = z8;
            this.f11559h = z9;
            this.f11560i = z10;
            this.f11561j = bVar;
            this.f11562k = function0;
            this.f11563l = modifier;
            this.f11564m = i8;
            this.f11565n = i9;
            this.f11566o = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            h.g(this.f11552a, this.f11553b, this.f11554c, this.f11555d, this.f11556e, this.f11557f, this.f11558g, this.f11559h, this.f11560i, this.f11561j, this.f11562k, this.f11563l, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11564m | 1), RecomposeScopeImplKt.updateChangedFlags(this.f11565n), this.f11566o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str, boolean z8, boolean z9, float f8, Function0 function0, Composer composer, int i8) {
        int i9;
        boolean z10;
        TextStyle m4724copyv2rsoow;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(136966845);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i9 = i14 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i9 |= i13;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z9)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i9 |= i12;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(f8)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i9 |= i11;
        }
        if ((i8 & 57344) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i9 |= i10;
        }
        if ((46811 & i9) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(136966845, i9, -1, "com.stripe.android.link.ui.inline.LinkCheckbox (LinkInlineSignup.kt:186)");
            }
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(-1521076051);
            if ((57344 & i9) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(ClickableKt.m320clickableXHw0xAI$default(companion, z9, null, null, (Function0) rememberedValue, 6, null), Dp.m5183constructorimpl(16));
            startRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs);
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
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            AbstractC3996a.a(z8, null, PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5183constructorimpl(8), 0.0f, 11, null), z9, startRestartGroup, ((i9 >> 3) & 14) | 432 | ((i9 << 3) & 7168), 0);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl2 = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(N2.j.f7696a, startRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            m4724copyv2rsoow = r32.m4724copyv2rsoow((r48 & 1) != 0 ? r32.spanStyle.m4656getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r32.spanStyle.m4657getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r32.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (r48 & 8) != 0 ? r32.spanStyle.m4658getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r32.spanStyle.m4659getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r32.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r32.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r32.spanStyle.m4660getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r32.spanStyle.m4655getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r32.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r32.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r32.spanStyle.m4654getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r32.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r32.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r32.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5080boximpl(r32.paragraphStyle.m4612getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5094boximpl(r32.paragraphStyle.m4614getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r32.paragraphStyle.m4610getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r32.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r32.platformStyle : null, (r48 & 1048576) != 0 ? r32.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m5000boximpl(r32.paragraphStyle.m4609getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4990boximpl(r32.paragraphStyle.m4607getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? materialTheme.getTypography(startRestartGroup, i15).getBody1().paragraphStyle.getTextMotion() : null);
            TextKt.m1419Text4IGK_g(stringResource, (Modifier) null, Color.m2975copywmQWz5c$default(materialTheme.getColors(startRestartGroup, i15).m1182getOnSurface0d7_KjU(), f8, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, m4724copyv2rsoow, startRestartGroup, 0, 0, 65530);
            TextKt.m1419Text4IGK_g(StringResources_androidKt.stringResource(N2.j.f7699d, new Object[]{str}, startRestartGroup, 64), PaddingKt.m609paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5183constructorimpl(4), 0.0f, 0.0f, 13, null), AbstractC3441m.n(materialTheme, startRestartGroup, i15).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i15).getBody1(), startRestartGroup, 48, 0, 65528);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new b(str, z8, z9, f8, function0, i8));
        }
    }

    public static final void b(boolean z8, boolean z9, X2.a signUpState, boolean z10, V2.b bVar, g0 sectionController, w0 emailController, Q phoneNumberController, w0 nameController, FocusRequester emailFocusRequester, Composer composer, int i8) {
        AbstractC3255y.i(signUpState, "signUpState");
        AbstractC3255y.i(sectionController, "sectionController");
        AbstractC3255y.i(emailController, "emailController");
        AbstractC3255y.i(phoneNumberController, "phoneNumberController");
        AbstractC3255y.i(nameController, "nameController");
        AbstractC3255y.i(emailFocusRequester, "emailFocusRequester");
        Composer startRestartGroup = composer.startRestartGroup(1587095792);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1587095792, i8, -1, "com.stripe.android.link.ui.inline.LinkFields (LinkInlineSignup.kt:229)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(z8, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -195510504, true, new c(emailController, phoneNumberController, nameController, signUpState, z9, z10, bVar, (MutableState) RememberSaveableKt.m2588rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) e.f11530a, startRestartGroup, 3080, 6), emailFocusRequester, y4.f.a(sectionController.getError(), startRestartGroup, 8))), startRestartGroup, (i8 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(z8, z9, signUpState, z10, bVar, sectionController, emailController, phoneNumberController, nameController, emailFocusRequester, i8));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final C e(State state) {
        return (C) state.getValue();
    }

    public static final void f(W2.c viewModel, boolean z8, Function1 onStateChanged, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        AbstractC3255y.i(viewModel, "viewModel");
        AbstractC3255y.i(onStateChanged, "onStateChanged");
        Composer startRestartGroup = composer.startRestartGroup(762633745);
        if ((i9 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(762633745, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:67)");
        }
        State a8 = y4.f.a(viewModel.s(), startRestartGroup, 8);
        State a9 = y4.f.a(viewModel.m(), startRestartGroup, 8);
        W2.e h8 = h(a8);
        startRestartGroup.startReplaceableGroup(-98379888);
        if ((((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(onStateChanged)) || (i8 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean changed = z9 | startRestartGroup.changed(a8);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(onStateChanged, a8, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(h8, (InterfaceC1668n) rememberedValue, startRestartGroup, 72);
        EffectsKt.LaunchedEffect(h(a8).f(), new g((FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService()), a8, null), startRestartGroup, 64);
        String d8 = h(a8).d();
        g0 q8 = viewModel.q();
        s0 l8 = viewModel.l();
        Q o8 = viewModel.o();
        s0 n8 = viewModel.n();
        X2.a f8 = h(a8).f();
        boolean j8 = h(a8).j();
        boolean p8 = viewModel.p();
        V2.b i10 = i(a9);
        C0244h c0244h = new C0244h(viewModel);
        int i11 = g0.f37524c << 3;
        int i12 = s0.f37711x;
        g(d8, q8, l8, o8, n8, f8, z8, j8, p8, i10, c0244h, modifier2, startRestartGroup, i11 | (i12 << 6) | (Q.f37221s << 9) | (i12 << 12) | ((i8 << 15) & 3670016), (i8 >> 6) & 112, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(viewModel, z8, onStateChanged, modifier2, i8, i9));
        }
    }

    public static final void g(String merchantName, g0 sectionController, w0 emailController, Q phoneNumberController, w0 nameController, X2.a signUpState, boolean z8, boolean z9, boolean z10, V2.b bVar, Function0 toggleExpanded, Modifier modifier, Composer composer, int i8, int i9, int i10) {
        float disabled;
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(sectionController, "sectionController");
        AbstractC3255y.i(emailController, "emailController");
        AbstractC3255y.i(phoneNumberController, "phoneNumberController");
        AbstractC3255y.i(nameController, "nameController");
        AbstractC3255y.i(signUpState, "signUpState");
        AbstractC3255y.i(toggleExpanded, "toggleExpanded");
        Composer startRestartGroup = composer.startRestartGroup(27226494);
        Modifier modifier2 = (i10 & 2048) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(27226494, i8, i9, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:117)");
        }
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(S5.h.f9825a, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-98328252);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-98325908);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = BringIntoViewRequesterKt.BringIntoViewRequester();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        Boolean valueOf = Boolean.valueOf(z9);
        startRestartGroup.startReplaceableGroup(-98323681);
        boolean z11 = (((i8 & 29360128) ^ 12582912) > 8388608 && startRestartGroup.changed(z9)) || (i8 & 12582912) == 8388608;
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (z11 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new j(z9, focusRequester, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        int i11 = (i8 >> 21) & 14;
        EffectsKt.LaunchedEffect(valueOf, (InterfaceC1668n) rememberedValue4, startRestartGroup, i11 | 64);
        if (z8) {
            startRestartGroup.startReplaceableGroup(-98319317);
            disabled = ContentAlpha.INSTANCE.getHigh(startRestartGroup, ContentAlpha.$stable);
        } else {
            startRestartGroup.startReplaceableGroup(-98318577);
            disabled = ContentAlpha.INSTANCE.getDisabled(startRestartGroup, ContentAlpha.$stable);
        }
        startRestartGroup.endReplaceableGroup();
        float f8 = disabled;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i12 = MaterialTheme.$stable;
        Modifier modifier3 = modifier2;
        Modifier bringIntoViewRequester2 = BringIntoViewRequesterKt.bringIntoViewRequester(FocusEventModifierKt.onFocusEvent(BackgroundKt.m286backgroundbw27NRU(BorderKt.border(modifier2, AbstractC3441m.e(materialTheme, false, startRestartGroup, i12 | 48), AbstractC3441m.o(materialTheme, startRestartGroup, i12).f()), AbstractC3441m.n(materialTheme, startRestartGroup, i12).d(), AbstractC3441m.o(materialTheme, startRestartGroup, i12).f()), new k(z9, coroutineScope, bringIntoViewRequester)), bringIntoViewRequester);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(bringIntoViewRequester2);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier alpha = AlphaKt.alpha(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AbstractC3441m.o(materialTheme, startRestartGroup, i12).f()), f8);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion3.getConstructor();
        InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(alpha);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2501constructorimpl2 = Updater.m2501constructorimpl(startRestartGroup);
        Updater.m2508setimpl(m2501constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        a(merchantName, z9, z8, f8, toggleExpanded, startRestartGroup, (i8 & 14) | ((i8 >> 18) & 112) | ((i8 >> 12) & 896) | ((i9 << 12) & 57344));
        int i13 = i8 >> 15;
        int i14 = 941621248 | i11 | (i13 & 112) | ((i8 >> 9) & 896) | (i13 & 7168) | (i13 & 57344) | (g0.f37524c << 15);
        int i15 = i8 << 12;
        b(z9, z8, signUpState, z10, bVar, sectionController, emailController, phoneNumberController, nameController, focusRequester, startRestartGroup, i14 | (458752 & i15) | (Q.f37221s << 21) | (i15 & 29360128));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(merchantName, sectionController, emailController, phoneNumberController, nameController, signUpState, z8, z9, z10, bVar, toggleExpanded, modifier3, i8, i9, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W2.e h(State state) {
        return (W2.e) state.getValue();
    }

    private static final V2.b i(State state) {
        return (V2.b) state.getValue();
    }
}
