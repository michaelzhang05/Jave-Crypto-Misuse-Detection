package androidx.compose.ui.platform;

import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AndroidComposeView$rotaryInputModifier$1 extends AbstractC3160z implements Function1 {
    public static final AndroidComposeView$rotaryInputModifier$1 INSTANCE = new AndroidComposeView$rotaryInputModifier$1();

    AndroidComposeView$rotaryInputModifier$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
        return Boolean.FALSE;
    }
}
