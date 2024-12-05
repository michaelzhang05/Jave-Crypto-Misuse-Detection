package E2;

import J3.AbstractC1204l;
import J3.AbstractC1208p;
import J3.AbstractC1210s;
import J3.AbstractC1214w;
import J3.E;
import J3.F;
import J3.G;
import J3.U;
import L5.I;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import c4.InterfaceC1925a;
import com.google.android.material.internal.ViewUtils;
import com.stripe.android.customersheet.c;
import com.stripe.android.customersheet.e;
import com.stripe.android.paymentsheet.r;
import e4.AbstractC2612h0;
import e4.I0;
import h4.AbstractC2755b;
import j2.AbstractC3053E;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.s;
import q3.w;
import t4.AbstractC3794a;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0032a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0032a(Function1 function1) {
            super(0);
            this.f1928a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            this.f1928a.invoke(c.h.f23563a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1929a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1) {
            super(0);
            this.f1929a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            this.f1929a.invoke(c.d.f23558a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.a f1930a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f1931b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: E2.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0033a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f1932a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0033a(Function1 function1) {
                super(1);
                this.f1932a = function1;
            }

            public final void a(X2.g it) {
                AbstractC3159y.i(it, "it");
                this.f1932a.invoke(new c.b(it));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((X2.g) obj);
                return I.f6487a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f1933a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function1 function1) {
                super(1);
                this.f1933a = function1;
            }

            public final void a(w3.c cVar) {
                this.f1933a.invoke(new c.k(cVar));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((w3.c) obj);
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e.a aVar, Function1 function1) {
            super(2);
            this.f1930a = aVar;
            this.f1931b = function1;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(778901608, i8, -1, "com.stripe.android.customersheet.ui.AddPaymentMethod.<anonymous> (CustomerSheetScreen.kt:216)");
            }
            boolean p8 = this.f1930a.p();
            List z8 = this.f1930a.z();
            String v8 = this.f1930a.v();
            List s8 = this.f1930a.s();
            composer.startReplaceableGroup(936314931);
            boolean changed = composer.changed(this.f1931b);
            Function1 function1 = this.f1931b;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0033a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            composer.endReplaceableGroup();
            A3.a r8 = this.f1930a.r();
            B3.d A8 = this.f1930a.A();
            composer.startReplaceableGroup(936324640);
            boolean changed2 = composer.changed(this.f1931b);
            Function1 function13 = this.f1931b;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(function13);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            AbstractC1214w.b(p8, z8, v8, s8, function12, r8, A8, (Function1) rememberedValue2, null, null, composer, 2363456, ViewUtils.EDGE_TO_EDGE_FLAGS);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function1 function1) {
            super(0);
            this.f1934a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            this.f1934a.invoke(c.o.f23572a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.a f1935a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f1936b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1937c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1938d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e.a aVar, Function1 function1, boolean z8, int i8) {
            super(2);
            this.f1935a = aVar;
            this.f1936b = function1;
            this.f1937c = z8;
            this.f1938d = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            a.a(this.f1935a, this.f1936b, this.f1937c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1938d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f1939a = new f();

        f() {
            super(1);
        }

        public final void a(com.stripe.android.customersheet.c it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.customersheet.c) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.customersheet.e f1940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f1941b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: E2.a$g$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0034a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f1942a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0034a(Function1 function1) {
                super(0);
                this.f1942a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m8invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m8invoke() {
                this.f1942a.invoke(c.i.f23564a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f1943a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Function1 function1) {
                super(0);
                this.f1943a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m9invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m9invoke() {
                this.f1943a.invoke(c.C0462c.f23557a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.stripe.android.customersheet.e eVar, Function1 function1) {
            super(2);
            this.f1940a = eVar;
            this.f1941b = function1;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-751227532, i8, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen.<anonymous> (CustomerSheetScreen.kt:49)");
            }
            com.stripe.android.customersheet.e eVar = this.f1940a;
            composer.startReplaceableGroup(-1288185518);
            boolean changed = composer.changed(this.f1941b);
            Function1 function1 = this.f1941b;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0034a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            G i9 = eVar.i((Function0) rememberedValue);
            boolean z8 = !this.f1940a.g();
            composer.startReplaceableGroup(-1288179488);
            boolean changed2 = composer.changed(this.f1941b);
            Function1 function12 = this.f1941b;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(function12);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            F.b(i9, z8, (Function0) rememberedValue2, 0.0f, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.customersheet.e f1944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f1945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f1946c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1947d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(com.stripe.android.customersheet.e eVar, Function1 function1, Function1 function12, boolean z8) {
            super(2);
            this.f1944a = eVar;
            this.f1945b = function1;
            this.f1946c = function12;
            this.f1947d = z8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(10653779, i8, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen.<anonymous> (CustomerSheetScreen.kt:62)");
            }
            Modifier animateContentSize$default = AnimationModifierKt.animateContentSize$default(Modifier.Companion, null, null, 3, null);
            com.stripe.android.customersheet.e eVar = this.f1944a;
            Function1 function1 = this.f1945b;
            Function1 function12 = this.f1946c;
            boolean z8 = this.f1947d;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(animateContentSize$default);
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
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (eVar instanceof e.c) {
                composer.startReplaceableGroup(-387354332);
                q2.b.a(null, composer, 0, 1);
                composer.endReplaceableGroup();
            } else if (eVar instanceof e.d) {
                composer.startReplaceableGroup(-387200107);
                a.d((e.d) eVar, function1, function12, null, composer, 8, 8);
                K3.b.a(composer, 0);
                composer.endReplaceableGroup();
            } else if (eVar instanceof e.a) {
                composer.startReplaceableGroup(-386789295);
                a.a((e.a) eVar, function1, z8, composer, 8);
                K3.b.a(composer, 0);
                composer.endReplaceableGroup();
            } else if (eVar instanceof e.b) {
                composer.startReplaceableGroup(-386408243);
                a.c((e.b) eVar, null, composer, 8, 2);
                K3.b.a(composer, 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-386202031);
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
    public static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.customersheet.e f1948a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1949b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f1950c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f1951d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f1952e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1953f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f1954g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(com.stripe.android.customersheet.e eVar, boolean z8, Modifier modifier, Function1 function1, Function1 function12, int i8, int i9) {
            super(2);
            this.f1948a = eVar;
            this.f1949b = z8;
            this.f1950c = modifier;
            this.f1951d = function1;
            this.f1952e = function12;
            this.f1953f = i8;
            this.f1954g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            a.b(this.f1948a, this.f1949b, this.f1950c, this.f1951d, this.f1952e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1953f | 1), this.f1954g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.b f1955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f1956b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1957c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1958d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(e.b bVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f1955a = bVar;
            this.f1956b = modifier;
            this.f1957c = i8;
            this.f1958d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            a.c(this.f1955a, this.f1956b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1957c | 1), this.f1958d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1959a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function1 function1) {
            super(0);
            this.f1959a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m10invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10invoke() {
            this.f1959a.invoke(c.a.f23555a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Function1 function1) {
            super(1);
            this.f1960a = function1;
        }

        public final void a(AbstractC3991f abstractC3991f) {
            this.f1960a.invoke(new c.m(abstractC3991f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC3991f) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Function1 function1) {
            super(1);
            this.f1961a = function1;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
            this.f1961a.invoke(new c.n(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1962a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1) {
            super(1);
            this.f1962a = function1;
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
            this.f1962a.invoke(new c.l(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1963a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Function1 function1) {
            super(0);
            this.f1963a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m11invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m11invoke() {
            this.f1963a.invoke(c.o.f23572a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e.d f1964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f1965b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f1966c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f1967d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1968e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1969f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(e.d dVar, Function1 function1, Function1 function12, Modifier modifier, int i8, int i9) {
            super(2);
            this.f1964a = dVar;
            this.f1965b = function1;
            this.f1966c = function12;
            this.f1967d = modifier;
            this.f1968e = i8;
            this.f1969f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            a.d(this.f1964a, this.f1965b, this.f1966c, this.f1967d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1968e | 1), this.f1969f);
        }
    }

    public static final void a(e.a viewState, Function1 viewActionHandler, boolean z8, Composer composer, int i8) {
        Composer composer2;
        int i9;
        Modifier.Companion companion;
        AbstractC3159y.i(viewState, "viewState");
        AbstractC3159y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(-1037362630);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1037362630, i8, -1, "com.stripe.android.customersheet.ui.AddPaymentMethod (CustomerSheetScreen.kt:181)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(s.f37390e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1183625317);
        if (viewState.n()) {
            String stringResource = StringResources_androidKt.stringResource(w.f37463g, startRestartGroup, 0);
            String stringResource2 = StringResources_androidKt.stringResource(w.f37461f, startRestartGroup, 0);
            String stringResource3 = StringResources_androidKt.stringResource(w.f37429E, startRestartGroup, 0);
            String stringResource4 = StringResources_androidKt.stringResource(AbstractC3053E.f32863V, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1183644118);
            int i10 = (i8 & 112) ^ 48;
            boolean z9 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0032a(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1183640216);
            boolean z10 = (i10 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new b(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            i9 = 32;
            composer2 = startRestartGroup;
            I0.a(stringResource, stringResource2, stringResource3, stringResource4, true, function0, (Function0) rememberedValue2, startRestartGroup, 24576, 0);
        } else {
            composer2 = startRestartGroup;
            i9 = 32;
        }
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        String stringResource5 = StringResources_androidKt.stringResource(w.f37454b0, composer3, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        AbstractC2612h0.a(stringResource5, PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(4), 7, null), dimensionResource, 0.0f, 2, null), composer3, 0, 0);
        composer3.startReplaceableGroup(1183658150);
        int i11 = (i8 & 112) ^ 48;
        boolean z11 = (i11 > i9 && composer3.changed(viewActionHandler)) || (i8 & 48) == i9;
        Object rememberedValue3 = composer3.rememberedValue();
        if (z11 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new E2.b(viewActionHandler);
            composer3.updateRememberedValue(rememberedValue3);
        }
        E2.b bVar = (E2.b) rememberedValue3;
        composer3.endReplaceableGroup();
        composer3.startReplaceableGroup(1183662476);
        if (z8) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AbstractC2755b.a().provides(bVar)}, ComposableLambdaKt.composableLambda(composer3, 778901608, true, new c(viewState, viewActionHandler)), composer3, 56);
        }
        composer3.endReplaceableGroup();
        InterfaceC3983b q8 = viewState.q();
        composer3.startReplaceableGroup(1183693729);
        if (q8 == null) {
            companion = companion2;
        } else {
            companion = companion2;
            AbstractC1208p.a(AbstractC3794a.a(q8, composer3, 8), PaddingKt.m602paddingVpY3zN4$default(companion, dimensionResource, 0.0f, 2, null), composer3, 0, 0);
            I i12 = I.f6487a;
        }
        composer3.endReplaceableGroup();
        composer3.startReplaceableGroup(1183699210);
        if (viewState.y()) {
            InterfaceC3983b u8 = viewState.u();
            composer3.startReplaceableGroup(1183702537);
            String a8 = u8 == null ? null : AbstractC3794a.a(u8, composer3, 8);
            composer3.endReplaceableGroup();
            AbstractC1210s.a(a8, PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5178constructorimpl(8), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null), composer3, 0, 0);
        }
        composer3.endReplaceableGroup();
        String a9 = AbstractC3794a.a(viewState.x(), composer3, 8);
        boolean w8 = viewState.w();
        boolean g8 = viewState.g();
        Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(TestTagKt.testTag(companion, "CustomerSheetSaveButton"), 0.0f, Dp.m5178constructorimpl(10), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null);
        composer3.startReplaceableGroup(1183715865);
        boolean z12 = (i11 > i9 && composer3.changed(viewActionHandler)) || (i8 & 48) == i9;
        Object rememberedValue4 = composer3.rememberedValue();
        if (z12 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new d(viewActionHandler);
            composer3.updateRememberedValue(rememberedValue4);
        }
        composer3.endReplaceableGroup();
        Modifier.Companion companion3 = companion;
        q2.c.a(a9, w8, (Function0) rememberedValue4, m602paddingVpY3zN4$default, g8, true, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
        if (!viewState.y()) {
            InterfaceC3983b u9 = viewState.u();
            composer3.startReplaceableGroup(1183728265);
            String a10 = u9 == null ? null : AbstractC3794a.a(u9, composer3, 8);
            composer3.endReplaceableGroup();
            AbstractC1210s.a(a10, PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, Dp.m5178constructorimpl(8), 0.0f, 0.0f, 13, null), dimensionResource, 0.0f, 2, null), composer3, 0, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(viewState, viewActionHandler, z8, i8));
        }
    }

    public static final void b(com.stripe.android.customersheet.e viewState, boolean z8, Modifier modifier, Function1 function1, Function1 paymentMethodNameProvider, Composer composer, int i8, int i9) {
        boolean z9;
        Modifier modifier2;
        Function1 function12;
        AbstractC3159y.i(viewState, "viewState");
        AbstractC3159y.i(paymentMethodNameProvider, "paymentMethodNameProvider");
        Composer startRestartGroup = composer.startRestartGroup(-19930224);
        if ((i9 & 2) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 8) != 0) {
            function12 = f.f1939a;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-19930224, i8, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen (CustomerSheetScreen.kt:46)");
        }
        E.a(ComposableLambdaKt.composableLambda(startRestartGroup, -751227532, true, new g(viewState, function12)), ComposableLambdaKt.composableLambda(startRestartGroup, 10653779, true, new h(viewState, function12, paymentMethodNameProvider, z9)), modifier2, startRestartGroup, (i8 & 896) | 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(viewState, z9, modifier2, function12, paymentMethodNameProvider, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(e.b bVar, Modifier modifier, Composer composer, int i8, int i9) {
        Composer startRestartGroup = composer.startRestartGroup(-777233186);
        if ((i9 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-777233186, i8, -1, "com.stripe.android.customersheet.ui.EditPaymentMethod (CustomerSheetScreen.kt:280)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(s.f37390e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        AbstractC2612h0.a(StringResources_androidKt.stringResource(AbstractC3053E.f32851L0, startRestartGroup, 0), PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(20), 7, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
        AbstractC1204l.d(bVar.j(), modifier, startRestartGroup, i8 & 112, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new j(bVar, modifier, i8, i9));
        }
    }

    public static final void d(e.d viewState, Function1 viewActionHandler, Function1 paymentMethodNameProvider, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Modifier.Companion companion;
        Object obj;
        float f8;
        int i10;
        float f9;
        String a8;
        String q8;
        boolean z12;
        AbstractC3159y.i(viewState, "viewState");
        AbstractC3159y.i(viewActionHandler, "viewActionHandler");
        AbstractC3159y.i(paymentMethodNameProvider, "paymentMethodNameProvider");
        Composer startRestartGroup = composer.startRestartGroup(1248593812);
        if ((i9 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1248593812, i8, -1, "com.stripe.android.customersheet.ui.SelectPaymentMethod (CustomerSheetScreen.kt:102)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(s.f37390e, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        String s8 = viewState.s();
        startRestartGroup.startReplaceableGroup(2144020782);
        if (s8 == null) {
            s8 = StringResources_androidKt.stringResource(w.f37434J, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion3 = Modifier.Companion;
        float f10 = 20;
        AbstractC2612h0.a(s8, PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(f10), 7, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
        q3.o a9 = r.f26347a.a(viewState.d(), viewState.t(), false, viewState.o(), paymentMethodNameProvider, viewState.l(), viewState.c() instanceof InterfaceC1925a.b);
        List a10 = a9.a();
        com.stripe.android.paymentsheet.p b8 = a9.b();
        boolean e8 = viewState.e();
        boolean g8 = viewState.g();
        startRestartGroup.startReplaceableGroup(2144055215);
        int i11 = (i8 & 112) ^ 48;
        if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new k(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(2144058225);
        if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (z9 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new l(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        Function1 function1 = (Function1) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(2144061231);
        if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (z10 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new m(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        Function1 function12 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(2144064208);
        if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (z11 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new n(viewActionHandler);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        float f11 = 2;
        U.k(a10, b8, e8, g8, function0, function1, function12, (Function1) rememberedValue4, PaddingKt.m604paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m5178constructorimpl(f11), 7, null), null, startRestartGroup, 100663304, 512);
        String m8 = viewState.m();
        startRestartGroup.startReplaceableGroup(2144069663);
        if (m8 == null) {
            companion = companion3;
            obj = null;
            f8 = 0.0f;
        } else {
            companion = companion3;
            obj = null;
            f8 = 0.0f;
            AbstractC1208p.a(m8, PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m602paddingVpY3zN4$default(companion, 0.0f, Dp.m5178constructorimpl(f11), 1, null), dimensionResource, 0.0f, 2, null), startRestartGroup, 0, 0);
            I i12 = I.f6487a;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(2144078078);
        if (viewState.r() && (q8 = viewState.q()) != null) {
            boolean p8 = viewState.p();
            boolean g9 = viewState.g();
            Modifier m602paddingVpY3zN4$default = PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(TestTagKt.testTag(companion, "CustomerSheetConfirmButton"), 0.0f, Dp.m5178constructorimpl(f10), 0.0f, 0.0f, 13, null), dimensionResource, f8, 2, obj);
            startRestartGroup.startReplaceableGroup(1526540000);
            if ((i11 > 32 && startRestartGroup.changed(viewActionHandler)) || (i8 & 48) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new o(viewActionHandler);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            i10 = 1;
            f9 = 0.0f;
            q2.c.a(q8, p8, (Function0) rememberedValue5, m602paddingVpY3zN4$default, g9, false, startRestartGroup, 0, 32);
            I i13 = I.f6487a;
        } else {
            i10 = 1;
            f9 = 0.0f;
        }
        startRestartGroup.endReplaceableGroup();
        InterfaceC3983b n8 = viewState.n();
        startRestartGroup.startReplaceableGroup(2144101529);
        if (n8 == null) {
            a8 = null;
        } else {
            a8 = AbstractC3794a.a(n8, startRestartGroup, 8);
        }
        startRestartGroup.endReplaceableGroup();
        AbstractC1210s.a(a8, PaddingKt.m602paddingVpY3zN4$default(PaddingKt.m604paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, f9, i10, null), 0.0f, Dp.m5178constructorimpl(8), 0.0f, 0.0f, 13, null), dimensionResource, f9, 2, null), startRestartGroup, 0, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p(viewState, viewActionHandler, paymentMethodNameProvider, modifier2, i8, i9));
        }
    }
}
