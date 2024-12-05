package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f4995a;

    /* renamed from: b, reason: collision with root package name */
    final int f4996b;

    /* renamed from: c, reason: collision with root package name */
    final int f4997c;

    /* renamed from: d, reason: collision with root package name */
    final int f4998d;

    /* renamed from: e, reason: collision with root package name */
    final int f4999e;

    /* renamed from: f, reason: collision with root package name */
    final long f5000f;

    /* renamed from: g, reason: collision with root package name */
    private String f5001g;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i6) {
            return new m[i6];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d6 = w.d(calendar);
        this.f4995a = d6;
        this.f4996b = d6.get(2);
        this.f4997c = d6.get(1);
        this.f4998d = d6.getMaximum(7);
        this.f4999e = d6.getActualMaximum(5);
        this.f5000f = d6.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m b(int i6, int i7) {
        Calendar k6 = w.k();
        k6.set(1, i6);
        k6.set(2, i7);
        return new m(k6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m c(long j6) {
        Calendar k6 = w.k();
        k6.setTimeInMillis(j6);
        return new m(k6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m d() {
        return new m(w.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.f4995a.compareTo(mVar.f4995a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(int i6) {
        int i7 = this.f4995a.get(7);
        if (i6 <= 0) {
            i6 = this.f4995a.getFirstDayOfWeek();
        }
        int i8 = i7 - i6;
        return i8 < 0 ? i8 + this.f4998d : i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f4996b == mVar.f4996b && this.f4997c == mVar.f4997c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f(int i6) {
        Calendar d6 = w.d(this.f4995a);
        d6.set(5, i6);
        return d6.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(long j6) {
        Calendar d6 = w.d(this.f4995a);
        d6.setTimeInMillis(j6);
        return d6.get(5);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4996b), Integer.valueOf(this.f4997c)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        if (this.f5001g == null) {
            this.f5001g = f.f(this.f4995a.getTimeInMillis());
        }
        return this.f5001g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long j() {
        return this.f4995a.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m k(int i6) {
        Calendar d6 = w.d(this.f4995a);
        d6.add(2, i6);
        return new m(d6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(m mVar) {
        if (this.f4995a instanceof GregorianCalendar) {
            return ((mVar.f4997c - this.f4997c) * 12) + (mVar.f4996b - this.f4996b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f4997c);
        parcel.writeInt(this.f4996b);
    }
}
