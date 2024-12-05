package e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2797k implements y2.f {
    public static final Parcelable.Creator<C2797k> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final List f31489a;

    /* renamed from: e3.k$a */
    /* loaded from: classes4.dex */
    public static final class a extends e {
        public static final Parcelable.Creator<a> CREATOR = new C0724a();

        /* renamed from: c, reason: collision with root package name */
        private final String f31490c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31491d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31492e;

        /* renamed from: e3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0724a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id, String last4, String str) {
            super(id, "bank_account", null);
            AbstractC3255y.i(id, "id");
            AbstractC3255y.i(last4, "last4");
            this.f31490c = id;
            this.f31491d = last4;
            this.f31492e = str;
        }

        @Override // e3.C2797k.e
        public String a() {
            return this.f31491d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f31490c, aVar.f31490c) && AbstractC3255y.d(this.f31491d, aVar.f31491d) && AbstractC3255y.d(this.f31492e, aVar.f31492e)) {
                return true;
            }
            return false;
        }

        @Override // e3.C2797k.e
        public String getId() {
            return this.f31490c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f31490c.hashCode() * 31) + this.f31491d.hashCode()) * 31;
            String str = this.f31492e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "BankAccount(id=" + this.f31490c + ", last4=" + this.f31491d + ", bankName=" + this.f31492e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31490c);
            out.writeString(this.f31491d);
            out.writeString(this.f31492e);
        }
    }

    /* renamed from: e3.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends e {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f31493c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31494d;

        /* renamed from: e3.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id, String last4) {
            super(id, "card", null);
            AbstractC3255y.i(id, "id");
            AbstractC3255y.i(last4, "last4");
            this.f31493c = id;
            this.f31494d = last4;
        }

        @Override // e3.C2797k.e
        public String a() {
            return this.f31494d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3255y.d(this.f31493c, bVar.f31493c) && AbstractC3255y.d(this.f31494d, bVar.f31494d)) {
                return true;
            }
            return false;
        }

        @Override // e3.C2797k.e
        public String getId() {
            return this.f31493c;
        }

        public int hashCode() {
            return (this.f31493c.hashCode() * 31) + this.f31494d.hashCode();
        }

        public String toString() {
            return "Card(id=" + this.f31493c + ", last4=" + this.f31494d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31493c);
            out.writeString(this.f31494d);
        }
    }

    /* renamed from: e3.k$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2797k createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(C2797k.class.getClassLoader()));
            }
            return new C2797k(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2797k[] newArray(int i8) {
            return new C2797k[i8];
        }
    }

    /* renamed from: e3.k$d */
    /* loaded from: classes4.dex */
    public static final class d extends e {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f31495c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31496d;

        /* renamed from: e3.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id, String last4) {
            super(id, "card", null);
            AbstractC3255y.i(id, "id");
            AbstractC3255y.i(last4, "last4");
            this.f31495c = id;
            this.f31496d = last4;
        }

        @Override // e3.C2797k.e
        public String a() {
            return this.f31496d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3255y.d(this.f31495c, dVar.f31495c) && AbstractC3255y.d(this.f31496d, dVar.f31496d)) {
                return true;
            }
            return false;
        }

        @Override // e3.C2797k.e
        public String getId() {
            return this.f31495c;
        }

        public int hashCode() {
            return (this.f31495c.hashCode() * 31) + this.f31496d.hashCode();
        }

        public String toString() {
            return "Passthrough(id=" + this.f31495c + ", last4=" + this.f31496d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31495c);
            out.writeString(this.f31496d);
        }
    }

    /* renamed from: e3.k$e */
    /* loaded from: classes4.dex */
    public static abstract class e implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f31497a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31498b;

        public /* synthetic */ e(String str, String str2, AbstractC3247p abstractC3247p) {
            this(str, str2);
        }

        public abstract String a();

        public abstract String getId();

        private e(String str, String str2) {
            this.f31497a = str;
            this.f31498b = str2;
        }
    }

    public C2797k(List paymentDetails) {
        AbstractC3255y.i(paymentDetails, "paymentDetails");
        this.f31489a = paymentDetails;
    }

    public final List a() {
        return this.f31489a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2797k) && AbstractC3255y.d(this.f31489a, ((C2797k) obj).f31489a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31489a.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetails(paymentDetails=" + this.f31489a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        List list = this.f31489a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
    }
}
