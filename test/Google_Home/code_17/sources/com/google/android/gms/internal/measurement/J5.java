package com.google.android.gms.internal.measurement;

import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class J5 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f16159a;

    static {
        char[] cArr = new char[80];
        f16159a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(I5 i52, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(i52, sb, 0);
        return sb.toString();
    }

    private static void b(int i8, StringBuilder sb) {
        int i9;
        while (i8 > 0) {
            char[] cArr = f16159a;
            if (i8 > cArr.length) {
                i9 = cArr.length;
            } else {
                i9 = i8;
            }
            sb.append(cArr, 0, i9);
            i8 -= i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0192, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a5, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b7, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(com.google.android.gms.internal.measurement.I5 r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.J5.c(com.google.android.gms.internal.measurement.I5, java.lang.StringBuilder, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i8, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i9 = 1; i9 < str.length(); i9++) {
                char charAt = str.charAt(i9);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC2199n6.a(AbstractC2241s4.k((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2241s4) {
            sb.append(": \"");
            sb.append(AbstractC2199n6.a((AbstractC2241s4) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2091c5) {
            sb.append(" {");
            c((AbstractC2091c5) obj, sb, i8 + 2);
            sb.append("\n");
            b(i8, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i10 = i8 + 2;
            d(sb, i10, LeanbackPreferenceDialogFragment.ARG_KEY, entry.getKey());
            d(sb, i10, "value", entry.getValue());
            sb.append("\n");
            b(i8, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }
}
