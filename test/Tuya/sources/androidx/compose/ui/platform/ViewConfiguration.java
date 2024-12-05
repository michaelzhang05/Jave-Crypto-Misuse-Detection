package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public interface ViewConfiguration {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static float getMaximumFlingVelocity(ViewConfiguration viewConfiguration) {
            float a8;
            a8 = W0.a(viewConfiguration);
            return a8;
        }

        @Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m4502getMinimumTouchTargetSizeMYxV2XQ(ViewConfiguration viewConfiguration) {
            long b8;
            b8 = W0.b(viewConfiguration);
            return b8;
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    long getLongPressTimeoutMillis();

    float getMaximumFlingVelocity();

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    long mo4256getMinimumTouchTargetSizeMYxV2XQ();

    float getTouchSlop();
}
