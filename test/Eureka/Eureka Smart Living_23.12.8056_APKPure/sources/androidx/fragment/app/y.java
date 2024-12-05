package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f3000a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList f3001b;

    /* renamed from: c, reason: collision with root package name */
    b[] f3002c;

    /* renamed from: d, reason: collision with root package name */
    int f3003d;

    /* renamed from: e, reason: collision with root package name */
    String f3004e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f3005f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f3006g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f3007h;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i6) {
            return new y[i6];
        }
    }

    public y() {
        this.f3004e = null;
        this.f3005f = new ArrayList();
        this.f3006g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f3000a);
        parcel.writeStringList(this.f3001b);
        parcel.writeTypedArray(this.f3002c, i6);
        parcel.writeInt(this.f3003d);
        parcel.writeString(this.f3004e);
        parcel.writeStringList(this.f3005f);
        parcel.writeTypedList(this.f3006g);
        parcel.writeTypedList(this.f3007h);
    }

    public y(Parcel parcel) {
        this.f3004e = null;
        this.f3005f = new ArrayList();
        this.f3006g = new ArrayList();
        this.f3000a = parcel.createStringArrayList();
        this.f3001b = parcel.createStringArrayList();
        this.f3002c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f3003d = parcel.readInt();
        this.f3004e = parcel.readString();
        this.f3005f = parcel.createStringArrayList();
        this.f3006g = parcel.createTypedArrayList(c.CREATOR);
        this.f3007h = parcel.createTypedArrayList(w.k.CREATOR);
    }
}
