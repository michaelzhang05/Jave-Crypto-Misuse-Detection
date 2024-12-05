package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4047b extends R.a {

    @NonNull
    public static final Parcelable.Creator<C4047b> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    String f39915a;

    /* renamed from: b, reason: collision with root package name */
    String f39916b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f39917c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4047b(String str, String str2, ArrayList arrayList) {
        this.f39915a = str;
        this.f39916b = str2;
        this.f39917c = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f39915a, false);
        R.c.q(parcel, 3, this.f39916b, false);
        R.c.u(parcel, 4, this.f39917c, false);
        R.c.b(parcel, a8);
    }
}
