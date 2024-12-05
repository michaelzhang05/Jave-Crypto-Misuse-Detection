package O3;

import O3.n;
import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import m4.AbstractC3441m;
import t3.C4033g;
import t3.w;
import v4.C4108g;
import w3.AbstractC4147c;

/* loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f8148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0, int i8) {
            super(2);
            this.f8148a = function0;
            this.f8149b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            o.a(this.f8148a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8149b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8150a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(0);
            this.f8150a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m57invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m57invoke() {
            this.f8150a.a(n.c.e.f8147a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8151a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f8151a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m58invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m58invoke() {
            this.f8151a.a(n.c.d.f8146a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(1);
            this.f8152a = nVar;
        }

        public final void a(C4033g it) {
            AbstractC3255y.i(it, "it");
            this.f8152a.a(new n.c.a(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4033g) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8153a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n nVar) {
            super(1);
            this.f8153a = nVar;
        }

        public final void a(C4033g it) {
            AbstractC3255y.i(it, "it");
            this.f8153a.a(new n.c.C0163c(it.d()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4033g) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f8154a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f8155b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8156c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8157d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n nVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f8154a = nVar;
            this.f8155b = modifier;
            this.f8156c = i8;
            this.f8157d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            o.b(this.f8154a, this.f8155b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8156c | 1), this.f8157d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f8158a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4033g f8159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function1 function1, C4033g c4033g) {
            super(0);
            this.f8158a = function1;
            this.f8159b = c4033g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m59invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m59invoke() {
            this.f8158a.invoke(this.f8159b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4033g f8160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.a f8161b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f8162c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f8163d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f8164e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C4033g c4033g, n.a aVar, Function0 function0, Function0 function02, Function1 function1) {
            super(3);
            this.f8160a = c4033g;
            this.f8161b = aVar;
            this.f8162c = function0;
            this.f8163d = function02;
            this.f8164e = function1;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3255y.i(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1047630137, i8, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI.<anonymous>.<anonymous> (PaymentMethodVerticalLayoutUI.kt:114)");
            }
            o.e(this.f8160a, this.f8161b, this.f8162c, this.f8163d, this.f8164e, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f8165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4033g f8166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n.a f8167c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B3.f f8168d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8169e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f8170f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f8171g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f8172h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f8173i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C4108g f8174j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Modifier f8175k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f8176l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f8177m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f8178n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(List list, C4033g c4033g, n.a aVar, B3.f fVar, boolean z8, Function0 function0, Function0 function02, Function1 function1, Function1 function12, C4108g c4108g, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f8165a = list;
            this.f8166b = c4033g;
            this.f8167c = aVar;
            this.f8168d = fVar;
            this.f8169e = z8;
            this.f8170f = function0;
            this.f8171g = function02;
            this.f8172h = function1;
            this.f8173i = function12;
            this.f8174j = c4108g;
            this.f8175k = modifier;
            this.f8176l = i8;
            this.f8177m = i9;
            this.f8178n = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            o.c(this.f8165a, this.f8166b, this.f8167c, this.f8168d, this.f8169e, this.f8170f, this.f8171g, this.f8172h, this.f8173i, this.f8174j, this.f8175k, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8176l | 1), RecomposeScopeImplKt.updateChangedFlags(this.f8177m), this.f8178n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f8179a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4033g f8180b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function1 function1, C4033g c4033g) {
            super(0);
            this.f8179a = function1;
            this.f8180b = c4033g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m60invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m60invoke() {
            this.f8179a.invoke(this.f8180b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4033g f8181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.a f8182b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f8183c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f8184d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f8185e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8186f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C4033g c4033g, n.a aVar, Function0 function0, Function0 function02, Function1 function1, int i8) {
            super(2);
            this.f8181a = c4033g;
            this.f8182b = aVar;
            this.f8183c = function0;
            this.f8184d = function02;
            this.f8185e = function1;
            this.f8186f = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            o.e(this.f8181a, this.f8182b, this.f8183c, this.f8184d, this.f8185e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8186f | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f8187a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8188b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Function0 function0, int i8) {
            super(2);
            this.f8187a = function0;
            this.f8188b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            o.f(this.f8187a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8188b | 1));
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class m {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8189a;

        static {
            int[] iArr = new int[n.a.values().length];
            try {
                iArr[n.a.f8131a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.a.f8132b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.a.f8133c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.a.f8134d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8189a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-716177738);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
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
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-716177738, i9, -1, "com.stripe.android.paymentsheet.verticalmode.EditButton (PaymentMethodVerticalLayoutUI.kt:170)");
            }
            String stringResource = StringResources_androidKt.stringResource(AbstractC3407E.f34861i0, startRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            long m1183getPrimary0d7_KjU = materialTheme.getColors(startRestartGroup, i11).m1183getPrimary0d7_KjU();
            TextStyle button = materialTheme.getTypography(startRestartGroup, i11).getButton();
            composer2 = startRestartGroup;
            TextKt.m1419Text4IGK_g(stringResource, PaddingKt.m605padding3ABfNKs(ClickableKt.m320clickableXHw0xAI$default(TestTagKt.testTag(Modifier.Companion, "TEST_TAG_VERTICAL_MODE_SAVED_PM_EDIT"), false, null, null, function0, 7, null), Dp.m5183constructorimpl(4)), m1183getPrimary0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, button, composer2, 0, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(function0, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(O3.n r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.o.b(O3.n, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(List paymentMethods, C4033g c4033g, n.a savedPaymentMethodAction, B3.f fVar, boolean z8, Function0 onViewMorePaymentMethods, Function0 onManageOneSavedPaymentMethod, Function1 onEditPaymentMethod, Function1 onSelectSavedPaymentMethod, C4108g imageLoader, Modifier modifier, Composer composer, int i8, int i9, int i10) {
        Composer composer2;
        int i11;
        int i12;
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(savedPaymentMethodAction, "savedPaymentMethodAction");
        AbstractC3255y.i(onViewMorePaymentMethods, "onViewMorePaymentMethods");
        AbstractC3255y.i(onManageOneSavedPaymentMethod, "onManageOneSavedPaymentMethod");
        AbstractC3255y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3255y.i(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        AbstractC3255y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(1650746819);
        Modifier modifier2 = (i10 & 1024) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1650746819, i8, i9, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI (PaymentMethodVerticalLayoutUI.kt:97)");
        }
        Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(Dp.m5183constructorimpl(12));
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m519spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i13 = MaterialTheme.$stable;
        TextStyle subtitle1 = materialTheme.getTypography(startRestartGroup, i13).getSubtitle1();
        long h8 = AbstractC3441m.n(materialTheme, startRestartGroup, i13).h();
        startRestartGroup.startReplaceableGroup(962083850);
        if (c4033g != null) {
            TextKt.m1419Text4IGK_g(StringResources_androidKt.stringResource(w.f39780d0, startRestartGroup, 0), TestTagKt.testTag(Modifier.Companion, "TEST_TAG_SAVED_TEXT"), h8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, subtitle1, startRestartGroup, 48, 0, 65528);
            composer2 = startRestartGroup;
            i12 = 1;
            p.a(c4033g, z8, false, fVar != null && B3.g.b(fVar), null, new g(onSelectSavedPaymentMethod, c4033g), ComposableLambdaKt.composableLambda(startRestartGroup, -1047630137, true, new h(c4033g, savedPaymentMethodAction, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onEditPaymentMethod)), composer2, ((i8 >> 9) & 112) | 1572872, 20);
            i11 = 0;
            TextKt.m1419Text4IGK_g(StringResources_androidKt.stringResource(w.f39760N, composer2, 0), (Modifier) null, h8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, subtitle1, composer2, 0, 0, 65530);
        } else {
            composer2 = startRestartGroup;
            i11 = 0;
            i12 = 1;
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(962123858);
        boolean changed = composer2.changed(fVar) | composer2.changed(paymentMethods);
        Object rememberedValue = composer2.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            int i14 = -1;
            if (fVar != null && !B3.g.b(fVar)) {
                String c8 = AbstractC4147c.c(fVar);
                Iterator it = paymentMethods.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AbstractC3255y.d(((O3.e) it.next()).a(), c8)) {
                        i14 = i11;
                        break;
                    }
                    i11 += i12;
                }
            }
            rememberedValue = Integer.valueOf(i14);
            composer2.updateRememberedValue(rememberedValue);
        }
        int intValue = ((Number) rememberedValue).intValue();
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        O3.l.a(paymentMethods, intValue, z8, imageLoader, null, composer2, ((i8 >> 6) & 896) | 8 | (C4108g.f40212g << 9) | ((i8 >> 18) & 7168), 16);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(paymentMethods, c4033g, savedPaymentMethodAction, fVar, z8, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onEditPaymentMethod, onSelectSavedPaymentMethod, imageLoader, modifier2, i8, i9, i10));
        }
    }

    private static final n.b d(State state) {
        return (n.b) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4033g c4033g, n.a aVar, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(801308256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(801308256, i8, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodTrailingContent (PaymentMethodVerticalLayoutUI.kt:152)");
        }
        int i9 = m.f8189a[aVar.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        startRestartGroup.startReplaceableGroup(1195991352);
                        startRestartGroup.endReplaceableGroup();
                    } else {
                        startRestartGroup.startReplaceableGroup(1195869119);
                        f(function0, startRestartGroup, (i8 >> 6) & 14);
                        startRestartGroup.endReplaceableGroup();
                    }
                } else {
                    startRestartGroup.startReplaceableGroup(1195707981);
                    a(function02, startRestartGroup, (i8 >> 9) & 14);
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                startRestartGroup.startReplaceableGroup(1195526166);
                a(new j(function1, c4033g), startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
            }
        } else {
            startRestartGroup.startReplaceableGroup(-99985106);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new k(c4033g, aVar, function0, function02, function1, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function0 function0, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-446496442);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
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
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446496442, i9, -1, "com.stripe.android.paymentsheet.verticalmode.ViewMoreButton (PaymentMethodVerticalLayoutUI.kt:185)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(ClickableKt.m320clickableXHw0xAI$default(TestTagKt.testTag(Modifier.Companion, "TEST_TAG_VIEW_MORE"), false, null, null, function0, 7, null), Dp.m5183constructorimpl(4));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m605padding3ABfNKs);
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
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(w.f39800n0, startRestartGroup, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1419Text4IGK_g(stringResource, (Modifier) null, materialTheme.getColors(startRestartGroup, i11).m1183getPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i11).getButton(), composer2, 0, 0, 65530);
            IconKt.m1272Iconww6aTOc(KeyboardArrowRightKt.getKeyboardArrowRight(Icons.Filled.INSTANCE), (String) null, (Modifier) null, materialTheme.getColors(composer2, i11).m1183getPrimary0d7_KjU(), composer2, 48, 4);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l(function0, i8));
        }
    }
}
