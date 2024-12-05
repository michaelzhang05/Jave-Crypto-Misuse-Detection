package t3;

import com.google.crypto.tink.shaded.protobuf.z;

/* loaded from: classes.dex */
public enum i0 implements z.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private static final z.b f9322h = new z.b() { // from class: t3.i0.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f9324a;

    i0(int i6) {
        this.f9324a = i6;
    }

    public static i0 a(int i6) {
        if (i6 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i6 == 1) {
            return TINK;
        }
        if (i6 == 2) {
            return LEGACY;
        }
        if (i6 == 3) {
            return RAW;
        }
        if (i6 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f9324a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
