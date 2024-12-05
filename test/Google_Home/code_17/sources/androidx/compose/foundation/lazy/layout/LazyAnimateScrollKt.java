package androidx.compose.foundation.lazy.layout;

import O5.I;
import S5.d;
import androidx.compose.ui.unit.Dp;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m5183constructorimpl(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
    private static final float BoundDistance = Dp.m5183constructorimpl(1500);
    private static final float MinimumDistance = Dp.m5183constructorimpl(50);

    public static final Object animateScrollToItem(LazyAnimateScrollScope lazyAnimateScrollScope, int i8, int i9, d dVar) {
        Object scroll = lazyAnimateScrollScope.scroll(new LazyAnimateScrollKt$animateScrollToItem$2(i8, lazyAnimateScrollScope, i9, null), dVar);
        if (scroll == T5.b.e()) {
            return scroll;
        }
        return I.f8278a;
    }

    private static final void debugLog(Function0 function0) {
    }
}
