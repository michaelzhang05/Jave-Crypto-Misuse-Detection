package W2;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import j6.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.B0;
import l6.M;
import m4.AbstractC3441m;
import p4.C;
import p4.C0;
import p4.Q;
import p4.g0;
import p4.s0;
import p4.w0;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11567a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "CircularProgressIndicator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11568a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11570c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusRequester f11571a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FocusRequester focusRequester) {
                super(1);
                this.f11571a = focusRequester;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8278a;
            }

            public final void invoke(Throwable th) {
                this.f11571a.requestFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusRequester focusRequester, S5.d dVar) {
            super(2, dVar);
            this.f11570c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(this.f11570c, dVar);
            bVar.f11569b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f11568a == 0) {
                t.b(obj);
                B0.l(((M) this.f11569b).getCoroutineContext()).s(new a(this.f11570c));
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11572a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f11573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X2.a f11574c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11575d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11576e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f11577f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f11578g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f11579h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11580i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, w0 w0Var, X2.a aVar, int i8, FocusRequester focusRequester, boolean z9, InterfaceC1668n interfaceC1668n, int i9, int i10) {
            super(2);
            this.f11572a = z8;
            this.f11573b = w0Var;
            this.f11574c = aVar;
            this.f11575d = i8;
            this.f11576e = focusRequester;
            this.f11577f = z9;
            this.f11578g = interfaceC1668n;
            this.f11579h = i9;
            this.f11580i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f11572a, this.f11573b, this.f11574c, this.f11575d, this.f11576e, this.f11577f, this.f11578g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11579h | 1), this.f11580i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f11581a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, "LinkLogoIcon");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11582a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i8) {
            super(2);
            this.f11582a = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.f11582a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f11584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f11585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, State state, S5.d dVar) {
            super(2, dVar);
            this.f11584b = function1;
            this.f11585c = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f11584b, this.f11585c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f11583a == 0) {
                t.b(obj);
                this.f11584b.invoke(i.e(this.f11585c));
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
        int f11586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f11587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextInputService f11588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f11589d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FocusManager focusManager, TextInputService textInputService, State state, S5.d dVar) {
            super(2, dVar);
            this.f11587b = focusManager;
            this.f11588c = textInputService;
            this.f11589d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f11587b, this.f11588c, this.f11589d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f11586a == 0) {
                t.b(obj);
                if (i.e(this.f11589d).f() == X2.a.f12741a && i.e(this.f11589d).i() != null) {
                    this.f11587b.clearFocus(true);
                    TextInputService textInputService = this.f11588c;
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
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W2.c f11590a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11591b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f11592c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f11593d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11594e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11595f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(W2.c cVar, boolean z8, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f11590a = cVar;
            this.f11591b = z8;
            this.f11592c = function1;
            this.f11593d = modifier;
            this.f11594e = i8;
            this.f11595f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.c(this.f11590a, this.f11591b, this.f11592c, this.f11593d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11594e | 1), this.f11595f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W2.i$i, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0245i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BringIntoViewRequester f11597b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f11598c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11599d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11600e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11601f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f11602g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f11603h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0245i(BringIntoViewRequester bringIntoViewRequester, w0 w0Var, boolean z8, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, boolean z9, S5.d dVar) {
            super(2, dVar);
            this.f11597b = bringIntoViewRequester;
            this.f11598c = w0Var;
            this.f11599d = z8;
            this.f11600e = focusRequester;
            this.f11601f = focusRequester2;
            this.f11602g = focusRequester3;
            this.f11603h = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0245i(this.f11597b, this.f11598c, this.f11599d, this.f11600e, this.f11601f, this.f11602g, this.f11603h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Object e8 = T5.b.e();
            int i8 = this.f11596a;
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
                BringIntoViewRequester bringIntoViewRequester = this.f11597b;
                this.f11596a = 1;
                if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                    return e8;
                }
            }
            String s8 = this.f11598c.s();
            if (s8 != null && !n.u(s8)) {
                z8 = false;
            } else {
                z8 = true;
            }
            String s9 = this.f11598c.s();
            if (s9 != null && !n.u(s9)) {
                z9 = false;
            }
            boolean z10 = this.f11599d;
            if (z10 && z8) {
                focusRequester = this.f11600e;
            } else if (!z10 && z9) {
                focusRequester = this.f11601f;
            } else {
                FocusRequester focusRequester2 = this.f11602g;
                if (this.f11603h) {
                    focusRequester = focusRequester2;
                }
            }
            if (focusRequester != null) {
                focusRequester.requestFocus();
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0245i) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f11604a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState) {
            super(0);
            this.f11604a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m69invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69invoke() {
            i.h(this.f11604a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f11605a = new k();

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
    public static final class l extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f11606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f11607b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f11608c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f11609d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f11610e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X2.a f11611f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11612g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f11613h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ V2.b f11614i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f11615j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11616k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11617l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(g0 g0Var, w0 w0Var, Q q8, w0 w0Var2, boolean z8, X2.a aVar, boolean z9, boolean z10, V2.b bVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f11606a = g0Var;
            this.f11607b = w0Var;
            this.f11608c = q8;
            this.f11609d = w0Var2;
            this.f11610e = z8;
            this.f11611f = aVar;
            this.f11612g = z9;
            this.f11613h = z10;
            this.f11614i = bVar;
            this.f11615j = modifier;
            this.f11616k = i8;
            this.f11617l = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.d(this.f11606a, this.f11607b, this.f11608c, this.f11609d, this.f11610e, this.f11611f, this.f11612g, this.f11613h, this.f11614i, this.f11615j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11616k | 1), this.f11617l);
        }
    }

    public static final void a(boolean z8, w0 emailController, X2.a signUpState, int i8, FocusRequester focusRequester, boolean z9, InterfaceC1668n interfaceC1668n, Composer composer, int i9, int i10) {
        FocusRequester focusRequester2;
        boolean z10;
        InterfaceC1668n interfaceC1668n2;
        S5.d dVar;
        boolean z11;
        AbstractC3255y.i(emailController, "emailController");
        AbstractC3255y.i(signUpState, "signUpState");
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
            interfaceC1668n2 = null;
        } else {
            interfaceC1668n2 = interfaceC1668n;
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        C0.c(emailController, z8, i8, FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.e.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), focusRequester2), null, 0, 0, null, startRestartGroup, ((i9 << 3) & 112) | 8 | ((i9 >> 3) & 896), PsExtractor.VIDEO_STREAM_MASK);
        startRestartGroup.startReplaceableGroup(-1293866320);
        if (signUpState == X2.a.f12742b) {
            float f8 = 8;
            z11 = true;
            dVar = null;
            e4.d.a(SemanticsModifierKt.semantics$default(PaddingKt.m608paddingqDBjuR0(SizeKt.m652size3ABfNKs(companion, Dp.m5183constructorimpl(32)), Dp.m5183constructorimpl(0), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(16), Dp.m5183constructorimpl(f8)), false, a.f11567a, 1, null), MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1183getPrimary0d7_KjU(), Dp.m5183constructorimpl(2), 0L, 0, startRestartGroup, 384, 24);
        } else {
            dVar = null;
            z11 = true;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1293851067);
        if (interfaceC1668n2 != null) {
            interfaceC1668n2.invoke(startRestartGroup, Integer.valueOf((i9 >> 18) & 14));
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (z10) {
            I i11 = I.f8278a;
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
            EffectsKt.LaunchedEffect(i11, (InterfaceC1668n) rememberedValue2, startRestartGroup, 70);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, emailController, signUpState, i8, focusRequester2, z10, interfaceC1668n2, i9, i10));
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
            if (AbstractC3441m.s(AbstractC3441m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).d())) {
                i9 = N2.i.f7694b;
            } else {
                i9 = N2.i.f7695c;
            }
            IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(i9, startRestartGroup, 0), StringResources_androidKt.stringResource(N2.j.f7697b, startRestartGroup, 0), SemanticsModifierKt.semantics$default(PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m5183constructorimpl(16), 0.0f, 11, null), false, d.f11581a, 1, null), Color.Companion.m3012getUnspecified0d7_KjU(), startRestartGroup, 3080, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(i8));
        }
    }

    public static final void c(W2.c viewModel, boolean z8, Function1 onStateChanged, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        AbstractC3255y.i(viewModel, "viewModel");
        AbstractC3255y.i(onStateChanged, "onStateChanged");
        Composer startRestartGroup = composer.startRestartGroup(-1868616687);
        if ((i9 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1868616687, i8, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:61)");
        }
        State a8 = y4.f.a(viewModel.s(), startRestartGroup, 8);
        State a9 = y4.f.a(viewModel.m(), startRestartGroup, 8);
        W2.e e8 = e(a8);
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
        EffectsKt.LaunchedEffect(e8, (InterfaceC1668n) rememberedValue, startRestartGroup, 72);
        EffectsKt.LaunchedEffect(e(a8).f(), new g((FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService()), a8, null), startRestartGroup, 64);
        g0 q8 = viewModel.q();
        s0 l8 = viewModel.l();
        Q o8 = viewModel.o();
        s0 n8 = viewModel.n();
        X2.a f8 = e(a8).f();
        boolean l9 = e(a8).l();
        boolean p8 = viewModel.p();
        V2.b f9 = f(a9);
        int i10 = g0.f37524c;
        int i11 = s0.f37711x;
        d(q8, l8, o8, n8, l9, f8, z8, p8, f9, modifier2, startRestartGroup, i10 | (i11 << 3) | (Q.f37221s << 6) | (i11 << 9) | ((i8 << 15) & 3670016) | ((i8 << 18) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h(viewModel, z8, onStateChanged, modifier2, i8, i9));
        }
    }

    public static final void d(g0 sectionController, w0 emailController, Q phoneNumberController, w0 nameController, boolean z8, X2.a signUpState, boolean z9, boolean z10, V2.b bVar, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        MutableState mutableState;
        Composer composer2;
        Integer num;
        AbstractC3255y.i(sectionController, "sectionController");
        AbstractC3255y.i(emailController, "emailController");
        AbstractC3255y.i(phoneNumberController, "phoneNumberController");
        AbstractC3255y.i(nameController, "nameController");
        AbstractC3255y.i(signUpState, "signUpState");
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m2588rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) k.f11605a, startRestartGroup, 3080, 6);
        State a8 = y4.f.a(sectionController.getError(), startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(726224087);
        if (signUpState == X2.a.f12743c) {
            mutableState = mutableState2;
            composer2 = startRestartGroup;
            EffectsKt.LaunchedEffect(signUpState, new C0245i(bringIntoViewRequester, emailController, z8, focusRequester, focusRequester2, focusRequester3, z10, null), composer2, ((i8 >> 15) & 14) | 64);
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
        W2.g.a(num, emailController, phoneNumberController, nameController, signUpState, z9, z8, z10, bVar, g8, (Function0) rememberedValue5, null, focusRequester, focusRequester2, focusRequester3, composer3, (Q.f37221s << 6) | 4160 | (i8 & 896) | (57344 & i11) | (i11 & 458752) | ((i8 << 6) & 3670016) | (29360128 & i8) | (234881024 & i8), 28032, 2048);
        V2.g.a(true, z8, BringIntoViewRequesterKt.bringIntoViewRequester(PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5183constructorimpl(8), 0.0f, 0.0f, 13, null), bringIntoViewRequester), TextAlign.Companion.m5092getStarte0LSkKk(), composer3, ((i8 >> 9) & 112) | 6, 0);
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
    public static final W2.e e(State state) {
        return (W2.e) state.getValue();
    }

    private static final V2.b f(State state) {
        return (V2.b) state.getValue();
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
