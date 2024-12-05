package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f3784d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f3785e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3786f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3787g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3788h;

    /* renamed from: i, reason: collision with root package name */
    private int f3789i;

    /* renamed from: j, reason: collision with root package name */
    private int f3790j;

    /* renamed from: k, reason: collision with root package name */
    private int f3791k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l.a(), new l.a(), new l.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f3785e.writeInt(-1);
        } else {
            this.f3785e.writeInt(bArr.length);
            this.f3785e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3785e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i6) {
        this.f3785e.writeInt(i6);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f3785e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f3785e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i6 = this.f3789i;
        if (i6 >= 0) {
            int i7 = this.f3784d.get(i6);
            int dataPosition = this.f3785e.dataPosition();
            this.f3785e.setDataPosition(i7);
            this.f3785e.writeInt(dataPosition - i7);
            this.f3785e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f3785e;
        int dataPosition = parcel.dataPosition();
        int i6 = this.f3790j;
        if (i6 == this.f3786f) {
            i6 = this.f3787g;
        }
        return new b(parcel, dataPosition, i6, this.f3788h + "  ", this.f3781a, this.f3782b, this.f3783c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f3785e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f3785e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3785e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3785e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i6) {
        while (this.f3790j < this.f3787g) {
            int i7 = this.f3791k;
            if (i7 == i6) {
                return true;
            }
            if (String.valueOf(i7).compareTo(String.valueOf(i6)) > 0) {
                return false;
            }
            this.f3785e.setDataPosition(this.f3790j);
            int readInt = this.f3785e.readInt();
            this.f3791k = this.f3785e.readInt();
            this.f3790j += readInt;
        }
        return this.f3791k == i6;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f3785e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f3785e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f3785e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i6) {
        a();
        this.f3789i = i6;
        this.f3784d.put(i6, this.f3785e.dataPosition());
        E(0);
        E(i6);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z5) {
        this.f3785e.writeInt(z5 ? 1 : 0);
    }

    private b(Parcel parcel, int i6, int i7, String str, l.a aVar, l.a aVar2, l.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3784d = new SparseIntArray();
        this.f3789i = -1;
        this.f3791k = -1;
        this.f3785e = parcel;
        this.f3786f = i6;
        this.f3787g = i7;
        this.f3790j = i6;
        this.f3788h = str;
    }
}
