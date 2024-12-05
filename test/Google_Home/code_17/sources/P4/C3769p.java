package p4;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: p4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3769p {

    /* renamed from: a, reason: collision with root package name */
    public static final C3769p f37669a = new C3769p();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1668n f37670b = ComposableLambdaKt.composableLambdaInstance(1685012640, false, a.f37671a);

    /* renamed from: p4.p$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37671a = new a();

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
                ComposerKt.traceEventStart(1685012640, i8, -1, "com.stripe.android.uicore.elements.ComposableSingletons$SectionUIKt.lambda-1.<anonymous> (SectionUI.kt:34)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1668n a() {
        return f37670b;
    }
}
