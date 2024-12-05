package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    ArrayList<FragmentState> f1107f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<String> f1108g;

    /* renamed from: h, reason: collision with root package name */
    BackStackState[] f1109h;

    /* renamed from: i, reason: collision with root package name */
    String f1110i;

    /* renamed from: j, reason: collision with root package name */
    int f1111j;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    }

    public FragmentManagerState() {
        this.f1110i = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1107f);
        parcel.writeStringList(this.f1108g);
        parcel.writeTypedArray(this.f1109h, i2);
        parcel.writeString(this.f1110i);
        parcel.writeInt(this.f1111j);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1110i = null;
        this.f1107f = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f1108g = parcel.createStringArrayList();
        this.f1109h = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1110i = parcel.readString();
        this.f1111j = parcel.readInt();
    }
}
