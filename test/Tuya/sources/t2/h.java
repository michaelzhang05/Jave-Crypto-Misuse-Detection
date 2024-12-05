package T2;

import L5.I;
import L5.t;
import X5.n;
import X5.o;
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
import i6.AbstractC2829k;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import m4.C;
import m4.Q;
import m4.g0;
import m4.s0;
import m4.w0;
import p4.AbstractC3602a;

/* loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f9844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f9844a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m61invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m61invoke() {
            this.f9844a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9845a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9846b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9847c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f9848d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f9849e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9850f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z8, boolean z9, float f8, Function0 function0, int i8) {
            super(2);
            this.f9845a = str;
            this.f9846b = z8;
            this.f9847c = z9;
            this.f9848d = f8;
            this.f9849e = function0;
            this.f9850f = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            h.a(this.f9845a, this.f9846b, this.f9847c, this.f9848d, this.f9849e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9850f | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f9851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f9852b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f9853c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ U2.a f9854d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9855e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9856f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S2.b f9857g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ MutableState f9858h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9859i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ State f9860j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f9861a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MutableState mutableState) {
                super(0);
                this.f9861a = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m62invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m62invoke() {
                h.d(this.f9861a, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w0 w0Var, Q q8, w0 w0Var2, U2.a aVar, boolean z8, boolean z9, S2.b bVar, MutableState mutableState, FocusRequester focusRequester, State state) {
            super(3);
            this.f9851a = w0Var;
            this.f9852b = q8;
            this.f9853c = w0Var2;
            this.f9854d = aVar;
            this.f9855e = z8;
            this.f9856f = z9;
            this.f9857g = bVar;
            this.f9858h = mutableState;
            this.f9859i = focusRequester;
            this.f9860j = state;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195510504, i8, -1, "com.stripe.android.link.ui.inline.LinkFields.<anonymous> (LinkInlineSignup.kt:235)");
            }
            float f8 = 16;
            Modifier m604paddingqDBjuR0$default = PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, Dp.m5178constructorimpl(f8), 0.0f, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), 2, null);
            w0 w0Var = this.f9851a;
            Q q8 = this.f9852b;
            w0 w0Var2 = this.f9853c;
            U2.a aVar = this.f9854d;
            boolean z8 = this.f9855e;
            boolean z9 = this.f9856f;
            S2.b bVar = this.f9857g;
            MutableState mutableState = this.f9858h;
            FocusRequester focusRequester = this.f9859i;
            State state = this.f9860j;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m604paddingqDBjuR0$default);
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
            Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
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
            T2.g.a(valueOf, w0Var, q8, w0Var2, aVar, z8, false, z9, bVar, c8, (Function0) rememberedValue, null, focusRequester, null, null, composer, (Q.f35195s << 6) | 1577024, 0, 26624);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, aVar == U2.a.f11072c, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, T2.b.f9715a.a(), composer, 1572870, 30);
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
    public static final class d extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9863b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U2.a f9864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9865d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S2.b f9866e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f9867f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ w0 f9868g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Q f9869h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w0 f9870i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9871j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f9872k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, U2.a aVar, boolean z10, S2.b bVar, g0 g0Var, w0 w0Var, Q q8, w0 w0Var2, FocusRequester focusRequester, int i8) {
            super(2);
            this.f9862a = z8;
            this.f9863b = z9;
            this.f9864c = aVar;
            this.f9865d = z10;
            this.f9866e = bVar;
            this.f9867f = g0Var;
            this.f9868g = w0Var;
            this.f9869h = q8;
            this.f9870i = w0Var2;
            this.f9871j = focusRequester;
            this.f9872k = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            h.b(this.f9862a, this.f9863b, this.f9864c, this.f9865d, this.f9866e, this.f9867f, this.f9868g, this.f9869h, this.f9870i, this.f9871j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9872k | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9873a = new e();

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
    public static final class f extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f9875b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f9876c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, State state, P5.d dVar) {
            super(2, dVar);
            this.f9875b = function1;
            this.f9876c = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f9875b, this.f9876c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9874a == 0) {
                t.b(obj);
                this.f9875b.invoke(h.h(this.f9876c));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9877a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f9878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextInputService f9879c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f9880d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FocusManager focusManager, TextInputService textInputService, State state, P5.d dVar) {
            super(2, dVar);
            this.f9878b = focusManager;
            this.f9879c = textInputService;
            this.f9880d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f9878b, this.f9879c, this.f9880d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9877a == 0) {
                t.b(obj);
                if (h.h(this.f9880d).f() == U2.a.f11070a && h.h(this.f9880d).i() != null) {
                    this.f9878b.clearFocus(true);
                    TextInputService textInputService = this.f9879c;
                    if (textInputService != null) {
                        textInputService.hideSoftwareKeyboard();
                    }
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T2.h$h, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0219h extends C3156v implements Function0 {
        C0219h(Object obj) {
            super(0, obj, T2.c.class, "toggleExpanded", "toggleExpanded()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m63invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m63invoke() {
            ((T2.c) this.receiver).x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T2.c f9881a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9882b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f9883c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f9884d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9885e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9886f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(T2.c cVar, boolean z8, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f9881a = cVar;
            this.f9882b = z8;
            this.f9883c = function1;
            this.f9884d = modifier;
            this.f9885e = i8;
            this.f9886f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            h.f(this.f9881a, this.f9882b, this.f9883c, this.f9884d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9885e | 1), this.f9886f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9887a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9888b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9889c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z8, FocusRequester focusRequester, P5.d dVar) {
            super(2, dVar);
            this.f9888b = z8;
            this.f9889c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new j(this.f9888b, this.f9889c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9887a == 0) {
                t.b(obj);
                if (this.f9888b) {
                    this.f9889c.requestFocus();
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f9891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BringIntoViewRequester f9892c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f9893a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BringIntoViewRequester f9894b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BringIntoViewRequester bringIntoViewRequester, P5.d dVar) {
                super(2, dVar);
                this.f9894b = bringIntoViewRequester;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f9894b, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f9893a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    BringIntoViewRequester bringIntoViewRequester = this.f9894b;
                    this.f9893a = 1;
                    if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z8, M m8, BringIntoViewRequester bringIntoViewRequester) {
            super(1);
            this.f9890a = z8;
            this.f9891b = m8;
            this.f9892c = bringIntoViewRequester;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return I.f6487a;
        }

        public final void invoke(FocusState state) {
            AbstractC3159y.i(state, "state");
            if (state.getHasFocus() && this.f9890a) {
                AbstractC2829k.d(this.f9891b, null, null, new a(this.f9892c, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f9896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f9897c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q f9898d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f9899e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ U2.a f9900f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f9901g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9902h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9903i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ S2.b f9904j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0 f9905k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f9906l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f9907m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f9908n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f9909o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, g0 g0Var, w0 w0Var, Q q8, w0 w0Var2, U2.a aVar, boolean z8, boolean z9, boolean z10, S2.b bVar, Function0 function0, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f9895a = str;
            this.f9896b = g0Var;
            this.f9897c = w0Var;
            this.f9898d = q8;
            this.f9899e = w0Var2;
            this.f9900f = aVar;
            this.f9901g = z8;
            this.f9902h = z9;
            this.f9903i = z10;
            this.f9904j = bVar;
            this.f9905k = function0;
            this.f9906l = modifier;
            this.f9907m = i8;
            this.f9908n = i9;
            this.f9909o = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            h.g(this.f9895a, this.f9896b, this.f9897c, this.f9898d, this.f9899e, this.f9900f, this.f9901g, this.f9902h, this.f9903i, this.f9904j, this.f9905k, this.f9906l, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9907m | 1), RecomposeScopeImplKt.updateChangedFlags(this.f9908n), this.f9909o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str, boolean z8, boolean z9, float f8, Function0 function0, Composer composer, int i8) {
        int i9;
        boolean z10;
        TextStyle m4719copyv2rsoow;
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
            Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(ClickableKt.m315clickableXHw0xAI$default(companion, z9, null, null, (Function0) rememberedValue, 6, null), Dp.m5178constructorimpl(16));
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
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
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
            n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            AbstractC3602a.a(z8, null, PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5178constructorimpl(8), 0.0f, 11, null), z9, startRestartGroup, ((i9 >> 3) & 14) | 432 | ((i9 << 3) & 7168), 0);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl2 = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(K2.j.f5917a, startRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            m4719copyv2rsoow = r32.m4719copyv2rsoow((r48 & 1) != 0 ? r32.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r32.spanStyle.m4652getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r32.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (r48 & 8) != 0 ? r32.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r32.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r32.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r32.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r32.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r32.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r32.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r32.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r32.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r32.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r32.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r32.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(r32.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(r32.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r32.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r32.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r32.platformStyle : null, (r48 & 1048576) != 0 ? r32.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(r32.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(r32.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? materialTheme.getTypography(startRestartGroup, i15).getBody1().paragraphStyle.getTextMotion() : null);
            TextKt.m1414Text4IGK_g(stringResource, (Modifier) null, Color.m2970copywmQWz5c$default(materialTheme.getColors(startRestartGroup, i15).m1177getOnSurface0d7_KjU(), f8, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, m4719copyv2rsoow, startRestartGroup, 0, 0, 65530);
            TextKt.m1414Text4IGK_g(StringResources_androidKt.stringResource(K2.j.f5920d, new Object[]{str}, startRestartGroup, 64), PaddingKt.m604paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5178constructorimpl(4), 0.0f, 0.0f, 13, null), AbstractC3087m.n(materialTheme, startRestartGroup, i15).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i15).getBody1(), startRestartGroup, 48, 0, 65528);
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

    public static final void b(boolean z8, boolean z9, U2.a signUpState, boolean z10, S2.b bVar, g0 sectionController, w0 emailController, Q phoneNumberController, w0 nameController, FocusRequester emailFocusRequester, Composer composer, int i8) {
        AbstractC3159y.i(signUpState, "signUpState");
        AbstractC3159y.i(sectionController, "sectionController");
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(phoneNumberController, "phoneNumberController");
        AbstractC3159y.i(nameController, "nameController");
        AbstractC3159y.i(emailFocusRequester, "emailFocusRequester");
        Composer startRestartGroup = composer.startRestartGroup(1587095792);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1587095792, i8, -1, "com.stripe.android.link.ui.inline.LinkFields (LinkInlineSignup.kt:229)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(z8, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -195510504, true, new c(emailController, phoneNumberController, nameController, signUpState, z9, z10, bVar, (MutableState) RememberSaveableKt.m2583rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) e.f9873a, startRestartGroup, 3080, 6), emailFocusRequester, v4.f.a(sectionController.getError(), startRestartGroup, 8))), startRestartGroup, (i8 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
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

    public static final void f(T2.c viewModel, boolean z8, Function1 onStateChanged, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        AbstractC3159y.i(viewModel, "viewModel");
        AbstractC3159y.i(onStateChanged, "onStateChanged");
        Composer startRestartGroup = composer.startRestartGroup(762633745);
        if ((i9 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(762633745, i8, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:67)");
        }
        State a8 = v4.f.a(viewModel.s(), startRestartGroup, 8);
        State a9 = v4.f.a(viewModel.m(), startRestartGroup, 8);
        T2.e h8 = h(a8);
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
        EffectsKt.LaunchedEffect(h8, (n) rememberedValue, startRestartGroup, 72);
        EffectsKt.LaunchedEffect(h(a8).f(), new g((FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService()), a8, null), startRestartGroup, 64);
        String d8 = h(a8).d();
        g0 q8 = viewModel.q();
        s0 l8 = viewModel.l();
        Q o8 = viewModel.o();
        s0 n8 = viewModel.n();
        U2.a f8 = h(a8).f();
        boolean j8 = h(a8).j();
        boolean p8 = viewModel.p();
        S2.b i10 = i(a9);
        C0219h c0219h = new C0219h(viewModel);
        int i11 = g0.f35498c << 3;
        int i12 = s0.f35685x;
        g(d8, q8, l8, o8, n8, f8, z8, j8, p8, i10, c0219h, modifier2, startRestartGroup, i11 | (i12 << 6) | (Q.f35195s << 9) | (i12 << 12) | ((i8 << 15) & 3670016), (i8 >> 6) & 112, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(viewModel, z8, onStateChanged, modifier2, i8, i9));
        }
    }

    public static final void g(String merchantName, g0 sectionController, w0 emailController, Q phoneNumberController, w0 nameController, U2.a signUpState, boolean z8, boolean z9, boolean z10, S2.b bVar, Function0 toggleExpanded, Modifier modifier, Composer composer, int i8, int i9, int i10) {
        float disabled;
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(sectionController, "sectionController");
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(phoneNumberController, "phoneNumberController");
        AbstractC3159y.i(nameController, "nameController");
        AbstractC3159y.i(signUpState, "signUpState");
        AbstractC3159y.i(toggleExpanded, "toggleExpanded");
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
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(P5.h.f7994a, startRestartGroup));
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
        EffectsKt.LaunchedEffect(valueOf, (n) rememberedValue4, startRestartGroup, i11 | 64);
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
        Modifier bringIntoViewRequester2 = BringIntoViewRequesterKt.bringIntoViewRequester(FocusEventModifierKt.onFocusEvent(BackgroundKt.m281backgroundbw27NRU(BorderKt.border(modifier2, AbstractC3087m.e(materialTheme, false, startRestartGroup, i12 | 48), AbstractC3087m.o(materialTheme, startRestartGroup, i12).f()), AbstractC3087m.n(materialTheme, startRestartGroup, i12).d(), AbstractC3087m.o(materialTheme, startRestartGroup, i12).f()), new k(z9, coroutineScope, bringIntoViewRequester)), bringIntoViewRequester);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(bringIntoViewRequester2);
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier alpha = AlphaKt.alpha(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AbstractC3087m.o(materialTheme, startRestartGroup, i12).f()), f8);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion3.getConstructor();
        o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(alpha);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2496constructorimpl2 = Updater.m2496constructorimpl(startRestartGroup);
        Updater.m2503setimpl(m2496constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        a(merchantName, z9, z8, f8, toggleExpanded, startRestartGroup, (i8 & 14) | ((i8 >> 18) & 112) | ((i8 >> 12) & 896) | ((i9 << 12) & 57344));
        int i13 = i8 >> 15;
        int i14 = 941621248 | i11 | (i13 & 112) | ((i8 >> 9) & 896) | (i13 & 7168) | (i13 & 57344) | (g0.f35498c << 15);
        int i15 = i8 << 12;
        b(z9, z8, signUpState, z10, bVar, sectionController, emailController, phoneNumberController, nameController, focusRequester, startRestartGroup, i14 | (458752 & i15) | (Q.f35195s << 21) | (i15 & 29360128));
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
    public static final T2.e h(State state) {
        return (T2.e) state.getValue();
    }

    private static final S2.b i(State state) {
        return (S2.b) state.getValue();
    }
}
