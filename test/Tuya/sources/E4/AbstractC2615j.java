package e4;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import j2.AbstractC3053E;
import j4.AbstractC3087m;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import u4.AbstractC3806c;

/* renamed from: e4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2615j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.j$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2617k f30718a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30719b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2617k c2617k, int i8) {
            super(2);
            this.f30718a = c2617k;
            this.f30719b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2615j.a(this.f30718a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30719b | 1));
        }
    }

    public static final void a(C2617k element, Composer composer, int i8) {
        AbstractC3159y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(-839067707);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-839067707, i8, -1, "com.stripe.android.ui.core.elements.AuBecsDebitMandateElementUI (AuBecsDebitMandateElementUI.kt:17)");
        }
        int i9 = AbstractC3053E.f32850L;
        String f8 = element.f();
        if (f8 == null) {
            f8 = "";
        }
        String stringResource = StringResources_androidKt.stringResource(i9, new Object[]{f8}, startRestartGroup, 64);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        AbstractC3806c.b(stringResource, PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5178constructorimpl(8), 1, null), null, AbstractC3087m.n(materialTheme, startRestartGroup, i10).j(), materialTheme.getTypography(startRestartGroup, i10).getBody2(), false, null, 0, null, startRestartGroup, 48, 484);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(element, i8));
        }
    }
}
