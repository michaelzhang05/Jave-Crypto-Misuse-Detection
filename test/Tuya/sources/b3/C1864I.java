package b3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.BankAccount;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1864I implements v2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f14351a;

    /* renamed from: b, reason: collision with root package name */
    private final c f14352b;

    /* renamed from: c, reason: collision with root package name */
    private final Date f14353c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14354d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14355e;

    /* renamed from: f, reason: collision with root package name */
    private final BankAccount f14356f;

    /* renamed from: g, reason: collision with root package name */
    private final C1869d f14357g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f14350h = new a(null);
    public static final Parcelable.Creator<C1864I> CREATOR = new b();

    /* renamed from: b3.I$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: b3.I$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1864I createFromParcel(Parcel parcel) {
            boolean z8;
            BankAccount createFromParcel;
            AbstractC3159y.i(parcel, "parcel");
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
            C1869d c1869d = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = BankAccount.CREATOR.createFromParcel(parcel);
            }
            BankAccount bankAccount = createFromParcel;
            if (parcel.readInt() != 0) {
                c1869d = C1869d.CREATOR.createFromParcel(parcel);
            }
            return new C1864I(readString, valueOf, date, z8, z9, bankAccount, c1869d);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1864I[] newArray(int i8) {
            return new C1864I[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: b3.I$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f14358b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f14359c = new c("Card", 0, "card");

        /* renamed from: d, reason: collision with root package name */
        public static final c f14360d = new c("BankAccount", 1, "bank_account");

        /* renamed from: e, reason: collision with root package name */
        public static final c f14361e = new c("Pii", 2, "pii");

        /* renamed from: f, reason: collision with root package name */
        public static final c f14362f = new c("Account", 3, "account");

        /* renamed from: g, reason: collision with root package name */
        public static final c f14363g = new c("CvcUpdate", 4, "cvc_update");

        /* renamed from: h, reason: collision with root package name */
        public static final c f14364h = new c("Person", 5, "person");

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ c[] f14365i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ R5.a f14366j;

        /* renamed from: a, reason: collision with root package name */
        private final String f14367a;

        /* renamed from: b3.I$c$a */
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
                        if (AbstractC3159y.d(((c) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (c) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            c[] a8 = a();
            f14365i = a8;
            f14366j = R5.b.a(a8);
            f14358b = new a(null);
        }

        private c(String str, int i8, String str2) {
            this.f14367a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f14359c, f14360d, f14361e, f14362f, f14363g, f14364h};
        }

        public static R5.a c() {
            return f14366j;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f14365i.clone();
        }

        public final String b() {
            return this.f14367a;
        }
    }

    public C1864I(String id, c type, Date created, boolean z8, boolean z9, BankAccount bankAccount, C1869d c1869d) {
        AbstractC3159y.i(id, "id");
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(created, "created");
        this.f14351a = id;
        this.f14352b = type;
        this.f14353c = created;
        this.f14354d = z8;
        this.f14355e = z9;
        this.f14356f = bankAccount;
        this.f14357g = c1869d;
    }

    public final C1869d b() {
        return this.f14357g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1864I)) {
            return false;
        }
        C1864I c1864i = (C1864I) obj;
        if (AbstractC3159y.d(this.f14351a, c1864i.f14351a) && this.f14352b == c1864i.f14352b && AbstractC3159y.d(this.f14353c, c1864i.f14353c) && this.f14354d == c1864i.f14354d && this.f14355e == c1864i.f14355e && AbstractC3159y.d(this.f14356f, c1864i.f14356f) && AbstractC3159y.d(this.f14357g, c1864i.f14357g)) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.f14351a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.f14351a.hashCode() * 31) + this.f14352b.hashCode()) * 31) + this.f14353c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f14354d)) * 31) + androidx.compose.foundation.a.a(this.f14355e)) * 31;
        BankAccount bankAccount = this.f14356f;
        int i8 = 0;
        if (bankAccount == null) {
            hashCode = 0;
        } else {
            hashCode = bankAccount.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        C1869d c1869d = this.f14357g;
        if (c1869d != null) {
            i8 = c1869d.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "Token(id=" + this.f14351a + ", type=" + this.f14352b + ", created=" + this.f14353c + ", livemode=" + this.f14354d + ", used=" + this.f14355e + ", bankAccount=" + this.f14356f + ", card=" + this.f14357g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14351a);
        out.writeString(this.f14352b.name());
        out.writeSerializable(this.f14353c);
        out.writeInt(this.f14354d ? 1 : 0);
        out.writeInt(this.f14355e ? 1 : 0);
        BankAccount bankAccount = this.f14356f;
        if (bankAccount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bankAccount.writeToParcel(out, i8);
        }
        C1869d c1869d = this.f14357g;
        if (c1869d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1869d.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ C1864I(String str, c cVar, Date date, boolean z8, boolean z9, BankAccount bankAccount, C1869d c1869d, int i8, AbstractC3151p abstractC3151p) {
        this(str, cVar, date, z8, z9, (i8 & 32) != 0 ? null : bankAccount, (i8 & 64) != 0 ? null : c1869d);
    }
}
