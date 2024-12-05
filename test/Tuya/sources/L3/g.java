package L3;

import L3.f;
import L5.I;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;

/* loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3654g f6231a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f6232b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0131a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f6233a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0131a(f fVar) {
                super(1);
                this.f6233a = fVar;
            }

            public final void a(C3654g it) {
                AbstractC3159y.i(it, "it");
                this.f6233a.a(f.b.a.f6230a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3654g) obj);
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3654g c3654g, f fVar) {
            super(3);
            this.f6231a = c3654g;
            this.f6232b = fVar;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3159y.i(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(788393326, i8, -1, "com.stripe.android.paymentsheet.verticalmode.ManageOneSavedPaymentMethodUI.<anonymous> (ManageOneSavedPaymentMethodUI.kt:21)");
            }
            h.a(this.f6231a, new C0131a(this.f6232b), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f6234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6235b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, int i8) {
            super(2);
            this.f6234a = fVar;
            this.f6235b = i8;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            g.a(this.f6234a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6235b | 1));
        }
    }

    public static final void a(f interactor, Composer composer, int i8) {
        int i9;
        int i10;
        AbstractC3159y.i(interactor, "interactor");
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
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(q3.s.f37390e, startRestartGroup, 0);
            C3654g a8 = interactor.getState().a();
            p.a(a8, true, false, false, PaddingKt.m602paddingVpY3zN4$default(Modifier.Companion, dimensionResource, 0.0f, 2, null), null, ComposableLambdaKt.composableLambda(startRestartGroup, 788393326, true, new a(a8, interactor)), startRestartGroup, 1575992, 36);
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
