package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import v1.n;
import w1.c;

/* loaded from: classes.dex */
public final class Scope extends w1.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f4541a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4542b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i6, String str) {
        n.e(str, "scopeUri must not be null or empty");
        this.f4541a = i6;
        this.f4542b = str;
    }

    public String a() {
        return this.f4542b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4542b.equals(((Scope) obj).f4542b);
        }
        return false;
    }

    public int hashCode() {
        return this.f4542b.hashCode();
    }

    public String toString() {
        return this.f4542b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        int a6 = c.a(parcel);
        c.f(parcel, 1, this.f4541a);
        c.j(parcel, 2, a(), false);
        c.b(parcel, a6);
    }

    public Scope(String str) {
        this(1, str);
    }
}
