package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1 extends AbstractC3160z implements Function1 {
    public static final AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1 INSTANCE = new AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1();

    AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
        return platformTextInputService;
    }
}
