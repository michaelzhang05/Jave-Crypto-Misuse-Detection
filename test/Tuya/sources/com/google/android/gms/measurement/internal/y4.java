package com.google.android.gms.measurement.internal;

import O.AbstractC1268l;
import O.C1264h;
import R.AbstractC1319p;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.C2122v6;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import m0.AbstractC3385B;

/* loaded from: classes3.dex */
public final class y4 extends AbstractC2258s2 {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f16940g = {"firebase_", "google_", "ga_"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f16941h = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f16942c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f16943d;

    /* renamed from: e, reason: collision with root package name */
    private int f16944e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f16945f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y4(Y1 y12) {
        super(y12);
        this.f16945f = null;
        this.f16943d = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean Y(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean Z(String str) {
        AbstractC1319p.f(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC1319p.l(context);
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
    public static boolean b0(Context context, boolean z8) {
        AbstractC1319p.l(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return k0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return k0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean c0(String str) {
        if (f16941h[0].equals(str)) {
            return false;
        }
        return true;
    }

    static final boolean f0(Bundle bundle, int i8) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i8);
        return true;
    }

    static final boolean g0(String str) {
        AbstractC1319p.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int h0(String str) {
        if ("_ldl".equals(str)) {
            this.f16777a.z();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f16777a.z();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f16777a.z();
            return 100;
        }
        this.f16777a.z();
        return 36;
    }

    private final Object i0(int i8, Object obj, boolean z8, boolean z9) {
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
                if (true != ((Boolean) obj).booleanValue()) {
                    j8 = 0;
                } else {
                    j8 = 1;
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
                    if (parcelable instanceof Bundle) {
                        Bundle w02 = w0((Bundle) parcelable);
                        if (!w02.isEmpty()) {
                            arrayList.add(w02);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return r(obj.toString(), i8, z8);
        }
        return obj;
    }

    private static boolean j0(String str, String[] strArr) {
        AbstractC1319p.l(strArr);
        for (String str2 : strArr) {
            if (AbstractC3385B.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean k0(Context context, String str) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long s0(byte[] bArr) {
        boolean z8;
        AbstractC1319p.l(bArr);
        int length = bArr.length;
        int i8 = 0;
        if (length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.o(z8);
        long j8 = 0;
        for (int i9 = length - 1; i9 >= 0 && i9 >= bArr.length - 8; i9--) {
            j8 += (bArr[i9] & 255) << i8;
            i8 += 8;
        }
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest t() {
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

    public static ArrayList v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2173d c2173d = (C2173d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.APP_ID, c2173d.f16446a);
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, c2173d.f16447b);
            bundle.putLong("creation_timestamp", c2173d.f16449d);
            bundle.putString("name", c2173d.f16448c.f16878b);
            m0.n.b(bundle, AbstractC1319p.l(c2173d.f16448c.s()));
            bundle.putBoolean("active", c2173d.f16450e);
            String str = c2173d.f16451f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C2270v c2270v = c2173d.f16452g;
            if (c2270v != null) {
                bundle.putString("timed_out_event_name", c2270v.f16884a);
                C2260t c2260t = c2270v.f16885b;
                if (c2260t != null) {
                    bundle.putBundle("timed_out_event_params", c2260t.z());
                }
            }
            bundle.putLong("trigger_timeout", c2173d.f16453h);
            C2270v c2270v2 = c2173d.f16454i;
            if (c2270v2 != null) {
                bundle.putString("triggered_event_name", c2270v2.f16884a);
                C2260t c2260t2 = c2270v2.f16885b;
                if (c2260t2 != null) {
                    bundle.putBundle("triggered_event_params", c2260t2.z());
                }
            }
            bundle.putLong("triggered_timestamp", c2173d.f16448c.f16879c);
            bundle.putLong("time_to_live", c2173d.f16455j);
            C2270v c2270v3 = c2173d.f16456k;
            if (c2270v3 != null) {
                bundle.putString("expired_event_name", c2270v3.f16884a);
                C2260t c2260t3 = c2270v3.f16885b;
                if (c2260t3 != null) {
                    bundle.putBundle("expired_event_params", c2260t3.z());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void y(C2177d3 c2177d3, Bundle bundle, boolean z8) {
        if (bundle != null && c2177d3 != null) {
            if (bundle.containsKey("_sc") && !z8) {
                z8 = false;
            } else {
                String str = c2177d3.f16463a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c2177d3.f16464b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c2177d3.f16465c);
                return;
            }
        }
        if (bundle != null && c2177d3 == null && z8) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(Parcelable[] parcelableArr, int i8, boolean z8) {
        AbstractC1319p.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i9 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (Z(str) && !j0(str, m0.r.f34890d) && (i9 = i9 + 1) > i8) {
                    if (z8) {
                        this.f16777a.d().s().c("Param can't contain more than " + i8 + " item-scoped custom parameters", this.f16777a.D().e(str), this.f16777a.D().b(bundle));
                        f0(bundle, 28);
                    } else {
                        this.f16777a.d().s().c("Param cannot contain item-scoped custom parameters", this.f16777a.D().e(str), this.f16777a.D().b(bundle));
                        f0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(C2272v1 c2272v1, int i8) {
        int i9 = 0;
        for (String str : new TreeSet(c2272v1.f16892d.keySet())) {
            if (Z(str) && (i9 = i9 + 1) > i8) {
                this.f16777a.d().s().c("Event can't contain more than " + i8 + " params", this.f16777a.D().d(c2272v1.f16889a), this.f16777a.D().b(c2272v1.f16892d));
                f0(c2272v1.f16892d, 5);
                c2272v1.f16892d.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(x4 x4Var, String str, int i8, String str2, String str3, int i9) {
        Bundle bundle = new Bundle();
        f0(bundle, i8);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i8 == 6 || i8 == 7 || i8 == 2) {
            bundle.putLong("_el", i9);
        }
        x4Var.a(str, "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(Bundle bundle, String str, Object obj) {
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
            this.f16777a.d().x().c("Not putting event parameter. Invalid value type. name, type", this.f16777a.D().e(str), str2);
        }
    }

    public final void E(InterfaceC2029k0 interfaceC2029k0, boolean z8) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CampaignEx.JSON_KEY_AD_R, z8);
        try {
            interfaceC2029k0.G(bundle);
        } catch (RemoteException e8) {
            this.f16777a.d().w().b("Error returning boolean value to wrapper", e8);
        }
    }

    public final void F(InterfaceC2029k0 interfaceC2029k0, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(CampaignEx.JSON_KEY_AD_R, arrayList);
        try {
            interfaceC2029k0.G(bundle);
        } catch (RemoteException e8) {
            this.f16777a.d().w().b("Error returning bundle list to wrapper", e8);
        }
    }

    public final void G(InterfaceC2029k0 interfaceC2029k0, Bundle bundle) {
        try {
            interfaceC2029k0.G(bundle);
        } catch (RemoteException e8) {
            this.f16777a.d().w().b("Error returning bundle value to wrapper", e8);
        }
    }

    public final void H(InterfaceC2029k0 interfaceC2029k0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(CampaignEx.JSON_KEY_AD_R, bArr);
        try {
            interfaceC2029k0.G(bundle);
        } catch (RemoteException e8) {
            this.f16777a.d().w().b("Error returning byte array to wrapper", e8);
        }
    }

    public final void I(InterfaceC2029k0 interfaceC2029k0, int i8) {
        Bundle bundle = new Bundle();
        bundle.putInt(CampaignEx.JSON_KEY_AD_R, i8);
        try {
            interfaceC2029k0.G(bundle);
        } catch (RemoteException e8) {
            this.f16777a.d().w().b("Error returning int value to wrapper", e8);
        }
    }

    public final void J(InterfaceC2029k0 interfaceC2029k0, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong(CampaignEx.JSON_KEY_AD_R, j8);
        try {
            interfaceC2029k0.G(bundle);
        } catch (RemoteException e8) {
            this.f16777a.d().w().b("Error returning long value to wrapper", e8);
        }
    }

    public final void K(InterfaceC2029k0 interfaceC2029k0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(CampaignEx.JSON_KEY_AD_R, str);
        try {
            interfaceC2029k0.G(bundle);
        } catch (RemoteException e8) {
            this.f16777a.d().w().b("Error returning string value to wrapper", e8);
        }
    }

    final void L(String str, String str2, String str3, Bundle bundle, List list, boolean z8) {
        int i8;
        int i9;
        int i10;
        String str4;
        int i11;
        int O8;
        int i12;
        String str5;
        String str6;
        if (bundle == null) {
            return;
        }
        C2197h z9 = this.f16777a.z();
        C2122v6.c();
        String str7 = null;
        if (z9.f16777a.z().B(null, AbstractC2217k1.f16548B0) && z9.f16777a.N().X(231100000, true)) {
            i8 = 35;
        } else {
            i8 = 0;
        }
        int i13 = 0;
        for (String str8 : new TreeSet(bundle.keySet())) {
            if (list != null && list.contains(str8)) {
                i10 = 0;
            } else {
                if (!z8) {
                    i9 = o0(str8);
                } else {
                    i9 = 0;
                }
                if (i9 == 0) {
                    i9 = n0(str8);
                }
                i10 = i9;
            }
            if (i10 != 0) {
                if (i10 == 3) {
                    str6 = str8;
                } else {
                    str6 = str7;
                }
                x(bundle, i10, str8, str8, str6);
                bundle.remove(str8);
                i12 = i8;
                str5 = str7;
            } else {
                if (V(bundle.get(str8))) {
                    this.f16777a.d().x().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str8);
                    str4 = str8;
                    i11 = i8;
                    O8 = 22;
                } else {
                    str4 = str8;
                    i11 = i8;
                    O8 = O(str, str2, str8, bundle.get(str8), bundle, list, z8, false);
                }
                if (O8 != 0 && !"_ev".equals(str4)) {
                    x(bundle, O8, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (Z(str4) && !j0(str4, m0.r.f34890d)) {
                    int i14 = i13 + 1;
                    if (!X(231100000, true)) {
                        this.f16777a.d().s().c("Item array not supported on client's version of Google Play Services (Android Only)", this.f16777a.D().d(str2), this.f16777a.D().b(bundle));
                        f0(bundle, 23);
                        bundle.remove(str4);
                        i12 = i11;
                    } else {
                        i12 = i11;
                        if (i14 > i12) {
                            C2122v6.c();
                            str5 = null;
                            if (this.f16777a.z().B(null, AbstractC2217k1.f16548B0)) {
                                this.f16777a.d().s().c("Item can't contain more than " + i12 + " item-scoped custom params", this.f16777a.D().d(str2), this.f16777a.D().b(bundle));
                                f0(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                this.f16777a.d().s().c("Item cannot contain custom parameters", this.f16777a.D().d(str2), this.f16777a.D().b(bundle));
                                f0(bundle, 23);
                                bundle.remove(str4);
                            }
                            i13 = i14;
                        }
                    }
                    str5 = null;
                    i13 = i14;
                }
                i12 = i11;
                str5 = null;
            }
            i8 = i12;
            str7 = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!g0(str)) {
                if (this.f16777a.q()) {
                    this.f16777a.d().s().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2267u1.z(str));
                }
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!g0(str2)) {
                this.f16777a.d().s().b("Invalid admob_app_id. Analytics disabled.", C2267u1.z(str2));
                return false;
            }
            return true;
        }
        if (this.f16777a.q()) {
            this.f16777a.d().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str, int i8, String str2) {
        if (str2 == null) {
            this.f16777a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i8) {
            this.f16777a.d().s().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i8), str2);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y4.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean P(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f16777a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC1319p.l(str2);
        String[] strArr3 = f16940g;
        for (int i8 = 0; i8 < 3; i8++) {
            if (str2.startsWith(strArr3[i8])) {
                this.f16777a.d().s().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && j0(str2, strArr)) {
            if (strArr2 == null || !j0(str2, strArr2)) {
                this.f16777a.d().s().c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Q(String str, String str2, int i8, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i8) {
                this.f16777a.d().x().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean R(String str, String str2) {
        if (str2 == null) {
            this.f16777a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f16777a.d().s().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                this.f16777a.d().s().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f16777a.d().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S(String str, String str2) {
        if (str2 == null) {
            this.f16777a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f16777a.d().s().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f16777a.d().s().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f16777a.d().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean T(String str) {
        h();
        if (Y.e.a(this.f16777a.c()).a(str) == 0) {
            return true;
        }
        this.f16777a.d().q().b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u8 = this.f16777a.z().u();
        this.f16777a.b();
        return u8.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean V(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean W(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e8 = Y.e.a(context).e(str, 64);
            if (e8 != null && (signatureArr = e8.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e9) {
            this.f16777a.d().r().b("Package name not found", e9);
            return true;
        } catch (CertificateException e10) {
            this.f16777a.d().r().b("Error obtaining certificate", e10);
            return true;
        }
    }

    public final boolean X(int i8, boolean z8) {
        Boolean J8 = this.f16777a.L().J();
        if (q0() >= i8 / 1000) {
            return true;
        }
        if (J8 != null && !J8.booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            AbstractC1319p.l(str);
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
        if (!isEmpty) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] e0(Parcelable parcelable) {
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

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final void i() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f16777a.d().w().a("Utils falling back to Random for random id");
            }
        }
        this.f16943d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l0(String str, Object obj) {
        boolean Q8;
        if ("_ldl".equals(str)) {
            Q8 = Q("user property referrer", str, h0(str), obj);
        } else {
            Q8 = Q("user property", str, h0(str), obj);
        }
        if (Q8) {
            return 0;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m0(String str) {
        if (!R(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!P(NotificationCompat.CATEGORY_EVENT, m0.q.f34883a, m0.q.f34884b, str)) {
            return 13;
        }
        this.f16777a.z();
        if (!N(NotificationCompat.CATEGORY_EVENT, 40, str)) {
            return 2;
        }
        return 0;
    }

    final int n0(String str) {
        if (!R("event param", str)) {
            return 3;
        }
        if (!P("event param", null, null, str)) {
            return 14;
        }
        this.f16777a.z();
        if (!N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object o(String str, Object obj) {
        int i8 = 256;
        if ("_ev".equals(str)) {
            this.f16777a.z();
            return i0(256, obj, true, true);
        }
        if (Y(str)) {
            this.f16777a.z();
        } else {
            this.f16777a.z();
            i8 = 100;
        }
        return i0(i8, obj, false, true);
    }

    final int o0(String str) {
        if (!S("event param", str)) {
            return 3;
        }
        if (!P("event param", null, null, str)) {
            return 14;
        }
        this.f16777a.z();
        if (!N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return i0(h0(str), obj, true, false);
        }
        return i0(h0(str), obj, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int p0(String str) {
        if (!R("user property", str)) {
            return 6;
        }
        if (!P("user property", m0.s.f34891a, null, str)) {
            return 15;
        }
        this.f16777a.z();
        if (!N("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String q() {
        byte[] bArr = new byte[16];
        u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final int q0() {
        if (this.f16945f == null) {
            this.f16945f = Integer.valueOf(C1264h.f().a(this.f16777a.c()) / 1000);
        }
        return this.f16945f.intValue();
    }

    public final String r(String str, int i8, boolean z8) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i8) {
            if (!z8) {
                return null;
            }
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i8))).concat("...");
        }
        return str;
    }

    public final int r0(int i8) {
        return C1264h.f().h(this.f16777a.c(), AbstractC1268l.f7671a);
    }

    public final URL s(long j8, String str, String str2, long j9) {
        try {
            AbstractC1319p.f(str2);
            AbstractC1319p.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 79000L, Integer.valueOf(q0())), str2, str, Long.valueOf(j9));
            if (str.equals(this.f16777a.z().v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException e8) {
            e = e8;
            this.f16777a.d().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e9) {
            e = e9;
            this.f16777a.d().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final long t0() {
        long andIncrement;
        long j8;
        if (this.f16943d.get() == 0) {
            synchronized (this.f16943d) {
                long nextLong = new Random(System.nanoTime() ^ this.f16777a.a().currentTimeMillis()).nextLong();
                int i8 = this.f16944e + 1;
                this.f16944e = i8;
                j8 = nextLong + i8;
            }
            return j8;
        }
        synchronized (this.f16943d) {
            this.f16943d.compareAndSet(-1L, 1L);
            andIncrement = this.f16943d.getAndIncrement();
        }
        return andIncrement;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SecureRandom u() {
        h();
        if (this.f16942c == null) {
            this.f16942c = new SecureRandom();
        }
        return this.f16942c;
    }

    public final long u0(long j8, long j9) {
        return (j8 + (j9 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle v0(Uri uri, boolean z8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("utm_id");
                str6 = uri.getQueryParameter("dclid");
                str7 = uri.getQueryParameter("srsltid");
                if (z8) {
                    str8 = uri.getQueryParameter("sfmc_id");
                } else {
                    str8 = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && (!z8 || TextUtils.isEmpty(str8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("campaign", str);
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
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("campaign_id", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("dclid", str6);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("srsltid", str7);
            }
            if (z8 && !TextUtils.isEmpty(str8)) {
                bundle.putString("sfmc_id", str8);
            }
            return bundle;
        } catch (UnsupportedOperationException e8) {
            this.f16777a.d().w().b("Install referrer url isn't a hierarchical URI", e8);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(Bundle bundle, long j8) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            this.f16777a.d().w().b("Params already contained engagement", Long.valueOf(j9));
        } else {
            j9 = 0;
        }
        bundle.putLong("_et", j8 + j9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object o8 = o(str, bundle.get(str));
                if (o8 == null) {
                    this.f16777a.d().x().b("Param value can't be null", this.f16777a.D().e(str));
                } else {
                    D(bundle2, str, o8);
                }
            }
        }
        return bundle2;
    }

    final void x(Bundle bundle, int i8, String str, String str2, Object obj) {
        if (f0(bundle, i8)) {
            this.f16777a.z();
            bundle.putString("_ev", r(str, 40, true));
            if (obj != null) {
                AbstractC1319p.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle x0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y4.x0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2270v y0(String str, String str2, Bundle bundle, String str3, long j8, boolean z8, boolean z9) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle x02 = x0(str, str2, bundle3, W.e.a("_o"), true);
            if (z8) {
                x02 = w0(x02);
            }
            AbstractC1319p.l(x02);
            return new C2270v(str2, new C2260t(x02), str3, j8);
        }
        this.f16777a.d().r().b("Invalid conditional property event name", this.f16777a.D().f(str2));
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f16777a.N().D(bundle, str, bundle2.get(str));
            }
        }
    }
}
