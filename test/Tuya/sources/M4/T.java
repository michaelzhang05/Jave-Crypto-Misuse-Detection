package m4;

import M5.AbstractC1246t;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import i6.AbstractC2829k;
import j4.AbstractC3081g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import u4.AbstractC3804a;

/* loaded from: classes4.dex */
public abstract class T {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f35236a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35237b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35238c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Q q8, boolean z8, int i8) {
            super(2);
            this.f35236a = q8;
            this.f35237b = z8;
            this.f35238c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            T.a(this.f35236a, this.f35237b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35238c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f35239a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusManager focusManager) {
            super(1);
            this.f35239a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3159y.i($receiver, "$this$$receiver");
            this.f35239a.clearFocus(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f35240a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusManager focusManager) {
            super(1);
            this.f35240a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3159y.i($receiver, "$this$$receiver");
            this.f35240a.mo2667moveFocus3ESFkO8(FocusDirection.Companion.m2662getNextdhqQ8s());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f35241a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f35243c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusRequester f35244a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FocusRequester focusRequester) {
                super(1);
                this.f35244a = focusRequester;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return L5.I.f6487a;
            }

            public final void invoke(Throwable th) {
                this.f35244a.requestFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FocusRequester focusRequester, P5.d dVar) {
            super(2, dVar);
            this.f35243c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(this.f35243c, dVar);
            dVar2.f35242b = obj;
            return dVar2;
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f35241a == 0) {
                L5.t.b(obj);
                i6.B0.l(((i6.M) this.f35242b).getCoroutineContext()).u(new a(this.f35243c));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f35246b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f35247c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.n f35248d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f35249e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f35250f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FocusRequester f35251g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ X5.n f35252h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35253i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f35254j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f35255k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, Q q8, Modifier modifier, X5.n nVar, boolean z9, boolean z10, FocusRequester focusRequester, X5.n nVar2, int i8, int i9, int i10) {
            super(2);
            this.f35245a = z8;
            this.f35246b = q8;
            this.f35247c = modifier;
            this.f35248d = nVar;
            this.f35249e = z9;
            this.f35250f = z10;
            this.f35251g = focusRequester;
            this.f35252h = nVar2;
            this.f35253i = i8;
            this.f35254j = i9;
            this.f35255k = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            T.b(this.f35245a, this.f35246b, this.f35247c, this.f35248d, this.f35249e, this.f35250f, this.f35251g, this.f35252h, this.f35253i, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35254j | 1), this.f35255k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f35256a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35257b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Q q8, boolean z8) {
            super(2);
            this.f35256a = q8;
            this.f35257b = z8;
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
                ComposerKt.traceEventStart(2105213479, i8, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:107)");
            }
            T.a(this.f35256a, this.f35257b, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f35258a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f35259b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f35260c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MutableState f35261d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FocusManager focusManager, State state, MutableState mutableState, P5.d dVar) {
            super(2, dVar);
            this.f35259b = focusManager;
            this.f35260c = state;
            this.f35261d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f35259b, this.f35260c, this.f35261d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f35258a == 0) {
                L5.t.b(obj);
                if (T.h(this.f35260c) && T.e(this.f35261d)) {
                    this.f35259b.mo2667moveFocus3ESFkO8(FocusDirection.Companion.m2662getNextdhqQ8s());
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class h extends C3156v implements Function1 {
        h(Object obj) {
            super(1, obj, Q.class, "onValueChange", "onValueChange(Ljava/lang/String;)V", 0);
        }

        public final void d(String p02) {
            AbstractC3159y.i(p02, "p0");
            ((Q) this.receiver).E(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((String) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends C3156v implements Function1 {
        i(Object obj) {
            super(1, obj, Q.class, "onValueChange", "onValueChange(Ljava/lang/String;)V", 0);
        }

        public final void d(String p02) {
            AbstractC3159y.i(p02, "p0");
            ((Q) this.receiver).E(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((String) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i6.M f35262a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BringIntoViewRequester f35263b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f35264a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BringIntoViewRequester f35265b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BringIntoViewRequester bringIntoViewRequester, P5.d dVar) {
                super(2, dVar);
                this.f35265b = bringIntoViewRequester;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f35265b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f35264a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    BringIntoViewRequester bringIntoViewRequester = this.f35265b;
                    this.f35264a = 1;
                    if (androidx.compose.foundation.relocation.a.a(bringIntoViewRequester, null, this, 1, null) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(i6.M m8, BringIntoViewRequester bringIntoViewRequester) {
            super(1);
            this.f35262a = m8;
            this.f35263b = bringIntoViewRequester;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return L5.I.f6487a;
        }

        public final void invoke(FocusState it) {
            AbstractC3159y.i(it, "it");
            if (it.isFocused()) {
                AbstractC2829k.d(this.f35262a, null, null, new a(this.f35263b, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f35266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f35267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Q q8, MutableState mutableState) {
            super(1);
            this.f35266a = q8;
            this.f35267b = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return L5.I.f6487a;
        }

        public final void invoke(FocusState it) {
            AbstractC3159y.i(it, "it");
            if (T.e(this.f35267b) != it.isFocused()) {
                this.f35266a.i(it.isFocused());
            }
            T.f(this.f35267b, it.isFocused());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f35268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f35269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Q q8, State state) {
            super(2);
            this.f35268a = q8;
            this.f35269b = state;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            String stringResource;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1058478728, i8, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:160)");
            }
            if (this.f35268a.u()) {
                composer.startReplaceableGroup(-99929277);
                stringResource = StringResources_androidKt.stringResource(AbstractC3081g.f33183E, new Object[]{StringResources_androidKt.stringResource(T.j(this.f35269b), composer, 0)}, composer, 64);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-99744610);
                stringResource = StringResources_androidKt.stringResource(T.j(this.f35269b), composer, 0);
                composer.endReplaceableGroup();
            }
            E.a(stringResource, null, false, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f35270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(State state) {
            super(2);
            this.f35270a = state;
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
                ComposerKt.traceEventStart(573533479, i8, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:172)");
            }
            TextKt.m1414Text4IGK_g(T.c(this.f35270a), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f35271a = new n();

        n() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Q q8, boolean z8, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1587728102);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1587728102, i8, -1, "com.stripe.android.uicore.elements.CountryDropdown (PhoneNumberElementUI.kt:206)");
        }
        AbstractC3435z.a(q8.y(), z8, PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, Dp.m5178constructorimpl(16), 0.0f, Dp.m5178constructorimpl(8), 0.0f, 10, null), false, startRestartGroup, (i8 & 112) | 392, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(q8, z8, i8));
        }
    }

    public static final void b(boolean z8, Q controller, Modifier modifier, X5.n nVar, boolean z9, boolean z10, FocusRequester focusRequester, X5.n nVar2, int i8, Composer composer, int i9, int i10) {
        Modifier modifier2;
        X5.n nVar3;
        boolean z11;
        boolean z12;
        FocusRequester focusRequester2;
        X5.n nVar4;
        int i11;
        boolean z13;
        boolean z14;
        AbstractC3159y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(1282164908);
        if ((i10 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i10 & 8) != 0) {
            nVar3 = ComposableLambdaKt.composableLambda(startRestartGroup, 2105213479, true, new f(controller, z8));
        } else {
            nVar3 = nVar;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z9;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i10 & 64) != 0) {
            startRestartGroup.startReplaceableGroup(304087845);
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
        if ((i10 & 128) != 0) {
            nVar4 = null;
        } else {
            nVar4 = nVar2;
        }
        if ((i10 & 256) != 0) {
            i11 = ImeAction.Companion.m4868getDoneeUduSuo();
        } else {
            i11 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1282164908, i9, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI (PhoneNumberElementUI.kt:113)");
        }
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(P5.h.f7994a, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        i6.M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(304094669);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = BringIntoViewRequesterKt.BringIntoViewRequester();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        State a8 = v4.f.a(controller.k(), startRestartGroup, 8);
        State a9 = v4.f.a(controller.t(), startRestartGroup, 8);
        State a10 = v4.f.a(controller.getError(), startRestartGroup, 8);
        State a11 = v4.f.a(controller.b(), startRestartGroup, 8);
        State a12 = v4.f.a(controller.C(), startRestartGroup, 8);
        State a13 = v4.f.a(controller.D(), startRestartGroup, 8);
        if (i(a10) != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        TextFieldColors d8 = C0.d(z13, startRestartGroup, 0, 0);
        MutableState mutableState = (MutableState) RememberSaveableKt.m2583rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) n.f35271a, startRestartGroup, 3080, 6);
        startRestartGroup.startReplaceableGroup(304113619);
        if (z12) {
            z14 = z12;
            EffectsKt.LaunchedEffect(Boolean.valueOf(h(a9)), new g(focusManager, a9, mutableState, null), startRestartGroup, 64);
        } else {
            z14 = z12;
        }
        startRestartGroup.endReplaceableGroup();
        String g8 = g(a8);
        h hVar = new h(controller);
        boolean z15 = z11;
        FocusRequester focusRequester3 = focusRequester2;
        Modifier testTag = TestTagKt.testTag(FocusChangedModifierKt.onFocusChanged(FocusEventModifierKt.onFocusEvent(AbstractC3804a.a(FocusRequesterModifierKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), bringIntoViewRequester), focusRequester2), AbstractC1246t.e(AutofillType.PhoneNumberNational), new i(controller), startRestartGroup, 48), new j(coroutineScope, bringIntoViewRequester)), new k(controller, mutableState)), "PhoneNumberTextField");
        l lVar = new l(controller, a11);
        boolean z16 = true;
        TextFieldKt.TextField(g8, (Function1) hVar, testTag, z8, false, (TextStyle) null, (X5.n) ComposableLambdaKt.composableLambda(startRestartGroup, 1058478728, true, lVar), (X5.n) ComposableLambdaKt.composableLambda(startRestartGroup, 573533479, true, new m(a12)), nVar3, nVar4, false, d(a13), new KeyboardOptions(0, false, KeyboardType.Companion.m4921getPhonePjHm6EE(), i11, 3, null), new KeyboardActions(new b(focusManager), null, new c(focusManager), null, null, null, 58, null), true, 0, 0, (MutableInteractionSource) null, (Shape) null, d8, startRestartGroup, ((i9 << 9) & 7168) | 14155776 | ((i9 << 15) & 234881024) | ((i9 << 6) & 1879048192), 24576, 492592);
        if (z15) {
            L5.I i12 = L5.I.f6487a;
            startRestartGroup.startReplaceableGroup(304182117);
            if ((((3670016 & i9) ^ 1572864) <= 1048576 || !startRestartGroup.changed(focusRequester3)) && (i9 & 1572864) != 1048576) {
                z16 = false;
            }
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z16 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new d(focusRequester3, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(i12, (X5.n) rememberedValue4, startRestartGroup, 70);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(z8, controller, modifier2, nVar3, z15, z14, focusRequester3, nVar4, i11, i9, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(State state) {
        return (String) state.getValue();
    }

    private static final VisualTransformation d(State state) {
        return (VisualTransformation) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final String g(State state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final C i(State state) {
        return (C) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(State state) {
        return ((Number) state.getValue()).intValue();
    }
}
