package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import i6.AbstractC2825i;
import i6.C2812b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2 extends AbstractC3160z implements Function0 {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final P5.g invoke() {
        boolean isMainThread;
        isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(isMainThread ? Choreographer.getInstance() : (Choreographer) AbstractC2825i.e(C2812b0.c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), HandlerCompat.createAsync(Looper.getMainLooper()), null);
        return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
    }
}
