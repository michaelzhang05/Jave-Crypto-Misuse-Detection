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
import java.util.Map;
import kotlin.jvm.internal.AbstractC3160z;
import u4.AbstractC3805b;
import u4.AbstractC3806c;

/* renamed from: e4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2599b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f30646a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8) {
            super(2);
            this.f30646a = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2599b.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.f30646a | 1));
        }
    }

    public static final void a(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-172812001);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-172812001, i8, -1, "com.stripe.android.ui.core.elements.AffirmElementUI (AffirmElementUI.kt:17)");
            }
            String stringResource = StringResources_androidKt.stringResource(AbstractC3053E.f32844I, startRestartGroup, 0);
            Map e8 = M5.Q.e(L5.x.a("affirm", new AbstractC3805b.a(b4.k.f14656a, b4.n.f14699L, null, 4, null)));
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            AbstractC3806c.b(stringResource, PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5178constructorimpl(8), 1, null), e8, AbstractC3087m.n(materialTheme, startRestartGroup, i9).j(), materialTheme.getTypography(startRestartGroup, i9).getH6(), false, null, 0, null, startRestartGroup, (AbstractC3805b.a.f38495d << 6) | 48, 480);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(i8));
        }
    }
}
