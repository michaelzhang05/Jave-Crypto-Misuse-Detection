package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.K;
import androidx.compose.ui.unit.Density;
import i6.InterfaceC2998g;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class CornerSizeKt$ZeroCornerSize$1 implements CornerSize, InspectableValue {
    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ InterfaceC2998g getInspectableElements() {
        return K.a(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ String getNameFallback() {
        return K.b(this);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo848toPxTmRCtEA(long j8, Density density) {
        AbstractC3255y.i(density, "density");
        return 0.0f;
    }

    public String toString() {
        return "ZeroCornerSize";
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getValueOverride() {
        return "ZeroCornerSize";
    }
}
