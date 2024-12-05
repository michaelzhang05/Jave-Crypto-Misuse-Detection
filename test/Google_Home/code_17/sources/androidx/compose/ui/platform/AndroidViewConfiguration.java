package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;
    private final android.view.ViewConfiguration viewConfiguration;

    public AndroidViewConfiguration(android.view.ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getDoubleTapTimeoutMillis() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public long getLongPressTimeoutMillis() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getMaximumFlingVelocity() {
        return this.viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    public /* synthetic */ long mo4261getMinimumTouchTargetSizeMYxV2XQ() {
        return W0.b(this);
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public float getTouchSlop() {
        return this.viewConfiguration.getScaledTouchSlop();
    }
}
