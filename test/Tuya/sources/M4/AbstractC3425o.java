package m4;

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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import m4.C3423m;

/* renamed from: m4.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3425o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.o$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C3156v implements Function1 {
        a(Object obj) {
            super(1, obj, C3423m.class, "onValueChange", "onValueChange(Z)V", 0);
        }

        public final void d(boolean z8) {
            ((C3423m) this.receiver).z(z8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d(((Boolean) obj).booleanValue());
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.o$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3423m f35621a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3423m c3423m) {
            super(2);
            this.f35621a = c3423m;
        }

        public final String a(Composer composer, int i8) {
            String stringResource;
            composer.startReplaceableGroup(-67320510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-67320510, i8, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous> (CheckboxFieldUI.kt:52)");
            }
            C3423m.b x8 = this.f35621a.x();
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

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.o$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f35622a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C c8) {
            super(2);
            this.f35622a = c8;
        }

        public final String a(Composer composer, int i8) {
            String stringResource;
            composer.startReplaceableGroup(-116662898);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-116662898, i8, -1, "com.stripe.android.uicore.elements.CheckboxFieldUI.<anonymous>.<anonymous> (CheckboxFieldUI.kt:58)");
            }
            Object[] b8 = this.f35622a.b();
            composer.startReplaceableGroup(-956550707);
            if (b8 == null) {
                stringResource = null;
            } else {
                stringResource = StringResources_androidKt.stringResource(this.f35622a.a(), Arrays.copyOf(b8, b8.length), composer, 64);
            }
            composer.endReplaceableGroup();
            if (stringResource == null) {
                stringResource = StringResources_androidKt.stringResource(this.f35622a.a(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return stringResource;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.o$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f35623a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3423m f35624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35625c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35626d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35627e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Modifier modifier, C3423m c3423m, boolean z8, int i8, int i9) {
            super(2);
            this.f35623a = modifier;
            this.f35624b = c3423m;
            this.f35625c = z8;
            this.f35626d = i8;
            this.f35627e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3425o.a(this.f35623a, this.f35624b, this.f35625c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35626d | 1), this.f35627e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.o$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35628a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f35628a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return L5.I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setStateDescription(semantics, this.f35628a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.o$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f35629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35631c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35632d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f35633e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X5.n f35634f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ X5.n f35635g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f35636h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f35637i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Modifier modifier, boolean z8, boolean z9, String str, Function1 function1, X5.n nVar, X5.n nVar2, int i8, int i9) {
            super(2);
            this.f35629a = modifier;
            this.f35630b = z8;
            this.f35631c = z9;
            this.f35632d = str;
            this.f35633e = function1;
            this.f35634f = nVar;
            this.f35635g = nVar2;
            this.f35636h = i8;
            this.f35637i = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3425o.d(this.f35629a, this.f35630b, this.f35631c, this.f35632d, this.f35633e, this.f35634f, this.f35635g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35636h | 1), this.f35637i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.o$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f35638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f35639b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(X5.n nVar, long j8, int i8) {
            super(2);
            this.f35638a = nVar;
            this.f35639b = j8;
            this.f35640c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3425o.e(this.f35638a, this.f35639b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35640c | 1));
        }
    }

    public static final void a(Modifier modifier, C3423m controller, boolean z8, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        c cVar;
        AbstractC3159y.i(controller, "controller");
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
        State a8 = v4.f.a(controller.y(), startRestartGroup, 8);
        State a9 = v4.f.a(controller.getError(), startRestartGroup, 8);
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
    public static final void d(androidx.compose.ui.Modifier r46, boolean r47, boolean r48, java.lang.String r49, kotlin.jvm.functions.Function1 r50, X5.n r51, X5.n r52, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.AbstractC3425o.d(androidx.compose.ui.Modifier, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function1, X5.n, X5.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(X5.n nVar, long j8, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(701185681);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(nVar)) {
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
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, Dp.m5178constructorimpl(f8), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1267Iconww6aTOc(InfoKt.getInfo(Icons.Outlined.INSTANCE), (String) null, PaddingKt.m604paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5178constructorimpl(f8), 0.0f, 11, null), j8, startRestartGroup, ((i12 << 6) & 7168) | 432, 0);
            composer2 = startRestartGroup;
            TextKt.m1414Text4IGK_g((String) nVar.invoke(startRestartGroup, Integer.valueOf(i12 & 14)), (Modifier) null, j8, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer2, (i12 << 3) & 896, 0, 131066);
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
            endRestartGroup.updateScope(new g(nVar, j8, i8));
        }
    }
}
