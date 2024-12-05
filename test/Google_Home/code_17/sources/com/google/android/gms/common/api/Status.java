package com.google.android.gms.common.api;

import N.C1331b;
import O.c;
import O.j;
import Q.AbstractC1398n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class Status extends R.a implements j, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f15896a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15897b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f15898c;

    /* renamed from: d, reason: collision with root package name */
    private final C1331b f15899d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f15888e = new Status(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f15889f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f15890g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f15891h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f15892i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f15893j = new Status(16);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f15895l = new Status(17);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f15894k = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i8, String str, PendingIntent pendingIntent, C1331b c1331b) {
        this.f15896a = i8;
        this.f15897b = str;
        this.f15898c = pendingIntent;
        this.f15899d = c1331b;
    }

    public boolean H() {
        return this.f15896a <= 0;
    }

    public final String J() {
        String str = this.f15897b;
        if (str != null) {
            return str;
        }
        return c.a(this.f15896a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f15896a != status.f15896a || !AbstractC1398n.a(this.f15897b, status.f15897b) || !AbstractC1398n.a(this.f15898c, status.f15898c) || !AbstractC1398n.a(this.f15899d, status.f15899d)) {
            return false;
        }
        return true;
    }

    @Override // O.j
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return AbstractC1398n.b(Integer.valueOf(this.f15896a), this.f15897b, this.f15898c, this.f15899d);
    }

    public C1331b p() {
        return this.f15899d;
    }

    public String toString() {
        AbstractC1398n.a c8 = AbstractC1398n.c(this);
        c8.a("statusCode", J());
        c8.a("resolution", this.f15898c);
        return c8.toString();
    }

    public PendingIntent u() {
        return this.f15898c;
    }

    public int v() {
        return this.f15896a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, v());
        R.c.q(parcel, 2, y(), false);
        R.c.p(parcel, 3, this.f15898c, i8, false);
        R.c.p(parcel, 4, p(), i8, false);
        R.c.b(parcel, a8);
    }

    public String y() {
        return this.f15897b;
    }

    public boolean z() {
        return this.f15898c != null;
    }

    public Status(int i8) {
        this(i8, (String) null);
    }

    public Status(C1331b c1331b, String str) {
        this(c1331b, str, 17);
    }

    public Status(int i8, String str) {
        this(i8, str, (PendingIntent) null);
    }

    public Status(C1331b c1331b, String str, int i8) {
        this(i8, str, c1331b.v(), c1331b);
    }

    public Status(int i8, String str, PendingIntent pendingIntent) {
        this(i8, str, pendingIntent, null);
    }
}
