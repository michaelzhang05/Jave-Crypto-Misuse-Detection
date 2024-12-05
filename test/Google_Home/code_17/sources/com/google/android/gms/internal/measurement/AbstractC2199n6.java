package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2199n6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(AbstractC2241s4 abstractC2241s4) {
        C2190m6 c2190m6 = new C2190m6(abstractC2241s4);
        StringBuilder sb = new StringBuilder(c2190m6.w());
        for (int i8 = 0; i8 < c2190m6.w(); i8++) {
            byte a8 = c2190m6.a(i8);
            if (a8 != 34) {
                if (a8 != 39) {
                    if (a8 != 92) {
                        switch (a8) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (a8 >= 32 && a8 <= 126) {
                                    sb.append((char) a8);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a8 >>> 6) & 3) + 48));
                                    sb.append((char) (((a8 >>> 3) & 7) + 48));
                                    sb.append((char) ((a8 & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
