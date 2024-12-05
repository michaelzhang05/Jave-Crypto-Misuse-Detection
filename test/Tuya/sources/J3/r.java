package J3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f5363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5364b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f5365c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f5366d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5367e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5368f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5369g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Integer num, String str, long j8, Modifier modifier, boolean z8, int i8, int i9) {
            super(2);
            this.f5363a = num;
            this.f5364b = str;
            this.f5365c = j8;
            this.f5366d = modifier;
            this.f5367e = z8;
            this.f5368f = i8;
            this.f5369g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            r.a(this.f5363a, this.f5364b, this.f5365c, this.f5366d, this.f5367e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5368f | 1), this.f5369g);
        }
    }

    public static final void a(Integer num, String text, long j8, Modifier modifier, boolean z8, Composer composer, int i8, int i9) {
        Integer num2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Integer num3;
        long m2970copywmQWz5c$default;
        Composer composer2;
        Integer num4;
        AbstractC3159y.i(text, "text");
        AbstractC3159y.i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-470687082);
        int i16 = i9 & 1;
        if (i16 != 0) {
            i10 = i8 | 6;
            num2 = num;
        } else if ((i8 & 14) == 0) {
            num2 = num;
            if (startRestartGroup.changed(num2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            num2 = num;
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(text)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(j8)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i10 |= i14;
        }
        if ((i9 & 16) != 0) {
            i10 |= 24576;
        } else if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(z8)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i10 |= i15;
        }
        if ((46811 & i10) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            num4 = num2;
            composer2 = startRestartGroup;
        } else {
            if (i16 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-470687082, i10, -1, "com.stripe.android.paymentsheet.ui.LpmSelectorText (LpmSelectorText.kt:23)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
            startRestartGroup.startReplaceableGroup(-1309082853);
            if (num3 != null) {
                IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(num3.intValue(), startRestartGroup, 0), (String) null, PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, Dp.m5178constructorimpl(4), 0.0f, 2, null), MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1177getOnSurface0d7_KjU(), startRestartGroup, 440, 0);
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle caption = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getCaption();
            if (z8) {
                m2970copywmQWz5c$default = j8;
            } else {
                m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(j8, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            composer2 = startRestartGroup;
            TextKt.m1414Text4IGK_g(text, (Modifier) null, m2970copywmQWz5c$default, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5132getEllipsisgIe3tQ8(), false, 1, 0, (Function1) null, caption, composer2, (i10 >> 3) & 14, 3120, 55290);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            num4 = num3;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(num4, text, j8, modifier, z8, i8, i9));
        }
    }
}
