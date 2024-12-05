package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@KeepName
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zac();

    /* renamed from: f, reason: collision with root package name */
    private static final Builder f10782f = new a(new String[0], null);

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10783g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String[] f10784h;

    /* renamed from: i, reason: collision with root package name */
    private Bundle f10785i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final CursorWindow[] f10786j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10787k;

    @SafeParcelable.Field
    private final Bundle l;
    private int[] m;
    private int n;
    private boolean o = false;
    private boolean p = true;

    /* loaded from: classes2.dex */
    public static class zaa extends RuntimeException {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.f10783g = i2;
        this.f10784h = strArr;
        this.f10786j = cursorWindowArr;
        this.f10787k = i3;
        this.l = bundle;
    }

    private final void P(String str, int i2) {
        Bundle bundle = this.f10785i;
        if (bundle != null && bundle.containsKey(str)) {
            if (!isClosed()) {
                if (i2 < 0 || i2 >= this.n) {
                    throw new CursorIndexOutOfBoundsException(i2, this.n);
                }
                return;
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
    }

    @KeepForSdk
    public final int D() {
        return this.f10787k;
    }

    @KeepForSdk
    public final String J(String str, int i2, int i3) {
        P(str, i2);
        return this.f10786j[i3].getString(i2, this.f10785i.getInt(str));
    }

    @KeepForSdk
    public final int L(int i2) {
        int[] iArr;
        int i3 = 0;
        Preconditions.l(i2 >= 0 && i2 < this.n);
        while (true) {
            iArr = this.m;
            if (i3 >= iArr.length) {
                break;
            }
            if (i2 < iArr[i3]) {
                i3--;
                break;
            }
            i3++;
        }
        return i3 == iArr.length ? i3 - 1 : i3;
    }

    public final void Y() {
        this.f10785i = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.f10784h;
            if (i3 >= strArr.length) {
                break;
            }
            this.f10785i.putInt(strArr[i3], i3);
            i3++;
        }
        this.m = new int[this.f10786j.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f10786j;
            if (i2 < cursorWindowArr.length) {
                this.m[i2] = i4;
                i4 += this.f10786j[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
                i2++;
            } else {
                this.n = i4;
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.o) {
                this.o = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f10786j;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.p && this.f10786j.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public final int getCount() {
        return this.n;
    }

    @KeepForSdk
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.o;
        }
        return z;
    }

    @KeepForSdk
    public final byte[] w(String str, int i2, int i3) {
        P(str, i2);
        return this.f10786j[i3].getBlob(i2, this.f10785i.getInt(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.r(parcel, 1, this.f10784h, false);
        SafeParcelWriter.t(parcel, 2, this.f10786j, i2, false);
        SafeParcelWriter.i(parcel, 3, D());
        SafeParcelWriter.d(parcel, 4, z(), false);
        SafeParcelWriter.i(parcel, 1000, this.f10783g);
        SafeParcelWriter.b(parcel, a);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    @KeepForSdk
    public final Bundle z() {
        return this.l;
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder {
        private final String[] a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f10788b;

        /* renamed from: c, reason: collision with root package name */
        private final String f10789c;

        /* renamed from: d, reason: collision with root package name */
        private final HashMap<Object, Integer> f10790d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f10791e;

        /* renamed from: f, reason: collision with root package name */
        private String f10792f;

        private Builder(String[] strArr, String str) {
            this.a = (String[]) Preconditions.j(strArr);
            this.f10788b = new ArrayList<>();
            this.f10789c = str;
            this.f10790d = new HashMap<>();
            this.f10791e = false;
            this.f10792f = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ Builder(String[] strArr, String str, a aVar) {
            this(strArr, null);
        }
    }
}
