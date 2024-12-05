package n4;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3465a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3465a f36135a = new C3465a();

    /* renamed from: b, reason: collision with root package name */
    public static n f36136b = ComposableLambdaKt.composableLambdaInstance(33061104, false, C0832a.f36137a);

    /* renamed from: n4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0832a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0832a f36137a = new C0832a();

        C0832a() {
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
                ComposerKt.traceEventStart(33061104, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.ComposableSingletons$StripeBottomSheetLayoutKt.lambda-1.<anonymous> (StripeBottomSheetLayout.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final n a() {
        return f36136b;
    }
}
