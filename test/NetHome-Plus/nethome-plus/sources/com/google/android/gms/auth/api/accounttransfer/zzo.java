package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: f, reason: collision with root package name */
    private static final c.e.a<String, FastJsonResponse.Field<?, ?>> f10354f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10355g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private List<String> f10356h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private List<String> f10357i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private List<String> f10358j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private List<String> f10359k;

    @SafeParcelable.Field
    private List<String> l;

    static {
        c.e.a<String, FastJsonResponse.Field<?, ?>> aVar = new c.e.a<>();
        f10354f = aVar;
        aVar.put("registered", FastJsonResponse.Field.P("registered", 2));
        aVar.put("in_progress", FastJsonResponse.Field.P("in_progress", 3));
        aVar.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, FastJsonResponse.Field.P(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, 4));
        aVar.put("failed", FastJsonResponse.Field.P("failed", 5));
        aVar.put("escrowed", FastJsonResponse.Field.P("escrowed", 6));
    }

    public zzo() {
        this.f10355g = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Map<String, FastJsonResponse.Field<?, ?>> a() {
        return f10354f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object b(FastJsonResponse.Field field) {
        switch (field.Y()) {
            case 1:
                return Integer.valueOf(this.f10355g);
            case 2:
                return this.f10356h;
            case 3:
                return this.f10357i;
            case 4:
                return this.f10358j;
            case 5:
                return this.f10359k;
            case 6:
                return this.l;
            default:
                int Y = field.Y();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(Y);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean d(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10355g);
        SafeParcelWriter.s(parcel, 2, this.f10356h, false);
        SafeParcelWriter.s(parcel, 3, this.f10357i, false);
        SafeParcelWriter.s(parcel, 4, this.f10358j, false);
        SafeParcelWriter.s(parcel, 5, this.f10359k, false);
        SafeParcelWriter.s(parcel, 6, this.l, false);
        SafeParcelWriter.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) List<String> list, @SafeParcelable.Param(id = 3) List<String> list2, @SafeParcelable.Param(id = 4) List<String> list3, @SafeParcelable.Param(id = 5) List<String> list4, @SafeParcelable.Param(id = 6) List<String> list5) {
        this.f10355g = i2;
        this.f10356h = list;
        this.f10357i = list2;
        this.f10358j = list3;
        this.f10359k = list4;
        this.l = list5;
    }
}
