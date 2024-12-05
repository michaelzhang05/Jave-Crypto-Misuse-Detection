package com.stripe.android.paymentsheet.addresselement;

import M3.AbstractC1309d;
import O5.I;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.stripe.android.paymentsheet.addresselement.e;
import com.stripe.android.paymentsheet.addresselement.g;
import i4.InterfaceC2987b;
import i6.AbstractC3001j;
import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;
import m4.AbstractC3441m;
import p4.C0;
import p4.s0;
import x4.AbstractC4191c;

/* loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L5.a f26639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L5.a aVar, String str, int i8) {
            super(2);
            this.f26639a = aVar;
            this.f26640b = str;
            this.f26641c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.a(this.f26639a, this.f26640b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26641c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f26642a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Application application) {
            super(0);
            this.f26642a = application;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Application invoke() {
            return this.f26642a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusRequester f26644b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusRequester focusRequester, S5.d dVar) {
            super(2, dVar);
            this.f26644b = focusRequester;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(FocusRequester focusRequester) {
            focusRequester.requestFocus();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f26644b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f26643a == 0) {
                t.b(obj);
                Handler handler = new Handler(Looper.getMainLooper());
                final FocusRequester focusRequester = this.f26644b;
                handler.post(new Runnable() { // from class: com.stripe.android.paymentsheet.addresselement.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c.m(FocusRequester.this);
                    }
                });
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26645a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26646a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.stripe.android.paymentsheet.addresselement.g gVar) {
                super(0);
                this.f26646a = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5519invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5519invoke() {
                this.f26646a.l();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.stripe.android.paymentsheet.addresselement.g gVar) {
            super(2);
            this.f26645a = gVar;
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
                ComposerKt.traceEventStart(924601935, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:91)");
            }
            AbstractC1309d.a(false, new a(this.f26645a), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.addresselement.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0587e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26647a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.addresselement.e$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26648a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(com.stripe.android.paymentsheet.addresselement.g gVar) {
                super(0);
                this.f26648a = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5520invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5520invoke() {
                this.f26648a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0587e(com.stripe.android.paymentsheet.addresselement.g gVar) {
            super(2);
            this.f26647a = gVar;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            long m2975copywmQWz5c$default;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1873091664, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:96)");
            }
            if (AbstractC3441m.s(AbstractC3441m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1187getSurface0d7_KjU())) {
                m2975copywmQWz5c$default = Color.m2975copywmQWz5c$default(Color.Companion.m3002getBlack0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m2975copywmQWz5c$default = Color.m2975copywmQWz5c$default(Color.Companion.m3013getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j8 = m2975copywmQWz5c$default;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier m607paddingVpY3zN4$default = PaddingKt.m607paddingVpY3zN4$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxWidth$default(BackgroundKt.m287backgroundbw27NRU$default(Modifier.Companion, j8, null, 2, null), 0.0f, 1, null))), 0.0f, Dp.m5183constructorimpl(8), 1, null);
            com.stripe.android.paymentsheet.addresselement.g gVar = this.f26647a;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
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
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            u3.h.a(new a(gVar), composer, 0);
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
    public static final class f extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f26649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f26651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f26652d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ State f26653e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f26654f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ State f26655a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26656b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ FocusRequester f26657c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ State f26658d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ State f26659e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Integer f26660f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.addresselement.e$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0588a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26661a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j4.d f26662b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0588a(com.stripe.android.paymentsheet.addresselement.g gVar, j4.d dVar) {
                    super(0);
                    this.f26661a = gVar;
                    this.f26662b = dVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5521invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5521invoke() {
                    this.f26661a.n(this.f26662b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(State state, com.stripe.android.paymentsheet.addresselement.g gVar, FocusRequester focusRequester, State state2, State state3, Integer num) {
                super(3);
                this.f26655a = state;
                this.f26656b = gVar;
                this.f26657c = focusRequester;
                this.f26658d = state2;
                this.f26659e = state3;
                this.f26660f = num;
            }

            @Override // a6.InterfaceC1669o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8278a;
            }

            public final void invoke(ColumnScope ScrollableColumn, Composer composer, int i8) {
                Composer composer2 = composer;
                AbstractC3255y.i(ScrollableColumn, "$this$ScrollableColumn");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(186630339, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous>.<anonymous> (AutocompleteScreen.kt:125)");
                }
                Modifier.Companion companion = Modifier.Companion;
                float f8 = 0.0f;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                State state = this.f26655a;
                com.stripe.android.paymentsheet.addresselement.g gVar = this.f26656b;
                FocusRequester focusRequester = this.f26657c;
                State state2 = this.f26658d;
                State state3 = this.f26659e;
                Integer num = this.f26660f;
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0 constructor = companion3.getConstructor();
                InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m2501constructorimpl = Updater.m2501constructorimpl(composer);
                Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f9 = 16;
                Modifier m607paddingVpY3zN4$default = PaddingKt.m607paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5183constructorimpl(f9), 0.0f, 2, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion3.getConstructor();
                InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m607paddingVpY3zN4$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m2501constructorimpl2 = Updater.m2501constructorimpl(composer);
                Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i9 = -483455358;
                com.stripe.android.paymentsheet.addresselement.g gVar2 = gVar;
                int i10 = 0;
                C0.e(FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), focusRequester), gVar.k(), ImeAction.Companion.m4873getDoneeUduSuo(), true, false, null, null, composer, (s0.f37711x << 3) | 3456, 112);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (e.d(state2)) {
                    composer2.startReplaceableGroup(-1658727889);
                    t2.b.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, composer, 6, 2);
                    composer.endReplaceableGroup();
                } else if (!n.u((CharSequence) state.getValue())) {
                    composer2.startReplaceableGroup(-1658445913);
                    List<j4.d> c8 = e.c(state3);
                    if (c8 != null) {
                        composer2.startReplaceableGroup(-1854612285);
                        if (!c8.isEmpty()) {
                            float f10 = 8;
                            DividerKt.m1218DivideroMI9zvI(PaddingKt.m607paddingVpY3zN4$default(companion, 0.0f, Dp.m5183constructorimpl(f10), 1, null), 0L, 0.0f, 0.0f, composer, 6, 14);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Function0 constructor3 = companion3.getConstructor();
                            InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer m2501constructorimpl3 = Updater.m2501constructorimpl(composer);
                            Updater.m2508setimpl(m2501constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            InterfaceC1668n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-915777576);
                            for (j4.d dVar : c8) {
                                SpannableString b8 = dVar.b();
                                SpannableString c9 = dVar.c();
                                com.stripe.android.paymentsheet.addresselement.g gVar3 = gVar2;
                                Modifier m606paddingVpY3zN4 = PaddingKt.m606paddingVpY3zN4(ClickableKt.m320clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.Companion, f8, 1, null), false, null, null, new C0588a(gVar3, dVar), 7, null), Dp.m5183constructorimpl(f9), Dp.m5183constructorimpl(f10));
                                composer2.startReplaceableGroup(i9);
                                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, i10);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i10);
                                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                Function0 constructor4 = companion4.getConstructor();
                                InterfaceC1669o modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m606paddingVpY3zN4);
                                if (!(composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer.useNode();
                                }
                                Composer m2501constructorimpl4 = Updater.m2501constructorimpl(composer);
                                Updater.m2508setimpl(m2501constructorimpl4, columnMeasurePolicy3, companion4.getSetMeasurePolicy());
                                Updater.m2508setimpl(m2501constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                InterfaceC1668n setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                if (m2501constructorimpl4.getInserting() || !AbstractC3255y.d(m2501constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    m2501constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m2501constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                modifierMaterializerOf4.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer2, Integer.valueOf(i10));
                                composer2.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                List D8 = AbstractC3001j.D(j6.j.d(new j6.j(n.A((String) state.getValue(), " ", "|", false, 4, null), j6.l.f34051c), b8, i10, 2, null));
                                ArrayList arrayList = new ArrayList(AbstractC1378t.x(D8, 10));
                                Iterator it = D8.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((j6.h) it.next()).getValue());
                                }
                                ArrayList<String> arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    if (!n.u((String) obj)) {
                                        arrayList2.add(obj);
                                    }
                                }
                                String spannableString = b8.toString();
                                AbstractC3255y.h(spannableString, "toString(...)");
                                String str = spannableString;
                                for (String str2 : arrayList2) {
                                    str = n.A(str, str2, "<b>" + str2 + "</b>", false, 4, null);
                                }
                                AnnotatedString e8 = AbstractC4191c.e(str, null, null, composer, 0, 6);
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i11 = MaterialTheme.$stable;
                                TextKt.m1420TextIbK3jfQ(e8, null, AbstractC3441m.n(materialTheme, composer2, i11).h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, materialTheme.getTypography(composer2, i11).getBody1(), composer, 0, 0, 131066);
                                String spannableString2 = c9.toString();
                                AbstractC3255y.h(spannableString2, "toString(...)");
                                TextKt.m1419Text4IGK_g(spannableString2, (Modifier) null, AbstractC3441m.n(materialTheme, composer, i11).h(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i11).getBody1(), composer, 0, 0, 65530);
                                composer.endReplaceableGroup();
                                composer.endNode();
                                composer.endReplaceableGroup();
                                composer.endReplaceableGroup();
                                DividerKt.m1218DivideroMI9zvI(PaddingKt.m607paddingVpY3zN4$default(Modifier.Companion, Dp.m5183constructorimpl(f9), 0.0f, 2, null), 0L, 0.0f, 0.0f, composer, 6, 14);
                                composer2 = composer;
                                f10 = f10;
                                i9 = -483455358;
                                i10 = 0;
                                f8 = 0.0f;
                                gVar2 = gVar3;
                            }
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                        }
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-1854521047);
                        if (num != null) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composer, 0), (String) null, TestTagKt.testTag(PaddingKt.m606paddingVpY3zN4(Modifier.Companion, Dp.m5183constructorimpl(f9), Dp.m5183constructorimpl(f9)), "AutocompleteAttributionDrawable"), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                            I i12 = I.f8278a;
                        }
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-1654922887);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(State state, com.stripe.android.paymentsheet.addresselement.g gVar, FocusRequester focusRequester, State state2, State state3, Integer num) {
            super(3);
            this.f26649a = state;
            this.f26650b = gVar;
            this.f26651c = focusRequester;
            this.f26652d = state2;
            this.f26653e = state3;
            this.f26654f = num;
        }

        public final void a(PaddingValues paddingValues, Composer composer, int i8) {
            int i9;
            AbstractC3255y.i(paddingValues, "paddingValues");
            if ((i8 & 14) == 0) {
                if (composer.changed(paddingValues)) {
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
                ComposerKt.traceEventStart(-927416248, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:118)");
            }
            u3.g.a(PaddingKt.padding(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 1, null)), paddingValues), ComposableLambdaKt.composableLambda(composer, 186630339, true, new a(this.f26649a, this.f26650b, this.f26651c, this.f26652d, this.f26653e, this.f26654f)), composer, 48, 0);
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
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.addresselement.g f26663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26664b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.stripe.android.paymentsheet.addresselement.g gVar, int i8) {
            super(2);
            this.f26663a = gVar;
            this.f26664b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            e.b(this.f26663a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26664b | 1));
        }
    }

    public static final void a(L5.a autoCompleteViewModelSubcomponentBuilderProvider, String str, Composer composer, int i8) {
        CreationExtras creationExtras;
        AbstractC3255y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        Composer startRestartGroup = composer.startRestartGroup(-1989348914);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1989348914, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreen (AutocompleteScreen.kt:57)");
        }
        Context applicationContext = ((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
        AbstractC3255y.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        g.f fVar = new g.f(autoCompleteViewModelSubcomponentBuilderProvider, new g.c(str), new b((Application) applicationContext));
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) com.stripe.android.paymentsheet.addresselement.g.class, current, (String) null, fVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            b((com.stripe.android.paymentsheet.addresselement.g) viewModel, startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(autoCompleteViewModelSubcomponentBuilderProvider, str, i8));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void b(com.stripe.android.paymentsheet.addresselement.g viewModel, Composer composer, int i8) {
        AbstractC3255y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-9884790);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9884790, i8, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:74)");
        }
        State a8 = y4.f.a(viewModel.j(), startRestartGroup, 8);
        State a9 = y4.f.a(viewModel.i(), startRestartGroup, 8);
        State a10 = y4.f.a(viewModel.k().j(), startRestartGroup, 8);
        Integer d8 = InterfaceC2987b.a.d(InterfaceC2987b.f32972a, DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0), null, 2, null);
        startRestartGroup.startReplaceableGroup(703913545);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        I i9 = I.f8278a;
        startRestartGroup.startReplaceableGroup(703915444);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new c(focusRequester, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(i9, (InterfaceC1668n) rememberedValue2, startRestartGroup, 70);
        ScaffoldKt.m1325Scaffold27mzLpw(null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 924601935, true, new d(viewModel)), ComposableLambdaKt.composableLambda(startRestartGroup, 1873091664, true, new C0587e(viewModel)), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1187getSurface0d7_KjU(), 0L, ComposableLambdaKt.composableLambda(startRestartGroup, -927416248, true, new f(a10, viewModel, focusRequester, a9, a8, d8)), startRestartGroup, 3456, 12582912, 98291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(viewModel, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(State state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
