package com.bumptech.glide.load.engine.z;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes.dex */
public final class g implements a<byte[]> {
    @Override // com.bumptech.glide.load.engine.z.a
    public int a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.z.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.z.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i2) {
        return new byte[i2];
    }

    @Override // com.bumptech.glide.load.engine.z.a
    public String getTag() {
        return "ByteArrayPool";
    }
}
