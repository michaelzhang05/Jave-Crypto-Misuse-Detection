package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.pt.dataprovider.BuildConfig;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new zzc();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10372f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10373g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final Uri f10374h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final List<IdToken> f10375i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10376j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10377k;

    @SafeParcelable.Field
    private final String l;

    @SafeParcelable.Field
    private final String m;

    /* loaded from: classes2.dex */
    public static class Builder {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public Credential(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) Uri uri, @SafeParcelable.Param(id = 4) List<IdToken> list, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 9) String str5, @SafeParcelable.Param(id = 10) String str6) {
        List<IdToken> unmodifiableList;
        String trim = ((String) Preconditions.k(str, "credential identifier cannot be null")).trim();
        Preconditions.h(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(parse.getScheme()))) {
                    z = true;
                }
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f10373g = str2;
        this.f10374h = uri;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f10375i = unmodifiableList;
        this.f10372f = trim;
        this.f10376j = str3;
        this.f10377k = str4;
        this.l = str5;
        this.m = str6;
    }

    public String D() {
        return this.l;
    }

    public String J() {
        return this.f10372f;
    }

    public List<IdToken> L() {
        return this.f10375i;
    }

    public String P() {
        return this.f10373g;
    }

    public String Y() {
        return this.f10376j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f10372f, credential.f10372f) && TextUtils.equals(this.f10373g, credential.f10373g) && Objects.a(this.f10374h, credential.f10374h) && TextUtils.equals(this.f10376j, credential.f10376j) && TextUtils.equals(this.f10377k, credential.f10377k);
    }

    public int hashCode() {
        return Objects.b(this.f10372f, this.f10373g, this.f10374h, this.f10376j, this.f10377k);
    }

    public Uri i0() {
        return this.f10374h;
    }

    public String w() {
        return this.f10377k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, J(), false);
        SafeParcelWriter.q(parcel, 2, P(), false);
        SafeParcelWriter.o(parcel, 3, i0(), i2, false);
        SafeParcelWriter.u(parcel, 4, L(), false);
        SafeParcelWriter.q(parcel, 5, Y(), false);
        SafeParcelWriter.q(parcel, 6, w(), false);
        SafeParcelWriter.q(parcel, 9, D(), false);
        SafeParcelWriter.q(parcel, 10, z(), false);
        SafeParcelWriter.b(parcel, a);
    }

    public String z() {
        return this.m;
    }
}
