package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final Calendar f16542f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16543g;

    /* renamed from: h, reason: collision with root package name */
    final int f16544h;

    /* renamed from: i, reason: collision with root package name */
    final int f16545i;

    /* renamed from: j, reason: collision with root package name */
    final int f16546j;

    /* renamed from: k, reason: collision with root package name */
    final int f16547k;
    final long l;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.f(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i2) {
            return new Month[i2];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d2 = m.d(calendar);
        this.f16542f = d2;
        this.f16544h = d2.get(2);
        this.f16545i = d2.get(1);
        this.f16546j = d2.getMaximum(7);
        this.f16547k = d2.getActualMaximum(5);
        this.f16543g = m.o().format(d2.getTime());
        this.l = d2.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month f(int i2, int i3) {
        Calendar l = m.l();
        l.set(1, i2);
        l.set(2, i3);
        return new Month(l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month i() {
        return new Month(m.j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long B() {
        return this.f16542f.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month C(int i2) {
        Calendar d2 = m.d(this.f16542f);
        d2.add(2, i2);
        return new Month(d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int D(Month month) {
        if (this.f16542f instanceof GregorianCalendar) {
            return ((month.f16545i - this.f16545i) * 12) + (month.f16544h - this.f16544h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f16542f.compareTo(month.f16542f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f16544h == month.f16544h && this.f16545i == month.f16545i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16544h), Integer.valueOf(this.f16545i)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        int firstDayOfWeek = this.f16542f.get(7) - this.f16542f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f16546j : firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long r(int i2) {
        Calendar d2 = m.d(this.f16542f);
        d2.set(5, i2);
        return d2.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f16545i);
        parcel.writeInt(this.f16544h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String x() {
        return this.f16543g;
    }
}
