package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
class w implements n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final w f5692a = new w();

    private w() {
    }

    public static w c() {
        return f5692a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public boolean a(Class cls) {
        return x.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public m0 b(Class cls) {
        if (!x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (m0) x.v(cls.asSubclass(x.class)).k();
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e6);
        }
    }
}
