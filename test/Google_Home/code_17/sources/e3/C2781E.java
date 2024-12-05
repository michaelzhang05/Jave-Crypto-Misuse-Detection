package e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2781E implements y2.f {
    public static final Parcelable.Creator<C2781E> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Integer f31286a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31287b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31288c;

    /* renamed from: d, reason: collision with root package name */
    private final List f31289d;

    /* renamed from: e, reason: collision with root package name */
    private final c f31290e;

    /* renamed from: e3.E$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2781E createFromParcel(Parcel parcel) {
            Integer valueOf;
            AbstractC3255y.i(parcel, "parcel");
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
            return new C2781E(valueOf, readString, readString2, arrayList, cVar);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2781E[] newArray(int i8) {
            return new C2781E[i8];
        }
    }

    /* renamed from: e3.E$b */
    /* loaded from: classes4.dex */
    public static final class b implements y2.f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0721b f31291a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f31292b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31293c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31294d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f31295e;

        /* renamed from: e3.E$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Integer valueOf;
                Integer valueOf2;
                AbstractC3255y.i(parcel, "parcel");
                EnumC0721b valueOf3 = EnumC0721b.valueOf(parcel.readString());
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
        /* renamed from: e3.E$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0721b {

            /* renamed from: b, reason: collision with root package name */
            public static final a f31296b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0721b f31297c = new EnumC0721b("Sku", 0, "sku");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0721b f31298d = new EnumC0721b("Tax", 1, "tax");

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0721b f31299e = new EnumC0721b("Shipping", 2, "shipping");

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ EnumC0721b[] f31300f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ U5.a f31301g;

            /* renamed from: a, reason: collision with root package name */
            private final String f31302a;

            /* renamed from: e3.E$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final /* synthetic */ EnumC0721b a(String str) {
                    Object obj;
                    Iterator<E> it = EnumC0721b.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3255y.d(((EnumC0721b) obj).f31302a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (EnumC0721b) obj;
                }

                public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            static {
                EnumC0721b[] a8 = a();
                f31300f = a8;
                f31301g = U5.b.a(a8);
                f31296b = new a(null);
            }

            private EnumC0721b(String str, int i8, String str2) {
                this.f31302a = str2;
            }

            private static final /* synthetic */ EnumC0721b[] a() {
                return new EnumC0721b[]{f31297c, f31298d, f31299e};
            }

            public static U5.a c() {
                return f31301g;
            }

            public static EnumC0721b valueOf(String str) {
                return (EnumC0721b) Enum.valueOf(EnumC0721b.class, str);
            }

            public static EnumC0721b[] values() {
                return (EnumC0721b[]) f31300f.clone();
            }
        }

        public b(EnumC0721b type, Integer num, String str, String str2, Integer num2) {
            AbstractC3255y.i(type, "type");
            this.f31291a = type;
            this.f31292b = num;
            this.f31293c = str;
            this.f31294d = str2;
            this.f31295e = num2;
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
            if (this.f31291a == bVar.f31291a && AbstractC3255y.d(this.f31292b, bVar.f31292b) && AbstractC3255y.d(this.f31293c, bVar.f31293c) && AbstractC3255y.d(this.f31294d, bVar.f31294d) && AbstractC3255y.d(this.f31295e, bVar.f31295e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f31291a.hashCode() * 31;
            Integer num = this.f31292b;
            int i8 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i9 = (hashCode4 + hashCode) * 31;
            String str = this.f31293c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f31294d;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            Integer num2 = this.f31295e;
            if (num2 != null) {
                i8 = num2.hashCode();
            }
            return i11 + i8;
        }

        public String toString() {
            return "Item(type=" + this.f31291a + ", amount=" + this.f31292b + ", currency=" + this.f31293c + ", description=" + this.f31294d + ", quantity=" + this.f31295e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f31291a.name());
            Integer num = this.f31292b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f31293c);
            out.writeString(this.f31294d);
            Integer num2 = this.f31295e;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
        }
    }

    /* renamed from: e3.E$c */
    /* loaded from: classes4.dex */
    public static final class c implements y2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f31303a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31304b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31305c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31306d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31307e;

        /* renamed from: e3.E$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                com.stripe.android.model.a createFromParcel;
                AbstractC3255y.i(parcel, "parcel");
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
            this.f31303a = aVar;
            this.f31304b = str;
            this.f31305c = str2;
            this.f31306d = str3;
            this.f31307e = str4;
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
            if (AbstractC3255y.d(this.f31303a, cVar.f31303a) && AbstractC3255y.d(this.f31304b, cVar.f31304b) && AbstractC3255y.d(this.f31305c, cVar.f31305c) && AbstractC3255y.d(this.f31306d, cVar.f31306d) && AbstractC3255y.d(this.f31307e, cVar.f31307e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            com.stripe.android.model.a aVar = this.f31303a;
            int i8 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i9 = hashCode * 31;
            String str = this.f31304b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str2 = this.f31305c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str3 = this.f31306d;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            String str4 = this.f31307e;
            if (str4 != null) {
                i8 = str4.hashCode();
            }
            return i12 + i8;
        }

        public String toString() {
            return "Shipping(address=" + this.f31303a + ", carrier=" + this.f31304b + ", name=" + this.f31305c + ", phone=" + this.f31306d + ", trackingNumber=" + this.f31307e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            com.stripe.android.model.a aVar = this.f31303a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f31304b);
            out.writeString(this.f31305c);
            out.writeString(this.f31306d);
            out.writeString(this.f31307e);
        }
    }

    public C2781E(Integer num, String str, String str2, List items, c cVar) {
        AbstractC3255y.i(items, "items");
        this.f31286a = num;
        this.f31287b = str;
        this.f31288c = str2;
        this.f31289d = items;
        this.f31290e = cVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2781E)) {
            return false;
        }
        C2781E c2781e = (C2781E) obj;
        if (AbstractC3255y.d(this.f31286a, c2781e.f31286a) && AbstractC3255y.d(this.f31287b, c2781e.f31287b) && AbstractC3255y.d(this.f31288c, c2781e.f31288c) && AbstractC3255y.d(this.f31289d, c2781e.f31289d) && AbstractC3255y.d(this.f31290e, c2781e.f31290e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.f31286a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f31287b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31288c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode4 = (((i10 + hashCode3) * 31) + this.f31289d.hashCode()) * 31;
        c cVar = this.f31290e;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return hashCode4 + i8;
    }

    public String toString() {
        return "SourceOrder(amount=" + this.f31286a + ", currency=" + this.f31287b + ", email=" + this.f31288c + ", items=" + this.f31289d + ", shipping=" + this.f31290e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        Integer num = this.f31286a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f31287b);
        out.writeString(this.f31288c);
        List list = this.f31289d;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).writeToParcel(out, i8);
        }
        c cVar = this.f31290e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
    }
}
