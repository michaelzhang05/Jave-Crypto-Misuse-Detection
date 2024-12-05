package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
class a extends VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f1733d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f1734e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1735f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1736g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1737h;

    /* renamed from: i, reason: collision with root package name */
    private int f1738i;

    /* renamed from: j, reason: collision with root package name */
    private int f1739j;

    /* renamed from: k, reason: collision with root package name */
    private int f1740k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), HttpUrl.FRAGMENT_ENCODE_SET, new c.e.a(), new c.e.a(), new c.e.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f1734e.writeInt(bArr.length);
            this.f1734e.writeByteArray(bArr);
        } else {
            this.f1734e.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1734e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i2) {
        this.f1734e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f1734e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f1734e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i2 = this.f1738i;
        if (i2 >= 0) {
            int i3 = this.f1733d.get(i2);
            int dataPosition = this.f1734e.dataPosition();
            this.f1734e.setDataPosition(i3);
            this.f1734e.writeInt(dataPosition - i3);
            this.f1734e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f1734e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1739j;
        if (i2 == this.f1735f) {
            i2 = this.f1736g;
        }
        return new a(parcel, dataPosition, i2, this.f1737h + "  ", this.a, this.f1731b, this.f1732c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f1734e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int readInt = this.f1734e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1734e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1734e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i2) {
        while (this.f1739j < this.f1736g) {
            int i3 = this.f1740k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1734e.setDataPosition(this.f1739j);
            int readInt = this.f1734e.readInt();
            this.f1740k = this.f1734e.readInt();
            this.f1739j += readInt;
        }
        return this.f1740k == i2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f1734e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f1734e.readParcelable(a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f1734e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i2) {
        a();
        this.f1738i = i2;
        this.f1733d.put(i2, this.f1734e.dataPosition());
        E(0);
        E(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z) {
        this.f1734e.writeInt(z ? 1 : 0);
    }

    private a(Parcel parcel, int i2, int i3, String str, c.e.a<String, Method> aVar, c.e.a<String, Method> aVar2, c.e.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1733d = new SparseIntArray();
        this.f1738i = -1;
        this.f1739j = 0;
        this.f1740k = -1;
        this.f1734e = parcel;
        this.f1735f = i2;
        this.f1736g = i3;
        this.f1739j = i2;
        this.f1737h = str;
    }
}
