package H3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import e3.EnumC2791e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.t;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3525a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1668n f3526b = ComposableLambdaKt.composableLambdaInstance(-1155375669, false, a.f3528a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC1668n f3527c = ComposableLambdaKt.composableLambdaInstance(-167185745, false, C0060b.f3529a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3528a = new a();

        a() {
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
                ComposerKt.traceEventStart(-1155375669, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-1.<anonymous> (CvcRecollectionScreen.kt:224)");
            }
            IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(t.f39733r, composer, 0), (String) null, (Modifier) null, 0L, composer, 56, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: H3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0060b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0060b f3529a = new C0060b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: H3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f3530a = new a();

            a() {
                super(1);
            }

            public final void a(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c it) {
                AbstractC3255y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c) obj);
                return I.f8278a;
            }
        }

        C0060b() {
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
                ComposerKt.traceEventStart(-167185745, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-2.<anonymous> (CvcRecollectionScreen.kt:263)");
            }
            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.e("4242", false, new g("", EnumC2791e.f31444o), a.f3530a, composer, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1668n a() {
        return f3526b;
    }
}
