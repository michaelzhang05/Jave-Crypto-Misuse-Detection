package v1;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final l.g f9659a = new l.g();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f9660b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return b2.d.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(q1.b.f8976g);
    }

    public static String c(Context context, int i6) {
        return context.getResources().getString(i6 != 1 ? i6 != 2 ? i6 != 3 ? R.string.ok : q1.b.f8970a : q1.b.f8979j : q1.b.f8973d);
    }

    public static String d(Context context, int i6) {
        Resources resources = context.getResources();
        String a6 = a(context);
        if (i6 == 1) {
            return resources.getString(q1.b.f8974e, a6);
        }
        if (i6 == 2) {
            return z1.f.c(context) ? resources.getString(q1.b.f8983n) : resources.getString(q1.b.f8980k, a6);
        }
        if (i6 == 3) {
            return resources.getString(q1.b.f8971b, a6);
        }
        if (i6 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", a6);
        }
        if (i6 == 7) {
            return h(context, "common_google_play_services_network_error_text", a6);
        }
        if (i6 == 9) {
            return resources.getString(q1.b.f8978i, a6);
        }
        if (i6 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", a6);
        }
        switch (i6) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", a6);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", a6);
            case 18:
                return resources.getString(q1.b.f8982m, a6);
            default:
                return resources.getString(s1.k.f9229a, a6);
        }
    }

    public static String e(Context context, int i6) {
        return (i6 == 6 || i6 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i6);
    }

    public static String f(Context context, int i6) {
        String i7 = i6 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i6);
        return i7 == null ? context.getResources().getString(q1.b.f8977h) : i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static String g(Context context, int i6) {
        String str;
        Resources resources = context.getResources();
        switch (i6) {
            case 1:
                return resources.getString(q1.b.f8975f);
            case 2:
                return resources.getString(q1.b.f8981l);
            case 3:
                return resources.getString(q1.b.f8972c);
            case 4:
            case 6:
            case 18:
                return null;
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 11:
                str = "The application is not licensed to the user.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i6);
                str = sb.toString();
                Log.e("GoogleApiAvailability", str);
                return null;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i6 = i(context, str);
        if (i6 == null) {
            i6 = resources.getString(s1.k.f9229a);
        }
        return String.format(resources.getConfiguration().locale, i6, str2);
    }

    private static String i(Context context, String str) {
        l.g gVar = f9659a;
        synchronized (gVar) {
            Locale d6 = androidx.core.os.g.a(context.getResources().getConfiguration()).d(0);
            if (!d6.equals(f9660b)) {
                gVar.clear();
                f9660b = d6;
            }
            String str2 = (String) gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources b6 = s1.h.b(context);
            if (b6 == null) {
                return null;
            }
            int identifier = b6.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = b6.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
