package O3;

import M3.AbstractC1306a;
import M3.Q;
import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.C4033g;
import w4.AbstractC4148a;

/* loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f8027a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableState mutableState) {
            super(0);
            this.f8027a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m51invoke() {
            this.f8027a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f8028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f8029b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4033g f8030c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState, Function1 function1, C4033g c4033g) {
            super(0);
            this.f8028a = mutableState;
            this.f8029b = function1;
            this.f8030c = c4033g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m52invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m52invoke() {
            this.f8028a.setValue(Boolean.FALSE);
            this.f8029b.invoke(this.f8030c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f8031a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState mutableState) {
            super(0);
            this.f8031a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m53invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m53invoke() {
            this.f8031a.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4033g f8032a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f8033b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8034c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C4033g c4033g, Function1 function1, int i8) {
            super(2);
            this.f8032a = c4033g;
            this.f8033b = function1;
            this.f8034c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            h.a(this.f8032a, this.f8033b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8034c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8035a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableState invoke() {
            MutableState mutableStateOf$default;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            return mutableStateOf$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f8036a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4033g f8037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, C4033g c4033g) {
            super(0);
            this.f8036a = function1;
            this.f8037b = c4033g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m54invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m54invoke() {
            this.f8036a.invoke(this.f8037b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4033g f8038a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f8039b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C4033g c4033g, Function1 function1, int i8) {
            super(2);
            this.f8038a = c4033g;
            this.f8039b = function1;
            this.f8040c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            h.b(this.f8038a, this.f8039b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8040c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.h$h, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0160h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8041a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0160h(String str) {
            super(1);
            this.f8041a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, this.f8041a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8042a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageVector f8043b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f8044c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f8045d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8046e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8047f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j8, ImageVector imageVector, Function0 function0, String str, Modifier modifier, int i8) {
            super(2);
            this.f8042a = j8;
            this.f8043b = imageVector;
            this.f8044c = function0;
            this.f8045d = str;
            this.f8046e = modifier;
            this.f8047f = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            h.c(this.f8042a, this.f8043b, this.f8044c, this.f8045d, this.f8046e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8047f | 1));
        }
    }

    public static final void a(C4033g paymentMethod, Function1 deletePaymentMethod, Composer composer, int i8) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        AbstractC3255y.i(deletePaymentMethod, "deletePaymentMethod");
        Composer startRestartGroup = composer.startRestartGroup(292197921);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(292197921, i8, -1, "com.stripe.android.paymentsheet.verticalmode.DeleteIcon (ManageScreenIcons.kt:32)");
        }
        MutableState mutableState = (MutableState) RememberSaveableKt.m2588rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) e.f8035a, startRestartGroup, 3080, 6);
        String str = paymentMethod.d().f25463a;
        long m3010getRed0d7_KjU = Color.Companion.m3010getRed0d7_KjU();
        ImageVector close = CloseKt.getClose(Icons.Filled.INSTANCE);
        Modifier testTag = TestTagKt.testTag(Modifier.Companion, "manage_screen_delete_icon_" + str);
        String a8 = AbstractC1306a.a(AbstractC4148a.a(paymentMethod.e(), startRestartGroup, 8));
        startRestartGroup.startReplaceableGroup(1499725548);
        boolean changed = startRestartGroup.changed(mutableState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        c(m3010getRed0d7_KjU, close, (Function0) rememberedValue, a8, testTag, startRestartGroup, 6);
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            b bVar = new b(mutableState, deletePaymentMethod, paymentMethod);
            startRestartGroup.startReplaceableGroup(1499740045);
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new c(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Q.a(paymentMethod, bVar, (Function0) rememberedValue2, startRestartGroup, 8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(paymentMethod, deletePaymentMethod, i8));
        }
    }

    public static final void b(C4033g paymentMethod, Function1 editPaymentMethod, Composer composer, int i8) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        AbstractC3255y.i(editPaymentMethod, "editPaymentMethod");
        Composer startRestartGroup = composer.startRestartGroup(-38368896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-38368896, i8, -1, "com.stripe.android.paymentsheet.verticalmode.EditIcon (ManageScreenIcons.kt:63)");
        }
        String str = paymentMethod.d().f25463a;
        c(Color.Companion.m3006getGray0d7_KjU(), EditKt.getEdit(Icons.Filled.INSTANCE), new f(editPaymentMethod, paymentMethod), AbstractC1306a.a(AbstractC4148a.a(paymentMethod.c(), startRestartGroup, 8)), TestTagKt.testTag(Modifier.Companion, "manage_screen_edit_icon_" + str), startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(paymentMethod, editPaymentMethod, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(long j8, ImageVector imageVector, Function0 function0, String str, Modifier modifier, Composer composer, int i8) {
        int i9;
        boolean z8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1677263696);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(j8)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i9 = i14 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(imageVector)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i9 |= i13;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i9 |= i12;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i9 |= i11;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i9 |= i10;
        }
        if ((46811 & i9) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1677263696, i9, -1, "com.stripe.android.paymentsheet.verticalmode.TrailingIcon (ManageScreenIcons.kt:85)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier m320clickableXHw0xAI$default = ClickableKt.m320clickableXHw0xAI$default(BackgroundKt.m287backgroundbw27NRU$default(SizeKt.m652size3ABfNKs(ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape()), Dp.m5183constructorimpl(24)), j8, null, 2, null), false, null, null, function0, 7, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m320clickableXHw0xAI$default);
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
            long m3013getWhite0d7_KjU = Color.Companion.m3013getWhite0d7_KjU();
            Modifier m652size3ABfNKs = SizeKt.m652size3ABfNKs(Modifier.Companion, Dp.m5183constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-1665294661);
            if ((i9 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0160h(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            IconKt.m1272Iconww6aTOc(imageVector, (String) null, SemanticsModifierKt.semantics$default(m652size3ABfNKs, false, (Function1) rememberedValue, 1, null), m3013getWhite0d7_KjU, startRestartGroup, ((i9 >> 3) & 14) | 3120, 0);
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
            endRestartGroup.updateScope(new i(j8, imageVector, function0, str, modifier, i8));
        }
    }
}
