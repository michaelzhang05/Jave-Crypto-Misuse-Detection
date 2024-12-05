package t3;

import com.google.crypto.tink.shaded.protobuf.z;

/* loaded from: classes.dex */
public enum z implements z.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private static final z.b f9367g = new z.b() { // from class: t3.z.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f9369a;

    z(int i6) {
        this.f9369a = i6;
    }

    public static z a(int i6) {
        if (i6 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i6 == 1) {
            return ENABLED;
        }
        if (i6 == 2) {
            return DISABLED;
        }
        if (i6 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f9369a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
