package J3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class E {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f4782a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X5.n nVar) {
            super(2);
            this.f4782a = nVar;
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
                ComposerKt.traceEventStart(2068457937, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold.<anonymous>.<anonymous> (PaymentSheetScaffold.kt:47)");
            }
            this.f4782a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f4783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X5.n f4784b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f4785c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4786d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4787e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(X5.n nVar, X5.n nVar2, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4783a = nVar;
            this.f4784b = nVar2;
            this.f4785c = modifier;
            this.f4786d = i8;
            this.f4787e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            E.a(this.f4783a, this.f4784b, this.f4785c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4786d | 1), this.f4787e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScrollState f4788a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollState scrollState) {
            super(0);
            this.f4788a = scrollState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return Dp.m5176boximpl(m15invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m15invokeD9Ej5fM() {
            if (this.f4788a.getValue() > 0) {
                return Dp.m5178constructorimpl(8);
            }
            return Dp.m5178constructorimpl(0);
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
    public static final void a(X5.n r25, X5.n r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.E.a(X5.n, X5.n, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float b(State state) {
        return ((Dp) state.getValue()).m5192unboximpl();
    }

    private static final float c(State state) {
        return ((Dp) state.getValue()).m5192unboximpl();
    }
}
