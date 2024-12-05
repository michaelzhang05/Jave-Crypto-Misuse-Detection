package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import S.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1949a7;
import com.google.android.gms.internal.measurement.C1950b;
import com.google.android.gms.internal.measurement.C1961c1;
import com.google.android.gms.internal.measurement.C1962c2;
import com.google.android.gms.internal.measurement.C1979e1;
import com.google.android.gms.internal.measurement.C1980e2;
import com.google.android.gms.internal.measurement.C1989f2;
import com.google.android.gms.internal.measurement.C1998g2;
import com.google.android.gms.internal.measurement.C2022j1;
import com.google.android.gms.internal.measurement.C2025j4;
import com.google.android.gms.internal.measurement.C2038l1;
import com.google.android.gms.internal.measurement.C2078q1;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.X4;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class t4 extends AbstractC2190f4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t4(r4 r4Var) {
        super(r4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X4 E(X4 x42, byte[] bArr) {
        C2025j4 a8 = C2025j4.a();
        if (a8 != null) {
            return x42.I(bArr, a8);
        }
        return x42.L(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            long j8 = 0;
            for (int i9 = 0; i9 < 64; i9++) {
                int i10 = (i8 * 64) + i9;
                if (i10 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i10)) {
                    j8 |= 1 << i9;
                }
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean N(List list, int i8) {
        if (i8 < list.size() * 64) {
            if (((1 << (i8 % 64)) & ((Long) list.get(i8 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean P(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void m(com.google.android.gms.internal.measurement.L1 l12, String str, Object obj) {
        List E8 = l12.E();
        int i8 = 0;
        while (true) {
            if (i8 < E8.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.Q1) E8.get(i8)).H())) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.P1 F8 = com.google.android.gms.internal.measurement.Q1.F();
        F8.y(str);
        if (obj instanceof Long) {
            F8.x(((Long) obj).longValue());
        }
        if (i8 >= 0) {
            l12.y(i8, F8);
        } else {
            l12.s(F8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean n(C2270v c2270v, D4 d42) {
        AbstractC1319p.l(c2270v);
        AbstractC1319p.l(d42);
        if (TextUtils.isEmpty(d42.f16062b) && TextUtils.isEmpty(d42.f16077q)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final com.google.android.gms.internal.measurement.Q1 o(com.google.android.gms.internal.measurement.M1 m12, String str) {
        for (com.google.android.gms.internal.measurement.Q1 q12 : m12.K()) {
            if (q12.H().equals(str)) {
                return q12;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object p(com.google.android.gms.internal.measurement.M1 m12, String str) {
        com.google.android.gms.internal.measurement.Q1 o8 = o(m12, str);
        if (o8 != null) {
            if (o8.a0()) {
                return o8.J();
            }
            if (o8.Y()) {
                return Long.valueOf(o8.E());
            }
            if (o8.W()) {
                return Double.valueOf(o8.B());
            }
            if (o8.D() > 0) {
                List<com.google.android.gms.internal.measurement.Q1> K8 = o8.K();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.Q1 q12 : K8) {
                    if (q12 != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.Q1 q13 : q12.K()) {
                            if (q13.a0()) {
                                bundle.putString(q13.H(), q13.J());
                            } else if (q13.Y()) {
                                bundle.putLong(q13.H(), q13.E());
                            } else if (q13.W()) {
                                bundle.putDouble(q13.H(), q13.B());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void q(StringBuilder sb, int i8, List list) {
        String str;
        String str2;
        Long l8;
        if (list == null) {
            return;
        }
        int i9 = i8 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.Q1 q12 = (com.google.android.gms.internal.measurement.Q1) it.next();
            if (q12 != null) {
                s(sb, i9);
                sb.append("param {\n");
                Double d8 = null;
                if (q12.Z()) {
                    str = this.f16777a.D().e(q12.H());
                } else {
                    str = null;
                }
                v(sb, i9, "name", str);
                if (q12.a0()) {
                    str2 = q12.J();
                } else {
                    str2 = null;
                }
                v(sb, i9, "string_value", str2);
                if (q12.Y()) {
                    l8 = Long.valueOf(q12.E());
                } else {
                    l8 = null;
                }
                v(sb, i9, "int_value", l8);
                if (q12.W()) {
                    d8 = Double.valueOf(q12.B());
                }
                v(sb, i9, "double_value", d8);
                if (q12.D() > 0) {
                    q(sb, i9, q12.K());
                }
                s(sb, i9);
                sb.append("}\n");
            }
        }
    }

    private final void r(StringBuilder sb, int i8, C1979e1 c1979e1) {
        String str;
        if (c1979e1 == null) {
            return;
        }
        s(sb, i8);
        sb.append("filter {\n");
        if (c1979e1.J()) {
            v(sb, i8, "complement", Boolean.valueOf(c1979e1.H()));
        }
        if (c1979e1.M()) {
            v(sb, i8, "param_name", this.f16777a.D().e(c1979e1.F()));
        }
        if (c1979e1.N()) {
            int i9 = i8 + 1;
            C2078q1 E8 = c1979e1.E();
            if (E8 != null) {
                s(sb, i9);
                sb.append("string_filter {\n");
                if (E8.K()) {
                    switch (E8.M()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    v(sb, i9, "match_type", str);
                }
                if (E8.J()) {
                    v(sb, i9, "expression", E8.E());
                }
                if (E8.H()) {
                    v(sb, i9, "case_sensitive", Boolean.valueOf(E8.G()));
                }
                if (E8.B() > 0) {
                    s(sb, i8 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : E8.F()) {
                        s(sb, i8 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                s(sb, i9);
                sb.append("}\n");
            }
        }
        if (c1979e1.K()) {
            w(sb, i8 + 1, "number_filter", c1979e1.D());
        }
        s(sb, i8);
        sb.append("}\n");
    }

    private static final void s(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("  ");
        }
    }

    private static final String t(boolean z8, boolean z9, boolean z10) {
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

    private static final void u(StringBuilder sb, int i8, String str, C1962c2 c1962c2) {
        Integer num;
        Integer num2;
        Long l8;
        if (c1962c2 == null) {
            return;
        }
        s(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c1962c2.C() != 0) {
            s(sb, 4);
            sb.append("results: ");
            int i9 = 0;
            for (Long l9 : c1962c2.K()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(l9);
                i9 = i10;
            }
            sb.append('\n');
        }
        if (c1962c2.E() != 0) {
            s(sb, 4);
            sb.append("status: ");
            int i11 = 0;
            for (Long l10 : c1962c2.N()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i11 = i12;
            }
            sb.append('\n');
        }
        if (c1962c2.B() != 0) {
            s(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.K1 k12 : c1962c2.J()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                if (k12.J()) {
                    num2 = Integer.valueOf(k12.B());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (k12.H()) {
                    l8 = Long.valueOf(k12.C());
                } else {
                    l8 = null;
                }
                sb.append(l8);
                i13 = i14;
            }
            sb.append("}\n");
        }
        if (c1962c2.D() != 0) {
            s(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (C1980e2 c1980e2 : c1962c2.M()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb.append(", ");
                }
                if (c1980e2.K()) {
                    num = Integer.valueOf(c1980e2.C());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                Iterator it = c1980e2.G().iterator();
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
        s(sb, 3);
        sb.append("}\n");
    }

    private static final void v(StringBuilder sb, int i8, String str, Object obj) {
        if (obj == null) {
            return;
        }
        s(sb, i8 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void w(StringBuilder sb, int i8, String str, C2022j1 c2022j1) {
        String str2;
        if (c2022j1 == null) {
            return;
        }
        s(sb, i8);
        sb.append(str);
        sb.append(" {\n");
        if (c2022j1.H()) {
            int O8 = c2022j1.O();
            if (O8 != 1) {
                if (O8 != 2) {
                    if (O8 != 3) {
                        if (O8 != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            v(sb, i8, "comparison_type", str2);
        }
        if (c2022j1.K()) {
            v(sb, i8, "match_as_float", Boolean.valueOf(c2022j1.G()));
        }
        if (c2022j1.J()) {
            v(sb, i8, "comparison_value", c2022j1.D());
        }
        if (c2022j1.N()) {
            v(sb, i8, "min_comparison_value", c2022j1.F());
        }
        if (c2022j1.M()) {
            v(sb, i8, "max_comparison_value", c2022j1.E());
        }
        s(sb, i8);
        sb.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(com.google.android.gms.internal.measurement.W1 w12, String str) {
        for (int i8 = 0; i8 < w12.n0(); i8++) {
            if (str.equals(w12.h0(i8).G())) {
                return i8;
            }
        }
        return -1;
    }

    final Bundle A(Map map, boolean z8) {
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
                    for (int i8 = 0; i8 < size; i8++) {
                        arrayList2.add(A((Map) arrayList.get(i8), false));
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
    public final Parcelable B(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (b.a unused) {
            this.f16777a.d().r().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2270v C(C1950b c1950b) {
        String str;
        Object obj;
        Bundle A8 = A(c1950b.e(), true);
        if (A8.containsKey("_o") && (obj = A8.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        String str2 = str;
        String b8 = m0.q.b(c1950b.d());
        if (b8 == null) {
            b8 = c1950b.d();
        }
        return new C2270v(b8, new C2260t(A8), str2, c1950b.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.M1 D(C2246q c2246q) {
        com.google.android.gms.internal.measurement.L1 F8 = com.google.android.gms.internal.measurement.M1.F();
        F8.A(c2246q.f16748e);
        C2255s c2255s = new C2255s(c2246q.f16749f);
        while (c2255s.hasNext()) {
            String next = c2255s.next();
            com.google.android.gms.internal.measurement.P1 F9 = com.google.android.gms.internal.measurement.Q1.F();
            F9.y(next);
            Object L8 = c2246q.f16749f.L(next);
            AbstractC1319p.l(L8);
            L(F9, L8);
            F8.s(F9);
        }
        return (com.google.android.gms.internal.measurement.M1) F8.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String F(com.google.android.gms.internal.measurement.V1 v12) {
        Long l8;
        Long l9;
        Double d8;
        if (v12 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.X1 x12 : v12.E()) {
            if (x12 != null) {
                s(sb, 1);
                sb.append("bundle {\n");
                if (x12.s1()) {
                    v(sb, 1, "protocol_version", Integer.valueOf(x12.C1()));
                }
                C1949a7.c();
                if (this.f16777a.z().B(x12.W1(), AbstractC2217k1.f16615q0) && x12.v1()) {
                    v(sb, 1, "session_stitching_token", x12.O());
                }
                v(sb, 1, "platform", x12.M());
                if (x12.o1()) {
                    v(sb, 1, "gmp_version", Long.valueOf(x12.K1()));
                }
                if (x12.A1()) {
                    v(sb, 1, "uploading_gmp_version", Long.valueOf(x12.Q1()));
                }
                if (x12.m1()) {
                    v(sb, 1, "dynamite_version", Long.valueOf(x12.I1()));
                }
                if (x12.j1()) {
                    v(sb, 1, "config_version", Long.valueOf(x12.G1()));
                }
                v(sb, 1, "gmp_app_id", x12.H());
                v(sb, 1, "admob_app_id", x12.V1());
                v(sb, 1, MBridgeConstans.APP_ID, x12.W1());
                v(sb, 1, "app_version", x12.C());
                if (x12.h1()) {
                    v(sb, 1, "app_version_major", Integer.valueOf(x12.d0()));
                }
                v(sb, 1, "firebase_instance_id", x12.G());
                if (x12.l1()) {
                    v(sb, 1, "dev_cert_hash", Long.valueOf(x12.H1()));
                }
                v(sb, 1, "app_store", x12.B());
                if (x12.z1()) {
                    v(sb, 1, "upload_timestamp_millis", Long.valueOf(x12.P1()));
                }
                if (x12.w1()) {
                    v(sb, 1, "start_timestamp_millis", Long.valueOf(x12.N1()));
                }
                if (x12.n1()) {
                    v(sb, 1, "end_timestamp_millis", Long.valueOf(x12.J1()));
                }
                if (x12.r1()) {
                    v(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(x12.M1()));
                }
                if (x12.q1()) {
                    v(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(x12.L1()));
                }
                v(sb, 1, "app_instance_id", x12.X1());
                v(sb, 1, "resettable_device_id", x12.N());
                v(sb, 1, "ds_id", x12.F());
                if (x12.p1()) {
                    v(sb, 1, "limited_ad_tracking", Boolean.valueOf(x12.C0()));
                }
                v(sb, 1, "os_version", x12.K());
                v(sb, 1, "device_model", x12.E());
                v(sb, 1, "user_default_language", x12.P());
                if (x12.y1()) {
                    v(sb, 1, "time_zone_offset_minutes", Integer.valueOf(x12.E1()));
                }
                if (x12.i1()) {
                    v(sb, 1, "bundle_sequential_index", Integer.valueOf(x12.e1()));
                }
                if (x12.u1()) {
                    v(sb, 1, "service_upload", Boolean.valueOf(x12.D0()));
                }
                v(sb, 1, "health_monitor", x12.J());
                if (x12.t1()) {
                    v(sb, 1, "retry_counter", Integer.valueOf(x12.D1()));
                }
                if (x12.k1()) {
                    v(sb, 1, "consent_signals", x12.D());
                }
                E6.c();
                if (this.f16777a.z().B(null, AbstractC2217k1.f16558G0) && x12.x1()) {
                    v(sb, 1, "target_os_version", Long.valueOf(x12.O1()));
                }
                List<C1998g2> S7 = x12.S();
                if (S7 != null) {
                    for (C1998g2 c1998g2 : S7) {
                        if (c1998g2 != null) {
                            s(sb, 2);
                            sb.append("user_property {\n");
                            if (c1998g2.U()) {
                                l8 = Long.valueOf(c1998g2.D());
                            } else {
                                l8 = null;
                            }
                            v(sb, 2, "set_timestamp_millis", l8);
                            v(sb, 2, "name", this.f16777a.D().f(c1998g2.G()));
                            v(sb, 2, "string_value", c1998g2.H());
                            if (c1998g2.T()) {
                                l9 = Long.valueOf(c1998g2.C());
                            } else {
                                l9 = null;
                            }
                            v(sb, 2, "int_value", l9);
                            if (c1998g2.S()) {
                                d8 = Double.valueOf(c1998g2.B());
                            } else {
                                d8 = null;
                            }
                            v(sb, 2, "double_value", d8);
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.I1> Q8 = x12.Q();
                if (Q8 != null) {
                    for (com.google.android.gms.internal.measurement.I1 i12 : Q8) {
                        if (i12 != null) {
                            s(sb, 2);
                            sb.append("audience_membership {\n");
                            if (i12.N()) {
                                v(sb, 2, "audience_id", Integer.valueOf(i12.B()));
                            }
                            if (i12.O()) {
                                v(sb, 2, "new_audience", Boolean.valueOf(i12.M()));
                            }
                            u(sb, 2, "current_data", i12.E());
                            if (i12.P()) {
                                u(sb, 2, "previous_data", i12.F());
                            }
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.M1> R8 = x12.R();
                if (R8 != null) {
                    for (com.google.android.gms.internal.measurement.M1 m12 : R8) {
                        if (m12 != null) {
                            s(sb, 2);
                            sb.append("event {\n");
                            v(sb, 2, "name", this.f16777a.D().d(m12.J()));
                            if (m12.W()) {
                                v(sb, 2, "timestamp_millis", Long.valueOf(m12.E()));
                            }
                            if (m12.V()) {
                                v(sb, 2, "previous_timestamp_millis", Long.valueOf(m12.D()));
                            }
                            if (m12.U()) {
                                v(sb, 2, "count", Integer.valueOf(m12.B()));
                            }
                            if (m12.C() != 0) {
                                q(sb, 2, m12.K());
                            }
                            s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                s(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String G(C1961c1 c1961c1) {
        if (c1961c1 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c1961c1.R()) {
            v(sb, 0, "filter_id", Integer.valueOf(c1961c1.C()));
        }
        v(sb, 0, "event_name", this.f16777a.D().d(c1961c1.H()));
        String t8 = t(c1961c1.N(), c1961c1.O(), c1961c1.P());
        if (!t8.isEmpty()) {
            v(sb, 0, "filter_type", t8);
        }
        if (c1961c1.Q()) {
            w(sb, 1, "event_count_filter", c1961c1.G());
        }
        if (c1961c1.B() > 0) {
            sb.append("  filters {\n");
            Iterator it = c1961c1.J().iterator();
            while (it.hasNext()) {
                r(sb, 2, (C1979e1) it.next());
            }
        }
        s(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String H(C2038l1 c2038l1) {
        if (c2038l1 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c2038l1.M()) {
            v(sb, 0, "filter_id", Integer.valueOf(c2038l1.B()));
        }
        v(sb, 0, "property_name", this.f16777a.D().f(c2038l1.F()));
        String t8 = t(c2038l1.H(), c2038l1.J(), c2038l1.K());
        if (!t8.isEmpty()) {
            v(sb, 0, "filter_type", t8);
        }
        r(sb, 1, c2038l1.C());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List I(List list, List list2) {
        int i8;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f16777a.d().w().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f16777a.d().w().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
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
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
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
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(K((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map K(android.os.Bundle r11, boolean r12) {
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
            java.util.Map r8 = r10.K(r8, r6)
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
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.K(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.K(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t4.K(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(com.google.android.gms.internal.measurement.P1 p12, Object obj) {
        AbstractC1319p.l(obj);
        p12.v();
        p12.s();
        p12.r();
        p12.t();
        if (obj instanceof String) {
            p12.z((String) obj);
            return;
        }
        if (obj instanceof Long) {
            p12.x(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            p12.w(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.P1 F8 = com.google.android.gms.internal.measurement.Q1.F();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.P1 F9 = com.google.android.gms.internal.measurement.Q1.F();
                        F9.y(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            F9.x(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            F9.z((String) obj2);
                        } else if (obj2 instanceof Double) {
                            F9.w(((Double) obj2).doubleValue());
                        }
                        F8.q(F9);
                    }
                    if (F8.o() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.Q1) F8.k());
                    }
                }
            }
            p12.p(arrayList);
            return;
        }
        this.f16777a.d().r().b("Ignoring invalid (type) event param value", obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M(C1989f2 c1989f2, Object obj) {
        AbstractC1319p.l(obj);
        c1989f2.q();
        c1989f2.p();
        c1989f2.o();
        if (obj instanceof String) {
            c1989f2.w((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1989f2.s(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c1989f2.r(((Double) obj).doubleValue());
        } else {
            this.f16777a.d().r().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean O(long j8, long j9) {
        if (j8 != 0 && j9 > 0 && Math.abs(this.f16777a.a().currentTimeMillis() - j8) <= j9) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] Q(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            this.f16777a.d().r().b("Failed to gzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2190f4
    protected final boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long y(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return z(str.getBytes(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long z(byte[] bArr) {
        AbstractC1319p.l(bArr);
        this.f16777a.N().h();
        MessageDigest t8 = y4.t();
        if (t8 == null) {
            this.f16777a.d().r().a("Failed to get MD5");
            return 0L;
        }
        return y4.s0(t8.digest(bArr));
    }
}
