package W2;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11367a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1668n f11368b = ComposableLambdaKt.composableLambdaInstance(633592435, false, C0237a.f11370a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC1668n f11369c = ComposableLambdaKt.composableLambdaInstance(1366302894, false, b.f11371a);

    /* renamed from: W2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0237a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0237a f11370a = new C0237a();

        C0237a() {
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
                ComposerKt.traceEventStart(633592435, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-1.<anonymous> (LinkInlineSignupFields.kt:63)");
            }
            i.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11371a = new b();

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
                ComposerKt.traceEventStart(1366302894, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-2.<anonymous> (LinkInlineSignupFields.kt:76)");
            }
            i.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1668n a() {
        return f11368b;
    }

    public final InterfaceC1668n b() {
        return f11369c;
    }
}
