package Y2;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13524a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1668n f13525b = ComposableLambdaKt.composableLambdaInstance(-1700090362, false, C0259a.f13526a);

    /* renamed from: Y2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0259a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0259a f13526a = new C0259a();

        C0259a() {
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
                ComposerKt.traceEventStart(-1700090362, i8, -1, "com.stripe.android.link.utils.ComposableSingletons$InlineContentTemplateBuilderKt.lambda-1.<anonymous> (InlineContentTemplateBuilder.kt:46)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1668n a() {
        return f13525b;
    }
}