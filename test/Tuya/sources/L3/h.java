package L3;

import J3.AbstractC1193a;
import J3.Q;
import L5.I;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;
import t4.AbstractC3794a;

/* loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f6236a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableState mutableState) {
            super(0);
            this.f6236a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m46invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m46invoke() {
            this.f6236a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f6237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f6238b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3654g f6239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState, Function1 function1, C3654g c3654g) {
            super(0);
            this.f6237a = mutableState;
            this.f6238b = function1;
            this.f6239c = c3654g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m47invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m47invoke() {
            this.f6237a.setValue(Boolean.FALSE);
            this.f6238b.invoke(this.f6239c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f6240a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState mutableState) {
            super(0);
            this.f6240a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m48invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m48invoke() {
            this.f6240a.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3654g f6241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f6242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3654g c3654g, Function1 function1, int i8) {
            super(2);
            this.f6241a = c3654g;
            this.f6242b = function1;
            this.f6243c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            h.a(this.f6241a, this.f6242b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6243c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f6244a = new e();

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
    public static final class f extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f6245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3654g f6246b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, C3654g c3654g) {
            super(0);
            this.f6245a = function1;
            this.f6246b = c3654g;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m49invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m49invoke() {
            this.f6245a.invoke(this.f6246b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3654g f6247a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f6248b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6249c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3654g c3654g, Function1 function1, int i8) {
            super(2);
            this.f6247a = c3654g;
            this.f6248b = function1;
            this.f6249c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            h.b(this.f6247a, this.f6248b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6249c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L3.h$h, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0132h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6250a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0132h(String str) {
            super(1);
            this.f6250a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, this.f6250a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6251a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageVector f6252b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6253c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6254d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f6255e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6256f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j8, ImageVector imageVector, Function0 function0, String str, Modifier modifier, int i8) {
            super(2);
            this.f6251a = j8;
            this.f6252b = imageVector;
            this.f6253c = function0;
            this.f6254d = str;
            this.f6255e = modifier;
            this.f6256f = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            h.c(this.f6251a, this.f6252b, this.f6253c, this.f6254d, this.f6255e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6256f | 1));
        }
    }

    public static final void a(C3654g paymentMethod, Function1 deletePaymentMethod, Composer composer, int i8) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        AbstractC3159y.i(deletePaymentMethod, "deletePaymentMethod");
        Composer startRestartGroup = composer.startRestartGroup(292197921);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(292197921, i8, -1, "com.stripe.android.paymentsheet.verticalmode.DeleteIcon (ManageScreenIcons.kt:32)");
        }
        MutableState mutableState = (MutableState) RememberSaveableKt.m2583rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) e.f6244a, startRestartGroup, 3080, 6);
        String str = paymentMethod.d().f24408a;
        long m3005getRed0d7_KjU = Color.Companion.m3005getRed0d7_KjU();
        ImageVector close = CloseKt.getClose(Icons.Filled.INSTANCE);
        Modifier testTag = TestTagKt.testTag(Modifier.Companion, "manage_screen_delete_icon_" + str);
        String a8 = AbstractC1193a.a(AbstractC3794a.a(paymentMethod.e(), startRestartGroup, 8));
        startRestartGroup.startReplaceableGroup(1499725548);
        boolean changed = startRestartGroup.changed(mutableState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        c(m3005getRed0d7_KjU, close, (Function0) rememberedValue, a8, testTag, startRestartGroup, 6);
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

    public static final void b(C3654g paymentMethod, Function1 editPaymentMethod, Composer composer, int i8) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        AbstractC3159y.i(editPaymentMethod, "editPaymentMethod");
        Composer startRestartGroup = composer.startRestartGroup(-38368896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-38368896, i8, -1, "com.stripe.android.paymentsheet.verticalmode.EditIcon (ManageScreenIcons.kt:63)");
        }
        String str = paymentMethod.d().f24408a;
        c(Color.Companion.m3001getGray0d7_KjU(), EditKt.getEdit(Icons.Filled.INSTANCE), new f(editPaymentMethod, paymentMethod), AbstractC1193a.a(AbstractC3794a.a(paymentMethod.c(), startRestartGroup, 8)), TestTagKt.testTag(Modifier.Companion, "manage_screen_edit_icon_" + str), startRestartGroup, 6);
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
            Modifier m315clickableXHw0xAI$default = ClickableKt.m315clickableXHw0xAI$default(BackgroundKt.m282backgroundbw27NRU$default(SizeKt.m647size3ABfNKs(ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape()), Dp.m5178constructorimpl(24)), j8, null, 2, null), false, null, null, function0, 7, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m315clickableXHw0xAI$default);
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
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long m3008getWhite0d7_KjU = Color.Companion.m3008getWhite0d7_KjU();
            Modifier m647size3ABfNKs = SizeKt.m647size3ABfNKs(Modifier.Companion, Dp.m5178constructorimpl(12));
            startRestartGroup.startReplaceableGroup(-1665294661);
            if ((i9 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C0132h(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            IconKt.m1267Iconww6aTOc(imageVector, (String) null, SemanticsModifierKt.semantics$default(m647size3ABfNKs, false, (Function1) rememberedValue, 1, null), m3008getWhite0d7_KjU, startRestartGroup, ((i9 >> 3) & 14) | 3120, 0);
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
