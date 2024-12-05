package N;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new h(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}
