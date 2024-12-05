package T2;

import L5.I;
import L5.t;
import X5.n;
import X5.o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import i6.B0;
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.C;
import m4.C0;
import m4.Q;
import m4.g0;
import m4.s0;
import m4.w0;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9910a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "CircularProgressIndicator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9911a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9913c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusRequester f9914a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FocusRequester focusRequester) {
                super(1);
                this.f9914a = focusRequester;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f6487a;
            }

            public final void invoke(Throwable th) {
                this.f9914a.requestFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusRequester focusRequester, P5.d dVar) {
            super(2, dVar);
            this.f9913c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(this.f9913c, dVar);
            bVar.f9912b = obj;
            return bVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9911a == 0) {
                t.b(obj);
                B0.l(((M) this.f9912b).getCoroutineContext()).u(new a(this.f9913c));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9915a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f9916b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U2.a f9917c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9918d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9919e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9920f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f9921g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9922h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9923i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, w0 w0Var, U2.a aVar, int i8, FocusRequester focusRequester, boolean z9, n nVar, int i9, int i10) {
            super(2);
            this.f9915a = z8;
            this.f9916b = w0Var;
            this.f9917c = aVar;
            this.f9918d = i8;
            this.f9919e = focusRequester;
            this.f9920f = z9;
            this.f9921g = nVar;
            this.f9922h = i9;
            this.f9923i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f9915a, this.f9916b, this.f9917c, this.f9918d, this.f9919e, this.f9920f, this.f9921g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9922h | 1), this.f9923i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9924a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "LinkLogoIcon");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i8) {
            super(2);
            this.f9925a = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.f9925a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9926a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f9927b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f9928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, State state, P5.d dVar) {
            super(2, dVar);
            this.f9927b = function1;
            this.f9928c = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f9927b, this.f9928c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9926a == 0) {
                t.b(obj);
                this.f9927b.invoke(i.e(this.f9928c));
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f9930b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextInputService f9931c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f9932d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FocusManager focusManager, TextInputService textInputService, State state, P5.d dVar) {
            super(2, dVar);
            this.f9930b = focusManager;
            this.f9931c = textInputService;
            this.f9932d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f9930b, this.f9931c, this.f9932d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9929a == 0) {
                t.b(obj);
                if (i.e(this.f9932d).f() == U2.a.f11070a && i.e(this.f9932d).i() != null) {
                    this.f9930b.clearFocus(true);
                    TextInputService textInputService = this.f9931c;
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
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ T2.c f9933a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9934b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f9935c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f9936d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9937e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9938f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(T2.c cVar, boolean z8, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f9933a = cVar;
            this.f9934b = z8;
            this.f9935c = function1;
            this.f9936d = modifier;
            this.f9937e = i8;
            this.f9938f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            i.c(this.f9933a, this.f9934b, this.f9935c, this.f9936d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9937e | 1), this.f9938f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T2.i$i, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0220i extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f9939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BringIntoViewRequester f9940b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f9941c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9942d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9943e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9944f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f9945g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9946h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0220i(BringIntoViewRequester bringIntoViewRequester, w0 w0Var, boolean z8, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, boolean z9, P5.d dVar) {
            super(2, dVar);
            this.f9940b = bringIntoViewRequester;
            this.f9941c = w0Var;
            this.f9942d = z8;
            this.f9943e = focusRequester;
            this.f9944f = focusRequester2;
            this.f9945g = focusRequester3;
            this.f9946h = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0220i(this.f9940b, this.f9941c, this.f9942d, this.f9943e, this.f9944f, this.f9945g, this.f9946h, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0220i) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Object e8 = Q5.b.e();
            int i8 = this.f9939a;
            FocusRequester focusRequester = null;
            boolean z9 = true;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                BringIntoViewRequester bringIntoViewRequester = this.f9940b;
                this.f9939a = 1;
                if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                    return e8;
                }
            }
            String s8 = this.f9941c.s();
            if (s8 != null && !g6.n.u(s8)) {
                z8 = false;
            } else {
                z8 = true;
            }
            String s9 = this.f9941c.s();
            if (s9 != null && !g6.n.u(s9)) {
                z9 = false;
            }
            boolean z10 = this.f9942d;
            if (z10 && z8) {
                focusRequester = this.f9943e;
            } else if (!z10 && z9) {
                focusRequester = this.f9944f;
            } else {
                FocusRequester focusRequester2 = this.f9945g;
                if (this.f9946h) {
                    focusRequester = focusRequester2;
                }
            }
            if (focusRequester != null) {
                focusRequester.requestFocus();
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f9947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState) {
            super(0);
            this.f9947a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m64invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m64invoke() {
            i.h(this.f9947a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f9948a = new k();

        k() {
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
    public static final class l extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f9949a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f9950b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f9951c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f9952d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9953e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ U2.a f9954f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f9955g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9956h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ S2.b f9957i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f9958j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f9959k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f9960l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(g0 g0Var, w0 w0Var, Q q8, w0 w0Var2, boolean z8, U2.a aVar, boolean z9, boolean z10, S2.b bVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f9949a = g0Var;
            this.f9950b = w0Var;
            this.f9951c = q8;
            this.f9952d = w0Var2;
            this.f9953e = z8;
            this.f9954f = aVar;
            this.f9955g = z9;
            this.f9956h = z10;
            this.f9957i = bVar;
            this.f9958j = modifier;
            this.f9959k = i8;
            this.f9960l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            i.d(this.f9949a, this.f9950b, this.f9951c, this.f9952d, this.f9953e, this.f9954f, this.f9955g, this.f9956h, this.f9957i, this.f9958j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9959k | 1), this.f9960l);
        }
    }

    public static final void a(boolean z8, w0 emailController, U2.a signUpState, int i8, FocusRequester focusRequester, boolean z9, n nVar, Composer composer, int i9, int i10) {
        FocusRequester focusRequester2;
        boolean z10;
        n nVar2;
        P5.d dVar;
        boolean z11;
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(signUpState, "signUpState");
        Composer startRestartGroup = composer.startRestartGroup(1243429650);
        if ((i10 & 16) != 0) {
            startRestartGroup.startReplaceableGroup(-1492093893);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            focusRequester2 = (FocusRequester) rememberedValue;
        } else {
            focusRequester2 = focusRequester;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        } else {
            z10 = z9;
        }
        if ((i10 & 64) != 0) {
            nVar2 = null;
        } else {
            nVar2 = nVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243429650, i9, -1, "com.stripe.android.link.ui.inline.EmailCollection (LinkOptionalInlineSignup.kt:173)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        C0.c(emailController, z8, i8, FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.e.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), focusRequester2), null, 0, 0, null, startRestartGroup, ((i9 << 3) & 112) | 8 | ((i9 >> 3) & 896), PsExtractor.VIDEO_STREAM_MASK);
        startRestartGroup.startReplaceableGroup(-1293866320);
        if (signUpState == U2.a.f11071b) {
            float f8 = 8;
            z11 = true;
            dVar = null;
            b4.d.a(SemanticsModifierKt.semantics$default(PaddingKt.m603paddingqDBjuR0(SizeKt.m647size3ABfNKs(companion, Dp.m5178constructorimpl(32)), Dp.m5178constructorimpl(0), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(16), Dp.m5178constructorimpl(f8)), false, a.f9910a, 1, null), MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1178getPrimary0d7_KjU(), Dp.m5178constructorimpl(2), 0L, 0, startRestartGroup, 384, 24);
        } else {
            dVar = null;
            z11 = true;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1293851067);
        if (nVar2 != null) {
            nVar2.invoke(startRestartGroup, Integer.valueOf((i9 >> 18) & 14));
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (z10) {
            I i11 = I.f6487a;
            startRestartGroup.startReplaceableGroup(-1492059269);
            if ((((57344 & i9) ^ 24576) <= 16384 || !startRestartGroup.changed(focusRequester2)) && (i9 & 24576) != 16384) {
                z11 = false;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(focusRequester2, dVar);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(i11, (n) rememberedValue2, startRestartGroup, 70);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, emailController, signUpState, i8, focusRequester2, z10, nVar2, i9, i10));
        }
    }

    public static final void b(Composer composer, int i8) {
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-2039774832);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2039774832, i8, -1, "com.stripe.android.link.ui.inline.LinkLogo (LinkOptionalInlineSignup.kt:213)");
            }
            if (AbstractC3087m.s(AbstractC3087m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).d())) {
                i9 = K2.i.f5915b;
            } else {
                i9 = K2.i.f5916c;
            }
            IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(i9, startRestartGroup, 0), StringResources_androidKt.stringResource(K2.j.f5918b, startRestartGroup, 0), SemanticsModifierKt.semantics$default(PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m5178constructorimpl(16), 0.0f, 11, null), false, d.f9924a, 1, null), Color.Companion.m3007getUnspecified0d7_KjU(), startRestartGroup, 3080, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(i8));
        }
    }

    public static final void c(T2.c viewModel, boolean z8, Function1 onStateChanged, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        AbstractC3159y.i(viewModel, "viewModel");
        AbstractC3159y.i(onStateChanged, "onStateChanged");
        Composer startRestartGroup = composer.startRestartGroup(-1868616687);
        if ((i9 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1868616687, i8, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:61)");
        }
        State a8 = v4.f.a(viewModel.s(), startRestartGroup, 8);
        State a9 = v4.f.a(viewModel.m(), startRestartGroup, 8);
        T2.e e8 = e(a8);
        startRestartGroup.startReplaceableGroup(-233533584);
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
        EffectsKt.LaunchedEffect(e8, (n) rememberedValue, startRestartGroup, 72);
        EffectsKt.LaunchedEffect(e(a8).f(), new g((FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService()), a8, null), startRestartGroup, 64);
        g0 q8 = viewModel.q();
        s0 l8 = viewModel.l();
        Q o8 = viewModel.o();
        s0 n8 = viewModel.n();
        U2.a f8 = e(a8).f();
        boolean l9 = e(a8).l();
        boolean p8 = viewModel.p();
        S2.b f9 = f(a9);
        int i10 = g0.f35498c;
        int i11 = s0.f35685x;
        d(q8, l8, o8, n8, l9, f8, z8, p8, f9, modifier2, startRestartGroup, i10 | (i11 << 3) | (Q.f35195s << 6) | (i11 << 9) | ((i8 << 15) & 3670016) | ((i8 << 18) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h(viewModel, z8, onStateChanged, modifier2, i8, i9));
        }
    }

    public static final void d(g0 sectionController, w0 emailController, Q phoneNumberController, w0 nameController, boolean z8, U2.a signUpState, boolean z9, boolean z10, S2.b bVar, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        MutableState mutableState;
        Composer composer2;
        Integer num;
        AbstractC3159y.i(sectionController, "sectionController");
        AbstractC3159y.i(emailController, "emailController");
        AbstractC3159y.i(phoneNumberController, "phoneNumberController");
        AbstractC3159y.i(nameController, "nameController");
        AbstractC3159y.i(signUpState, "signUpState");
        Composer startRestartGroup = composer.startRestartGroup(-198300985);
        if ((i9 & 512) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198300985, i8, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:107)");
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(726211115);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = BringIntoViewRequesterKt.BringIntoViewRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726213411);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726215459);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        FocusRequester focusRequester2 = (FocusRequester) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(726217475);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        FocusRequester focusRequester3 = (FocusRequester) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m2583rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) k.f9948a, startRestartGroup, 3080, 6);
        State a8 = v4.f.a(sectionController.getError(), startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(726224087);
        if (signUpState == U2.a.f11072c) {
            mutableState = mutableState2;
            composer2 = startRestartGroup;
            EffectsKt.LaunchedEffect(signUpState, new C0220i(bringIntoViewRequester, emailController, z8, focusRequester, focusRequester2, focusRequester3, z10, null), composer2, ((i8 >> 15) & 14) | 64);
        } else {
            mutableState = mutableState2;
            composer2 = startRestartGroup;
        }
        composer2.endReplaceableGroup();
        C i10 = i(a8);
        if (i10 != null) {
            num = Integer.valueOf(i10.a());
        } else {
            num = null;
        }
        boolean g8 = g(mutableState);
        composer2.startReplaceableGroup(726270241);
        MutableState mutableState3 = mutableState;
        boolean changed = composer2.changed(mutableState3);
        Object rememberedValue5 = composer2.rememberedValue();
        if (changed || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new j(mutableState3);
            composer2.updateRememberedValue(rememberedValue5);
        }
        composer2.endReplaceableGroup();
        int i11 = i8 >> 3;
        Composer composer3 = composer2;
        T2.g.a(num, emailController, phoneNumberController, nameController, signUpState, z9, z8, z10, bVar, g8, (Function0) rememberedValue5, null, focusRequester, focusRequester2, focusRequester3, composer3, (Q.f35195s << 6) | 4160 | (i8 & 896) | (57344 & i11) | (i11 & 458752) | ((i8 << 6) & 3670016) | (29360128 & i8) | (234881024 & i8), 28032, 2048);
        S2.g.a(true, z8, BringIntoViewRequesterKt.bringIntoViewRequester(PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5178constructorimpl(8), 0.0f, 0.0f, 13, null), bringIntoViewRequester), TextAlign.Companion.m5087getStarte0LSkKk(), composer3, ((i8 >> 9) & 112) | 6, 0);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(sectionController, emailController, phoneNumberController, nameController, z8, signUpState, z9, z10, bVar, modifier2, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T2.e e(State state) {
        return (T2.e) state.getValue();
    }

    private static final S2.b f(State state) {
        return (S2.b) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean g(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final C i(State state) {
        return (C) state.getValue();
    }
}
