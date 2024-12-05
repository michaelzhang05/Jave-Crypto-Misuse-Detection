package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f8, float f9, AbstractC3151p abstractC3151p) {
        this(f8, f9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        if (Dp.m5183equalsimpl0(this.left, tabPosition.left) && Dp.m5183equalsimpl0(this.width, tabPosition.width)) {
            return true;
        }
        return false;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m1375getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m1376getRightD9Ej5fM() {
        return Dp.m5178constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m1377getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m5184hashCodeimpl(this.left) * 31) + Dp.m5184hashCodeimpl(this.width);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m5189toStringimpl(this.left)) + ", right=" + ((Object) Dp.m5189toStringimpl(m1376getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m5189toStringimpl(this.width)) + ')';
    }

    private TabPosition(float f8, float f9) {
        this.left = f8;
        this.width = f9;
    }
}
