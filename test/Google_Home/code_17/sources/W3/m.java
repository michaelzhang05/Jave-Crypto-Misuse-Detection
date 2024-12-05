package W3;

import W3.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import c4.C2045c;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m implements q, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private p f11656a;

    /* renamed from: b, reason: collision with root package name */
    private d f11657b;

    /* renamed from: c, reason: collision with root package name */
    private o f11658c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f11659d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f11660e;

    /* renamed from: f, reason: collision with root package name */
    private String f11661f;

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

    private boolean l(m mVar) {
        if (C2045c.a(this.f11656a, mVar.f11656a) && C2045c.a(this.f11661f, mVar.f11661f) && C2045c.a(this.f11657b, mVar.f11657b) && C2045c.a(this.f11658c, mVar.f11658c) && C2045c.a(this.f11659d, mVar.f11659d) && C2045c.a(this.f11660e, mVar.f11660e)) {
            return true;
        }
        return false;
    }

    @Override // W3.q
    public d a() {
        return this.f11657b;
    }

    @Override // W3.q
    public o b() {
        return this.f11658c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof m) || !l((m) obj))) {
            return false;
        }
        return true;
    }

    @Override // W3.q
    public b g(q.a aVar) {
        return (b) this.f11659d.get(aVar);
    }

    @Override // W3.q
    public String h() {
        return this.f11661f;
    }

    public int hashCode() {
        return C2045c.b(this.f11656a, this.f11661f, this.f11657b, this.f11658c, this.f11659d, this.f11660e);
    }

    public p i() {
        return this.f11656a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f11661f);
        parcel.writeParcelable((k) this.f11656a, 0);
        parcel.writeParcelable((g) this.f11657b, 0);
        parcel.writeParcelable((i) this.f11658c, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f11659d.entrySet()) {
            bundle.putParcelable(((q.a) entry.getKey()).name(), (e) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry2 : this.f11660e.entrySet()) {
            bundle2.putParcelable((String) entry2.getKey(), (e) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public m() {
        this.f11659d = new EnumMap(q.a.class);
        this.f11660e = new HashMap();
    }

    private m(Parcel parcel) {
        this.f11661f = parcel.readString();
        this.f11656a = (p) parcel.readParcelable(k.class.getClassLoader());
        this.f11657b = (d) parcel.readParcelable(g.class.getClassLoader());
        this.f11658c = (o) parcel.readParcelable(i.class.getClassLoader());
        this.f11659d = new HashMap();
        Bundle readBundle = parcel.readBundle(m.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                b bVar = (b) BundleCompat.getParcelable(readBundle, str, b.class);
                if (bVar != null) {
                    this.f11659d.put(q.a.valueOf(str), bVar);
                }
            }
        }
        this.f11660e = new HashMap();
        Bundle readBundle2 = parcel.readBundle(m.class.getClassLoader());
        if (readBundle2 != null) {
            for (String str2 : readBundle2.keySet()) {
                b bVar2 = (b) BundleCompat.getParcelable(readBundle2, str2, b.class);
                if (bVar2 != null) {
                    this.f11660e.put(str2, bVar2);
                }
            }
        }
    }
}
