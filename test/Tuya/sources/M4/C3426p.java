package m4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: m4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3426p {

    /* renamed from: a, reason: collision with root package name */
    public static final C3426p f35643a = new C3426p();

    /* renamed from: b, reason: collision with root package name */
    public static X5.n f35644b = ComposableLambdaKt.composableLambdaInstance(1685012640, false, a.f35645a);

    /* renamed from: m4.p$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35645a = new a();

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
                ComposerKt.traceEventStart(1685012640, i8, -1, "com.stripe.android.uicore.elements.ComposableSingletons$SectionUIKt.lambda-1.<anonymous> (SectionUI.kt:34)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final X5.n a() {
        return f35644b;
    }
}
