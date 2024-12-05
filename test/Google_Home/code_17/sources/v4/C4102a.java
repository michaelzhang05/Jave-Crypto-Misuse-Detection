package v4;

import O5.I;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4102a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4102a f40137a = new C4102a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1669o f40138b = ComposableLambdaKt.composableLambdaInstance(2051430169, false, C0910a.f40140a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC1669o f40139c = ComposableLambdaKt.composableLambdaInstance(1719901005, false, b.f40141a);

    /* renamed from: v4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0910a extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final C0910a f40140a = new C0910a();

        C0910a() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i8) {
            AbstractC3255y.i(boxWithConstraintsScope, "$this$null");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2051430169, i8, -1, "com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt.lambda-1.<anonymous> (StripeImage.kt:57)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: v4.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40141a = new b();

        b() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i8) {
            AbstractC3255y.i(boxWithConstraintsScope, "$this$null");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1719901005, i8, -1, "com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt.lambda-2.<anonymous> (StripeImage.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1669o a() {
        return f40138b;
    }

    public final InterfaceC1669o b() {
        return f40139c;
    }
}
