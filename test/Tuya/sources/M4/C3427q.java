package m4;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import j4.AbstractC3080f;
import kotlin.jvm.internal.AbstractC3160z;
import m4.x0;

/* renamed from: m4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3427q {

    /* renamed from: a, reason: collision with root package name */
    public static final C3427q f35670a = new C3427q();

    /* renamed from: b, reason: collision with root package name */
    public static X5.n f35671b = ComposableLambdaKt.composableLambdaInstance(549433638, false, a.f35672a);

    /* renamed from: m4.q$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35672a = new a();

        a() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(549433638, i8, -1, "com.stripe.android.uicore.elements.ComposableSingletons$TextFieldUIKt.lambda-1.<anonymous> (TextFieldUI.kt:428)");
            }
            C0.u(new x0.c(AbstractC3080f.f33176a, null, true, null, 10, null), false, SizeKt.m647size3ABfNKs(Modifier.Companion, Dp.m5178constructorimpl(8)), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final X5.n a() {
        return f35671b;
    }
}
