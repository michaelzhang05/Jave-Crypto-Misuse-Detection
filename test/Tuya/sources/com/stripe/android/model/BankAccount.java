package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class BankAccount implements v2.f, Parcelable {
    public static final Parcelable.Creator<BankAccount> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f23982a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23983b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f23984c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23985d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23986e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23987f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23988g;

    /* renamed from: h, reason: collision with root package name */
    private final String f23989h;

    /* renamed from: i, reason: collision with root package name */
    private final String f23990i;

    /* renamed from: j, reason: collision with root package name */
    private final Status f23991j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23992b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f23993c = new Status("New", 0, "new");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f23994d = new Status("Validated", 1, "validated");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f23995e = new Status("Verified", 2, "verified");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f23996f = new Status("VerificationFailed", 3, "verification_failed");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f23997g = new Status("Errored", 4, "errored");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ Status[] f23998h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ R5.a f23999i;

        /* renamed from: a, reason: collision with root package name */
        private final String f24000a;

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
                        if (AbstractC3159y.d(((Status) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Status[] a8 = a();
            f23998h = a8;
            f23999i = R5.b.a(a8);
            f23992b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f24000a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f23993c, f23994d, f23995e, f23996f, f23997g};
        }

        public static R5.a c() {
            return f23999i;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f23998h.clone();
        }

        public final String b() {
            return this.f24000a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24000a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24001b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f24002c = new Type("Company", 0, "company");

        /* renamed from: d, reason: collision with root package name */
        public static final Type f24003d = new Type("Individual", 1, "individual");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ Type[] f24004e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24005f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24006a;

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
                        if (AbstractC3159y.d(((Type) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Type) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Type[] a8 = a();
            f24004e = a8;
            f24005f = R5.b.a(a8);
            f24001b = new a(null);
        }

        private Type(String str, int i8, String str2) {
            this.f24006a = str2;
        }

        private static final /* synthetic */ Type[] a() {
            return new Type[]{f24002c, f24003d};
        }

        public static R5.a c() {
            return f24005f;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f24004e.clone();
        }

        public final String b() {
            return this.f24006a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24006a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BankAccount createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BankAccount[] newArray(int i8) {
            return new BankAccount[i8];
        }
    }

    public BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        this.f23982a = str;
        this.f23983b = str2;
        this.f23984c = type;
        this.f23985d = str3;
        this.f23986e = str4;
        this.f23987f = str5;
        this.f23988g = str6;
        this.f23989h = str7;
        this.f23990i = str8;
        this.f23991j = status;
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
        return AbstractC3159y.d(this.f23982a, bankAccount.f23982a) && AbstractC3159y.d(this.f23983b, bankAccount.f23983b) && this.f23984c == bankAccount.f23984c && AbstractC3159y.d(this.f23985d, bankAccount.f23985d) && AbstractC3159y.d(this.f23986e, bankAccount.f23986e) && AbstractC3159y.d(this.f23987f, bankAccount.f23987f) && AbstractC3159y.d(this.f23988g, bankAccount.f23988g) && AbstractC3159y.d(this.f23989h, bankAccount.f23989h) && AbstractC3159y.d(this.f23990i, bankAccount.f23990i) && this.f23991j == bankAccount.f23991j;
    }

    public int hashCode() {
        String str = this.f23982a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23983b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type = this.f23984c;
        int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        String str3 = this.f23985d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23986e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f23987f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f23988g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f23989h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f23990i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Status status = this.f23991j;
        return hashCode9 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        return "BankAccount(id=" + this.f23982a + ", accountHolderName=" + this.f23983b + ", accountHolderType=" + this.f23984c + ", bankName=" + this.f23985d + ", countryCode=" + this.f23986e + ", currency=" + this.f23987f + ", fingerprint=" + this.f23988g + ", last4=" + this.f23989h + ", routingNumber=" + this.f23990i + ", status=" + this.f23991j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f23982a);
        out.writeString(this.f23983b);
        Type type = this.f23984c;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(type.name());
        }
        out.writeString(this.f23985d);
        out.writeString(this.f23986e);
        out.writeString(this.f23987f);
        out.writeString(this.f23988g);
        out.writeString(this.f23989h);
        out.writeString(this.f23990i);
        Status status = this.f23991j;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
    }
}
