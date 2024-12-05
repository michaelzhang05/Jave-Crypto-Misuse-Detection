package v1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class r extends w1.a {
    public static final Parcelable.Creator<r> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    private final int f9640a;

    /* renamed from: b, reason: collision with root package name */
    private List f9641b;

    public r(int i6, List list) {
        this.f9640a = i6;
        this.f9641b = list;
    }

    public final int a() {
        return this.f9640a;
    }

    public final List b() {
        return this.f9641b;
    }

    public final void c(l lVar) {
        if (this.f9641b == null) {
            this.f9641b = new ArrayList();
        }
        this.f9641b.add(lVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, this.f9640a);
        w1.c.m(parcel, 2, this.f9641b, false);
        w1.c.b(parcel, a6);
    }
}
