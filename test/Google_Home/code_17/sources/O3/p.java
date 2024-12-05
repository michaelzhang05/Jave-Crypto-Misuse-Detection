package O3;

import M3.AbstractC1306a;
import M3.AbstractC1329y;
import M3.B;
import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.C4033g;
import w4.AbstractC4148a;

/* loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8190a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m61invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m61invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4033g f8191a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4033g c4033g) {
            super(3);
            this.f8191a = c4033g;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3255y.i(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284170116, i8, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:49)");
            }
            o.g gVar = this.f8191a.d().f25470h;
            String str = gVar != null ? gVar.f25541l : null;
            int f8 = B.f(this.f8191a.d(), true);
            Alignment center = Alignment.Companion.getCenter();
            Modifier m605padding3ABfNKs = PaddingKt.m605padding3ABfNKs(Modifier.Companion, Dp.m5183constructorimpl(4));
            r rVar = r.f8201a;
            AbstractC1329y.b(f8, null, center, N3.e.b(SizeKt.m657width3ABfNKs(SizeKt.m638height3ABfNKs(m605padding3ABfNKs, rVar.a()), rVar.b()), str), composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4033g f8192a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8193b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8194c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8195d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8196e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f8197f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f8198g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f8199h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f8200i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4033g c4033g, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, InterfaceC1669o interfaceC1669o, int i8, int i9) {
            super(2);
            this.f8192a = c4033g;
            this.f8193b = z8;
            this.f8194c = z9;
            this.f8195d = z10;
            this.f8196e = modifier;
            this.f8197f = function0;
            this.f8198g = interfaceC1669o;
            this.f8199h = i8;
            this.f8200i = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            p.a(this.f8192a, this.f8193b, this.f8194c, this.f8195d, this.f8196e, this.f8197f, this.f8198g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8199h | 1), this.f8200i);
        }
    }

    public static final void a(C4033g displayableSavedPaymentMethod, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, InterfaceC1669o interfaceC1669o, Composer composer, int i8, int i9) {
        boolean z11;
        int i10;
        Modifier modifier2;
        Function0 function02;
        InterfaceC1669o interfaceC1669o2;
        AbstractC3255y.i(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
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
            function02 = a.f8190a;
        } else {
            function02 = function0;
        }
        if ((i9 & 64) != 0) {
            interfaceC1669o2 = null;
        } else {
            interfaceC1669o2 = interfaceC1669o;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1517844735, i10, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton (SavedPaymentMethodRowButton.kt:34)");
        }
        String a8 = AbstractC1306a.a(AbstractC4148a.a(displayableSavedPaymentMethod.a(), startRestartGroup, 8));
        B2.b d8 = B.d(displayableSavedPaymentMethod.d());
        if (d8 == null) {
            d8 = displayableSavedPaymentMethod.b();
        }
        String str = displayableSavedPaymentMethod.d().f25463a;
        Modifier modifier3 = modifier2;
        m.a(z8, z10, z11, ComposableLambdaKt.composableLambda(startRestartGroup, 284170116, true, new b(displayableSavedPaymentMethod)), AbstractC4148a.a(d8, startRestartGroup, 8), null, function02, a8, TestTagKt.testTag(modifier2, "saved_payment_method_row_button_" + str), interfaceC1669o2, startRestartGroup, ((i10 >> 3) & 14) | 199680 | ((i10 >> 6) & 112) | (i10 & 896) | (3670016 & (i10 << 3)) | ((i10 << 9) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(displayableSavedPaymentMethod, z8, z11, z10, modifier3, function02, interfaceC1669o2, i8, i9));
        }
    }
}
