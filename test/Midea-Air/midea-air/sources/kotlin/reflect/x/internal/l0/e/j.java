package kotlin.reflect.x.internal.l0.e;

import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public enum j implements i.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* renamed from: j, reason: collision with root package name */
    private static i.b<j> f20523j = new i.b<j>() { // from class: kotlin.f0.x.e.l0.e.j.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(int i2) {
            return j.d(i2);
        }
    };
    private final int l;

    j(int i2, int i3) {
        this.l = i3;
    }

    public static j d(int i2) {
        if (i2 == 0) {
            return DECLARATION;
        }
        if (i2 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i2 == 2) {
            return DELEGATION;
        }
        if (i2 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
    public final int a() {
        return this.l;
    }
}
