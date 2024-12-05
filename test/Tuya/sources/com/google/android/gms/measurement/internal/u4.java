package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class u4 extends S.a {
    public static final Parcelable.Creator<u4> CREATOR = new v4();

    /* renamed from: a, reason: collision with root package name */
    public final int f16877a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16878b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16879c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f16880d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16881e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16882f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f16883g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(int i8, String str, long j8, Long l8, Float f8, String str2, String str3, Double d8) {
        this.f16877a = i8;
        this.f16878b = str;
        this.f16879c = j8;
        this.f16880d = l8;
        if (i8 == 1) {
            this.f16883g = f8 != null ? Double.valueOf(f8.doubleValue()) : null;
        } else {
            this.f16883g = d8;
        }
        this.f16881e = str2;
        this.f16882f = str3;
    }

    public final Object s() {
        Long l8 = this.f16880d;
        if (l8 != null) {
            return l8;
        }
        Double d8 = this.f16883g;
        if (d8 != null) {
            return d8;
        }
        String str = this.f16881e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        v4.a(this, parcel, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(w4 w4Var) {
        this(w4Var.f16912c, w4Var.f16913d, w4Var.f16914e, w4Var.f16911b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(String str, long j8, Object obj, String str2) {
        AbstractC1319p.f(str);
        this.f16877a = 2;
        this.f16878b = str;
        this.f16879c = j8;
        this.f16882f = str2;
        if (obj == null) {
            this.f16880d = null;
            this.f16883g = null;
            this.f16881e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f16880d = (Long) obj;
            this.f16883g = null;
            this.f16881e = null;
        } else if (obj instanceof String) {
            this.f16880d = null;
            this.f16883g = null;
            this.f16881e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f16880d = null;
                this.f16883g = (Double) obj;
                this.f16881e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
