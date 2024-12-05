package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.x;
import com.facebook.internal.y;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyTokenHelper.java */
/* loaded from: classes.dex */
public final class k {
    private static final String a = "k";

    /* renamed from: b, reason: collision with root package name */
    private String f9267b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f9268c;

    public k(Context context) {
        this(context, null);
    }

    private void b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f9268c.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        if (string.equals("bool")) {
            bundle.putBoolean(str, jSONObject.getBoolean("value"));
            return;
        }
        int i2 = 0;
        if (string.equals("bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i2 < length) {
                zArr[i2] = jSONArray.getBoolean(i2);
                i2++;
            }
            bundle.putBooleanArray(str, zArr);
            return;
        }
        if (string.equals("byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt("value"));
            return;
        }
        if (string.equals("byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i2 < length2) {
                bArr[i2] = (byte) jSONArray2.getInt(i2);
                i2++;
            }
            bundle.putByteArray(str, bArr);
            return;
        }
        if (string.equals("short")) {
            bundle.putShort(str, (short) jSONObject.getInt("value"));
            return;
        }
        if (string.equals("short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i2 < length3) {
                sArr[i2] = (short) jSONArray3.getInt(i2);
                i2++;
            }
            bundle.putShortArray(str, sArr);
            return;
        }
        if (string.equals("int")) {
            bundle.putInt(str, jSONObject.getInt("value"));
            return;
        }
        if (string.equals("int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i2 < length4) {
                iArr[i2] = jSONArray4.getInt(i2);
                i2++;
            }
            bundle.putIntArray(str, iArr);
            return;
        }
        if (string.equals("long")) {
            bundle.putLong(str, jSONObject.getLong("value"));
            return;
        }
        if (string.equals("long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i2 < length5) {
                jArr[i2] = jSONArray5.getLong(i2);
                i2++;
            }
            bundle.putLongArray(str, jArr);
            return;
        }
        if (string.equals("float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
            return;
        }
        if (string.equals("float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i2 < length6) {
                fArr[i2] = (float) jSONArray6.getDouble(i2);
                i2++;
            }
            bundle.putFloatArray(str, fArr);
            return;
        }
        if (string.equals("double")) {
            bundle.putDouble(str, jSONObject.getDouble("value"));
            return;
        }
        if (string.equals("double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i2 < length7) {
                dArr[i2] = jSONArray7.getDouble(i2);
                i2++;
            }
            bundle.putDoubleArray(str, dArr);
            return;
        }
        if (string.equals("char")) {
            String string2 = jSONObject.getString("value");
            if (string2 == null || string2.length() != 1) {
                return;
            }
            bundle.putChar(str, string2.charAt(0));
            return;
        }
        if (string.equals("char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i3 = 0; i3 < length8; i3++) {
                String string3 = jSONArray8.getString(i3);
                if (string3 != null && string3.length() == 1) {
                    cArr[i3] = string3.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
            return;
        }
        if (string.equals("string")) {
            bundle.putString(str, jSONObject.getString("value"));
            return;
        }
        if (string.equals("stringList")) {
            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
            int length9 = jSONArray9.length();
            ArrayList<String> arrayList = new ArrayList<>(length9);
            while (i2 < length9) {
                Object obj = jSONArray9.get(i2);
                arrayList.add(i2, obj == JSONObject.NULL ? null : (String) obj);
                i2++;
            }
            bundle.putStringArrayList(str, arrayList);
            return;
        }
        if (string.equals("enum")) {
            try {
                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }

    public static String c(Bundle bundle) {
        y.i(bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Date d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        long j2 = bundle.getLong(str, Long.MIN_VALUE);
        if (j2 == Long.MIN_VALUE) {
            return null;
        }
        return new Date(j2);
    }

    public static c e(Bundle bundle) {
        y.i(bundle, "bundle");
        if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
            return (c) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
        }
        return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? c.FACEBOOK_APPLICATION_WEB : c.WEB_VIEW;
    }

    public static String f(Bundle bundle) {
        y.i(bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    public static boolean g(Bundle bundle) {
        String string;
        return (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
    }

    public void a() {
        this.f9268c.edit().clear().apply();
    }

    public Bundle h() {
        Bundle bundle = new Bundle();
        for (String str : this.f9268c.getAll().keySet()) {
            try {
                b(str, bundle);
            } catch (JSONException e2) {
                com.facebook.internal.r.e(l.CACHE, 5, a, "Error reading cached value for key: '" + str + "' -- " + e2);
                return null;
            }
        }
        return bundle;
    }

    public k(Context context, String str) {
        y.i(context, "context");
        this.f9267b = x.Q(str) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        Context applicationContext = context.getApplicationContext();
        this.f9268c = (applicationContext != null ? applicationContext : context).getSharedPreferences(this.f9267b, 0);
    }
}
