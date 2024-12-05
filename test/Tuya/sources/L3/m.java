package L3;

import L5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.o f6316a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6317b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6318c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6319d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6320e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X5.o f6321f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X5.o oVar, String str, String str2, boolean z8, String str3, X5.o oVar2) {
            super(3);
            this.f6316a = oVar;
            this.f6317b = str;
            this.f6318c = str2;
            this.f6319d = z8;
            this.f6320e = str3;
            this.f6321f = oVar2;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(ColumnScope RowButton, Composer composer, int i8) {
            AbstractC3159y.i(RowButton, "$this$RowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1618778555, i8, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButton.<anonymous> (PaymentMethodRowButton.kt:51)");
            }
            Arrangement.HorizontalOrVertical m514spacedBy0680j_4 = Arrangement.INSTANCE.m514spacedBy0680j_4(Dp.m5178constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            X5.o oVar = this.f6316a;
            String str = this.f6317b;
            String str2 = this.f6318c;
            boolean z8 = this.f6319d;
            String str3 = this.f6320e;
            X5.o oVar2 = this.f6321f;
            composer.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m514spacedBy0680j_4, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            X5.o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2496constructorimpl = Updater.m2496constructorimpl(composer);
            Updater.m2503setimpl(m2496constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            X5.n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            oVar.invoke(rowScopeInstance, composer, 6);
            m.b(str, str2, z8, str3, composer, 0);
            composer.startReplaceableGroup(-2131589125);
            if (oVar2 != null) {
                SpacerKt.Spacer(androidx.compose.foundation.layout.e.a(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                oVar2.invoke(rowScopeInstance, composer, 6);
            }
            composer.endReplaceableGroup();
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
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6322a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6323b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6324c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.o f6325d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6326e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6327f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0 f6328g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f6329h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f6330i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ X5.o f6331j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f6332k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6333l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, boolean z10, X5.o oVar, String str, String str2, Function0 function0, String str3, Modifier modifier, X5.o oVar2, int i8, int i9) {
            super(2);
            this.f6322a = z8;
            this.f6323b = z9;
            this.f6324c = z10;
            this.f6325d = oVar;
            this.f6326e = str;
            this.f6327f = str2;
            this.f6328g = function0;
            this.f6329h = str3;
            this.f6330i = modifier;
            this.f6331j = oVar2;
            this.f6332k = i8;
            this.f6333l = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            m.a(this.f6322a, this.f6323b, this.f6324c, this.f6325d, this.f6326e, this.f6327f, this.f6328g, this.f6329h, this.f6330i, this.f6331j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6332k | 1), this.f6333l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6334a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f6334a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f6487a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
            String str = this.f6334a;
            if (str != null) {
                SemanticsPropertiesKt.setContentDescription(semantics, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6335a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6336b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6337c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6338d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6339e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, boolean z8, String str3, int i8) {
            super(2);
            this.f6335a = str;
            this.f6336b = str2;
            this.f6337c = z8;
            this.f6338d = str3;
            this.f6339e = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            m.b(this.f6335a, this.f6336b, this.f6337c, this.f6338d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6339e | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r26, boolean r27, boolean r28, X5.o r29, java.lang.String r30, java.lang.String r31, kotlin.jvm.functions.Function0 r32, java.lang.String r33, androidx.compose.ui.Modifier r34, X5.o r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.m.a(boolean, boolean, boolean, X5.o, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.ui.Modifier, X5.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, String str2, boolean z8, String str3, Composer composer, int i8) {
        int i9;
        TextStyle m4719copyv2rsoow;
        long m2970copywmQWz5c$default;
        boolean z9;
        Composer composer2;
        TextStyle m4719copyv2rsoow2;
        long m2970copywmQWz5c$default2;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1878365604);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(str2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(str3)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1878365604, i9, -1, "com.stripe.android.paymentsheet.verticalmode.TitleContent (PaymentMethodRowButton.kt:73)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            long h8 = AbstractC3087m.n(materialTheme, startRestartGroup, i14).h();
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
            TextStyle body1 = materialTheme.getTypography(startRestartGroup, i14).getBody1();
            FontWeight.Companion companion3 = FontWeight.Companion;
            m4719copyv2rsoow = body1.m4719copyv2rsoow((r48 & 1) != 0 ? body1.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? body1.spanStyle.m4652getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? body1.spanStyle.getFontWeight() : companion3.getMedium(), (r48 & 8) != 0 ? body1.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? body1.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? body1.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? body1.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? body1.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? body1.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? body1.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? body1.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? body1.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? body1.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? body1.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? body1.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(body1.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(body1.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? body1.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? body1.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? body1.platformStyle : null, (r48 & 1048576) != 0 ? body1.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(body1.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(body1.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? body1.paragraphStyle.getTextMotion() : null);
            if (z8) {
                m2970copywmQWz5c$default = h8;
            } else {
                m2970copywmQWz5c$default = Color.m2970copywmQWz5c$default(h8, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            int m5132getEllipsisgIe3tQ8 = TextOverflow.Companion.m5132getEllipsisgIe3tQ8();
            startRestartGroup.startReplaceableGroup(1678923623);
            if ((i9 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new c(str3);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextKt.m1414Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), m2970copywmQWz5c$default, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m5132getEllipsisgIe3tQ8, false, 1, 0, (Function1) null, m4719copyv2rsoow, startRestartGroup, i9 & 14, 3120, 55288);
            startRestartGroup.startReplaceableGroup(1678929216);
            if (str2 != null) {
                long j8 = AbstractC3087m.n(materialTheme, startRestartGroup, i14).j();
                m4719copyv2rsoow2 = r18.m4719copyv2rsoow((r48 & 1) != 0 ? r18.spanStyle.m4651getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r18.spanStyle.m4652getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r18.spanStyle.getFontWeight() : companion3.getNormal(), (r48 & 8) != 0 ? r18.spanStyle.m4653getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r18.spanStyle.m4654getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r18.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r18.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r18.spanStyle.m4655getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r18.spanStyle.m4650getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r18.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r18.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r18.spanStyle.m4649getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r18.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r18.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r18.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5075boximpl(r18.paragraphStyle.m4607getTextAligne0LSkKk()) : null, (r48 & 65536) != 0 ? TextDirection.m5089boximpl(r18.paragraphStyle.m4609getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r18.paragraphStyle.m4605getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r18.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r18.platformStyle : null, (r48 & 1048576) != 0 ? r18.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4995boximpl(r18.paragraphStyle.m4604getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4985boximpl(r18.paragraphStyle.m4602getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? materialTheme.getTypography(startRestartGroup, i14).getCaption().paragraphStyle.getTextMotion() : null);
                if (z8) {
                    m2970copywmQWz5c$default2 = j8;
                } else {
                    m2970copywmQWz5c$default2 = Color.m2970copywmQWz5c$default(j8, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composer2 = startRestartGroup;
                TextKt.m1414Text4IGK_g(str2, (Modifier) null, m2970copywmQWz5c$default2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, m4719copyv2rsoow2, composer2, (i9 >> 3) & 14, 0, 65530);
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(str, str2, z8, str3, i8));
        }
    }
}
