package com.stripe.android.paymentsheet.ui;

import J3.K;
import J3.O;
import L5.I;
import L5.p;
import X5.n;
import X5.o;
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
import j2.C3073m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q1.EnumC3645b;
import q3.r;
import y3.EnumC3987b;

/* loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0659a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f26557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC3987b f26559c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3073m.a f26560d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f26561e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f26562f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f26563g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f26564h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f26565i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0659a(PrimaryButton.a aVar, boolean z8, EnumC3987b enumC3987b, C3073m.a aVar2, boolean z9, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f26557a = aVar;
            this.f26558b = z8;
            this.f26559c = enumC3987b;
            this.f26560d = aVar2;
            this.f26561e = z9;
            this.f26562f = function0;
            this.f26563g = modifier;
            this.f26564h = i8;
            this.f26565i = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            a.a(this.f26557a, this.f26558b, this.f26559c, this.f26560d, this.f26561e, this.f26562f, this.f26563g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26564h | 1), this.f26565i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f26566a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.ui.d f26567b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f26568c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0660a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ PrimaryButton.a f26569a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0660a(PrimaryButton.a aVar) {
                super(0);
                this.f26569a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5543invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5543invoke() {
                PrimaryButton.a aVar = this.f26569a;
                if (aVar instanceof PrimaryButton.a.C0653a) {
                    ((PrimaryButton.a.C0653a) aVar).a().invoke();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0661b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0661b f26570a = new C0661b();

            C0661b() {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5544invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5544invoke();
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, com.stripe.android.paymentsheet.ui.d dVar, PrimaryButton.a aVar) {
            super(2);
            this.f26566a = modifier;
            this.f26567b = dVar;
            this.f26568c = aVar;
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
                ComposerKt.traceEventStart(-1177645661, i8, -1, "com.stripe.android.paymentsheet.ui.GooglePrimaryButton.<anonymous> (GooglePayButton.kt:105)");
            }
            Modifier testTag = TestTagKt.testTag(this.f26566a, "google-pay-primary-button");
            com.stripe.android.paymentsheet.ui.d dVar = this.f26567b;
            PrimaryButton.a aVar = this.f26568c;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-549781922);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0660a(aVar);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            com.stripe.android.paymentsheet.ui.c.i("", true, true, dVar, (Function0) rememberedValue, C0661b.f26570a, composer, 197046, 0);
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
    public static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f26571a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrimaryButton.a f26572b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26573c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26574d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Modifier modifier, PrimaryButton.a aVar, int i8, int i9) {
            super(2);
            this.f26571a = modifier;
            this.f26572b = aVar;
            this.f26573c = i8;
            this.f26574d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            a.b(this.f26571a, this.f26572b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f26573c | 1), this.f26574d);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26575a;

        static {
            int[] iArr = new int[EnumC3987b.values().length];
            try {
                iArr[EnumC3987b.f39752b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3987b.f39751a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3987b.f39753c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3987b.f39754d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3987b.f39755e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3987b.f39756f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3987b.f39758h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3987b.f39757g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f26575a = iArr;
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
    public static final void a(com.stripe.android.paymentsheet.ui.PrimaryButton.a r18, boolean r19, y3.EnumC3987b r20, j2.C3073m.a r21, boolean r22, kotlin.jvm.functions.Function0 r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.a.a(com.stripe.android.paymentsheet.ui.PrimaryButton$a, boolean, y3.b, j2.m$a, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
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
            if (aVar instanceof PrimaryButton.a.C0653a) {
                dVar = d.a.f26705a;
            } else {
                dVar = d.c.f26707a;
            }
            int i14 = r.f37381a;
            long colorResource = ColorResources_androidKt.colorResource(i14, startRestartGroup, 0);
            int i15 = r.f37382b;
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

    private static final EnumC3645b d(EnumC3987b enumC3987b) {
        switch (d.f26575a[enumC3987b.ordinal()]) {
            case 1:
                return EnumC3645b.Book;
            case 2:
                return EnumC3645b.Buy;
            case 3:
                return EnumC3645b.Checkout;
            case 4:
                return EnumC3645b.Donate;
            case 5:
                return EnumC3645b.Order;
            case 6:
                return EnumC3645b.Pay;
            case 7:
                return EnumC3645b.Plain;
            case 8:
                return EnumC3645b.Subscribe;
            default:
                throw new p();
        }
    }
}
