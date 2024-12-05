package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zan();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10960f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f10961g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final ArrayList<zal> f10962h = null;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10963i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.f10960f = i2;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zal zalVar = arrayList.get(i3);
            String str2 = zalVar.f10965g;
            HashMap hashMap2 = new HashMap();
            int size2 = zalVar.f10966h.size();
            for (int i4 = 0; i4 < size2; i4++) {
                zam zamVar = zalVar.f10966h.get(i4);
                hashMap2.put(zamVar.f10968g, zamVar.f10969h);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f10961g = hashMap;
        this.f10963i = (String) Preconditions.j(str);
        w();
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> D(String str) {
        return this.f10961g.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f10961g.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f10961g.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void w() {
        Iterator<String> it = this.f10961g.keySet().iterator();
        while (it.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f10961g.get(it.next());
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).q0(this);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10960f);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f10961g.keySet()) {
            arrayList.add(new zal(str, this.f10961g.get(str)));
        }
        SafeParcelWriter.u(parcel, 2, arrayList, false);
        SafeParcelWriter.q(parcel, 3, this.f10963i, false);
        SafeParcelWriter.b(parcel, a);
    }

    public final String z() {
        return this.f10963i;
    }
}
