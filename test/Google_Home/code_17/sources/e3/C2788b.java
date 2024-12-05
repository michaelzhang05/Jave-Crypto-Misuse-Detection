package e3;

import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2788b implements y2.f {
    public static final Parcelable.Creator<C2788b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f31417a;

    /* renamed from: e3.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2788b createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3255y.i(parcel, "parcel");
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
            return new C2788b(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2788b[] newArray(int i8) {
            return new C2788b[i8];
        }
    }

    public C2788b(Map statuses) {
        AbstractC3255y.i(statuses, "statuses");
        this.f31417a = statuses;
    }

    public final /* synthetic */ boolean a(com.stripe.android.view.r bank) {
        AbstractC3255y.i(bank, "bank");
        Boolean bool = (Boolean) this.f31417a.get(bank.getId());
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
        if ((obj instanceof C2788b) && AbstractC3255y.d(this.f31417a, ((C2788b) obj).f31417a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31417a.hashCode();
    }

    public String toString() {
        return "BankStatuses(statuses=" + this.f31417a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        Map map = this.f31417a;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ C2788b(Map map, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Q.h() : map);
    }
}
