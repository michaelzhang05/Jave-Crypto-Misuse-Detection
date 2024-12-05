package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import b3.EnumC1870e;
import b3.EnumC1871f;
import b3.K;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class SourceTypeModel implements v2.f {

    /* loaded from: classes4.dex */
    public static final class Card extends SourceTypeModel {
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24103a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24104b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC1870e f24105c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24106d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24107e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24108f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f24109g;

        /* renamed from: h, reason: collision with root package name */
        private final Integer f24110h;

        /* renamed from: i, reason: collision with root package name */
        private final EnumC1871f f24111i;

        /* renamed from: j, reason: collision with root package name */
        private final String f24112j;

        /* renamed from: k, reason: collision with root package name */
        private final ThreeDSecureStatus f24113k;

        /* renamed from: l, reason: collision with root package name */
        private final K f24114l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class ThreeDSecureStatus {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24115b;

            /* renamed from: c, reason: collision with root package name */
            public static final ThreeDSecureStatus f24116c = new ThreeDSecureStatus("Required", 0, "required");

            /* renamed from: d, reason: collision with root package name */
            public static final ThreeDSecureStatus f24117d = new ThreeDSecureStatus("Optional", 1, "optional");

            /* renamed from: e, reason: collision with root package name */
            public static final ThreeDSecureStatus f24118e = new ThreeDSecureStatus("NotSupported", 2, "not_supported");

            /* renamed from: f, reason: collision with root package name */
            public static final ThreeDSecureStatus f24119f = new ThreeDSecureStatus("Recommended", 3, "recommended");

            /* renamed from: g, reason: collision with root package name */
            public static final ThreeDSecureStatus f24120g = new ThreeDSecureStatus("Unknown", 4, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ ThreeDSecureStatus[] f24121h;

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24122i;

            /* renamed from: a, reason: collision with root package name */
            private final String f24123a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final ThreeDSecureStatus a(String str) {
                    Object obj;
                    Iterator<E> it = ThreeDSecureStatus.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3159y.d(((ThreeDSecureStatus) obj).f24123a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (ThreeDSecureStatus) obj;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            static {
                ThreeDSecureStatus[] a8 = a();
                f24121h = a8;
                f24122i = R5.b.a(a8);
                f24115b = new a(null);
            }

            private ThreeDSecureStatus(String str, int i8, String str2) {
                this.f24123a = str2;
            }

            private static final /* synthetic */ ThreeDSecureStatus[] a() {
                return new ThreeDSecureStatus[]{f24116c, f24117d, f24118e, f24119f, f24120g};
            }

            public static R5.a c() {
                return f24122i;
            }

            public static ThreeDSecureStatus valueOf(String str) {
                return (ThreeDSecureStatus) Enum.valueOf(ThreeDSecureStatus.class, str);
            }

            public static ThreeDSecureStatus[] values() {
                return (ThreeDSecureStatus[]) f24121h.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f24123a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), EnumC1870e.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : EnumC1871f.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : K.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i8) {
                return new Card[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, EnumC1870e brand, String str3, String str4, String str5, Integer num, Integer num2, EnumC1871f enumC1871f, String str6, ThreeDSecureStatus threeDSecureStatus, K k8) {
            super(null);
            AbstractC3159y.i(brand, "brand");
            this.f24103a = str;
            this.f24104b = str2;
            this.f24105c = brand;
            this.f24106d = str3;
            this.f24107e = str4;
            this.f24108f = str5;
            this.f24109g = num;
            this.f24110h = num2;
            this.f24111i = enumC1871f;
            this.f24112j = str6;
            this.f24113k = threeDSecureStatus;
            this.f24114l = k8;
        }

        public final K b() {
            return this.f24114l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return AbstractC3159y.d(this.f24103a, card.f24103a) && AbstractC3159y.d(this.f24104b, card.f24104b) && this.f24105c == card.f24105c && AbstractC3159y.d(this.f24106d, card.f24106d) && AbstractC3159y.d(this.f24107e, card.f24107e) && AbstractC3159y.d(this.f24108f, card.f24108f) && AbstractC3159y.d(this.f24109g, card.f24109g) && AbstractC3159y.d(this.f24110h, card.f24110h) && this.f24111i == card.f24111i && AbstractC3159y.d(this.f24112j, card.f24112j) && this.f24113k == card.f24113k && this.f24114l == card.f24114l;
        }

        public int hashCode() {
            String str = this.f24103a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24104b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24105c.hashCode()) * 31;
            String str3 = this.f24106d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24107e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24108f;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.f24109g;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f24110h;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            EnumC1871f enumC1871f = this.f24111i;
            int hashCode8 = (hashCode7 + (enumC1871f == null ? 0 : enumC1871f.hashCode())) * 31;
            String str6 = this.f24112j;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ThreeDSecureStatus threeDSecureStatus = this.f24113k;
            int hashCode10 = (hashCode9 + (threeDSecureStatus == null ? 0 : threeDSecureStatus.hashCode())) * 31;
            K k8 = this.f24114l;
            return hashCode10 + (k8 != null ? k8.hashCode() : 0);
        }

        public String toString() {
            return "Card(addressLine1Check=" + this.f24103a + ", addressZipCheck=" + this.f24104b + ", brand=" + this.f24105c + ", country=" + this.f24106d + ", cvcCheck=" + this.f24107e + ", dynamicLast4=" + this.f24108f + ", expiryMonth=" + this.f24109g + ", expiryYear=" + this.f24110h + ", funding=" + this.f24111i + ", last4=" + this.f24112j + ", threeDSecureStatus=" + this.f24113k + ", tokenizationMethod=" + this.f24114l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24103a);
            out.writeString(this.f24104b);
            out.writeString(this.f24105c.name());
            out.writeString(this.f24106d);
            out.writeString(this.f24107e);
            out.writeString(this.f24108f);
            Integer num = this.f24109g;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f24110h;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            EnumC1871f enumC1871f = this.f24111i;
            if (enumC1871f == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC1871f.name());
            }
            out.writeString(this.f24112j);
            ThreeDSecureStatus threeDSecureStatus = this.f24113k;
            if (threeDSecureStatus == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(threeDSecureStatus.name());
            }
            K k8 = this.f24114l;
            if (k8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(k8.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends SourceTypeModel {
        public static final Parcelable.Creator<a> CREATOR = new C0479a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24124a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24125b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24126c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24127d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24128e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24129f;

        /* renamed from: g, reason: collision with root package name */
        private final String f24130g;

        /* renamed from: com.stripe.android.model.SourceTypeModel$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0479a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(null);
            this.f24124a = str;
            this.f24125b = str2;
            this.f24126c = str3;
            this.f24127d = str4;
            this.f24128e = str5;
            this.f24129f = str6;
            this.f24130g = str7;
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
            return AbstractC3159y.d(this.f24124a, aVar.f24124a) && AbstractC3159y.d(this.f24125b, aVar.f24125b) && AbstractC3159y.d(this.f24126c, aVar.f24126c) && AbstractC3159y.d(this.f24127d, aVar.f24127d) && AbstractC3159y.d(this.f24128e, aVar.f24128e) && AbstractC3159y.d(this.f24129f, aVar.f24129f) && AbstractC3159y.d(this.f24130g, aVar.f24130g);
        }

        public int hashCode() {
            String str = this.f24124a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24125b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24126c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24127d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24128e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f24129f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f24130g;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.f24124a + ", branchCode=" + this.f24125b + ", country=" + this.f24126c + ", fingerPrint=" + this.f24127d + ", last4=" + this.f24128e + ", mandateReference=" + this.f24129f + ", mandateUrl=" + this.f24130g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24124a);
            out.writeString(this.f24125b);
            out.writeString(this.f24126c);
            out.writeString(this.f24127d);
            out.writeString(this.f24128e);
            out.writeString(this.f24129f);
            out.writeString(this.f24130g);
        }
    }

    private SourceTypeModel() {
    }

    public /* synthetic */ SourceTypeModel(AbstractC3151p abstractC3151p) {
        this();
    }
}
