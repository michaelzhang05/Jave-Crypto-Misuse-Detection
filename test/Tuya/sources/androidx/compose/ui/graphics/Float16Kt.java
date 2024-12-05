package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class Float16Kt {
    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m3116maxAoSsdG0(short s8, short s9) {
        if (!Float16.m3089isNaNimpl(s8) && !Float16.m3089isNaNimpl(s9)) {
            if (Float16.m3076compareTo41bOqos(s8, s9) < 0) {
                return s9;
            }
            return s8;
        }
        return Float16.Companion.m3111getNaNslo4al4();
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m3117minAoSsdG0(short s8, short s9) {
        if (!Float16.m3089isNaNimpl(s8) && !Float16.m3089isNaNimpl(s9)) {
            if (Float16.m3076compareTo41bOqos(s8, s9) > 0) {
                return s9;
            }
            return s8;
        }
        return Float16.Companion.m3111getNaNslo4al4();
    }
}
