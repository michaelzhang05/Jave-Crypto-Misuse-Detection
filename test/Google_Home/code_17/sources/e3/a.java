package E3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.jvm.internal.AbstractC3256z;
import m2.z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2333a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1668n f2334b = ComposableLambdaKt.composableLambdaInstance(1407342519, false, C0027a.f2335a);

    /* renamed from: E3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0027a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0027a f2335a = new C0027a();

        C0027a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1407342519, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.ComposableSingletons$USBankAccountFormKt.lambda-1.<anonymous> (USBankAccountForm.kt:448)");
            }
            IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(z.f35102N, composer, 0), (String) null, (Modifier) null, 0L, composer, 56, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1668n a() {
        return f2334b;
    }
}
