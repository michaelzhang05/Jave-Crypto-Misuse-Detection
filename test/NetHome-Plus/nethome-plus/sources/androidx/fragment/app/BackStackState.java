package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.m;
import androidx.lifecycle.f;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    final int[] f1088f;

    /* renamed from: g, reason: collision with root package name */
    final ArrayList<String> f1089g;

    /* renamed from: h, reason: collision with root package name */
    final int[] f1090h;

    /* renamed from: i, reason: collision with root package name */
    final int[] f1091i;

    /* renamed from: j, reason: collision with root package name */
    final int f1092j;

    /* renamed from: k, reason: collision with root package name */
    final int f1093k;
    final String l;
    final int m;
    final int n;
    final CharSequence o;
    final int p;
    final CharSequence q;
    final ArrayList<String> r;
    final ArrayList<String> s;
    final boolean t;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    }

    public BackStackState(androidx.fragment.app.a aVar) {
        int size = aVar.a.size();
        this.f1088f = new int[size * 5];
        if (aVar.f1168h) {
            this.f1089g = new ArrayList<>(size);
            this.f1090h = new int[size];
            this.f1091i = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                m.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.f1088f[i3] = aVar2.a;
                ArrayList<String> arrayList = this.f1089g;
                Fragment fragment = aVar2.f1172b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f1088f;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1173c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1174d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f1175e;
                iArr[i7] = aVar2.f1176f;
                this.f1090h[i2] = aVar2.f1177g.ordinal();
                this.f1091i[i2] = aVar2.f1178h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f1092j = aVar.f1166f;
            this.f1093k = aVar.f1167g;
            this.l = aVar.f1170j;
            this.m = aVar.u;
            this.n = aVar.f1171k;
            this.o = aVar.l;
            this.p = aVar.m;
            this.q = aVar.n;
            this.r = aVar.o;
            this.s = aVar.p;
            this.t = aVar.q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public androidx.fragment.app.a a(i iVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(iVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f1088f.length) {
            m.a aVar2 = new m.a();
            int i4 = i2 + 1;
            aVar2.a = this.f1088f[i2];
            if (i.f1127h) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f1088f[i4]);
            }
            String str = this.f1089g.get(i3);
            if (str != null) {
                aVar2.f1172b = iVar.o.get(str);
            } else {
                aVar2.f1172b = null;
            }
            aVar2.f1177g = f.b.values()[this.f1090h[i3]];
            aVar2.f1178h = f.b.values()[this.f1091i[i3]];
            int[] iArr = this.f1088f;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.f1173c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.f1174d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f1175e = i10;
            int i11 = iArr[i9];
            aVar2.f1176f = i11;
            aVar.f1162b = i6;
            aVar.f1163c = i8;
            aVar.f1164d = i10;
            aVar.f1165e = i11;
            aVar.e(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f1166f = this.f1092j;
        aVar.f1167g = this.f1093k;
        aVar.f1170j = this.l;
        aVar.u = this.m;
        aVar.f1168h = true;
        aVar.f1171k = this.n;
        aVar.l = this.o;
        aVar.m = this.p;
        aVar.n = this.q;
        aVar.o = this.r;
        aVar.p = this.s;
        aVar.q = this.t;
        aVar.t(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1088f);
        parcel.writeStringList(this.f1089g);
        parcel.writeIntArray(this.f1090h);
        parcel.writeIntArray(this.f1091i);
        parcel.writeInt(this.f1092j);
        parcel.writeInt(this.f1093k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeInt(this.p);
        TextUtils.writeToParcel(this.q, parcel, 0);
        parcel.writeStringList(this.r);
        parcel.writeStringList(this.s);
        parcel.writeInt(this.t ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f1088f = parcel.createIntArray();
        this.f1089g = parcel.createStringArrayList();
        this.f1090h = parcel.createIntArray();
        this.f1091i = parcel.createIntArray();
        this.f1092j = parcel.readInt();
        this.f1093k = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.p = parcel.readInt();
        this.q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.r = parcel.createStringArrayList();
        this.s = parcel.createStringArrayList();
        this.t = parcel.readInt() != 0;
    }
}
