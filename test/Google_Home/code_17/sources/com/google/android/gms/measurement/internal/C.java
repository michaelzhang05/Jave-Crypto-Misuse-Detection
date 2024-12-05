package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class C extends R.a implements Iterable {
    public static final Parcelable.Creator<C> CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f16984a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(Bundle bundle) {
        this.f16984a = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object H(String str) {
        return this.f16984a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String J(String str) {
        return this.f16984a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new F(this);
    }

    public final int p() {
        return this.f16984a.size();
    }

    public final String toString() {
        return this.f16984a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double v(String str) {
        return Double.valueOf(this.f16984a.getDouble(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.e(parcel, 2, y(), false);
        R.c.b(parcel, a8);
    }

    public final Bundle y() {
        return new Bundle(this.f16984a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long z(String str) {
        return Long.valueOf(this.f16984a.getLong(str));
    }
}
