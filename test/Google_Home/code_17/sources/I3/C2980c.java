package i3;

import O5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.stripe.android.model.Source;
import j6.n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w2.AbstractC4144k;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2980c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f32877a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32878b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4144k f32879c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32880d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32881e;

    /* renamed from: f, reason: collision with root package name */
    private final Source f32882f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32883g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f32875h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f32876i = 8;
    public static final Parcelable.Creator<C2980c> CREATOR = new b();

    /* renamed from: i3.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public C2980c a(Parcel parcel) {
            AbstractC4144k abstractC4144k;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            Serializable readSerializable = parcel.readSerializable();
            if (readSerializable instanceof AbstractC4144k) {
                abstractC4144k = (AbstractC4144k) readSerializable;
            } else {
                abstractC4144k = null;
            }
            AbstractC4144k abstractC4144k2 = abstractC4144k;
            boolean z8 = true;
            if (parcel.readInt() != 1) {
                z8 = false;
            }
            return new C2980c(readString, readInt, abstractC4144k2, z8, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
        }

        public final /* synthetic */ C2980c b(Intent intent) {
            C2980c c2980c;
            if (intent != null) {
                c2980c = (C2980c) intent.getParcelableExtra("extra_args");
            } else {
                c2980c = null;
            }
            if (c2980c == null) {
                return new C2980c(null, 0, null, false, null, null, null, 127, null);
            }
            return c2980c;
        }

        public void c(C2980c c2980c, Parcel parcel, int i8) {
            int i9;
            AbstractC3255y.i(c2980c, "<this>");
            AbstractC3255y.i(parcel, "parcel");
            parcel.writeString(c2980c.d());
            parcel.writeInt(c2980c.i());
            parcel.writeSerializable(c2980c.h());
            Integer num = 1;
            if (!c2980c.g()) {
                num = null;
            }
            if (num != null) {
                i9 = num.intValue();
            } else {
                i9 = 0;
            }
            parcel.writeInt(i9);
            parcel.writeString(c2980c.p());
            parcel.writeParcelable(c2980c.l(), i8);
            parcel.writeString(c2980c.s());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: i3.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2980c createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return C2980c.f32875h.a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2980c[] newArray(int i8) {
            return new C2980c[i8];
        }
    }

    public C2980c(String str, int i8, AbstractC4144k abstractC4144k, boolean z8, String str2, Source source, String str3) {
        this.f32877a = str;
        this.f32878b = i8;
        this.f32879c = abstractC4144k;
        this.f32880d = z8;
        this.f32881e = str2;
        this.f32882f = source;
        this.f32883g = str3;
    }

    public static /* synthetic */ C2980c b(C2980c c2980c, String str, int i8, AbstractC4144k abstractC4144k, boolean z8, String str2, Source source, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = c2980c.f32877a;
        }
        if ((i9 & 2) != 0) {
            i8 = c2980c.f32878b;
        }
        int i10 = i8;
        if ((i9 & 4) != 0) {
            abstractC4144k = c2980c.f32879c;
        }
        AbstractC4144k abstractC4144k2 = abstractC4144k;
        if ((i9 & 8) != 0) {
            z8 = c2980c.f32880d;
        }
        boolean z9 = z8;
        if ((i9 & 16) != 0) {
            str2 = c2980c.f32881e;
        }
        String str4 = str2;
        if ((i9 & 32) != 0) {
            source = c2980c.f32882f;
        }
        Source source2 = source;
        if ((i9 & 64) != 0) {
            str3 = c2980c.f32883g;
        }
        return c2980c.a(str, i10, abstractC4144k2, z9, str4, source2, str3);
    }

    public final C2980c a(String str, int i8, AbstractC4144k abstractC4144k, boolean z8, String str2, Source source, String str3) {
        return new C2980c(str, i8, abstractC4144k, z8, str2, source, str3);
    }

    public final String d() {
        return this.f32877a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2980c)) {
            return false;
        }
        C2980c c2980c = (C2980c) obj;
        if (AbstractC3255y.d(this.f32877a, c2980c.f32877a) && this.f32878b == c2980c.f32878b && AbstractC3255y.d(this.f32879c, c2980c.f32879c) && this.f32880d == c2980c.f32880d && AbstractC3255y.d(this.f32881e, c2980c.f32881e) && AbstractC3255y.d(this.f32882f, c2980c.f32882f) && AbstractC3255y.d(this.f32883g, c2980c.f32883g)) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return this.f32880d;
    }

    public final AbstractC4144k h() {
        return this.f32879c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f32877a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = ((hashCode * 31) + this.f32878b) * 31;
        AbstractC4144k abstractC4144k = this.f32879c;
        if (abstractC4144k == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC4144k.hashCode();
        }
        int a8 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f32880d)) * 31;
        String str2 = this.f32881e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i10 = (a8 + hashCode3) * 31;
        Source source = this.f32882f;
        if (source == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = source.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str3 = this.f32883g;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return i11 + i8;
    }

    public final int i() {
        return this.f32878b;
    }

    public final Source l() {
        return this.f32882f;
    }

    public final String p() {
        return this.f32881e;
    }

    public final String s() {
        return this.f32883g;
    }

    public String toString() {
        return "Unvalidated(clientSecret=" + this.f32877a + ", flowOutcome=" + this.f32878b + ", exception=" + this.f32879c + ", canCancelSource=" + this.f32880d + ", sourceId=" + this.f32881e + ", source=" + this.f32882f + ", stripeAccountId=" + this.f32883g + ")";
    }

    public final /* synthetic */ Bundle u() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    public final C2981d v() {
        boolean z8;
        AbstractC4144k abstractC4144k = this.f32879c;
        if (!(abstractC4144k instanceof Throwable)) {
            String str = this.f32877a;
            if (str != null && !n.u(str)) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z8) {
                return new C2981d(this.f32877a, this.f32878b, this.f32880d, this.f32881e, this.f32882f, this.f32883g);
            }
            throw new IllegalArgumentException("Invalid client_secret value in result Intent.".toString());
        }
        throw abstractC4144k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        f32875h.c(this, out, i8);
    }

    public /* synthetic */ C2980c(String str, int i8, AbstractC4144k abstractC4144k, boolean z8, String str2, Source source, String str3, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? null : abstractC4144k, (i9 & 8) == 0 ? z8 : false, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : source, (i9 & 64) != 0 ? null : str3);
    }
}
