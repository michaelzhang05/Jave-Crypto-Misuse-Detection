package s4;

import L5.I;
import X5.o;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3749a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3749a f37864a = new C3749a();

    /* renamed from: b, reason: collision with root package name */
    public static o f37865b = ComposableLambdaKt.composableLambdaInstance(2051430169, false, C0874a.f37867a);

    /* renamed from: c, reason: collision with root package name */
    public static o f37866c = ComposableLambdaKt.composableLambdaInstance(1719901005, false, b.f37868a);

    /* renamed from: s4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0874a extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final C0874a f37867a = new C0874a();

        C0874a() {
            super(3);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i8) {
            AbstractC3159y.i(boxWithConstraintsScope, "$this$null");
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

    /* renamed from: s4.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37868a = new b();

        b() {
            super(3);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i8) {
            AbstractC3159y.i(boxWithConstraintsScope, "$this$null");
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

    public final o a() {
        return f37865b;
    }

    public final o b() {
        return f37866c;
    }
}
