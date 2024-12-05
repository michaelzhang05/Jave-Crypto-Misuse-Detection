package p4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3434f;
import m4.AbstractC3435g;
import m4.AbstractC3441m;

/* renamed from: p4.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3778z {

    /* renamed from: a, reason: collision with root package name */
    private static final float f37840a = Dp.m5183constructorimpl(280);

    /* renamed from: b, reason: collision with root package name */
    private static final float f37841b = Dp.m5183constructorimpl(48);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37842a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusProperties) obj);
            return O5.I.f8278a;
        }

        public final void invoke(FocusProperties focusProperties) {
            AbstractC3255y.i(focusProperties, "$this$focusProperties");
            focusProperties.setCanFocus(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f37843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState) {
            super(0);
            this.f37843a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5620invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5620invoke() {
            AbstractC3778z.e(this.f37843a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f37844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MutableState mutableState) {
            super(0);
            this.f37844a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5621invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5621invoke() {
            AbstractC3778z.e(this.f37844a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37845a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37846b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ State f37847c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3777y f37848d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f37849e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p4.z$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3777y f37850a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f37851b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MutableState f37852c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3777y c3777y, int i8, MutableState mutableState) {
                super(0);
                this.f37850a = c3777y;
                this.f37851b = i8;
                this.f37852c = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5622invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5622invoke() {
                AbstractC3778z.e(this.f37852c, false);
                this.f37850a.C(this.f37851b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, long j8, State state, C3777y c3777y, MutableState mutableState) {
            super(3);
            this.f37845a = list;
            this.f37846b = j8;
            this.f37847c = state;
            this.f37848d = c3777y;
            this.f37849e = mutableState;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(ColumnScope DropdownMenu, Composer composer, int i8) {
            AbstractC3255y.i(DropdownMenu, "$this$DropdownMenu");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362403838, i8, -1, "com.stripe.android.uicore.elements.DropDown.<anonymous>.<anonymous> (DropdownFieldUI.kt:151)");
            }
            List list = this.f37845a;
            long j8 = this.f37846b;
            State state = this.f37847c;
            C3777y c3777y = this.f37848d;
            MutableState mutableState = this.f37849e;
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC1378t.w();
                }
                AbstractC3778z.g((String) obj, i9 == AbstractC3778z.c(state), j8, new a(c3777y, i9, mutableState), composer, 0, 0);
                i9 = i10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3777y f37853a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37854b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f37855c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37856d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37857e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f37858f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3777y c3777y, boolean z8, Modifier modifier, boolean z9, int i8, int i9) {
            super(2);
            this.f37853a = c3777y;
            this.f37854b = z8;
            this.f37855c = modifier;
            this.f37856d = z9;
            this.f37857e = i8;
            this.f37858f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3778z.a(this.f37853a, this.f37854b, this.f37855c, this.f37856d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37857e | 1), this.f37858f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3777y f37859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f37860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3777y c3777y, State state) {
            super(1);
            this.f37859a = c3777y;
            this.f37860b = state;
        }

        public final String a(int i8) {
            return this.f37859a.A(AbstractC3778z.c(this.f37860b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f37861a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5623invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5623invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f37862a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function0 function0) {
            super(0);
            this.f37862a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5624invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5624invoke() {
            this.f37862a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37863a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37864b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f37865c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f37866d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37867e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f37868f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, boolean z8, long j8, Function0 function0, int i8, int i9) {
            super(2);
            this.f37863a = str;
            this.f37864b = z8;
            this.f37865c = j8;
            this.f37866d = function0;
            this.f37867e = i8;
            this.f37868f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3778z.g(this.f37863a, this.f37864b, this.f37865c, this.f37866d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37867e | 1), this.f37868f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f37869a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f37872d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37873e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f37874f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37875g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Integer num, boolean z8, String str, long j8, boolean z9, boolean z10, int i8) {
            super(2);
            this.f37869a = num;
            this.f37870b = z8;
            this.f37871c = str;
            this.f37872d = j8;
            this.f37873e = z9;
            this.f37874f = z10;
            this.f37875g = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3778z.h(this.f37869a, this.f37870b, this.f37871c, this.f37872d, this.f37873e, this.f37874f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37875g | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.z$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37876a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37877b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37878c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37879d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37880e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, long j8, boolean z8, boolean z9, int i8) {
            super(2);
            this.f37876a = str;
            this.f37877b = j8;
            this.f37878c = z8;
            this.f37879d = z9;
            this.f37880e = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3778z.i(this.f37876a, this.f37877b, this.f37878c, this.f37879d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37880e | 1));
        }
    }

    public static final void a(C3777y controller, boolean z8, Modifier modifier, boolean z9, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        MutableState mutableState;
        long j8;
        MutableState mutableState2;
        String str;
        MutableState mutableState3;
        int i10;
        Modifier.Companion companion;
        AbstractC3255y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(958043205);
        if ((i9 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 8) != 0) {
            z10 = true;
        } else {
            z10 = z9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(958043205, i8, -1, "com.stripe.android.uicore.elements.DropDown (DropdownFieldUI.kt:84)");
        }
        State a8 = y4.f.a(controller.b(), startRestartGroup, 8);
        State a9 = y4.f.a(controller.z(), startRestartGroup, 8);
        List x8 = controller.x();
        if (x8.size() == 1 && controller.w()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z8 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        startRestartGroup.startReplaceableGroup(468485858);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState4 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        State a10 = y4.f.a(y4.g.m(controller.z(), new f(controller, a9)), startRestartGroup, 8);
        startRestartGroup.startReplaceableGroup(468492647);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        if (z12) {
            startRestartGroup.startReplaceableGroup(1638454956);
            long h8 = AbstractC3441m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).h();
            startRestartGroup.endReplaceableGroup();
            j8 = h8;
            obj = null;
            mutableState = mutableState4;
        } else {
            startRestartGroup.startReplaceableGroup(1638518506);
            obj = null;
            mutableState = mutableState4;
            long m2986unboximpl = TextFieldDefaults.INSTANCE.m1404textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151).indicatorColor(false, false, mutableInteractionSource, startRestartGroup, 438).getValue().m2986unboximpl();
            startRestartGroup.endReplaceableGroup();
            j8 = m2986unboximpl;
        }
        Modifier.Companion companion3 = Modifier.Companion;
        Alignment.Companion companion4 = Alignment.Companion;
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion3, companion4.getTopStart(), false, 2, obj);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i11 = MaterialTheme.$stable;
        Modifier then = BackgroundKt.m287backgroundbw27NRU$default(wrapContentSize$default, AbstractC3441m.n(materialTheme, startRestartGroup, i11).d(), null, 2, null).then(modifier2);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
        Function0 constructor = companion5.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
        Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier focusProperties = FocusPropertiesKt.focusProperties(companion3, a.f37842a);
        String stringResource = StringResources_androidKt.stringResource(AbstractC3435g.f35189z, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-438263598);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion2.getEmpty()) {
            mutableState2 = mutableState;
            rememberedValue3 = new b(mutableState2);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        } else {
            mutableState2 = mutableState;
        }
        startRestartGroup.endReplaceableGroup();
        Modifier m320clickableXHw0xAI$default = ClickableKt.m320clickableXHw0xAI$default(focusProperties, z12, stringResource, null, (Function0) rememberedValue3, 4, null);
        if (controller.B()) {
            str = "tiny";
        } else {
            str = "normal";
        }
        Modifier testTag = TestTagKt.testTag(m320clickableXHw0xAI$default, "DropDown:" + str);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor2 = companion5.getConstructor();
        InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(testTag);
        Modifier modifier3 = modifier2;
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
        Updater.m2508setimpl(m2501constructorimpl2, rememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        if (controller.B()) {
            startRestartGroup.startReplaceableGroup(-1438505697);
            mutableState3 = mutableState2;
            i10 = i11;
            companion = companion3;
            i(f(a10), j8, z11, z10, startRestartGroup, i8 & 7168);
            startRestartGroup.endReplaceableGroup();
        } else {
            mutableState3 = mutableState2;
            i10 = i11;
            companion = companion3;
            startRestartGroup.startReplaceableGroup(-1438174710);
            h(Integer.valueOf(b(a8)), z12, f(a10), j8, z11, z10, startRestartGroup, (i8 << 6) & 458752);
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean d8 = d(mutableState3);
        startRestartGroup.startReplaceableGroup(-438231181);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new c(mutableState3);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        AndroidMenu_androidKt.m1105DropdownMenu4kj_NE(d8, (Function0) rememberedValue4, SizeKt.m648requiredSizeInqDBjuR0$default(SizeKt.m657width3ABfNKs(BackgroundKt.m287backgroundbw27NRU$default(companion, AbstractC3441m.n(materialTheme, startRestartGroup, i10).d(), null, 2, null), f37840a), 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(f37841b * 8.9f), 7, null), 0L, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1362403838, true, new d(x8, j8, a9, controller, mutableState3)), startRestartGroup, 1572912, 56);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(controller, z8, modifier3, z10, i8, i9));
        }
    }

    private static final int b(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean d(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final String f(State state) {
        return (String) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r31, boolean r32, long r33, kotlin.jvm.functions.Function0 r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.AbstractC3778z.g(java.lang.String, boolean, long, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Integer num, boolean z8, String str, long j8, boolean z9, boolean z10, Composer composer, int i8) {
        int i9;
        RowScopeInstance rowScopeInstance;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1222675217);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(num)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(z9)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(z10)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1222675217, i9, -1, "com.stripe.android.uicore.elements.LargeDropdownLabel (DropdownFieldUI.kt:174)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), startRestartGroup, 0);
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
            Updater.m2508setimpl(m2501constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier m609paddingqDBjuR0$default = PaddingKt.m609paddingqDBjuR0$default(companion, Dp.m5183constructorimpl(16), Dp.m5183constructorimpl(4), 0.0f, Dp.m5183constructorimpl(8), 4, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m609paddingqDBjuR0$default);
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
            startRestartGroup.startReplaceableGroup(122130702);
            if (num == null) {
                rowScopeInstance = rowScopeInstance2;
            } else {
                rowScopeInstance = rowScopeInstance2;
                E.a(StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, 0), null, z8, startRestartGroup, (i9 << 3) & 896, 2);
                O5.I i16 = O5.I.f8278a;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 0.9f);
            Alignment.Vertical bottom = companion2.getBottom();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), bottom, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor3 = companion3.getConstructor();
            InterfaceC1669o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth);
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
            Updater.m2508setimpl(m2501constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m2501constructorimpl3.getInserting() || !AbstractC3255y.d(m2501constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m2501constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m2501constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m1419Text4IGK_g(str, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, startRestartGroup, ((i9 >> 6) & 14) | ((i9 >> 3) & 896), 0, 131066);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1732350405);
            if (!z9 && z10) {
                Modifier align = rowScopeInstance.align(companion, companion2.getCenterVertically());
                startRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor4 = companion3.getConstructor();
                InterfaceC1669o modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(align);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2501constructorimpl4 = Updater.m2501constructorimpl(startRestartGroup);
                Updater.m2508setimpl(m2501constructorimpl4, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m2508setimpl(m2501constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                InterfaceC1668n setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m2501constructorimpl4.getInserting() || !AbstractC3255y.d(m2501constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m2501constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m2501constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(AbstractC3434f.f35152a, startRestartGroup, 0), (String) null, SizeKt.m638height3ABfNKs(companion, Dp.m5183constructorimpl(24)), j8, startRestartGroup, (i9 & 7168) | 440, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
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
            endRestartGroup.updateScope(new j(num, z8, str, j8, z9, z10, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String str, long j8, boolean z8, boolean z9, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1262178129);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(z9)) {
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
                ComposerKt.traceEventStart(1262178129, i9, -1, "com.stripe.android.uicore.elements.TinyDropdownLabel (DropdownFieldUI.kt:218)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
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
            TextKt.m1419Text4IGK_g(str, (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, startRestartGroup, (i9 & 14) | ((i9 << 3) & 896), 0, 131066);
            startRestartGroup.startReplaceableGroup(-2061792662);
            if (!z8 && z9) {
                IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(AbstractC3434f.f35152a, startRestartGroup, 0), (String) null, SizeKt.m638height3ABfNKs(companion, Dp.m5183constructorimpl(24)), AbstractC3441m.n(MaterialTheme.INSTANCE, startRestartGroup, MaterialTheme.$stable).i(), startRestartGroup, 440, 0);
            }
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
            endRestartGroup.updateScope(new k(str, j8, z8, z9, i8));
        }
    }
}
