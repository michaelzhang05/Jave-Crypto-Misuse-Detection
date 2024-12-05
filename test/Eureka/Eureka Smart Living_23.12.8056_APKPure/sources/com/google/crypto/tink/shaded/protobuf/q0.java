package com.google.crypto.tink.shaded.protobuf;

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
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f5620a;

    static {
        char[] cArr = new char[80];
        f5620a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i6, StringBuilder sb) {
        while (i6 > 0) {
            char[] cArr = f5620a;
            int length = i6 > cArr.length ? cArr.length : i6;
            sb.append(cArr, 0, length);
            i6 -= length;
        }
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof h)) {
                return obj instanceof o0 ? obj == ((o0) obj).e() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = h.f5485b;
        }
        return obj.equals(obj2);
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i6 = 1; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(StringBuilder sb, int i6, String str, Object obj) {
        String a6;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i6, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i6, sb);
        sb.append(c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            a6 = h1.c((String) obj);
        } else {
            if (!(obj instanceof h)) {
                if (obj instanceof x) {
                    sb.append(" {");
                    e((x) obj, sb, i6 + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                } else {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i7 = i6 + 2;
                    d(sb, i7, "key", entry.getKey());
                    d(sb, i7, "value", entry.getValue());
                }
                sb.append("\n");
                a(i6, sb);
                sb.append("}");
                return;
            }
            sb.append(": \"");
            a6 = h1.a((h) obj);
        }
        sb.append(a6);
        sb.append('\"');
    }

    private static void e(o0 o0Var, StringBuilder sb, int i6) {
        int i7;
        Method method;
        String substring;
        Object A;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = o0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i8 = 0;
        while (true) {
            i7 = 3;
            if (i8 >= length) {
                break;
            }
            Method method3 = declaredMethods[i8];
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
            i8++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i7);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                A = x.A(method2, o0Var, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set" + substring2)) {
                    if (substring2.endsWith("Bytes")) {
                        if (treeMap.containsKey("get" + substring2.substring(0, substring2.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring2);
                    if (method4 != null) {
                        Object A2 = x.A(method4, o0Var, new Object[0]);
                        if (method5 == null ? !b(A2) : ((Boolean) x.A(method5, o0Var, new Object[0])).booleanValue()) {
                            d(sb, i6, substring2, A2);
                        }
                    }
                }
                i7 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                A = x.A(method, o0Var, new Object[0]);
            }
            d(sb, i6, substring, A);
            i7 = 3;
        }
        k1 k1Var = ((x) o0Var).unknownFields;
        if (k1Var != null) {
            k1Var.m(sb, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(o0 o0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(o0Var, sb, 0);
        return sb.toString();
    }
}
