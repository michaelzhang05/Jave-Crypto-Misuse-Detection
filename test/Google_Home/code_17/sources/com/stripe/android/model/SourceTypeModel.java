package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import e3.EnumC2791e;
import e3.EnumC2792f;
import e3.K;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class SourceTypeModel implements y2.f {

    /* loaded from: classes4.dex */
    public static final class Card extends SourceTypeModel {
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25158a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25159b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC2791e f25160c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25161d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25162e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25163f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f25164g;

        /* renamed from: h, reason: collision with root package name */
        private final Integer f25165h;

        /* renamed from: i, reason: collision with root package name */
        private final EnumC2792f f25166i;

        /* renamed from: j, reason: collision with root package name */
        private final String f25167j;

        /* renamed from: k, reason: collision with root package name */
        private final ThreeDSecureStatus f25168k;

        /* renamed from: l, reason: collision with root package name */
        private final K f25169l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class ThreeDSecureStatus {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25170b;

            /* renamed from: c, reason: collision with root package name */
            public static final ThreeDSecureStatus f25171c = new ThreeDSecureStatus("Required", 0, "required");

            /* renamed from: d, reason: collision with root package name */
            public static final ThreeDSecureStatus f25172d = new ThreeDSecureStatus("Optional", 1, "optional");

            /* renamed from: e, reason: collision with root package name */
            public static final ThreeDSecureStatus f25173e = new ThreeDSecureStatus("NotSupported", 2, "not_supported");

            /* renamed from: f, reason: collision with root package name */
            public static final ThreeDSecureStatus f25174f = new ThreeDSecureStatus("Recommended", 3, "recommended");

            /* renamed from: g, reason: collision with root package name */
            public static final ThreeDSecureStatus f25175g = new ThreeDSecureStatus("Unknown", 4, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ ThreeDSecureStatus[] f25176h;

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ U5.a f25177i;

            /* renamed from: a, reason: collision with root package name */
            private final String f25178a;

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
                            if (AbstractC3255y.d(((ThreeDSecureStatus) obj).f25178a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (ThreeDSecureStatus) obj;
                }

                public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            static {
                ThreeDSecureStatus[] a8 = a();
                f25176h = a8;
                f25177i = U5.b.a(a8);
                f25170b = new a(null);
            }

            private ThreeDSecureStatus(String str, int i8, String str2) {
                this.f25178a = str2;
            }

            private static final /* synthetic */ ThreeDSecureStatus[] a() {
                return new ThreeDSecureStatus[]{f25171c, f25172d, f25173e, f25174f, f25175g};
            }

            public static U5.a c() {
                return f25177i;
            }

            public static ThreeDSecureStatus valueOf(String str) {
                return (ThreeDSecureStatus) Enum.valueOf(ThreeDSecureStatus.class, str);
            }

            public static ThreeDSecureStatus[] values() {
                return (ThreeDSecureStatus[]) f25176h.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f25178a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), EnumC2791e.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : EnumC2792f.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : K.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i8) {
                return new Card[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, EnumC2791e brand, String str3, String str4, String str5, Integer num, Integer num2, EnumC2792f enumC2792f, String str6, ThreeDSecureStatus threeDSecureStatus, K k8) {
            super(null);
            AbstractC3255y.i(brand, "brand");
            this.f25158a = str;
            this.f25159b = str2;
            this.f25160c = brand;
            this.f25161d = str3;
            this.f25162e = str4;
            this.f25163f = str5;
            this.f25164g = num;
            this.f25165h = num2;
            this.f25166i = enumC2792f;
            this.f25167j = str6;
            this.f25168k = threeDSecureStatus;
            this.f25169l = k8;
        }

        public final K a() {
            return this.f25169l;
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
            return AbstractC3255y.d(this.f25158a, card.f25158a) && AbstractC3255y.d(this.f25159b, card.f25159b) && this.f25160c == card.f25160c && AbstractC3255y.d(this.f25161d, card.f25161d) && AbstractC3255y.d(this.f25162e, card.f25162e) && AbstractC3255y.d(this.f25163f, card.f25163f) && AbstractC3255y.d(this.f25164g, card.f25164g) && AbstractC3255y.d(this.f25165h, card.f25165h) && this.f25166i == card.f25166i && AbstractC3255y.d(this.f25167j, card.f25167j) && this.f25168k == card.f25168k && this.f25169l == card.f25169l;
        }

        public int hashCode() {
            String str = this.f25158a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25159b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25160c.hashCode()) * 31;
            String str3 = this.f25161d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25162e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25163f;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.f25164g;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f25165h;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            EnumC2792f enumC2792f = this.f25166i;
            int hashCode8 = (hashCode7 + (enumC2792f == null ? 0 : enumC2792f.hashCode())) * 31;
            String str6 = this.f25167j;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ThreeDSecureStatus threeDSecureStatus = this.f25168k;
            int hashCode10 = (hashCode9 + (threeDSecureStatus == null ? 0 : threeDSecureStatus.hashCode())) * 31;
            K k8 = this.f25169l;
            return hashCode10 + (k8 != null ? k8.hashCode() : 0);
        }

        public String toString() {
            return "Card(addressLine1Check=" + this.f25158a + ", addressZipCheck=" + this.f25159b + ", brand=" + this.f25160c + ", country=" + this.f25161d + ", cvcCheck=" + this.f25162e + ", dynamicLast4=" + this.f25163f + ", expiryMonth=" + this.f25164g + ", expiryYear=" + this.f25165h + ", funding=" + this.f25166i + ", last4=" + this.f25167j + ", threeDSecureStatus=" + this.f25168k + ", tokenizationMethod=" + this.f25169l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25158a);
            out.writeString(this.f25159b);
            out.writeString(this.f25160c.name());
            out.writeString(this.f25161d);
            out.writeString(this.f25162e);
            out.writeString(this.f25163f);
            Integer num = this.f25164g;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25165h;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            EnumC2792f enumC2792f = this.f25166i;
            if (enumC2792f == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC2792f.name());
            }
            out.writeString(this.f25167j);
            ThreeDSecureStatus threeDSecureStatus = this.f25168k;
            if (threeDSecureStatus == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(threeDSecureStatus.name());
            }
            K k8 = this.f25169l;
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
        public static final Parcelable.Creator<a> CREATOR = new C0475a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25179a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25180b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25181c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25182d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25183e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25184f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25185g;

        /* renamed from: com.stripe.android.model.SourceTypeModel$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0475a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            this.f25179a = str;
            this.f25180b = str2;
            this.f25181c = str3;
            this.f25182d = str4;
            this.f25183e = str5;
            this.f25184f = str6;
            this.f25185g = str7;
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
            return AbstractC3255y.d(this.f25179a, aVar.f25179a) && AbstractC3255y.d(this.f25180b, aVar.f25180b) && AbstractC3255y.d(this.f25181c, aVar.f25181c) && AbstractC3255y.d(this.f25182d, aVar.f25182d) && AbstractC3255y.d(this.f25183e, aVar.f25183e) && AbstractC3255y.d(this.f25184f, aVar.f25184f) && AbstractC3255y.d(this.f25185g, aVar.f25185g);
        }

        public int hashCode() {
            String str = this.f25179a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25180b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25181c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25182d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25183e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25184f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f25185g;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.f25179a + ", branchCode=" + this.f25180b + ", country=" + this.f25181c + ", fingerPrint=" + this.f25182d + ", last4=" + this.f25183e + ", mandateReference=" + this.f25184f + ", mandateUrl=" + this.f25185g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25179a);
            out.writeString(this.f25180b);
            out.writeString(this.f25181c);
            out.writeString(this.f25182d);
            out.writeString(this.f25183e);
            out.writeString(this.f25184f);
            out.writeString(this.f25185g);
        }
    }

    private SourceTypeModel() {
    }

    public /* synthetic */ SourceTypeModel(AbstractC3247p abstractC3247p) {
        this();
    }
}
