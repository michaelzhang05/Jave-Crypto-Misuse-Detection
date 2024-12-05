package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.room.RoomDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class TextFieldCursorKt$cursorAnimationSpec$1 extends AbstractC3160z implements Function1 {
    public static final TextFieldCursorKt$cursorAnimationSpec$1 INSTANCE = new TextFieldCursorKt$cursorAnimationSpec$1();

    TextFieldCursorKt$cursorAnimationSpec$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
        return I.f6487a;
    }

    public final void invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
        AbstractC3159y.i(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(1000);
        Float valueOf = Float.valueOf(1.0f);
        keyframes.at(valueOf, 0);
        keyframes.at(valueOf, 499);
        Float valueOf2 = Float.valueOf(0.0f);
        keyframes.at(valueOf2, 500);
        keyframes.at(valueOf2, RoomDatabase.MAX_BIND_PARAMETER_CNT);
    }
}
