package androidx.compose.ui.viewinterop;

import O5.I;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class AndroidView_androidKt$NoOpUpdate$1 extends AbstractC3256z implements Function1 {
    public static final AndroidView_androidKt$NoOpUpdate$1 INSTANCE = new AndroidView_androidKt$NoOpUpdate$1();

    AndroidView_androidKt$NoOpUpdate$1() {
        super(1);
    }

    public final void invoke(View view) {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return I.f8278a;
    }
}
