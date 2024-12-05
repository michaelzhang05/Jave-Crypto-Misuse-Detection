package p4;

import a6.InterfaceC1668n;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3434f;
import p4.x0;

/* renamed from: p4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3770q {

    /* renamed from: a, reason: collision with root package name */
    public static final C3770q f37696a = new C3770q();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1668n f37697b = ComposableLambdaKt.composableLambdaInstance(549433638, false, a.f37698a);

    /* renamed from: p4.q$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37698a = new a();

        a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(549433638, i8, -1, "com.stripe.android.uicore.elements.ComposableSingletons$TextFieldUIKt.lambda-1.<anonymous> (TextFieldUI.kt:428)");
            }
            C0.u(new x0.c(AbstractC3434f.f35152a, null, true, null, 10, null), false, SizeKt.m652size3ABfNKs(Modifier.Companion, Dp.m5183constructorimpl(8)), composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1668n a() {
        return f37697b;
    }
}
