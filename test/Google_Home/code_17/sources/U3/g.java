package u3;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f39995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f39996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39998d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, InterfaceC1669o interfaceC1669o, int i8, int i9) {
            super(2);
            this.f39995a = modifier;
            this.f39996b = interfaceC1669o;
            this.f39997c = i8;
            this.f39998d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f39995a, this.f39996b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39997c | 1), this.f39998d);
        }
    }

    public static final void a(Modifier modifier, InterfaceC1669o content, Composer composer, int i8, int i9) {
        Modifier modifier2;
        int i10;
        Modifier modifier3;
        AbstractC3255y.i(content, "content");
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
            InterfaceC1669o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(verticalScroll$default);
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
            Updater.m2508setimpl(m2501constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl.getInserting() || !AbstractC3255y.d(m2501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2501constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2501constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i12 = (i10 & 14) | ((i10 << 6) & 7168);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion2.getConstructor();
            InterfaceC1669o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2501constructorimpl2 = Updater.m2501constructorimpl(startRestartGroup);
            Updater.m2508setimpl(m2501constructorimpl2, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2508setimpl(m2501constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            InterfaceC1668n setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m2501constructorimpl2.getInserting() || !AbstractC3255y.d(m2501constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2501constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2501constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2490boximpl(SkippableUpdater.m2491constructorimpl(startRestartGroup)), startRestartGroup, 0);
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

    public static final int b(C4059a c4059a, C4059a c4059a2) {
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
        String l8;
        AbstractC3255y.i(c4059a, "<this>");
        if (c4059a2 != null) {
            aVar = c4059a2.a();
        } else {
            aVar = null;
        }
        u.a a8 = c4059a.a();
        String str12 = "";
        if (a8 == null || (str = a8.a()) == null) {
            str = "";
        }
        if (aVar == null || (str2 = aVar.a()) == null) {
            str2 = "";
        }
        int c8 = c(str, str2);
        u.a a9 = c4059a.a();
        if (a9 == null || (str3 = a9.b()) == null) {
            str3 = "";
        }
        if (aVar == null || (str4 = aVar.b()) == null) {
            str4 = "";
        }
        int c9 = c8 + c(str3, str4);
        u.a a10 = c4059a.a();
        if (a10 == null || (str5 = a10.g()) == null) {
            str5 = "";
        }
        if (aVar == null || (str6 = aVar.g()) == null) {
            str6 = "";
        }
        int c10 = c9 + c(str5, str6);
        u.a a11 = c4059a.a();
        if (a11 == null || (str7 = a11.h()) == null) {
            str7 = "";
        }
        if (aVar == null || (str8 = aVar.h()) == null) {
            str8 = "";
        }
        int c11 = c10 + c(str7, str8);
        u.a a12 = c4059a.a();
        if (a12 == null || (str9 = a12.i()) == null) {
            str9 = "";
        }
        if (aVar == null || (str10 = aVar.i()) == null) {
            str10 = "";
        }
        int c12 = c11 + c(str9, str10);
        u.a a13 = c4059a.a();
        if (a13 == null || (str11 = a13.l()) == null) {
            str11 = "";
        }
        if (aVar != null && (l8 = aVar.l()) != null) {
            str12 = l8;
        }
        return c12 + c(str11, str12);
    }

    public static final int c(CharSequence charSequence, CharSequence other) {
        int i8;
        AbstractC3255y.i(charSequence, "<this>");
        AbstractC3255y.i(other, "other");
        if (AbstractC3255y.d(charSequence, other)) {
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
