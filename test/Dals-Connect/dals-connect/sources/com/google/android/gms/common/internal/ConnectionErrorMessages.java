package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes2.dex */
public final class ConnectionErrorMessages {
    private static final c.e.g<String, String> a = new c.e.g<>();

    private ConnectionErrorMessages() {
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.f10485g);
    }

    public static String c(Context context, int i2) {
        Resources resources = context.getResources();
        if (i2 == 1) {
            return resources.getString(R.string.f10482d);
        }
        if (i2 == 2) {
            return resources.getString(R.string.f10488j);
        }
        if (i2 != 3) {
            return resources.getString(android.R.string.ok);
        }
        return resources.getString(R.string.a);
    }

    public static String d(Context context, int i2) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i2 == 1) {
            return resources.getString(R.string.f10483e, a2);
        }
        if (i2 == 2) {
            return DeviceProperties.e(context) ? resources.getString(R.string.n) : resources.getString(R.string.f10489k, a2);
        }
        if (i2 == 3) {
            return resources.getString(R.string.f10480b, a2);
        }
        if (i2 == 5) {
            return i(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i2 == 7) {
            return i(context, "common_google_play_services_network_error_text", a2);
        }
        if (i2 == 9) {
            return resources.getString(R.string.f10487i, a2);
        }
        if (i2 != 20) {
            switch (i2) {
                case 16:
                    return i(context, "common_google_play_services_api_unavailable_text", a2);
                case 17:
                    return i(context, "common_google_play_services_sign_in_failed_text", a2);
                case 18:
                    return resources.getString(R.string.m, a2);
                default:
                    return resources.getString(com.google.android.gms.common.R.string.a, a2);
            }
        }
        return i(context, "common_google_play_services_restricted_profile_text", a2);
    }

    public static String e(Context context, int i2) {
        if (i2 == 6) {
            return i(context, "common_google_play_services_resolution_required_text", a(context));
        }
        return d(context, i2);
    }

    public static String f(Context context, int i2) {
        String g2;
        if (i2 == 6) {
            g2 = h(context, "common_google_play_services_resolution_required_title");
        } else {
            g2 = g(context, i2);
        }
        return g2 == null ? context.getResources().getString(R.string.f10486h) : g2;
    }

    public static String g(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(R.string.f10484f);
            case 2:
                return resources.getString(R.string.l);
            case 3:
                return resources.getString(R.string.f10481c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i2);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str) {
        c.e.g<String, String> gVar = a;
        synchronized (gVar) {
            String str2 = gVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }

    private static String i(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h2 = h(context, str);
        if (h2 == null) {
            h2 = resources.getString(com.google.android.gms.common.R.string.a);
        }
        return String.format(resources.getConfiguration().locale, h2, str2);
    }
}
