package m4;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface P extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a implements P {
        public static final Parcelable.Creator<a> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        public static final a f35187a = new a("Params", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f35188b = new a("Options", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f35189c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ R5.a f35190d;

        /* renamed from: m4.P$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0797a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return a.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        static {
            a[] b8 = b();
            f35189c = b8;
            f35190d = R5.b.a(b8);
            CREATOR = new C0797a();
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] b() {
            return new a[]{f35187a, f35188b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f35189c.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements P {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: a, reason: collision with root package name */
        public static final b f35191a = new b("Extras", 0);

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ b[] f35192b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ R5.a f35193c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        static {
            b[] b8 = b();
            f35192b = b8;
            f35193c = R5.b.a(b8);
            CREATOR = new a();
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] b() {
            return new b[]{f35191a};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f35192b.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(name());
        }
    }
}
