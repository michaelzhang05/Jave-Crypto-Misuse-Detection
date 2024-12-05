package e3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.BankAccount;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2785I implements y2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31357a;

    /* renamed from: b, reason: collision with root package name */
    private final c f31358b;

    /* renamed from: c, reason: collision with root package name */
    private final Date f31359c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31360d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f31361e;

    /* renamed from: f, reason: collision with root package name */
    private final BankAccount f31362f;

    /* renamed from: g, reason: collision with root package name */
    private final C2790d f31363g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f31356h = new a(null);
    public static final Parcelable.Creator<C2785I> CREATOR = new b();

    /* renamed from: e3.I$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: e3.I$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2785I createFromParcel(Parcel parcel) {
            boolean z8;
            BankAccount createFromParcel;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            c valueOf = c.valueOf(parcel.readString());
            Date date = (Date) parcel.readSerializable();
            boolean z9 = true;
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() == 0) {
                z9 = false;
            }
            C2790d c2790d = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = BankAccount.CREATOR.createFromParcel(parcel);
            }
            BankAccount bankAccount = createFromParcel;
            if (parcel.readInt() != 0) {
                c2790d = C2790d.CREATOR.createFromParcel(parcel);
            }
            return new C2785I(readString, valueOf, date, z8, z9, bankAccount, c2790d);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2785I[] newArray(int i8) {
            return new C2785I[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: e3.I$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f31364b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f31365c = new c("Card", 0, "card");

        /* renamed from: d, reason: collision with root package name */
        public static final c f31366d = new c("BankAccount", 1, "bank_account");

        /* renamed from: e, reason: collision with root package name */
        public static final c f31367e = new c("Pii", 2, "pii");

        /* renamed from: f, reason: collision with root package name */
        public static final c f31368f = new c("Account", 3, "account");

        /* renamed from: g, reason: collision with root package name */
        public static final c f31369g = new c("CvcUpdate", 4, "cvc_update");

        /* renamed from: h, reason: collision with root package name */
        public static final c f31370h = new c("Person", 5, "person");

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ c[] f31371i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ U5.a f31372j;

        /* renamed from: a, reason: collision with root package name */
        private final String f31373a;

        /* renamed from: e3.I$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final c a(String str) {
                Object obj;
                Iterator<E> it = c.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((c) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (c) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            c[] a8 = a();
            f31371i = a8;
            f31372j = U5.b.a(a8);
            f31364b = new a(null);
        }

        private c(String str, int i8, String str2) {
            this.f31373a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f31365c, f31366d, f31367e, f31368f, f31369g, f31370h};
        }

        public static U5.a c() {
            return f31372j;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f31371i.clone();
        }

        public final String b() {
            return this.f31373a;
        }
    }

    public C2785I(String id, c type, Date created, boolean z8, boolean z9, BankAccount bankAccount, C2790d c2790d) {
        AbstractC3255y.i(id, "id");
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(created, "created");
        this.f31357a = id;
        this.f31358b = type;
        this.f31359c = created;
        this.f31360d = z8;
        this.f31361e = z9;
        this.f31362f = bankAccount;
        this.f31363g = c2790d;
    }

    public final C2790d a() {
        return this.f31363g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2785I)) {
            return false;
        }
        C2785I c2785i = (C2785I) obj;
        if (AbstractC3255y.d(this.f31357a, c2785i.f31357a) && this.f31358b == c2785i.f31358b && AbstractC3255y.d(this.f31359c, c2785i.f31359c) && this.f31360d == c2785i.f31360d && this.f31361e == c2785i.f31361e && AbstractC3255y.d(this.f31362f, c2785i.f31362f) && AbstractC3255y.d(this.f31363g, c2785i.f31363g)) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.f31357a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.f31357a.hashCode() * 31) + this.f31358b.hashCode()) * 31) + this.f31359c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f31360d)) * 31) + androidx.compose.foundation.a.a(this.f31361e)) * 31;
        BankAccount bankAccount = this.f31362f;
        int i8 = 0;
        if (bankAccount == null) {
            hashCode = 0;
        } else {
            hashCode = bankAccount.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        C2790d c2790d = this.f31363g;
        if (c2790d != null) {
            i8 = c2790d.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "Token(id=" + this.f31357a + ", type=" + this.f31358b + ", created=" + this.f31359c + ", livemode=" + this.f31360d + ", used=" + this.f31361e + ", bankAccount=" + this.f31362f + ", card=" + this.f31363g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31357a);
        out.writeString(this.f31358b.name());
        out.writeSerializable(this.f31359c);
        out.writeInt(this.f31360d ? 1 : 0);
        out.writeInt(this.f31361e ? 1 : 0);
        BankAccount bankAccount = this.f31362f;
        if (bankAccount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bankAccount.writeToParcel(out, i8);
        }
        C2790d c2790d = this.f31363g;
        if (c2790d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2790d.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ C2785I(String str, c cVar, Date date, boolean z8, boolean z9, BankAccount bankAccount, C2790d c2790d, int i8, AbstractC3247p abstractC3247p) {
        this(str, cVar, date, z8, z9, (i8 & 32) != 0 ? null : bankAccount, (i8 & 64) != 0 ? null : c2790d);
    }
}
