package o0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes3.dex */
public final class h extends R.a implements O.j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f35787a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35788b;

    public h(List list, String str) {
        this.f35787a = list;
        this.f35788b = str;
    }

    @Override // O.j
    public final Status getStatus() {
        if (this.f35788b != null) {
            return Status.f15889f;
        }
        return Status.f15893j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        List list = this.f35787a;
        int a8 = R.c.a(parcel);
        R.c.s(parcel, 1, list, false);
        R.c.q(parcel, 2, this.f35788b, false);
        R.c.b(parcel, a8);
    }
}
