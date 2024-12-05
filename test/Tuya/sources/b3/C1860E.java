package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1860E implements v2.f {
    public static final Parcelable.Creator<C1860E> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Integer f14280a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14281b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14282c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14283d;

    /* renamed from: e, reason: collision with root package name */
    private final c f14284e;

    /* renamed from: b3.E$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1860E createFromParcel(Parcel parcel) {
            Integer valueOf;
            AbstractC3159y.i(parcel, "parcel");
            c cVar = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(b.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                cVar = c.CREATOR.createFromParcel(parcel);
            }
            return new C1860E(valueOf, readString, readString2, arrayList, cVar);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1860E[] newArray(int i8) {
            return new C1860E[i8];
        }
    }

    /* renamed from: b3.E$b */
    /* loaded from: classes4.dex */
    public static final class b implements v2.f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0353b f14285a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f14286b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14287c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14288d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f14289e;

        /* renamed from: b3.E$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Integer valueOf;
                Integer valueOf2;
                AbstractC3159y.i(parcel, "parcel");
                EnumC0353b valueOf3 = EnumC0353b.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                return new b(valueOf3, valueOf, readString, readString2, valueOf2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: b3.E$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0353b {

            /* renamed from: b, reason: collision with root package name */
            public static final a f14290b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0353b f14291c = new EnumC0353b("Sku", 0, "sku");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0353b f14292d = new EnumC0353b("Tax", 1, "tax");

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0353b f14293e = new EnumC0353b("Shipping", 2, "shipping");

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ EnumC0353b[] f14294f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ R5.a f14295g;

            /* renamed from: a, reason: collision with root package name */
            private final String f14296a;

            /* renamed from: b3.E$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final /* synthetic */ EnumC0353b a(String str) {
                    Object obj;
                    Iterator<E> it = EnumC0353b.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3159y.d(((EnumC0353b) obj).f14296a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (EnumC0353b) obj;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            static {
                EnumC0353b[] a8 = a();
                f14294f = a8;
                f14295g = R5.b.a(a8);
                f14290b = new a(null);
            }

            private EnumC0353b(String str, int i8, String str2) {
                this.f14296a = str2;
            }

            private static final /* synthetic */ EnumC0353b[] a() {
                return new EnumC0353b[]{f14291c, f14292d, f14293e};
            }

            public static R5.a c() {
                return f14295g;
            }

            public static EnumC0353b valueOf(String str) {
                return (EnumC0353b) Enum.valueOf(EnumC0353b.class, str);
            }

            public static EnumC0353b[] values() {
                return (EnumC0353b[]) f14294f.clone();
            }
        }

        public b(EnumC0353b type, Integer num, String str, String str2, Integer num2) {
            AbstractC3159y.i(type, "type");
            this.f14285a = type;
            this.f14286b = num;
            this.f14287c = str;
            this.f14288d = str2;
            this.f14289e = num2;
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
            if (this.f14285a == bVar.f14285a && AbstractC3159y.d(this.f14286b, bVar.f14286b) && AbstractC3159y.d(this.f14287c, bVar.f14287c) && AbstractC3159y.d(this.f14288d, bVar.f14288d) && AbstractC3159y.d(this.f14289e, bVar.f14289e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f14285a.hashCode() * 31;
            Integer num = this.f14286b;
            int i8 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i9 = (hashCode4 + hashCode) * 31;
            String str = this.f14287c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f14288d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            Integer num2 = this.f14289e;
            if (num2 != null) {
                i8 = num2.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "Item(type=" + this.f14285a + ", amount=" + this.f14286b + ", currency=" + this.f14287c + ", description=" + this.f14288d + ", quantity=" + this.f14289e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f14285a.name());
            Integer num = this.f14286b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f14287c);
            out.writeString(this.f14288d);
            Integer num2 = this.f14289e;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
        }
    }

    /* renamed from: b3.E$c */
    /* loaded from: classes4.dex */
    public static final class c implements v2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f14297a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14298b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14299c;

        /* renamed from: d, reason: collision with root package name */
        private final String f14300d;

        /* renamed from: e, reason: collision with root package name */
        private final String f14301e;

        /* renamed from: b3.E$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3159y.i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = com.stripe.android.model.a.CREATOR.createFromParcel(parcel);
                }
                return new c(createFromParcel, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(com.stripe.android.model.a aVar, String str, String str2, String str3, String str4) {
            this.f14297a = aVar;
            this.f14298b = str;
            this.f14299c = str2;
            this.f14300d = str3;
            this.f14301e = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3159y.d(this.f14297a, cVar.f14297a) && AbstractC3159y.d(this.f14298b, cVar.f14298b) && AbstractC3159y.d(this.f14299c, cVar.f14299c) && AbstractC3159y.d(this.f14300d, cVar.f14300d) && AbstractC3159y.d(this.f14301e, cVar.f14301e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            com.stripe.android.model.a aVar = this.f14297a;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f14298b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f14299c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str3 = this.f14300d;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str4 = this.f14301e;
            if (str4 != null) {
                i8 = str4.hashCode();
            }
            return i12 + i8;
        }

        public String toString() {
            return "Shipping(address=" + this.f14297a + ", carrier=" + this.f14298b + ", name=" + this.f14299c + ", phone=" + this.f14300d + ", trackingNumber=" + this.f14301e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f14297a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f14298b);
            out.writeString(this.f14299c);
            out.writeString(this.f14300d);
            out.writeString(this.f14301e);
        }
    }

    public C1860E(Integer num, String str, String str2, List items, c cVar) {
        AbstractC3159y.i(items, "items");
        this.f14280a = num;
        this.f14281b = str;
        this.f14282c = str2;
        this.f14283d = items;
        this.f14284e = cVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1860E)) {
            return false;
        }
        C1860E c1860e = (C1860E) obj;
        if (AbstractC3159y.d(this.f14280a, c1860e.f14280a) && AbstractC3159y.d(this.f14281b, c1860e.f14281b) && AbstractC3159y.d(this.f14282c, c1860e.f14282c) && AbstractC3159y.d(this.f14283d, c1860e.f14283d) && AbstractC3159y.d(this.f14284e, c1860e.f14284e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.f14280a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f14281b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f14282c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode4 = (((i10 + hashCode3) * 31) + this.f14283d.hashCode()) * 31;
        c cVar = this.f14284e;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return hashCode4 + i8;
    }

    public String toString() {
        return "SourceOrder(amount=" + this.f14280a + ", currency=" + this.f14281b + ", email=" + this.f14282c + ", items=" + this.f14283d + ", shipping=" + this.f14284e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        Integer num = this.f14280a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f14281b);
        out.writeString(this.f14282c);
        List list = this.f14283d;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).writeToParcel(out, i8);
        }
        c cVar = this.f14284e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
    }
}
