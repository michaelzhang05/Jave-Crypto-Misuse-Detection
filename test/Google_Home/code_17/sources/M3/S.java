package M3;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class S {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6589c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ PaddingValues f6590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Arrangement.Vertical f6591e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f6592f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z8, boolean z9, Function0 function0, PaddingValues paddingValues, Arrangement.Vertical vertical, InterfaceC1669o interfaceC1669o) {
            super(2);
            this.f6587a = z8;
            this.f6588b = z9;
            this.f6589c = function0;
            this.f6590d = paddingValues;
            this.f6591e = vertical;
            this.f6592f = interfaceC1669o;
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
                ComposerKt.traceEventStart(-1029411776, i8, -1, "com.stripe.android.paymentsheet.ui.RowButton.<anonymous> (RowButton.kt:36)");
            }
            Modifier padding = PaddingKt.padding(SelectableKt.m830selectableXHw0xAI$default(Modifier.Companion, this.f6587a, this.f6588b, null, this.f6589c, 4, null), this.f6590d);
            Arrangement.Vertical vertical = this.f6591e;
            InterfaceC1669o interfaceC1669o = this.f6592f;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
            Updater.m2508setimpl(m2501constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            interfaceC1669o.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
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
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6594b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6595c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0 f6596d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PaddingValues f6597e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Arrangement.Vertical f6598f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f6599g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f6600h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6601i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f6602j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, boolean z10, Function0 function0, PaddingValues paddingValues, Arrangement.Vertical vertical, Modifier modifier, InterfaceC1669o interfaceC1669o, int i8, int i9) {
            super(2);
            this.f6593a = z8;
            this.f6594b = z9;
            this.f6595c = z10;
            this.f6596d = function0;
            this.f6597e = paddingValues;
            this.f6598f = vertical;
            this.f6599g = modifier;
            this.f6600h = interfaceC1669o;
            this.f6601i = i8;
            this.f6602j = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            S.a(this.f6593a, this.f6594b, this.f6595c, this.f6596d, this.f6597e, this.f6598f, this.f6599g, this.f6600h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6601i | 1), this.f6602j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r29, boolean r30, boolean r31, kotlin.jvm.functions.Function0 r32, androidx.compose.foundation.layout.PaddingValues r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.ui.Modifier r35, a6.InterfaceC1669o r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.S.a(boolean, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Modifier, a6.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
