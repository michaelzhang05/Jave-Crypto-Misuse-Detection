package a5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import o5.C3681u;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Q implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f14059a;

    /* renamed from: b, reason: collision with root package name */
    private String f14060b;

    /* renamed from: c, reason: collision with root package name */
    private String f14061c;

    /* renamed from: d, reason: collision with root package name */
    private String f14062d;

    /* renamed from: e, reason: collision with root package name */
    private String f14063e;

    /* renamed from: f, reason: collision with root package name */
    private long f14064f;

    /* renamed from: g, reason: collision with root package name */
    private String f14065g;

    /* renamed from: h, reason: collision with root package name */
    private String f14066h;

    /* renamed from: i, reason: collision with root package name */
    private String f14067i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14068j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f14058k = new b(null);
    public static Parcelable.Creator<Q> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Q createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new Q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Q[] newArray(int i8) {
            return new Q[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final void a(Context context) {
            AbstractC3255y.i(context, "context");
            b(context);
            SettingsPreferences.f30353b.j1(context, null);
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.W("PreRegisterWorker", context)) {
                WorkManager.getInstance(context).cancelAllWorkByTag("PreRegisterWorker");
            }
            if (aVar.W("GetUserDataWorker", context)) {
                WorkManager.getInstance(context).cancelAllWorkByTag("GetUserDataWorker");
            }
            C1632D.f13956f.a(context);
            new C3681u().f(context);
        }

        public final void b(Context context) {
            AbstractC3255y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
            edit.remove("user_id");
            edit.remove("user_email");
            edit.remove("user_name");
            edit.remove("user_picture");
            edit.remove("registered_timestamp");
            edit.remove("is_turbo");
            edit.remove("username_format");
            edit.apply();
            SettingsPreferences.f30353b.l1(context, false);
        }

        public final String c(String str) {
            if (str != null) {
                return str + UptodownApp.f29058B.t() + ":webp";
            }
            return null;
        }

        public final String d(String str) {
            if (str != null) {
                return str + UptodownApp.f29058B.m() + ":webp";
            }
            return null;
        }

        public final Q e(Context context) {
            Q q8;
            AbstractC3255y.i(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("SharedPreferencesUser", 0);
            if (sharedPreferences.contains("user_id")) {
                q8 = new Q();
                q8.W(sharedPreferences.getString("user_id", null));
            } else {
                q8 = null;
            }
            if (sharedPreferences.contains("user_email")) {
                if (q8 == null) {
                    q8 = new Q();
                }
                q8.U(sharedPreferences.getString("user_email", null));
            }
            if (sharedPreferences.contains("user_name")) {
                if (q8 == null) {
                    q8 = new Q();
                }
                q8.X(sharedPreferences.getString("user_name", null));
            }
            if (q8 != null) {
                if (sharedPreferences.contains("user_picture")) {
                    q8.J(sharedPreferences.getString("user_picture", null));
                }
                if (sharedPreferences.contains("registered_timestamp")) {
                    q8.Y(sharedPreferences.getLong("registered_timestamp", -1L));
                }
                if (sharedPreferences.contains("is_turbo")) {
                    q8.Z(sharedPreferences.getString("is_turbo", null));
                }
                if (sharedPreferences.contains("username_format")) {
                    q8.a0(sharedPreferences.getString("username_format", "type0"));
                }
            }
            return q8;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public Q() {
        this.f14064f = -1L;
        this.f14065g = "type0";
    }

    public final void H(Context context) {
        AbstractC3255y.i(context, "context");
        SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
        edit.putString("user_id", this.f14059a);
        edit.putString("user_email", this.f14060b);
        edit.putString("user_picture", this.f14061c);
        edit.putString("user_name", this.f14062d);
        edit.putLong("registered_timestamp", this.f14064f);
        edit.putString("is_turbo", this.f14067i);
        edit.putString("username_format", this.f14065g);
        edit.apply();
    }

    public final void J(String str) {
        this.f14061c = str;
    }

    public final void U(String str) {
        this.f14060b = str;
    }

    public final void W(String str) {
        this.f14059a = str;
    }

    public final void X(String str) {
        this.f14062d = str;
    }

    public final void Y(long j8) {
        this.f14064f = j8;
    }

    public final void Z(String str) {
        this.f14067i = str;
    }

    public final String a(Context context) {
        String string;
        String string2;
        String string3;
        AbstractC3255y.i(context, "context");
        long j8 = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j8) - this.f14064f;
        if (currentTimeMillis == 1) {
            string = context.getString(R.string.unit_time_second);
            AbstractC3255y.h(string, "context.getString(R.string.unit_time_second)");
        } else {
            string = context.getString(R.string.unit_time_seconds);
            AbstractC3255y.h(string, "context.getString(R.string.unit_time_seconds)");
        }
        if (currentTimeMillis >= 60) {
            long j9 = 60;
            currentTimeMillis /= j9;
            if (currentTimeMillis == 1) {
                string = context.getString(R.string.unit_time_minute);
                AbstractC3255y.h(string, "context.getString(R.string.unit_time_minute)");
            } else {
                string = context.getString(R.string.unit_time_minutes);
                AbstractC3255y.h(string, "context.getString(R.string.unit_time_minutes)");
            }
            if (currentTimeMillis >= 60) {
                currentTimeMillis /= j9;
                if (currentTimeMillis == 1) {
                    string2 = context.getString(R.string.unit_time_hour);
                    AbstractC3255y.h(string2, "context.getString(R.string.unit_time_hour)");
                } else {
                    string2 = context.getString(R.string.unit_time_hours);
                    AbstractC3255y.h(string2, "context.getString(R.string.unit_time_hours)");
                }
                string = string2;
                if (currentTimeMillis >= 24) {
                    currentTimeMillis /= 24;
                    if (currentTimeMillis == 1) {
                        string3 = context.getString(R.string.unit_time_day);
                        AbstractC3255y.h(string3, "context.getString(R.string.unit_time_day)");
                    } else {
                        string3 = context.getString(R.string.unit_time_days);
                        AbstractC3255y.h(string3, "context.getString(R.string.unit_time_days)");
                    }
                    string = string3;
                    if (8 <= currentTimeMillis && currentTimeMillis < 30) {
                        currentTimeMillis /= 7;
                        if (currentTimeMillis == 1) {
                            string = context.getString(R.string.unit_time_week);
                            AbstractC3255y.h(string, "context.getString(R.string.unit_time_week)");
                        } else {
                            string = context.getString(R.string.unit_time_weeks);
                            AbstractC3255y.h(string, "context.getString(R.string.unit_time_weeks)");
                        }
                    } else if (31 <= currentTimeMillis && currentTimeMillis < 365) {
                        currentTimeMillis /= 30;
                        if (currentTimeMillis == 1) {
                            string = context.getString(R.string.unit_time_month);
                            AbstractC3255y.h(string, "context.getString(R.string.unit_time_month)");
                        } else {
                            string = context.getString(R.string.unit_time_months);
                            AbstractC3255y.h(string, "context.getString(R.string.unit_time_months)");
                        }
                    } else if (currentTimeMillis > 365) {
                        String format = new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date(this.f14064f * j8));
                        Y y8 = Y.f34167a;
                        String string4 = context.getString(R.string.in_year);
                        AbstractC3255y.h(string4, "context.getString(R.string.in_year)");
                        String format2 = String.format(string4, Arrays.copyOf(new Object[]{format}, 1));
                        AbstractC3255y.h(format2, "format(...)");
                        return format2;
                    }
                }
            }
        }
        if (currentTimeMillis == 0) {
            String string5 = context.getString(R.string.time_now);
            AbstractC3255y.h(string5, "context.getString(R.string.time_now)");
            return string5;
        }
        Y y9 = Y.f34167a;
        String string6 = context.getString(R.string.time_ago);
        AbstractC3255y.h(string6, "context.getString(R.string.time_ago)");
        String format3 = String.format(string6, Arrays.copyOf(new Object[]{Long.valueOf(currentTimeMillis), string}, 2));
        AbstractC3255y.h(format3, "format(...)");
        return format3;
    }

    public final void a0(String str) {
        this.f14065g = str;
    }

    public final String b() {
        return this.f14061c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String g() {
        if (this.f14061c != null) {
            StringBuilder sb = new StringBuilder();
            String str = this.f14061c;
            AbstractC3255y.f(str);
            sb.append(str);
            sb.append(UptodownApp.f29058B.l());
            sb.append(":webp");
            return sb.toString();
        }
        return null;
    }

    public final String getId() {
        return this.f14059a;
    }

    public final String h() {
        return f14058k.d(this.f14061c);
    }

    public final void i(JSONObject jsonObject) {
        AbstractC3255y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME)) {
            this.f14062d = jsonObject.getString(HintConstants.AUTOFILL_HINT_USERNAME);
        }
        if (!jsonObject.isNull("registeredTimeAgo")) {
            this.f14066h = jsonObject.getString("registeredTimeAgo");
        }
        if (!jsonObject.isNull("avatar")) {
            this.f14061c = jsonObject.getString("avatar");
        }
        if (!jsonObject.isNull("isTurbo")) {
            boolean z8 = true;
            if (jsonObject.getInt("isTurbo") != 1) {
                z8 = false;
            }
            this.f14068j = z8;
        }
        if (!jsonObject.isNull("usernameFormat")) {
            this.f14065g = jsonObject.getString("usernameFormat");
        }
    }

    public final void l(Context context, JSONObject jsonObject) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("udata")) {
            JSONObject jSONObject = jsonObject.getJSONObject("udata");
            if (!jSONObject.isNull("id")) {
                this.f14059a = jSONObject.getString("id");
            }
            if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME)) {
                this.f14062d = jSONObject.getString(HintConstants.AUTOFILL_HINT_USERNAME);
            }
            if (!jSONObject.isNull("avatar")) {
                this.f14061c = jSONObject.getString("avatar");
            }
            if (!jSONObject.isNull("registeredTimestamp")) {
                this.f14064f = jSONObject.getLong("registeredTimestamp");
            }
            if (!jSONObject.isNull("usernameFormat")) {
                String string = jSONObject.getString("usernameFormat");
                AbstractC3255y.h(string, "jsonUser.getString(Const…es.FIELD_USERNAME_FORMAT)");
                if (string.length() > 0) {
                    this.f14065g = jSONObject.getString("usernameFormat");
                }
            }
        }
        if (!jsonObject.isNull("utoken")) {
            SettingsPreferences.f30353b.j1(context, jsonObject.getString("utoken"));
        } else {
            f14058k.b(context);
        }
        if (!jsonObject.isNull("turboToken")) {
            this.f14067i = jsonObject.getString("turboToken");
        }
    }

    public final String p() {
        return this.f14060b;
    }

    public final String s() {
        return this.f14062d;
    }

    public final String u() {
        return this.f14066h;
    }

    public final long v() {
        return this.f14064f;
    }

    public final String w() {
        return this.f14065g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f14059a);
        parcel.writeString(this.f14060b);
        parcel.writeString(this.f14061c);
        parcel.writeString(this.f14062d);
        parcel.writeString(this.f14063e);
        parcel.writeString(this.f14067i);
        parcel.writeString(this.f14065g);
        parcel.writeLong(this.f14064f);
    }

    public final boolean x(Context context) {
        AbstractC3255y.i(context, "context");
        if (SettingsPreferences.f30353b.J(context) != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z8;
        String str = this.f14067i;
        if (str != null && str.length() != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        return !z8;
    }

    public final boolean z() {
        return this.f14068j;
    }

    public Q(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14064f = -1L;
        this.f14065g = "type0";
        this.f14059a = source.readString();
        this.f14060b = source.readString();
        this.f14061c = source.readString();
        this.f14062d = source.readString();
        this.f14063e = source.readString();
        this.f14067i = source.readString();
        this.f14065g = source.readString();
        this.f14064f = source.readLong();
    }
}
