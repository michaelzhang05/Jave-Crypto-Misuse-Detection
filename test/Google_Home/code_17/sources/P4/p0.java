package p4;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class p0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f37672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f37674c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37675d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f37676e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f37677f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f37678g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37679h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f37680i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Integer num, String str, Modifier modifier, boolean z8, boolean z9, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, int i8, int i9) {
            super(2);
            this.f37672a = num;
            this.f37673b = str;
            this.f37674c = modifier;
            this.f37675d = z8;
            this.f37676e = z9;
            this.f37677f = interfaceC1668n;
            this.f37678g = interfaceC1668n2;
            this.f37679h = i8;
            this.f37680i = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            p0.a(this.f37672a, this.f37673b, this.f37674c, this.f37675d, this.f37676e, this.f37677f, this.f37678g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37679h | 1), this.f37680i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f37681a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1668n interfaceC1668n) {
            super(2);
            this.f37681a = interfaceC1668n;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-72062207, i8, -1, "com.stripe.android.uicore.elements.SectionCard.<anonymous> (SectionUI.kt:93)");
            }
            InterfaceC1668n interfaceC1668n = this.f37681a;
            composer.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            interfaceC1668n.invoke(composer, 0);
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
        final /* synthetic */ Modifier f37682a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Shape f37683b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37684c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f37685d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BorderStroke f37686e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f37687f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f37688g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f37689h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Modifier modifier, Shape shape, boolean z8, long j8, BorderStroke borderStroke, InterfaceC1668n interfaceC1668n, int i8, int i9) {
            super(2);
            this.f37682a = modifier;
            this.f37683b = shape;
            this.f37684c = z8;
            this.f37685d = j8;
            this.f37686e = borderStroke;
            this.f37687f = interfaceC1668n;
            this.f37688g = i8;
            this.f37689h = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            p0.b(this.f37682a, this.f37683b, this.f37684c, this.f37685d, this.f37686e, this.f37687f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37688g | 1), this.f37689h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f37690a = new d();

        d() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37691a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, int i8) {
            super(2);
            this.f37691a = str;
            this.f37692b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            p0.c(this.f37691a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37692b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f37693a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return O5.I.f8278a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3255y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.heading(semantics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f37694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Integer num, int i8) {
            super(2);
            this.f37694a = num;
            this.f37695b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            p0.d(this.f37694a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37695b | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Integer r30, java.lang.String r31, androidx.compose.ui.Modifier r32, boolean r33, boolean r34, a6.InterfaceC1668n r35, a6.InterfaceC1668n r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.p0.a(java.lang.Integer, java.lang.String, androidx.compose.ui.Modifier, boolean, boolean, a6.n, a6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.Modifier r23, androidx.compose.ui.graphics.Shape r24, boolean r25, long r26, androidx.compose.foundation.BorderStroke r28, a6.InterfaceC1668n r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.p0.b(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, boolean, long, androidx.compose.foundation.BorderStroke, a6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(String error, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        AbstractC3255y.i(error, "error");
        Composer startRestartGroup = composer.startRestartGroup(-985456758);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(error)) {
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
                ComposerKt.traceEventStart(-985456758, i9, -1, "com.stripe.android.uicore.elements.SectionError (SectionUI.kt:104)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1419Text4IGK_g(error, SemanticsModifierKt.semantics(Modifier.Companion, true, d.f37690a), materialTheme.getColors(startRestartGroup, i11).m1177getError0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i11).getH6(), composer2, i9 & 14, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(error, i8));
        }
    }

    public static final void d(Integer num, Composer composer, int i8) {
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1654170730);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(num)) {
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
                ComposerKt.traceEventStart(1654170730, i9, -1, "com.stripe.android.uicore.elements.SectionTitle (SectionUI.kt:59)");
            }
            if (num != null) {
                F.a(StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, i9 & 14), SemanticsModifierKt.semantics(PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dp.m5183constructorimpl(4), 7, null), true, f.f37693a), startRestartGroup, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(num, i8));
        }
    }
}