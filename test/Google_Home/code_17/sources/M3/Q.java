package M3;

import a6.InterfaceC1668n;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.stripe.android.model.o;
import h4.I0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import t3.C4033g;
import w4.AbstractC4148a;

/* loaded from: classes4.dex */
public abstract class Q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4033g f6583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f6584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f6585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6586d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4033g c4033g, Function0 function0, Function0 function02, int i8) {
            super(2);
            this.f6583a = c4033g;
            this.f6584b = function0;
            this.f6585c = function02;
            this.f6586d = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            Q.a(this.f6583a, this.f6584b, this.f6585c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6586d | 1));
        }
    }

    public static final void a(C4033g paymentMethod, Function0 onConfirmListener, Function0 onDismissListener, Composer composer, int i8) {
        String str;
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        AbstractC3255y.i(onConfirmListener, "onConfirmListener");
        AbstractC3255y.i(onDismissListener, "onDismissListener");
        Composer startRestartGroup = composer.startRestartGroup(-404084240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404084240, i8, -1, "com.stripe.android.paymentsheet.ui.RemovePaymentMethodDialogUI (RemovePaymentMethodDialogUI.kt:17)");
        }
        Resources resources = ((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        String stringResource = StringResources_androidKt.stringResource(t3.w.f39771Y, new Object[]{AbstractC4148a.a(paymentMethod.b(), startRestartGroup, 8)}, startRestartGroup, 64);
        o.p pVar = paymentMethod.d().f25467e;
        startRestartGroup.startReplaceableGroup(1201397555);
        if (pVar == o.p.f25587i) {
            str = AbstractC4148a.a(paymentMethod.a(), startRestartGroup, 8);
        } else {
            String str2 = null;
            if (pVar == o.p.f25577O) {
                int i9 = t3.w.f39786g0;
                o.r rVar = paymentMethod.d().f25480r;
                if (rVar != null) {
                    str2 = rVar.f25615e;
                }
                str = resources.getString(i9, str2);
                AbstractC3255y.h(str, "getString(...)");
            } else if (pVar == o.p.f25591m) {
                int i10 = t3.w.f39786g0;
                o.n nVar = paymentMethod.d().f25474l;
                if (nVar != null) {
                    str2 = nVar.f25561e;
                }
                str = resources.getString(i10, str2);
                AbstractC3255y.h(str, "getString(...)");
            } else {
                str = "";
            }
        }
        String str3 = str;
        startRestartGroup.endReplaceableGroup();
        int i11 = i8 << 12;
        I0.a(stringResource, str3, StringResources_androidKt.stringResource(AbstractC3407E.f34815F0, startRestartGroup, 0), StringResources_androidKt.stringResource(AbstractC3407E.f34839V, startRestartGroup, 0), true, onConfirmListener, onDismissListener, startRestartGroup, (458752 & i11) | 24576 | (i11 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(paymentMethod, onConfirmListener, onDismissListener, i8));
        }
    }
}
