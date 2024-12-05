package V2;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11886a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static n f11887b = ComposableLambdaKt.composableLambdaInstance(-1700090362, false, C0233a.f11888a);

    /* renamed from: V2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0233a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0233a f11888a = new C0233a();

        C0233a() {
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
                ComposerKt.traceEventStart(-1700090362, i8, -1, "com.stripe.android.link.utils.ComposableSingletons$InlineContentTemplateBuilderKt.lambda-1.<anonymous> (InlineContentTemplateBuilder.kt:46)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final n a() {
        return f11887b;
    }
}
