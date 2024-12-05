package q4;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3844a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3844a f38263a = new C3844a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1668n f38264b = ComposableLambdaKt.composableLambdaInstance(33061104, false, C0862a.f38265a);

    /* renamed from: q4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0862a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0862a f38265a = new C0862a();

        C0862a() {
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
                ComposerKt.traceEventStart(33061104, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.ComposableSingletons$StripeBottomSheetLayoutKt.lambda-1.<anonymous> (StripeBottomSheetLayout.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1668n a() {
        return f38264b;
    }
}
