package com.stripe.android.paymentsheet.ui;

import M3.K;
import M3.O;
import O5.I;
import O5.p;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.res.ColorResources_androidKt;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.ui.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.C3427m;
import t1.EnumC4024b;
import t3.r;

/* loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0655a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f27612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27613b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B3.b f27614c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3427m.a f27615d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f27616e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f27617f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f27618g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f27619h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f27620i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0655a(PrimaryButton.a aVar, boolean z8, B3.b bVar, C3427m.a aVar2, boolean z9, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f27612a = aVar;
            this.f27613b = z8;
            this.f27614c = bVar;
            this.f27615d = aVar2;
            this.f27616e = z9;
            this.f27617f = function0;
            this.f27618g = modifier;
            this.f27619h = i8;
            this.f27620i = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            a.a(this.f27612a, this.f27613b, this.f27614c, this.f27615d, this.f27616e, this.f27617f, this.f27618g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27619h | 1), this.f27620i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f27621a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.ui.d f27622b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f27623c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0656a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PrimaryButton.a f27624a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0656a(PrimaryButton.a aVar) {
                super(0);
                this.f27624a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5547invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5547invoke() {
                PrimaryButton.a aVar = this.f27624a;
                if (aVar instanceof PrimaryButton.a.C0649a) {
                    ((PrimaryButton.a.C0649a) aVar).a().invoke();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0657b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0657b f27625a = new C0657b();

            C0657b() {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5548invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5548invoke();
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, com.stripe.android.paymentsheet.ui.d dVar, PrimaryButton.a aVar) {
            super(2);
            this.f27621a = modifier;
            this.f27622b = dVar;
            this.f27623c = aVar;
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
                ComposerKt.traceEventStart(-1177645661, i8, -1, "com.stripe.android.paymentsheet.ui.GooglePrimaryButton.<anonymous> (GooglePayButton.kt:105)");
            }
            Modifier testTag = TestTagKt.testTag(this.f27621a, "google-pay-primary-button");
            com.stripe.android.paymentsheet.ui.d dVar = this.f27622b;
            PrimaryButton.a aVar = this.f27623c;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-549781922);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0656a(aVar);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            com.stripe.android.paymentsheet.ui.c.i("", true, true, dVar, (Function0) rememberedValue, C0657b.f27625a, composer, 197046, 0);
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
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f27626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f27627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27628c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27629d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Modifier modifier, PrimaryButton.a aVar, int i8, int i9) {
            super(2);
            this.f27626a = modifier;
            this.f27627b = aVar;
            this.f27628c = i8;
            this.f27629d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            a.b(this.f27626a, this.f27627b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27628c | 1), this.f27629d);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27630a;

        static {
            int[] iArr = new int[B3.b.values().length];
            try {
                iArr[B3.b.f796b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B3.b.f795a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B3.b.f797c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[B3.b.f798d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[B3.b.f799e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[B3.b.f800f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[B3.b.f802h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[B3.b.f801g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f27630a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.stripe.android.paymentsheet.ui.PrimaryButton.a r18, boolean r19, B3.b r20, m2.C3427m.a r21, boolean r22, kotlin.jvm.functions.Function0 r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.a.a(com.stripe.android.paymentsheet.ui.PrimaryButton$a, boolean, B3.b, m2.m$a, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Modifier modifier, PrimaryButton.a aVar, Composer composer, int i8, int i9) {
        Modifier modifier2;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        com.stripe.android.paymentsheet.ui.d dVar;
        Composer startRestartGroup = composer.startRestartGroup(206308520);
        int i13 = i9 & 1;
        if (i13 != 0) {
            i10 = i8 | 6;
            modifier2 = modifier;
        } else if ((i8 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            modifier2 = modifier;
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i13 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206308520, i10, -1, "com.stripe.android.paymentsheet.ui.GooglePrimaryButton (GooglePayButton.kt:82)");
            }
            if (aVar instanceof PrimaryButton.a.C0649a) {
                dVar = d.a.f27760a;
            } else {
                dVar = d.c.f27762a;
            }
            int i14 = r.f39703a;
            long colorResource = ColorResources_androidKt.colorResource(i14, startRestartGroup, 0);
            int i15 = r.f39704b;
            O.a(new K(colorResource, ColorResources_androidKt.colorResource(i15, startRestartGroup, 0), ColorResources_androidKt.colorResource(i14, startRestartGroup, 0), ColorResources_androidKt.colorResource(i15, startRestartGroup, 0), 0L, 16, null), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1177645661, true, new b(modifier3, dVar, aVar)), startRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(modifier3, aVar, i8, i9));
        }
    }

    private static final EnumC4024b d(B3.b bVar) {
        switch (d.f27630a[bVar.ordinal()]) {
            case 1:
                return EnumC4024b.Book;
            case 2:
                return EnumC4024b.Buy;
            case 3:
                return EnumC4024b.Checkout;
            case 4:
                return EnumC4024b.Donate;
            case 5:
                return EnumC4024b.Order;
            case 6:
                return EnumC4024b.Pay;
            case 7:
                return EnumC4024b.Plain;
            case 8:
                return EnumC4024b.Subscribe;
            default:
                throw new p();
        }
    }
}
