package r3;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f37615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f37616b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37617c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37618d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, o oVar, int i8, int i9) {
            super(2);
            this.f37615a = modifier;
            this.f37616b = oVar;
            this.f37617c = i8;
            this.f37618d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f37615a, this.f37616b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37617c | 1), this.f37618d);
        }
    }

    public static final void a(Modifier modifier, o content, Composer composer, int i8, int i9) {
        Modifier modifier2;
        int i10;
        Modifier modifier3;
        AbstractC3159y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(249772746);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
            modifier2 = modifier;
        } else if ((i8 & 14) == 0) {
            modifier2 = modifier;
            i10 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i8;
        } else {
            modifier2 = modifier;
            i10 = i8;
        }
        if ((2 & i9) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i11 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(249772746, i10, -1, "com.stripe.android.paymentsheet.addresselement.ScrollableColumn (AddressUtils.kt:61)");
            }
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(verticalScroll$default);
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
            Updater.m2503setimpl(m2496constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl.getInserting() || !AbstractC3159y.d(m2496constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2496constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2496constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i12 = (i10 & 14) | ((i10 << 6) & 7168);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion2.getConstructor();
            o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2496constructorimpl2 = Updater.m2496constructorimpl(startRestartGroup);
            Updater.m2503setimpl(m2496constructorimpl2, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2503setimpl(m2496constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            n setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m2496constructorimpl2.getInserting() || !AbstractC3159y.d(m2496constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2496constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2496constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2485boximpl(SkippableUpdater.m2486constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            content.invoke(ColumnScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i12 >> 6) & 112) | 6));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(modifier3, content, i8, i9));
        }
    }

    public static final int b(C3686a c3686a, C3686a c3686a2) {
        u.a aVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String j8;
        AbstractC3159y.i(c3686a, "<this>");
        if (c3686a2 != null) {
            aVar = c3686a2.b();
        } else {
            aVar = null;
        }
        u.a b8 = c3686a.b();
        String str12 = "";
        if (b8 == null || (str = b8.b()) == null) {
            str = "";
        }
        if (aVar == null || (str2 = aVar.b()) == null) {
            str2 = "";
        }
        int c8 = c(str, str2);
        u.a b9 = c3686a.b();
        if (b9 == null || (str3 = b9.c()) == null) {
            str3 = "";
        }
        if (aVar == null || (str4 = aVar.c()) == null) {
            str4 = "";
        }
        int c9 = c8 + c(str3, str4);
        u.a b10 = c3686a.b();
        if (b10 == null || (str5 = b10.e()) == null) {
            str5 = "";
        }
        if (aVar == null || (str6 = aVar.e()) == null) {
            str6 = "";
        }
        int c10 = c9 + c(str5, str6);
        u.a b11 = c3686a.b();
        if (b11 == null || (str7 = b11.f()) == null) {
            str7 = "";
        }
        if (aVar == null || (str8 = aVar.f()) == null) {
            str8 = "";
        }
        int c11 = c10 + c(str7, str8);
        u.a b12 = c3686a.b();
        if (b12 == null || (str9 = b12.i()) == null) {
            str9 = "";
        }
        if (aVar == null || (str10 = aVar.i()) == null) {
            str10 = "";
        }
        int c12 = c11 + c(str9, str10);
        u.a b13 = c3686a.b();
        if (b13 == null || (str11 = b13.j()) == null) {
            str11 = "";
        }
        if (aVar != null && (j8 = aVar.j()) != null) {
            str12 = j8;
        }
        return c12 + c(str11, str12);
    }

    public static final int c(CharSequence charSequence, CharSequence other) {
        int i8;
        AbstractC3159y.i(charSequence, "<this>");
        AbstractC3159y.i(other, "other");
        if (AbstractC3159y.d(charSequence, other)) {
            return 0;
        }
        if (charSequence.length() == 0) {
            return other.length();
        }
        if (other.length() == 0) {
            return charSequence.length();
        }
        int length = charSequence.length();
        int i9 = length + 1;
        int length2 = other.length() + 1;
        Integer[] numArr = new Integer[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            numArr[i10] = Integer.valueOf(i10);
        }
        Integer[] numArr2 = new Integer[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            numArr2[i11] = 0;
        }
        int i12 = 1;
        while (i12 < length2) {
            numArr2[0] = Integer.valueOf(i12);
            for (int i13 = 1; i13 < i9; i13++) {
                int i14 = i13 - 1;
                if (charSequence.charAt(i14) == other.charAt(i12 - 1)) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                numArr2[i13] = Integer.valueOf(Math.min(Math.min(numArr[i13].intValue() + 1, numArr2[i14].intValue() + 1), numArr[i14].intValue() + i8));
            }
            i12++;
            Integer[] numArr3 = numArr2;
            numArr2 = numArr;
            numArr = numArr3;
        }
        return numArr[length].intValue();
    }
}
