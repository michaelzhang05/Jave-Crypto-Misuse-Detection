package M3;

import P5.AbstractC1378t;
import a3.C1625g;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import android.content.Context;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import v4.C4108g;

/* renamed from: M3.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1327w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f7134a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f7135b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f7136c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0134a extends kotlin.coroutines.jvm.internal.k implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f7137a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f7138b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f7139c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0134a(Function0 function0, S5.d dVar) {
                super(2, dVar);
                this.f7139c = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                C0134a c0134a = new C0134a(this.f7139c, dVar);
                c0134a.f7138b = obj;
                return c0134a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, S5.d dVar) {
                return ((C0134a) create(awaitPointerEventScope, dVar)).invokeSuspend(O5.I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f7137a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f7138b;
                    this.f7137a = 1;
                    obj = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, this, 1, null);
                    if (obj == e8) {
                        return e8;
                    }
                }
                if (PointerEventType.m3970equalsimpl0(((PointerEvent) obj).m3963getType7fucELk(), PointerEventType.Companion.m3977getPress7fucELk())) {
                    this.f7139c.invoke();
                }
                return O5.I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, S5.d dVar) {
            super(2, dVar);
            this.f7136c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f7136c, dVar);
            aVar.f7135b = obj;
            return aVar;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(PointerInputScope pointerInputScope, S5.d dVar) {
            return ((a) create(pointerInputScope, dVar)).invokeSuspend(O5.I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f7134a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f7135b;
                C0134a c0134a = new C0134a(this.f7136c, null);
                this.f7134a = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c0134a, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f7140a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(1);
            this.f7140a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return O5.I.f8278a;
        }

        public final void invoke(FocusState state) {
            AbstractC3255y.i(state, "state");
            if (state.getHasFocus()) {
                this.f7140a.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f7143c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ D3.a f7144d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ E3.d f7145e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f7146f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f7147g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f7148h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7149i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, String str, List list, D3.a aVar, E3.d dVar, float f8, Function1 function1, Function0 function0, int i8) {
            super(2);
            this.f7141a = z8;
            this.f7142b = str;
            this.f7143c = list;
            this.f7144d = aVar;
            this.f7145e = dVar;
            this.f7146f = f8;
            this.f7147g = function1;
            this.f7148h = function0;
            this.f7149i = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1327w.a(this.f7141a, this.f7142b, this.f7143c, this.f7144d, this.f7145e, this.f7146f, this.f7147g, this.f7148h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7149i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.w$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7150a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.w$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7151a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m45invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m45invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.w$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f7153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f7155d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f7156e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ D3.a f7157f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ E3.d f7158g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f7159h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f7160i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f7161j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7162k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7163l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z8, List list, String str, List list2, Function1 function1, D3.a aVar, E3.d dVar, Function1 function12, Modifier modifier, Function0 function0, int i8, int i9) {
            super(2);
            this.f7152a = z8;
            this.f7153b = list;
            this.f7154c = str;
            this.f7155d = list2;
            this.f7156e = function1;
            this.f7157f = aVar;
            this.f7158g = dVar;
            this.f7159h = function12;
            this.f7160i = modifier;
            this.f7161j = function0;
            this.f7162k = i8;
            this.f7163l = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1327w.b(this.f7152a, this.f7153b, this.f7154c, this.f7155d, this.f7156e, this.f7157f, this.f7158g, this.f7159h, this.f7160i, this.f7161j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7162k | 1), this.f7163l);
        }
    }

    public static final void a(boolean z8, String selectedPaymentMethodCode, List formElements, D3.a formArguments, E3.d usBankAccountFormArguments, float f8, Function1 onFormFieldValuesChanged, Function0 onInteractionEvent, Composer composer, int i8) {
        boolean z9;
        boolean z10;
        AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC3255y.i(formElements, "formElements");
        AbstractC3255y.i(formArguments, "formArguments");
        AbstractC3255y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
        AbstractC3255y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3255y.i(onInteractionEvent, "onInteractionEvent");
        Composer startRestartGroup = composer.startRestartGroup(1036417859);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1036417859, i8, -1, "com.stripe.android.paymentsheet.ui.FormElement (PaymentElement.kt:97)");
        }
        Object m2588rememberSaveable = RememberSaveableKt.m2588rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0) d.f7150a, startRestartGroup, 3080, 6);
        AbstractC3255y.h(m2588rememberSaveable, "rememberSaveable(...)");
        String str = (String) m2588rememberSaveable;
        Modifier.Companion companion = Modifier.Companion;
        Modifier testTag = TestTagKt.testTag(companion, "FORM_ELEMENT_UI");
        startRestartGroup.startReplaceableGroup(-1853091545);
        int i9 = (29360128 & i8) ^ 12582912;
        if ((i9 > 8388608 && startRestartGroup.changed(onInteractionEvent)) || (i8 & 12582912) == 8388608) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(onInteractionEvent, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(testTag, "AddPaymentMethod", (InterfaceC1668n) rememberedValue);
        startRestartGroup.startReplaceableGroup(-1853081351);
        if ((i9 > 8388608 && startRestartGroup.changed(onInteractionEvent)) || (12582912 & i8) == 8388608) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new b(onInteractionEvent);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(pointerInput, (Function1) rememberedValue2);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(onFocusChanged);
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
        if (!AbstractC3255y.d(selectedPaymentMethodCode, o.p.f25577O.f25605a) && !AbstractC3255y.d(selectedPaymentMethodCode, o.p.f25586h.f25605a)) {
            startRestartGroup.startReplaceableGroup(-754595001);
            AbstractC1328x.a(str, formArguments, z8, onFormFieldValuesChanged, formElements, PaddingKt.m607paddingVpY3zN4$default(companion, f8, 0.0f, 2, null), startRestartGroup, ((i8 << 6) & 896) | 32832 | ((i8 >> 9) & 7168), 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-754845264);
            E3.e.k(formArguments, usBankAccountFormArguments, PaddingKt.m607paddingVpY3zN4$default(companion, f8, 0.0f, 2, null), startRestartGroup, 72, 0);
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, selectedPaymentMethodCode, formElements, formArguments, usBankAccountFormArguments, f8, onFormFieldValuesChanged, onInteractionEvent, i8));
        }
    }

    public static final void b(boolean z8, List supportedPaymentMethods, String selectedItemCode, List formElements, Function1 onItemSelectedListener, D3.a formArguments, E3.d usBankAccountFormArguments, Function1 onFormFieldValuesChanged, Modifier modifier, Function0 function0, Composer composer, int i8, int i9) {
        Modifier modifier2;
        Function0 function02;
        boolean z9;
        Composer composer2;
        Modifier modifier3;
        AbstractC3255y.i(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC3255y.i(selectedItemCode, "selectedItemCode");
        AbstractC3255y.i(formElements, "formElements");
        AbstractC3255y.i(onItemSelectedListener, "onItemSelectedListener");
        AbstractC3255y.i(formArguments, "formArguments");
        AbstractC3255y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
        AbstractC3255y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Composer startRestartGroup = composer.startRestartGroup(-145693783);
        if ((i9 & 256) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 512) != 0) {
            function02 = e.f7151a;
        } else {
            function02 = function0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-145693783, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentElement (PaymentElement.kt:45)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        startRestartGroup.startReplaceableGroup(-779278284);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Context applicationContext = context.getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            rememberedValue = new C4108g(applicationContext, null, null, null, null, 30, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        C4108g c4108g = (C4108g) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(t3.s.f39712e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-779271309);
        if ((((i8 & 896) ^ 384) > 256 && startRestartGroup.changed(selectedItemCode)) || (i8 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean changed = z9 | startRestartGroup.changed(supportedPaymentMethods);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            List list = supportedPaymentMethods;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1625g) it.next()).d());
            }
            rememberedValue2 = Integer.valueOf(arrayList.indexOf(selectedItemCode));
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        int intValue = ((Number) rememberedValue2).intValue();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-779266315);
        boolean changed2 = startRestartGroup.changed(intValue) | startRestartGroup.changed(supportedPaymentMethods);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = (C1625g) supportedPaymentMethods.get(intValue);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        C1625g c1625g = (C1625g) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier modifier4 = modifier2;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
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
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1771952492);
        if (supportedPaymentMethods.size() > 1) {
            modifier3 = modifier4;
            composer2 = startRestartGroup;
            AbstractC1326v.a(supportedPaymentMethods, intValue, z8, onItemSelectedListener, c4108g, PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(12), 7, null), null, composer2, ((i8 << 6) & 896) | 196616 | ((i8 >> 3) & 7168) | (C4108g.f40212g << 12), 64);
        } else {
            composer2 = startRestartGroup;
            modifier3 = modifier4;
        }
        composer2.endReplaceableGroup();
        a(z8, c1625g.d(), formElements, formArguments, usBankAccountFormArguments, dimensionResource, onFormFieldValuesChanged, function02, composer2, (i8 & 14) | 37376 | (3670016 & (i8 >> 3)) | (29360128 & (i8 >> 6)));
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(z8, supportedPaymentMethods, selectedItemCode, formElements, onItemSelectedListener, formArguments, usBankAccountFormArguments, onFormFieldValuesChanged, modifier3, function02, i8, i9));
        }
    }
}
