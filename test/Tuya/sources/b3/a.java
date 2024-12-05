package B3;

import L5.I;
import X5.n;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import j2.z;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f738a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static n f739b = ComposableLambdaKt.composableLambdaInstance(1407342519, false, C0002a.f740a);

    /* renamed from: B3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0002a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0002a f740a = new C0002a();

        C0002a() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1407342519, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.ComposableSingletons$USBankAccountFormKt.lambda-1.<anonymous> (USBankAccountForm.kt:448)");
            }
            IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(z.f33126N, composer, 0), (String) null, (Modifier) null, 0L, composer, 56, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final n a() {
        return f739b;
    }
}
