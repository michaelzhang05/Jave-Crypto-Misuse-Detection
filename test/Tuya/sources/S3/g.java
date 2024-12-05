package S3;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: i2, reason: collision with root package name */
    private static final /* synthetic */ g[] f9147i2;

    /* renamed from: j2, reason: collision with root package name */
    private static final /* synthetic */ R5.a f9150j2;

    /* renamed from: a, reason: collision with root package name */
    private final String f9194a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f9124b = new g("PARAM_PLATFORM", 0, "C001");

    /* renamed from: c, reason: collision with root package name */
    public static final g f9127c = new g("PARAM_DEVICE_MODEL", 1, "C002");

    /* renamed from: d, reason: collision with root package name */
    public static final g f9130d = new g("PARAM_OS_NAME", 2, "C003");

    /* renamed from: e, reason: collision with root package name */
    public static final g f9133e = new g("PARAM_OS_VERSION", 3, "C004");

    /* renamed from: f, reason: collision with root package name */
    public static final g f9136f = new g("PARAM_LOCALE", 4, "C005");

    /* renamed from: g, reason: collision with root package name */
    public static final g f9139g = new g("PARAM_TIME_ZONE", 5, "C006");

    /* renamed from: h, reason: collision with root package name */
    public static final g f9142h = new g("PARAM_HARDWARE_ID", 6, "C007");

    /* renamed from: i, reason: collision with root package name */
    public static final g f9145i = new g("PARAM_SCREEN_RESOLUTION", 7, "C008");

    /* renamed from: j, reason: collision with root package name */
    public static final g f9148j = new g("PARAM_DEVICE_NAME", 8, "C009");

    /* renamed from: k, reason: collision with root package name */
    public static final g f9151k = new g("PARAM_IP_ADDRESS", 9, "C010");

    /* renamed from: l, reason: collision with root package name */
    public static final g f9153l = new g("PARAM_LATITUDE", 10, "C011");

    /* renamed from: m, reason: collision with root package name */
    public static final g f9155m = new g("PARAM_LONGITUDE", 11, "C012");

    /* renamed from: n, reason: collision with root package name */
    public static final g f9157n = new g("PARAM_TELE_DEVICE_ID", 12, "A001");

    /* renamed from: o, reason: collision with root package name */
    public static final g f9159o = new g("PARAM_TELE_SUBSCRIBER_ID", 13, "A002");

    /* renamed from: p, reason: collision with root package name */
    public static final g f9161p = new g("PARAM_TELE_IMEI_SV", 14, "A003");

    /* renamed from: q, reason: collision with root package name */
    public static final g f9164q = new g("PARAM_TELE_GROUP_IDENTIFIER_L1", 15, "A004");

    /* renamed from: r, reason: collision with root package name */
    public static final g f9167r = new g("PARAM_TELE_LINE1_NUMBER", 16, "A005");

    /* renamed from: s, reason: collision with root package name */
    public static final g f9170s = new g("PARAM_TELE_MMS_UA_PROFILE_URL", 17, "A006");

    /* renamed from: t, reason: collision with root package name */
    public static final g f9173t = new g("PARAM_TELE_MMS_USER_AGENT", 18, "A007");

    /* renamed from: u, reason: collision with root package name */
    public static final g f9176u = new g("PARAM_TELE_NETWORK_COUNTRY_ISO", 19, "A008");

    /* renamed from: v, reason: collision with root package name */
    public static final g f9179v = new g("PARAM_TELE_NETWORK_OPERATOR", 20, "A009");

    /* renamed from: w, reason: collision with root package name */
    public static final g f9182w = new g("PARAM_TELE_NETWORK_OPERATOR_NAME", 21, "A010");

    /* renamed from: x, reason: collision with root package name */
    public static final g f9185x = new g("PARAM_TELE_NETWORK_TYPE", 22, "A011");

    /* renamed from: y, reason: collision with root package name */
    public static final g f9188y = new g("PARAM_TELE_PHONE_COUNT", 23, "A012");

    /* renamed from: z, reason: collision with root package name */
    public static final g f9191z = new g("PARAM_TELE_PHONE_TYPE", 24, "A013");

    /* renamed from: A, reason: collision with root package name */
    public static final g f9044A = new g("PARAM_TELE_SIM_COUNTRY_ISO", 25, "A014");

    /* renamed from: B, reason: collision with root package name */
    public static final g f9047B = new g("PARAM_TELE_SIM_OPERATOR", 26, "A015");

    /* renamed from: C, reason: collision with root package name */
    public static final g f9050C = new g("PARAM_TELE_SIM_OPERATOR_NAME", 27, "A016");

    /* renamed from: D, reason: collision with root package name */
    public static final g f9053D = new g("PARAM_TELE_SIM_SERIAL_NUMBER", 28, "A017");

    /* renamed from: E, reason: collision with root package name */
    public static final g f9056E = new g("PARAM_TELE_SIM_STATE", 29, "A018");

    /* renamed from: F, reason: collision with root package name */
    public static final g f9059F = new g("PARAM_TELE_VOICE_MAIL_ALPHA_TAG", 30, "A019");

    /* renamed from: G, reason: collision with root package name */
    public static final g f9062G = new g("PARAM_TELE_VOICE_MAIL_NUMBER", 31, "A020");

    /* renamed from: H, reason: collision with root package name */
    public static final g f9065H = new g("PARAM_TELE_HAS_ICC_CARD", 32, "A021");

    /* renamed from: I, reason: collision with root package name */
    public static final g f9068I = new g("PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED", 33, "A022");

    /* renamed from: J, reason: collision with root package name */
    public static final g f9071J = new g("PARAM_TELE_IS_NETWORK_ROAMING", 34, "A023");

    /* renamed from: K, reason: collision with root package name */
    public static final g f9074K = new g("PARAM_TELE_IS_SMS_CAPABLE", 35, "A024");

    /* renamed from: L, reason: collision with root package name */
    public static final g f9077L = new g("PARAM_TELE_IS_TTY_MODE_SUPPORTED", 36, "A025");

    /* renamed from: M, reason: collision with root package name */
    public static final g f9080M = new g("PARAM_TELE_IS_VOICE_CAPABLE", 37, "A026");

    /* renamed from: N, reason: collision with root package name */
    public static final g f9083N = new g("PARAM_TELE_IS_WORLD_PHONE", 38, "A027");

    /* renamed from: O, reason: collision with root package name */
    public static final g f9086O = new g("PARAM_WIFI_MAC", 39, "A028");

    /* renamed from: P, reason: collision with root package name */
    public static final g f9089P = new g("PARAM_WIFI_BSSID", 40, "A029");

    /* renamed from: Q, reason: collision with root package name */
    public static final g f9092Q = new g("PARAM_WIFI_SSID", 41, "A030");

    /* renamed from: R, reason: collision with root package name */
    public static final g f9095R = new g("PARAM_WIFI_NETWORK_ID", 42, "A031");

    /* renamed from: S, reason: collision with root package name */
    public static final g f9098S = new g("PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED", 43, "A032");

    /* renamed from: T, reason: collision with root package name */
    public static final g f9101T = new g("PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED", 44, "A033");

    /* renamed from: U, reason: collision with root package name */
    public static final g f9104U = new g("PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED", 45, "A034");

    /* renamed from: V, reason: collision with root package name */
    public static final g f9107V = new g("PARAM_WIFI_IS_P2P_SUPPORTED", 46, "A035");

    /* renamed from: W, reason: collision with root package name */
    public static final g f9110W = new g("PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED", 47, "A036");

    /* renamed from: X, reason: collision with root package name */
    public static final g f9113X = new g("PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE", 48, "A037");

    /* renamed from: Y, reason: collision with root package name */
    public static final g f9116Y = new g("PARAM_WIFI_IS_TDLS_SUPPORTED", 49, "A038");

    /* renamed from: Z, reason: collision with root package name */
    public static final g f9119Z = new g("PARAM_BLUETOOTH_ADDRESS", 50, "A039");

    /* renamed from: p0, reason: collision with root package name */
    public static final g f9162p0 = new g("PARAM_BLUETOOTH_BONDED_DEVICE", 51, "A040");

    /* renamed from: q0, reason: collision with root package name */
    public static final g f9165q0 = new g("PARAM_BLUETOOTH_IS_ENABLED", 52, "A041");

    /* renamed from: r0, reason: collision with root package name */
    public static final g f9168r0 = new g("PARAM_BUILD_BOARD", 53, "A042");

    /* renamed from: s0, reason: collision with root package name */
    public static final g f9171s0 = new g("PARAM_BUILD_BOOTLOADER", 54, "A043");

    /* renamed from: t0, reason: collision with root package name */
    public static final g f9174t0 = new g("PARAM_BUILD_BRAND", 55, "A044");

    /* renamed from: u0, reason: collision with root package name */
    public static final g f9177u0 = new g("PARAM_BUILD_DEVICE", 56, "A045");

    /* renamed from: v0, reason: collision with root package name */
    public static final g f9180v0 = new g("PARAM_BUILD_DISPLAY", 57, "A046");

    /* renamed from: w0, reason: collision with root package name */
    public static final g f9183w0 = new g("PARAM_BUILD_FINGERPRINT", 58, "A047");

    /* renamed from: x0, reason: collision with root package name */
    public static final g f9186x0 = new g("PARAM_BUILD_HARDWARE", 59, "A048");

    /* renamed from: y0, reason: collision with root package name */
    public static final g f9189y0 = new g("PARAM_BUILD_ID", 60, "A049");

    /* renamed from: z0, reason: collision with root package name */
    public static final g f9192z0 = new g("PARAM_BUILD_MANUFACTURER", 61, "A050");

    /* renamed from: A0, reason: collision with root package name */
    public static final g f9045A0 = new g("PARAM_BUILD_PRODUCT", 62, "A051");

    /* renamed from: B0, reason: collision with root package name */
    public static final g f9048B0 = new g("PARAM_BUILD_RADIO", 63, "A052");

    /* renamed from: C0, reason: collision with root package name */
    public static final g f9051C0 = new g("PARAM_BUILD_SERIAL", 64, "A053");

    /* renamed from: D0, reason: collision with root package name */
    public static final g f9054D0 = new g("PARAM_BUILD_SUPPORTED_32_BIT_ABIS", 65, "A054");

    /* renamed from: E0, reason: collision with root package name */
    public static final g f9057E0 = new g("PARAM_BUILD_SUPPORTED_64_BIT_ABIS", 66, "A055");

    /* renamed from: F0, reason: collision with root package name */
    public static final g f9060F0 = new g("PARAM_BUILD_TAGS", 67, "A056");

    /* renamed from: G0, reason: collision with root package name */
    public static final g f9063G0 = new g("PARAM_BUILD_TIME", 68, "A057");

    /* renamed from: H0, reason: collision with root package name */
    public static final g f9066H0 = new g("PARAM_BUILD_TYPE", 69, "A058");

    /* renamed from: I0, reason: collision with root package name */
    public static final g f9069I0 = new g("PARAM_BUILD_USER", 70, "A059");

    /* renamed from: J0, reason: collision with root package name */
    public static final g f9072J0 = new g("PARAM_BUILD_VERSION_CODENAME", 71, "A060");

    /* renamed from: K0, reason: collision with root package name */
    public static final g f9075K0 = new g("PARAM_BUILD_VERSION_INCREMENTAL", 72, "A061");

    /* renamed from: L0, reason: collision with root package name */
    public static final g f9078L0 = new g("PARAM_BUILD_VERSION_PREVIEW_SDK_INT", 73, "A062");

    /* renamed from: M0, reason: collision with root package name */
    public static final g f9081M0 = new g("PARAM_BUILD_VERSION_SDK_INT", 74, "A063");

    /* renamed from: N0, reason: collision with root package name */
    public static final g f9084N0 = new g("PARAM_BUILD_VERSION_SECURITY_PATCH", 75, "A064");

    /* renamed from: O0, reason: collision with root package name */
    public static final g f9087O0 = new g("PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED", 76, "A065");

    /* renamed from: P0, reason: collision with root package name */
    public static final g f9090P0 = new g("PARAM_SECURE_ACCESSIBILITY_ENABLED", 77, "A066");

    /* renamed from: Q0, reason: collision with root package name */
    public static final g f9093Q0 = new g("PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD", 78, "A067");

    /* renamed from: R0, reason: collision with root package name */
    public static final g f9096R0 = new g("PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS", 79, "A068");

    /* renamed from: S0, reason: collision with root package name */
    public static final g f9099S0 = new g("PARAM_SECURE_ANDROID_ID", 80, "A069");

    /* renamed from: T0, reason: collision with root package name */
    public static final g f9102T0 = new g("PARAM_SECURE_DATA_ROAMING", 81, "A070");

    /* renamed from: U0, reason: collision with root package name */
    public static final g f9105U0 = new g("PARAM_SECURE_DEFAULT_INPUT_METHOD", 82, "A071");

    /* renamed from: V0, reason: collision with root package name */
    public static final g f9108V0 = new g("PARAM_SECURE_DEVICE_PROVISIONED", 83, "A072");

    /* renamed from: W0, reason: collision with root package name */
    public static final g f9111W0 = new g("PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES", 84, "A073");

    /* renamed from: X0, reason: collision with root package name */
    public static final g f9114X0 = new g("PARAM_SECURE_ENABLED_INPUT_METHODS", 85, "A074");

    /* renamed from: Y0, reason: collision with root package name */
    public static final g f9117Y0 = new g("PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY", 86, "A075");

    /* renamed from: Z0, reason: collision with root package name */
    public static final g f9120Z0 = new g("PARAM_SECURE_INSTALL_NON_MARKET_APPS", 87, "A076");

    /* renamed from: a1, reason: collision with root package name */
    public static final g f9122a1 = new g("PARAM_SECURE_LOCATION_MODE", 88, "A077");

    /* renamed from: b1, reason: collision with root package name */
    public static final g f9125b1 = new g("PARAM_SECURE_SKIP_FIRST_USE_HINTS", 89, "A078");

    /* renamed from: c1, reason: collision with root package name */
    public static final g f9128c1 = new g("PARAM_SECURE_SYS_PROP_SETTING_VERSION", 90, "A079");

    /* renamed from: d1, reason: collision with root package name */
    public static final g f9131d1 = new g("PARAM_SECURE_TTS_DEFAULT_PITCH", 91, "A080");

    /* renamed from: e1, reason: collision with root package name */
    public static final g f9134e1 = new g("PARAM_SECURE_TTS_DEFAULT_RATE", 92, "A081");

    /* renamed from: f1, reason: collision with root package name */
    public static final g f9137f1 = new g("PARAM_SECURE_TTS_DEFAULT_SYNTH", 93, "A082");

    /* renamed from: g1, reason: collision with root package name */
    public static final g f9140g1 = new g("PARAM_SECURE_TTS_ENABLED_PLUGINS", 94, "A083");

    /* renamed from: h1, reason: collision with root package name */
    public static final g f9143h1 = new g("PARAM_GLOBAL_ADB_ENABLED", 95, "A084");

    /* renamed from: i1, reason: collision with root package name */
    public static final g f9146i1 = new g("PARAM_GLOBAL_AIRPLANE_MODE_RADIOS", 96, "A085");

    /* renamed from: j1, reason: collision with root package name */
    public static final g f9149j1 = new g("PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES", 97, "A086");

    /* renamed from: k1, reason: collision with root package name */
    public static final g f9152k1 = new g("PARAM_GLOBAL_ANIMATOR_DURATION_SCALE", 98, "A087");

    /* renamed from: l1, reason: collision with root package name */
    public static final g f9154l1 = new g("PARAM_GLOBAL_AUTO_TIME", 99, "A088");

    /* renamed from: m1, reason: collision with root package name */
    public static final g f9156m1 = new g("PARAM_GLOBAL_AUTO_TIME_ZONE", 100, "A089");

    /* renamed from: n1, reason: collision with root package name */
    public static final g f9158n1 = new g("PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED", 101, "A090");

    /* renamed from: o1, reason: collision with root package name */
    public static final g f9160o1 = new g("PARAM_GLOBAL_HTTP_PROXY", 102, "A091");

    /* renamed from: p1, reason: collision with root package name */
    public static final g f9163p1 = new g("PARAM_GLOBAL_NETWORK_PREFERENCE", 103, "A092");

    /* renamed from: q1, reason: collision with root package name */
    public static final g f9166q1 = new g("PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN", 104, "A093");

    /* renamed from: r1, reason: collision with root package name */
    public static final g f9169r1 = new g("PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE", 105, "A094");

    /* renamed from: s1, reason: collision with root package name */
    public static final g f9172s1 = new g("PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED", 106, "A095");

    /* renamed from: t1, reason: collision with root package name */
    public static final g f9175t1 = new g("PARAM_GLOBAL_USE_GOOGLE_MAIL", 107, "A096");

    /* renamed from: u1, reason: collision with root package name */
    public static final g f9178u1 = new g("PARAM_GLOBAL_WAIT_FOR_DEBUGGER", 108, "A097");

    /* renamed from: v1, reason: collision with root package name */
    public static final g f9181v1 = new g("PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON", 109, "A098");

    /* renamed from: w1, reason: collision with root package name */
    public static final g f9184w1 = new g("PARAM_SYSTEM_ACCELEROMETER_ROTATION", 110, "A099");

    /* renamed from: x1, reason: collision with root package name */
    public static final g f9187x1 = new g("PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY", 111, "A100");

    /* renamed from: y1, reason: collision with root package name */
    public static final g f9190y1 = new g("PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT", 112, "A101");

    /* renamed from: z1, reason: collision with root package name */
    public static final g f9193z1 = new g("PARAM_SYSTEM_DATE_FORMAT", 113, "A102");

    /* renamed from: A1, reason: collision with root package name */
    public static final g f9046A1 = new g("PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING", 114, "A103");

    /* renamed from: B1, reason: collision with root package name */
    public static final g f9049B1 = new g("PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING", 115, "A104");

    /* renamed from: C1, reason: collision with root package name */
    public static final g f9052C1 = new g("PARAM_SYSTEM_END_BUTTON_BEHAVIOR", 116, "A105");

    /* renamed from: D1, reason: collision with root package name */
    public static final g f9055D1 = new g("PARAM_SYSTEM_FONT_SCALE", 117, "A106");

    /* renamed from: E1, reason: collision with root package name */
    public static final g f9058E1 = new g("PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED", 118, "A107");

    /* renamed from: F1, reason: collision with root package name */
    public static final g f9061F1 = new g("PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED", 119, "A108");

    /* renamed from: G1, reason: collision with root package name */
    public static final g f9064G1 = new g("PARAM_SYSTEM_NOTIFICATION_SOUND", 120, "A109");

    /* renamed from: H1, reason: collision with root package name */
    public static final g f9067H1 = new g("PARAM_SYSTEM_MUTE_STREAMS_AFFECTED", 121, "A110");

    /* renamed from: I1, reason: collision with root package name */
    public static final g f9070I1 = new g("PARAM_SYSTEM_RINGTONE", 122, "A111");

    /* renamed from: J1, reason: collision with root package name */
    public static final g f9073J1 = new g("PARAM_SYSTEM_SCREEN_BRIGHTNESS", 123, "A112");

    /* renamed from: K1, reason: collision with root package name */
    public static final g f9076K1 = new g("PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE", 124, "A113");

    /* renamed from: L1, reason: collision with root package name */
    public static final g f9079L1 = new g("PARAM_SYSTEM_SCREEN_OFF_TIMEOUT", 125, "A114");

    /* renamed from: M1, reason: collision with root package name */
    public static final g f9082M1 = new g("PARAM_SYSTEM_SOUND_EFFECTS_ENABLED", 126, "A115");

    /* renamed from: N1, reason: collision with root package name */
    public static final g f9085N1 = new g("PARAM_SYSTEM_TEXT_AUTO_CAPS", 127, "A116");

    /* renamed from: O1, reason: collision with root package name */
    public static final g f9088O1 = new g("PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE", 128, "A117");

    /* renamed from: P1, reason: collision with root package name */
    public static final g f9091P1 = new g("PARAM_SYSTEM_TEXT_AUTO_REPLACE", TsExtractor.TS_STREAM_TYPE_AC3, "A118");

    /* renamed from: Q1, reason: collision with root package name */
    public static final g f9094Q1 = new g("PARAM_SYSTEM_TEXT_SHOW_PASSWORD", TsExtractor.TS_STREAM_TYPE_HDMV_DTS, "A119");

    /* renamed from: R1, reason: collision with root package name */
    public static final g f9097R1 = new g("PARAM_SYSTEM_TIME_12_24", 131, "A120");

    /* renamed from: S1, reason: collision with root package name */
    public static final g f9100S1 = new g("PARAM_SYSTEM_USER_ROTATION", 132, "A121");

    /* renamed from: T1, reason: collision with root package name */
    public static final g f9103T1 = new g("PARAM_SYSTEM_VIBRATE_ON", 133, "A122");

    /* renamed from: U1, reason: collision with root package name */
    public static final g f9106U1 = new g("PARAM_SYSTEM_VIBRATE_WHEN_RINGING", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, "A123");

    /* renamed from: V1, reason: collision with root package name */
    public static final g f9109V1 = new g("PARAM_PACKAGE_IS_SAFE_MODE", TsExtractor.TS_STREAM_TYPE_E_AC3, "A124");

    /* renamed from: W1, reason: collision with root package name */
    public static final g f9112W1 = new g("PARAM_PACKAGE_GET_INSTALLED_APPS", 136, "A125");

    /* renamed from: X1, reason: collision with root package name */
    public static final g f9115X1 = new g("PARAM_PACKAGE_INSTALLER_PACKAGE_NAME", 137, "A126");

    /* renamed from: Y1, reason: collision with root package name */
    public static final g f9118Y1 = new g("PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES", TsExtractor.TS_STREAM_TYPE_DTS, "A127");

    /* renamed from: Z1, reason: collision with root package name */
    public static final g f9121Z1 = new g("PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES", 139, "A128");

    /* renamed from: a2, reason: collision with root package name */
    public static final g f9123a2 = new g("PARAM_ENV_EXTERNAL_STORAGE_STATE", 140, "A129");

    /* renamed from: b2, reason: collision with root package name */
    public static final g f9126b2 = new g("PARAM_LOCALE_AVAILABLE_LOCALES", 141, "A130");

    /* renamed from: c2, reason: collision with root package name */
    public static final g f9129c2 = new g("PARAM_DISPLAY_DENSITY", 142, "A131");

    /* renamed from: d2, reason: collision with root package name */
    public static final g f9132d2 = new g("PARAM_DISPLAY_DENSITY_DPI", 143, "A132");

    /* renamed from: e2, reason: collision with root package name */
    public static final g f9135e2 = new g("PARAM_DISPLAY_SCALED_DENSITY", 144, "A133");

    /* renamed from: f2, reason: collision with root package name */
    public static final g f9138f2 = new g("PARAM_DISPLAY_XDPI", 145, "A134");

    /* renamed from: g2, reason: collision with root package name */
    public static final g f9141g2 = new g("PARAM_DISPLAY_YDPI", 146, "A135");

    /* renamed from: h2, reason: collision with root package name */
    public static final g f9144h2 = new g("PARAM_STAT_FS_TOTAL_BYTES", 147, "A136");

    static {
        g[] a8 = a();
        f9147i2 = a8;
        f9150j2 = R5.b.a(a8);
    }

    private g(String str, int i8, String str2) {
        this.f9194a = str2;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f9124b, f9127c, f9130d, f9133e, f9136f, f9139g, f9142h, f9145i, f9148j, f9151k, f9153l, f9155m, f9157n, f9159o, f9161p, f9164q, f9167r, f9170s, f9173t, f9176u, f9179v, f9182w, f9185x, f9188y, f9191z, f9044A, f9047B, f9050C, f9053D, f9056E, f9059F, f9062G, f9065H, f9068I, f9071J, f9074K, f9077L, f9080M, f9083N, f9086O, f9089P, f9092Q, f9095R, f9098S, f9101T, f9104U, f9107V, f9110W, f9113X, f9116Y, f9119Z, f9162p0, f9165q0, f9168r0, f9171s0, f9174t0, f9177u0, f9180v0, f9183w0, f9186x0, f9189y0, f9192z0, f9045A0, f9048B0, f9051C0, f9054D0, f9057E0, f9060F0, f9063G0, f9066H0, f9069I0, f9072J0, f9075K0, f9078L0, f9081M0, f9084N0, f9087O0, f9090P0, f9093Q0, f9096R0, f9099S0, f9102T0, f9105U0, f9108V0, f9111W0, f9114X0, f9117Y0, f9120Z0, f9122a1, f9125b1, f9128c1, f9131d1, f9134e1, f9137f1, f9140g1, f9143h1, f9146i1, f9149j1, f9152k1, f9154l1, f9156m1, f9158n1, f9160o1, f9163p1, f9166q1, f9169r1, f9172s1, f9175t1, f9178u1, f9181v1, f9184w1, f9187x1, f9190y1, f9193z1, f9046A1, f9049B1, f9052C1, f9055D1, f9058E1, f9061F1, f9064G1, f9067H1, f9070I1, f9073J1, f9076K1, f9079L1, f9082M1, f9085N1, f9088O1, f9091P1, f9094Q1, f9097R1, f9100S1, f9103T1, f9106U1, f9109V1, f9112W1, f9115X1, f9118Y1, f9121Z1, f9123a2, f9126b2, f9129c2, f9132d2, f9135e2, f9138f2, f9141g2, f9144h2};
    }

    public static R5.a b() {
        return f9150j2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f9147i2.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9194a;
    }
}
