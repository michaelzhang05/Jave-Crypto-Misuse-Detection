package p4;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.InfoKt;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import p4.C3766m;

/* renamed from: p4.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3768o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.o$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C3252v implements Function1 {
        a(Object obj) {
            super(1, obj, C3766m.class, "onValueChange", "onValueChange(Z)V", 0);
        }

        public final void d(boolean z8) {
            ((C3766m) this.receiver).z(z8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d(((Boolean) obj).booleanValue());
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.o$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3766m f37647a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3766m c3766m) {
            super(2);
            this.f37647a = c3766m;
        }

        public final String a(Composer composer, int i8) {
            String stringResource;
            composer.startReplaceableGroup(-67320510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-67320510, i8, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous> (CheckboxFieldUI.kt:52)");
            }
            C3766m.b x8 = this.f37647a.x();
            if (x8 == null) {
                stringResource = null;
            } else {
                int b8 = x8.b();
                Object[] a8 = x8.a();
                stringResource = StringResources_androidKt.stringResource(b8, Arrays.copyOf(a8, a8.length), composer, 64);
            }
            if (stringResource == null) {
                stringResource = "";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return stringResource;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.o$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f37648a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C c8) {
            super(2);
            this.f37648a = c8;
        }

        public final String a(Composer composer, int i8) {
            String stringResource;
            composer.startReplaceableGroup(-116662898);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116662898, i8, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous>.<anonymous> (CheckboxFieldUI.kt:58)");
            }
            Object[] b8 = this.f37648a.b();
            composer.startReplaceableGroup(-956550707);
            if (b8 == null) {
                stringResource = null;
            } else {
                stringResource = StringResources_androidKt.stringResource(this.f37648a.a(), Arrays.copyOf(b8, b8.length), composer, 64);
            }
            composer.endReplaceableGroup();
            if (stringResource == null) {
                stringResource = StringResources_androidKt.stringResource(this.f37648a.a(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return stringResource;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.o$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f37649a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3766m f37650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37652d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37653e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Modifier modifier, C3766m c3766m, boolean z8, int i8, int i9) {
            super(2);
            this.f37649a = modifier;
            this.f37650b = c3766m;
            this.f37651c = z8;
            this.f37652d = i8;
            this.f37653e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3768o.a(this.f37649a, this.f37650b, this.f37651c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37652d | 1), this.f37653e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.o$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f37654a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return O5.I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setStateDescription(semantics, this.f37654a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.o$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f37655a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f37656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37657c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37658d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f37659e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f37660f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f37661g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37662h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37663i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Modifier modifier, boolean z8, boolean z9, String str, Function1 function1, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, int i8, int i9) {
            super(2);
            this.f37655a = modifier;
            this.f37656b = z8;
            this.f37657c = z9;
            this.f37658d = str;
            this.f37659e = function1;
            this.f37660f = interfaceC1668n;
            this.f37661g = interfaceC1668n2;
            this.f37662h = i8;
            this.f37663i = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3768o.d(this.f37655a, this.f37656b, this.f37657c, this.f37658d, this.f37659e, this.f37660f, this.f37661g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37662h | 1), this.f37663i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.o$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f37664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC1668n interfaceC1668n, long j8, int i8) {
            super(2);
            this.f37664a = interfaceC1668n;
            this.f37665b = j8;
            this.f37666c = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3768o.e(this.f37664a, this.f37665b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37666c | 1));
        }
    }

    public static final void a(Modifier modifier, C3766m controller, boolean z8, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        c cVar;
        AbstractC3255y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(1442026933);
        if ((i9 & 1) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 4) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1442026933, i8, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI (CheckboxFieldUI.kt:41)");
        }
        State a8 = y4.f.a(controller.y(), startRestartGroup, 8);
        State a9 = y4.f.a(controller.getError(), startRestartGroup, 8);
        boolean b8 = b(a8);
        String w8 = controller.w();
        a aVar = new a(controller);
        b bVar = new b(controller);
        C c8 = c(a9);
        if (c8 != null) {
            cVar = new c(c8);
        } else {
            cVar = null;
        }
        d(modifier2, b8, z9, w8, aVar, bVar, cVar, startRestartGroup, i8 & 910, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(modifier2, controller, z9, i8, i9));
        }
    }

    private static final boolean b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final C c(State state) {
        return (C) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(androidx.compose.ui.Modifier r46, boolean r47, boolean r48, java.lang.String r49, kotlin.jvm.functions.Function1 r50, a6.InterfaceC1668n r51, a6.InterfaceC1668n r52, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.AbstractC3768o.d(androidx.compose.ui.Modifier, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function1, a6.n, a6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC1668n interfaceC1668n, long j8, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(701185681);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(interfaceC1668n)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(j8)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        int i12 = i9;
        if ((i12 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(701185681, i12, -1, "com.stripe.android.uicore.elements.Error (CheckboxFieldUI.kt:140)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 8;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, Dp.m5183constructorimpl(f8), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
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
            IconKt.m1272Iconww6aTOc(InfoKt.getInfo(Icons.Outlined.INSTANCE), (String) null, PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5183constructorimpl(f8), 0.0f, 11, null), j8, startRestartGroup, ((i12 << 6) & 7168) | 432, 0);
            composer2 = startRestartGroup;
            TextKt.m1419Text4IGK_g((String) interfaceC1668n.invoke(startRestartGroup, Integer.valueOf(i12 & 14)), (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, (i12 << 3) & 896, 0, 131066);
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
            endRestartGroup.updateScope(new g(interfaceC1668n, j8, i8));
        }
    }
}
