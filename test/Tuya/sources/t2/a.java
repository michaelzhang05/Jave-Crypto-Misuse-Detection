package T2;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9710a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static n f9711b = ComposableLambdaKt.composableLambdaInstance(633592435, false, C0212a.f9713a);

    /* renamed from: c, reason: collision with root package name */
    public static n f9712c = ComposableLambdaKt.composableLambdaInstance(1366302894, false, b.f9714a);

    /* renamed from: T2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0212a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0212a f9713a = new C0212a();

        C0212a() {
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
                ComposerKt.traceEventStart(633592435, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-1.<anonymous> (LinkInlineSignupFields.kt:63)");
            }
            i.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9714a = new b();

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
                ComposerKt.traceEventStart(1366302894, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-2.<anonymous> (LinkInlineSignupFields.kt:76)");
            }
            i.b(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final n a() {
        return f9711b;
    }

    public final n b() {
        return f9712c;
    }
}
