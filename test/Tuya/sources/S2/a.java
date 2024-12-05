package S2;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8971a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static n f8972b = ComposableLambdaKt.composableLambdaInstance(364257093, false, C0183a.f8975a);

    /* renamed from: c, reason: collision with root package name */
    public static n f8973c = ComposableLambdaKt.composableLambdaInstance(-1783088598, false, b.f8976a);

    /* renamed from: d, reason: collision with root package name */
    public static n f8974d = ComposableLambdaKt.composableLambdaInstance(501093267, false, c.f8977a);

    /* renamed from: S2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0183a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0183a f8975a = new C0183a();

        C0183a() {
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
                ComposerKt.traceEventStart(364257093, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-1.<anonymous> (LinkButton.kt:176)");
            }
            f.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8976a = new b();

        b() {
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
                ComposerKt.traceEventStart(-1783088598, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-2.<anonymous> (LinkButton.kt:217)");
            }
            f.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8977a = new c();

        c() {
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
                ComposerKt.traceEventStart(501093267, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-3.<anonymous> (LinkButton.kt:218)");
            }
            f.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final n a() {
        return f8972b;
    }

    public final n b() {
        return f8973c;
    }

    public final n c() {
        return f8974d;
    }
}
