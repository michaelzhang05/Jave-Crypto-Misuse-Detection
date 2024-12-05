package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import t1.c;
import v1.m;

/* loaded from: classes.dex */
public final class Status extends w1.a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    final int f4551a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4552b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4553c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f4554d;

    /* renamed from: e, reason: collision with root package name */
    private final s1.a f4555e;

    /* renamed from: f, reason: collision with root package name */
    public static final Status f4543f = new Status(-1);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f4544g = new Status(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f4545h = new Status(14);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f4546i = new Status(8);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f4547j = new Status(15);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f4548k = new Status(16);

    /* renamed from: m, reason: collision with root package name */
    public static final Status f4550m = new Status(17);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f4549l = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    public Status(int i6) {
        this(i6, (String) null);
    }

    public s1.a a() {
        return this.f4555e;
    }

    public int b() {
        return this.f4552b;
    }

    public String c() {
        return this.f4553c;
    }

    public boolean d() {
        return this.f4554d != null;
    }

    public final String e() {
        String str = this.f4553c;
        return str != null ? str : c.a(this.f4552b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4551a == status.f4551a && this.f4552b == status.f4552b && m.a(this.f4553c, status.f4553c) && m.a(this.f4554d, status.f4554d) && m.a(this.f4555e, status.f4555e);
    }

    public int hashCode() {
        return m.b(Integer.valueOf(this.f4551a), Integer.valueOf(this.f4552b), this.f4553c, this.f4554d, this.f4555e);
    }

    public String toString() {
        m.a c6 = m.c(this);
        c6.a("statusCode", e());
        c6.a("resolution", this.f4554d);
        return c6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, b());
        w1.c.j(parcel, 2, c(), false);
        w1.c.i(parcel, 3, this.f4554d, i6, false);
        w1.c.i(parcel, 4, a(), i6, false);
        w1.c.f(parcel, 1000, this.f4551a);
        w1.c.b(parcel, a6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i6, int i7, String str, PendingIntent pendingIntent, s1.a aVar) {
        this.f4551a = i6;
        this.f4552b = i7;
        this.f4553c = str;
        this.f4554d = pendingIntent;
        this.f4555e = aVar;
    }

    public Status(int i6, String str) {
        this(1, i6, str, null, null);
    }

    public Status(s1.a aVar, String str) {
        this(aVar, str, 17);
    }

    public Status(s1.a aVar, String str, int i6) {
        this(1, i6, str, aVar.c(), aVar);
    }
}
