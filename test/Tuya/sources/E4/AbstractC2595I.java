package e4;

import M5.AbstractC1246t;
import android.content.Intent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.stripecardscan.cardscan.exception.UnknownScanException;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: e4.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2595I {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.I$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30381a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return L5.I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.heading(semantics);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.I$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2593G f30382a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2593G c2593g) {
            super(1);
            this.f30382a = c2593g;
        }

        public final void a(Intent it) {
            AbstractC3159y.i(it, "it");
            K i8 = this.f30382a.v().i().z().i();
            CardScanSheetResult cardScanSheetResult = (CardScanSheetResult) it.getParcelableExtra("CardScanActivityResult");
            if (cardScanSheetResult == null) {
                cardScanSheetResult = (CardScanSheetResult) new CardScanSheetResult.Failed(new UnknownScanException("No data in the result intent"));
            }
            i8.y(cardScanSheetResult);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.I$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30383a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2593G f30384b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f30385c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m4.G f30386d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, C2593G c2593g, Set set, m4.G g8, int i8) {
            super(2);
            this.f30383a = z8;
            this.f30384b = c2593g;
            this.f30385c = set;
            this.f30386d = g8;
            this.f30387e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2595I.a(this.f30383a, this.f30384b, this.f30385c, this.f30386d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30387e | 1));
        }
    }

    public static final void a(boolean z8, C2593G controller, Set hiddenIdentifiers, m4.G g8, Composer composer, int i8) {
        AbstractC3159y.i(controller, "controller");
        AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
        Composer startRestartGroup = composer.startRestartGroup(-314260694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-314260694, i8, -1, "com.stripe.android.ui.core.elements.CardDetailsSectionElementUI (CardDetailsSectionElementUI.kt:29)");
        }
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
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
        m4.F.a(StringResources_androidKt.stringResource(b4.n.f14696I, startRestartGroup, 0), SemanticsModifierKt.semantics(companion, true, a.f30381a), startRestartGroup, 0, 0);
        startRestartGroup.startReplaceableGroup(-1089014030);
        if (controller.w() && controller.x().invoke()) {
            E0.a(z8, new b(controller), startRestartGroup, i8 & 14);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        m4.i0.a(z8, new m4.h0(m4.G.Companion.a("credit_details"), AbstractC1246t.e(controller.v()), new m4.g0(null, AbstractC1246t.e(controller.v().f()))), hiddenIdentifiers, g8, 0, 0, startRestartGroup, (i8 & 14) | 512 | (m4.h0.f35514g << 3) | (m4.G.f35073d << 9) | (i8 & 7168), 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, controller, hiddenIdentifiers, g8, i8));
        }
    }
}
