package J3;

import M5.AbstractC1246t;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import s4.C3755g;

/* renamed from: J3.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1214w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f5428a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f5429b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f5430c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0109a extends kotlin.coroutines.jvm.internal.k implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f5431a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f5432b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0 f5433c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0109a(Function0 function0, P5.d dVar) {
                super(2, dVar);
                this.f5433c = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                C0109a c0109a = new C0109a(this.f5433c, dVar);
                c0109a.f5432b = obj;
                return c0109a;
            }

            @Override // X5.n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, P5.d dVar) {
                return ((C0109a) create(awaitPointerEventScope, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f5431a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f5432b;
                    this.f5431a = 1;
                    obj = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, this, 1, null);
                    if (obj == e8) {
                        return e8;
                    }
                }
                if (PointerEventType.m3965equalsimpl0(((PointerEvent) obj).m3958getType7fucELk(), PointerEventType.Companion.m3972getPress7fucELk())) {
                    this.f5433c.invoke();
                }
                return L5.I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, P5.d dVar) {
            super(2, dVar);
            this.f5430c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f5430c, dVar);
            aVar.f5429b = obj;
            return aVar;
        }

        @Override // X5.n
        public final Object invoke(PointerInputScope pointerInputScope, P5.d dVar) {
            return ((a) create(pointerInputScope, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f5428a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f5429b;
                C0109a c0109a = new C0109a(this.f5430c, null);
                this.f5428a = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c0109a, this) == e8) {
                    return e8;
                }
            }
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f5434a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(1);
            this.f5434a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusState) obj);
            return L5.I.f6487a;
        }

        public final void invoke(FocusState state) {
            AbstractC3159y.i(state, "state");
            if (state.getHasFocus()) {
                this.f5434a.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5435a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f5437c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ A3.a f5438d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B3.d f5439e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f5440f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f5441g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f5442h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f5443i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, String str, List list, A3.a aVar, B3.d dVar, float f8, Function1 function1, Function0 function0, int i8) {
            super(2);
            this.f5435a = z8;
            this.f5436b = str;
            this.f5437c = list;
            this.f5438d = aVar;
            this.f5439e = dVar;
            this.f5440f = f8;
            this.f5441g = function1;
            this.f5442h = function0;
            this.f5443i = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1214w.a(this.f5435a, this.f5436b, this.f5437c, this.f5438d, this.f5439e, this.f5440f, this.f5441g, this.f5442h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5443i | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.w$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f5444a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.w$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f5445a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m40invoke();
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m40invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.w$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5446a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f5447b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f5448c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f5449d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f5450e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A3.a f5451f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B3.d f5452g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f5453h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f5454i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f5455j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f5456k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f5457l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z8, List list, String str, List list2, Function1 function1, A3.a aVar, B3.d dVar, Function1 function12, Modifier modifier, Function0 function0, int i8, int i9) {
            super(2);
            this.f5446a = z8;
            this.f5447b = list;
            this.f5448c = str;
            this.f5449d = list2;
            this.f5450e = function1;
            this.f5451f = aVar;
            this.f5452g = dVar;
            this.f5453h = function12;
            this.f5454i = modifier;
            this.f5455j = function0;
            this.f5456k = i8;
            this.f5457l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1214w.b(this.f5446a, this.f5447b, this.f5448c, this.f5449d, this.f5450e, this.f5451f, this.f5452g, this.f5453h, this.f5454i, this.f5455j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5456k | 1), this.f5457l);
        }
    }

    public static final void a(boolean z8, String selectedPaymentMethodCode, List formElements, A3.a formArguments, B3.d usBankAccountFormArguments, float f8, Function1 onFormFieldValuesChanged, Function0 onInteractionEvent, Composer composer, int i8) {
        boolean z9;
        boolean z10;
        AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC3159y.i(formElements, "formElements");
        AbstractC3159y.i(formArguments, "formArguments");
        AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
        AbstractC3159y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3159y.i(onInteractionEvent, "onInteractionEvent");
        Composer startRestartGroup = composer.startRestartGroup(1036417859);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1036417859, i8, -1, "com.stripe.android.paymentsheet.ui.FormElement (PaymentElement.kt:97)");
        }
        Object m2583rememberSaveable = RememberSaveableKt.m2583rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0) d.f5444a, startRestartGroup, 3080, 6);
        AbstractC3159y.h(m2583rememberSaveable, "rememberSaveable(...)");
        String str = (String) m2583rememberSaveable;
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
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(testTag, "AddPaymentMethod", (X5.n) rememberedValue);
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
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(onFocusChanged);
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
        Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (!AbstractC3159y.d(selectedPaymentMethodCode, o.p.f24522O.f24550a) && !AbstractC3159y.d(selectedPaymentMethodCode, o.p.f24531h.f24550a)) {
            startRestartGroup.startReplaceableGroup(-754595001);
            AbstractC1215x.a(str, formArguments, z8, onFormFieldValuesChanged, formElements, PaddingKt.m602paddingVpY3zN4$default(companion, f8, 0.0f, 2, null), startRestartGroup, ((i8 << 6) & 896) | 32832 | ((i8 >> 9) & 7168), 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-754845264);
            B3.e.k(formArguments, usBankAccountFormArguments, PaddingKt.m602paddingVpY3zN4$default(companion, f8, 0.0f, 2, null), startRestartGroup, 72, 0);
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

    public static final void b(boolean z8, List supportedPaymentMethods, String selectedItemCode, List formElements, Function1 onItemSelectedListener, A3.a formArguments, B3.d usBankAccountFormArguments, Function1 onFormFieldValuesChanged, Modifier modifier, Function0 function0, Composer composer, int i8, int i9) {
        Modifier modifier2;
        Function0 function02;
        boolean z9;
        Composer composer2;
        Modifier modifier3;
        AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
        AbstractC3159y.i(selectedItemCode, "selectedItemCode");
        AbstractC3159y.i(formElements, "formElements");
        AbstractC3159y.i(onItemSelectedListener, "onItemSelectedListener");
        AbstractC3159y.i(formArguments, "formArguments");
        AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
        AbstractC3159y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Composer startRestartGroup = composer.startRestartGroup(-145693783);
        if ((i9 & 256) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 512) != 0) {
            function02 = e.f5445a;
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
            AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
            rememberedValue = new C3755g(applicationContext, null, null, null, null, 30, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        C3755g c3755g = (C3755g) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(q3.s.f37390e, startRestartGroup, 0);
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
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((X2.g) it.next()).d());
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
            rememberedValue3 = (X2.g) supportedPaymentMethods.get(intValue);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        X2.g gVar = (X2.g) rememberedValue3;
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
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1771952492);
        if (supportedPaymentMethods.size() > 1) {
            modifier3 = modifier4;
            composer2 = startRestartGroup;
            AbstractC1213v.a(supportedPaymentMethods, intValue, z8, onItemSelectedListener, c3755g, PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(12), 7, null), null, composer2, ((i8 << 6) & 896) | 196616 | ((i8 >> 3) & 7168) | (C3755g.f37939g << 12), 64);
        } else {
            composer2 = startRestartGroup;
            modifier3 = modifier4;
        }
        composer2.endReplaceableGroup();
        a(z8, gVar.d(), formElements, formArguments, usBankAccountFormArguments, dimensionResource, onFormFieldValuesChanged, function02, composer2, (i8 & 14) | 37376 | (3670016 & (i8 >> 3)) | (29360128 & (i8 >> 6)));
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
