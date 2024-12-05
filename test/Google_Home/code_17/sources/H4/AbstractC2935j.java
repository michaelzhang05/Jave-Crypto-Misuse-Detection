package h4;

import a6.InterfaceC1668n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import m4.AbstractC3441m;
import x4.AbstractC4191c;

/* renamed from: h4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2935j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.j$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2937k f32639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32640b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2937k c2937k, int i8) {
            super(2);
            this.f32639a = c2937k;
            this.f32640b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2935j.a(this.f32639a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32640b | 1));
        }
    }

    public static final void a(C2937k element, Composer composer, int i8) {
        AbstractC3255y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(-839067707);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-839067707, i8, -1, "com.stripe.android.ui.core.elements.AuBecsDebitMandateElementUI (AuBecsDebitMandateElementUI.kt:17)");
        }
        int i9 = AbstractC3407E.f34826L;
        String f8 = element.f();
        if (f8 == null) {
            f8 = "";
        }
        String stringResource = StringResources_androidKt.stringResource(i9, new Object[]{f8}, startRestartGroup, 64);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i10 = MaterialTheme.$stable;
        AbstractC4191c.b(stringResource, PaddingKt.m607paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5183constructorimpl(8), 1, null), null, AbstractC3441m.n(materialTheme, startRestartGroup, i10).j(), materialTheme.getTypography(startRestartGroup, i10).getBody2(), false, null, 0, null, startRestartGroup, 48, 484);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(element, i8));
        }
    }
}
