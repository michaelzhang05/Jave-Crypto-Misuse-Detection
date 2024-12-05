package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import e3.K;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class e extends g {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final BankAccount f25312a;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new e((BankAccount) parcel.readParcelable(e.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BankAccount bankAccount) {
        super(null);
        AbstractC3255y.i(bankAccount, "bankAccount");
        this.f25312a = bankAccount;
    }

    @Override // com.stripe.android.model.g
    public K a() {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC3255y.d(this.f25312a, ((e) obj).f25312a);
    }

    public int hashCode() {
        return this.f25312a.hashCode();
    }

    public String toString() {
        return "CustomerBankAccount(bankAccount=" + this.f25312a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f25312a, i8);
    }
}
