package T3;

import T3.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m implements q, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private p f9999a;

    /* renamed from: b, reason: collision with root package name */
    private d f10000b;

    /* renamed from: c, reason: collision with root package name */
    private o f10001c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f10002d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f10003e;

    /* renamed from: f, reason: collision with root package name */
    private String f10004f;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i8) {
            return new m[i8];
        }
    }

    private boolean j(m mVar) {
        if (Z3.c.a(this.f9999a, mVar.f9999a) && Z3.c.a(this.f10004f, mVar.f10004f) && Z3.c.a(this.f10000b, mVar.f10000b) && Z3.c.a(this.f10001c, mVar.f10001c) && Z3.c.a(this.f10002d, mVar.f10002d) && Z3.c.a(this.f10003e, mVar.f10003e)) {
            return true;
        }
        return false;
    }

    @Override // T3.q
    public b b(q.a aVar) {
        return (b) this.f10002d.get(aVar);
    }

    @Override // T3.q
    public d c() {
        return this.f10000b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // T3.q
    public o e() {
        return this.f10001c;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof m) || !j((m) obj))) {
            return false;
        }
        return true;
    }

    @Override // T3.q
    public String f() {
        return this.f10004f;
    }

    public int hashCode() {
        return Z3.c.b(this.f9999a, this.f10004f, this.f10000b, this.f10001c, this.f10002d, this.f10003e);
    }

    public p i() {
        return this.f9999a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f10004f);
        parcel.writeParcelable((k) this.f9999a, 0);
        parcel.writeParcelable((g) this.f10000b, 0);
        parcel.writeParcelable((i) this.f10001c, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f10002d.entrySet()) {
            bundle.putParcelable(((q.a) entry.getKey()).name(), (e) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry2 : this.f10003e.entrySet()) {
            bundle2.putParcelable((String) entry2.getKey(), (e) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public m() {
        this.f10002d = new EnumMap(q.a.class);
        this.f10003e = new HashMap();
    }

    private m(Parcel parcel) {
        this.f10004f = parcel.readString();
        this.f9999a = (p) parcel.readParcelable(k.class.getClassLoader());
        this.f10000b = (d) parcel.readParcelable(g.class.getClassLoader());
        this.f10001c = (o) parcel.readParcelable(i.class.getClassLoader());
        this.f10002d = new HashMap();
        Bundle readBundle = parcel.readBundle(m.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                b bVar = (b) BundleCompat.getParcelable(readBundle, str, b.class);
                if (bVar != null) {
                    this.f10002d.put(q.a.valueOf(str), bVar);
                }
            }
        }
        this.f10003e = new HashMap();
        Bundle readBundle2 = parcel.readBundle(m.class.getClassLoader());
        if (readBundle2 != null) {
            for (String str2 : readBundle2.keySet()) {
                b bVar2 = (b) BundleCompat.getParcelable(readBundle2, str2, b.class);
                if (bVar2 != null) {
                    this.f10003e.put(str2, bVar2);
                }
            }
        }
    }
}
