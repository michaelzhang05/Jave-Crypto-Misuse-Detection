package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class OffsetKt {
    public static final Modifier absoluteOffset(Modifier modifier, Function1 offset) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(offset, "offset");
        return modifier.then(new OffsetPxElement(offset, false, new OffsetKt$absoluteOffset$2(offset)));
    }

    @Stable
    /* renamed from: absoluteOffset-VpY3zN4 */
    public static final Modifier m558absoluteOffsetVpY3zN4(Modifier absoluteOffset, float f8, float f9) {
        AbstractC3159y.i(absoluteOffset, "$this$absoluteOffset");
        return absoluteOffset.then(new OffsetElement(f8, f9, false, new OffsetKt$absoluteOffset$1(f8, f9), null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default */
    public static /* synthetic */ Modifier m559absoluteOffsetVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5178constructorimpl(0);
        }
        return m558absoluteOffsetVpY3zN4(modifier, f8, f9);
    }

    public static final Modifier offset(Modifier modifier, Function1 offset) {
        AbstractC3159y.i(modifier, "<this>");
        AbstractC3159y.i(offset, "offset");
        return modifier.then(new OffsetPxElement(offset, true, new OffsetKt$offset$2(offset)));
    }

    @Stable
    /* renamed from: offset-VpY3zN4 */
    public static final Modifier m560offsetVpY3zN4(Modifier offset, float f8, float f9) {
        AbstractC3159y.i(offset, "$this$offset");
        return offset.then(new OffsetElement(f8, f9, true, new OffsetKt$offset$1(f8, f9), null));
    }

    /* renamed from: offset-VpY3zN4$default */
    public static /* synthetic */ Modifier m561offsetVpY3zN4$default(Modifier modifier, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5178constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5178constructorimpl(0);
        }
        return m560offsetVpY3zN4(modifier, f8, f9);
    }
}
