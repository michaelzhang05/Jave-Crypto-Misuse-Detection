package com.stripe.android.paymentsheet.addresselement;

import M3.AbstractC1309d;
import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.stripe.android.paymentsheet.addresselement.j;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import p4.AbstractC3765l;
import t3.w;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FocusManager f26708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f26709b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0594a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FocusManager f26710a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f26711b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0594a(FocusManager focusManager, Function0 function0) {
                super(0);
                this.f26710a = focusManager;
                this.f26711b = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5523invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5523invoke() {
                androidx.compose.ui.focus.b.a(this.f26710a, false, 1, null);
                this.f26711b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FocusManager focusManager, Function0 function0) {
            super(2);
            this.f26708a = focusManager;
            this.f26709b = function0;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-833687647, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:45)");
            }
            AbstractC1309d.a(true, new C0594a(this.f26708a, this.f26709b), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f26713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f26714c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f26715d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f26716e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FocusManager f26717f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f26718g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f26719a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1669o f26720b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC1669o f26721c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f26722d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f26723e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FocusManager f26724f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0 f26725g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0595a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FocusManager f26726a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function0 f26727b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0595a(FocusManager focusManager, Function0 function0) {
                    super(0);
                    this.f26726a = focusManager;
                    this.f26727b = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5524invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5524invoke() {
                    androidx.compose.ui.focus.b.a(this.f26726a, false, 1, null);
                    this.f26727b.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, String str2, boolean z8, FocusManager focusManager, Function0 function0) {
                super(3);
                this.f26719a = str;
                this.f26720b = interfaceC1669o;
                this.f26721c = interfaceC1669o2;
                this.f26722d = str2;
                this.f26723e = z8;
                this.f26724f = focusManager;
                this.f26725g = function0;
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8278a;
            }

            public final void invoke(ColumnScope ScrollableColumn, Composer composer, int i8) {
                AbstractC3255y.i(ScrollableColumn, "$this$ScrollableColumn");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(178055957, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:57)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m607paddingVpY3zN4$default = PaddingKt.m607paddingVpY3zN4$default(companion, Dp.m5183constructorimpl(20), 0.0f, 2, null);
                String str = this.f26719a;
                InterfaceC1669o interfaceC1669o = this.f26720b;
                InterfaceC1669o interfaceC1669o2 = this.f26721c;
                String str2 = this.f26722d;
                boolean z8 = this.f26723e;
                FocusManager focusManager = this.f26724f;
                Function0 function0 = this.f26725g;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0 constructor = companion2.getConstructor();
                InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m607paddingVpY3zN4$default);
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
                Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m1419Text4IGK_g(str, PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH4(), composer, 48, 0, 65532);
                interfaceC1669o.invoke(columnScopeInstance, composer, 6);
                interfaceC1669o2.invoke(columnScopeInstance, composer, 6);
                t2.c.a(str2, z8, new C0595a(focusManager, function0), PaddingKt.m607paddingVpY3zN4$default(companion, 0.0f, Dp.m5183constructorimpl(16), 1, null), false, false, composer, 3072, 48);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, String str2, boolean z8, FocusManager focusManager, Function0 function0) {
            super(3);
            this.f26712a = str;
            this.f26713b = interfaceC1669o;
            this.f26714c = interfaceC1669o2;
            this.f26715d = str2;
            this.f26716e = z8;
            this.f26717f = focusManager;
            this.f26718g = function0;
        }

        public final void a(PaddingValues it, Composer composer, int i8) {
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
                ComposerKt.traceEventStart(973020890, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:54)");
            }
            u3.g.a(PaddingKt.padding(Modifier.Companion, it), ComposableLambdaKt.composableLambda(composer, 178055957, true, new a(this.f26712a, this.f26713b, this.f26714c, this.f26715d, this.f26716e, this.f26717f, this.f26718g)), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f26728a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26729b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26730c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f26731d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f26732e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f26733f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f26734g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26735h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, String str, String str2, Function0 function0, Function0 function02, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, int i8) {
            super(2);
            this.f26728a = z8;
            this.f26729b = str;
            this.f26730c = str2;
            this.f26731d = function0;
            this.f26732e = function02;
            this.f26733f = interfaceC1669o;
            this.f26734g = interfaceC1669o2;
            this.f26735h = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(this.f26728a, this.f26729b, this.f26730c, this.f26731d, this.f26732e, this.f26733f, this.f26734g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26735h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f26736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f26737b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f26738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j jVar, State state, State state2) {
            super(0);
            this.f26736a = jVar;
            this.f26737b = state;
            this.f26738c = state2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5525invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5525invoke() {
            this.f26736a.j(i.d(this.f26737b), i.f(this.f26738c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f26739a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j jVar) {
            super(0);
            this.f26739a = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5526invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5526invoke() {
            com.stripe.android.paymentsheet.addresselement.a.b(this.f26739a.r(), null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u3.i f26740a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f26741b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(u3.i iVar, j jVar) {
            super(3);
            this.f26740a = iVar;
            this.f26741b = jVar;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(ColumnScope InputAddressScreen, Composer composer, int i8) {
            AbstractC3255y.i(InputAddressScreen, "$this$InputAddressScreen");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(814782016, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:119)");
            }
            e4.i.b(this.f26740a.d(), this.f26741b.q(), this.f26740a.b(), this.f26740a.e(), null, composer, 4680, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f26742a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f26743b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f26744c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f26745a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ State f26746b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, State state) {
                super(1);
                this.f26745a = jVar;
                this.f26746b = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return I.f8278a;
            }

            public final void invoke(boolean z8) {
                this.f26745a.i(!i.f(this.f26746b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j jVar, State state, State state2) {
            super(3);
            this.f26742a = jVar;
            this.f26743b = state;
            this.f26744c = state2;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(ColumnScope InputAddressScreen, Composer composer, int i8) {
            u3.d a8;
            AbstractC3255y.i(InputAddressScreen, "$this$InputAddressScreen");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1989616575, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:127)");
            }
            u3.e a9 = this.f26742a.l().a();
            String a10 = (a9 == null || (a8 = a9.a()) == null) ? null : a8.a();
            if (a10 != null) {
                State state = this.f26743b;
                AbstractC3765l.a(null, null, i.f(state), a10, i.e(this.f26744c), new a(this.f26742a, state), composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L5.a f26747a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(L5.a aVar, int i8) {
            super(2);
            this.f26747a = aVar;
            this.f26748b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f26747a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26748b | 1));
        }
    }

    public static final void a(L5.a inputAddressViewModelSubcomponentBuilderProvider, Composer composer, int i8) {
        CreationExtras creationExtras;
        String str;
        AbstractC3255y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        Composer startRestartGroup = composer.startRestartGroup(1998888381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1998888381, i8, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:84)");
        }
        j.d dVar = new j.d(inputAddressViewModelSubcomponentBuilderProvider);
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) j.class, current, (String) null, dVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            j jVar = (j) viewModel;
            State a8 = y4.f.a(jVar.p(), startRestartGroup, 8);
            String str2 = null;
            if (c(a8) == null) {
                startRestartGroup.startReplaceableGroup(-1514223121);
                t2.b.b(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0L, startRestartGroup, 6, 2);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1514070105);
                u3.i c8 = c(a8);
                if (c8 != null) {
                    State a9 = y4.f.a(c8.a(), startRestartGroup, 8);
                    u3.e a10 = jVar.l().a();
                    if (a10 != null) {
                        str = a10.l();
                    } else {
                        str = null;
                    }
                    startRestartGroup.startReplaceableGroup(-1988501175);
                    boolean z8 = false;
                    if (str == null) {
                        str = StringResources_androidKt.stringResource(w.f39799n, startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceableGroup();
                    u3.e a11 = jVar.l().a();
                    if (a11 != null) {
                        str2 = a11.s();
                    }
                    startRestartGroup.startReplaceableGroup(-1988495675);
                    if (str2 == null) {
                        str2 = StringResources_androidKt.stringResource(w.f39801o, startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceableGroup();
                    State a12 = y4.f.a(jVar.q(), startRestartGroup, 8);
                    State a13 = y4.f.a(jVar.m(), startRestartGroup, 8);
                    if (d(a9) != null) {
                        z8 = true;
                    }
                    b(z8, str, str2, new d(jVar, a9, a13), new e(jVar), ComposableLambdaKt.composableLambda(startRestartGroup, 814782016, true, new f(c8, jVar)), ComposableLambdaKt.composableLambda(startRestartGroup, -1989616575, true, new g(jVar, a13, a12)), startRestartGroup, 1769472);
                }
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new h(inputAddressViewModelSubcomponentBuilderProvider, i8));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void b(boolean z8, String primaryButtonText, String title, Function0 onPrimaryButtonClick, Function0 onCloseClick, InterfaceC1669o formContent, InterfaceC1669o checkboxContent, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC3255y.i(primaryButtonText, "primaryButtonText");
        AbstractC3255y.i(title, "title");
        AbstractC3255y.i(onPrimaryButtonClick, "onPrimaryButtonClick");
        AbstractC3255y.i(onCloseClick, "onCloseClick");
        AbstractC3255y.i(formContent, "formContent");
        AbstractC3255y.i(checkboxContent, "checkboxContent");
        Composer startRestartGroup = composer.startRestartGroup(642189468);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i9 = i16 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(primaryButtonText)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i9 |= i15;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(title)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i9 |= i14;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(onPrimaryButtonClick)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i9 |= i13;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changedInstance(onCloseClick)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i9 |= i12;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changedInstance(formContent)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i9 |= i11;
        }
        if ((3670016 & i8) == 0) {
            if (startRestartGroup.changedInstance(checkboxContent)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i9 |= i10;
        }
        if ((2995931 & i9) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(642189468, i9, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:37)");
            }
            FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            composer2 = startRestartGroup;
            ScaffoldKt.m1325Scaffold27mzLpw(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null)), null, ComposableLambdaKt.composableLambda(startRestartGroup, -833687647, true, new a(focusManager, onCloseClick)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1187getSurface0d7_KjU(), 0L, ComposableLambdaKt.composableLambda(composer2, 973020890, true, new b(title, formContent, checkboxContent, primaryButtonText, z8, focusManager, onPrimaryButtonClick)), composer2, 384, 12582912, 98298);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, primaryButtonText, title, onPrimaryButtonClick, onCloseClick, formContent, checkboxContent, i8));
        }
    }

    private static final u3.i c(State state) {
        return (u3.i) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d(State state) {
        return (Map) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
