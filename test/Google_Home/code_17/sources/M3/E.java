package M3;

import a6.InterfaceC1668n;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class E {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f6488a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1668n interfaceC1668n) {
            super(2);
            this.f6488a = interfaceC1668n;
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
                ComposerKt.traceEventStart(2068457937, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold.<anonymous>.<anonymous> (PaymentSheetScaffold.kt:47)");
            }
            this.f6488a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f6489a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f6490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f6491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6492d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6493e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6489a = interfaceC1668n;
            this.f6490b = interfaceC1668n2;
            this.f6491c = modifier;
            this.f6492d = i8;
            this.f6493e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            E.a(this.f6489a, this.f6490b, this.f6491c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6492d | 1), this.f6493e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScrollState f6494a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollState scrollState) {
            super(0);
            this.f6494a = scrollState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Dp.m5181boximpl(m20invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m20invokeD9Ej5fM() {
            if (this.f6494a.getValue() > 0) {
                return Dp.m5183constructorimpl(8);
            }
            return Dp.m5183constructorimpl(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(a6.InterfaceC1668n r25, a6.InterfaceC1668n r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.E.a(a6.n, a6.n, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float b(State state) {
        return ((Dp) state.getValue()).m5197unboximpl();
    }

    private static final float c(State state) {
        return ((Dp) state.getValue()).m5197unboximpl();
    }
}
