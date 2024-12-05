package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class BankAccount implements y2.f, Parcelable {
    public static final Parcelable.Creator<BankAccount> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f25037a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25038b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f25039c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25040d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25041e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25042f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25043g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25044h;

    /* renamed from: i, reason: collision with root package name */
    private final String f25045i;

    /* renamed from: j, reason: collision with root package name */
    private final Status f25046j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25047b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f25048c = new Status("New", 0, "new");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f25049d = new Status("Validated", 1, "validated");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f25050e = new Status("Verified", 2, "verified");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f25051f = new Status("VerificationFailed", 3, "verification_failed");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f25052g = new Status("Errored", 4, "errored");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ Status[] f25053h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25054i;

        /* renamed from: a, reason: collision with root package name */
        private final String f25055a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Status a(String str) {
                Object obj;
                Iterator<E> it = Status.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((Status) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            Status[] a8 = a();
            f25053h = a8;
            f25054i = U5.b.a(a8);
            f25047b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f25055a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f25048c, f25049d, f25050e, f25051f, f25052g};
        }

        public static U5.a c() {
            return f25054i;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f25053h.clone();
        }

        public final String b() {
            return this.f25055a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25055a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25056b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f25057c = new Type("Company", 0, "company");

        /* renamed from: d, reason: collision with root package name */
        public static final Type f25058d = new Type("Individual", 1, "individual");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ Type[] f25059e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25060f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25061a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Type a(String str) {
                Object obj;
                Iterator<E> it = Type.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((Type) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Type) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            Type[] a8 = a();
            f25059e = a8;
            f25060f = U5.b.a(a8);
            f25056b = new a(null);
        }

        private Type(String str, int i8, String str2) {
            this.f25061a = str2;
        }

        private static final /* synthetic */ Type[] a() {
            return new Type[]{f25057c, f25058d};
        }

        public static U5.a c() {
            return f25060f;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f25059e.clone();
        }

        public final String b() {
            return this.f25061a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25061a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BankAccount createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BankAccount[] newArray(int i8) {
            return new BankAccount[i8];
        }
    }

    public BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        this.f25037a = str;
        this.f25038b = str2;
        this.f25039c = type;
        this.f25040d = str3;
        this.f25041e = str4;
        this.f25042f = str5;
        this.f25043g = str6;
        this.f25044h = str7;
        this.f25045i = str8;
        this.f25046j = status;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) obj;
        return AbstractC3255y.d(this.f25037a, bankAccount.f25037a) && AbstractC3255y.d(this.f25038b, bankAccount.f25038b) && this.f25039c == bankAccount.f25039c && AbstractC3255y.d(this.f25040d, bankAccount.f25040d) && AbstractC3255y.d(this.f25041e, bankAccount.f25041e) && AbstractC3255y.d(this.f25042f, bankAccount.f25042f) && AbstractC3255y.d(this.f25043g, bankAccount.f25043g) && AbstractC3255y.d(this.f25044h, bankAccount.f25044h) && AbstractC3255y.d(this.f25045i, bankAccount.f25045i) && this.f25046j == bankAccount.f25046j;
    }

    public int hashCode() {
        String str = this.f25037a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25038b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type = this.f25039c;
        int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        String str3 = this.f25040d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25041e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25042f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f25043g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25044h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f25045i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Status status = this.f25046j;
        return hashCode9 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        return "BankAccount(id=" + this.f25037a + ", accountHolderName=" + this.f25038b + ", accountHolderType=" + this.f25039c + ", bankName=" + this.f25040d + ", countryCode=" + this.f25041e + ", currency=" + this.f25042f + ", fingerprint=" + this.f25043g + ", last4=" + this.f25044h + ", routingNumber=" + this.f25045i + ", status=" + this.f25046j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25037a);
        out.writeString(this.f25038b);
        Type type = this.f25039c;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(type.name());
        }
        out.writeString(this.f25040d);
        out.writeString(this.f25041e);
        out.writeString(this.f25042f);
        out.writeString(this.f25043g);
        out.writeString(this.f25044h);
        out.writeString(this.f25045i);
        Status status = this.f25046j;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
    }
}
