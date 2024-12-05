package b4;

import L5.I;
import M5.AbstractC1246t;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.D;
import m4.G;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f14625a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f14626b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f14627c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3349K f14628d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f14629e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14630f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14631g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3349K interfaceC3349K, InterfaceC3349K interfaceC3349K2, InterfaceC3349K interfaceC3349K3, InterfaceC3349K interfaceC3349K4, Modifier modifier, int i8, int i9) {
            super(2);
            this.f14625a = interfaceC3349K;
            this.f14626b = interfaceC3349K2;
            this.f14627c = interfaceC3349K3;
            this.f14628d = interfaceC3349K4;
            this.f14629e = modifier;
            this.f14630f = i8;
            this.f14631g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(this.f14625a, this.f14626b, this.f14627c, this.f14628d, this.f14629e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14630f | 1), this.f14631g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f14632a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14633b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f14634c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f14635d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f14636e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14637f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f14638g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, boolean z8, List list, G g8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f14632a = set;
            this.f14633b = z8;
            this.f14634c = list;
            this.f14635d = g8;
            this.f14636e = modifier;
            this.f14637f = i8;
            this.f14638g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f14632a, this.f14633b, this.f14634c, this.f14635d, this.f14636e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14637f | 1), this.f14638g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f14639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f14641c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f14642d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14643e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D d8, boolean z8, Set set, G g8, int i8) {
            super(2);
            this.f14639a = d8;
            this.f14640b = z8;
            this.f14641c = set;
            this.f14642d = g8;
            this.f14643e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            i.g(this.f14639a, this.f14640b, this.f14641c, this.f14642d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f14643e | 1));
        }
    }

    public static final void a(Set hiddenIdentifiers, boolean z8, List elements, G g8, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3159y.i(elements, "elements");
        Composer startRestartGroup = composer.startRestartGroup(1527302195);
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1527302195, i8, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:68)");
        }
        Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
        startRestartGroup.startReplaceableGroup(-483455358);
        int i10 = 0;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth);
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
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1230466951);
        for (Object obj : elements) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1246t.w();
            }
            D d8 = (D) obj;
            startRestartGroup.startReplaceableGroup(-1230465628);
            if (!hiddenIdentifiers.contains(d8.a())) {
                g(d8, z8, hiddenIdentifiers, g8, startRestartGroup, (i8 & 112) | 520 | (G.f35073d << 9) | (i8 & 7168));
            }
            startRestartGroup.endReplaceableGroup();
            i10 = i11;
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
            endRestartGroup.updateScope(new b(hiddenIdentifiers, z8, elements, g8, modifier2, i8, i9));
        }
    }

    public static final void b(InterfaceC3349K hiddenIdentifiersFlow, InterfaceC3349K enabledFlow, InterfaceC3349K elementsFlow, InterfaceC3349K lastTextFieldIdentifierFlow, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3159y.i(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        AbstractC3159y.i(enabledFlow, "enabledFlow");
        AbstractC3159y.i(elementsFlow, "elementsFlow");
        AbstractC3159y.i(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        Composer startRestartGroup = composer.startRestartGroup(-1475980057);
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1475980057, i8, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:45)");
        }
        State a8 = v4.f.a(hiddenIdentifiersFlow, startRestartGroup, 8);
        State a9 = v4.f.a(enabledFlow, startRestartGroup, 8);
        State a10 = v4.f.a(elementsFlow, startRestartGroup, 8);
        State a11 = v4.f.a(lastTextFieldIdentifierFlow, startRestartGroup, 8);
        a(c(a8), d(a9), e(a10), f(a11), modifier2, startRestartGroup, (G.f35073d << 9) | 520 | (57344 & i8), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, modifier2, i8, i9));
        }
    }

    private static final Set c(State state) {
        return (Set) state.getValue();
    }

    private static final boolean d(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final List e(State state) {
        return (List) state.getValue();
    }

    private static final G f(State state) {
        return (G) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(m4.D r18, boolean r19, java.util.Set r20, m4.G r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.i.g(m4.D, boolean, java.util.Set, m4.G, androidx.compose.runtime.Composer, int):void");
    }
}
