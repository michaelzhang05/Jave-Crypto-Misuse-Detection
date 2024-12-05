package com.google.android.gms.internal.measurement;

import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1947a5 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f15640a;

    static {
        char[] cArr = new char[80];
        f15640a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Y4 y42, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(y42, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i8, sb);
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
            sb.append(AbstractC2058n5.a(new T3(((String) obj).getBytes(B4.f15270b))));
            sb.append('\"');
            return;
        }
        if (obj instanceof X3) {
            sb.append(": \"");
            sb.append(AbstractC2058n5.a((X3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2112u4) {
            sb.append(" {");
            d((AbstractC2112u4) obj, sb, i8 + 2);
            sb.append("\n");
            c(i8, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i10 = i8 + 2;
            b(sb, i10, LeanbackPreferenceDialogFragment.ARG_KEY, entry.getKey());
            b(sb, i10, "value", entry.getValue());
            sb.append("\n");
            c(i8, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static void c(int i8, StringBuilder sb) {
        while (i8 > 0) {
            int i9 = 80;
            if (i8 <= 80) {
                i9 = i8;
            }
            sb.append(f15640a, 0, i9);
            i8 -= i9;
        }
    }

    private static void d(Y4 y42, StringBuilder sb, int i8) {
        int i9;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = y42.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i9 = 3;
            if (i10 >= length) {
                break;
            }
            Method method3 = declaredMethods[i10];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i9);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i8, substring.substring(0, substring.length() - 4), AbstractC2112u4.r(method2, y42, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i8, substring.substring(0, substring.length() - 3), AbstractC2112u4.r(method, y42, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object r8 = AbstractC2112u4.r(method4, y42, new Object[0]);
                    if (method5 == null) {
                        if (r8 instanceof Boolean) {
                            if (!((Boolean) r8).booleanValue()) {
                            }
                            b(sb, i8, substring, r8);
                        } else if (r8 instanceof Integer) {
                            if (((Integer) r8).intValue() == 0) {
                            }
                            b(sb, i8, substring, r8);
                        } else if (r8 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) r8).floatValue()) == 0) {
                            }
                            b(sb, i8, substring, r8);
                        } else if (r8 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) r8).doubleValue()) == 0) {
                            }
                            b(sb, i8, substring, r8);
                        } else {
                            if (r8 instanceof String) {
                                equals = r8.equals("");
                            } else if (r8 instanceof X3) {
                                equals = r8.equals(X3.f15622b);
                            } else if (r8 instanceof Y4) {
                                if (r8 == ((Y4) r8).b()) {
                                }
                                b(sb, i8, substring, r8);
                            } else {
                                if ((r8 instanceof Enum) && ((Enum) r8).ordinal() == 0) {
                                }
                                b(sb, i8, substring, r8);
                            }
                            if (equals) {
                            }
                            b(sb, i8, substring, r8);
                        }
                    } else {
                        if (!((Boolean) AbstractC2112u4.r(method5, y42, new Object[0])).booleanValue()) {
                        }
                        b(sb, i8, substring, r8);
                    }
                }
            }
            i9 = 3;
        }
        C2082q5 c2082q5 = ((AbstractC2112u4) y42).zzc;
        if (c2082q5 != null) {
            c2082q5.i(sb, i8);
        }
    }
}
