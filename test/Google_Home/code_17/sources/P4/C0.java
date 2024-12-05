package p4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import m4.AbstractC3435g;
import m4.AbstractC3441m;
import p4.A0;
import p4.x0;
import u2.InterfaceC4057d;
import x4.AbstractC4189a;

/* loaded from: classes4.dex */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f36975a = CompositionLocalKt.staticCompositionLocalOf(C3747e.f37013a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f36976a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(MutableState mutableState) {
            super(0);
            this.f36976a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5608invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5608invoke() {
            C0.t(this.f36976a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class B extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.a f36977a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f36979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f36980d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(x0.a aVar, boolean z8, Function1 function1, int i8) {
            super(2);
            this.f36977a = aVar;
            this.f36978b = z8;
            this.f36979c = function1;
            this.f36980d = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.r(this.f36977a, this.f36978b, this.f36979c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f36980d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0.c f36981a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36982b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f36983c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f36984d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f36985e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(x0.c cVar, boolean z8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f36981a = cVar;
            this.f36982b = z8;
            this.f36983c = modifier;
            this.f36984d = i8;
            this.f36985e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.u(this.f36981a, this.f36982b, this.f36983c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f36984d | 1), this.f36985e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class D extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f36986a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(Function0 function0) {
            super(0);
            this.f36986a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5609invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5609invoke() {
            this.f36986a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final E f36987a = new E();

        E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return O5.I.f8278a;
        }

        public final void invoke(String autofillType) {
            AbstractC3255y.i(autofillType, "autofillType");
            InterfaceC4057d.f39950a.a(false).b("LocalAutofillEventReporter " + autofillType + " event not reported");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f36988a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f36989b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(w0 w0Var, Function1 function1) {
            super(1);
            this.f36988a = w0Var;
            this.f36989b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return O5.I.f8278a;
        }

        public final void invoke(String it) {
            AbstractC3255y.i(it, "it");
            AutofillType p8 = this.f36988a.p();
            if (p8 != null) {
                this.f36989b.invoke(p8.name());
            }
            this.f36988a.l(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class G extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f36990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f36991b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(MutableState mutableState, w0 w0Var) {
            super(1);
            this.f36990a = mutableState;
            this.f36991b = w0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return O5.I.f8278a;
        }

        public final void invoke(FocusState it) {
            AbstractC3255y.i(it, "it");
            if (((Boolean) this.f36990a.getValue()).booleanValue() != it.isFocused()) {
                this.f36991b.h(it.isFocused());
            }
            this.f36990a.setValue(Boolean.valueOf(it.isFocused()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f36992a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusManager f36993b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f36994c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(String str, FocusManager focusManager, int i8) {
            super(1);
            this.f36992a = str;
            this.f36993b = focusManager;
            this.f36994c = i8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5610invokeZmokQxo(((KeyEvent) obj).m3893unboximpl());
        }

        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m5610invokeZmokQxo(android.view.KeyEvent event) {
            boolean z8;
            AbstractC3255y.i(event, "event");
            if (KeyEventType.m3897equalsimpl0(KeyEvent_androidKt.m3905getTypeZmokQxo(event), KeyEventType.Companion.m3901getKeyDownCS__XNY()) && event.getKeyCode() == 67 && this.f36992a.length() == 0) {
                this.f36993b.mo2672moveFocus3ESFkO8(this.f36994c);
                z8 = true;
            } else {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.C0$a, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3743a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f36996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f36997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3743a(List list, boolean z8, int i8) {
            super(2);
            this.f36995a = list;
            this.f36996b = z8;
            this.f36997c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.a(this.f36995a, this.f36996b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f36997c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.C0$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3744b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f36998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3744b(boolean z8) {
            super(3);
            this.f36998a = z8;
        }

        public final void a(x0.c it, Composer composer, int i8) {
            int i9;
            AbstractC3255y.i(it, "it");
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
            C0.u(it, this.f36998a, null, composer, i8 & 14, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((x0.c) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.C0$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3745c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36999a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3745c(List list, boolean z8, int i8) {
            super(2);
            this.f36999a = list;
            this.f37000b = z8;
            this.f37001c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.a(this.f36999a, this.f37000b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37001c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.C0$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3746d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f37002a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37003b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37004c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l6.M f37005d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f37006e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p4.C0$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            Object f37007a;

            /* renamed from: b, reason: collision with root package name */
            Object f37008b;

            /* renamed from: c, reason: collision with root package name */
            Object f37009c;

            /* renamed from: d, reason: collision with root package name */
            int f37010d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List f37011e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ProduceStateScope f37012f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, ProduceStateScope produceStateScope, S5.d dVar) {
                super(2, dVar);
                this.f37011e = list;
                this.f37012f = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f37011e, this.f37012f, dVar);
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
                    java.lang.Object r0 = T5.b.e()
                    int r1 = r7.f37010d
                    r2 = 1
                    if (r1 == 0) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r1 = r7.f37009c
                    p4.x0$c r1 = (p4.x0.c) r1
                    java.lang.Object r3 = r7.f37008b
                    java.util.Iterator r3 = (java.util.Iterator) r3
                    java.lang.Object r4 = r7.f37007a
                    androidx.compose.runtime.ProduceStateScope r4 = (androidx.compose.runtime.ProduceStateScope) r4
                    O5.t.b(r8)
                    goto L50
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    O5.t.b(r8)
                L26:
                    java.util.List r8 = r7.f37011e
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    androidx.compose.runtime.ProduceStateScope r1 = r7.f37012f
                    java.util.Iterator r8 = r8.iterator()
                    r3 = r8
                    r4 = r1
                L32:
                    boolean r8 = r3.hasNext()
                    if (r8 == 0) goto L26
                    java.lang.Object r8 = r3.next()
                    r1 = r8
                    p4.x0$c r1 = (p4.x0.c) r1
                    r7.f37007a = r4
                    r7.f37008b = r3
                    r7.f37009c = r1
                    r7.f37010d = r2
                    r5 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r8 = l6.X.b(r5, r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    r4.setValue(r1)
                    goto L32
                */
                throw new UnsupportedOperationException("Method not decompiled: p4.C0.C3746d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3746d(boolean z8, l6.M m8, List list, S5.d dVar) {
            super(2, dVar);
            this.f37004c = z8;
            this.f37005d = m8;
            this.f37006e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            C3746d c3746d = new C3746d(this.f37004c, this.f37005d, this.f37006e, dVar);
            c3746d.f37003b = obj;
            return c3746d;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(ProduceStateScope produceStateScope, S5.d dVar) {
            return ((C3746d) create(produceStateScope, dVar)).invokeSuspend(O5.I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f37002a == 0) {
                O5.t.b(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.f37003b;
                if (!this.f37004c) {
                    AbstractC3364k.d(this.f37005d, null, null, new a(this.f37006e, produceStateScope, null), 3, null);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: p4.C0$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    /* synthetic */ class C3747e extends C3252v implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C3747e f37013a = new C3747e();

        C3747e() {
            super(0, C0.class, "defaultAutofillEventReporter", "defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;", 1);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Function1 invoke() {
            return C0.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.C0$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3748f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f37014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37016c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37017d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f37018e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f37019f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37020g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FocusRequester f37021h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37022i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f37023j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3748f(w0 w0Var, boolean z8, int i8, Modifier modifier, Function1 function1, int i9, int i10, FocusRequester focusRequester, int i11, int i12) {
            super(2);
            this.f37014a = w0Var;
            this.f37015b = z8;
            this.f37016c = i8;
            this.f37017d = modifier;
            this.f37018e = function1;
            this.f37019f = i9;
            this.f37020g = i10;
            this.f37021h = focusRequester;
            this.f37022i = i11;
            this.f37023j = i12;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.c(this.f37014a, this.f37015b, this.f37016c, this.f37017d, this.f37018e, this.f37019f, this.f37020g, this.f37021h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37022i | 1), this.f37023j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.C0$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3750h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f37025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f37026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusManager f37027c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37028d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f37029e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3750h(MutableState mutableState, FocusManager focusManager, int i8, State state, S5.d dVar) {
            super(2, dVar);
            this.f37026b = mutableState;
            this.f37027c = focusManager;
            this.f37028d = i8;
            this.f37029e = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C3750h(this.f37026b, this.f37027c, this.f37028d, this.f37029e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f37025a == 0) {
                O5.t.b(obj);
                if (AbstractC3255y.d(C0.h(this.f37029e), A0.a.f36968a) && ((Boolean) this.f37026b.getValue()).booleanValue()) {
                    this.f37027c.mo2672moveFocus3ESFkO8(this.f37028d);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C3750h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class i extends C3252v implements Function1 {
        i(Object obj) {
            super(1, obj, w0.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0);
        }

        public final void d(x0.a.C0853a p02) {
            AbstractC3255y.i(p02, "p0");
            ((w0) this.receiver).k(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((x0.a.C0853a) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f37030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(State state) {
            super(1);
            this.f37030a = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return O5.I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, C0.p(this.f37030a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f37031a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(FocusManager focusManager) {
            super(1);
            this.f37031a = focusManager;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3255y.i($receiver, "$this$$receiver");
            this.f37031a.clearFocus(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f37032a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(FocusManager focusManager, int i8) {
            super(1);
            this.f37032a = focusManager;
            this.f37033b = i8;
        }

        public final void a(KeyboardActionScope $receiver) {
            AbstractC3255y.i($receiver, "$this$$receiver");
            this.f37032a.mo2672moveFocus3ESFkO8(this.f37033b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((KeyboardActionScope) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f37034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f37035b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f37036c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f37037d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f37038e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(w0 w0Var, Function1 function1, State state, State state2, MutableState mutableState) {
            super(1);
            this.f37034a = w0Var;
            this.f37035b = function1;
            this.f37036c = state;
            this.f37037d = state2;
            this.f37038e = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return O5.I.f8278a;
        }

        public final void invoke(TextFieldValue newValue) {
            y0 l8;
            AbstractC3255y.i(newValue, "newValue");
            String text = newValue.getText();
            boolean a8 = B0.a(C0.h(this.f37036c), C0.l(this.f37037d), text);
            if (AbstractC3255y.d(text, C0.l(this.f37037d)) || a8) {
                C0.k(this.f37038e, TextRange.m4685boximpl(newValue.m4934getSelectiond9O1mEE()));
            }
            if (!a8 || (l8 = this.f37034a.l(text)) == null) {
                return;
            }
            this.f37035b.invoke(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f37039a = new n();

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
    public static final class p extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f37041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37042b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37043c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f37044d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f37045e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(w0 w0Var, boolean z8, int i8, Modifier modifier, Function1 function1) {
            super(2);
            this.f37041a = w0Var;
            this.f37042b = z8;
            this.f37043c = i8;
            this.f37044d = modifier;
            this.f37045e = function1;
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
                ComposerKt.traceEventStart(-1798948745, i8, -1, "com.stripe.android.uicore.elements.TextFieldSection.<anonymous> (TextFieldUI.kt:109)");
            }
            C0.c(this.f37041a, this.f37042b, this.f37043c, this.f37044d, this.f37045e, 0, 0, null, composer, 0, 224);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f37046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w0 f37047b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37048c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37049d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37050e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f37051f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f37052g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37053h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37054i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Modifier modifier, w0 w0Var, int i8, boolean z8, boolean z9, Integer num, Function1 function1, int i9, int i10) {
            super(2);
            this.f37046a = modifier;
            this.f37047b = w0Var;
            this.f37048c = i8;
            this.f37049d = z8;
            this.f37050e = z9;
            this.f37051f = num;
            this.f37052g = function1;
            this.f37053h = i9;
            this.f37054i = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.e(this.f37046a, this.f37047b, this.f37048c, this.f37049d, this.f37050e, this.f37051f, this.f37052g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37053h | 1), this.f37054i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f37055a = new r();

        r() {
            super(1);
        }

        public final void invoke(TextFieldValue it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextFieldValue) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final s f37056a = new s();

        s() {
            super(1);
        }

        public final void a(x0.a.C0853a it) {
            AbstractC3255y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x0.a.C0853a) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(boolean z8, String str) {
            super(2);
            this.f37057a = z8;
            this.f37058b = str;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
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
            if (this.f37057a) {
                str = StringResources_androidKt.stringResource(AbstractC3435g.f35159E, new Object[]{this.f37058b}, composer, 64);
            } else {
                str = this.f37058b;
            }
            String str2 = str;
            composer.endReplaceableGroup();
            p4.E.a(str2, null, false, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(2);
            this.f37059a = str;
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
                ComposerKt.traceEventStart(-1625019091, i8, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:272)");
            }
            X.a(this.f37059a, null, false, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f37060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37061b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f37062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(x0 x0Var, boolean z8, Function1 function1) {
            super(2);
            this.f37060a = x0Var;
            this.f37061b = z8;
            this.f37062c = function1;
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
                ComposerKt.traceEventStart(-1001636886, i8, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:277)");
            }
            x0 x0Var = this.f37060a;
            boolean z8 = this.f37061b;
            Function1 function1 = this.f37062c;
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
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (x0Var instanceof x0.c) {
                composer.startReplaceableGroup(-292604158);
                C0.u((x0.c) x0Var, z8, null, composer, 0, 4);
                composer.endReplaceableGroup();
            } else if (x0Var instanceof x0.b) {
                composer.startReplaceableGroup(-292455296);
                Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(companion, Dp.m5183constructorimpl(10));
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs);
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
                Updater.m2508setimpl(m2501constructorimpl2, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
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
    public static final class w extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f37063a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37064b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37065c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37066d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37067e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x0 f37068f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f37069g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f37070h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f37071i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ VisualTransformation f37072j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f37073k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ KeyboardActions f37074l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1 f37075m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f37076n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f37077o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f37078p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f37079q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(TextFieldValue textFieldValue, boolean z8, boolean z9, String str, String str2, x0 x0Var, boolean z10, boolean z11, Modifier modifier, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Function1 function1, Function1 function12, int i8, int i9, int i10) {
            super(2);
            this.f37063a = textFieldValue;
            this.f37064b = z8;
            this.f37065c = z9;
            this.f37066d = str;
            this.f37067e = str2;
            this.f37068f = x0Var;
            this.f37069g = z10;
            this.f37070h = z11;
            this.f37071i = modifier;
            this.f37072j = visualTransformation;
            this.f37073k = keyboardOptions;
            this.f37074l = keyboardActions;
            this.f37075m = function1;
            this.f37076n = function12;
            this.f37077o = i8;
            this.f37078p = i9;
            this.f37079q = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            C0.g(this.f37063a, this.f37064b, this.f37065c, this.f37066d, this.f37067e, this.f37068f, this.f37069g, this.f37070h, this.f37071i, this.f37072j, this.f37073k, this.f37074l, this.f37075m, this.f37076n, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37077o | 1), RecomposeScopeImplKt.updateChangedFlags(this.f37078p), this.f37079q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final x f37080a = new x();

        x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusProperties) obj);
            return O5.I.f8278a;
        }

        public final void invoke(FocusProperties focusProperties) {
            AbstractC3255y.i(focusProperties, "$this$focusProperties");
            focusProperties.setCanFocus(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f37081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(MutableState mutableState) {
            super(0);
            this.f37081a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5611invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5611invoke() {
            C0.t(this.f37081a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f37082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MutableState f37083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Function1 function1, MutableState mutableState) {
            super(1);
            this.f37082a = function1;
            this.f37083b = mutableState;
        }

        public final void a(x0.a.C0853a item) {
            AbstractC3255y.i(item, "item");
            this.f37082a.invoke(item);
            C0.t(this.f37083b, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x0.a.C0853a) obj);
            return O5.I.f8278a;
        }
    }

    public static final /* synthetic */ Function1 B() {
        return D();
    }

    private static final Modifier C(Modifier modifier, Function0 function0) {
        if (function0 != null) {
            return ClickableKt.m320clickableXHw0xAI$default(modifier, false, null, null, new D(function0), 7, null);
        }
        return modifier;
    }

    private static final Function1 D() {
        return E.f36987a;
    }

    public static final ProvidableCompositionLocal E() {
        return f36975a;
    }

    private static final Modifier F(Modifier modifier, w0 w0Var, Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(-1079542001);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079542001, i8, -1, "com.stripe.android.uicore.elements.onAutofill (TextFieldUI.kt:485)");
        }
        Modifier a8 = AbstractC4189a.a(modifier, AbstractC1378t.q(w0Var.p()), new F(w0Var, function1), composer, i8 & 14);
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
        AbstractC3255y.i(icons, "icons");
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
                endRestartGroup.updateScope(new C3743a(icons, z8, i8));
                return;
            }
            return;
        }
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(S5.h.f9825a, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        l6.M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        CrossfadeKt.Crossfade(b(SnapshotStateKt.produceState(AbstractC1378t.m0(icons), new C3746d(((Boolean) startRestartGroup.consume(AbstractC3441m.j())).booleanValue(), coroutineScope, icons, null), startRestartGroup, 64)), (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 2089412202, true, new C3744b(z8)), startRestartGroup, 24576, 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new C3745c(icons, z8, i8));
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
    public static final void c(p4.w0 r43, boolean r44, int r45, androidx.compose.ui.Modifier r46, kotlin.jvm.functions.Function1 r47, int r48, int r49, androidx.compose.ui.focus.FocusRequester r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C0.c(p4.w0, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, int, int, androidx.compose.ui.focus.FocusRequester, androidx.compose.runtime.Composer, int, int):void");
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
            h8 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1177getError0d7_KjU();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(278339326);
            h8 = AbstractC3441m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h();
            composer.endReplaceableGroup();
        }
        long j8 = h8;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        long i11 = AbstractC3441m.n(materialTheme, composer, i10).i();
        long i12 = AbstractC3441m.n(materialTheme, composer, i10).i();
        long i13 = AbstractC3441m.n(materialTheme, composer, i10).i();
        long d8 = AbstractC3441m.n(materialTheme, composer, i10).d();
        Color.Companion companion = Color.Companion;
        long m3011getTransparent0d7_KjU = companion.m3011getTransparent0d7_KjU();
        long m3011getTransparent0d7_KjU2 = companion.m3011getTransparent0d7_KjU();
        TextFieldColors m1404textFieldColorsdx8h9Zs = textFieldDefaults.m1404textFieldColorsdx8h9Zs(j8, 0L, d8, AbstractC3441m.n(materialTheme, composer, i10).k(), 0L, m3011getTransparent0d7_KjU, companion.m3011getTransparent0d7_KjU(), m3011getTransparent0d7_KjU2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, i12, i11, 0L, 0L, i13, 0L, composer, 14352384, 0, 48, 1474322);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1404textFieldColorsdx8h9Zs;
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
    public static final void e(androidx.compose.ui.Modifier r23, p4.w0 r24, int r25, boolean r26, boolean r27, java.lang.Integer r28, kotlin.jvm.functions.Function1 r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C0.e(androidx.compose.ui.Modifier, p4.w0, int, boolean, boolean, java.lang.Integer, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final p4.C f(State state) {
        return (p4.C) state.getValue();
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
    public static final void g(androidx.compose.ui.text.input.TextFieldValue r35, boolean r36, boolean r37, java.lang.String r38, java.lang.String r39, p4.x0 r40, boolean r41, boolean r42, androidx.compose.ui.Modifier r43, androidx.compose.ui.text.input.VisualTransformation r44, androidx.compose.foundation.text.KeyboardOptions r45, androidx.compose.foundation.text.KeyboardActions r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function1 r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C0.g(androidx.compose.ui.text.input.TextFieldValue, boolean, boolean, java.lang.String, java.lang.String, p4.x0, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
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
        Modifier focusProperties = FocusPropertiesKt.focusProperties(companion2, x.f37080a);
        startRestartGroup.startReplaceableGroup(1538978031);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new y(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier testTag = TestTagKt.testTag(ClickableKt.m320clickableXHw0xAI$default(focusProperties, z9, null, null, (Function0) rememberedValue2, 6, null), "dropdown_menu_clickable");
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        Function0 constructor = companion4.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(companion2, Dp.m5183constructorimpl(10));
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(Dp.m5183constructorimpl(4));
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m519spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion4.getConstructor();
        InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs);
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
        Updater.m2508setimpl(m2501constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        u(new x0.c(aVar.a().getIcon().intValue(), null, false, null, 10, null), z8, null, startRestartGroup, i8 & 112, 4);
        startRestartGroup.startReplaceableGroup(-268256612);
        if (z9) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2966boximpl(AbstractC3441m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).i()))}, C3770q.f37696a.a(), startRestartGroup, 56);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean s8 = s(mutableState);
        B2.b d8 = aVar.d();
        x0.a.C0853a a8 = aVar.a();
        List c8 = aVar.c();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i9 = MaterialTheme.$stable;
        long j8 = AbstractC3441m.n(materialTheme, startRestartGroup, i9).j();
        long h8 = AbstractC3441m.n(materialTheme, startRestartGroup, i9).h();
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
    public static final void u(p4.x0.c r16, boolean r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C0.u(p4.x0$c, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.C0$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3749g extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C3749g f37024a = new C3749g();

        C3749g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((y0) obj);
            return O5.I.f8278a;
        }

        public final void a(y0 y0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final o f37040a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((y0) obj);
            return O5.I.f8278a;
        }

        public final void a(y0 y0Var) {
        }
    }
}
