package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidConfig implements ScrollConfig {
    public static final AndroidConfig INSTANCE = new AndroidConfig();

    private AndroidConfig() {
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo374calculateMouseWheelScroll8xgXZGE(Density calculateMouseWheelScroll, PointerEvent event, long j8) {
        AbstractC3255y.i(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        AbstractC3255y.i(event, "event");
        List<PointerInputChange> changes = event.getChanges();
        Offset m2729boximpl = Offset.m2729boximpl(Offset.Companion.m2756getZeroF1C5BW0());
        int size = changes.size();
        for (int i8 = 0; i8 < size; i8++) {
            m2729boximpl = Offset.m2729boximpl(Offset.m2745plusMKHz9U(m2729boximpl.m2750unboximpl(), changes.get(i8).m4023getScrollDeltaF1C5BW0()));
        }
        return Offset.m2747timestuRUvjQ(m2729boximpl.m2750unboximpl(), -calculateMouseWheelScroll.mo453toPx0680j_4(Dp.m5183constructorimpl(64)));
    }
}
