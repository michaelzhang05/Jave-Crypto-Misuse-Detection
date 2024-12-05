package p4;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f37516a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ State f37517b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var, State state) {
            super(1);
            this.f37516a = d0Var;
            this.f37517b = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return O5.I.f8278a;
        }

        public final void invoke(boolean z8) {
            this.f37516a.x(!f0.b(this.f37517b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f37518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37519b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0 d0Var, int i8) {
            super(2);
            this.f37518a = d0Var;
            this.f37519b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            f0.a(this.f37518a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37519b | 1));
        }
    }

    public static final void a(d0 controller, Composer composer, int i8) {
        AbstractC3255y.i(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(2120438239);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2120438239, i8, -1, "com.stripe.android.uicore.elements.SameAsShippingElementUI (SameAsShippingElementUI.kt:14)");
        }
        State a8 = y4.f.a(controller.w(), startRestartGroup, 8);
        AbstractC3765l.a(null, "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG", b(a8), StringResources_androidKt.stringResource(c(y4.f.a(controller.b(), startRestartGroup, 8)), startRestartGroup, 0), true, new a(controller, a8), startRestartGroup, 24624, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(controller, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final int c(State state) {
        return ((Number) state.getValue()).intValue();
    }
}
