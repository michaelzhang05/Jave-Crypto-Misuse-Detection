package t3;

import com.google.crypto.tink.shaded.protobuf.z;

/* loaded from: classes.dex */
public enum u implements z.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private static final z.b f9346i = new z.b() { // from class: t3.u.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f9348a;

    u(int i6) {
        this.f9348a = i6;
    }

    public static u a(int i6) {
        if (i6 == 0) {
            return UNKNOWN_HASH;
        }
        if (i6 == 1) {
            return SHA1;
        }
        if (i6 == 2) {
            return SHA384;
        }
        if (i6 == 3) {
            return SHA256;
        }
        if (i6 == 4) {
            return SHA512;
        }
        if (i6 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f9348a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
