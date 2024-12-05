package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final c f5425a;

    /* renamed from: b, reason: collision with root package name */
    private final c f5426b;

    /* renamed from: c, reason: collision with root package name */
    final int f5427c;

    /* renamed from: d, reason: collision with root package name */
    int f5428d;

    /* renamed from: e, reason: collision with root package name */
    int f5429e;

    /* renamed from: f, reason: collision with root package name */
    int f5430f;

    /* renamed from: g, reason: collision with root package name */
    int f5431g;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i6) {
            return new f[i6];
        }
    }

    public f(int i6, int i7, int i8, int i9) {
        this.f5428d = i6;
        this.f5429e = i7;
        this.f5430f = i8;
        this.f5427c = i9;
        this.f5431g = c(i6);
        this.f5425a = new c(59);
        this.f5426b = new c(i9 == 1 ? 24 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i6) {
        return i6 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5428d == fVar.f5428d && this.f5429e == fVar.f5429e && this.f5427c == fVar.f5427c && this.f5430f == fVar.f5430f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5427c), Integer.valueOf(this.f5428d), Integer.valueOf(this.f5429e), Integer.valueOf(this.f5430f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f5428d);
        parcel.writeInt(this.f5429e);
        parcel.writeInt(this.f5430f);
        parcel.writeInt(this.f5427c);
    }

    protected f(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
