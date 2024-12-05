package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.e0;
import androidx.lifecycle.h;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f2727a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f2728b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f2729c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f2730d;

    /* renamed from: e, reason: collision with root package name */
    final int f2731e;

    /* renamed from: f, reason: collision with root package name */
    final String f2732f;

    /* renamed from: g, reason: collision with root package name */
    final int f2733g;

    /* renamed from: h, reason: collision with root package name */
    final int f2734h;

    /* renamed from: i, reason: collision with root package name */
    final CharSequence f2735i;

    /* renamed from: j, reason: collision with root package name */
    final int f2736j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f2737k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f2738l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList f2739m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f2740n;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i6) {
            return new b[i6];
        }
    }

    b(Parcel parcel) {
        this.f2727a = parcel.createIntArray();
        this.f2728b = parcel.createStringArrayList();
        this.f2729c = parcel.createIntArray();
        this.f2730d = parcel.createIntArray();
        this.f2731e = parcel.readInt();
        this.f2732f = parcel.readString();
        this.f2733g = parcel.readInt();
        this.f2734h = parcel.readInt();
        this.f2735i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2736j = parcel.readInt();
        this.f2737k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2738l = parcel.createStringArrayList();
        this.f2739m = parcel.createStringArrayList();
        this.f2740n = parcel.readInt() != 0;
    }

    private void a(androidx.fragment.app.a aVar) {
        int i6 = 0;
        int i7 = 0;
        while (true) {
            boolean z5 = true;
            if (i6 >= this.f2727a.length) {
                aVar.f2843h = this.f2731e;
                aVar.f2846k = this.f2732f;
                aVar.f2844i = true;
                aVar.f2847l = this.f2734h;
                aVar.f2848m = this.f2735i;
                aVar.f2849n = this.f2736j;
                aVar.f2850o = this.f2737k;
                aVar.f2851p = this.f2738l;
                aVar.f2852q = this.f2739m;
                aVar.f2853r = this.f2740n;
                return;
            }
            e0.a aVar2 = new e0.a();
            int i8 = i6 + 1;
            aVar2.f2855a = this.f2727a[i6];
            if (w.H0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i7 + " base fragment #" + this.f2727a[i8]);
            }
            aVar2.f2862h = h.b.values()[this.f2729c[i7]];
            aVar2.f2863i = h.b.values()[this.f2730d[i7]];
            int[] iArr = this.f2727a;
            int i9 = i8 + 1;
            if (iArr[i8] == 0) {
                z5 = false;
            }
            aVar2.f2857c = z5;
            int i10 = i9 + 1;
            int i11 = iArr[i9];
            aVar2.f2858d = i11;
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            aVar2.f2859e = i13;
            int i14 = i12 + 1;
            int i15 = iArr[i12];
            aVar2.f2860f = i15;
            int i16 = iArr[i14];
            aVar2.f2861g = i16;
            aVar.f2839d = i11;
            aVar.f2840e = i13;
            aVar.f2841f = i15;
            aVar.f2842g = i16;
            aVar.e(aVar2);
            i7++;
            i6 = i14 + 1;
        }
    }

    public androidx.fragment.app.a b(w wVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(wVar);
        a(aVar);
        aVar.f2725v = this.f2733g;
        for (int i6 = 0; i6 < this.f2728b.size(); i6++) {
            String str = (String) this.f2728b.get(i6);
            if (str != null) {
                ((e0.a) aVar.f2838c.get(i6)).f2856b = wVar.f0(str);
            }
        }
        aVar.p(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeIntArray(this.f2727a);
        parcel.writeStringList(this.f2728b);
        parcel.writeIntArray(this.f2729c);
        parcel.writeIntArray(this.f2730d);
        parcel.writeInt(this.f2731e);
        parcel.writeString(this.f2732f);
        parcel.writeInt(this.f2733g);
        parcel.writeInt(this.f2734h);
        TextUtils.writeToParcel(this.f2735i, parcel, 0);
        parcel.writeInt(this.f2736j);
        TextUtils.writeToParcel(this.f2737k, parcel, 0);
        parcel.writeStringList(this.f2738l);
        parcel.writeStringList(this.f2739m);
        parcel.writeInt(this.f2740n ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2838c.size();
        this.f2727a = new int[size * 6];
        if (!aVar.f2844i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2728b = new ArrayList(size);
        this.f2729c = new int[size];
        this.f2730d = new int[size];
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            e0.a aVar2 = (e0.a) aVar.f2838c.get(i6);
            int i8 = i7 + 1;
            this.f2727a[i7] = aVar2.f2855a;
            ArrayList arrayList = this.f2728b;
            Fragment fragment = aVar2.f2856b;
            arrayList.add(fragment != null ? fragment.f2658f : null);
            int[] iArr = this.f2727a;
            int i9 = i8 + 1;
            iArr[i8] = aVar2.f2857c ? 1 : 0;
            int i10 = i9 + 1;
            iArr[i9] = aVar2.f2858d;
            int i11 = i10 + 1;
            iArr[i10] = aVar2.f2859e;
            int i12 = i11 + 1;
            iArr[i11] = aVar2.f2860f;
            iArr[i12] = aVar2.f2861g;
            this.f2729c[i6] = aVar2.f2862h.ordinal();
            this.f2730d[i6] = aVar2.f2863i.ordinal();
            i6++;
            i7 = i12 + 1;
        }
        this.f2731e = aVar.f2843h;
        this.f2732f = aVar.f2846k;
        this.f2733g = aVar.f2725v;
        this.f2734h = aVar.f2847l;
        this.f2735i = aVar.f2848m;
        this.f2736j = aVar.f2849n;
        this.f2737k = aVar.f2850o;
        this.f2738l = aVar.f2851p;
        this.f2739m = aVar.f2852q;
        this.f2740n = aVar.f2853r;
    }
}
