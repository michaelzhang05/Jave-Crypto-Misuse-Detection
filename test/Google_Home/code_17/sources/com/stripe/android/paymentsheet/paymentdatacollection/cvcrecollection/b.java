package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import M3.F;
import O5.I;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldKt;
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
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c;
import h4.AbstractC2932h0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.M;
import m4.AbstractC3441m;
import p4.C0;
import p4.X;
import p4.p0;
import p4.x0;
import t3.w;
import x4.AbstractC4189a;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f27270a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5534invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5534invoke() {
            this.f27270a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0633b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27271a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f27272b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0633b(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f27271a = z8;
            this.f27272b = function0;
            this.f27273c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.a(this.f27271a, this.f27272b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27273c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27274a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusRequester f27275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FocusRequester focusRequester, S5.d dVar) {
            super(2, dVar);
            this.f27275b = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f27275b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f27274a == 0) {
                t.b(obj);
                this.f27275b.requestFocus();
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
        final /* synthetic */ long f27276a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f27277b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusRequester f27278c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ H3.g f27279d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f27280e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f27281a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1) {
                super(1);
                this.f27281a = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return I.f8278a;
            }

            public final void invoke(String it) {
                AbstractC3255y.i(it, "it");
                this.f27281a.invoke(it);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0634b extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ H3.g f27282a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0634b(H3.g gVar) {
                super(2);
                this.f27282a = gVar;
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
                    ComposerKt.traceEventStart(1638127461, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionScreen.kt:193)");
                }
                X.a(StringResources_androidKt.stringResource(this.f27282a.d(), composer, 0), null, false, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ H3.g f27283a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(H3.g gVar) {
                super(2);
                this.f27283a = gVar;
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
                    ComposerKt.traceEventStart(105090984, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionScreen.kt:196)");
                }
                C0.u(this.f27283a.c(), false, null, composer, x0.c.f37811e | 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j8, Function1 function1, FocusRequester focusRequester, H3.g gVar, String str) {
            super(2);
            this.f27276a = j8;
            this.f27277b = function1;
            this.f27278c = focusRequester;
            this.f27279d = gVar;
            this.f27280e = str;
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
                ComposerKt.traceEventStart(334418597, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous> (CvcRecollectionScreen.kt:136)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier height = IntrinsicKt.height(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), IntrinsicSize.Min);
            long j8 = this.f27276a;
            Function1 function1 = this.f27277b;
            FocusRequester focusRequester = this.f27278c;
            H3.g gVar = this.f27279d;
            String str = this.f27280e;
            composer.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(height);
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
            Modifier m287backgroundbw27NRU$default = BackgroundKt.m287backgroundbw27NRU$default(SizeKt.fillMaxSize$default(rowScopeInstance.weight(companion, 0.5f, true), 0.0f, 1, null), j8, null, 2, null);
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m287backgroundbw27NRU$default);
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
            Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenterStart()), Dp.m5183constructorimpl(12));
            Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = arrangement.m519spacedBy0680j_4(Dp.m5183constructorimpl(6));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m519spacedBy0680j_4, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m2501constructorimpl3 = Updater.m2501constructorimpl(composer);
            Updater.m2508setimpl(m2501constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(gVar.a().k(), composer, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 124);
            String stringResource = StringResources_androidKt.stringResource(w.f39767U, new Object[]{" " + str}, composer, 64);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextKt.m1419Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(composer, i9).getBody1(), composer, 0, 0, 65534);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            DividerKt.m1218DivideroMI9zvI(SizeKt.fillMaxHeight$default(SizeKt.m657width3ABfNKs(companion, Dp.m5183constructorimpl(1)), 0.0f, 1, null), AbstractC3441m.n(materialTheme, composer, i9).e(), 0.0f, 0.0f, composer, 6, 12);
            List e8 = AbstractC1378t.e(AutofillType.CreditCardSecurityCode);
            composer.startReplaceableGroup(1517714320);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            TextFieldKt.TextField(gVar.b(), function1, FocusRequesterModifierKt.focusRequester(rowScopeInstance.weight(SizeKt.fillMaxWidth$default(AbstractC4189a.a(companion, e8, (Function1) rememberedValue, composer, 54), 0.0f, 1, null), 0.5f, true), focusRequester), false, false, (TextStyle) null, (InterfaceC1668n) ComposableLambdaKt.composableLambda(composer, 1638127461, true, new C0634b(gVar)), (InterfaceC1668n) null, (InterfaceC1668n) null, (InterfaceC1668n) ComposableLambdaKt.composableLambda(composer, 105090984, true, new c(gVar)), false, (VisualTransformation) null, new KeyboardOptions(0, false, KeyboardType.Companion.m4924getNumberPasswordPjHm6EE(), 0, 11, null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) materialTheme.getShapes(composer, i9).getLarge(), C0.d(false, composer, 0, 1), composer, 806879232, 24960, 241080);
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
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H3.g f27285b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f27286c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27287d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, H3.g gVar, Function1 function1, int i8) {
            super(2);
            this.f27284a = str;
            this.f27285b = gVar;
            this.f27286c = function1;
            this.f27287d = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.b(this.f27284a, this.f27285b, this.f27286c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27287d | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H3.e f27288a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f27289b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3252v implements Function1 {
            a(Object obj) {
                super(1, obj, H3.e.class, "onCvcChanged", "onCvcChanged(Ljava/lang/String;)V", 0);
            }

            public final void d(String p02) {
                AbstractC3255y.i(p02, "p0");
                ((H3.e) this.receiver).b(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((String) obj);
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(H3.e eVar, State state) {
            super(2);
            this.f27288a = eVar;
            this.f27289b = state;
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
                ComposerKt.traceEventStart(66292912, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionPaymentSheetScreen.<anonymous> (CvcRecollectionScreen.kt:96)");
            }
            Modifier m607paddingVpY3zN4$default = PaddingKt.m607paddingVpY3zN4$default(BackgroundKt.m287backgroundbw27NRU$default(Modifier.Companion, AbstractC3441m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1187getSurface0d7_KjU(), null, 2, null), Dp.m5183constructorimpl(20), 0.0f, 2, null);
            H3.e eVar = this.f27288a;
            State state = this.f27289b;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b.f(composer, 0);
            b.b(b.d(state).d(), b.d(state).c(), new a(eVar), composer, 0);
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
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H3.e f27290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(H3.e eVar, int i8) {
            super(2);
            this.f27290a = eVar;
            this.f27291b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.c(this.f27290a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27291b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f27293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27294c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ H3.g f27295d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f27296a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function1 function1) {
                super(0);
                this.f27296a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5535invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5535invoke() {
                this.f27296a.invoke(c.a.f27309a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b$h$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0635b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f27297a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0635b(Function1 function1) {
                super(1);
                this.f27297a = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return I.f8278a;
            }

            public final void invoke(String it) {
                AbstractC3255y.i(it, "it");
                this.f27297a.invoke(new c.C0636c(it));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f27298a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Function1 function1) {
                super(0);
                this.f27298a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5536invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5536invoke() {
                this.f27298a.invoke(c.b.f27310a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, Function1 function1, String str, H3.g gVar) {
            super(2);
            this.f27292a = z8;
            this.f27293b = function1;
            this.f27294c = str;
            this.f27295d = gVar;
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
                ComposerKt.traceEventStart(891453526, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreen.<anonymous> (CvcRecollectionScreen.kt:66)");
            }
            Modifier m607paddingVpY3zN4$default = PaddingKt.m607paddingVpY3zN4$default(BackgroundKt.m287backgroundbw27NRU$default(Modifier.Companion, AbstractC3441m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).g().m1187getSurface0d7_KjU(), null, 2, null), Dp.m5183constructorimpl(20), 0.0f, 2, null);
            boolean z8 = this.f27292a;
            Function1 function1 = this.f27293b;
            String str = this.f27294c;
            H3.g gVar = this.f27295d;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceableGroup(161246301);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            b.g(z8, (Function0) rememberedValue, composer, 0);
            b.f(composer, 0);
            composer.startReplaceableGroup(161255073);
            boolean changed2 = composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new C0635b(function1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            b.b(str, gVar, (Function1) rememberedValue2, composer, 0);
            boolean e8 = gVar.e();
            composer.startReplaceableGroup(161260448);
            boolean changed3 = composer.changed(function1);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new c(function1);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            b.a(e8, (Function0) rememberedValue3, composer, 0);
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
    public static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27300b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H3.g f27301c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f27302d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27303e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, boolean z8, H3.g gVar, Function1 function1, int i8) {
            super(2);
            this.f27299a = str;
            this.f27300b = z8;
            this.f27301c = gVar;
            this.f27302d = function1;
            this.f27303e = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.e(this.f27299a, this.f27300b, this.f27301c, this.f27302d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27303e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f27304a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i8) {
            super(2);
            this.f27304a = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.f(composer, RecomposeScopeImplKt.updateChangedFlags(this.f27304a | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27305a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Function0 function0) {
            super(0);
            this.f27305a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5537invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5537invoke() {
            this.f27305a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27306a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f27307b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z8, Function0 function0, int i8) {
            super(2);
            this.f27306a = z8;
            this.f27307b = function0;
            this.f27308c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            b.g(this.f27306a, this.f27307b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27308c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z8, Function0 function0, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1690775401);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1690775401, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionButton (CvcRecollectionScreen.kt:241)");
            }
            boolean z9 = false;
            float f8 = 0;
            Modifier testTag = TestTagKt.testTag(PaddingKt.m608paddingqDBjuR0(SizeKt.fillMaxWidth(Modifier.Companion, 1.0f), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(32), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(20)), "CVC_CONFIRM");
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(w.f39752F, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(78247732);
            if ((i9 & 112) == 32) {
                z9 = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            com.stripe.android.paymentsheet.ui.c.i(stringResource, false, z8, null, null, (Function0) rememberedValue, startRestartGroup, ((i9 << 6) & 896) | 48, 24);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new C0633b(z8, function0, i8));
        }
    }

    public static final void b(String lastFour, H3.g cvcState, Function1 onValueChanged, Composer composer, int i8) {
        int i9;
        long m2975copywmQWz5c$default;
        int i10;
        int i11;
        int i12;
        AbstractC3255y.i(lastFour, "lastFour");
        AbstractC3255y.i(cvcState, "cvcState");
        AbstractC3255y.i(onValueChanged, "onValueChanged");
        Composer startRestartGroup = composer.startRestartGroup(-122860128);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(lastFour)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(cvcState)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(onValueChanged)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-122860128, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField (CvcRecollectionScreen.kt:118)");
            }
            if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0)) {
                m2975copywmQWz5c$default = Color.m2975copywmQWz5c$default(Color.Companion.m3013getWhite0d7_KjU(), 0.075f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m2975copywmQWz5c$default = Color.m2975copywmQWz5c$default(Color.Companion.m3002getBlack0d7_KjU(), 0.075f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            long j8 = m2975copywmQWz5c$default;
            startRestartGroup.startReplaceableGroup(331790769);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(331792356);
            if (!((Boolean) startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                I i13 = I.f8278a;
                startRestartGroup.startReplaceableGroup(331794365);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new c(focusRequester, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(i13, (InterfaceC1668n) rememberedValue2, startRestartGroup, 70);
            }
            startRestartGroup.endReplaceableGroup();
            p0.b(null, null, false, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, 334418597, true, new d(j8, onValueChanged, focusRequester, cvcState, lastFour)), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(lastFour, cvcState, onValueChanged, i8));
        }
    }

    public static final void c(H3.e interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3255y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(-1132926818);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1132926818, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionPaymentSheetScreen (CvcRecollectionScreen.kt:92)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 66292912, true, new f(interactor, y4.f.a(interactor.a(), startRestartGroup, 8))), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(interactor, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H3.f d(State state) {
        return (H3.f) state.getValue();
    }

    public static final void e(String lastFour, boolean z8, H3.g cvcState, Function1 viewActionHandler, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3255y.i(lastFour, "lastFour");
        AbstractC3255y.i(cvcState, "cvcState");
        AbstractC3255y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(-694222012);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(lastFour)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(cvcState)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(viewActionHandler)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-694222012, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreen (CvcRecollectionScreen.kt:64)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 891453526, true, new h(z8, viewActionHandler, lastFour, cvcState)), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(lastFour, z8, cvcState, viewActionHandler, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(802797669);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802797669, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionTitle (CvcRecollectionScreen.kt:230)");
            }
            float f8 = 0;
            AbstractC2932h0.a(StringResources_androidKt.stringResource(w.f39753G, startRestartGroup, 0), PaddingKt.m608paddingqDBjuR0(Modifier.Companion, Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(16)), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new j(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z8, Function0 function0, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1018538037);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1018538037, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionTopBar (CvcRecollectionScreen.kt:210)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean z9 = false;
            float f8 = 0;
            float f9 = 16;
            Modifier m638height3ABfNKs = SizeKt.m638height3ABfNKs(PaddingKt.m608paddingqDBjuR0(companion, Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f9), Dp.m5183constructorimpl(f8), Dp.m5183constructorimpl(f8)), Dp.m5183constructorimpl(32));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m638height3ABfNKs);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1173693210);
            if (z8) {
                F.d(startRestartGroup, 0);
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(androidx.compose.foundation.layout.e.a(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1173688598);
            if ((i9 & 112) == 32) {
                z9 = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new k(function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            IconButtonKt.IconButton((Function0) rememberedValue, OffsetKt.m565offsetVpY3zN4(companion, Dp.m5183constructorimpl(f9), Dp.m5183constructorimpl(-Dp.m5183constructorimpl(8))), false, null, H3.b.f3525a.a(), startRestartGroup, 24576, 12);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(z8, function0, i8));
        }
    }
}
