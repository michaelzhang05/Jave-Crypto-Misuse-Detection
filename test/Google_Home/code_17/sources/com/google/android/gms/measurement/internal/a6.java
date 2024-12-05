package com.google.android.gms.measurement.internal;

import N.AbstractC1341l;
import N.C1337h;
import Q.AbstractC1400p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.W7;
import com.google.android.gms.internal.measurement.u8;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import l0.AbstractC3279n;
import l0.AbstractC3281p;
import l0.AbstractC3282q;
import l0.AbstractC3284s;

/* loaded from: classes3.dex */
public final class a6 extends AbstractC2444t3 {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f17453i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f17454j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f17455c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f17456d;

    /* renamed from: e, reason: collision with root package name */
    private int f17457e;

    /* renamed from: f, reason: collision with root package name */
    private MeasurementManagerFutures f17458f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f17459g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f17460h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a6(R2 r22) {
        super(r22);
        this.f17460h = null;
        this.f17456d = new AtomicLong(0L);
    }

    public static long A(C c8) {
        long j8 = 0;
        if (c8 == null) {
            return 0L;
        }
        Iterator it = c8.iterator();
        while (it.hasNext()) {
            if (c8.H((String) it.next()) instanceof Parcelable[]) {
                j8 += ((Parcelable[]) r3).length;
            }
        }
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long B(byte[] bArr) {
        boolean z8;
        AbstractC1400p.l(bArr);
        int i8 = 0;
        if (bArr.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1400p.o(z8);
        long j8 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j8 += (bArr[length] & 255) << i8;
            i8 += 8;
        }
        return j8;
    }

    private static boolean B0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static Bundle D(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i8 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i8 < parcelableArr.length) {
                        if (parcelableArr[i8] instanceof Bundle) {
                            parcelableArr[i8] = new Bundle((Bundle) parcelableArr[i8]);
                        }
                        i8++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i8 < list.size()) {
                        Object obj2 = list.get(i8);
                        if (obj2 instanceof Bundle) {
                            list.set(i8, new Bundle((Bundle) obj2));
                        }
                        i8++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean D0(String str) {
        return G0((String) H.f17116e0.a(null), str);
    }

    public static Bundle G(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            V5 v52 = (V5) it.next();
            String str = v52.f17390e;
            if (str != null) {
                bundle.putString(v52.f17387b, str);
            } else {
                Long l8 = v52.f17389d;
                if (l8 != null) {
                    bundle.putLong(v52.f17387b, l8.longValue());
                } else {
                    Double d8 = v52.f17392g;
                    if (d8 != null) {
                        bundle.putDouble(v52.f17387b, d8.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private static boolean G0(String str, String str2) {
        if (!str.equals("*") && !Arrays.asList(str.split(",")).contains(str2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean H0(String str) {
        return G0((String) H.f17169z0.a(null), str);
    }

    private final Object I(int i8, Object obj, boolean z8, boolean z9, String str) {
        Bundle E8;
        long j8;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j8 = 1;
                } else {
                    j8 = 0;
                }
                return Long.valueOf(j8);
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if (!z9 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if ((parcelable instanceof Bundle) && (E8 = E((Bundle) parcelable, null)) != null && !E8.isEmpty()) {
                        arrayList.add(E8);
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return J(String.valueOf(obj), i8, z8);
        }
        return obj;
    }

    public static String J(String str, int i8, boolean z8) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i8) {
            if (!z8) {
                return null;
            }
            return str.substring(0, str.offsetByCodePoints(0, i8)) + "...";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean J0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    private static void L(Bundle bundle, int i8, String str, Object obj) {
        if (v0(bundle, i8)) {
            bundle.putString("_ev", J(str, 40, true));
            if (obj != null) {
                AbstractC1400p.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean L0(String str) {
        AbstractC1400p.f(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static boolean N0(String str) {
        for (String str2 : f17454j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int O0(String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (!o0("event param", null, str)) {
            return 14;
        }
        if (!j0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private final int P0(String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (!o0("event param", null, str)) {
            return 14;
        }
        if (!j0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    private static int Q0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        if ("_lgclid".equals(str)) {
            return 100;
        }
        return 36;
    }

    private static boolean T0(String str) {
        AbstractC1400p.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest V0() {
        MessageDigest messageDigest;
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void X(C2459v4 c2459v4, Bundle bundle, boolean z8) {
        if (bundle != null && c2459v4 != null && (!bundle.containsKey("_sc") || z8)) {
            String str = c2459v4.f17864a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = c2459v4.f17865b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", c2459v4.f17866c);
            return;
        }
        if (bundle != null && c2459v4 == null && z8) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void Y(Z5 z52, int i8, String str, String str2, int i9) {
        Z(z52, null, i8, str, str2, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Z(Z5 z52, String str, int i8, String str2, String str3, int i9) {
        Bundle bundle = new Bundle();
        v0(bundle, i8);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i8 == 6 || i8 == 7 || i8 == 2) {
            bundle.putLong("_el", i9);
        }
        z52.b(str, "_err", bundle);
    }

    private final boolean Z0() {
        Integer num;
        if (this.f17459g == null) {
            MeasurementManagerFutures S02 = S0();
            boolean z8 = false;
            if (S02 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) S02.getMeasurementApiStatusAsync().get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z8 = true;
                        }
                    } catch (InterruptedException e8) {
                        e = e8;
                        num2 = num;
                        c().L().b("Measurement manager api exception", e);
                        this.f17459g = Boolean.FALSE;
                        num = num2;
                        c().K().b("Measurement manager api status result", num);
                        return this.f17459g.booleanValue();
                    } catch (CancellationException e9) {
                        e = e9;
                        num2 = num;
                        c().L().b("Measurement manager api exception", e);
                        this.f17459g = Boolean.FALSE;
                        num = num2;
                        c().K().b("Measurement manager api status result", num);
                        return this.f17459g.booleanValue();
                    } catch (ExecutionException e10) {
                        e = e10;
                        num2 = num;
                        c().L().b("Measurement manager api exception", e);
                        this.f17459g = Boolean.FALSE;
                        num = num2;
                        c().K().b("Measurement manager api status result", num);
                        return this.f17459g.booleanValue();
                    } catch (TimeoutException e11) {
                        e = e11;
                        num2 = num;
                        c().L().b("Measurement manager api exception", e);
                        this.f17459g = Boolean.FALSE;
                        num = num2;
                        c().K().b("Measurement manager api status result", num);
                        return this.f17459g.booleanValue();
                    }
                }
                this.f17459g = Boolean.valueOf(z8);
            } catch (InterruptedException e12) {
                e = e12;
            } catch (CancellationException e13) {
                e = e13;
            } catch (ExecutionException e14) {
                e = e14;
            } catch (TimeoutException e15) {
                e = e15;
            }
            c().K().b("Measurement manager api status result", num);
        }
        return this.f17459g.booleanValue();
    }

    private final void a0(String str, String str2, String str3, Bundle bundle, List list, boolean z8) {
        int i8;
        String str4;
        String str5;
        int u8;
        if (bundle == null) {
            return;
        }
        int A8 = a().A();
        int i9 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list != null && list.contains(str6)) {
                i8 = 0;
            } else {
                if (!z8) {
                    i8 = P0(str6);
                } else {
                    i8 = 0;
                }
                if (i8 == 0) {
                    i8 = O0(str6);
                }
            }
            if (i8 != 0) {
                if (i8 == 3) {
                    str4 = str6;
                } else {
                    str4 = null;
                }
                L(bundle, i8, str6, str4);
                bundle.remove(str6);
            } else {
                if (h0(bundle.get(str6))) {
                    c().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    u8 = 22;
                    str5 = str6;
                } else {
                    str5 = str6;
                    u8 = u(str, str2, str6, bundle.get(str6), bundle, list, z8, false);
                }
                if (u8 != 0 && !"_ev".equals(str5)) {
                    L(bundle, u8, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (L0(str5) && !n0(str5, AbstractC3281p.f34214d)) {
                    int i10 = i9 + 1;
                    if (!c0(231100000, true)) {
                        c().H().c("Item array not supported on client's version of Google Play Services (Android Only)", d().c(str2), d().a(bundle));
                        v0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i10 > A8) {
                        if (W7.a() && a().q(H.f17062F0)) {
                            c().H().c("Item can't contain more than " + A8 + " item-scoped custom params", d().c(str2), d().a(bundle));
                            v0(bundle, 28);
                            bundle.remove(str5);
                        } else {
                            c().H().c("Item cannot contain custom parameters", d().c(str2), d().a(bundle));
                            v0(bundle, 23);
                            bundle.remove(str5);
                        }
                    }
                    i9 = i10;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC1400p.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e0(Context context, boolean z8) {
        AbstractC1400p.l(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return B0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return B0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g0(Bundle bundle, int i8) {
        int i9 = 0;
        if (bundle.size() <= i8) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i9++;
            if (i9 > i8) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h0(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            AbstractC1400p.l(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        }
        if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            }
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        }
        if (!isEmpty && isEmpty2) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        }
        if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        }
        return false;
    }

    private static boolean n0(String str, String[] strArr) {
        AbstractC1400p.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] q0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList t0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2350g c2350g = (C2350g) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.APP_ID, c2350g.f17578a);
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, c2350g.f17579b);
            bundle.putLong("creation_timestamp", c2350g.f17581d);
            bundle.putString("name", c2350g.f17580c.f17387b);
            AbstractC3279n.b(bundle, AbstractC1400p.l(c2350g.f17580c.p()));
            bundle.putBoolean("active", c2350g.f17582e);
            String str = c2350g.f17583f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            G g8 = c2350g.f17584g;
            if (g8 != null) {
                bundle.putString("timed_out_event_name", g8.f17033a);
                C c8 = g8.f17034b;
                if (c8 != null) {
                    bundle.putBundle("timed_out_event_params", c8.y());
                }
            }
            bundle.putLong("trigger_timeout", c2350g.f17585h);
            G g9 = c2350g.f17586i;
            if (g9 != null) {
                bundle.putString("triggered_event_name", g9.f17033a);
                C c9 = g9.f17034b;
                if (c9 != null) {
                    bundle.putBundle("triggered_event_params", c9.y());
                }
            }
            bundle.putLong("triggered_timestamp", c2350g.f17580c.f17388c);
            bundle.putLong("time_to_live", c2350g.f17587j);
            G g10 = c2350g.f17588k;
            if (g10 != null) {
                bundle.putString("expired_event_name", g10.f17033a);
                C c10 = g10.f17034b;
                if (c10 != null) {
                    bundle.putBundle("expired_event_params", c10.y());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int u(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a6.u(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    private final boolean u0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e8 = X.e.a(context).e(str, 64);
            if (e8 != null && (signatureArr = e8.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e9) {
            c().G().b("Package name not found", e9);
            return true;
        } catch (CertificateException e10) {
            c().G().b("Error obtaining certificate", e10);
            return true;
        }
    }

    public static long v(long j8, long j9) {
        return (j8 + (j9 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS)) / 86400000;
    }

    private static boolean v0(Bundle bundle, int i8) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle[] x0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y0() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion > 3) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
                return extensionVersion2;
            }
            return 0;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object A0(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return I(Q0(str), obj, true, false, null);
        }
        return I(Q0(str), obj, false, false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle C(Uri uri, boolean z8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                if (z8) {
                    str5 = uri.getQueryParameter("gbraid");
                } else {
                    str5 = null;
                }
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z8 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z8 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (z8 && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e8) {
            c().L().b("Install referrer url isn't a hierarchical URI", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean C0(String str, String str2) {
        if (str2 == null) {
            c().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            c().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            c().H().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                c().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle E(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object s02 = s0(str2, bundle.get(str2));
                if (s02 == null) {
                    c().M().b("Param value can't be null", d().f(str2));
                } else {
                    O(bundle2, str2, s02);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E0(String str, String str2) {
        if (u8.a() && a().q(H.f17167y0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().V().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle F(String str, String str2, Bundle bundle, List list, boolean z8) {
        int i8;
        int i9;
        String str3;
        String str4;
        a6 a6Var = this;
        boolean n02 = n0(str2, AbstractC3282q.f34218d);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int K8 = a().K();
            int i10 = 0;
            for (String str5 : new TreeSet(bundle.keySet())) {
                if (list != null && list.contains(str5)) {
                    i8 = 0;
                } else {
                    if (!z8) {
                        i8 = a6Var.P0(str5);
                    } else {
                        i8 = 0;
                    }
                    if (i8 == 0) {
                        i8 = a6Var.O0(str5);
                    }
                }
                if (i8 != 0) {
                    if (i8 == 3) {
                        str4 = str5;
                    } else {
                        str4 = null;
                    }
                    L(bundle2, i8, str5, str4);
                    bundle2.remove(str5);
                    i9 = K8;
                } else {
                    i9 = K8;
                    int u8 = u(str, str2, str5, bundle.get(str5), bundle2, list, z8, n02);
                    if (u8 == 17) {
                        L(bundle2, u8, str5, Boolean.FALSE);
                    } else if (u8 != 0 && !"_ev".equals(str5)) {
                        if (u8 == 21) {
                            str3 = str2;
                        } else {
                            str3 = str5;
                        }
                        L(bundle2, u8, str3, bundle.get(str5));
                        bundle2.remove(str5);
                    }
                    if (L0(str5)) {
                        int i11 = i10 + 1;
                        if (i11 > i9) {
                            c().H().c("Event can't contain more than " + i9 + " params", d().c(str2), d().a(bundle));
                            v0(bundle2, 5);
                            bundle2.remove(str5);
                        }
                        i10 = i11;
                    }
                }
                K8 = i9;
                a6Var = this;
            }
            return bundle2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F0(String str) {
        k();
        if (X.e.a(w()).a(str) == 0) {
            return true;
        }
        c().F().b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final G H(String str, String str2, Bundle bundle, String str3, long j8, boolean z8, boolean z9) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (s(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            Bundle F8 = F(str, str2, bundle2, V.e.a("_o"), true);
            if (z8) {
                F8 = E(F8, str);
            }
            AbstractC1400p.l(F8);
            return new G(str2, new C(F8), str3, j8);
        }
        c().G().b("Invalid conditional property event name", d().g(str2));
        throw new IllegalArgumentException();
    }

    public final int I0() {
        if (this.f17460h == null) {
            this.f17460h = Integer.valueOf(C1337h.f().a(w()) / 1000);
        }
        return this.f17460h.intValue();
    }

    public final URL K(long j8, String str, String str2, long j9, String str3) {
        try {
            AbstractC1400p.f(str2);
            AbstractC1400p.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j8), Integer.valueOf(I0())), str2, str, Long.valueOf(j9));
            if (str.equals(a().W())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e8) {
            e = e8;
            c().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e9) {
            e = e9;
            c().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long K0() {
        int extensionVersion;
        long j8;
        k();
        if (!D0(this.f17844a.B().F())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j8 = 8;
            } else if (y0() < ((Integer) H.f17099Y.a(null)).intValue()) {
                j8 = 16;
            } else {
                j8 = 0;
            }
        } else {
            j8 = 4;
        }
        if (!F0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j8 |= 2;
        }
        if (j8 == 0 && !Z0()) {
            j8 |= 64;
        }
        if (j8 == 0) {
            return 1L;
        }
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M(Bundle bundle, long j8) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            c().L().b("Params already contained engagement", Long.valueOf(j9));
        }
        bundle.putLong("_et", j8 + j9);
    }

    public final boolean M0(String str) {
        List<ResolveInfo> queryIntentActivities;
        if (TextUtils.isEmpty(str) || (queryIntentActivities = w().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                h().O(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            c().M().c("Not putting event parameter. Invalid value type. name, type", d().f(str), str2);
        }
    }

    public final void P(com.google.android.gms.internal.measurement.R0 r02, int i8) {
        Bundle bundle = new Bundle();
        bundle.putInt(CampaignEx.JSON_KEY_AD_R, i8);
        try {
            r02.e(bundle);
        } catch (RemoteException e8) {
            this.f17844a.c().L().b("Error returning int value to wrapper", e8);
        }
    }

    public final void Q(com.google.android.gms.internal.measurement.R0 r02, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong(CampaignEx.JSON_KEY_AD_R, j8);
        try {
            r02.e(bundle);
        } catch (RemoteException e8) {
            this.f17844a.c().L().b("Error returning long value to wrapper", e8);
        }
    }

    public final void R(com.google.android.gms.internal.measurement.R0 r02, Bundle bundle) {
        try {
            r02.e(bundle);
        } catch (RemoteException e8) {
            this.f17844a.c().L().b("Error returning bundle value to wrapper", e8);
        }
    }

    public final long R0() {
        long andIncrement;
        long j8;
        if (this.f17456d.get() == 0) {
            synchronized (this.f17456d) {
                long nextLong = new Random(System.nanoTime() ^ x().currentTimeMillis()).nextLong();
                int i8 = this.f17457e + 1;
                this.f17457e = i8;
                j8 = nextLong + i8;
            }
            return j8;
        }
        synchronized (this.f17456d) {
            this.f17456d.compareAndSet(-1L, 1L);
            andIncrement = this.f17456d.getAndIncrement();
        }
        return andIncrement;
    }

    public final void S(com.google.android.gms.internal.measurement.R0 r02, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(CampaignEx.JSON_KEY_AD_R, str);
        try {
            r02.e(bundle);
        } catch (RemoteException e8) {
            this.f17844a.c().L().b("Error returning string value to wrapper", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MeasurementManagerFutures S0() {
        if (this.f17458f == null) {
            this.f17458f = MeasurementManagerFutures.from(w());
        }
        return this.f17458f;
    }

    public final void T(com.google.android.gms.internal.measurement.R0 r02, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(CampaignEx.JSON_KEY_AD_R, arrayList);
        try {
            r02.e(bundle);
        } catch (RemoteException e8) {
            this.f17844a.c().L().b("Error returning bundle list to wrapper", e8);
        }
    }

    public final void U(com.google.android.gms.internal.measurement.R0 r02, boolean z8) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CampaignEx.JSON_KEY_AD_R, z8);
        try {
            r02.e(bundle);
        } catch (RemoteException e8) {
            this.f17844a.c().L().b("Error returning boolean value to wrapper", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String U0() {
        byte[] bArr = new byte[16];
        W0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void V(com.google.android.gms.internal.measurement.R0 r02, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(CampaignEx.JSON_KEY_AD_R, bArr);
        try {
            r02.e(bundle);
        } catch (RemoteException e8) {
            this.f17844a.c().L().b("Error returning byte array to wrapper", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W(C2395m2 c2395m2, int i8) {
        int i9 = 0;
        for (String str : new TreeSet(c2395m2.f17718d.keySet())) {
            if (L0(str) && (i9 = i9 + 1) > i8) {
                c().H().c("Event can't contain more than " + i8 + " params", d().c(c2395m2.f17715a), d().a(c2395m2.f17718d));
                v0(c2395m2.f17718d, 5);
                c2395m2.f17718d.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SecureRandom W0() {
        k();
        if (this.f17455c == null) {
            this.f17455c = new SecureRandom();
        }
        return this.f17455c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X0() {
        k();
        if (K0() == 1) {
            return true;
        }
        return false;
    }

    public final boolean Y0() {
        try {
            w().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0(Parcelable[] parcelableArr, int i8, boolean z8) {
        AbstractC1400p.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i9 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (L0(str) && !n0(str, AbstractC3281p.f34214d) && (i9 = i9 + 1) > i8) {
                    if (z8) {
                        c().H().c("Param can't contain more than " + i8 + " item-scoped custom parameters", d().f(str), d().a(bundle));
                        v0(bundle, 28);
                    } else {
                        c().H().c("Param cannot contain item-scoped custom parameters", d().f(str), d().a(bundle));
                        v0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    public final boolean c0(int i8, boolean z8) {
        Boolean W7 = this.f17844a.J().W();
        if (I0() < i8 / 1000) {
            if (W7 == null || W7.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i0(String str, double d8) {
        try {
            SharedPreferences.Editor edit = w().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong(CampaignEx.JSON_KEY_TIMESTAMP, Double.doubleToRawLongBits(d8));
            return edit.commit();
        } catch (RuntimeException e8) {
            c().G().b("Failed to persist Deferred Deep Link. exception", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j0(String str, int i8, String str2) {
        if (str2 == null) {
            c().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i8) {
            c().H().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i8), str2);
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!T0(str)) {
                if (this.f17844a.o()) {
                    c().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2367i2.s(str));
                }
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!T0(str2)) {
                c().H().b("Invalid admob_app_id. Analytics disabled.", C2367i2.s(str2));
                return false;
            }
            return true;
        }
        if (this.f17844a.o()) {
            c().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2444t3
    protected final void l() {
        k();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                c().L().a("Utils falling back to Random for random id");
            }
        }
        this.f17456d.set(nextLong);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l0(String str, String str2, int i8, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i8) {
                c().M().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o0(String str, String[] strArr, String str2) {
        return p0(str, strArr, null, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            c().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC1400p.l(str2);
        for (String str3 : f17453i) {
            if (str2.startsWith(str3)) {
                c().H().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && n0(str2, strArr)) {
            if (strArr2 == null || !n0(str2, strArr2)) {
                c().H().c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2444t3
    protected final boolean q() {
        return true;
    }

    public final int r(int i8) {
        return C1337h.f().h(w(), AbstractC1341l.f7472a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int r0(String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (!o0("user property", AbstractC3284s.f34219a, str)) {
            return 15;
        }
        if (!j0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int s(String str) {
        if (!w0(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!p0(NotificationCompat.CATEGORY_EVENT, AbstractC3282q.f34215a, AbstractC3282q.f34216b, str)) {
            return 13;
        }
        if (!j0(NotificationCompat.CATEGORY_EVENT, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object s0(String str, Object obj) {
        int o8;
        if ("_ev".equals(str)) {
            return I(a().z(null, false), obj, true, true, null);
        }
        if (J0(str)) {
            o8 = a().z(null, false);
        } else {
            o8 = a().o(null, false);
        }
        return I(o8, obj, false, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int t(String str, Object obj) {
        boolean l02;
        if ("_ldl".equals(str)) {
            l02 = l0("user property referrer", str, Q0(str), obj);
        } else {
            l02 = l0("user property", str, Q0(str), obj);
        }
        if (l02) {
            return 0;
        }
        return 7;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w0(String str, String str2) {
        if (str2 == null) {
            c().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            c().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            c().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                c().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0066 -> B:8:0x0073). Please report as a decompilation issue!!! */
    public final long z(Context context, String str) {
        k();
        AbstractC1400p.l(context);
        AbstractC1400p.f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest V02 = V0();
        long j8 = -1;
        if (V02 == null) {
            c().G().a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e8) {
                    c().G().b("Package name not found", e8);
                }
                if (!u0(context, str)) {
                    Signature[] signatureArr = X.e.a(context).e(w().getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        j8 = B(V02.digest(signatureArr[0].toByteArray()));
                    } else {
                        c().L().a("Could not get signatures");
                    }
                }
            }
            j8 = 0;
        }
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long z0(String str) {
        if (w().getPackageManager() == null) {
            return 0L;
        }
        int i8 = 0;
        try {
            ApplicationInfo c8 = X.e.a(w()).c(str, 0);
            if (c8 != null) {
                i8 = c8.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            c().J().b("PackageManager failed to find running app: app_id", str);
        }
        return i8;
    }
}
