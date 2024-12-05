package p0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends S.a implements P.j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f36977a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36978b;

    public h(List list, String str) {
        this.f36977a = list;
        this.f36978b = str;
    }

    @Override // P.j
    public final Status getStatus() {
        if (this.f36978b != null) {
            return Status.f15088f;
        }
        return Status.f15092j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        List list = this.f36977a;
        int a8 = S.c.a(parcel);
        S.c.s(parcel, 1, list, false);
        S.c.q(parcel, 2, this.f36978b, false);
        S.c.b(parcel, a8);
    }
}
