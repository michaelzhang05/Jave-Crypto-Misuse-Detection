package O3;

import O3.f;
import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.C4033g;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4033g f8022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f8023b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0159a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f8024a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0159a(f fVar) {
                super(1);
                this.f8024a = fVar;
            }

            public final void a(C4033g it) {
                AbstractC3255y.i(it, "it");
                this.f8024a.a(f.b.a.f8021a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4033g) obj);
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4033g c4033g, f fVar) {
            super(3);
            this.f8022a = c4033g;
            this.f8023b = fVar;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3255y.i(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(788393326, i8, -1, "com.stripe.android.paymentsheet.verticalmode.ManageOneSavedPaymentMethodUI.<anonymous> (ManageOneSavedPaymentMethodUI.kt:21)");
            }
            h.a(this.f8022a, new C0159a(this.f8023b), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f8025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8026b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, int i8) {
            super(2);
            this.f8025a = fVar;
            this.f8026b = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f8025a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8026b | 1));
        }
    }

    public static final void a(f interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3255y.i(interactor, "interactor");
        Composer startRestartGroup = composer.startRestartGroup(-1713249349);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(interactor)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1713249349, i9, -1, "com.stripe.android.paymentsheet.verticalmode.ManageOneSavedPaymentMethodUI (ManageOneSavedPaymentMethodUI.kt:9)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(t3.s.f39712e, startRestartGroup, 0);
            C4033g a8 = interactor.getState().a();
            p.a(a8, true, false, false, PaddingKt.m607paddingVpY3zN4$default(Modifier.Companion, dimensionResource, 0.0f, 2, null), null, ComposableLambdaKt.composableLambda(startRestartGroup, 788393326, true, new a(a8, interactor)), startRestartGroup, 1575992, 36);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(interactor, i8));
        }
    }
}
