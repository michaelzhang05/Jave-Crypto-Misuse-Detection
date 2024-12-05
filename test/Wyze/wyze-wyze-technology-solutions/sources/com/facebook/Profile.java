package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import com.facebook.internal.x;
import com.facebook.internal.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Profile implements Parcelable {

    /* renamed from: g, reason: collision with root package name */
    private final String f9022g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9023h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9024i;

    /* renamed from: j, reason: collision with root package name */
    private final String f9025j;

    /* renamed from: k, reason: collision with root package name */
    private final String f9026k;
    private final Uri l;

    /* renamed from: f, reason: collision with root package name */
    private static final String f9021f = Profile.class.getSimpleName();
    public static final Parcelable.Creator<Profile> CREATOR = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements x.c {
        a() {
        }

        @Override // com.facebook.internal.x.c
        public void a(JSONObject jSONObject) {
            String optString = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.ID);
            if (optString == null) {
                return;
            }
            String optString2 = jSONObject.optString("link");
            Profile.d(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null));
        }

        @Override // com.facebook.internal.x.c
        public void b(FacebookException facebookException) {
            Log.e(Profile.f9021f, "Got unexpected exception: " + facebookException);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Parcelable.Creator<Profile> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Profile[] newArray(int i2) {
            return new Profile[i2];
        }
    }

    /* synthetic */ Profile(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static void b() {
        AccessToken g2 = AccessToken.g();
        if (!AccessToken.t()) {
            d(null);
        } else {
            x.y(g2.r(), new a());
        }
    }

    public static Profile c() {
        return n.b().a();
    }

    public static void d(Profile profile) {
        n.b().e(profile);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.ID, this.f9022g);
            jSONObject.put("first_name", this.f9023h);
            jSONObject.put("middle_name", this.f9024i);
            jSONObject.put("last_name", this.f9025j);
            jSONObject.put("name", this.f9026k);
            Uri uri = this.l;
            if (uri == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", uri.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (this.f9022g.equals(profile.f9022g) && this.f9023h == null) {
            if (profile.f9023h == null) {
                return true;
            }
        } else if (this.f9023h.equals(profile.f9023h) && this.f9024i == null) {
            if (profile.f9024i == null) {
                return true;
            }
        } else if (this.f9024i.equals(profile.f9024i) && this.f9025j == null) {
            if (profile.f9025j == null) {
                return true;
            }
        } else if (this.f9025j.equals(profile.f9025j) && this.f9026k == null) {
            if (profile.f9026k == null) {
                return true;
            }
        } else {
            if (!this.f9026k.equals(profile.f9026k) || this.l != null) {
                return this.l.equals(profile.l);
            }
            if (profile.l == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = 527 + this.f9022g.hashCode();
        String str = this.f9023h;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.f9024i;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f9025j;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f9026k;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.l;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f9022g);
        parcel.writeString(this.f9023h);
        parcel.writeString(this.f9024i);
        parcel.writeString(this.f9025j);
        parcel.writeString(this.f9026k);
        Uri uri = this.l;
        parcel.writeString(uri == null ? null : uri.toString());
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        y.j(str, DeepLinkIntentReceiver.DeepLinksKeys.ID);
        this.f9022g = str;
        this.f9023h = str2;
        this.f9024i = str3;
        this.f9025j = str4;
        this.f9026k = str5;
        this.l = uri;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Profile(JSONObject jSONObject) {
        this.f9022g = jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.ID, null);
        this.f9023h = jSONObject.optString("first_name", null);
        this.f9024i = jSONObject.optString("middle_name", null);
        this.f9025j = jSONObject.optString("last_name", null);
        this.f9026k = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.l = optString != null ? Uri.parse(optString) : null;
    }

    private Profile(Parcel parcel) {
        this.f9022g = parcel.readString();
        this.f9023h = parcel.readString();
        this.f9024i = parcel.readString();
        this.f9025j = parcel.readString();
        this.f9026k = parcel.readString();
        String readString = parcel.readString();
        this.l = readString == null ? null : Uri.parse(readString);
    }
}
