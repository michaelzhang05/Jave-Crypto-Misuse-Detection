package e4;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class N0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30460a = new a();

        a() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3159y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M0 f30461a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30462b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M0 m02, int i8) {
            super(2);
            this.f30461a = m02;
            this.f30462b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            N0.a(this.f30461a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30462b | 1));
        }
    }

    public static final void a(M0 element, Composer composer, int i8) {
        AbstractC3159y.i(element, "element");
        Composer startRestartGroup = composer.startRestartGroup(466172544);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(466172544, i8, -1, "com.stripe.android.ui.core.elements.StaticTextElementUI (StaticTextElementUI.kt:15)");
        }
        m4.F.a(StringResources_androidKt.stringResource(element.f(), startRestartGroup, 0), SemanticsModifierKt.semantics(PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5178constructorimpl(8), 1, null), true, a.f30460a), startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(element, i8));
        }
    }
}
