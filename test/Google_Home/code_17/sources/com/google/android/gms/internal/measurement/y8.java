package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum y8 {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    y8(int i8) {
    }

    public static y8 a(int i8) {
        if (i8 != 2) {
            if (i8 != 3) {
                if (i8 != 5) {
                    if (i8 != 6) {
                        return INFO;
                    }
                    return ERROR;
                }
                return WARN;
            }
            return DEBUG;
        }
        return VERBOSE;
    }
}
