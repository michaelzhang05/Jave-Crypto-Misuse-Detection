package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class Float16Kt {
    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m3121maxAoSsdG0(short s8, short s9) {
        if (!Float16.m3094isNaNimpl(s8) && !Float16.m3094isNaNimpl(s9)) {
            if (Float16.m3081compareTo41bOqos(s8, s9) < 0) {
                return s9;
            }
            return s8;
        }
        return Float16.Companion.m3116getNaNslo4al4();
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m3122minAoSsdG0(short s8, short s9) {
        if (!Float16.m3094isNaNimpl(s8) && !Float16.m3094isNaNimpl(s9)) {
            if (Float16.m3081compareTo41bOqos(s8, s9) > 0) {
                return s9;
            }
            return s8;
        }
        return Float16.Companion.m3116getNaNslo4al4();
    }
}
