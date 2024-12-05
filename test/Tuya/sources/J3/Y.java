package J3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class Y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5141b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i8) {
            super(2);
            this.f5140a = str;
            this.f5141b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            Y.a(this.f5140a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5141b | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f5142a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5143b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, int i8, int i9) {
            super(2);
            this.f5142a = modifier;
            this.f5143b = i8;
            this.f5144c = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            Y.b(this.f5142a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5143b | 1), this.f5144c);
        }
    }

    public static final void a(String text, Composer composer, int i8) {
        int i9;
        Composer composer2;
        int i10;
        AbstractC3159y.i(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1860183759);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(text)) {
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
                ComposerKt.traceEventStart(-1860183759, i9, -1, "com.stripe.android.paymentsheet.ui.WalletsDivider (WalletsDivider.kt:21)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
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
            b(androidx.compose.foundation.layout.e.a(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0, 0);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i11 = MaterialTheme.$stable;
            TextKt.m1414Text4IGK_g(text, PaddingKt.m602paddingVpY3zN4$default(companion, Dp.m5178constructorimpl(8), 0.0f, 2, null), AbstractC3087m.n(materialTheme, startRestartGroup, i11).j(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, materialTheme.getTypography(startRestartGroup, i11).getBody1(), startRestartGroup, (i9 & 14) | 3120, 0, 65520);
            composer2 = startRestartGroup;
            b(androidx.compose.foundation.layout.e.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0, 0);
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
            endRestartGroup.updateScope(new a(text, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Modifier modifier, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        long m2970copywmQWz5c$default;
        Composer startRestartGroup = composer.startRestartGroup(-256253185);
        int i12 = i9 & 1;
        if (i12 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i10 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i12 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-256253185, i10, -1, "com.stripe.android.paymentsheet.ui.WalletsDividerLine (WalletsDivider.kt:47)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            if (AbstractC3087m.s(materialTheme.getColors(startRestartGroup, i13).m1182getSurface0d7_KjU())) {
                m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(Color.Companion.m2997getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(Color.Companion.m3008getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.m633height3ABfNKs(BackgroundKt.m282backgroundbw27NRU$default(modifier, m2970copywmQWz5c$default, null, 2, null), Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, startRestartGroup, i13).c())), 0.0f, 1, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(modifier, i8, i9));
        }
    }
}
