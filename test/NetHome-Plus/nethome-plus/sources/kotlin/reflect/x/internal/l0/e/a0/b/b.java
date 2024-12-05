package kotlin.reflect.x.internal.l0.e.a0.b;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.internal.c;
import kotlin.jvm.internal.l;
import kotlin.text.u;
import okhttp3.HttpUrl;

/* compiled from: ClassMapperLite.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final b a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f20390b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f20391c;

    static {
        List l;
        String b0;
        List l2;
        List<String> l3;
        List<String> l4;
        List<String> l5;
        l = t.l('k', 'o', 't', 'l', 'i', 'n');
        b0 = b0.b0(l, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);
        f20390b = b0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l2 = t.l("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int b2 = c.b(0, l2.size() - 1, 2);
        if (b2 >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f20390b;
                sb.append(str);
                sb.append('/');
                sb.append((String) l2.get(i2));
                int i3 = i2 + 1;
                linkedHashMap.put(sb.toString(), l2.get(i3));
                linkedHashMap.put(str + '/' + ((String) l2.get(i2)) + "Array", '[' + ((String) l2.get(i3)));
                if (i2 == b2) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        linkedHashMap.put(f20390b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        l3 = t.l("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum");
        for (String str2 : l3) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        l4 = t.l("Iterator", "Collection", "List", "Set", "Map", "ListIterator");
        for (String str3 : l4) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i4 = 0; i4 < 23; i4++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f20390b;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i4);
            a(linkedHashMap, "Function" + i4, sb2.toString());
            a(linkedHashMap, "reflect/KFunction" + i4, str4 + "/reflect/KFunction");
        }
        l5 = t.l("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum");
        for (String str5 : l5) {
            a(linkedHashMap, str5 + ".Companion", f20390b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f20391c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f20390b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String str) {
        String v;
        l.f(str, "classId");
        String str2 = f20391c.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        v = u.v(str, '.', '$', false, 4, null);
        sb.append(v);
        sb.append(';');
        return sb.toString();
    }
}
