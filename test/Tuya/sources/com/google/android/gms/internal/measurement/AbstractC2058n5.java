package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2058n5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(X3 x32) {
        StringBuilder sb = new StringBuilder(x32.g());
        for (int i8 = 0; i8 < x32.g(); i8++) {
            byte a8 = x32.a(i8);
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
                                break;
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
