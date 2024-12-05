package j2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends w1.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f7082a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7083b;

    public h(List list, String str) {
        this.f7082a = list;
        this.f7083b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.k(parcel, 1, this.f7082a, false);
        w1.c.j(parcel, 2, this.f7083b, false);
        w1.c.b(parcel, a6);
    }
}
