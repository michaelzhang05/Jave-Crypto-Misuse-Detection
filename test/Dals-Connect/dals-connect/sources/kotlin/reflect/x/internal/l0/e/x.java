package kotlin.reflect.x.internal.l0.e;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public enum x implements i.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    private static i.b<x> l = new i.b<x>() { // from class: kotlin.f0.x.e.l0.e.x.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(int i2) {
            return x.d(i2);
        }
    };
    private final int n;

    x(int i2, int i3) {
        this.n = i3;
    }

    public static x d(int i2) {
        if (i2 == 0) {
            return INTERNAL;
        }
        if (i2 == 1) {
            return PRIVATE;
        }
        if (i2 == 2) {
            return PROTECTED;
        }
        if (i2 == 3) {
            return PUBLIC;
        }
        if (i2 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i2 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int a() {
        return this.n;
    }
}
