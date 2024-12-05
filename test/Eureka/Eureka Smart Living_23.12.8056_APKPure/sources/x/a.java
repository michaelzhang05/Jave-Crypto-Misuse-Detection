package x;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Parcelable f9779a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f9778b = new C0146a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: x.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0146a extends a {
        C0146a() {
            super((C0146a) null);
        }
    }

    /* loaded from: classes.dex */
    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f9778b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i6) {
            return new a[i6];
        }
    }

    private a() {
        this.f9779a = null;
    }

    public final Parcelable a() {
        return this.f9779a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f9779a, i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f9779a = readParcelable == null ? f9778b : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f9779a = parcelable == f9778b ? null : parcelable;
    }

    /* synthetic */ a(C0146a c0146a) {
        this();
    }
}
