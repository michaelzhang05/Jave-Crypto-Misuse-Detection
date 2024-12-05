package O3;

import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import v4.C4108g;

/* loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f8100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8101b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8102c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4108g f8103d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8104e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8105f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, int i8, boolean z8, C4108g c4108g, Modifier modifier, int i9, int i10) {
            super(2);
            this.f8100a = list;
            this.f8101b = i8;
            this.f8102c = z8;
            this.f8103d = c4108g;
            this.f8104e = modifier;
            this.f8105f = i9;
            this.f8106g = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            l.a(this.f8100a, this.f8101b, this.f8102c, this.f8103d, this.f8104e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8105f | 1), this.f8106g);
        }
    }

    public static final void a(List paymentMethods, int i8, boolean z8, C4108g imageLoader, Modifier modifier, Composer composer, int i9, int i10) {
        Modifier modifier2;
        boolean z9;
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(-317174614);
        if ((i10 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-317174614, i9, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodVerticalLayoutUI (NewPaymentMethodVerticalLayoutUI.kt:19)");
        }
        Modifier testTag = TestTagKt.testTag(modifier2, "TEST_TAG_NEW_PAYMENT_METHOD_VERTICAL_LAYOUT_UI");
        Arrangement.HorizontalOrVertical m519spacedBy0680j_4 = Arrangement.INSTANCE.m519spacedBy0680j_4(Dp.m5183constructorimpl(12));
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m519spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
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
        startRestartGroup.startReplaceableGroup(-1479332989);
        int i11 = 0;
        for (Object obj : paymentMethods) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC1378t.w();
            }
            e eVar = (e) obj;
            if (i11 == i8) {
                z9 = true;
            } else {
                z9 = false;
            }
            k.b(z8, z9, eVar, imageLoader, null, startRestartGroup, ((i9 >> 6) & 14) | 512 | (C4108g.f40212g << 9) | (i9 & 7168), 16);
            i11 = i12;
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(paymentMethods, i8, z8, imageLoader, modifier2, i9, i10));
        }
    }
}
