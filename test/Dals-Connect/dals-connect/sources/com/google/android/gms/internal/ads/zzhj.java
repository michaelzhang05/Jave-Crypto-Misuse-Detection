package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzhj {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15091b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15092c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15093d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15094e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15095f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15096g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15097h;

    /* renamed from: i, reason: collision with root package name */
    public final List<byte[]> f15098i;

    /* renamed from: j, reason: collision with root package name */
    private int f15099j;

    /* renamed from: k, reason: collision with root package name */
    private int f15100k;
    private int l;
    private MediaFormat m;

    @TargetApi(16)
    private zzhj(MediaFormat mediaFormat) {
        this.m = mediaFormat;
        this.a = mediaFormat.getString("mime");
        this.f15091b = a(mediaFormat, "max-input-size");
        this.f15093d = a(mediaFormat, "width");
        this.f15094e = a(mediaFormat, "height");
        this.f15096g = a(mediaFormat, "channel-count");
        this.f15097h = a(mediaFormat, "sample-rate");
        this.f15095f = mediaFormat.containsKey("com.google.android.videos.pixelWidthHeightRatio") ? mediaFormat.getFloat("com.google.android.videos.pixelWidthHeightRatio") : -1.0f;
        this.f15098i = new ArrayList();
        int i2 = 0;
        while (true) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            if (!mediaFormat.containsKey(sb.toString())) {
                break;
            }
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i2);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.get(bArr);
            this.f15098i.add(bArr);
            byteBuffer.flip();
            i2++;
        }
        this.f15092c = mediaFormat.containsKey("durationUs") ? mediaFormat.getLong("durationUs") : -1L;
        this.f15099j = -1;
        this.f15100k = -1;
    }

    @TargetApi(16)
    private static final int a(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }

    @TargetApi(16)
    public static zzhj b(MediaFormat mediaFormat) {
        return new zzhj(mediaFormat);
    }

    public static zzhj c(String str, int i2, int i3, int i4, List<byte[]> list) {
        return g(str, -1, -1L, i3, i4, list);
    }

    public static zzhj d(String str, int i2, long j2, int i3, int i4, float f2, List<byte[]> list) {
        return new zzhj(str, -1, j2, i3, i4, f2, -1, -1, list);
    }

    public static zzhj e(String str, int i2, long j2, int i3, int i4, List<byte[]> list) {
        return d(str, -1, j2, i3, i4, 1.0f, list);
    }

    @TargetApi(16)
    private static final void f(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static zzhj g(String str, int i2, long j2, int i3, int i4, List<byte[]> list) {
        return new zzhj(str, i2, j2, -1, -1, -1.0f, i3, i4, list);
    }

    public static zzhj h() {
        return new zzhj("application/ttml+xml", -1, -1L, -1, -1, -1.0f, -1, -1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhj.class == obj.getClass()) {
            zzhj zzhjVar = (zzhj) obj;
            if (this.f15091b == zzhjVar.f15091b && this.f15093d == zzhjVar.f15093d && this.f15094e == zzhjVar.f15094e && this.f15095f == zzhjVar.f15095f && this.f15099j == zzhjVar.f15099j && this.f15100k == zzhjVar.f15100k && this.f15096g == zzhjVar.f15096g && this.f15097h == zzhjVar.f15097h && zzkq.d(this.a, zzhjVar.a) && this.f15098i.size() == zzhjVar.f15098i.size()) {
                for (int i2 = 0; i2 < this.f15098i.size(); i2++) {
                    if (!Arrays.equals(this.f15098i.get(i2), zzhjVar.f15098i.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.l == 0) {
            String str = this.a;
            int hashCode = (((((((((((((((((((str == null ? 0 : str.hashCode()) + 527) * 31) + this.f15091b) * 31) + this.f15093d) * 31) + this.f15094e) * 31) + Float.floatToRawIntBits(this.f15095f)) * 31) + ((int) this.f15092c)) * 31) + this.f15099j) * 31) + this.f15100k) * 31) + this.f15096g) * 31) + this.f15097h;
            for (int i2 = 0; i2 < this.f15098i.size(); i2++) {
                hashCode = (hashCode * 31) + Arrays.hashCode(this.f15098i.get(i2));
            }
            this.l = hashCode;
        }
        return this.l;
    }

    @TargetApi(16)
    public final MediaFormat i() {
        if (this.m == null) {
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", this.a);
            f(mediaFormat, "max-input-size", this.f15091b);
            f(mediaFormat, "width", this.f15093d);
            f(mediaFormat, "height", this.f15094e);
            f(mediaFormat, "channel-count", this.f15096g);
            f(mediaFormat, "sample-rate", this.f15097h);
            float f2 = this.f15095f;
            if (f2 != -1.0f) {
                mediaFormat.setFloat("com.google.android.videos.pixelWidthHeightRatio", f2);
            }
            for (int i2 = 0; i2 < this.f15098i.size(); i2++) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("csd-");
                sb.append(i2);
                mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f15098i.get(i2)));
            }
            long j2 = this.f15092c;
            if (j2 != -1) {
                mediaFormat.setLong("durationUs", j2);
            }
            f(mediaFormat, "max-width", this.f15099j);
            f(mediaFormat, "max-height", this.f15100k);
            this.m = mediaFormat;
        }
        return this.m;
    }

    public final String toString() {
        String str = this.a;
        int i2 = this.f15091b;
        int i3 = this.f15093d;
        int i4 = this.f15094e;
        float f2 = this.f15095f;
        int i5 = this.f15096g;
        int i6 = this.f15097h;
        long j2 = this.f15092c;
        int i7 = this.f15099j;
        int i8 = this.f15100k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 143);
        sb.append("MediaFormat(");
        sb.append(str);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(i7);
        sb.append(", ");
        sb.append(i8);
        sb.append(")");
        return sb.toString();
    }

    private zzhj(String str, int i2, long j2, int i3, int i4, float f2, int i5, int i6, List<byte[]> list) {
        this.a = str;
        this.f15091b = i2;
        this.f15092c = j2;
        this.f15093d = i3;
        this.f15094e = i4;
        this.f15095f = f2;
        this.f15096g = i5;
        this.f15097h = i6;
        this.f15098i = list == null ? Collections.emptyList() : list;
        this.f15099j = -1;
        this.f15100k = -1;
    }
}
