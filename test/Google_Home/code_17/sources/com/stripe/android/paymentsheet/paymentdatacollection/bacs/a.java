package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.d;
import e4.n;
import h4.AbstractC2932h0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import m2.AbstractC3407E;
import m4.AbstractC3435g;
import m4.AbstractC3441m;
import t3.s;
import t3.t;
import t3.w;
import w4.AbstractC4148a;

/* loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0621a extends C3252v implements Function1 {
        C0621a(Object obj) {
            super(1, obj, com.stripe.android.paymentsheet.paymentdatacollection.bacs.e.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewAction;)V", 0);
        }

        public final void d(com.stripe.android.paymentsheet.paymentdatacollection.bacs.d p02) {
            AbstractC3255y.i(p02, "p0");
            ((com.stripe.android.paymentsheet.paymentdatacollection.bacs.e) this.receiver).g(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((com.stripe.android.paymentsheet.paymentdatacollection.bacs.d) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.bacs.e f27189a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27190b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27191c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.stripe.android.paymentsheet.paymentdatacollection.bacs.e eVar, int i8, int i9) {
            super(2);
            this.f27189a = eVar;
            this.f27190b = i8;
            this.f27191c = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            a.a(this.f27189a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27190b | 1), this.f27191c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G3.d f27192a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f27193b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f27194c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27195d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27196e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G3.d dVar, Function1 function1, Modifier modifier, int i8, int i9) {
            super(2);
            this.f27192a = dVar;
            this.f27193b = function1;
            this.f27194c = modifier;
            this.f27195d = i8;
            this.f27196e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            a.c(this.f27192a, this.f27193b, this.f27194c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27195d | 1), this.f27196e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27199c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f27200d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27201e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, String str3, String str4, int i8) {
            super(2);
            this.f27197a = str;
            this.f27198b = str2;
            this.f27199c = str3;
            this.f27200d = str4;
            this.f27201e = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            a.d(this.f27197a, this.f27198b, this.f27199c, this.f27200d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27201e | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27202a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f27204c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27205d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27206e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, Modifier modifier, int i8, int i9) {
            super(2);
            this.f27202a = str;
            this.f27203b = str2;
            this.f27204c = modifier;
            this.f27205d = i8;
            this.f27206e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            a.e(this.f27202a, this.f27203b, this.f27204c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27205d | 1), this.f27206e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f27208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27210d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f27211e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Modifier modifier, boolean z8, int i8, int i9) {
            super(2);
            this.f27207a = str;
            this.f27208b = modifier;
            this.f27209c = z8;
            this.f27210d = i8;
            this.f27211e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            a.f(this.f27207a, this.f27208b, this.f27209c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27210d | 1), this.f27211e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f27212a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1) {
            super(0);
            this.f27212a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5531invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5531invoke() {
            this.f27212a.invoke(d.b.f27222a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f27213a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function1 function1) {
            super(0);
            this.f27213a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5532invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5532invoke() {
            this.f27213a.invoke(d.c.f27223a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f27214a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1, int i8) {
            super(2);
            this.f27214a = function1;
            this.f27215b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            a.g(this.f27214a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27215b | 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r1 != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.stripe.android.paymentsheet.paymentdatacollection.bacs.e r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = -2134028887(0xffffffff80cd4da9, float:-1.8854136E-38)
            androidx.compose.runtime.Composer r11 = r11.startRestartGroup(r0)
            r1 = r13 & 1
            if (r1 == 0) goto Lf
            r2 = r12 | 2
            r9 = r2
            goto L10
        Lf:
            r9 = r12
        L10:
            r2 = 1
            if (r1 != r2) goto L24
            r2 = r9 & 11
            r3 = 2
            if (r2 != r3) goto L24
            boolean r2 = r11.getSkipping()
            if (r2 != 0) goto L1f
            goto L24
        L1f:
            r11.skipToGroupEnd()
            goto Lad
        L24:
            r11.startDefaults()
            r2 = r12 & 1
            if (r2 == 0) goto L3a
            boolean r2 = r11.getDefaultsInvalid()
            if (r2 == 0) goto L32
            goto L3a
        L32:
            r11.skipToGroupEnd()
            if (r1 == 0) goto L7a
        L37:
            r9 = r9 & (-15)
            goto L7a
        L3a:
            if (r1 == 0) goto L7a
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r11.startReplaceableGroup(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE
            r1 = 6
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.getCurrent(r11, r1)
            if (r2 == 0) goto L6e
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L58
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.getDefaultViewModelCreationExtras()
        L56:
            r5 = r10
            goto L5b
        L58:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
            goto L56
        L5b:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.stripe.android.paymentsheet.paymentdatacollection.bacs.e> r1 = com.stripe.android.paymentsheet.paymentdatacollection.bacs.e.class
            r3 = 0
            r4 = 0
            r6 = r11
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.endReplaceableGroup()
            com.stripe.android.paymentsheet.paymentdatacollection.bacs.e r10 = (com.stripe.android.paymentsheet.paymentdatacollection.bacs.e) r10
            goto L37
        L6e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L7a:
            r11.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L89
            r1 = -1
            java.lang.String r2 = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationFormScreen (BacsMandateConfirmationForm.kt:48)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r9, r1, r2)
        L89:
            o6.L r0 = r10.f()
            r1 = 8
            androidx.compose.runtime.State r0 = y4.f.a(r0, r11, r1)
            G3.d r1 = b(r0)
            com.stripe.android.paymentsheet.paymentdatacollection.bacs.a$a r2 = new com.stripe.android.paymentsheet.paymentdatacollection.bacs.a$a
            r2.<init>(r10)
            r5 = 8
            r6 = 4
            r3 = 0
            r4 = r11
            c(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lad
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lad:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.endRestartGroup()
            if (r11 == 0) goto Lbb
            com.stripe.android.paymentsheet.paymentdatacollection.bacs.a$b r0 = new com.stripe.android.paymentsheet.paymentdatacollection.bacs.a$b
            r0.<init>(r10, r12, r13)
            r11.updateScope(r0)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.bacs.a.a(com.stripe.android.paymentsheet.paymentdatacollection.bacs.e, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final G3.d b(State state) {
        return (G3.d) state.getValue();
    }

    public static final void c(G3.d state, Function1 viewActionHandler, Modifier modifier, Composer composer, int i8, int i9) {
        long m3013getWhite0d7_KjU;
        AbstractC3255y.i(state, "state");
        AbstractC3255y.i(viewActionHandler, "viewActionHandler");
        Composer startRestartGroup = composer.startRestartGroup(-1180186540);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1180186540, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationFormView (BacsMandateConfirmationForm.kt:60)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(s.f39712e, startRestartGroup, 0);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        Modifier m607paddingVpY3zN4$default = PaddingKt.m607paddingVpY3zN4$default(BackgroundKt.m287backgroundbw27NRU$default(modifier2, materialTheme.getColors(startRestartGroup, i10).m1187getSurface0d7_KjU(), null, 2, null), dimensionResource, 0.0f, 2, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = arrangement.m519spacedBy0680j_4(Dp.m5183constructorimpl(16));
        startRestartGroup.startReplaceableGroup(-483455358);
        Alignment.Companion companion = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m519spacedBy0680j_4, companion.getStart(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m607paddingVpY3zN4$default);
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
        String stringResource = StringResources_androidKt.stringResource(w.f39806t, startRestartGroup, 0);
        Modifier.Companion companion3 = Modifier.Companion;
        AbstractC2932h0.a(stringResource, PaddingKt.m609paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(2), 7, null), startRestartGroup, 48, 0);
        d(state.c(), state.d(), state.f(), state.a(), startRestartGroup, 0);
        f(StringResources_androidKt.stringResource(w.f39802p, new Object[]{state.c()}, startRestartGroup, 64), null, false, startRestartGroup, 0, 6);
        f(StringResources_androidKt.stringResource(w.f39809w, new Object[]{AbstractC4148a.a(state.e(), startRestartGroup, 8)}, startRestartGroup, 64), null, false, startRestartGroup, 0, 6);
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion2.getConstructor();
        InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
        Updater.m2508setimpl(m2501constructorimpl2, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        f(StringResources_androidKt.stringResource(w.f39810x, new Object[]{AbstractC4148a.a(state.b(), startRestartGroup, 8)}, startRestartGroup, 64), androidx.compose.foundation.layout.e.a(rowScopeInstance, companion3, 0.6f, false, 2, null), true, startRestartGroup, 384, 0);
        Modifier a8 = androidx.compose.foundation.layout.e.a(rowScopeInstance, companion3, 0.4f, false, 2, null);
        Alignment centerEnd = companion.getCenterEnd();
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor3 = companion2.getConstructor();
        InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(a8);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2501constructorimpl3 = Updater.m2501constructorimpl(startRestartGroup);
        Updater.m2508setimpl(m2501constructorimpl3, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
        if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (AbstractC3441m.s(materialTheme.getColors(startRestartGroup, i10).m1187getSurface0d7_KjU())) {
            m3013getWhite0d7_KjU = Color.Companion.m3002getBlack0d7_KjU();
        } else {
            m3013getWhite0d7_KjU = Color.Companion.m3013getWhite0d7_KjU();
        }
        IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(t.f39716a, startRestartGroup, 0), (String) null, (Modifier) null, Color.m2975copywmQWz5c$default(m3013getWhite0d7_KjU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, 56, 4);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        f(AbstractC4148a.a(state.g(), startRestartGroup, 8), null, true, startRestartGroup, 384, 2);
        g(viewActionHandler, startRestartGroup, (i8 >> 3) & 14);
        N3.b.a(startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(state, viewActionHandler, modifier2, i8, i9));
        }
    }

    public static final void d(String email, String nameOnAccount, String sortCode, String accountNumber, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3255y.i(email, "email");
        AbstractC3255y.i(nameOnAccount, "nameOnAccount");
        AbstractC3255y.i(sortCode, "sortCode");
        AbstractC3255y.i(accountNumber, "accountNumber");
        Composer startRestartGroup = composer.startRestartGroup(1563055350);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(email)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(nameOnAccount)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(sortCode)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(accountNumber)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        int i14 = i9;
        if ((i14 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1563055350, i14, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateDetails (BacsMandateConfirmationForm.kt:125)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m605padding3ABfNKs(BackgroundKt.m287backgroundbw27NRU$default(BorderKt.border(ClipKt.clip(companion, materialTheme.getShapes(startRestartGroup, i15).getSmall()), BorderStrokeKt.m314BorderStrokecXLIe8U(Dp.m5183constructorimpl(1), AbstractC3441m.n(materialTheme, startRestartGroup, i15).e()), materialTheme.getShapes(startRestartGroup, i15).getSmall()), AbstractC3441m.n(materialTheme, startRestartGroup, i15).d(), null, 2, null), Dp.m5183constructorimpl(12)), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(Dp.m5183constructorimpl(10));
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m519spacedBy0680j_4, companion2.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2508setimpl(m2501constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            e(StringResources_androidKt.stringResource(AbstractC3435g.f35155A, startRestartGroup, 0), email, null, startRestartGroup, (i14 << 3) & 112, 4);
            e(StringResources_androidKt.stringResource(AbstractC3407E.f34824K, startRestartGroup, 0), nameOnAccount, null, startRestartGroup, i14 & 112, 4);
            e(StringResources_androidKt.stringResource(n.f31734h, startRestartGroup, 0), sortCode, null, startRestartGroup, (i14 >> 3) & 112, 4);
            e(StringResources_androidKt.stringResource(n.f31726d, startRestartGroup, 0), accountNumber, null, startRestartGroup, (i14 >> 6) & 112, 4);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new d(email, nameOnAccount, sortCode, accountNumber, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r31, java.lang.String r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.bacs.a.e(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r59, androidx.compose.ui.Modifier r60, boolean r61, androidx.compose.runtime.Composer r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.bacs.a.f(java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, Composer composer, int i8) {
        int i9;
        boolean z8;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1347696627);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
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
                ComposerKt.traceEventStart(1347696627, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.MandateButtons (BacsMandateConfirmationForm.kt:215)");
            }
            Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(Dp.m5183constructorimpl(8));
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m519spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            boolean z9 = false;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            G3.b bVar = G3.b.f3008a;
            String stringResource = StringResources_androidKt.stringResource(w.f39752F, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(899775585);
            int i11 = i9 & 14;
            if (i11 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new g(function1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            G3.a.a(bVar, stringResource, (Function0) rememberedValue, startRestartGroup, 6);
            G3.b bVar2 = G3.b.f3009b;
            String stringResource2 = StringResources_androidKt.stringResource(w.f39807u, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(899785799);
            if (i11 == 4) {
                z9 = true;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new h(function1);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            G3.a.a(bVar2, stringResource2, (Function0) rememberedValue2, startRestartGroup, 6);
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
            endRestartGroup.updateScope(new i(function1, i8));
        }
    }
}
