package e4;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import j4.AbstractC3087m;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: e4.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2636w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f30859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(State state) {
            super(2);
            this.f30859a = state;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(171510645, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:49)");
            }
            String c8 = AbstractC2636w.c(this.f30859a);
            if (c8 != null) {
                TextKt.m1414Text4IGK_g(c8, (Modifier) null, AbstractC3087m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131066);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2635v f30860a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30861b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m4.G f30862c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2635v c2635v, boolean z8, m4.G g8) {
            super(2);
            this.f30860a = c2635v;
            this.f30861b = z8;
            this.f30862c = g8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            int m4870getNexteUduSuo;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(750276790, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:38)");
            }
            m4.w0 i9 = this.f30860a.h().i();
            boolean z8 = this.f30861b;
            if (AbstractC3159y.d(this.f30862c, this.f30860a.a())) {
                m4870getNexteUduSuo = ImeAction.Companion.m4868getDoneeUduSuo();
            } else {
                m4870getNexteUduSuo = ImeAction.Companion.m4870getNexteUduSuo();
            }
            m4.C0.c(i9, z8, m4870getNexteUduSuo, null, null, 0, 0, null, composer, 8, 248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30863a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2635v f30864b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m4.G f30865c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30866d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, C2635v c2635v, m4.G g8, int i8) {
            super(2);
            this.f30863a = z8;
            this.f30864b = c2635v;
            this.f30865c = g8;
            this.f30866d = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2636w.a(this.f30863a, this.f30864b, this.f30865c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30866d | 1));
        }
    }

    public static final void a(boolean z8, C2635v element, m4.G g8, Composer composer, int i8) {
        AbstractC3159y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(-1062029600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062029600, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI (BsbElementUI.kt:22)");
        }
        State a8 = v4.f.a(element.h().i().getError(), startRestartGroup, 8);
        State a9 = v4.f.a(element.g(), startRestartGroup, 8);
        m4.C b8 = b(a8);
        startRestartGroup.startReplaceableGroup(-505119412);
        String str = null;
        if (b8 != null) {
            Object[] b9 = b8.b();
            startRestartGroup.startReplaceableGroup(-505118554);
            if (b9 != null) {
                str = StringResources_androidKt.stringResource(b8.a(), Arrays.copyOf(b9, b9.length), startRestartGroup, 64);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-505118984);
            if (str == null) {
                str = StringResources_androidKt.stringResource(b8.a(), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceableGroup();
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m2503setimpl(m2496constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        m4.p0.a(null, str, null, false, false, ComposableLambdaKt.composableLambda(startRestartGroup, 171510645, true, new a(a9)), ComposableLambdaKt.composableLambda(startRestartGroup, 750276790, true, new b(element, z8, g8)), startRestartGroup, 1769478, 28);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(z8, element, g8, i8));
        }
    }

    private static final m4.C b(State state) {
        return (m4.C) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(State state) {
        return (String) state.getValue();
    }
}
