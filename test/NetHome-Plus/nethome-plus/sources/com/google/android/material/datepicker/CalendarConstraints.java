package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final Month f16534f;

    /* renamed from: g, reason: collision with root package name */
    private final Month f16535g;

    /* renamed from: h, reason: collision with root package name */
    private final Month f16536h;

    /* renamed from: i, reason: collision with root package name */
    private final DateValidator f16537i;

    /* renamed from: j, reason: collision with root package name */
    private final int f16538j;

    /* renamed from: k, reason: collision with root package name */
    private final int f16539k;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean T(long j2);
    }

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i2) {
            return new CalendarConstraints[i2];
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator, a aVar) {
        this(month, month2, month3, dateValidator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month a(Month month) {
        if (month.compareTo(this.f16534f) < 0) {
            return this.f16534f;
        }
        return month.compareTo(this.f16535g) > 0 ? this.f16535g : month;
    }

    public DateValidator b() {
        return this.f16537i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month c() {
        return this.f16535g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f16539k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month e() {
        return this.f16536h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f16534f.equals(calendarConstraints.f16534f) && this.f16535g.equals(calendarConstraints.f16535g) && this.f16536h.equals(calendarConstraints.f16536h) && this.f16537i.equals(calendarConstraints.f16537i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month f() {
        return this.f16534f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f16538j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16534f, this.f16535g, this.f16536h, this.f16537i});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f16534f, 0);
        parcel.writeParcelable(this.f16535g, 0);
        parcel.writeParcelable(this.f16536h, 0);
        parcel.writeParcelable(this.f16537i, 0);
    }

    private CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.f16534f = month;
        this.f16535g = month2;
        this.f16536h = month3;
        this.f16537i = dateValidator;
        if (month.compareTo(month3) <= 0) {
            if (month3.compareTo(month2) <= 0) {
                this.f16539k = month.D(month2) + 1;
                this.f16538j = (month2.f16545i - month.f16545i) + 1;
                return;
            }
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }
}
