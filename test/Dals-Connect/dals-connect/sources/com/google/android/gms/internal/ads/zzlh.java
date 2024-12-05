package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzlh implements Parcelable {
    public static final Parcelable.Creator<zzlh> CREATOR = new t00();
    private final int A;
    public final long B;
    public final int C;
    public final String D;
    private final int E;
    private int F;

    /* renamed from: f, reason: collision with root package name */
    private final String f15245f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15246g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15247h;

    /* renamed from: i, reason: collision with root package name */
    private final zzpo f15248i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15249j;

    /* renamed from: k, reason: collision with root package name */
    public final String f15250k;
    public final int l;
    public final List<byte[]> m;
    public final zzne n;
    public final int o;
    public final int p;
    public final float q;
    public final int r;
    public final float s;
    private final int t;
    private final byte[] u;
    private final zztb v;
    public final int w;
    public final int x;
    public final int y;
    private final int z;

    private zzlh(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, zztb zztbVar, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, zzne zzneVar, zzpo zzpoVar) {
        this.f15245f = str;
        this.f15249j = str2;
        this.f15250k = str3;
        this.f15247h = str4;
        this.f15246g = i2;
        this.l = i3;
        this.o = i4;
        this.p = i5;
        this.q = f2;
        this.r = i6;
        this.s = f3;
        this.u = bArr;
        this.t = i7;
        this.v = zztbVar;
        this.w = i8;
        this.x = i9;
        this.y = i10;
        this.z = i11;
        this.A = i12;
        this.C = i13;
        this.D = str5;
        this.E = i14;
        this.B = j2;
        this.m = list == null ? Collections.emptyList() : list;
        this.n = zzneVar;
        this.f15248i = zzpoVar;
    }

    public static zzlh b(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, zztb zztbVar, zzne zzneVar) {
        return new zzlh(str, null, str2, null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, zztbVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzneVar, null);
    }

    public static zzlh c(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, zzne zzneVar, int i7, String str4) {
        return new zzlh(str, null, str2, null, -1, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, -1, -1, i7, str4, -1, Long.MAX_VALUE, list, zzneVar, null);
    }

    public static zzlh d(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, zzne zzneVar, int i6, String str4) {
        return c(str, str2, null, -1, -1, i4, i5, -1, null, zzneVar, 0, str4);
    }

    public static zzlh e(String str, String str2, String str3, int i2, int i3, String str4, int i4, zzne zzneVar, long j2, List<byte[]> list) {
        return new zzlh(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, zzneVar, null);
    }

    public static zzlh f(String str, String str2, String str3, int i2, int i3, String str4, zzne zzneVar) {
        return e(str, str2, null, -1, i3, str4, -1, zzneVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static zzlh g(String str, String str2, String str3, int i2, zzne zzneVar) {
        return new zzlh(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static zzlh h(String str, String str2, String str3, int i2, List<byte[]> list, String str4, zzne zzneVar) {
        return new zzlh(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzneVar, null);
    }

    @TargetApi(16)
    private static void i(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public final zzlh a(zzpo zzpoVar) {
        return new zzlh(this.f15245f, this.f15249j, this.f15250k, this.f15247h, this.f15246g, this.l, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.C, this.D, this.E, this.B, this.m, this.n, zzpoVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlh.class == obj.getClass()) {
            zzlh zzlhVar = (zzlh) obj;
            if (this.f15246g == zzlhVar.f15246g && this.l == zzlhVar.l && this.o == zzlhVar.o && this.p == zzlhVar.p && this.q == zzlhVar.q && this.r == zzlhVar.r && this.s == zzlhVar.s && this.t == zzlhVar.t && this.w == zzlhVar.w && this.x == zzlhVar.x && this.y == zzlhVar.y && this.z == zzlhVar.z && this.A == zzlhVar.A && this.B == zzlhVar.B && this.C == zzlhVar.C && zzsy.g(this.f15245f, zzlhVar.f15245f) && zzsy.g(this.D, zzlhVar.D) && this.E == zzlhVar.E && zzsy.g(this.f15249j, zzlhVar.f15249j) && zzsy.g(this.f15250k, zzlhVar.f15250k) && zzsy.g(this.f15247h, zzlhVar.f15247h) && zzsy.g(this.n, zzlhVar.n) && zzsy.g(this.f15248i, zzlhVar.f15248i) && zzsy.g(this.v, zzlhVar.v) && Arrays.equals(this.u, zzlhVar.u) && this.m.size() == zzlhVar.m.size()) {
                for (int i2 = 0; i2 < this.m.size(); i2++) {
                    if (!Arrays.equals(this.m.get(i2), zzlhVar.m.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.F == 0) {
            String str = this.f15245f;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f15249j;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f15250k;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f15247h;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f15246g) * 31) + this.o) * 31) + this.p) * 31) + this.w) * 31) + this.x) * 31;
            String str5 = this.D;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.E) * 31;
            zzne zzneVar = this.n;
            int hashCode6 = (hashCode5 + (zzneVar == null ? 0 : zzneVar.hashCode())) * 31;
            zzpo zzpoVar = this.f15248i;
            this.F = hashCode6 + (zzpoVar != null ? zzpoVar.hashCode() : 0);
        }
        return this.F;
    }

    public final zzlh j(int i2) {
        return new zzlh(this.f15245f, this.f15249j, this.f15250k, this.f15247h, this.f15246g, i2, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.C, this.D, this.E, this.B, this.m, this.n, this.f15248i);
    }

    public final zzlh k(int i2, int i3) {
        return new zzlh(this.f15245f, this.f15249j, this.f15250k, this.f15247h, this.f15246g, this.l, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, i2, i3, this.C, this.D, this.E, this.B, this.m, this.n, this.f15248i);
    }

    public final zzlh l(long j2) {
        return new zzlh(this.f15245f, this.f15249j, this.f15250k, this.f15247h, this.f15246g, this.l, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.C, this.D, this.E, j2, this.m, this.n, this.f15248i);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat m() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f15250k);
        String str = this.D;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        i(mediaFormat, "max-input-size", this.l);
        i(mediaFormat, "width", this.o);
        i(mediaFormat, "height", this.p);
        float f2 = this.q;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        i(mediaFormat, "rotation-degrees", this.r);
        i(mediaFormat, "channel-count", this.w);
        i(mediaFormat, "sample-rate", this.x);
        i(mediaFormat, "encoder-delay", this.z);
        i(mediaFormat, "encoder-padding", this.A);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.m.get(i2)));
        }
        zztb zztbVar = this.v;
        if (zztbVar != null) {
            i(mediaFormat, "color-transfer", zztbVar.f15577h);
            i(mediaFormat, "color-standard", zztbVar.f15575f);
            i(mediaFormat, "color-range", zztbVar.f15576g);
            byte[] bArr = zztbVar.f15578i;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final int n() {
        int i2;
        int i3 = this.o;
        if (i3 == -1 || (i2 = this.p) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final String toString() {
        String str = this.f15245f;
        String str2 = this.f15249j;
        String str3 = this.f15250k;
        int i2 = this.f15246g;
        String str4 = this.D;
        int i3 = this.o;
        int i4 = this.p;
        float f2 = this.q;
        int i5 = this.w;
        int i6 = this.x;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f15245f);
        parcel.writeString(this.f15249j);
        parcel.writeString(this.f15250k);
        parcel.writeString(this.f15247h);
        parcel.writeInt(this.f15246g);
        parcel.writeInt(this.l);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeFloat(this.q);
        parcel.writeInt(this.r);
        parcel.writeFloat(this.s);
        parcel.writeInt(this.u != null ? 1 : 0);
        byte[] bArr = this.u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.t);
        parcel.writeParcelable(this.v, i2);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeLong(this.B);
        int size = this.m.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.m.get(i3));
        }
        parcel.writeParcelable(this.n, 0);
        parcel.writeParcelable(this.f15248i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlh(Parcel parcel) {
        this.f15245f = parcel.readString();
        this.f15249j = parcel.readString();
        this.f15250k = parcel.readString();
        this.f15247h = parcel.readString();
        this.f15246g = parcel.readInt();
        this.l = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readFloat();
        this.r = parcel.readInt();
        this.s = parcel.readFloat();
        this.u = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.t = parcel.readInt();
        this.v = (zztb) parcel.readParcelable(zztb.class.getClassLoader());
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.B = parcel.readLong();
        int readInt = parcel.readInt();
        this.m = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.m.add(parcel.createByteArray());
        }
        this.n = (zzne) parcel.readParcelable(zzne.class.getClassLoader());
        this.f15248i = (zzpo) parcel.readParcelable(zzpo.class.getClassLoader());
    }
}
