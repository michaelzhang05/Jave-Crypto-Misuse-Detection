package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zac();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10929f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, Integer> f10930g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseArray<String> f10931h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final ArrayList<zaa> f10932i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<zaa> arrayList) {
        this.f10929f = i2;
        this.f10930g = new HashMap<>();
        this.f10931h = new SparseArray<>();
        this.f10932i = null;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            zaa zaaVar = arrayList.get(i3);
            i3++;
            zaa zaaVar2 = zaaVar;
            w(zaaVar2.f10934g, zaaVar2.f10935h);
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* synthetic */ String a(Integer num) {
        String str = this.f10931h.get(num.intValue());
        return (str == null && this.f10930g.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @KeepForSdk
    public final StringToIntConverter w(String str, int i2) {
        this.f10930g.put(str, Integer.valueOf(i2));
        this.f10931h.put(i2, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10929f);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f10930g.keySet()) {
            arrayList.add(new zaa(str, this.f10930g.get(str).intValue()));
        }
        SafeParcelWriter.u(parcel, 2, arrayList, false);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Class
    /* loaded from: classes2.dex */
    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new zad();

        /* renamed from: f, reason: collision with root package name */
        @SafeParcelable.VersionField
        private final int f10933f;

        /* renamed from: g, reason: collision with root package name */
        @SafeParcelable.Field
        final String f10934g;

        /* renamed from: h, reason: collision with root package name */
        @SafeParcelable.Field
        final int f10935h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @SafeParcelable.Constructor
        public zaa(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3) {
            this.f10933f = i2;
            this.f10934g = str;
            this.f10935h = i3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            int a = SafeParcelWriter.a(parcel);
            SafeParcelWriter.i(parcel, 1, this.f10933f);
            SafeParcelWriter.q(parcel, 2, this.f10934g, false);
            SafeParcelWriter.i(parcel, 3, this.f10935h);
            SafeParcelWriter.b(parcel, a);
        }

        zaa(String str, int i2) {
            this.f10933f = 1;
            this.f10934g = str;
            this.f10935h = i2;
        }
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.f10929f = 1;
        this.f10930g = new HashMap<>();
        this.f10931h = new SparseArray<>();
        this.f10932i = null;
    }
}
