package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b1 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    private final o0 f5460a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5461b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f5462c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5463d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(o0 o0Var, String str, Object[] objArr) {
        char charAt;
        this.f5460a = o0Var;
        this.f5461b = str;
        this.f5462c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i6 = charAt2 & 8191;
            int i7 = 13;
            int i8 = 1;
            while (true) {
                int i9 = i8 + 1;
                charAt = str.charAt(i8);
                if (charAt < 55296) {
                    break;
                }
                i6 |= (charAt & 8191) << i7;
                i7 += 13;
                i8 = i9;
            }
            charAt2 = i6 | (charAt << i7);
        }
        this.f5463d = charAt2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public y0 a() {
        return (this.f5463d & 1) == 1 ? y0.PROTO2 : y0.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public o0 b() {
        return this.f5460a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public boolean c() {
        return (this.f5463d & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.f5462c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f5461b;
    }
}
