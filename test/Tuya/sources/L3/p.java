package L3;

import J3.AbstractC1193a;
import J3.AbstractC1216y;
import J3.B;
import L5.I;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.model.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;
import t4.AbstractC3794a;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6399a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m56invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m56invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3654g f6400a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3654g c3654g) {
            super(3);
            this.f6400a = c3654g;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3159y.i(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284170116, i8, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:49)");
            }
            o.g gVar = this.f6400a.d().f24415h;
            String str = gVar != null ? gVar.f24486l : null;
            int f8 = B.f(this.f6400a.d(), true);
            Alignment center = Alignment.Companion.getCenter();
            Modifier m600padding3ABfNKs = PaddingKt.m600padding3ABfNKs(Modifier.Companion, Dp.m5178constructorimpl(4));
            r rVar = r.f6410a;
            AbstractC1216y.b(f8, null, center, K3.e.b(SizeKt.m652width3ABfNKs(SizeKt.m633height3ABfNKs(m600padding3ABfNKs, rVar.a()), rVar.b()), str), composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3654g f6401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6403c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6404d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f6405e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f6406f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ X5.o f6407g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f6408h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6409i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3654g c3654g, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, X5.o oVar, int i8, int i9) {
            super(2);
            this.f6401a = c3654g;
            this.f6402b = z8;
            this.f6403c = z9;
            this.f6404d = z10;
            this.f6405e = modifier;
            this.f6406f = function0;
            this.f6407g = oVar;
            this.f6408h = i8;
            this.f6409i = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            p.a(this.f6401a, this.f6402b, this.f6403c, this.f6404d, this.f6405e, this.f6406f, this.f6407g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6408h | 1), this.f6409i);
        }
    }

    public static final void a(C3654g displayableSavedPaymentMethod, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, X5.o oVar, Composer composer, int i8, int i9) {
        boolean z11;
        int i10;
        Modifier modifier2;
        Function0 function02;
        X5.o oVar2;
        AbstractC3159y.i(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        Composer startRestartGroup = composer.startRestartGroup(-1517844735);
        if ((i9 & 4) != 0) {
            i10 = i8 & (-897);
            z11 = z8;
        } else {
            z11 = z9;
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 32) != 0) {
            function02 = a.f6399a;
        } else {
            function02 = function0;
        }
        if ((i9 & 64) != 0) {
            oVar2 = null;
        } else {
            oVar2 = oVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1517844735, i10, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton (SavedPaymentMethodRowButton.kt:34)");
        }
        String a8 = AbstractC1193a.a(AbstractC3794a.a(displayableSavedPaymentMethod.a(), startRestartGroup, 8));
        InterfaceC3983b d8 = B.d(displayableSavedPaymentMethod.d());
        if (d8 == null) {
            d8 = displayableSavedPaymentMethod.b();
        }
        String str = displayableSavedPaymentMethod.d().f24408a;
        Modifier modifier3 = modifier2;
        m.a(z8, z10, z11, ComposableLambdaKt.composableLambda(startRestartGroup, 284170116, true, new b(displayableSavedPaymentMethod)), AbstractC3794a.a(d8, startRestartGroup, 8), null, function02, a8, TestTagKt.testTag(modifier2, "saved_payment_method_row_button_" + str), oVar2, startRestartGroup, ((i10 >> 3) & 14) | 199680 | ((i10 >> 6) & 112) | (i10 & 896) | (3670016 & (i10 << 3)) | ((i10 << 9) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(displayableSavedPaymentMethod, z8, z11, z10, modifier3, function02, oVar2, i8, i9));
        }
    }
}
