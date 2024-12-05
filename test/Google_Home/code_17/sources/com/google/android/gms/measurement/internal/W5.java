package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import R.b;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC2091c5;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C2105e;
import com.google.android.gms.internal.measurement.C2164j8;
import com.google.android.gms.internal.measurement.C2182l7;
import com.google.android.gms.internal.measurement.C2257u2;
import com.google.android.gms.internal.measurement.C2275w2;
import com.google.android.gms.internal.measurement.C2284x2;
import com.google.android.gms.internal.measurement.C2293y2;
import com.google.android.gms.internal.measurement.C2302z2;
import com.google.android.gms.internal.measurement.E2;
import com.google.android.gms.internal.measurement.I2;
import com.google.android.gms.internal.measurement.K7;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.measurement.internal.C2472x3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import l0.AbstractC3282q;

/* loaded from: classes3.dex */
public final class W5 extends F5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public W5(I5 i52) {
        super(i52);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle B(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.B2 b22 = (com.google.android.gms.internal.measurement.B2) it.next();
            String W7 = b22.W();
            if (b22.Z()) {
                bundle.putDouble(W7, b22.G());
            } else if (b22.a0()) {
                bundle.putFloat(W7, b22.N());
            } else if (b22.d0()) {
                bundle.putString(W7, b22.X());
            } else if (b22.b0()) {
                bundle.putLong(W7, b22.S());
            }
        }
        return bundle;
    }

    private final Bundle C(Map map, boolean z8) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z8) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj2 = arrayList.get(i8);
                        i8++;
                        arrayList2.add(C((Map) obj2, false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.internal.measurement.B2 F(C2302z2 c2302z2, String str) {
        for (com.google.android.gms.internal.measurement.B2 b22 : c2302z2.V()) {
            if (b22.W().equals(str)) {
                return b22;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.internal.measurement.H5 G(com.google.android.gms.internal.measurement.H5 h52, byte[] bArr) {
        com.google.android.gms.internal.measurement.O4 a8 = com.google.android.gms.internal.measurement.O4.a();
        if (a8 != null) {
            return h52.v(bArr, a8);
        }
        return h52.y(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object J(C2302z2 c2302z2, String str, Object obj) {
        Object g02 = g0(c2302z2, str);
        if (g02 == null) {
            return obj;
        }
        return g02;
    }

    private static String N(boolean z8, boolean z9, boolean z10) {
        StringBuilder sb = new StringBuilder();
        if (z8) {
            sb.append("Dynamic ");
        }
        if (z9) {
            sb.append("Sequence ");
        }
        if (z10) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List O(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            long j8 = 0;
            for (int i9 = 0; i9 < 64; i9++) {
                int i10 = (i8 << 6) + i9;
                if (i10 < bitSet.length()) {
                    if (bitSet.get(i10)) {
                        j8 |= 1 << i9;
                    }
                }
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    private static void R(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void S(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                R(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void T(C2302z2.a aVar, String str, Object obj) {
        List G8 = aVar.G();
        int i8 = 0;
        while (true) {
            if (i8 < G8.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.B2) G8.get(i8)).W())) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        B2.a t8 = com.google.android.gms.internal.measurement.B2.U().t(str);
        if (obj instanceof Long) {
            t8.q(((Long) obj).longValue());
        } else if (obj instanceof String) {
            t8.x((String) obj);
        } else if (obj instanceof Double) {
            t8.p(((Double) obj).doubleValue());
        }
        if (i8 >= 0) {
            aVar.q(i8, t8);
        } else {
            aVar.t(t8);
        }
    }

    private static void X(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("  ");
        }
    }

    private final void Y(StringBuilder sb, int i8, com.google.android.gms.internal.measurement.I1 i12) {
        if (i12 == null) {
            return;
        }
        X(sb, i8);
        sb.append("filter {\n");
        if (i12.N()) {
            b0(sb, i8, "complement", Boolean.valueOf(i12.M()));
        }
        if (i12.P()) {
            b0(sb, i8, "param_name", d().f(i12.L()));
        }
        if (i12.Q()) {
            int i9 = i8 + 1;
            com.google.android.gms.internal.measurement.L1 K8 = i12.K();
            if (K8 != null) {
                X(sb, i9);
                sb.append("string_filter");
                sb.append(" {\n");
                if (K8.O()) {
                    b0(sb, i9, "match_type", K8.G().name());
                }
                if (K8.N()) {
                    b0(sb, i9, "expression", K8.J());
                }
                if (K8.M()) {
                    b0(sb, i9, "case_sensitive", Boolean.valueOf(K8.L()));
                }
                if (K8.j() > 0) {
                    X(sb, i8 + 2);
                    sb.append("expression_list {\n");
                    for (String str : K8.K()) {
                        X(sb, i8 + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                X(sb, i9);
                sb.append("}\n");
            }
        }
        if (i12.O()) {
            Z(sb, i8 + 1, "number_filter", i12.J());
        }
        X(sb, i8);
        sb.append("}\n");
    }

    private static void Z(StringBuilder sb, int i8, String str, com.google.android.gms.internal.measurement.J1 j12) {
        if (j12 == null) {
            return;
        }
        X(sb, i8);
        sb.append(str);
        sb.append(" {\n");
        if (j12.N()) {
            b0(sb, i8, "comparison_type", j12.G().name());
        }
        if (j12.P()) {
            b0(sb, i8, "match_as_float", Boolean.valueOf(j12.M()));
        }
        if (j12.O()) {
            b0(sb, i8, "comparison_value", j12.J());
        }
        if (j12.R()) {
            b0(sb, i8, "min_comparison_value", j12.L());
        }
        if (j12.Q()) {
            b0(sb, i8, "max_comparison_value", j12.K());
        }
        X(sb, i8);
        sb.append("}\n");
    }

    private static void a0(StringBuilder sb, int i8, String str, com.google.android.gms.internal.measurement.G2 g22) {
        Integer num;
        Integer num2;
        Long l8;
        if (g22 == null) {
            return;
        }
        X(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (g22.I() != 0) {
            X(sb, 4);
            sb.append("results: ");
            int i9 = 0;
            for (Long l9 : g22.V()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(l9);
                i9 = i10;
            }
            sb.append('\n');
        }
        if (g22.O() != 0) {
            X(sb, 4);
            sb.append("status: ");
            int i11 = 0;
            for (Long l10 : g22.X()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i11 = i12;
            }
            sb.append('\n');
        }
        if (g22.j() != 0) {
            X(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (C2293y2 c2293y2 : g22.U()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                if (c2293y2.M()) {
                    num2 = Integer.valueOf(c2293y2.j());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (c2293y2.L()) {
                    l8 = Long.valueOf(c2293y2.I());
                } else {
                    l8 = null;
                }
                sb.append(l8);
                i13 = i14;
            }
            sb.append("}\n");
        }
        if (g22.L() != 0) {
            X(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.H2 h22 : g22.W()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb.append(", ");
                }
                if (h22.N()) {
                    num = Integer.valueOf(h22.J());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                Iterator it = h22.M().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i17 = i18;
                }
                sb.append("]");
                i15 = i16;
            }
            sb.append("}\n");
        }
        X(sb, 3);
        sb.append("}\n");
    }

    private static void b0(StringBuilder sb, int i8, String str, Object obj) {
        if (obj == null) {
            return;
        }
        X(sb, i8 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void c0(StringBuilder sb, int i8, List list) {
        String str;
        String str2;
        Long l8;
        if (list == null) {
            return;
        }
        int i9 = i8 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.B2 b22 = (com.google.android.gms.internal.measurement.B2) it.next();
            if (b22 != null) {
                X(sb, i9);
                sb.append("param {\n");
                Double d8 = null;
                if (b22.c0()) {
                    str = d().f(b22.W());
                } else {
                    str = null;
                }
                b0(sb, i9, "name", str);
                if (b22.d0()) {
                    str2 = b22.X();
                } else {
                    str2 = null;
                }
                b0(sb, i9, "string_value", str2);
                if (b22.b0()) {
                    l8 = Long.valueOf(b22.S());
                } else {
                    l8 = null;
                }
                b0(sb, i9, "int_value", l8);
                if (b22.Z()) {
                    d8 = Double.valueOf(b22.G());
                }
                b0(sb, i9, "double_value", d8);
                if (b22.Q() > 0) {
                    c0(sb, i9, b22.Y());
                }
                X(sb, i9);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e0(G g8, b6 b6Var) {
        AbstractC1400p.l(g8);
        AbstractC1400p.l(b6Var);
        if (TextUtils.isEmpty(b6Var.f17498b) && TextUtils.isEmpty(b6Var.f17513q)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f0(List list, int i8) {
        if (i8 < (list.size() << 6)) {
            if (((1 << (i8 % 64)) & ((Long) list.get(i8 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g0(C2302z2 c2302z2, String str) {
        com.google.android.gms.internal.measurement.B2 F8 = F(c2302z2, str);
        if (F8 != null) {
            if (F8.d0()) {
                return F8.X();
            }
            if (F8.b0()) {
                return Long.valueOf(F8.S());
            }
            if (F8.Z()) {
                return Double.valueOf(F8.G());
            }
            if (F8.Q() > 0) {
                return j0(F8.Y());
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle[] j0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.B2 b22 = (com.google.android.gms.internal.measurement.B2) it.next();
            if (b22 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.B2 b23 : b22.Y()) {
                    if (b23.d0()) {
                        bundle.putString(b23.W(), b23.X());
                    } else if (b23.b0()) {
                        bundle.putLong(b23.W(), b23.S());
                    } else if (b23.Z()) {
                        bundle.putDouble(b23.W(), b23.G());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(E2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i8 = 0; i8 < aVar.X(); i8++) {
            if (str.equals(aVar.F0(i8).U())) {
                return i8;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long A(byte[] bArr) {
        AbstractC1400p.l(bArr);
        h().k();
        MessageDigest V02 = a6.V0();
        if (V02 == null) {
            c().G().a("Failed to get MD5");
            return 0L;
        }
        return a6.B(V02.digest(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable D(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (b.a unused) {
            c().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2302z2 E(A a8) {
        C2302z2.a s8 = C2302z2.S().s(a8.f16936e);
        Iterator it = a8.f16937f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            B2.a t8 = com.google.android.gms.internal.measurement.B2.U().t(str);
            Object H8 = a8.f16937f.H(str);
            AbstractC1400p.l(H8);
            U(t8, H8);
            s8.t(t8);
        }
        if (a().q(H.f17144n1) && !TextUtils.isEmpty(a8.f16934c) && a8.f16937f.H("_o") == null) {
            s8.w((com.google.android.gms.internal.measurement.B2) ((AbstractC2091c5) com.google.android.gms.internal.measurement.B2.U().t("_o").x(a8.f16934c).k()));
        }
        return (C2302z2) ((AbstractC2091c5) s8.k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final G H(C2105e c2105e) {
        String str;
        Object obj;
        Bundle C8 = C(c2105e.g(), true);
        if (C8.containsKey("_o") && (obj = C8.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        String str2 = str;
        String b8 = AbstractC3282q.b(c2105e.e());
        if (b8 == null) {
            b8 = c2105e.e();
        }
        return new G(b8, new C(C8), str2, c2105e.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2481y5 I(String str, E2.a aVar, C2302z2.a aVar2, String str2) {
        int indexOf;
        if (C2164j8.a() && a().H(str, H.f17066H0)) {
            long currentTimeMillis = x().currentTimeMillis();
            String[] split = a().F(str, H.f17125h0).split(",");
            HashSet hashSet = new HashSet(split.length);
            for (String str3 : split) {
                Objects.requireNonNull(str3);
                if (!hashSet.add(str3)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
                }
            }
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
            E5 q8 = q();
            String R8 = q8.o().R(str);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(q8.a().F(str, H.f17104a0));
            if (!TextUtils.isEmpty(R8)) {
                builder.authority(R8 + "." + q8.a().F(str, H.f17107b0));
            } else {
                builder.authority(q8.a().F(str, H.f17107b0));
            }
            builder.path(q8.a().F(str, H.f17110c0));
            R(builder, "gmp_app_id", aVar.b1(), unmodifiableSet);
            R(builder, "gmp_version", "102001", unmodifiableSet);
            String Y02 = aVar.Y0();
            C2364i a8 = a();
            C2318b2 c2318b2 = H.f17072K0;
            if (a8.H(str, c2318b2) && o().b0(str)) {
                Y02 = "";
            }
            R(builder, "app_instance_id", Y02, unmodifiableSet);
            R(builder, "rdid", aVar.d1(), unmodifiableSet);
            R(builder, "bundle_id", aVar.X0(), unmodifiableSet);
            String F8 = aVar2.F();
            String a9 = AbstractC3282q.a(F8);
            if (!TextUtils.isEmpty(a9)) {
                F8 = a9;
            }
            R(builder, "app_event_name", F8, unmodifiableSet);
            R(builder, "app_version", String.valueOf(aVar.L()), unmodifiableSet);
            String c12 = aVar.c1();
            if (a().H(str, c2318b2) && o().f0(str) && !TextUtils.isEmpty(c12) && (indexOf = c12.indexOf(".")) != -1) {
                c12 = c12.substring(0, indexOf);
            }
            R(builder, "os_version", c12, unmodifiableSet);
            R(builder, CampaignEx.JSON_KEY_TIMESTAMP, String.valueOf(aVar2.D()), unmodifiableSet);
            String str4 = "1";
            if (aVar.J()) {
                R(builder, "lat", "1", unmodifiableSet);
            }
            R(builder, "privacy_sandbox_version", String.valueOf(aVar.o()), unmodifiableSet);
            R(builder, "trigger_uri_source", "1", unmodifiableSet);
            R(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
            R(builder, "request_uuid", str2, unmodifiableSet);
            List<com.google.android.gms.internal.measurement.B2> G8 = aVar2.G();
            Bundle bundle = new Bundle();
            for (com.google.android.gms.internal.measurement.B2 b22 : G8) {
                String W7 = b22.W();
                if (b22.Z()) {
                    bundle.putString(W7, String.valueOf(b22.G()));
                } else if (b22.a0()) {
                    bundle.putString(W7, String.valueOf(b22.N()));
                } else if (b22.d0()) {
                    bundle.putString(W7, b22.X());
                } else if (b22.b0()) {
                    bundle.putString(W7, String.valueOf(b22.S()));
                }
            }
            S(builder, a().F(str, H.f17122g0).split("\\|"), bundle, unmodifiableSet);
            List<com.google.android.gms.internal.measurement.I2> H8 = aVar.H();
            Bundle bundle2 = new Bundle();
            for (com.google.android.gms.internal.measurement.I2 i22 : H8) {
                String U8 = i22.U();
                if (i22.W()) {
                    bundle2.putString(U8, String.valueOf(i22.G()));
                } else if (i22.X()) {
                    bundle2.putString(U8, String.valueOf(i22.L()));
                } else if (i22.a0()) {
                    bundle2.putString(U8, i22.V());
                } else if (i22.Y()) {
                    bundle2.putString(U8, String.valueOf(i22.P()));
                }
            }
            S(builder, a().F(str, H.f17119f0).split("\\|"), bundle2, unmodifiableSet);
            if (!aVar.I()) {
                str4 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            R(builder, "dma", str4, unmodifiableSet);
            if (!aVar.a1().isEmpty()) {
                R(builder, "dma_cps", aVar.a1(), unmodifiableSet);
            }
            if (a().q(H.f17076M0) && aVar.K()) {
                C2257u2 m02 = aVar.m0();
                if (!m02.b0().isEmpty()) {
                    R(builder, "dl_gclid", m02.b0(), unmodifiableSet);
                }
                if (!m02.a0().isEmpty()) {
                    R(builder, "dl_gbraid", m02.a0(), unmodifiableSet);
                }
                if (!m02.X().isEmpty()) {
                    R(builder, "dl_gs", m02.X(), unmodifiableSet);
                }
                if (m02.G() > 0) {
                    R(builder, "dl_ss_ts", String.valueOf(m02.G()), unmodifiableSet);
                }
                if (!m02.e0().isEmpty()) {
                    R(builder, "mr_gclid", m02.e0(), unmodifiableSet);
                }
                if (!m02.d0().isEmpty()) {
                    R(builder, "mr_gbraid", m02.d0(), unmodifiableSet);
                }
                if (!m02.c0().isEmpty()) {
                    R(builder, "mr_gs", m02.c0(), unmodifiableSet);
                }
                if (m02.K() > 0) {
                    R(builder, "mr_click_ts", String.valueOf(m02.K()), unmodifiableSet);
                }
            }
            return new C2481y5(builder.build().toString(), currentTimeMillis, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String K(com.google.android.gms.internal.measurement.H1 h12) {
        if (h12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (h12.T()) {
            b0(sb, 0, "filter_id", Integer.valueOf(h12.J()));
        }
        b0(sb, 0, "event_name", d().c(h12.N()));
        String N8 = N(h12.P(), h12.Q(), h12.R());
        if (!N8.isEmpty()) {
            b0(sb, 0, "filter_type", N8);
        }
        if (h12.S()) {
            Z(sb, 1, "event_count_filter", h12.M());
        }
        if (h12.j() > 0) {
            sb.append("  filters {\n");
            Iterator it = h12.O().iterator();
            while (it.hasNext()) {
                Y(sb, 2, (com.google.android.gms.internal.measurement.I1) it.next());
            }
        }
        X(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String L(com.google.android.gms.internal.measurement.K1 k12) {
        if (k12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (k12.O()) {
            b0(sb, 0, "filter_id", Integer.valueOf(k12.j()));
        }
        b0(sb, 0, "property_name", d().g(k12.K()));
        String N8 = N(k12.L(), k12.M(), k12.N());
        if (!N8.isEmpty()) {
            b0(sb, 0, "filter_type", N8);
        }
        Y(sb, 1, k12.H());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String M(com.google.android.gms.internal.measurement.D2 d22) {
        Long l8;
        Long l9;
        C2275w2 t22;
        if (d22 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (u8.a() && a().q(H.f17165x0) && d22.j() > 0) {
            h();
            if (a6.H0(d22.H(0).x2())) {
                if (d22.T()) {
                    b0(sb, 0, "upload_subdomain", d22.Q());
                }
                if (d22.S()) {
                    b0(sb, 0, "sgtm_join_id", d22.P());
                }
            }
        }
        for (com.google.android.gms.internal.measurement.E2 e22 : d22.R()) {
            if (e22 != null) {
                X(sb, 1);
                sb.append("bundle {\n");
                if (e22.R0()) {
                    b0(sb, 1, "protocol_version", Integer.valueOf(e22.w1()));
                }
                if (o8.a() && a().H(e22.x2(), H.f17163w0) && e22.U0()) {
                    b0(sb, 1, "session_stitching_token", e22.i0());
                }
                b0(sb, 1, "platform", e22.g0());
                if (e22.M0()) {
                    b0(sb, 1, "gmp_version", Long.valueOf(e22.f2()));
                }
                if (e22.Z0()) {
                    b0(sb, 1, "uploading_gmp_version", Long.valueOf(e22.r2()));
                }
                if (e22.K0()) {
                    b0(sb, 1, "dynamite_version", Long.valueOf(e22.Y1()));
                }
                if (e22.D0()) {
                    b0(sb, 1, "config_version", Long.valueOf(e22.Q1()));
                }
                b0(sb, 1, "gmp_app_id", e22.d0());
                b0(sb, 1, "admob_app_id", e22.w2());
                b0(sb, 1, MBridgeConstans.APP_ID, e22.x2());
                b0(sb, 1, "app_version", e22.W());
                if (e22.s0()) {
                    b0(sb, 1, "app_version_major", Integer.valueOf(e22.u0()));
                }
                b0(sb, 1, "firebase_instance_id", e22.c0());
                if (e22.I0()) {
                    b0(sb, 1, "dev_cert_hash", Long.valueOf(e22.U1()));
                }
                b0(sb, 1, "app_store", e22.V());
                if (e22.Y0()) {
                    b0(sb, 1, "upload_timestamp_millis", Long.valueOf(e22.p2()));
                }
                if (e22.V0()) {
                    b0(sb, 1, "start_timestamp_millis", Long.valueOf(e22.l2()));
                }
                if (e22.L0()) {
                    b0(sb, 1, "end_timestamp_millis", Long.valueOf(e22.c2()));
                }
                if (e22.Q0()) {
                    b0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(e22.j2()));
                }
                if (e22.P0()) {
                    b0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(e22.h2()));
                }
                b0(sb, 1, "app_instance_id", e22.U());
                b0(sb, 1, "resettable_device_id", e22.h0());
                b0(sb, 1, "ds_id", e22.b0());
                if (e22.O0()) {
                    b0(sb, 1, "limited_ad_tracking", Boolean.valueOf(e22.p0()));
                }
                b0(sb, 1, "os_version", e22.f0());
                b0(sb, 1, "device_model", e22.a0());
                b0(sb, 1, "user_default_language", e22.j0());
                if (e22.X0()) {
                    b0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(e22.G1()));
                }
                if (e22.C0()) {
                    b0(sb, 1, "bundle_sequential_index", Integer.valueOf(e22.a1()));
                }
                if (u8.a()) {
                    h();
                    if (a6.H0(e22.x2()) && a().q(H.f17165x0) && e22.H0()) {
                        b0(sb, 1, "delivery_index", Integer.valueOf(e22.j1()));
                    }
                }
                if (e22.T0()) {
                    b0(sb, 1, "service_upload", Boolean.valueOf(e22.q0()));
                }
                b0(sb, 1, "health_monitor", e22.e0());
                if (e22.S0()) {
                    b0(sb, 1, "retry_counter", Integer.valueOf(e22.B1()));
                }
                if (e22.F0()) {
                    b0(sb, 1, "consent_signals", e22.Y());
                }
                if (e22.N0()) {
                    b0(sb, 1, "is_dma_region", Boolean.valueOf(e22.o0()));
                }
                if (e22.G0()) {
                    b0(sb, 1, "core_platform_services", e22.Z());
                }
                if (e22.E0()) {
                    b0(sb, 1, "consent_diagnostics", e22.X());
                }
                if (e22.W0()) {
                    b0(sb, 1, "target_os_version", Long.valueOf(e22.n2()));
                }
                if (C2164j8.a() && a().H(e22.x2(), H.f17066H0)) {
                    b0(sb, 1, "ad_services_version", Integer.valueOf(e22.j()));
                    if (e22.t0() && (t22 = e22.t2()) != null) {
                        X(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        b0(sb, 2, "eligible", Boolean.valueOf(t22.R()));
                        b0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(t22.U()));
                        b0(sb, 2, "pre_r", Boolean.valueOf(t22.V()));
                        b0(sb, 2, "r_extensions_too_old", Boolean.valueOf(t22.W()));
                        b0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(t22.P()));
                        b0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(t22.N()));
                        b0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(t22.T()));
                        X(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (K7.a() && a().q(H.f17092U0) && e22.r0()) {
                    C2257u2 s22 = e22.s2();
                    X(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (s22.h0()) {
                        b0(sb, 2, "deep_link_gclid", s22.b0());
                    }
                    if (s22.g0()) {
                        b0(sb, 2, "deep_link_gbraid", s22.a0());
                    }
                    if (s22.f0()) {
                        b0(sb, 2, "deep_link_gad_source", s22.X());
                    }
                    if (s22.i0()) {
                        b0(sb, 2, "deep_link_session_millis", Long.valueOf(s22.G()));
                    }
                    if (s22.m0()) {
                        b0(sb, 2, "market_referrer_gclid", s22.e0());
                    }
                    if (s22.l0()) {
                        b0(sb, 2, "market_referrer_gbraid", s22.d0());
                    }
                    if (s22.k0()) {
                        b0(sb, 2, "market_referrer_gad_source", s22.c0());
                    }
                    if (s22.j0()) {
                        b0(sb, 2, "market_referrer_click_millis", Long.valueOf(s22.K()));
                    }
                    X(sb, 2);
                    sb.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.I2> m02 = e22.m0();
                if (m02 != null) {
                    for (com.google.android.gms.internal.measurement.I2 i22 : m02) {
                        if (i22 != null) {
                            X(sb, 2);
                            sb.append("user_property {\n");
                            Double d8 = null;
                            if (i22.Z()) {
                                l8 = Long.valueOf(i22.R());
                            } else {
                                l8 = null;
                            }
                            b0(sb, 2, "set_timestamp_millis", l8);
                            b0(sb, 2, "name", d().g(i22.U()));
                            b0(sb, 2, "string_value", i22.V());
                            if (i22.Y()) {
                                l9 = Long.valueOf(i22.P());
                            } else {
                                l9 = null;
                            }
                            b0(sb, 2, "int_value", l9);
                            if (i22.W()) {
                                d8 = Double.valueOf(i22.G());
                            }
                            b0(sb, 2, "double_value", d8);
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2284x2> k02 = e22.k0();
                e22.x2();
                if (k02 != null) {
                    for (C2284x2 c2284x2 : k02) {
                        if (c2284x2 != null) {
                            X(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c2284x2.P()) {
                                b0(sb, 2, "audience_id", Integer.valueOf(c2284x2.j()));
                            }
                            if (c2284x2.Q()) {
                                b0(sb, 2, "new_audience", Boolean.valueOf(c2284x2.O()));
                            }
                            a0(sb, 2, "current_data", c2284x2.M());
                            if (c2284x2.R()) {
                                a0(sb, 2, "previous_data", c2284x2.N());
                            }
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2302z2> l02 = e22.l0();
                if (l02 != null) {
                    for (C2302z2 c2302z2 : l02) {
                        if (c2302z2 != null) {
                            X(sb, 2);
                            sb.append("event {\n");
                            b0(sb, 2, "name", d().c(c2302z2.U()));
                            if (c2302z2.Y()) {
                                b0(sb, 2, "timestamp_millis", Long.valueOf(c2302z2.R()));
                            }
                            if (c2302z2.X()) {
                                b0(sb, 2, "previous_timestamp_millis", Long.valueOf(c2302z2.Q()));
                            }
                            if (c2302z2.W()) {
                                b0(sb, 2, "count", Integer.valueOf(c2302z2.j()));
                            }
                            if (c2302z2.O() != 0) {
                                c0(sb, 2, c2302z2.V());
                            }
                            X(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                X(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List P(List list, List list2) {
        int i8;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                c().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    c().L().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i9 = size2;
            i8 = size;
            size = i9;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(Q((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r5.add(Q((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r5.add(Q((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map Q(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Q(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Q(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.Q(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.W5.Q(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(B2.a aVar, Object obj) {
        AbstractC1400p.l(obj);
        aVar.B().z().w().A();
        if (obj instanceof String) {
            aVar.x((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.q(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.p(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    B2.a U8 = com.google.android.gms.internal.measurement.B2.U();
                    for (String str : bundle.keySet()) {
                        B2.a t8 = com.google.android.gms.internal.measurement.B2.U().t(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            t8.q(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            t8.x((String) obj2);
                        } else if (obj2 instanceof Double) {
                            t8.p(((Double) obj2).doubleValue());
                        }
                        U8.r(t8);
                    }
                    if (U8.o() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.B2) ((AbstractC2091c5) U8.k()));
                    }
                }
            }
            aVar.s(arrayList);
            return;
        }
        c().G().b("Ignoring invalid (type) event param value", obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(E2.a aVar) {
        c().K().a("Checking account type status for ad personalization signals");
        if (k0(aVar.X0())) {
            c().F().a("Turning off ad personalization due to account type");
            com.google.android.gms.internal.measurement.I2 i22 = (com.google.android.gms.internal.measurement.I2) ((AbstractC2091c5) com.google.android.gms.internal.measurement.I2.S().r("_npa").t(b().r()).q(1L).k());
            int i8 = 0;
            while (true) {
                if (i8 < aVar.X()) {
                    if ("_npa".equals(aVar.F0(i8).U())) {
                        aVar.s(i8, i22);
                        break;
                    }
                    i8++;
                } else {
                    aVar.C(i22);
                    break;
                }
            }
            C2371j a8 = C2371j.a(aVar.Z0());
            a8.d(C2472x3.a.AD_PERSONALIZATION, EnumC2385l.CHILD_ACCOUNT);
            aVar.l0(a8.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W(I2.a aVar, Object obj) {
        AbstractC1400p.l(obj);
        aVar.x().s().o();
        if (obj instanceof String) {
            aVar.w((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.q(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.p(((Double) obj).doubleValue());
        } else {
            c().G().b("Ignoring invalid (type) user attribute value", obj);
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

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0(long j8, long j9) {
        if (j8 != 0 && j9 > 0 && Math.abs(x().currentTimeMillis() - j8) <= j9) {
            return false;
        }
        return true;
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
    public final byte[] i0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            c().G().b("Failed to gzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k0(String str) {
        if (C2182l7.a() && a().q(H.f17096W0)) {
            return false;
        }
        AbstractC1400p.l(str);
        C2485z2 L02 = n().L0(str);
        if (L02 == null || !b().v() || !L02.z() || !o().W(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ W5 l() {
        return super.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] l0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e8) {
            c().G().b("Failed to ungzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ g6 m() {
        return super.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List m0() {
        Map e8 = H.e(this.f16988b.w());
        if (e8 == null || e8.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) H.f17087S.a(null)).intValue();
        for (Map.Entry entry : e8.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            c().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e9) {
                    c().L().b("Experiment ID NumberFormatException", e9);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ C2392m n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ E2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ C2356g5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C5
    public final /* bridge */ /* synthetic */ E5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    protected final boolean u() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
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
    public final long z(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return A(str.getBytes(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME)));
    }
}
