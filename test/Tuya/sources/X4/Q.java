package X4;

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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import l5.C3333u;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Q implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12438a;

    /* renamed from: b, reason: collision with root package name */
    private String f12439b;

    /* renamed from: c, reason: collision with root package name */
    private String f12440c;

    /* renamed from: d, reason: collision with root package name */
    private String f12441d;

    /* renamed from: e, reason: collision with root package name */
    private String f12442e;

    /* renamed from: f, reason: collision with root package name */
    private long f12443f;

    /* renamed from: g, reason: collision with root package name */
    private String f12444g;

    /* renamed from: h, reason: collision with root package name */
    private String f12445h;

    /* renamed from: i, reason: collision with root package name */
    private String f12446i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12447j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f12437k = new b(null);
    public static Parcelable.Creator<Q> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Q createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
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
            AbstractC3159y.i(context, "context");
            b(context);
            SettingsPreferences.f29323b.j1(context, null);
            UptodownApp.a aVar = UptodownApp.f28003B;
            if (aVar.W("PreRegisterWorker", context)) {
                WorkManager.getInstance(context).cancelAllWorkByTag("PreRegisterWorker");
            }
            if (aVar.W("GetUserDataWorker", context)) {
                WorkManager.getInstance(context).cancelAllWorkByTag("GetUserDataWorker");
            }
            D.f12335f.a(context);
            new C3333u().f(context);
        }

        public final void b(Context context) {
            AbstractC3159y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
            edit.remove("user_id");
            edit.remove("user_email");
            edit.remove("user_name");
            edit.remove("user_picture");
            edit.remove("registered_timestamp");
            edit.remove("is_turbo");
            edit.remove("username_format");
            edit.apply();
            SettingsPreferences.f29323b.l1(context, false);
        }

        public final String c(String str) {
            if (str != null) {
                return str + UptodownApp.f28003B.t() + ":webp";
            }
            return null;
        }

        public final String d(String str) {
            if (str != null) {
                return str + UptodownApp.f28003B.m() + ":webp";
            }
            return null;
        }

        public final Q e(Context context) {
            Q q8;
            AbstractC3159y.i(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("SharedPreferencesUser", 0);
            if (sharedPreferences.contains("user_id")) {
                q8 = new Q();
                q8.V(sharedPreferences.getString("user_id", null));
            } else {
                q8 = null;
            }
            if (sharedPreferences.contains("user_email")) {
                if (q8 == null) {
                    q8 = new Q();
                }
                q8.T(sharedPreferences.getString("user_email", null));
            }
            if (sharedPreferences.contains("user_name")) {
                if (q8 == null) {
                    q8 = new Q();
                }
                q8.X(sharedPreferences.getString("user_name", null));
            }
            if (q8 != null) {
                if (sharedPreferences.contains("user_picture")) {
                    q8.Q(sharedPreferences.getString("user_picture", null));
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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public Q() {
        this.f12443f = -1L;
        this.f12444g = "type0";
    }

    public final boolean G() {
        boolean z8;
        String str = this.f12446i;
        if (str != null && str.length() != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        return !z8;
    }

    public final boolean I() {
        return this.f12447j;
    }

    public final void L(Context context) {
        AbstractC3159y.i(context, "context");
        SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
        edit.putString("user_id", this.f12438a);
        edit.putString("user_email", this.f12439b);
        edit.putString("user_picture", this.f12440c);
        edit.putString("user_name", this.f12441d);
        edit.putLong("registered_timestamp", this.f12443f);
        edit.putString("is_turbo", this.f12446i);
        edit.putString("username_format", this.f12444g);
        edit.apply();
    }

    public final void Q(String str) {
        this.f12440c = str;
    }

    public final void T(String str) {
        this.f12439b = str;
    }

    public final void V(String str) {
        this.f12438a = str;
    }

    public final void X(String str) {
        this.f12441d = str;
    }

    public final void Y(long j8) {
        this.f12443f = j8;
    }

    public final void Z(String str) {
        this.f12446i = str;
    }

    public final void a0(String str) {
        this.f12444g = str;
    }

    public final String b(Context context) {
        String string;
        String string2;
        String string3;
        AbstractC3159y.i(context, "context");
        long j8 = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j8) - this.f12443f;
        if (currentTimeMillis == 1) {
            string = context.getString(R.string.unit_time_second);
            AbstractC3159y.h(string, "context.getString(R.string.unit_time_second)");
        } else {
            string = context.getString(R.string.unit_time_seconds);
            AbstractC3159y.h(string, "context.getString(R.string.unit_time_seconds)");
        }
        if (currentTimeMillis >= 60) {
            long j9 = 60;
            currentTimeMillis /= j9;
            if (currentTimeMillis == 1) {
                string = context.getString(R.string.unit_time_minute);
                AbstractC3159y.h(string, "context.getString(R.string.unit_time_minute)");
            } else {
                string = context.getString(R.string.unit_time_minutes);
                AbstractC3159y.h(string, "context.getString(R.string.unit_time_minutes)");
            }
            if (currentTimeMillis >= 60) {
                currentTimeMillis /= j9;
                if (currentTimeMillis == 1) {
                    string2 = context.getString(R.string.unit_time_hour);
                    AbstractC3159y.h(string2, "context.getString(R.string.unit_time_hour)");
                } else {
                    string2 = context.getString(R.string.unit_time_hours);
                    AbstractC3159y.h(string2, "context.getString(R.string.unit_time_hours)");
                }
                string = string2;
                if (currentTimeMillis >= 24) {
                    currentTimeMillis /= 24;
                    if (currentTimeMillis == 1) {
                        string3 = context.getString(R.string.unit_time_day);
                        AbstractC3159y.h(string3, "context.getString(R.string.unit_time_day)");
                    } else {
                        string3 = context.getString(R.string.unit_time_days);
                        AbstractC3159y.h(string3, "context.getString(R.string.unit_time_days)");
                    }
                    string = string3;
                    if (8 <= currentTimeMillis && currentTimeMillis < 30) {
                        currentTimeMillis /= 7;
                        if (currentTimeMillis == 1) {
                            string = context.getString(R.string.unit_time_week);
                            AbstractC3159y.h(string, "context.getString(R.string.unit_time_week)");
                        } else {
                            string = context.getString(R.string.unit_time_weeks);
                            AbstractC3159y.h(string, "context.getString(R.string.unit_time_weeks)");
                        }
                    } else if (31 <= currentTimeMillis && currentTimeMillis < 365) {
                        currentTimeMillis /= 30;
                        if (currentTimeMillis == 1) {
                            string = context.getString(R.string.unit_time_month);
                            AbstractC3159y.h(string, "context.getString(R.string.unit_time_month)");
                        } else {
                            string = context.getString(R.string.unit_time_months);
                            AbstractC3159y.h(string, "context.getString(R.string.unit_time_months)");
                        }
                    } else if (currentTimeMillis > 365) {
                        String format = new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date(this.f12443f * j8));
                        Y y8 = Y.f33766a;
                        String string4 = context.getString(R.string.in_year);
                        AbstractC3159y.h(string4, "context.getString(R.string.in_year)");
                        String format2 = String.format(string4, Arrays.copyOf(new Object[]{format}, 1));
                        AbstractC3159y.h(format2, "format(...)");
                        return format2;
                    }
                }
            }
        }
        if (currentTimeMillis == 0) {
            String string5 = context.getString(R.string.time_now);
            AbstractC3159y.h(string5, "context.getString(R.string.time_now)");
            return string5;
        }
        Y y9 = Y.f33766a;
        String string6 = context.getString(R.string.time_ago);
        AbstractC3159y.h(string6, "context.getString(R.string.time_ago)");
        String format3 = String.format(string6, Arrays.copyOf(new Object[]{Long.valueOf(currentTimeMillis), string}, 2));
        AbstractC3159y.h(format3, "format(...)");
        return format3;
    }

    public final String c() {
        return this.f12440c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        if (this.f12440c != null) {
            StringBuilder sb = new StringBuilder();
            String str = this.f12440c;
            AbstractC3159y.f(str);
            sb.append(str);
            sb.append(UptodownApp.f28003B.l());
            sb.append(":webp");
            return sb.toString();
        }
        return null;
    }

    public final String f() {
        return f12437k.d(this.f12440c);
    }

    public final String getId() {
        return this.f12438a;
    }

    public final void i(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME)) {
            this.f12441d = jsonObject.getString(HintConstants.AUTOFILL_HINT_USERNAME);
        }
        if (!jsonObject.isNull("registeredTimeAgo")) {
            this.f12445h = jsonObject.getString("registeredTimeAgo");
        }
        if (!jsonObject.isNull("avatar")) {
            this.f12440c = jsonObject.getString("avatar");
        }
        if (!jsonObject.isNull("isTurbo")) {
            boolean z8 = true;
            if (jsonObject.getInt("isTurbo") != 1) {
                z8 = false;
            }
            this.f12447j = z8;
        }
        if (!jsonObject.isNull("usernameFormat")) {
            this.f12444g = jsonObject.getString("usernameFormat");
        }
    }

    public final void j(Context context, JSONObject jsonObject) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("udata")) {
            JSONObject jSONObject = jsonObject.getJSONObject("udata");
            if (!jSONObject.isNull("id")) {
                this.f12438a = jSONObject.getString("id");
            }
            if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME)) {
                this.f12441d = jSONObject.getString(HintConstants.AUTOFILL_HINT_USERNAME);
            }
            if (!jSONObject.isNull("avatar")) {
                this.f12440c = jSONObject.getString("avatar");
            }
            if (!jSONObject.isNull("registeredTimestamp")) {
                this.f12443f = jSONObject.getLong("registeredTimestamp");
            }
            if (!jSONObject.isNull("usernameFormat")) {
                String string = jSONObject.getString("usernameFormat");
                AbstractC3159y.h(string, "jsonUser.getString(Const…es.FIELD_USERNAME_FORMAT)");
                if (string.length() > 0) {
                    this.f12444g = jSONObject.getString("usernameFormat");
                }
            }
        }
        if (!jsonObject.isNull("utoken")) {
            SettingsPreferences.f29323b.j1(context, jsonObject.getString("utoken"));
        } else {
            f12437k.b(context);
        }
        if (!jsonObject.isNull("turboToken")) {
            this.f12446i = jsonObject.getString("turboToken");
        }
    }

    public final String k() {
        return this.f12439b;
    }

    public final String n() {
        return this.f12441d;
    }

    public final String o() {
        return this.f12445h;
    }

    public final long s() {
        return this.f12443f;
    }

    public final String u() {
        return this.f12444g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12438a);
        parcel.writeString(this.f12439b);
        parcel.writeString(this.f12440c);
        parcel.writeString(this.f12441d);
        parcel.writeString(this.f12442e);
        parcel.writeString(this.f12446i);
        parcel.writeString(this.f12444g);
        parcel.writeLong(this.f12443f);
    }

    public final boolean z(Context context) {
        AbstractC3159y.i(context, "context");
        if (SettingsPreferences.f29323b.J(context) != null) {
            return true;
        }
        return false;
    }

    public Q(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12443f = -1L;
        this.f12444g = "type0";
        this.f12438a = source.readString();
        this.f12439b = source.readString();
        this.f12440c = source.readString();
        this.f12441d = source.readString();
        this.f12442e = source.readString();
        this.f12446i = source.readString();
        this.f12444g = source.readString();
        this.f12443f = source.readLong();
    }
}
