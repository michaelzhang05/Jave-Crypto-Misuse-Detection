package e4;

import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import p4.D;
import p4.G;

/* loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f31631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f31632b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f31633c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f31634d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f31635e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f31636f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f31637g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3698L interfaceC3698L, InterfaceC3698L interfaceC3698L2, InterfaceC3698L interfaceC3698L3, InterfaceC3698L interfaceC3698L4, Modifier modifier, int i8, int i9) {
            super(2);
            this.f31631a = interfaceC3698L;
            this.f31632b = interfaceC3698L2;
            this.f31633c = interfaceC3698L3;
            this.f31634d = interfaceC3698L4;
            this.f31635e = modifier;
            this.f31636f = i8;
            this.f31637g = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.b(this.f31631a, this.f31632b, this.f31633c, this.f31634d, this.f31635e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f31636f | 1), this.f31637g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f31638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31639b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f31640c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f31641d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f31642e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f31643f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f31644g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, boolean z8, List list, G g8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f31638a = set;
            this.f31639b = z8;
            this.f31640c = list;
            this.f31641d = g8;
            this.f31642e = modifier;
            this.f31643f = i8;
            this.f31644g = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.a(this.f31638a, this.f31639b, this.f31640c, this.f31641d, this.f31642e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f31643f | 1), this.f31644g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f31645a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31646b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f31647c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f31648d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f31649e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D d8, boolean z8, Set set, G g8, int i8) {
            super(2);
            this.f31645a = d8;
            this.f31646b = z8;
            this.f31647c = set;
            this.f31648d = g8;
            this.f31649e = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            i.g(this.f31645a, this.f31646b, this.f31647c, this.f31648d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f31649e | 1));
        }
    }

    public static final void a(Set hiddenIdentifiers, boolean z8, List elements, G g8, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3255y.i(elements, "elements");
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
        InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth);
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
        startRestartGroup.startReplaceableGroup(-1230466951);
        for (Object obj : elements) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1378t.w();
            }
            D d8 = (D) obj;
            startRestartGroup.startReplaceableGroup(-1230465628);
            if (!hiddenIdentifiers.contains(d8.a())) {
                g(d8, z8, hiddenIdentifiers, g8, startRestartGroup, (i8 & 112) | 520 | (G.f37099d << 9) | (i8 & 7168));
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

    public static final void b(InterfaceC3698L hiddenIdentifiersFlow, InterfaceC3698L enabledFlow, InterfaceC3698L elementsFlow, InterfaceC3698L lastTextFieldIdentifierFlow, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3255y.i(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        AbstractC3255y.i(enabledFlow, "enabledFlow");
        AbstractC3255y.i(elementsFlow, "elementsFlow");
        AbstractC3255y.i(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        Composer startRestartGroup = composer.startRestartGroup(-1475980057);
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1475980057, i8, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:45)");
        }
        State a8 = y4.f.a(hiddenIdentifiersFlow, startRestartGroup, 8);
        State a9 = y4.f.a(enabledFlow, startRestartGroup, 8);
        State a10 = y4.f.a(elementsFlow, startRestartGroup, 8);
        State a11 = y4.f.a(lastTextFieldIdentifierFlow, startRestartGroup, 8);
        a(c(a8), d(a9), e(a10), f(a11), modifier2, startRestartGroup, (G.f37099d << 9) | 520 | (57344 & i8), 0);
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
    public static final void g(p4.D r18, boolean r19, java.util.Set r20, p4.G r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.i.g(p4.D, boolean, java.util.Set, p4.G, androidx.compose.runtime.Composer, int):void");
    }
}
