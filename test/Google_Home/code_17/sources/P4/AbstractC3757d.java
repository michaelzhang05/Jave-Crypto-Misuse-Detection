package p4;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;

/* renamed from: p4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3757d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f37447a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3751a f37448b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f37449c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f37450d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37451e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, C3751a c3751a, Set set, G g8, int i8) {
            super(2);
            this.f37447a = z8;
            this.f37448b = c3751a;
            this.f37449c = set;
            this.f37450d = g8;
            this.f37451e = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3757d.a(this.f37447a, this.f37448b, this.f37449c, this.f37450d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37451e | 1));
        }
    }

    public static final void a(boolean z8, C3751a controller, Set hiddenIdentifiers, G g8, Composer composer, int i8) {
        AbstractC3255y.i(controller, "controller");
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(1383545451);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1383545451, i8, -1, "com.stripe.android.uicore.elements.AddressElementUI (AddressElementUI.kt:22)");
        }
        List b8 = b(y4.f.a(controller.v(), startRestartGroup, 8));
        ArrayList arrayList = new ArrayList();
        for (Object obj : b8) {
            if (!hiddenIdentifiers.contains(((k0) obj).a())) {
                arrayList.add(obj);
            }
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
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
        Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1145868076);
        int i9 = 0;
        for (Object obj2 : arrayList) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC1378t.w();
            }
            int i11 = i9;
            l0.a(z8, (k0) obj2, null, hiddenIdentifiers, g8, 0, 0, startRestartGroup, (i8 & 14) | 4096 | ((i8 << 3) & 57344), 100);
            startRestartGroup.startReplaceableGroup(1145877083);
            if (i11 != AbstractC1378t.o(arrayList)) {
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i12 = MaterialTheme.$stable;
                DividerKt.m1218DivideroMI9zvI(PaddingKt.m607paddingVpY3zN4$default(Modifier.Companion, Dp.m5183constructorimpl(AbstractC3441m.o(materialTheme, startRestartGroup, i12).c()), 0.0f, 2, null), AbstractC3441m.n(materialTheme, startRestartGroup, i12).f(), Dp.m5183constructorimpl(AbstractC3441m.o(materialTheme, startRestartGroup, i12).c()), 0.0f, startRestartGroup, 0, 8);
            }
            startRestartGroup.endReplaceableGroup();
            i9 = i10;
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
            endRestartGroup.updateScope(new a(z8, controller, hiddenIdentifiers, g8, i8));
        }
    }

    private static final List b(State state) {
        return (List) state.getValue();
    }
}
