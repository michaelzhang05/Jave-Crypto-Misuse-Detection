package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.x;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {

    /* renamed from: g, reason: collision with root package name */
    private final b f8990g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8991h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8992i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8993j;

    /* renamed from: k, reason: collision with root package name */
    private final String f8994k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final JSONObject p;
    private final JSONObject q;
    private final Object r;
    private final HttpURLConnection s;
    private final FacebookException t;

    /* renamed from: f, reason: collision with root package name */
    static final c f8989f = new c(200, 299, null);
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new a();

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<FacebookRequestError> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int i2) {
            return new FacebookRequestError[i2];
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* loaded from: classes.dex */
    private static class c {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8999b;

        /* synthetic */ c(int i2, int i3, a aVar) {
            this(i2, i3);
        }

        boolean a(int i2) {
            return this.a <= i2 && i2 <= this.f8999b;
        }

        private c(int i2, int i3) {
            this.a = i2;
            this.f8999b = i3;
        }
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FacebookRequestError a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        int optInt;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        int i2;
        try {
            if (jSONObject.has("code")) {
                int i3 = jSONObject.getInt("code");
                Object D = x.D(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (D != null && (D instanceof JSONObject)) {
                    JSONObject jSONObject2 = (JSONObject) D;
                    boolean z2 = false;
                    if (jSONObject2.has("error")) {
                        JSONObject jSONObject3 = (JSONObject) x.D(jSONObject2, "error", null);
                        String optString = jSONObject3.optString("type", null);
                        String optString2 = jSONObject3.optString("message", null);
                        i2 = jSONObject3.optInt("code", -1);
                        int optInt2 = jSONObject3.optInt("error_subcode", -1);
                        str3 = jSONObject3.optString("error_user_msg", null);
                        str4 = jSONObject3.optString("error_user_title", null);
                        z = jSONObject3.optBoolean("is_transient", false);
                        str = optString;
                        z2 = true;
                        str2 = optString2;
                        optInt = optInt2;
                    } else {
                        if (!jSONObject2.has("error_code") && !jSONObject2.has("error_msg") && !jSONObject2.has("error_reason")) {
                            str = null;
                            str2 = null;
                            str3 = null;
                            str4 = null;
                            i2 = -1;
                            optInt = -1;
                            z = false;
                        }
                        String optString3 = jSONObject2.optString("error_reason", null);
                        String optString4 = jSONObject2.optString("error_msg", null);
                        int optInt3 = jSONObject2.optInt("error_code", -1);
                        optInt = jSONObject2.optInt("error_subcode", -1);
                        str = optString3;
                        str2 = optString4;
                        str3 = null;
                        str4 = null;
                        z2 = true;
                        z = false;
                        i2 = optInt3;
                    }
                    if (z2) {
                        return new FacebookRequestError(i3, i2, optInt, str, str2, str4, str3, z, jSONObject2, jSONObject, obj, httpURLConnection, null);
                    }
                }
                if (!f8989f.a(i3)) {
                    return new FacebookRequestError(i3, -1, -1, null, null, null, null, false, jSONObject.has("body") ? (JSONObject) x.D(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    static synchronized com.facebook.internal.h b() {
        synchronized (FacebookRequestError.class) {
            com.facebook.internal.m j2 = com.facebook.internal.n.j(f.f());
            if (j2 == null) {
                return com.facebook.internal.h.c();
            }
            return j2.c();
        }
    }

    public int c() {
        return this.f8992i;
    }

    public String d() {
        String str = this.l;
        return str != null ? str : this.t.getLocalizedMessage();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f8994k;
    }

    public FacebookException f() {
        return this.t;
    }

    public int g() {
        return this.f8991h;
    }

    public int h() {
        return this.f8993j;
    }

    public String toString() {
        return "{HttpStatus: " + this.f8991h + ", errorCode: " + this.f8992i + ", subErrorCode: " + this.f8993j + ", errorType: " + this.f8994k + ", errorMessage: " + d() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f8991h);
        parcel.writeInt(this.f8992i);
        parcel.writeInt(this.f8993j);
        parcel.writeString(this.f8994k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
    }

    private FacebookRequestError(int i2, int i3, int i4, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        boolean z2;
        b a2;
        this.f8991h = i2;
        this.f8992i = i3;
        this.f8993j = i4;
        this.f8994k = str;
        this.l = str2;
        this.q = jSONObject;
        this.p = jSONObject2;
        this.r = obj;
        this.s = httpURLConnection;
        this.m = str3;
        this.n = str4;
        if (facebookException != null) {
            this.t = facebookException;
            z2 = true;
        } else {
            this.t = new FacebookServiceException(this, str2);
            z2 = false;
        }
        com.facebook.internal.h b2 = b();
        if (z2) {
            a2 = b.OTHER;
        } else {
            a2 = b2.a(i3, i4, z);
        }
        this.f8990g = a2;
        this.o = b2.e(a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc));
    }

    public FacebookRequestError(int i2, String str, String str2) {
        this(-1, i2, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }
}
