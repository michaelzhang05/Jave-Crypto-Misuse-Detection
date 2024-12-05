package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private String f19113a;

    /* renamed from: e, reason: collision with root package name */
    private int f19117e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19119g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19120h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19121i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19122j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19123k;

    /* renamed from: l, reason: collision with root package name */
    private a f19124l;

    /* renamed from: m, reason: collision with root package name */
    private final SharedPreferences f19125m;

    /* renamed from: b, reason: collision with root package name */
    private String f19114b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f19115c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f19116d = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f19118f = false;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public e(Context context) {
        this.f19113a = "";
        this.f19117e = 0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f19125m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        if (defaultSharedPreferences != null) {
            this.f19113a = defaultSharedPreferences.getString("IABTCF_TCString", "");
            this.f19117e = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            a(defaultSharedPreferences.getString("IABTCF_PurposeConsents", ""));
            b(defaultSharedPreferences.getString("IABTCF_VendorConsents", ""));
            c(defaultSharedPreferences.getString("IABTCF_AddtlConsent", ""));
        }
    }

    private void b(String str) {
        this.f19121i = a(str, 867);
        this.f19115c = str;
    }

    private void c(String str) {
        this.f19116d = str;
        if (TextUtils.isEmpty(str)) {
            this.f19122j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f19123k = false;
            return;
        }
        this.f19123k = true;
        try {
            String[] split = str.split("~");
            if (split.length > 1) {
                if (TextUtils.isEmpty(split[1])) {
                    this.f19122j = false;
                } else {
                    this.f19122j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th) {
            ad.b("TCStringManager", th.getMessage());
        }
    }

    private boolean d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.matches("[01]+");
        }
        return false;
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.f19124l = aVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c8;
        try {
            if (!TextUtils.isEmpty(str)) {
                switch (str.hashCode()) {
                    case -2004976699:
                        if (str.equals("IABTCF_PurposeConsents")) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 83641339:
                        if (str.equals("IABTCF_gdprApplies")) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 1218895378:
                        if (str.equals("IABTCF_TCString")) {
                            c8 = 0;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 1342914771:
                        if (str.equals("IABTCF_AddtlConsent")) {
                            c8 = 4;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 1450203731:
                        if (str.equals("IABTCF_VendorConsents")) {
                            c8 = 3;
                            break;
                        }
                        c8 = 65535;
                        break;
                    default:
                        c8 = 65535;
                        break;
                }
                if (c8 != 0) {
                    if (c8 != 1) {
                        if (c8 != 2) {
                            if (c8 != 3) {
                                if (c8 == 4) {
                                    c(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                                }
                            } else {
                                b(sharedPreferences.getString("IABTCF_VendorConsents", ""));
                            }
                        } else {
                            a(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
                        }
                    } else {
                        this.f19117e = sharedPreferences.getInt("IABTCF_gdprApplies", 0);
                    }
                } else {
                    this.f19113a = sharedPreferences.getString("IABTCF_TCString", "");
                }
                a aVar = this.f19124l;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Throwable th) {
            ad.b("TCStringManager", th.getMessage());
        }
    }

    public final String a() {
        return this.f19113a;
    }

    private void a(String str) {
        this.f19119g = a(str, 1);
        this.f19120h = a(str, 2);
        this.f19114b = str;
    }

    public final boolean b() {
        if (this.f19117e == 0) {
            this.f19118f = true;
            return true;
        }
        if (d(this.f19114b) && d(this.f19115c)) {
            if (MBridgeConstans.VERIFY_ATP_CONSENT) {
                this.f19118f = (this.f19121i || (this.f19123k && this.f19122j)) && this.f19119g && this.f19120h;
                return this.f19118f;
            }
            if (!this.f19121i || !this.f19119g || !this.f19120h) {
                r1 = false;
            }
        }
        this.f19118f = r1;
        return this.f19118f;
    }

    private boolean a(String str, int i8) {
        return d(str) && i8 <= str.length() && i8 >= 1 && '1' == str.charAt(i8 - 1);
    }
}
