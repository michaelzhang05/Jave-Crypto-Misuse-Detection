package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class c extends b {

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f10766g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f10766g = bArr;
    }

    @Override // com.google.android.gms.common.b
    final byte[] R() {
        return this.f10766g;
    }
}
