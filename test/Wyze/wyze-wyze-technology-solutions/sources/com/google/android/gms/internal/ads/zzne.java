package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzne implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzne> CREATOR = new m10();

    /* renamed from: f, reason: collision with root package name */
    private final zza[] f15328f;

    /* renamed from: g, reason: collision with root package name */
    private int f15329g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15330h;

    /* loaded from: classes2.dex */
    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new n10();

        /* renamed from: f, reason: collision with root package name */
        private int f15331f;

        /* renamed from: g, reason: collision with root package name */
        private final UUID f15332g;

        /* renamed from: h, reason: collision with root package name */
        private final String f15333h;

        /* renamed from: i, reason: collision with root package name */
        private final byte[] f15334i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f15335j;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zzaVar = (zza) obj;
            return this.f15333h.equals(zzaVar.f15333h) && zzsy.g(this.f15332g, zzaVar.f15332g) && Arrays.equals(this.f15334i, zzaVar.f15334i);
        }

        public final int hashCode() {
            if (this.f15331f == 0) {
                this.f15331f = (((this.f15332g.hashCode() * 31) + this.f15333h.hashCode()) * 31) + Arrays.hashCode(this.f15334i);
            }
            return this.f15331f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f15332g.getMostSignificantBits());
            parcel.writeLong(this.f15332g.getLeastSignificantBits());
            parcel.writeString(this.f15333h);
            parcel.writeByteArray(this.f15334i);
            parcel.writeByte(this.f15335j ? (byte) 1 : (byte) 0);
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f15332g = (UUID) zzsk.d(uuid);
            this.f15333h = (String) zzsk.d(str);
            this.f15334i = (byte[]) zzsk.d(bArr);
            this.f15335j = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public zza(Parcel parcel) {
            this.f15332g = new UUID(parcel.readLong(), parcel.readLong());
            this.f15333h = parcel.readString();
            this.f15334i = parcel.createByteArray();
            this.f15335j = parcel.readByte() != 0;
        }
    }

    public zzne(zza... zzaVarArr) {
        this(true, zzaVarArr);
    }

    public final zza a(int i2) {
        return this.f15328f[i2];
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zza zzaVar, zza zzaVar2) {
        zza zzaVar3 = zzaVar;
        zza zzaVar4 = zzaVar2;
        UUID uuid = zzkt.f15230b;
        if (uuid.equals(zzaVar3.f15332g)) {
            return uuid.equals(zzaVar4.f15332g) ? 0 : 1;
        }
        return zzaVar3.f15332g.compareTo(zzaVar4.f15332g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzne.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f15328f, ((zzne) obj).f15328f);
    }

    public final int hashCode() {
        if (this.f15329g == 0) {
            this.f15329g = Arrays.hashCode(this.f15328f);
        }
        return this.f15329g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedArray(this.f15328f, 0);
    }

    private zzne(boolean z, zza... zzaVarArr) {
        zza[] zzaVarArr2 = (zza[]) zzaVarArr.clone();
        Arrays.sort(zzaVarArr2, this);
        for (int i2 = 1; i2 < zzaVarArr2.length; i2++) {
            if (zzaVarArr2[i2 - 1].f15332g.equals(zzaVarArr2[i2].f15332g)) {
                String valueOf = String.valueOf(zzaVarArr2[i2].f15332g);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f15328f = zzaVarArr2;
        this.f15330h = zzaVarArr2.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzne(Parcel parcel) {
        zza[] zzaVarArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.f15328f = zzaVarArr;
        this.f15330h = zzaVarArr.length;
    }
}
