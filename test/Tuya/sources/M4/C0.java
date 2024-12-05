package m4;

import M5.AbstractC1246t;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import i6.AbstractC2829k;
import j4.AbstractC3081g;
import j4.AbstractC3087m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import m4.A0;
import m4.x0;
import r2.InterfaceC3684d;
import u4.AbstractC3804a;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f34949a = CompositionLocalKt.staticCompositionLocalOf(C3404e.f34987a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f34950a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(MutableState mutableState) {
            super(0);
            this.f34950a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5604invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5604invoke() {
            C0.t(this.f34950a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class B extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.a f34951a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34952b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f34953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f34954d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(x0.a aVar, boolean z8, Function1 function1, int i8) {
            super(2);
            this.f34951a = aVar;
            this.f34952b = z8;
            this.f34953c = function1;
            this.f34954d = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.r(this.f34951a, this.f34952b, this.f34953c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34954d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.c f34955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34956b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f34957c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f34958d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f34959e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(x0.c cVar, boolean z8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f34955a = cVar;
            this.f34956b = z8;
            this.f34957c = modifier;
            this.f34958d = i8;
            this.f34959e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.u(this.f34955a, this.f34956b, this.f34957c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34958d | 1), this.f34959e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class D extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f34960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(Function0 function0) {
            super(0);
            this.f34960a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5605invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5605invoke() {
            this.f34960a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f34961a = new E();

        E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return L5.I.f6487a;
        }

        public final void invoke(String autofillType) {
            AbstractC3159y.i(autofillType, "autofillType");
            InterfaceC3684d.f37570a.a(false).b("LocalAutofillEventReporter " + autofillType + " event not reported");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f34962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f34963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(w0 w0Var, Function1 function1) {
            super(1);
            this.f34962a = w0Var;
            this.f34963b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return L5.I.f6487a;
        }

        public final void invoke(String it) {
            AbstractC3159y.i(it, "it");
            AutofillType p8 = this.f34962a.p();
            if (p8 != null) {
                this.f34963b.invoke(p8.name());
            }
            this.f34962a.l(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class G extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f34964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f34965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(MutableState mutableState, w0 w0Var) {
            super(1);
            this.f34964a = mutableState;
            this.f34965b = w0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return L5.I.f6487a;
        }

        public final void invoke(FocusState it) {
            AbstractC3159y.i(it, "it");
            if (((Boolean) this.f34964a.getValue()).booleanValue() != it.isFocused()) {
                this.f34965b.i(it.isFocused());
            }
            this.f34964a.setValue(Boolean.valueOf(it.isFocused()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34966a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f34967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(String str, FocusManager focusManager, int i8) {
            super(1);
            this.f34966a = str;
            this.f34967b = focusManager;
            this.f34968c = i8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5606invokeZmokQxo(((KeyEvent) obj).m3888unboximpl());
        }

        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m5606invokeZmokQxo(android.view.KeyEvent event) {
            boolean z8;
            AbstractC3159y.i(event, "event");
            if (KeyEventType.m3892equalsimpl0(KeyEvent_androidKt.m3900getTypeZmokQxo(event), KeyEventType.Companion.m3896getKeyDownCS__XNY()) && event.getKeyCode() == 67 && this.f34966a.length() == 0) {
                this.f34967b.mo2667moveFocus3ESFkO8(this.f34968c);
                z8 = true;
            } else {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.C0$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3400a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f34969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34970b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34971c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3400a(List list, boolean z8, int i8) {
            super(2);
            this.f34969a = list;
            this.f34970b = z8;
            this.f34971c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.a(this.f34969a, this.f34970b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34971c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.C0$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3401b extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f34972a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3401b(boolean z8) {
            super(3);
            this.f34972a = z8;
        }

        public final void a(x0.c it, Composer composer, int i8) {
            int i9;
            AbstractC3159y.i(it, "it");
            if ((i8 & 14) == 0) {
                if (composer.changed(it)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i8 |= i9;
            }
            if ((i8 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089412202, i8, -1, "com.stripe.android.uicore.elements.AnimatedIcons.<anonymous> (TextFieldUI.kt:337)");
            }
            C0.u(it, this.f34972a, null, composer, i8 & 14, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((x0.c) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.C0$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3402c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f34973a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34974b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3402c(List list, boolean z8, int i8) {
            super(2);
            this.f34973a = list;
            this.f34974b = z8;
            this.f34975c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.a(this.f34973a, this.f34974b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34975c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.C0$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3403d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f34976a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34977b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f34978c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i6.M f34979d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f34980e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m4.C0$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            Object f34981a;

            /* renamed from: b, reason: collision with root package name */
            Object f34982b;

            /* renamed from: c, reason: collision with root package name */
            Object f34983c;

            /* renamed from: d, reason: collision with root package name */
            int f34984d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List f34985e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ProduceStateScope f34986f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, ProduceStateScope produceStateScope, P5.d dVar) {
                super(2, dVar);
                this.f34985e = list;
                this.f34986f = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f34985e, this.f34986f, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[LOOP:0: B:7:0x0032->B:9:0x0026, LOOP_END] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = Q5.b.e()
                    int r1 = r7.f34984d
                    r2 = 1
                    if (r1 == 0) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r1 = r7.f34983c
                    m4.x0$c r1 = (m4.x0.c) r1
                    java.lang.Object r3 = r7.f34982b
                    java.util.Iterator r3 = (java.util.Iterator) r3
                    java.lang.Object r4 = r7.f34981a
                    androidx.compose.runtime.ProduceStateScope r4 = (androidx.compose.runtime.ProduceStateScope) r4
                    L5.t.b(r8)
                    goto L50
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    L5.t.b(r8)
                L26:
                    java.util.List r8 = r7.f34985e
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    androidx.compose.runtime.ProduceStateScope r1 = r7.f34986f
                    java.util.Iterator r8 = r8.iterator()
                    r3 = r8
                    r4 = r1
                L32:
                    boolean r8 = r3.hasNext()
                    if (r8 == 0) goto L26
                    java.lang.Object r8 = r3.next()
                    r1 = r8
                    m4.x0$c r1 = (m4.x0.c) r1
                    r7.f34981a = r4
                    r7.f34982b = r3
                    r7.f34983c = r1
                    r7.f34984d = r2
                    r5 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r8 = i6.X.b(r5, r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    r4.setValue(r1)
                    goto L32
                */
                throw new UnsupportedOperationException("Method not decompiled: m4.C0.C3403d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3403d(boolean z8, i6.M m8, List list, P5.d dVar) {
            super(2, dVar);
            this.f34978c = z8;
            this.f34979d = m8;
            this.f34980e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            C3403d c3403d = new C3403d(this.f34978c, this.f34979d, this.f34980e, dVar);
            c3403d.f34977b = obj;
            return c3403d;
        }

        @Override // X5.n
        public final Object invoke(ProduceStateScope produceStateScope, P5.d dVar) {
            return ((C3403d) create(produceStateScope, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f34976a == 0) {
                L5.t.b(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.f34977b;
                if (!this.f34978c) {
                    AbstractC2829k.d(this.f34979d, null, null, new a(this.f34980e, produceStateScope, null), 3, null);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: m4.C0$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    /* synthetic */ class C3404e extends C3156v implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C3404e f34987a = new C3404e();

        C3404e() {
            super(0, C0.class, "defaultAutofillEventReporter", "defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Function1 invoke() {
            return C0.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.C0$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3405f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f34988a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f34989b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34990c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f34991d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f34992e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f34993f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f34994g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FocusRequester f34995h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f34996i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f34997j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3405f(w0 w0Var, boolean z8, int i8, Modifier modifier, Function1 function1, int i9, int i10, FocusRequester focusRequester, int i11, int i12) {
            super(2);
            this.f34988a = w0Var;
            this.f34989b = z8;
            this.f34990c = i8;
            this.f34991d = modifier;
            this.f34992e = function1;
            this.f34993f = i9;
            this.f34994g = i10;
            this.f34995h = focusRequester;
            this.f34996i = i11;
            this.f34997j = i12;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.c(this.f34988a, this.f34989b, this.f34990c, this.f34991d, this.f34992e, this.f34993f, this.f34994g, this.f34995h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34996i | 1), this.f34997j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.C0$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3407h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f34999a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f35000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusManager f35001c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35002d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f35003e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3407h(MutableState mutableState, FocusManager focusManager, int i8, State state, P5.d dVar) {
            super(2, dVar);
            this.f35000b = mutableState;
            this.f35001c = focusManager;
            this.f35002d = i8;
            this.f35003e = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C3407h(this.f35000b, this.f35001c, this.f35002d, this.f35003e, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C3407h) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f34999a == 0) {
                L5.t.b(obj);
                if (AbstractC3159y.d(C0.h(this.f35003e), A0.a.f34942a) && ((Boolean) this.f35000b.getValue()).booleanValue()) {
                    this.f35001c.mo2667moveFocus3ESFkO8(this.f35002d);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends C3156v implements Function1 {
        i(Object obj) {
            super(1, obj, w0.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0);
        }

        public final void d(x0.a.C0823a p02) {
            AbstractC3159y.i(p02, "p0");
            ((w0) this.receiver).h(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((x0.a.C0823a) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f35004a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(State state) {
            super(1);
            this.f35004a = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return L5.I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, C0.p(this.f35004a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f35005a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(FocusManager focusManager) {
            super(1);
            this.f35005a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3159y.i($receiver, "$this$$receiver");
            this.f35005a.clearFocus(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f35006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35007b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(FocusManager focusManager, int i8) {
            super(1);
            this.f35006a = focusManager;
            this.f35007b = i8;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3159y.i($receiver, "$this$$receiver");
            this.f35006a.mo2667moveFocus3ESFkO8(this.f35007b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f35008a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f35009b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f35010c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f35011d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f35012e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(w0 w0Var, Function1 function1, State state, State state2, MutableState mutableState) {
            super(1);
            this.f35008a = w0Var;
            this.f35009b = function1;
            this.f35010c = state;
            this.f35011d = state2;
            this.f35012e = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return L5.I.f6487a;
        }

        public final void invoke(TextFieldValue newValue) {
            y0 l8;
            AbstractC3159y.i(newValue, "newValue");
            String text = newValue.getText();
            boolean a8 = B0.a(C0.h(this.f35010c), C0.l(this.f35011d), text);
            if (AbstractC3159y.d(text, C0.l(this.f35011d)) || a8) {
                C0.k(this.f35012e, TextRange.m4680boximpl(newValue.m4929getSelectiond9O1mEE()));
            }
            if (!a8 || (l8 = this.f35008a.l(text)) == null) {
                return;
            }
            this.f35009b.invoke(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f35013a = new n();

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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f35015a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35016b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35017c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f35018d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f35019e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(w0 w0Var, boolean z8, int i8, Modifier modifier, Function1 function1) {
            super(2);
            this.f35015a = w0Var;
            this.f35016b = z8;
            this.f35017c = i8;
            this.f35018d = modifier;
            this.f35019e = function1;
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
                ComposerKt.traceEventStart(-1798948745, i8, -1, "com.stripe.android.uicore.elements.TextFieldSection.<anonymous> (TextFieldUI.kt:109)");
            }
            C0.c(this.f35015a, this.f35016b, this.f35017c, this.f35018d, this.f35019e, 0, 0, null, composer, 0, 224);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f35020a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f35021b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35022c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f35023d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f35024e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f35025f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f35026g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35027h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35028i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Modifier modifier, w0 w0Var, int i8, boolean z8, boolean z9, Integer num, Function1 function1, int i9, int i10) {
            super(2);
            this.f35020a = modifier;
            this.f35021b = w0Var;
            this.f35022c = i8;
            this.f35023d = z8;
            this.f35024e = z9;
            this.f35025f = num;
            this.f35026g = function1;
            this.f35027h = i9;
            this.f35028i = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.e(this.f35020a, this.f35021b, this.f35022c, this.f35023d, this.f35024e, this.f35025f, this.f35026g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35027h | 1), this.f35028i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f35029a = new r();

        r() {
            super(1);
        }

        public final void invoke(TextFieldValue it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final s f35030a = new s();

        s() {
            super(1);
        }

        public final void a(x0.a.C0823a it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x0.a.C0823a) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35031a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35032b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(boolean z8, String str) {
            super(2);
            this.f35031a = z8;
            this.f35032b = str;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            String str;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-560051860, i8, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:258)");
            }
            composer.startReplaceableGroup(-771996200);
            if (this.f35031a) {
                str = StringResources_androidKt.stringResource(AbstractC3081g.f33183E, new Object[]{this.f35032b}, composer, 64);
            } else {
                str = this.f35032b;
            }
            String str2 = str;
            composer.endReplaceableGroup();
            m4.E.a(str2, null, false, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35033a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(2);
            this.f35033a = str;
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
                ComposerKt.traceEventStart(-1625019091, i8, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:272)");
            }
            X.a(this.f35033a, null, false, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f35034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35035b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f35036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(x0 x0Var, boolean z8, Function1 function1) {
            super(2);
            this.f35034a = x0Var;
            this.f35035b = z8;
            this.f35036c = function1;
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
                ComposerKt.traceEventStart(-1001636886, i8, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:277)");
            }
            x0 x0Var = this.f35034a;
            boolean z8 = this.f35035b;
            Function1 function1 = this.f35036c;
            composer.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (x0Var instanceof x0.c) {
                composer.startReplaceableGroup(-292604158);
                C0.u((x0.c) x0Var, z8, null, composer, 0, 4);
                composer.endReplaceableGroup();
            } else if (x0Var instanceof x0.b) {
                composer.startReplaceableGroup(-292455296);
                Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(companion, Dp.m5178constructorimpl(10));
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
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
                Updater.m2503setimpl(m2496constructorimpl2, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                X5.n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-56271593);
                x0.b bVar = (x0.b) x0Var;
                Iterator it = bVar.b().iterator();
                while (it.hasNext()) {
                    C0.u((x0.c) it.next(), z8, null, composer, 0, 4);
                }
                composer.endReplaceableGroup();
                C0.a(bVar.a(), z8, composer, 8);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else if (x0Var instanceof x0.a) {
                composer.startReplaceableGroup(-292035680);
                C0.r((x0.a) x0Var, z8, function1, composer, 8);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-291749581);
                composer.endReplaceableGroup();
            }
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
    public static final class w extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f35037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35040d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35041e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x0 f35042f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f35043g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f35044h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f35045i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f35046j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f35047k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ KeyboardActions f35048l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1 f35049m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f35050n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f35051o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f35052p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f35053q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(TextFieldValue textFieldValue, boolean z8, boolean z9, String str, String str2, x0 x0Var, boolean z10, boolean z11, Modifier modifier, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Function1 function1, Function1 function12, int i8, int i9, int i10) {
            super(2);
            this.f35037a = textFieldValue;
            this.f35038b = z8;
            this.f35039c = z9;
            this.f35040d = str;
            this.f35041e = str2;
            this.f35042f = x0Var;
            this.f35043g = z10;
            this.f35044h = z11;
            this.f35045i = modifier;
            this.f35046j = visualTransformation;
            this.f35047k = keyboardOptions;
            this.f35048l = keyboardActions;
            this.f35049m = function1;
            this.f35050n = function12;
            this.f35051o = i8;
            this.f35052p = i9;
            this.f35053q = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.g(this.f35037a, this.f35038b, this.f35039c, this.f35040d, this.f35041e, this.f35042f, this.f35043g, this.f35044h, this.f35045i, this.f35046j, this.f35047k, this.f35048l, this.f35049m, this.f35050n, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35051o | 1), RecomposeScopeImplKt.updateChangedFlags(this.f35052p), this.f35053q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final x f35054a = new x();

        x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusProperties) obj);
            return L5.I.f6487a;
        }

        public final void invoke(FocusProperties focusProperties) {
            AbstractC3159y.i(focusProperties, "$this$focusProperties");
            focusProperties.setCanFocus(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f35055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(MutableState mutableState) {
            super(0);
            this.f35055a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5607invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5607invoke() {
            C0.t(this.f35055a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f35056a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f35057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Function1 function1, MutableState mutableState) {
            super(1);
            this.f35056a = function1;
            this.f35057b = mutableState;
        }

        public final void a(x0.a.C0823a item) {
            AbstractC3159y.i(item, "item");
            this.f35056a.invoke(item);
            C0.t(this.f35057b, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x0.a.C0823a) obj);
            return L5.I.f6487a;
        }
    }

    public static final /* synthetic */ Function1 B() {
        return D();
    }

    private static final Modifier C(Modifier modifier, Function0 function0) {
        if (function0 != null) {
            return ClickableKt.m315clickableXHw0xAI$default(modifier, false, null, null, new D(function0), 7, null);
        }
        return modifier;
    }

    private static final Function1 D() {
        return E.f34961a;
    }

    public static final ProvidableCompositionLocal E() {
        return f34949a;
    }

    private static final Modifier F(Modifier modifier, w0 w0Var, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(-1079542001);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079542001, i8, -1, "com.stripe.android.uicore.elements.onAutofill (TextFieldUI.kt:485)");
        }
        Modifier a8 = AbstractC3804a.a(modifier, AbstractC1246t.q(w0Var.p()), new F(w0Var, function1), composer, i8 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a8;
    }

    private static final Modifier G(Modifier modifier, w0 w0Var, MutableState mutableState) {
        return FocusChangedModifierKt.onFocusChanged(modifier, new G(mutableState, w0Var));
    }

    private static final Modifier H(Modifier modifier, String str, FocusManager focusManager, int i8) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new H(str, focusManager, i8));
    }

    public static final void a(List icons, boolean z8, Composer composer, int i8) {
        AbstractC3159y.i(icons, "icons");
        Composer startRestartGroup = composer.startRestartGroup(-2067380269);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2067380269, i8, -1, "com.stripe.android.uicore.elements.AnimatedIcons (TextFieldUI.kt:316)");
        }
        if (icons.isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C3400a(icons, z8, i8));
                return;
            }
            return;
        }
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(P5.h.f7994a, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        i6.M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        CrossfadeKt.Crossfade(b(SnapshotStateKt.produceState(AbstractC1246t.m0(icons), new C3403d(((Boolean) startRestartGroup.consume(AbstractC3087m.j())).booleanValue(), coroutineScope, icons, null), startRestartGroup, 64)), (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 2089412202, true, new C3401b(z8)), startRestartGroup, 24576, 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new C3402c(icons, z8, i8));
        }
    }

    private static final x0.c b(State state) {
        return (x0.c) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(m4.w0 r43, boolean r44, int r45, androidx.compose.ui.Modifier r46, kotlin.jvm.functions.Function1 r47, int r48, int r49, androidx.compose.ui.focus.FocusRequester r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C0.c(m4.w0, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, int, int, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final TextFieldColors d(boolean z8, Composer composer, int i8, int i9) {
        boolean z9;
        long h8;
        composer.startReplaceableGroup(-1455690364);
        if ((i9 & 1) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1455690364, i8, -1, "com.stripe.android.uicore.elements.TextFieldColors (TextFieldUI.kt:345)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        if (z9) {
            composer.startReplaceableGroup(278291338);
            h8 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1172getError0d7_KjU();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(278339326);
            h8 = AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h();
            composer.endReplaceableGroup();
        }
        long j8 = h8;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        long i11 = AbstractC3087m.n(materialTheme, composer, i10).i();
        long i12 = AbstractC3087m.n(materialTheme, composer, i10).i();
        long i13 = AbstractC3087m.n(materialTheme, composer, i10).i();
        long d8 = AbstractC3087m.n(materialTheme, composer, i10).d();
        Color.Companion companion = Color.Companion;
        long m3006getTransparent0d7_KjU = companion.m3006getTransparent0d7_KjU();
        long m3006getTransparent0d7_KjU2 = companion.m3006getTransparent0d7_KjU();
        TextFieldColors m1399textFieldColorsdx8h9Zs = textFieldDefaults.m1399textFieldColorsdx8h9Zs(j8, 0L, d8, AbstractC3087m.n(materialTheme, composer, i10).k(), 0L, m3006getTransparent0d7_KjU, companion.m3006getTransparent0d7_KjU(), m3006getTransparent0d7_KjU2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, i12, i11, 0L, 0L, i13, 0L, composer, 14352384, 0, 48, 1474322);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1399textFieldColorsdx8h9Zs;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(androidx.compose.ui.Modifier r23, m4.w0 r24, int r25, boolean r26, boolean r27, java.lang.Integer r28, kotlin.jvm.functions.Function1 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C0.e(androidx.compose.ui.Modifier, m4.w0, int, boolean, boolean, java.lang.Integer, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final m4.C f(State state) {
        return (m4.C) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(androidx.compose.ui.text.input.TextFieldValue r35, boolean r36, boolean r37, java.lang.String r38, java.lang.String r39, m4.x0 r40, boolean r41, boolean r42, androidx.compose.ui.Modifier r43, androidx.compose.ui.text.input.VisualTransformation r44, androidx.compose.foundation.text.KeyboardOptions r45, androidx.compose.foundation.text.KeyboardActions r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function1 r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C0.g(androidx.compose.ui.text.input.TextFieldValue, boolean, boolean, java.lang.String, java.lang.String, m4.x0, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 h(State state) {
        return (y0) state.getValue();
    }

    private static final Integer i(State state) {
        return (Integer) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final TextRange j(MutableState mutableState) {
        return (TextRange) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MutableState mutableState, TextRange textRange) {
        mutableState.setValue(textRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(State state) {
        return (String) state.getValue();
    }

    private static final x0 m(State state) {
        return (x0) state.getValue();
    }

    private static final boolean n(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean o(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(State state) {
        return (String) state.getValue();
    }

    private static final String q(State state) {
        return (String) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(x0.a aVar, boolean z8, Function1 function1, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-58118303);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-58118303, i8, -1, "com.stripe.android.uicore.elements.TrailingDropdown (TextFieldUI.kt:398)");
        }
        startRestartGroup.startReplaceableGroup(1538971242);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        boolean z9 = (z8 || aVar.b()) ? false : true;
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier focusProperties = FocusPropertiesKt.focusProperties(companion2, x.f35054a);
        startRestartGroup.startReplaceableGroup(1538978031);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new y(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier testTag = TestTagKt.testTag(ClickableKt.m315clickableXHw0xAI$default(focusProperties, z9, null, null, (Function0) rememberedValue2, 6, null), "dropdown_menu_clickable");
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        Function0 constructor = companion4.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(companion2, Dp.m5178constructorimpl(10));
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = Arrangement.INSTANCE.m514spacedBy0680j_4(Dp.m5178constructorimpl(4));
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m514spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion4.getConstructor();
        X5.o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m600padding3ABfNKs);
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
        Updater.m2503setimpl(m2496constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        u(new x0.c(aVar.a().getIcon().intValue(), null, false, null, 10, null), z8, null, startRestartGroup, i8 & 112, 4);
        startRestartGroup.startReplaceableGroup(-268256612);
        if (z9) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2961boximpl(AbstractC3087m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).i()))}, C3427q.f35670a.a(), startRestartGroup, 56);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean s8 = s(mutableState);
        InterfaceC3983b d8 = aVar.d();
        x0.a.C0823a a8 = aVar.a();
        List c8 = aVar.c();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i9 = MaterialTheme.$stable;
        long j8 = AbstractC3087m.n(materialTheme, startRestartGroup, i9).j();
        long h8 = AbstractC3087m.n(materialTheme, startRestartGroup, i9).h();
        startRestartGroup.startReplaceableGroup(-797513728);
        boolean z10 = (((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(function1)) || (i8 & 384) == 256;
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new z(function1, mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-797509717);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new A(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        u0.b(s8, d8, a8, c8, function12, j8, h8, (Function0) rememberedValue4, startRestartGroup, 12587584);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new B(aVar, z8, function1, i8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean s(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(m4.x0.c r16, boolean r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C0.u(m4.x0$c, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.C0$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3406g extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C3406g f34998a = new C3406g();

        C3406g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((y0) obj);
            return L5.I.f6487a;
        }

        public final void a(y0 y0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final o f35014a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((y0) obj);
            return L5.I.f6487a;
        }

        public final void a(y0 y0Var) {
        }
    }
}
