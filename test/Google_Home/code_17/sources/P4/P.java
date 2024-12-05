package p4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface P extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a implements P {
        public static final Parcelable.Creator<a> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        public static final a f37213a = new a("Params", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f37214b = new a("Options", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f37215c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ U5.a f37216d;

        /* renamed from: p4.P$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0827a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return a.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        static {
            a[] a8 = a();
            f37215c = a8;
            f37216d = U5.b.a(a8);
            CREATOR = new C0827a();
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f37213a, f37214b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f37215c.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements P {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        public static final b f37217a = new b("Extras", 0);

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ b[] f37218b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ U5.a f37219c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        static {
            b[] a8 = a();
            f37218b = a8;
            f37219c = U5.b.a(a8);
            CREATOR = new a();
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f37217a};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f37218b.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(name());
        }
    }
}
