package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidConfig implements ScrollConfig {
    public static final AndroidConfig INSTANCE = new AndroidConfig();

    private AndroidConfig() {
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo369calculateMouseWheelScroll8xgXZGE(Density calculateMouseWheelScroll, PointerEvent event, long j8) {
        AbstractC3159y.i(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        AbstractC3159y.i(event, "event");
        List<PointerInputChange> changes = event.getChanges();
        Offset m2724boximpl = Offset.m2724boximpl(Offset.Companion.m2751getZeroF1C5BW0());
        int size = changes.size();
        for (int i8 = 0; i8 < size; i8++) {
            m2724boximpl = Offset.m2724boximpl(Offset.m2740plusMKHz9U(m2724boximpl.m2745unboximpl(), changes.get(i8).m4018getScrollDeltaF1C5BW0()));
        }
        return Offset.m2742timestuRUvjQ(m2724boximpl.m2745unboximpl(), -calculateMouseWheelScroll.mo448toPx0680j_4(Dp.m5178constructorimpl(64)));
    }
}
