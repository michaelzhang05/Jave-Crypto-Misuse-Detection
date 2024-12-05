package m4;

import M5.AbstractC1246t;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import j4.AbstractC3087m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: m4.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3413c0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.c0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f35415a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableState mutableState) {
            super(1);
            this.f35415a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5610invokeozmzZPI(((IntSize) obj).m5348unboximpl());
            return L5.I.f6487a;
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final void m5610invokeozmzZPI(long j8) {
            this.f35415a.setValue(Dp.m5176boximpl(Dp.m5178constructorimpl(IntSize.m5343getHeightimpl(j8) / Resources.getSystem().getDisplayMetrics().density)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.c0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3409a0 f35417b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f35418c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f35419d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35420e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C3409a0 c3409a0, Set set, G g8, int i8) {
            super(2);
            this.f35416a = z8;
            this.f35417b = c3409a0;
            this.f35418c = set;
            this.f35419d = g8;
            this.f35420e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3413c0.a(this.f35416a, this.f35417b, this.f35418c, this.f35419d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f35420e | 1));
        }
    }

    public static final void a(boolean z8, C3409a0 controller, Set hiddenIdentifiers, G g8, Composer composer, int i8) {
        int m2664getRightdhqQ8s;
        int m2661getLeftdhqQ8s;
        int i9 = i8;
        AbstractC3159y.i(controller, "controller");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(652994833);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(652994833, i9, -1, "com.stripe.android.uicore.elements.RowElementUI (RowElementUI.kt:27)");
        }
        List v8 = controller.v();
        ArrayList arrayList = new ArrayList();
        for (Object obj : v8) {
            if (true ^ hiddenIdentifiers.contains(((o0) obj).a())) {
                arrayList.add(obj);
            }
        }
        startRestartGroup.startReplaceableGroup(1628104230);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5176boximpl(Dp.m5178constructorimpl(0)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        if (!arrayList.isEmpty()) {
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
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
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(985624882);
            int i10 = 0;
            for (Object obj2 : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1246t.w();
                }
                o0 o0Var = (o0) obj2;
                if (i10 == AbstractC1246t.o(arrayList)) {
                    m2664getRightdhqQ8s = FocusDirection.Companion.m2658getDowndhqQ8s();
                } else {
                    m2664getRightdhqQ8s = FocusDirection.Companion.m2664getRightdhqQ8s();
                }
                int i12 = m2664getRightdhqQ8s;
                if (i10 == 0) {
                    m2661getLeftdhqQ8s = FocusDirection.Companion.m2665getUpdhqQ8s();
                } else {
                    m2661getLeftdhqQ8s = FocusDirection.Companion.m2661getLeftdhqQ8s();
                }
                int i13 = m2661getLeftdhqQ8s;
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier a8 = androidx.compose.foundation.layout.e.a(rowScopeInstance, companion2, 1.0f / arrayList.size(), false, 2, null);
                startRestartGroup.startReplaceableGroup(-1578013810);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new a(mutableState);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                int i14 = (i9 & 14) | 4096 | ((i9 << 3) & 57344);
                int i15 = i10;
                l0.a(z8, o0Var, OnRemeasuredModifierKt.onSizeChanged(a8, (Function1) rememberedValue2), hiddenIdentifiers, g8, i12, i13, startRestartGroup, i14, 0);
                startRestartGroup.startReplaceableGroup(985660022);
                if (i15 != AbstractC1246t.o(arrayList)) {
                    Modifier m633height3ABfNKs = SizeKt.m633height3ABfNKs(companion2, ((Dp) mutableState.getValue()).m5192unboximpl());
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i16 = MaterialTheme.$stable;
                    DividerKt.m1213DivideroMI9zvI(SizeKt.m652width3ABfNKs(m633height3ABfNKs, Dp.m5178constructorimpl(AbstractC3087m.o(materialTheme, startRestartGroup, i16).c())), AbstractC3087m.n(materialTheme, startRestartGroup, i16).f(), 0.0f, 0.0f, startRestartGroup, 0, 12);
                }
                startRestartGroup.endReplaceableGroup();
                i9 = i8;
                i10 = i11;
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, controller, hiddenIdentifiers, g8, i8));
        }
    }
}
