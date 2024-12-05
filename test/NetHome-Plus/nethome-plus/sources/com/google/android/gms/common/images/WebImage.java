package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zae();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10798f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final Uri f10799g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10800h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10801i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i4) {
        this.f10798f = i2;
        this.f10799g = uri;
        this.f10800h = i3;
        this.f10801i = i4;
    }

    public final int D() {
        return this.f10800h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.a(this.f10799g, webImage.f10799g) && this.f10800h == webImage.f10800h && this.f10801i == webImage.f10801i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f10799g, Integer.valueOf(this.f10800h), Integer.valueOf(this.f10801i));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f10800h), Integer.valueOf(this.f10801i), this.f10799g.toString());
    }

    public final int w() {
        return this.f10801i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10798f);
        SafeParcelWriter.o(parcel, 2, z(), i2, false);
        SafeParcelWriter.i(parcel, 3, D());
        SafeParcelWriter.i(parcel, 4, w());
        SafeParcelWriter.b(parcel, a);
    }

    public final Uri z() {
        return this.f10799g;
    }
}
