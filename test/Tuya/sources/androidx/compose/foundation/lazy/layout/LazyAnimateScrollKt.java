package androidx.compose.foundation.lazy.layout;

import L5.I;
import P5.d;
import androidx.compose.ui.unit.Dp;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m5178constructorimpl(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
    private static final float BoundDistance = Dp.m5178constructorimpl(1500);
    private static final float MinimumDistance = Dp.m5178constructorimpl(50);

    public static final Object animateScrollToItem(LazyAnimateScrollScope lazyAnimateScrollScope, int i8, int i9, d dVar) {
        Object scroll = lazyAnimateScrollScope.scroll(new LazyAnimateScrollKt$animateScrollToItem$2(i8, lazyAnimateScrollScope, i9, null), dVar);
        if (scroll == Q5.b.e()) {
            return scroll;
        }
        return I.f6487a;
    }

    private static final void debugLog(Function0 function0) {
    }
}
