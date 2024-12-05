package kotlin.reflect.x.internal.l0.d.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: SignatureBuildingComponents.kt */
/* loaded from: classes2.dex */
public final class x {
    public static final x a = new x();

    /* compiled from: SignatureBuildingComponents.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f20329f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            l.f(str, "it");
            return x.a.c(str);
        }
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final String[] b(String... strArr) {
        l.f(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final Set<String> d(String str, String... strArr) {
        l.f(str, "internalName");
        l.f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set<String> e(String str, String... strArr) {
        l.f(str, "name");
        l.f(strArr, "signatures");
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set<String> f(String str, String... strArr) {
        l.f(str, "name");
        l.f(strArr, "signatures");
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String g(String str) {
        l.f(str, "name");
        return "java/util/function/" + str;
    }

    public final String h(String str) {
        l.f(str, "name");
        return "java/lang/" + str;
    }

    public final String i(String str) {
        l.f(str, "name");
        return "java/util/" + str;
    }

    public final String j(String str, List<String> list, String str2) {
        String b0;
        l.f(str, "name");
        l.f(list, "parameters");
        l.f(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        b0 = b0.b0(list, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, a.f20329f, 30, null);
        sb.append(b0);
        sb.append(')');
        sb.append(c(str2));
        return sb.toString();
    }

    public final String k(String str, String str2) {
        l.f(str, "internalName");
        l.f(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
