package h4;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;

/* renamed from: h4.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2956w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.w$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ State f32780a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(State state) {
            super(2);
            this.f32780a = state;
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
                ComposerKt.traceEventStart(171510645, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:49)");
            }
            String c8 = AbstractC2956w.c(this.f32780a);
            if (c8 != null) {
                TextKt.m1419Text4IGK_g(c8, (Modifier) null, AbstractC3441m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).j(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, composer, 0, 0, 131066);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.w$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2955v f32781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32782b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p4.G f32783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2955v c2955v, boolean z8, p4.G g8) {
            super(2);
            this.f32781a = c2955v;
            this.f32782b = z8;
            this.f32783c = g8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            int m4875getNexteUduSuo;
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(750276790, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:38)");
            }
            p4.w0 i9 = this.f32781a.h().i();
            boolean z8 = this.f32782b;
            if (AbstractC3255y.d(this.f32783c, this.f32781a.a())) {
                m4875getNexteUduSuo = ImeAction.Companion.m4873getDoneeUduSuo();
            } else {
                m4875getNexteUduSuo = ImeAction.Companion.m4875getNexteUduSuo();
            }
            p4.C0.c(i9, z8, m4875getNexteUduSuo, null, null, 0, 0, null, composer, 8, 248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.w$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2955v f32785b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p4.G f32786c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f32787d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, C2955v c2955v, p4.G g8, int i8) {
            super(2);
            this.f32784a = z8;
            this.f32785b = c2955v;
            this.f32786c = g8;
            this.f32787d = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2956w.a(this.f32784a, this.f32785b, this.f32786c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32787d | 1));
        }
    }

    public static final void a(boolean z8, C2955v element, p4.G g8, Composer composer, int i8) {
        AbstractC3255y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(-1062029600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062029600, i8, -1, "com.stripe.android.ui.core.elements.BsbElementUI (BsbElementUI.kt:22)");
        }
        State a8 = y4.f.a(element.h().i().getError(), startRestartGroup, 8);
        State a9 = y4.f.a(element.g(), startRestartGroup, 8);
        p4.C b8 = b(a8);
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
        p4.p0.a(null, str, null, false, false, ComposableLambdaKt.composableLambda(startRestartGroup, 171510645, true, new a(a9)), ComposableLambdaKt.composableLambda(startRestartGroup, 750276790, true, new b(element, z8, g8)), startRestartGroup, 1769478, 28);
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

    private static final p4.C b(State state) {
        return (p4.C) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(State state) {
        return (String) state.getValue();
    }
}
