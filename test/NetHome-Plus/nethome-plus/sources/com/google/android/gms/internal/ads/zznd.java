package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zznd extends zzmy {

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f15325c;

    /* renamed from: d, reason: collision with root package name */
    public long f15326d;

    /* renamed from: b, reason: collision with root package name */
    public final zzmz f15324b = new zzmz();

    /* renamed from: e, reason: collision with root package name */
    private final int f15327e = 0;

    public zznd(int i2) {
    }

    private final ByteBuffer i(int i2) {
        ByteBuffer byteBuffer = this.f15325c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i2);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f15325c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void h(int i2) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f15325c;
        if (byteBuffer == null) {
            this.f15325c = i(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f15325c.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            return;
        }
        ByteBuffer i4 = i(i3);
        if (position > 0) {
            this.f15325c.position(0);
            this.f15325c.limit(position);
            i4.put(this.f15325c);
        }
        this.f15325c = i4;
    }

    public final boolean j() {
        return d(1073741824);
    }
}
