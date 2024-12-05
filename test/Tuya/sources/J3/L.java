package J3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3087m;
import j4.C3077c;
import j4.C3085k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class L {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f4854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Integer num, String str) {
            super(2);
            this.f4854a = num;
            this.f4855b = str;
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
                ComposerKt.traceEventStart(2100448978, i8, -1, "com.stripe.android.paymentsheet.ui.LabelUI.<anonymous> (PrimaryButton.kt:287)");
            }
            int m5082getCentere0LSkKk = TextAlign.Companion.m5082getCentere0LSkKk();
            Integer num = this.f4854a;
            float f8 = 4;
            TextKt.m1414Text4IGK_g(this.f4855b, PaddingKt.m603paddingqDBjuR0(Modifier.Companion, Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(5)), num != null ? ColorKt.Color(num.intValue()) : Color.Companion.m3007getUnspecified0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5075boximpl(m5082getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1) null, AbstractC3087m.i(C3085k.f33229a.b(), composer, C3077c.f33167e), composer, 0, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4856a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f4857b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4858c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Integer num, int i8) {
            super(2);
            this.f4856a = str;
            this.f4857b = num;
            this.f4858c = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            L.a(this.f4856a, this.f4857b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4858c | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str, Integer num, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(606920128);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(num)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(606920128, i9, -1, "com.stripe.android.paymentsheet.ui.LabelUI (PrimaryButton.kt:285)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2100448978, true, new a(num, str)), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(str, num, i8));
        }
    }
}
