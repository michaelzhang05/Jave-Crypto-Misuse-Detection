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
import java.util.Map;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import m4.AbstractC3441m;
import x4.AbstractC4190b;
import x4.AbstractC4191c;

/* renamed from: h4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2919b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32567a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8) {
            super(2);
            this.f32567a = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2919b.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.f32567a | 1));
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
            String stringResource = StringResources_androidKt.stringResource(AbstractC3407E.f34820I, startRestartGroup, 0);
            Map e8 = P5.Q.e(O5.x.a("affirm", new AbstractC4190b.a(e4.k.f31662a, e4.n.f31705L, null, 4, null)));
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            AbstractC4191c.b(stringResource, PaddingKt.m607paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5183constructorimpl(8), 1, null), e8, AbstractC3441m.n(materialTheme, startRestartGroup, i9).j(), materialTheme.getTypography(startRestartGroup, i9).getH6(), false, null, 0, null, startRestartGroup, (AbstractC4190b.a.f40679d << 6) | 48, 480);
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
