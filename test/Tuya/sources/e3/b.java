package E3;

import L5.I;
import X5.n;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import b3.EnumC1870e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.t;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1975a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static n f1976b = ComposableLambdaKt.composableLambdaInstance(-1155375669, false, a.f1978a);

    /* renamed from: c, reason: collision with root package name */
    public static n f1977c = ComposableLambdaKt.composableLambdaInstance(-167185745, false, C0035b.f1979a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1978a = new a();

        a() {
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
                ComposerKt.traceEventStart(-1155375669, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-1.<anonymous> (CvcRecollectionScreen.kt:224)");
            }
            IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(t.f37411r, composer, 0), (String) null, (Modifier) null, 0L, composer, 56, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: E3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0035b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0035b f1979a = new C0035b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: E3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1980a = new a();

            a() {
                super(1);
            }

            public final void a(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c it) {
                AbstractC3159y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c) obj);
                return I.f6487a;
            }
        }

        C0035b() {
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
                ComposerKt.traceEventStart(-167185745, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-2.<anonymous> (CvcRecollectionScreen.kt:263)");
            }
            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.e("4242", false, new g("", EnumC1870e.f14438o), a.f1980a, composer, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final n a() {
        return f1976b;
    }
}
