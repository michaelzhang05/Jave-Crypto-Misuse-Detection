package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m4073constructorimpl(0);
    }

    /* renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3981getAreAnyPressedaHzCxE(int i8) {
        return i8 != 0;
    }

    /* renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m3982indexOfFirstPressedaHzCxE(int i8) {
        if (i8 == 0) {
            return -1;
        }
        int i9 = 0;
        for (int i10 = (i8 & (-97)) | ((i8 & 96) >>> 5); (i10 & 1) == 0; i10 >>>= 1) {
            i9++;
        }
        return i9;
    }

    /* renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m3983indexOfLastPressedaHzCxE(int i8) {
        int i9 = -1;
        for (int i10 = (i8 & (-97)) | ((i8 & 96) >>> 5); i10 != 0; i10 >>>= 1) {
            i9++;
        }
        return i9;
    }

    /* renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3984isAltGraphPressed5xRPYO0(int i8) {
        return false;
    }

    /* renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3985isAltPressed5xRPYO0(int i8) {
        return (i8 & 2) != 0;
    }

    /* renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3986isBackPressedaHzCxE(int i8) {
        return (i8 & 8) != 0;
    }

    /* renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m3987isCapsLockOn5xRPYO0(int i8) {
        return (i8 & 1048576) != 0;
    }

    /* renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3988isCtrlPressed5xRPYO0(int i8) {
        return (i8 & 4096) != 0;
    }

    /* renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3989isForwardPressedaHzCxE(int i8) {
        return (i8 & 16) != 0;
    }

    /* renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3990isFunctionPressed5xRPYO0(int i8) {
        return (i8 & 8) != 0;
    }

    /* renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3991isMetaPressed5xRPYO0(int i8) {
        return (i8 & 65536) != 0;
    }

    /* renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m3992isNumLockOn5xRPYO0(int i8) {
        return (i8 & 2097152) != 0;
    }

    /* renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m3993isPressedbNIWhpI(int i8, int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2 && i9 != 3 && i9 != 4) {
                    if ((i8 & (1 << (i9 + 2))) != 0) {
                        return true;
                    }
                } else if ((i8 & (1 << i9)) != 0) {
                    return true;
                }
                return false;
            }
            return m3996isSecondaryPressedaHzCxE(i8);
        }
        return m3994isPrimaryPressedaHzCxE(i8);
    }

    /* renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3994isPrimaryPressedaHzCxE(int i8) {
        return (i8 & 33) != 0;
    }

    /* renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m3995isScrollLockOn5xRPYO0(int i8) {
        return (i8 & 4194304) != 0;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3996isSecondaryPressedaHzCxE(int i8) {
        return (i8 & 66) != 0;
    }

    /* renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3997isShiftPressed5xRPYO0(int i8) {
        return (i8 & 1) != 0;
    }

    /* renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m3998isSymPressed5xRPYO0(int i8) {
        return (i8 & 4) != 0;
    }

    /* renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m3999isTertiaryPressedaHzCxE(int i8) {
        return (i8 & 4) != 0;
    }
}
