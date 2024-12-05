package b3;

import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1867b implements v2.f {
    public static final Parcelable.Creator<C1867b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f14411a;

    /* renamed from: b3.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1867b createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3159y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                linkedHashMap.put(readString, Boolean.valueOf(z8));
            }
            return new C1867b(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1867b[] newArray(int i8) {
            return new C1867b[i8];
        }
    }

    public C1867b(Map statuses) {
        AbstractC3159y.i(statuses, "statuses");
        this.f14411a = statuses;
    }

    public final /* synthetic */ boolean b(com.stripe.android.view.r bank) {
        AbstractC3159y.i(bank, "bank");
        Boolean bool = (Boolean) this.f14411a.get(bank.getId());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1867b) && AbstractC3159y.d(this.f14411a, ((C1867b) obj).f14411a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f14411a.hashCode();
    }

    public String toString() {
        return "BankStatuses(statuses=" + this.f14411a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        Map map = this.f14411a;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ C1867b(Map map, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Q.h() : map);
    }
}
