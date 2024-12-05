package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1876k implements v2.f {
    public static final Parcelable.Creator<C1876k> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    private final List f14483a;

    /* renamed from: b3.k$a */
    /* loaded from: classes4.dex */
    public static final class a extends e {
        public static final Parcelable.Creator<a> CREATOR = new C0356a();

        /* renamed from: c, reason: collision with root package name */
        private final String f14484c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14485d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14486e;

        /* renamed from: b3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0356a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(last4, "last4");
            this.f14484c = id;
            this.f14485d = last4;
            this.f14486e = str;
        }

        @Override // b3.C1876k.e
        public String b() {
            return this.f14485d;
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
            if (AbstractC3159y.d(this.f14484c, aVar.f14484c) && AbstractC3159y.d(this.f14485d, aVar.f14485d) && AbstractC3159y.d(this.f14486e, aVar.f14486e)) {
                return true;
            }
            return false;
        }

        @Override // b3.C1876k.e
        public String getId() {
            return this.f14484c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f14484c.hashCode() * 31) + this.f14485d.hashCode()) * 31;
            String str = this.f14486e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "BankAccount(id=" + this.f14484c + ", last4=" + this.f14485d + ", bankName=" + this.f14486e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14484c);
            out.writeString(this.f14485d);
            out.writeString(this.f14486e);
        }
    }

    /* renamed from: b3.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends e {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f14487c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14488d;

        /* renamed from: b3.k$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(last4, "last4");
            this.f14487c = id;
            this.f14488d = last4;
        }

        @Override // b3.C1876k.e
        public String b() {
            return this.f14488d;
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
            if (AbstractC3159y.d(this.f14487c, bVar.f14487c) && AbstractC3159y.d(this.f14488d, bVar.f14488d)) {
                return true;
            }
            return false;
        }

        @Override // b3.C1876k.e
        public String getId() {
            return this.f14487c;
        }

        public int hashCode() {
            return (this.f14487c.hashCode() * 31) + this.f14488d.hashCode();
        }

        public String toString() {
            return "Card(id=" + this.f14487c + ", last4=" + this.f14488d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14487c);
            out.writeString(this.f14488d);
        }
    }

    /* renamed from: b3.k$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1876k createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(C1876k.class.getClassLoader()));
            }
            return new C1876k(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1876k[] newArray(int i8) {
            return new C1876k[i8];
        }
    }

    /* renamed from: b3.k$d */
    /* loaded from: classes4.dex */
    public static final class d extends e {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final String f14489c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14490d;

        /* renamed from: b3.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(last4, "last4");
            this.f14489c = id;
            this.f14490d = last4;
        }

        @Override // b3.C1876k.e
        public String b() {
            return this.f14490d;
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
            if (AbstractC3159y.d(this.f14489c, dVar.f14489c) && AbstractC3159y.d(this.f14490d, dVar.f14490d)) {
                return true;
            }
            return false;
        }

        @Override // b3.C1876k.e
        public String getId() {
            return this.f14489c;
        }

        public int hashCode() {
            return (this.f14489c.hashCode() * 31) + this.f14490d.hashCode();
        }

        public String toString() {
            return "Passthrough(id=" + this.f14489c + ", last4=" + this.f14490d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14489c);
            out.writeString(this.f14490d);
        }
    }

    /* renamed from: b3.k$e */
    /* loaded from: classes4.dex */
    public static abstract class e implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f14491a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14492b;

        public /* synthetic */ e(String str, String str2, AbstractC3151p abstractC3151p) {
            this(str, str2);
        }

        public abstract String b();

        public abstract String getId();

        private e(String str, String str2) {
            this.f14491a = str;
            this.f14492b = str2;
        }
    }

    public C1876k(List paymentDetails) {
        AbstractC3159y.i(paymentDetails, "paymentDetails");
        this.f14483a = paymentDetails;
    }

    public final List b() {
        return this.f14483a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1876k) && AbstractC3159y.d(this.f14483a, ((C1876k) obj).f14483a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f14483a.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetails(paymentDetails=" + this.f14483a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        List list = this.f14483a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
    }
}
