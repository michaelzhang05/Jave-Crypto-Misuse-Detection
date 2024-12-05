package p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import n4.InterfaceC3478c;

/* renamed from: p4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3762i implements Parcelable {

    /* renamed from: p4.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3762i implements InterfaceC3478c {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f37559a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f37560b;

        /* renamed from: c, reason: collision with root package name */
        private final W f37561c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f37562d;

        /* renamed from: p4.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new b(readString, linkedHashSet, W.valueOf(parcel.readString()), (Function0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Set set, W phoneNumberState, Function0 onNavigation) {
            super(null);
            AbstractC3255y.i(phoneNumberState, "phoneNumberState");
            AbstractC3255y.i(onNavigation, "onNavigation");
            this.f37559a = str;
            this.f37560b = set;
            this.f37561c = phoneNumberState;
            this.f37562d = onNavigation;
        }

        @Override // n4.InterfaceC3478c
        public boolean a(String str, I i8) {
            return InterfaceC3478c.a.a(this, str, i8);
        }

        @Override // n4.InterfaceC3478c
        public String b() {
            return this.f37559a;
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
            if (AbstractC3255y.d(this.f37559a, bVar.f37559a) && AbstractC3255y.d(this.f37560b, bVar.f37560b) && this.f37561c == bVar.f37561c && AbstractC3255y.d(this.f37562d, bVar.f37562d)) {
                return true;
            }
            return false;
        }

        @Override // n4.InterfaceC3478c
        public Function0 g() {
            return this.f37562d;
        }

        @Override // n4.InterfaceC3478c
        public Set h() {
            return this.f37560b;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f37559a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            Set set = this.f37560b;
            if (set != null) {
                i8 = set.hashCode();
            }
            return ((((i9 + i8) * 31) + this.f37561c.hashCode()) * 31) + this.f37562d.hashCode();
        }

        @Override // p4.AbstractC3762i
        public W i() {
            return this.f37561c;
        }

        public String toString() {
            return "ShippingCondensed(googleApiKey=" + this.f37559a + ", autocompleteCountries=" + this.f37560b + ", phoneNumberState=" + this.f37561c + ", onNavigation=" + this.f37562d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f37559a);
            Set set = this.f37560b;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            out.writeString(this.f37561c.name());
            out.writeSerializable((Serializable) this.f37562d);
        }
    }

    /* renamed from: p4.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3762i implements InterfaceC3478c {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f37563a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f37564b;

        /* renamed from: c, reason: collision with root package name */
        private final W f37565c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f37566d;

        /* renamed from: p4.i$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new c(readString, linkedHashSet, W.valueOf(parcel.readString()), (Function0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Set set, W phoneNumberState, Function0 onNavigation) {
            super(null);
            AbstractC3255y.i(phoneNumberState, "phoneNumberState");
            AbstractC3255y.i(onNavigation, "onNavigation");
            this.f37563a = str;
            this.f37564b = set;
            this.f37565c = phoneNumberState;
            this.f37566d = onNavigation;
        }

        @Override // n4.InterfaceC3478c
        public boolean a(String str, I i8) {
            return InterfaceC3478c.a.a(this, str, i8);
        }

        @Override // n4.InterfaceC3478c
        public String b() {
            return this.f37563a;
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
            if (AbstractC3255y.d(this.f37563a, cVar.f37563a) && AbstractC3255y.d(this.f37564b, cVar.f37564b) && this.f37565c == cVar.f37565c && AbstractC3255y.d(this.f37566d, cVar.f37566d)) {
                return true;
            }
            return false;
        }

        @Override // n4.InterfaceC3478c
        public Function0 g() {
            return this.f37566d;
        }

        @Override // n4.InterfaceC3478c
        public Set h() {
            return this.f37564b;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f37563a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            Set set = this.f37564b;
            if (set != null) {
                i8 = set.hashCode();
            }
            return ((((i9 + i8) * 31) + this.f37565c.hashCode()) * 31) + this.f37566d.hashCode();
        }

        @Override // p4.AbstractC3762i
        public W i() {
            return this.f37565c;
        }

        public String toString() {
            return "ShippingExpanded(googleApiKey=" + this.f37563a + ", autocompleteCountries=" + this.f37564b + ", phoneNumberState=" + this.f37565c + ", onNavigation=" + this.f37566d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f37563a);
            Set set = this.f37564b;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            out.writeString(this.f37565c.name());
            out.writeSerializable((Serializable) this.f37566d);
        }
    }

    public /* synthetic */ AbstractC3762i(AbstractC3247p abstractC3247p) {
        this();
    }

    public abstract W i();

    /* renamed from: p4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3762i {
        public static final Parcelable.Creator<a> CREATOR = new C0850a();

        /* renamed from: a, reason: collision with root package name */
        private final W f37558a;

        /* renamed from: p4.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0850a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(W.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public /* synthetic */ a(W w8, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? W.f37316b : w8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f37558a == ((a) obj).f37558a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f37558a.hashCode();
        }

        @Override // p4.AbstractC3762i
        public W i() {
            return this.f37558a;
        }

        public String toString() {
            return "Normal(phoneNumberState=" + this.f37558a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f37558a.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W phoneNumberState) {
            super(null);
            AbstractC3255y.i(phoneNumberState, "phoneNumberState");
            this.f37558a = phoneNumberState;
        }
    }

    private AbstractC3762i() {
    }
}
