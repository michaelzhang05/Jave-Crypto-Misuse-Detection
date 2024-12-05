package V2;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10614a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1668n f10615b = ComposableLambdaKt.composableLambdaInstance(364257093, false, C0208a.f10618a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC1668n f10616c = ComposableLambdaKt.composableLambdaInstance(-1783088598, false, b.f10619a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC1668n f10617d = ComposableLambdaKt.composableLambdaInstance(501093267, false, c.f10620a);

    /* renamed from: V2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0208a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0208a f10618a = new C0208a();

        C0208a() {
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
                ComposerKt.traceEventStart(364257093, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-1.<anonymous> (LinkButton.kt:176)");
            }
            f.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f10619a = new b();

        b() {
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
                ComposerKt.traceEventStart(-1783088598, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-2.<anonymous> (LinkButton.kt:217)");
            }
            f.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f10620a = new c();

        c() {
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
                ComposerKt.traceEventStart(501093267, i8, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkButtonKt.lambda-3.<anonymous> (LinkButton.kt:218)");
            }
            f.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1668n a() {
        return f10615b;
    }

    public final InterfaceC1668n b() {
        return f10616c;
    }

    public final InterfaceC1668n c() {
        return f10617d;
    }
}
