package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class V5 extends R.a {
    public static final Parcelable.Creator<V5> CREATOR = new Y5();

    /* renamed from: a, reason: collision with root package name */
    private final int f17386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17387b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17388c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f17389d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17390e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17391f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f17392g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V5(X5 x52) {
        this(x52.f17416c, x52.f17417d, x52.f17418e, x52.f17415b);
    }

    public final Object p() {
        Long l8 = this.f17389d;
        if (l8 != null) {
            return l8;
        }
        Double d8 = this.f17392g;
        if (d8 != null) {
            return d8;
        }
        String str = this.f17390e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f17386a);
        R.c.q(parcel, 2, this.f17387b, false);
        R.c.n(parcel, 3, this.f17388c);
        R.c.o(parcel, 4, this.f17389d, false);
        R.c.i(parcel, 5, null, false);
        R.c.q(parcel, 6, this.f17390e, false);
        R.c.q(parcel, 7, this.f17391f, false);
        R.c.h(parcel, 8, this.f17392g, false);
        R.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V5(String str, long j8, Object obj, String str2) {
        AbstractC1400p.f(str);
        this.f17386a = 2;
        this.f17387b = str;
        this.f17388c = j8;
        this.f17391f = str2;
        if (obj == null) {
            this.f17389d = null;
            this.f17392g = null;
            this.f17390e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f17389d = (Long) obj;
            this.f17392g = null;
            this.f17390e = null;
        } else if (obj instanceof String) {
            this.f17389d = null;
            this.f17392g = null;
            this.f17390e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f17389d = null;
                this.f17392g = (Double) obj;
                this.f17390e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V5(int i8, String str, long j8, Long l8, Float f8, String str2, String str3, Double d8) {
        this.f17386a = i8;
        this.f17387b = str;
        this.f17388c = j8;
        this.f17389d = l8;
        if (i8 == 1) {
            this.f17392g = f8 != null ? Double.valueOf(f8.doubleValue()) : null;
        } else {
            this.f17392g = d8;
        }
        this.f17390e = str2;
        this.f17391f = str3;
    }
}
